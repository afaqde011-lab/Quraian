package androidx.fragment.app;

import android.view.View;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;

public final class r extends kotlin.jvm.internal.n implements u00.k {
    public final int A;
    public final Collection B;

    public r(int i10, Collection collection) {
        super(1);
        this.A = i10;
        this.B = collection;
    }

    public final Object invoke(Object obj) {
        int i10 = this.A;
        Collection collection = this.B;
        switch (i10) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.m.e(entry, "entry");
                View view = (View) entry.getValue();
                WeakHashMap weakHashMap = z4.j0.f17198a;
                return Boolean.valueOf(h00.q.F0(collection, view.getTransitionName()));
            default:
                return Boolean.valueOf(collection.contains(obj));
        }
    }
}
