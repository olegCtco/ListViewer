package lv.ctco.ListViewerKVO.operationsIO;

import lv.ctco.ListViewerKVO.Checker;
import lv.ctco.ListViewerKVO.OperationIOInterface;

import java.io.IOException;

public class AddIO implements OperationIOInterface {
    private Checker checker;
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
            do {
                System.out.println("Input name:");
                name = bf.readLine();
            } while (checker.checkIfEmptyString(name));
            values[0] = name;
            do {
                System.out.println("Input surname:");
                surname = bf.readLine();
            } while (checker.checkIfEmptyString(surname));

            values[1] = surname;
            do {
                System.out.println("Input university");
                university = bf.readLine();
            } while (checker.checkIfEmptyString(university));
            values[2] = university;
        } catch (IOException e) {
        }
        return values;
    }
}