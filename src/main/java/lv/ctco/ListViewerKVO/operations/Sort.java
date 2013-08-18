package lv.ctco.ListViewerKVO.operations;

import lv.ctco.ListViewerKVO.Operation;
import lv.ctco.ListViewerKVO.OperationsInterface;

import java.util.List;

public class Sort implements OperationsInterface {
    @Override
    public String getOperation() {
        return Operation.SORT.name();
    }

    @Override
    public Object doOperation(List<String> values) {
        return null;
    }
}