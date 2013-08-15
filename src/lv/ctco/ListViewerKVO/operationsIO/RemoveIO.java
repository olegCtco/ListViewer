package lv.ctco.ListViewerKVO.operationsIO;

import lv.ctco.ListViewerKVO.Checker;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: joen
 * Date: 8/16/13
 * Time: 12:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class RemoveIO implements OperationIOinterface {
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
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return deleteItemIndex;
    }

    @Override
    public String getMnemonics() {
        return "remove";
    }
}
