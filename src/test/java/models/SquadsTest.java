package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SquadsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void instantiatesSquadObjectsWithHeroObjectsCorrectly_true() {
        ArrayList<Heroes> heroes = new ArrayList<>();
        Squads squad = new Squads("Champions", "fight corruption", 5, heroes);
        assertEquals(true, squad instanceof Squads);
    }
}