package lv.ctco.ListViewerKVO.operationsIO;

import lv.ctco.ListViewerKVO.Checker;
import lv.ctco.ListViewerKVO.OperationsIO;

import java.io.BufferedReader;
import java.io.IOException;

public class AddIO implements OperationsIO {
    private Checker checker;
    private String mnemonics;
    BufferedReader localBf;

    public AddIO(String mnemonics) {
        this.mnemonics = mnemonics;
        checker = new Checker();
        localBf = bf;
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
            do {
                System.out.println("Input name:");
                name = localBf.readLine();
            } while (checker.checkIfEmptyString(name));
            values[0] = name;
            do {
                System.out.println("Input surname:");
                surname = localBf.readLine();
            } while (checker.checkIfEmptyString(surname));
            values[1] = surname;
            do {
                System.out.println("Input university");
                university = localBf.readLine();
            } while (checker.checkIfEmptyString(university));
            values[2] = university;
        } catch (IOException e) {
        }
        return values;
    }
}