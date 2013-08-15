package lv.ctco.ListViewerKVO.operationsIO;

import lv.ctco.ListViewerKVO.Checker;

import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: joen
 * Date: 8/14/13
 * Time: 10:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class AddIO implements OperationIOinterface {
    Checker checker;
    private String mnemonics;

    public AddIO(String mnemonics) {
        this.mnemonics = mnemonics;
        checker = new Checker();
    }

    public String getMnemonics() {
        return mnemonics;
    }

    @Override
    public String[] doOperationIO() {
        String name = "";
        String surname = "";
        String university = "";
        String[] values = new String[4];
        try {
            while (checker.checkIfEmptyString(name)) {
                System.out.println("Input name:");
                name = bf.readLine();
            }
            values[0] = name;
            while (checker.checkIfEmptyString(surname)) {
                System.out.println("Input surname:");
                surname = bf.readLine();
            }
            values[1] = surname;
            while (checker.checkIfEmptyString(university)) {
                System.out.println("Input university");
                university = bf.readLine();
            }
            values[2] = university;
        } catch (IOException e) {
        }
        return values;
    }
}
