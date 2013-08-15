package lv.ctco.ListViewerKVO.operationsIO;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: butross
 * Date: 8/15/13
 * Time: 3:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class ExitIO implements OperationIOinterface {
    private String mnemonics;

    public ExitIO(String mnemonics) {
        this.mnemonics = mnemonics;
    }

    public String getMnemonics() {
        return mnemonics;
    }

    @Override
    public String[] doOperationIO() {
        String[] exit = new String[1];
        while (true) {
            try {
                System.out.println("Are you sure you want exit?('Y' if yes)");
                String choice = bf.readLine();
                if (choice.equalsIgnoreCase("Y")) {
                    exit[0] = "exit";
                    return exit;
                } else {
                    return null;
                }
//                else{
//                    new ConsoleIO().readFromConsole();
//                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
