package za.ca.cput.kaylinmorkelassignment2interfaces;

public class AgeDeterminatorImplementation2 implements AgeDeterminatorInterface
{
    @Override
    public int determineAge(int yearBorn, int currentYear) {
        int valResult = yearBorn - currentYear;

        return valResult * (-1);
    }
}
