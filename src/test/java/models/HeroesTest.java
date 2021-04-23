package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HeroesTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void instantiatesHeroObjectsCorrectly_True() {
        Heroes hero = new Heroes("Emma", 20, "last-minute", "procrastination");
        assertEquals(true, hero instanceof Heroes);
    }

    @Test
    public void returnsHeroNameCorrectly_True() {
        Heroes hero = new Heroes("Emma", 20, "last-minute", "procrastination");
        assertEquals("Emma", hero.getName());
    }

    @Test
    public void returnsHeroAgeCorrectly_True() {
        Heroes hero = new Heroes("Emma", 20, "last-minute", "procrastination");
        assertEquals(20, hero.getAge());
    }

    @Test
    public void returnsHeroPowerCorrectly_True() {
        Heroes hero = new Heroes("Emma", 20, "last-minute", "procrastination");
        assertEquals("last-minute", hero.getPower());
    }

    @Test
    public void returnsHeroWeaknessCorrectly_True() {
        Heroes hero = new Heroes("Emma", 20, "last-minute", "procrastination");
        assertEquals("procrastination", hero.getWeakness());
    }
}