package lv.ctco.listViewerKVO.operations;

import lv.ctco.listViewerKVO.*;

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
        try {
            List<Student> studentList = StudentsList.getStudentList();
            int indexDelete = Integer.parseInt(values.get(0)) - 1;
            if (!checker.outOfBound(studentList, indexDelete)) {
                StudentsList.getStudentList().remove(indexDelete);
            } else {
                return false;
            }
        } catch (NullPointerException ex) {
            return false;
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}