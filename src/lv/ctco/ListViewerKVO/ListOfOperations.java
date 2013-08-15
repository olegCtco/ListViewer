package lv.ctco.ListViewerKVO;

import lv.ctco.ListViewerKVO.operations.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: butross
 * Date: 8/14/13
 * Time: 1:37 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ListOfOperations {
    List<OperationsInterface> listOfOperations = Arrays.asList(new Add()/*, new Find()*/, new Remove(), new Sort(), new Exit());
}
