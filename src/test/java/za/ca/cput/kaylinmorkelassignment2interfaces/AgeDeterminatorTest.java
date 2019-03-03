package za.ca.cput.kaylinmorkelassignment2interfaces;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import za.ca.cput.kaylinmorkelassignment2interfaces.configuration.AgeDeterminatorConfiguration;

import static org.junit.Assert.assertTrue;

public class AgeDeterminatorTest
{
    private AgeDeterminatorInterface ageDeterminatorInterface;

    @BeforeMethod
    public void setUp() throws Exception{
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AgeDeterminatorConfiguration.class);
        ageDeterminatorInterface = (AgeDeterminatorInterface)ctx.getBean("ageDet2");
    }

    @AfterMethod
    public void tearDown() throws Exception{

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

}
