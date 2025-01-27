package lecture1;

public class Employee extends Person {
    private final String employeeId;
    private final String position;

    public Employee(String name, int age, String employeeId, String position) {
        super(name, age); // Call the constructor of the parent class (Person)
        this.employeeId = employeeId;
        this.position = position;
    }

    @Override
    public String getOccupation() {
        return "Employee";
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", employeeId='" + employeeId + '\'' +
                ", position='" + position + '\'' +
                ", occupation='" + getOccupation() + '\'' +
                '}';
    }

    @Override
    public void displayInfo(boolean detailed) {
        if (detailed) {
            System.out.println(this); // Calls the overridden toString() method
        } else {
            System.out.println("Employee{" +
                    "name='" + super.getName() + '\'' +
                    ", age=" + super.getAge() +
                    ", occupation='" + getOccupation() + '\'' +
                    '}');
        }
    }
}
