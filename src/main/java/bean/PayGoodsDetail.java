package bean;


import lombok.Data;

@Data
public class PayGoodsDetail {


//   * └ goods_id String 必填 32 商品的编号
//   * └ wxpay_goods_id String 可选 32 微信支付定义的统一商品编号
//   * └ goods_name String 必填 256 商品名称
//   * └ goods_num Int 必填 商品数量
//   * └ price Int 必填 商品单价，单位为分
//   * └ goods_category String 可选 32 商品类目Id
//   * └ body String 可选 1000 商品描述信息


    /**
     * 必填 32 商品的编号
     */
    private String goods_id;

    /**
     * 可选 微信支付定义的统一商品编号
     */
    private String wxpay_goods_id;

    /**
     * 必填 商品名称
     */
    private String goods_name;

    /**
     * 必填 商品数量
     */
    private Integer goods_num;

    /**
     * 必填 商品单价，单位为分
     */
    private Integer price;

    /**
     * 可选 商品类目Id
     */
    private String goods_category;

    /**
     * 可选-商品描述信息
     */
    private String body;


}
