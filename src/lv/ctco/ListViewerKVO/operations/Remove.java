package lv.ctco.ListViewerKVO.operations;

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
    @Override
    public String getOperation() {
        return "remove";
    }

    @Override
    public Object doOperation(List<Student> studentList, List<String> values) {
//        return add(values);
        return null;
    }
}
