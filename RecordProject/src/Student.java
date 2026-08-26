public class Student {

    private String name;
    private String id;
    private String dateOfBirth;
    private String classList;

    public Student(String name, String id, String dateOfBirth, String classList) {
        this.name = name;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.classList = classList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }
    //Getters----------------------------------------------------------------------------------------
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getClassList() {
        return classList;
    }
    //Setters-------------------------------------------------------------------------------------
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
}
