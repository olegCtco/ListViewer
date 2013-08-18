package lv.ctco.ListViewerKVO;

import lv.ctco.ListViewerKVO.operationsIO.ViewIO;

import java.util.ArrayList;
import java.util.List;

public class ListViewer implements ListOfOperations {
    private List<Student> resultList;
    private ConsoleIO consoleIO;
    private List<String> values;

    public ListViewer() {
        resultList = new ArrayList<>();
        consoleIO = new ConsoleIO();
    }

    public void start() {
        while (true) {
            values = consoleIO.readFromConsole();
            String operation = values.get(0);
            if (operation.equalsIgnoreCase(Operation.VIEW.name())) new ViewIO().doOperationIO(resultList);
            for (int i = 0; i < listOfOperations.size(); i++)
                if (listOfOperations.get(i).getOperation().equals(operation))
                    resultList = (List<Student>) listOfOperations.get(i).doOperation(values);
        }
    }
}