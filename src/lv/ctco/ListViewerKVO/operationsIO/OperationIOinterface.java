package lv.ctco.ListViewerKVO.operationsIO;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: butross
 * Date: 8/15/13
 * Time: 3:52 PM
 * To change this template use File | Settings | File Templates.
 */
public interface OperationIOinterface {
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    String[] doOperationIO();
    String getMnemonics() ;
}
