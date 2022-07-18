import java.math.BigDecimal;
import java.time.LocalDate;

public class EmployeeWithInsurance extends Employee {

    private InsuranceType insuranceType;

    public EmployeeWithInsurance(String firstName, char middleInitial, String lastName, String idNumber, String socialSecurityNumber, LocalDate dateOfBirth, InsuranceType insuranceType) {
        super(firstName, middleInitial, lastName, idNumber, socialSecurityNumber, dateOfBirth);
        this.insuranceType = insuranceType;
    }

    public EmployeeWithInsurance(String firstName, char middleInitial, String lastName, String idNumber, String socialSecurityNumber, LocalDate dateOfBirth, BigDecimal salary, InsuranceType insuranceType) {
        super(firstName, middleInitial, lastName, idNumber, socialSecurityNumber, dateOfBirth, salary);
        this.insuranceType = insuranceType;
    }

    @Override
    public String toString() {
        String buildString = "";
        buildString += "First Name : " + super.getFirstName() + "  \n";
        buildString += "Middle Initial : " + super.getMiddleInitial() + " \n";
        buildString += "Last Name : " + super.getLastName() + "\n";
        buildString += "ID Number : " + super.getIdNumber() + "\n";
        buildString += "Social Security Number : " + super.getSocialSecurityNumber() + "\n";
        buildString += "Date of Birth : " + super.getDateOfBirth() + "\n";
        buildString += "Insurance type: " + this.insuranceType + "\n";

        // if statement whether or not to add the salary
        if (super.getSalary().compareTo(BigDecimal.ZERO) > 0) {
            buildString += "Salary : " + super.getSalary();
        }
        return buildString;
    }
}
