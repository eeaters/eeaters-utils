package io.github.eeaters.enums;

/**
 * 枚举继承了该类,并且有code属性,那么可以通过使用{@link CodeEnumUtils}来将一个code转为具体的枚举值
 * @author: eeaters
 * @since: 1.0
 */
public interface CodeEnum {

    Integer getCode();
}
