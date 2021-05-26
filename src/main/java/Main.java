import bean.PayGoodsDetail;
import org.springside.modules.utils.mapper.JsonMapper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


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

//
//        Map map= Maps.newHashMap();
//        map.put("1","1");
//        map.put("2","2");
//        map.put("3","3");
//        String s = JsonMapper.defaultMapper().toJson(map);
//        System.out.println(s);


//        String couponCode =   LocalDate.now().format(TimeTool.stringFormatter);
//        System.out.println(couponCode);

//
//        String available_begin_time = "2021-01-26T09:52:27+08:00";
//        String millisecond = DateUtil.rfcToDateString(available_begin_time);
//        System.out.println(millisecond);
//
//
//        String code = "930400000000000000";
//
//        if (code.equals("930400000000000000")){
//            System.out.println(code);
//        }


//        List<Long> list = new ArrayList<>();
//
//        list.add((long) 10);
//        list.add((long) 11);
//
//        String str = list.toString();
//
//
//        List<Long> json = JsonMapper.defaultMapper().fromJson(str, List.class);
//
//        if (json.contains(11)){
//            System.out.println("tyo");
//        }


//        String str = "[10,677777777777777,90]";
//         List<Integer> fromJson = JsonMapper.defaultMapper().fromJson(str, List.class);
//        String substring = str.substring(1, str.length());
//        String substring1 = substring.substring(0, substring.length() - 1);
//
//        Long num = Long.valueOf(10);
//        for (int i = 0; i < fromJson.size(); i++) {
//            Integer aLong = Math.toIntExact(Long.valueOf(fromJson.get(i).toString()));
//            System.out.println("aLong");
//        }
//
//        if (fromJson.contains(num)) {
//            System.out.println("tyo");
//        }

//        List<Long> lastPayedStoreIds = new ArrayList<>();
//        lastPayedStoreIds.add(223123L);
//        lastPayedStoreIds.add(234234L);
//        lastPayedStoreIds.add(345345L);
//        String str = null;
//        for (int i = 0; i < lastPayedStoreIds.size(); i++) {
//
//            str.set("'" + c + "'");
//        }
//
//        String a = "34,45,89";
//        a = "，";
//        String[] split = a.split(",");
//
//        StringBuilder sb = new StringBuilder("");
//
//        sb.append("select s.last_payed_store_id  as store_id,s.open_id as open_id from (select max(a.ref_date) as ref_date ,a.open_id from wx_fans_pay_day_summary a where a.app_id= '" + "123123123" + "'");
//
//        sb.append(" and a.last_payed_store_id in " + "("
//                +a
//
//                + ")");
//
//        System.out.println(sb);


//        PayNotifyReq req = new PayNotifyReq();
//        req.sign="ewerwerwer";
//        req.payAmount = new BigDecimal("23.23");
//        req.times = 234234;
//        TreeMap<String, Object> params = JsonMapper.defaultMapper().fromJson(JsonMapper.defaultMapper().toJson(req), TreeMap.class);
//        // 获取签名以及添加签名
//        String signValue = SybUtil.unionSignForMall(params, "JmoADbnbAueQSe9Sgng1xRFwcJt14cUY", "MD5");
//        req.sign = signValue;
//
//        TreeMap<String, Object> respar = JsonMapper.defaultMapper().fromJson(JsonMapper.defaultMapper().toJson(req), TreeMap.class);
//        boolean b = SybUtil.validSignForMall(respar, "JmoADbnbAueQSe9Sgng1xRFwcJt14cUY", "MD5");
//        if (!b){
//            System.out.println("1111");
//        }else{
//            System.out.println("0000000");
//        }
//        int t  = 1;
//        Boolean b = true;
//        ListTool.add(t,b);
//        System.out.println(t);
//        System.out.println(b);

//
//        BigDecimal retailPrice = new BigDecimal("23.56");
//        BigDecimal multiply = retailPrice.multiply(new BigDecimal(100));
//        System.out.println(multiply.intValue());
//
//        List<PayGoodsDetail> details = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            PayGoodsDetail detail = new PayGoodsDetail();
//            String uuid = UUID.randomUUID().toString();
//            detail.setGoods_id(uuid);
//            detail.setGoods_name(uuid + "name");
//            detail.setGoods_num(i+1);
//            BigDecimal priceBig = new BigDecimal(i+1);
//            detail.setPrice(priceBig.intValue());
//            details.add(detail);
//        }
//
//        String json = JsonMapper.defaultMapper().toJson(details);
//        System.out.println(json);




    }
}
