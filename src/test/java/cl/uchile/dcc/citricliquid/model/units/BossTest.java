package cl.uchile.dcc.citricliquid.model.units;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BossTest{
    private Boss testBoss;

    @BeforeEach
    public void setUp(){
        testBoss = new Boss("Flying Castle", 10, 2, 1, -3);
    }

    private Unit getTestUnit() {
        return new Boss("Flying Castle", 10, 2, 1, -3);
    }

    @Test
    public void constructorTest() {
        Assertions.assertEquals(testBoss,testBoss);
        Assertions.assertNotEquals(testBoss,new Object());
        Assertions.assertFalse(testBoss.equals(null));
        Assertions.assertNotSame(testBoss,getTestUnit());
        Assertions.assertEquals(testBoss,getTestUnit());
    }

    @Test
    public void hitPointsTest() {
        Assertions.assertEquals(testBoss.getMaxHp(), testBoss.getCurrentHp());
        testBoss.setCurrentHp(2);
        Assertions.assertEquals(2, testBoss.getCurrentHp());
        testBoss.setCurrentHp(-1);
        Assertions.assertEquals(0, testBoss.getCurrentHp());
        testBoss.setCurrentHp(15);
        Assertions.assertEquals(10, testBoss.getCurrentHp());
    }

    @Test
    public void starsTest() {
        Assertions.assertEquals(0, testBoss.getStars());
        testBoss.increaseStarsBy(5);
        Assertions.assertEquals(5, testBoss.getStars());
        testBoss.increaseStarsBy(3);
        Assertions.assertEquals(8, testBoss.getStars());
        testBoss.reduceStarsBy(4);
        Assertions.assertEquals(4, testBoss.getStars());
    }
}
