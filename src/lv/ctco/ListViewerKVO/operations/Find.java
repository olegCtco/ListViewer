package lv.ctco.ListViewerKVO.operations;

import lv.ctco.ListViewerKVO.Student;
import lv.ctco.ListViewerKVO.StudentList;
import lv.ctco.ListViewerKVO.operationsIO.ViewIO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: butross
 * Date: 8/14/13
 * Time: 12:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Find implements OperationsInterface {

    @Override
    public String getOperation() {
        return "find";
    }

    @Override
    public List<Student> doOperation(List<String> values) {
        String name = values.get(1);
        String surname = values.get(2);
        String university = values.get(3);
        List<Student> result = new ArrayList<Student>();

        if ((name.equals("") && surname.equals("") && university.equals(""))) {
            return StudentList.getStudentList();
        } else {
            for (Student student : StudentList.getStudentList()) {
                if (student.getName().equals(name) && student.getSurname().equals(surname) && student.getUniversity().equals(university)) {
                    result.add(student);
                }
                if (name.equals("") && student.getSurname().equals(surname) && student.getUniversity().equals(university)) {
                    result.add(student);
                }
                if (student.getName().equals(name) && surname.equals("") && student.getUniversity().equals(university)) {
                    result.add(student);
                }
                if (student.getName().equals(name) && student.getSurname().equals(surname) && university.equals("")) {
                    result.add(student);
                }
                if (name.equals("") && surname.equals("") && student.getUniversity().equals(university)) {
                    result.add(student);
                }
                if (student.getName().equals(name) && surname.equals("") && university.equals("")) {
                    result.add(student);
                }
                if (name.equals("") && student.getSurname().equals(surname) && university.equals("")) {
                    result.add(student);
                }
            }
        }
        new ViewIO().doOperationIO(result);
        return result;
    }
}
