package lv.ctco.ListViewerKVO.operations;

import lv.ctco.ListViewerKVO.Checker;
import lv.ctco.ListViewerKVO.Student;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: butross
 * Date: 8/14/13
 * Time: 12:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class Remove implements OperationsInterface {
    Checker checker;

    public Remove() {
        checker = new Checker();
    }

    @Override
    public String getOperation() {
        return "remove";
    }

    @Override
    public Object doOperation(List<Student> studentList, List<String> values) {
        int indexDelete = Integer.parseInt(values.get(1)) - 1;
        if (!checker.outOfBound(studentList, indexDelete)) {
            studentList.remove(indexDelete);
        }
        return studentList;
    }
}
