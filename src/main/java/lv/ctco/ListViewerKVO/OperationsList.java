package lv.ctco.ListViewerKVO;

import lv.ctco.ListViewerKVO.operations.*;

import java.util.Arrays;
import java.util.List;

public interface OperationsList {
    List<Operations> listOfOperations = Arrays.asList(new Add(), new Find(), new Remove(), new Sort(), new Exit());
}