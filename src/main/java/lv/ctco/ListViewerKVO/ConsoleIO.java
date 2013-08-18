package lv.ctco.ListViewerKVO;

import lv.ctco.ListViewerKVO.operationsIO.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsoleIO {
    private BufferedReader bf;
    private InputStreamReader inputStreamReader;
    private Checker checker = new Checker();
    private List<OperationsIO> operationsIO;

    public ConsoleIO() {
        inputStreamReader = new InputStreamReader(System.in);
        bf = new BufferedReader(inputStreamReader);
        operationsIO = Arrays.asList(new AddIO(Operation.ADD.name()), new ExitIO(Operation.EXIT.name()), new RemoveIO(), new FindIO(), new SortIO(Operation.SORT.name()));
    }

    public void menu() {
        System.out.println("Hi User" +
                "\n Choose what you want to do:" +
                "\n ADD    -> Add student to list" +
                "\n REMOVE -> Remove student form list" +
                "\n VIEW   -> View students list" +
                "\n FIND   -> Find students" +
                "\n SORT   -> Sort students list" +
                "\n EXIT   -> Quit application");
    }

    public List<String> readFromConsole() {
        String operation;
        List<String> values = new ArrayList<>();
        String operationMnemonic;
        while (true) try {
            menu();
            operation = bf.readLine();
            values.add(operation);
            if (checker.checkOperation(operation)) for (int i = 0; i < operationsIO.size(); i++) {
                operationMnemonic = operationsIO.get(i).getMnemonics();
                if (operationMnemonic.equalsIgnoreCase(operation)) {
                    String[] returnedValues = operationsIO.get(i).doOperationIO();
                    if (returnedValues != null) for (String x : returnedValues) values.add(x);
                }
            }
            else if (operation.equalsIgnoreCase(Operation.VIEW.name())) return values;
            else System.out.println("No such command!!!");
            return values;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}