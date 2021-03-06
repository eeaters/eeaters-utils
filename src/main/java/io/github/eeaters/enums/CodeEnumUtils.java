package io.github.eeaters.enums;

/**
 * enum utility
 * @author: eeaters
 * @since: 1.0
 */
public interface CodeEnumUtils {

    static <T extends CodeEnum> T getByCode(Class<T> codeEnum, Integer code) {
        if (code == null) {
            return null;
        }
        for (T enumEnumConstant : codeEnum.getEnumConstants()) {
            if (code.equals(enumEnumConstant.getCode())) {
                return enumEnumConstant;
            }
        }
        return null;
    }
}
