package lv.ctco.ListViewerKVO.operationsIO;

import lv.ctco.ListViewerKVO.OperationIOInterface;

import java.io.IOException;

public class ExitIO implements OperationIOInterface {
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
        while (true) try {
            System.out.println("Are you sure you want exit?('Y' if yes)");
            String choice = bf.readLine();
            if (choice.equalsIgnoreCase("Y")) {
                exit[0] = "exit";
                return exit;
            } else return null;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}