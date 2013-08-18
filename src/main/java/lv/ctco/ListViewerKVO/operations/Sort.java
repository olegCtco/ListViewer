package lv.ctco.ListViewerKVO.operations;

import lv.ctco.ListViewerKVO.Operation;
import lv.ctco.ListViewerKVO.Operations;

import java.util.List;

public class Sort implements Operations {
    @Override
    public String getOperation() {
        return Operation.SORT.name();
    }

    @Override
    public Object doOperation(List<String> values) {
        return null;
    }
}