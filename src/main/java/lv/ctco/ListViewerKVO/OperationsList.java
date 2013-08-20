package lv.ctco.listViewerKVO;

import lv.ctco.listViewerKVO.operations.*;

import java.util.Arrays;
import java.util.List;

public interface OperationsList {
    List<Operations> listOfOperations = Arrays.asList(new Add(), new Find(), new Remove(), new Sort(), new Exit());
}