package lv.ctco.ListViewerKVO;

/**
 * Created with IntelliJ IDEA.
 * User: Olegs
 * Date: 13.15.8
 * Time: 21:39
 * To change this template use File | Settings | File Templates.
 */
public class ListViewerFactory {
    private static ListViewer listViewer = null;

    public static ListViewer factoryInitListViewer() {
        if (listViewer == null) {
            listViewer = new ListViewer();
        }
        return listViewer;
    }
}