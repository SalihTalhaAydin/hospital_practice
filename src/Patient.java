public class Patient {

    public static final String askProblem = "What is your problem?";
    public static final String askFirstName = "What is your first name?";
    public static final String askLastName = "What is your last name?";
    public static final String askDateOfBirth = "What is your date of birth? (mm/dd/yyyy)";
    public static final String askInsurance = "Do you have any insurance provider? (Y/N)";

    public Patient(String problem, String firstName, String lastName, String dateOfBirth, String hasInsurance) {
        this.problem = problem;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.hasInsurance = hasInsurance;
    }

    public String problem;
    public String firstName;
    public String lastName;
    public String dateOfBirth;
    public String hasInsurance;
    public Doctor assignedDoctor;


    public static Patient createPatience() {
        String problem = ScannerHelper.getString(askProblem);
        String firstName = ScannerHelper.getString(askFirstName);
        String lastName = ScannerHelper.getString(askLastName);
        String dateOfBirth = ScannerHelper.getString(askDateOfBirth);
        String hasInsurance = ScannerHelper.getString(askInsurance);

        //VALIDATION FOR ALL

        return new Patient(problem, firstName, lastName, dateOfBirth, hasInsurance);

    }

    @Override
    public String toString() {
        return "Patient{" +
                "problem='" + problem + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", hasInsurance='" + hasInsurance + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(createPatience());
    }
}
