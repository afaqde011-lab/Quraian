package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class u1 {

    public static final z1 f846a = new z1();

    public static final b2 f847b;

    static {
        b2 b2Var = null;
        try {
            b2Var = (b2) ta.m.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f847b = b2Var;
    }

    public static final void a(int i10, ArrayList arrayList) {
        kotlin.jvm.internal.m.e(arrayList, "views");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i10);
        }
    }
}
