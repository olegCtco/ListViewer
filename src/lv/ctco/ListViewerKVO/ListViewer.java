package lv.ctco.ListViewerKVO;

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
    private List<Student> studentList;
    private ConsoleIO consoleIO;
    private List<String> values;
    private Checker checker;

    public ListViewer() {
        studentList = new ArrayList<Student>();
        consoleIO = new ConsoleIO();
        checker = new Checker();
    }

    public List lst() {
        return null;
    }

    public void start() {
        while (true) {
            values = consoleIO.readFromConsole();
            if (values.get(0).equalsIgnoreCase("view")) {
                new ViewIO().doOperationIO(studentList);
            }
//            if (values.get(0).equalsIgnoreCase("find")) {
//                new ViewIO().doOperationIO(FindFactory.factoryInitFind().doOperation(studentList, Arrays.asList(FindIOFactory.factoryInitFind().doOperationIO())));
//            }
            for (int i = 0; i < listOfOperations.size(); i++) {
                if (listOfOperations.get(i).getOperation().equals(values.get(0))) {
                    studentList = (List<Student>) listOfOperations.get(i).doOperation(studentList, values);
                }
            }

        }
    }
}
