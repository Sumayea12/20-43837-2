import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Officer("1", "John Doe", new Date(99, 0, 15), "john@example.com", new Date(123, 0, 1)));

        for (Employee employee : employees) {
            Leave leave = calculateLeave(employee);
            System.out.println("\nEmployee Details:");
            System.out.println(employee);
            System.out.println(leave);
        }
    }

    private static Leave calculateLeave(Employee employee) {
        int year = 2023; // Assuming the current year is 2023
        int totalDays = isLeapYear(year) ? 366 : 365;
        int daysWorked = (int) ((employee.getJoiningDate().getTime() - new Date(year - 1900, 0, 1).getTime()) / (24 * 60 * 60 * 1000)) + 1;

        int vacationDays = 0;
        int sickDays = 0;

        if (employee.getJoiningDate().before(new Date(year - 1900, 11, 31))) {
            Leave leave = getLeaveForEmployeeType(employee);
            vacationDays = calculateLeaveDays(leave.getVacationDays(), daysWorked, totalDays);
            sickDays = calculateLeaveDays(leave.getSickDays(), daysWorked, totalDays);
        }

        return new LeaveDetails(getEmployeeType(employee), vacationDays, sickDays);
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static Leave getLeaveForEmployeeType(Employee employee) {
        String employeeType = getEmployeeType(employee);
        if (employeeType.equals("Officer")) {
            return new LeaveDetails(employeeType, 15, 10);
        } else {
            return new LeaveDetails(employeeType, 10, 7);
        }
    }

    private static String getEmployeeType(Employee employee) {
        return (employee.getDateOfBirth().getYear() == 99) ? "Officer" : "Staff";
    }

    private static int calculateLeaveDays(int totalLeaveDays, int daysWorked, int totalDays) {
        double leaveDays = ((double) daysWorked / totalDays) * totalLeaveDays;
        return (leaveDays < 0.5) ? (int) Math.floor(leaveDays) : (int) Math.ceil(leaveDays);
    }
}
