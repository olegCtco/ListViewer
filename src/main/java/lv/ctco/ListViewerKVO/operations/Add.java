package lv.ctco.listViewerKVO.operations;

import lv.ctco.listViewerKVO.Operation;
import lv.ctco.listViewerKVO.Operations;
import lv.ctco.listViewerKVO.Student;
import lv.ctco.listViewerKVO.StudentsList;

import java.util.List;

public class Add implements Operations {
    @Override
    public String getOperation() {
        return Operation.ADD.name();
    }

    @Override
    public Object doOperation(List<String> values) {
        try {
            Student student = new Student(values.get(0), values.get(1), values.get(2));
            StudentsList.getStudentList().add(student);
            for (Student student1 : StudentsList.getStudentList()) {
                System.out.println(student1);
            }
        } catch (NullPointerException ex) {
            return false;
        }
        return true;
    }
}