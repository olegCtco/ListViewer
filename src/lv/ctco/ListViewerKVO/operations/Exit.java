package lv.ctco.ListViewerKVO.operations;

import lv.ctco.ListViewerKVO.Student;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: butross
 * Date: 8/14/13
 * Time: 1:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class Exit implements OperationsInterface{
    public void quit(){
        System.exit(0);
    }

    @Override
    public String getOperation() {
        return "exit";
    }

    @Override
    public Object doOperation(List<Student> studentList,List<String> values) {
//        return add(values);
        return null;
    }
}
