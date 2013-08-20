package lv.ctco.listViewerKVO.operations;

import lv.ctco.listViewerKVO.Operation;
import lv.ctco.listViewerKVO.Operations;

import java.util.List;

public class Exit implements Operations {
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