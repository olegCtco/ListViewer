package lv.ctco.listViewerKVO;

import java.util.List;

public interface Operations {
    public String getOperation();

    public Object doOperation(List<String> values);
}