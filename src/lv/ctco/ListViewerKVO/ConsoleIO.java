package lv.ctco.ListViewerKVO;

import lv.ctco.ListViewerKVO.operationsIO.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: butross
 * Date: 8/14/13
 * Time: 12:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConsoleIO {
    private BufferedReader bf;
    private InputStreamReader inputStreamReader;
    private Checker checker = new Checker();
    private List<OperationIOinterface> operationsIO;

    public ConsoleIO() {
        inputStreamReader = new InputStreamReader(System.in);
        bf = new BufferedReader(inputStreamReader);
        operationsIO = Arrays.asList((OperationIOinterface) new AddIO("add"), (OperationIOinterface) new ExitIO("exit"), (OperationIOinterface) new RemoveIO(), (OperationIOinterface) new FindIO(),(OperationIOinterface) new SortIO("sort"));

    }

    public void menu() {
        System.out.println("Hello User" +
                "\n Choose what you want to do:" +
                "\n 1. To view list type VIEW" +
                "\n 2. To add student type ADD" +
                "\n 3. To remove student form list type REMOVE" +
                "\n 4. To find student type FIND" +
                "\n 5. To sort list of students type SORT" +
                "\n 6. To exit type EXIT");
    }

//    public String[] addIO() {
//        String name = "";
//        String surname = "";
//        String university = "";
//        String [] values=new String[3];
//        try {
//            while (checker.checkIfEmptyString(name)) {
//                System.out.println("Input name:");
//                name = bf.readLine();
//            }
//            values[0]=name;
//            while (checker.checkIfEmptyString(surname)) {
//                System.out.println("Input surname:");
//                surname = bf.readLine();
//            }
//            values[1]=surname;
//            while (checker.checkIfEmptyString(university)) {
//                System.out.println("Input university");
//                university = bf.readLine();
//            }
//            values[2]=university;
//        } catch (IOException e) {
//        }
//        return values;
//    }

    public List<String> readFromConsole() {
        String operation;
        List<String> values = new ArrayList<String>();
        String operationMnemonic;
        while (true) try {
            menu();
            operation = bf.readLine();
            values.add(operation);
            if (checker.checkOperation(operation)) {
                for (int i = 0; i < operationsIO.size(); i++) {
                    operationMnemonic = operationsIO.get(i).getMnemonics();
                    if (operationMnemonic.equals(operation)) {
                        String[] returnedValues = operationsIO.get(i).doOperationIO();
                        if (returnedValues != null) {
                            for (String x : returnedValues) {
                                values.add(x);

                            }
                        }
                    }
                }
            } else if (operation.equalsIgnoreCase("view")) {
                return values;
            }
//            else if (operation.equalsIgnoreCase("find")) {
//                return values;
//            }
            else {
                System.out.println("No such command!!!");
            }
            return values;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
