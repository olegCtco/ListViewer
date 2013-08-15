package lv.ctco.ListViewerKVO.operations;

/**
 * Created with IntelliJ IDEA.
 * User: Olegs
 * Date: 13.16.8
 * Time: 01:08
 * To change this template use File | Settings | File Templates.
 */
public class FindFactory {
    private static Find find = null;

    public static Find factoryInitFind() {
        if (find == null) {
            find = new Find();
        }
        return find;
    }
}
