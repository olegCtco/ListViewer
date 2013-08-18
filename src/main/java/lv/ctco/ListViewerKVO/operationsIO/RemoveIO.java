package lv.ctco.ListViewerKVO.operationsIO;

import lv.ctco.ListViewerKVO.Checker;
import lv.ctco.ListViewerKVO.Operation;
import lv.ctco.ListViewerKVO.OperationsIO;

import java.io.BufferedReader;
import java.io.IOException;

public class RemoveIO implements OperationsIO {
    Checker checker;
    BufferedReader localBf;
    private String mnemonics;

    public RemoveIO(String mnemonics) {
        checker = new Checker();
        localBf=bf;
        this.mnemonics=mnemonics;
    }

    @Override
    public String[] doOperationIO() {
        String[] deleteItemIndex = new String[1];
        System.out.println("Input number of element, what you want to delete:");
        try {
            while (true) {
                deleteItemIndex[0] = localBf.readLine();
                if (checker.notANumber(deleteItemIndex[0])) {
                    System.out.println("Input correct number");
                    deleteItemIndex[0] = "-1";
                } else break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return deleteItemIndex;
    }

    @Override
    public String getMnemonics() {
        return mnemonics;
    }
}