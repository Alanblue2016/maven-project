import com.google.common.collect.Maps;
import org.springside.modules.utils.mapper.JsonMapper;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Map;


public class Main {


    public static void main(String[] args) throws Exception {

        //        Map<String, Object> map = Maps.newHashMap();
//        map.put("start", 0);
//        map.put("limit", 100);
//        //ObjectMapper objectMapper = new ObjectMapper();
//        String json = JsonMapper.defaultMapper().toJson(map);
//        System.out.println(json);

//        String no = "168195_370030007267_20190109164453_00000010";
//
//        System.out.println(no.length());
//
//        no = no.substring(0, 32);
//        System.out.println(no);
//        System.out.println(no.length());

//        Instant createTime = TimeTool.strToInstant("2020-09-03 14:20:35");
//
//        if (createTime.plus(20L, ChronoUnit.MINUTES).isAfter(Instant.now())) {
//            System.out.println("创建时间距离当前时间，在20分钟之内");
//        } else {
//
//        }

//
//        Set<String> strs = new HashSet<>();
//        for (int i = 0; i < 322100; i++) {
//            strs.add(String.valueOf(Math.random() + Math.random() + Math.random()));
//        }
//        System.out.println("一共" + strs.size());
//
//        List<Set<String>> splitList = ListTool.splitList(strs, 10000);
//        System.out.println("分成 " + splitList.size() + "批发送");
//        for (int i = 0; i < splitList.size(); i++) {
//            Set<String> spOpenIdSet = splitList.get(i);
//            System.out.println("群发！"+ i);
//
//        }

//        String str = "冬青商贸-冬青商贸1";
//        //  URLCodec.encodeUrl(str, "GBK");
//        String encode = com.sun.deploy.net.URLEncoder.encode(str, "GBK");
//        System.out.println("encode" + encode);
//
//        String decode = URLDecoder.decode("%E5%86%AC%E9%9D%92%E5%95%86%E8%B4%B8-%E5%86%AC%E9%9D%92%E5%95%86%E8%B4%B81");
//        System.out.println(decode);

        // %E5%86%AC%E9%9D%92%E5%95%86%E8%B4%B8-%E5%86%AC%E9%9D%92%E5%95%86%E8%B4%B81&
        // %EF%BF%BD%EF%BF%BD%EF%BF%BD%EF%BF%BD%EF%BF%BD%EF%BF%BD%C3%B3-%EF%BF%BD%EF%BF%BD%EF%BF%BD%EF%BF%BD%EF%BF%BD%EF%BF%BD%C3%B31


        Map map= Maps.newHashMap();
        map.put("1","1");
        map.put("2","2");
        map.put("3","3");
        String s = JsonMapper.defaultMapper().toJson(map);
        System.out.println(s);


    }
}
