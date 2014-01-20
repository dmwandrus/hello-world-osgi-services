package diane.sand.box.hello.impl;

import diane.sand.box.hello.impl.EnglishHelloService;
import org.junit.*;
import static org.junit.Assert.*;
import diane.sand.box.hello.HelloService;
import diane.sand.box.hello.exceptions.HelloException;
import java.util.logging.Logger;

/**
 *
 */
public class EnglishHelloServiceTest
{
    private static final Logger logger = Logger.getLogger(EnglishHelloServiceTest.class.getName());
    
    public EnglishHelloServiceTest()
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception
    {
    }

    @AfterClass
    public static void tearDownClass() throws Exception
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of testMethod method, of class DefaultCentralRepoMgmtService.
     */
    @Test
    public void testTestMethod() throws Exception
    {
        System.out.println("testMethod");
        String test = "myTestString";
        HelloService instance = new EnglishHelloService();
        String expResult = test;
        String result = instance.testMethod(test);
        assertEquals(expResult, result);
        
    }
}

