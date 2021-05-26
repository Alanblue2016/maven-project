package bean;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class SybUtil {


    private static Logger logger = LoggerFactory.getLogger(SybUtil.class);

    public static String md5(byte[] b) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.reset();
            md.update(b);
            byte[] hash = md.digest();
            StringBuffer outStrBuf = new StringBuffer(32);
            for (int i = 0; i < hash.length; i++) {
                int v = hash[i] & 0xFF;
                if (v < 16) {
                    outStrBuf.append('0');
                }
                outStrBuf.append(Integer.toString(v, 16).toLowerCase());
            }
            return outStrBuf.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return new String(b);
        }
    }


    /**
     * 生成随机码
     *
     * @param n
     * @return
     */
    public static String getValidatecode(int n) {
        Random random = new Random();
        String sRand = "";
        n = n == 0 ? 4 : n;
        // default 4
        for (int i = 0; i < n; i++) {
            String rand = String.valueOf(random.nextInt(10));
            sRand += rand;
        }
        return sRand;
    }


    public static boolean validSign(TreeMap<String, String> param,
                                    String appkey, String signType) throws Exception {
        if (param != null && !param.isEmpty()) {
            if (!param.containsKey("sign")) {
                return false;
            }
            String sign = param.remove("sign");
            if ("MD5".equals(signType)) {
                // 如果是md5则需要把md5的key加入到排序
                param.put("key", appkey);
            }
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : param.entrySet()) {
                if (entry.getValue() != null && entry.getValue().length() > 0) {
                    sb.append(entry.getKey()).append("=")
                            .append(entry.getValue()).append("&");
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            if ("MD5".equals(signType)) {
                return sign.toLowerCase().equals(
                        md5(sb.toString().getBytes("UTF-8")).toLowerCase());
            }
        }
        return false;
    }

    public static boolean validSignForMall(TreeMap<String, Object> param,
                                           String appkey, String signType) throws Exception {
        if (param != null && !param.isEmpty()) {
            if (!param.containsKey("sign")) {
                return false;
            }
            String sign = param.remove("sign").toString();
            if ("MD5".equals(signType)) {
                // 如果是md5则需要把md5的key加入到排序
                param.put("key", appkey);
            }
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, Object> entry : param.entrySet()) {
                if (entry.getValue() != null && entry.getValue().toString().length() > 0) {
                    sb.append(entry.getKey()).append("=")
                            .append(entry.getValue()).append("&");
                }
            }
            if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            if ("MD5".equals(signType)) {
                return sign.toLowerCase().equals(
                        md5(sb.toString().getBytes("UTF-8")).toLowerCase());
            }
        }
        return false;
    }


    public static String unionSignForMall(TreeMap<String, Object> params, String appkey,
                                          String signType) throws Exception {
        params.remove("sign");
        if ("MD5".equals(signType)) {
            // 如果是md5则需要把md5的key加入到排序
            params.put("key", appkey);
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            if (entry.getValue() != null && entry.getValue().toString().length() > 0) {
                sb.append(entry.getKey()).append("=").append(entry.getValue())
                        .append("&");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        String sign = "";
        if ("MD5".equals(signType)) {
            logger.info("请求参数,{}" + sb.toString());
            sign = md5(sb.toString().getBytes("UTF-8"));
            // 记得是md5编码的加签
            params.remove("key");
        }
        return sign;
    }


}
