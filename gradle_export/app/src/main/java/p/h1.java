package p;

import android.widget.AbsListView;

public abstract class h1 {
    public static boolean a(AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }

    public static void b(AbsListView absListView, boolean z10) {
        absListView.setSelectedChildViewEnabled(z10);
    }
}
