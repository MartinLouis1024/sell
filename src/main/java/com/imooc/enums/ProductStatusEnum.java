package com.imooc.enums;

import lombok.Getter;

/**
 * 商品状态
 * Created by x-liu
 * 2018/11/4 15:25
 */
@Getter
public enum ProductStatusEnum {

    UP(0, "在架"),
    DOWN(1,"下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
