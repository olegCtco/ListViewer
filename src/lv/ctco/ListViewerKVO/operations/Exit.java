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
public class Exit implements OperationsInterface {

    @Override
    public String getOperation() {
        return "exit";
    }

    @Override
    public Object doOperation(List<String> values) {
        if (values.size() > 1) {
            System.exit(0);
        }
        return null;

    }
}
