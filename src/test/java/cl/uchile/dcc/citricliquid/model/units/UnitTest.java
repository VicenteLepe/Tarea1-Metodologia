package cl.uchile.dcc.citricliquid.model.units;

import cl.uchile.dcc.citricliquid.model.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UnitTest {
    private Unit testUnit;

    @BeforeEach
    public void setUp(){
        testUnit = new Unit("chicken", 3, -1, -1, 1);
    }

    private Unit getTestUnit() {
        return new Unit("chicken", 3, -1, -1, 1);
    }

    @Test
    public void constructorTest() {
        Assertions.assertEquals(testUnit,testUnit);
        Assertions.assertNotEquals(testUnit,new Object());
        Assertions.assertFalse(testUnit.equals(null));
        Assertions.assertNotSame(testUnit,getTestUnit());
        Assertions.assertEquals(testUnit,getTestUnit());
    }

    @Test
    public void hitPointsTest() {
        Assertions.assertEquals(testUnit.getMaxHp(), testUnit.getCurrentHp());
        testUnit.setCurrentHp(2);
        Assertions.assertEquals(2, testUnit.getCurrentHp());
        testUnit.setCurrentHp(-1);
        Assertions.assertEquals(0, testUnit.getCurrentHp());
        testUnit.setCurrentHp(5);
        Assertions.assertEquals(3, testUnit.getCurrentHp());
    }

    @Test
    public void starsTest() {
        Assertions.assertEquals(0, testUnit.getStars());
        testUnit.increaseStarsBy(5);
        Assertions.assertEquals(5, testUnit.getStars());
        testUnit.increaseStarsBy(3);
        Assertions.assertEquals(8, testUnit.getStars());
        testUnit.reduceStarsBy(4);
        Assertions.assertEquals(4, testUnit.getStars());
    }
}

