package za.ca.cput.kaylinmorkelassignment2interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import za.ca.cput.kaylinmorkelassignment2interfaces.configuration.AgeDeterminatorConfiguration;

public class AgeDeterminatorTest
{
    private AgeDeterminatorInterface ageDeterminatorInterface;

    @Before
    public void setUp()throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AgeDeterminatorConfiguration.class);
        ageDeterminatorInterface = (AgeDeterminatorInterface)ctx.getBean("ageDet");
    }

    @After
    public void tearDown()throws Exception{

    }
    @Test
    public void determineAge() throws Exception
    {
        AgeDeterminatorInterface ageDet = new AgeDeterminatorImplementation();
        int ageResult = ageDet.determineAge(1996,2019);
        Assert.assertEquals(23, ageResult);
    }
    @Test
    public void testDetermineAge() throws Exception
    {
        int ageResult1 = ageDeterminatorInterface.determineAge(1996,2019);
        Assert.assertEquals(23, ageResult1);
    }
    @Test
    public void determineAge2() throws Exception
    {
        AgeDeterminatorInterface ageDet2 = new AgeDeterminatorImplementation2();
        int ageResult2 = ageDet2.determineAge(1996,2019);
        Assert.assertEquals(23, ageResult2);
    }

}
