package lv.ctco.ListViewerKVO.operations;

import lv.ctco.ListViewerKVO.*;

import java.util.List;

public class Remove implements Operations {
    Checker checker;

    public Remove() {
        checker = new Checker();
    }

    @Override
    public String getOperation() {
        return Operation.REMOVE.name();
    }

    @Override
    public Object doOperation(List<String> values) {
        List<Student> studentList = StudentList.getStudentList();
        int indexDelete = Integer.parseInt(values.get(1)) - 1;
        if (!checker.outOfBound(studentList, indexDelete)) studentList.remove(indexDelete);
        return studentList;
    }
}