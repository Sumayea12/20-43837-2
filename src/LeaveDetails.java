import java.text.SimpleDateFormat;
import java.util.*;
interface Leave {
    String getEmployeeType();
    int getVacationDays();
    int getSickDays();
}

// LeaveDetails Class implementing Leave
class LeaveDetails implements Leave {
    private String employeeType;
    private int vacationDays;
    private int sickDays;

    public LeaveDetails(String employeeType, int vacationDays, int sickDays) {
        this.employeeType = employeeType;
        this.vacationDays = vacationDays;
        this.sickDays = sickDays;
    }

    public String getEmployeeType() { return employeeType; }
    public int getVacationDays() { return vacationDays; }
    public int getSickDays() { return sickDays; }

    public String toString() {
        return "Employee Type: " + employeeType + ", Vacation Days: " + vacationDays + ", Sick Days: " + sickDays;
    }
}

// Annotation for Employee Type
//@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.TYPE)
//@interface EmployeeType {
    //String value();
//}