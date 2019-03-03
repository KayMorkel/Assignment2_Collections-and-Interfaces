package za.ca.cput.kaylinmorkelassignment2interfaces.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ca.cput.kaylinmorkelassignment2interfaces.AgeDeterminatorImplementation;
import za.ca.cput.kaylinmorkelassignment2interfaces.AgeDeterminatorImplementation2;
import za.ca.cput.kaylinmorkelassignment2interfaces.AgeDeterminatorInterface;

@Configuration
public class AgeDeterminatorConfiguration
{
    @Bean(name="ageDet")
    public AgeDeterminatorInterface getAgeDeterminator()
    {
        return new AgeDeterminatorImplementation();
    }
    @Bean(name="ageDet2")
    public AgeDeterminatorInterface getSecondAgeDeterminator()
    {
        return new AgeDeterminatorImplementation2();
    }
}
