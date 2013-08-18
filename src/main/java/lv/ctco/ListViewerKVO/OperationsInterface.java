package lv.ctco.ListViewerKVO;

import java.util.List;

public interface OperationsInterface {
    public String getOperation();

    public Object doOperation(List<String> values);
}