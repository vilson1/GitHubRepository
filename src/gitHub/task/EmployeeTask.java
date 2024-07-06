package gitHub.task;

public class EmployeeTask {
    public String name;
    public int age;
    public String titleJob;
    public char gender;
    public int iD;

    public EmployeeTask(String name, int age, String titleJob, char gender, int iD) {
        this.name = name;
        this.age = age;
        this.titleJob = titleJob;
        this.gender = gender;
        this.iD = iD;
    }

    @Override
    public String toString() {
        return "EmployeeTask{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", titleJob='" + titleJob + '\'' +
                ", gender=" + gender +
                ", iD=" + iD +
                '}';
    }
}
