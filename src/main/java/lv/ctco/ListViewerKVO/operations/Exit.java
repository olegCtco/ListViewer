package lv.ctco.ListViewerKVO.operations;

import lv.ctco.ListViewerKVO.Operation;
import lv.ctco.ListViewerKVO.OperationsInterface;

import java.util.List;

public class Exit implements OperationsInterface {
    @Override
    public String getOperation() {
        return Operation.EXIT.name();
    }

    @Override
    public Object doOperation(List<String> values) {
        if (values.size() > 1) System.exit(0);
        return null;
    }
}