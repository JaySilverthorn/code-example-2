/*
 * This class was created as a coding example by Jay Silverthorn.
 */

package permutations;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jaysilverthorn
 */
public class PermutationsTest {

    public PermutationsTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of echoPermutations method, of class Permutations.
     */
    @Test
    public void testEchoPermutations() {
        System.out.println("echoPermutations");
        String inputString = "abc";
        Permutations instance = new Permutations();
        instance.echoPermutations(inputString);
    }
    
    /**
     * Test of echoPermutations method, of class Permutations.
     */
    @Test
    public void testEchoPermutationsEmptyString() {
        System.out.println("echoPermutations");
        String inputString = "";
        Permutations instance = new Permutations();
        instance.echoPermutations(inputString);
    }

    /**
     * Test of echoPermutations method, of class Permutations.
     */
    @Test
    public void testEchoPermutationsNullString() {
        System.out.println("echoPermutations");
        String inputString = null;
        Permutations instance = new Permutations();
        instance.echoPermutations(inputString);
    }

}