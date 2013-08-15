package lv.ctco.ListViewerKVO.operationsIO;

import lv.ctco.ListViewerKVO.Student;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: butross
 * Date: 8/15/13
 * Time: 5:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class ViewIO {
    public void doOperationIO(List<Student> studentList) {
        int id = 0;
        if (studentList.size() != 0) {
            for (int i = 0; i < studentList.size(); i++) {
                System.out.println(++id + ". " + studentList.get(i));
            }
        } else {
            System.out.println("Student list now is empty");
        }
    }
}
