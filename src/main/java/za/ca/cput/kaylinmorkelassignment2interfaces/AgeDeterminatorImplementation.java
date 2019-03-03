package za.ca.cput.kaylinmorkelassignment2interfaces;

public class AgeDeterminatorImplementation implements AgeDeterminatorInterface
{
    @Override
    public int determineAge(int yearBorn, int currentYear)
    {
        return currentYear - yearBorn;
    }
}
