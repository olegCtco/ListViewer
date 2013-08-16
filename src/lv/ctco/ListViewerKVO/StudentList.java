package lv.ctco.ListViewerKVO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: butross
 * Date: 8/16/13
 * Time: 1:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class StudentList {
    static List<Student> studentList=new ArrayList<Student>();

    public static List<Student> getStudentList() {
        return studentList;
    }

    public static void setStudentList(List<Student> studentList) {
        StudentList.studentList = studentList;
    }
}
