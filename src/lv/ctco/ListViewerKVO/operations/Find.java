package lv.ctco.ListViewerKVO.operations;

import lv.ctco.ListViewerKVO.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: butross
 * Date: 8/14/13
 * Time: 12:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Find implements OperationsInterface {

    @Override
    public String getOperation() {
        return "find";
    }

    @Override
    public Object doOperation(List<Student> studentList, List<String> values) {
//        String name=values.get(0);
//        String surname=values.get(1);
//        String university=values.get(2);
        List<Student> result = new ArrayList<Student>();
        for (Student student : studentList) {
            for (String nameSurnameUniversity : values) {
//                if(nameSurnameUniversity.equals(student.))
            }
        }
        return null;
    }
}
