package lv.ctco.ListViewerKVO;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static List<Student> studentList = new ArrayList<>();

    public static List<Student> getStudentList() {
        return studentList;
    }
}