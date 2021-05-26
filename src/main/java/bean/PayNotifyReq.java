package bean;




import java.math.BigDecimal;
import java.util.List;

public class PayNotifyReq {

    /**
     * 订单状态  1 支付成功 2 支付失败
     */
    public Integer resultCode;


    /**
     * 商户订单号
     */
    public String outTradeNo;


     public BigDecimal wxSettlementTotalFee;


     public BigDecimal wxCashFee;

     public BigDecimal wxCouponFee;

     public BigDecimal wxCouponFeeCash;


     public BigDecimal wxCouponFeeNoCash;


    /**
     * 订单金额
     */
    public BigDecimal payAmount;


    public String bankType;


    public String deviceInfo;


    public String createTime;

    public Integer times;

    public String sign;


}
