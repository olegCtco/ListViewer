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
        Student student = new Student(values.get(1), values.get(2), values.get(3));
        StudentsList.getStudentList().add(student);
        return StudentsList.getStudentList();
    }
}