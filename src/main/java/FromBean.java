public class FromBean {

    @Data
    public class FromBean {

        private String name;
        private int age;
        private String address;
        private String idNo;
        private BigDecimal money;
    }

    @Data
    public class ToBean extends FromBean {

    }
}
