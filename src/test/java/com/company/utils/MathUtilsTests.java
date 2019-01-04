package com.company.utils;

import com.company.infrastructure.utils.MathUtils;
import org.junit.Assert;
import org.junit.Test;

public class MathUtilsTests {

    @Test
    public void testRandomFromRange() {
        int random = MathUtils.randomFromRange(0,10);
        Assert.assertTrue(random <10);
        Assert.assertTrue(random >0);
    }
    @Test
    public void testRandomFromNegativeRange(){
        int random = MathUtils.randomFromRange(-10,0);
        Assert.assertTrue(random <0);
        Assert.assertTrue(random >-10);
    }
    @Test
    public void testRandomFromMinRange(){
        int random = MathUtils.randomFromRange(1,1);
        Assert.assertEquals(1,random);
    }
}
