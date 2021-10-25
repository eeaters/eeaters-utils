package com.caicai.enums;

/**
 * @Description:
 * @author: yujie.wan
 * @since: 1.0
 */
public enum StatusEnum implements CodeEnum {

    CLOSE(0, "关闭"),

    OPEN(1, "开启"),

    ;
    private Integer code;

    private String desc;

    StatusEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public Integer getCode() {
        return code;
    }
}
