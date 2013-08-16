package lv.ctco.ListViewerKVO;

import lv.ctco.ListViewerKVO.operationsIO.FindIO;
import lv.ctco.ListViewerKVO.operationsIO.ViewIO;

import java.util.ArrayList;
import java.util.List;

//import lv.ctco.ListViewerKVO.operationsIO.FindIOFactory;

/**
 * Created with IntelliJ IDEA.
 * User: butross
 * Date: 8/14/13
 * Time: 12:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class ListViewer implements ListOfOperations {
    private List<Student> resultList;
    private ConsoleIO consoleIO;
    private List<String> values;
    private Checker checker;

    public ListViewer() {
        resultList = new ArrayList<Student>();
        consoleIO = new ConsoleIO();
        checker = new Checker();
    }

    public List lst() {
        return null;
    }

    public void start() {
        while (true) {
            values = consoleIO.readFromConsole();
            String operation=values.get(0);
            if (values.get(0).equalsIgnoreCase("view")) {
                new ViewIO().doOperationIO(resultList);
            }
//            if (values.get(0).equalsIgnoreCase("find")) {
//                new ViewIO().doOperationIO(FindFactory.factoryInitFind().doOperation(studentList, Arrays.asList(FindIOFactory.factoryInitFind().doOperationIO())));
//            }
            for (int i = 0; i < listOfOperations.size(); i++) {
                if (listOfOperations.get(i).getOperation().equals(operation)) {
                    resultList = (List<Student>) listOfOperations.get(i).doOperation(values);
                }
            }
        }
    }
}
