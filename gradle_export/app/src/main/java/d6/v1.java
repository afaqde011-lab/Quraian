package d6;

import android.widget.RemoteViews;
import java.util.ArrayList;

public final class v1 {

    public static final v1 f4705d = new v1(new long[0], new RemoteViews[0], 1);

    public final long[] f4706a;

    public final RemoteViews[] f4707b;

    public final int f4708c;

    public v1(long[] jArr, RemoteViews[] remoteViewsArr, int i10) {
        this.f4706a = jArr;
        this.f4707b = remoteViewsArr;
        this.f4708c = i10;
        if (jArr.length != remoteViewsArr.length) {
            throw new IllegalArgumentException("RemoteCollectionItems has different number of ids and views");
        }
        if (i10 < 1) {
            throw new IllegalArgumentException("View type count must be >= 1");
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = h00.q.G0(arrayList).size();
        if (size <= this.f4708c) {
            return;
        }
        throw new IllegalArgumentException(("View type count is set to " + this.f4708c + ", but the collection contains " + size + " different layout ids").toString());
    }
}
