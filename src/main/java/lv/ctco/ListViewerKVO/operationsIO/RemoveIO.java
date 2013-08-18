package lv.ctco.ListViewerKVO.operationsIO;

import lv.ctco.ListViewerKVO.Checker;
import lv.ctco.ListViewerKVO.Operation;
import lv.ctco.ListViewerKVO.OperationIOInterface;

import java.io.IOException;

public class RemoveIO implements OperationIOInterface {
    Checker checker;

    public RemoveIO() {
        checker = new Checker();
    }

    @Override
    public String[] doOperationIO() {
        String[] deleteItemIndex = new String[1];
        System.out.println("Input number of element, what you want to delete:");
        try {
            while (true) {
                deleteItemIndex[0] = bf.readLine();
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
        return Operation.REMOVE.name();
    }
}