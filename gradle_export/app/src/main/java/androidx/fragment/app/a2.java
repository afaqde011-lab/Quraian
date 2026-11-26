package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class a2 implements Runnable {
    public final int A;
    public final ArrayList B;
    public final ArrayList C;
    public final ArrayList D;
    public final ArrayList E;

    public a2(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.A = i10;
        this.B = arrayList;
        this.C = arrayList2;
        this.D = arrayList3;
        this.E = arrayList4;
    }

    @Override
    public final void run() {
        for (int i10 = 0; i10 < this.A; i10++) {
            View view = (View) this.B.get(i10);
            String str = (String) this.C.get(i10);
            WeakHashMap weakHashMap = z4.j0.f17198a;
            view.setTransitionName(str);
            ((View) this.D.get(i10)).setTransitionName((String) this.E.get(i10));
        }
    }
}
