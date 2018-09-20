package com.lwaiting.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 订单详情
 * Created by Yang.
 * 2018/7/11 0011 23:21
 */
@Entity
@Data
public class OrderDetail {

    @Id
    private String detailId;

    /** 订单id */
    private String orderId;

    /** 商品编号id */
    private String productId;

    /** 商品名称 */
    private String productName;

    /** 商品价格(单价) */
    private BigDecimal productPrice;

    /** 商品数量 */
    private Integer productQuantity;

    /** 商品小图 */
    private String productIcon;

}
