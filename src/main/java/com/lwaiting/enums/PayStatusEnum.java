package com.lwaiting.enums;

import lombok.Getter;

/**
 * Created by Yang.
 * 2018/7/11 0011 23:15
 */
@Getter
public enum PayStatusEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;
    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
