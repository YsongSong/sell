package com.lwaiting.enums;

import lombok.Getter;

/**
 * 订单状态
 * Created by Yang.
 * 2018/7/11 0011 23:10
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "已取消")
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
