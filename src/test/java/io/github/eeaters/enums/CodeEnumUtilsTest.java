package io.github.eeaters.enums;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Description:
 * @author: eeaters
 * @since: 1.0
 */
public class CodeEnumUtilsTest {

    @Test
    public void testGetByCode() {
        StatusEnum statusEnum = CodeEnumUtils.getByCode(StatusEnum.class, 0);
        Assert.assertEquals(statusEnum, StatusEnum.CLOSE);
    }

}
