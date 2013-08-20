package lv.ctco.listViewerKVO;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public interface OperationsIO {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    String[] doOperationIO();

    String getMnemonics();
}