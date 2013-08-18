package lv.ctco.ListViewerKVO.operations;

import lv.ctco.ListViewerKVO.Operation;
import lv.ctco.ListViewerKVO.Operations;
import lv.ctco.ListViewerKVO.Student;
import lv.ctco.ListViewerKVO.StudentsList;

import java.util.List;

public class Add implements Operations {
    @Override
    public String getOperation() {
        return Operation.ADD.name();
    }

    @Override
    public Object doOperation(List<String> values) {
        List<Student> studentList = StudentsList.getStudentList();
        Student student = new Student(values.get(1), values.get(2), values.get(3));
        studentList.add(student);
        return studentList;
    }
}