package lv.ctco.ListViewerKVO;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public interface OperationIOInterface {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String[] doOperationIO();

    String getMnemonics();
}