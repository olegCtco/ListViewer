package lv.ctco.ListViewerKVO.operations;

import lv.ctco.ListViewerKVO.Student;
import lv.ctco.ListViewerKVO.StudentList;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: butross
 * Date: 8/14/13
 * <p/>
 * Time: 12:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class Add implements OperationsInterface {
    //    List<Student> arrStudent= Arrays.asList(new Student("kr","asd","qwert"),new Student("a","b","c"),new Student("f","g","h"));
//    public List<Student> add(List<Student> studentList, List<String> values) {
//        Student student = new Student(values.get(0), values.get(1), values.get(2));
//        studentList.add(student);
//        return studentList;
//    }

    @Override
    public String getOperation() {
        return "add";
    }

    @Override
    public Object doOperation(List<String> values) {
        List<Student> studentList = StudentList.getStudentList();
        Student student = new Student(values.get(1), values.get(2), values.get(3));
        studentList.add(student);
        return studentList;
    }
}
