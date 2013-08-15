package lv.ctco.ListViewerKVO.operationsIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: Olegs
 * Date: 13.16.8
 * Time: 00:51
 * To change this template use File | Settings | File Templates.
 */
public class FindIO implements OperationIOinterface{
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    @Override
    public String[] doOperationIO() {
        String name = "";
        String surname = "";
        String university = "";
        String[] values = new String[4];
        try {
            System.out.println("Input name:");
            name = bf.readLine();
            values[0] = name;
            System.out.println("Input surname:");
            surname = bf.readLine();
            values[1] = surname;
            System.out.println("Input university");
            university = bf.readLine();
            values[2] = university;
        } catch (IOException e) {
        }
        return values;
    }

    @Override
    public String getMnemonics() {
        return "find";  //To change body of implemented methods use File | Settings | File Templates.
    }
}