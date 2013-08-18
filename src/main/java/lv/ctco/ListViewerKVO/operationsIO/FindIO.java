package lv.ctco.ListViewerKVO.operationsIO;

import lv.ctco.ListViewerKVO.Operation;
import lv.ctco.ListViewerKVO.OperationsIO;

import java.io.BufferedReader;
import java.io.IOException;

public class FindIO implements OperationsIO {
    BufferedReader localBf;
    //    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    private String mnemonics;


    public FindIO(String mnemonics) {
        this.localBf = bf;
        this.mnemonics = mnemonics;
    }

    @Override
    public String[] doOperationIO() {
        String name = "";
        String surname = "";
        String university = "";
        String[] values = new String[3];
        try {
            System.out.println("Input name:");
            name = localBf.readLine();
            values[0] = name;
            System.out.println("Input surname:");
            surname = localBf.readLine();
            values[1] = surname;
            System.out.println("Input university");
            university = localBf.readLine();
            values[2] = university;
        } catch (IOException e) {
        }
        return values;
    }

    @Override
    public String getMnemonics() {
        return mnemonics;
    }
}