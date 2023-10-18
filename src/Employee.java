import java.text.SimpleDateFormat;
import java.util.*;

// Employee Interface
interface Employee {
    String getId();
    String getName();
    Date getJoiningDate();
    Date getDateOfBirth();
}

// Officer Class implementing Employee
class Officer implements Employee {
    private String id;
    private String name;
    private Date dateOfBirth;
    private String email;
    private Date joiningDate;

    public Officer(String id, String name, Date dateOfBirth, String email, Date joiningDate) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.joiningDate = joiningDate;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public Date getJoiningDate() { return joiningDate; }
    public Date getDateOfBirth() { return dateOfBirth; }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "ID: " + id + ", Name: " + name + ", Date of Birth: " + sdf.format(dateOfBirth) + ", Email: " + email;
    }
}

// Staff Class implementing Employee
class Staff implements Employee {
    private String id;
    private String name;
    private Date dateOfBirth;
    private String email;
    private Date joiningDate;

    public Staff(String id, String name, Date dateOfBirth, String email, Date joiningDate) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.joiningDate = joiningDate;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public Date getJoiningDate() { return joiningDate; }
    public Date getDateOfBirth() { return dateOfBirth; }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "ID: " + id + ", Name: " + name + ", Date of Birth: " + sdf.format(dateOfBirth) + ", Email: " + email;
    }
}