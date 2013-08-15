package lv.ctco.ListViewerKVO.operations;

import lv.ctco.ListViewerKVO.Student;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: butross
 * Date: 8/14/13
 * Time: 1:44 PM
 * To change this template use File | Settings | File Templates.
 */
public interface OperationsInterface {
    public String getOperation();

    public Object doOperation(List<Student> studentList, List<String> values);
}
