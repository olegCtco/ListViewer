package lv.ctco.ListViewerKVO;

public class Student {
    private String name;
    private String surname;
    private String university;

    public Student(String name, String surname, String university) {
        this.name = name;
        this.surname = surname;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getUniversity() {
        return university;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + university;
    }
}
