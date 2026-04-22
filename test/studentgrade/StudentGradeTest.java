package studentgrade;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/* JUnit 3.8.1 */
public class StudentGradeTest {
    
 public class test{

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }}

 
    /**
     * Test of main method, of class StudentGrade.
     */
   

    /**
     * Test of getGrade method, of class StudentGrade.
     */
    @Test
    public void testGetGrade() {
        System.out.println("getGrade");
        int mark = 0;
        String expResult = "F";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
}
