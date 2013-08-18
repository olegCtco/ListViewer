package lv.ctco.ListViewerKVO.operationsIO;

import lv.ctco.ListViewerKVO.OperationsIO;

import java.io.IOException;

public class SortIO implements OperationsIO {
    private String mnemonics;

    public SortIO(String mnemonics) {
        this.mnemonics = mnemonics;
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
            System.out.println("Are you want to sort by name? (Y if yes)");
            name = bf.readLine();
            values[0] = name;
            if (name.equalsIgnoreCase("Y")) {
                values[1] = surname;
                values[2] = university;
                return values;
            }
            System.out.println("Are you want to sort by surname? (Y if yes)");
            surname = bf.readLine();
            values[1] = surname;
            if (surname.equalsIgnoreCase("Y")) {
                values[2] = university;
                return values;
            }
            System.out.println("Are you want to sort by university? (Y if yes)");
            university = bf.readLine();
            values[2] = university;
        } catch (IOException e) {
        }
        return values;
    }
}