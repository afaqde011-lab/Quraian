package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

public final class m implements Runnable {
    public final int A = 0;
    public final Object B;
    public final Object C;

    public m(b2 b2Var, View view, Rect rect) {
        this.B = view;
        this.C = rect;
    }

    public m(p pVar, ViewGroup viewGroup) {
        this.B = pVar;
        this.C = viewGroup;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                b2.j((View) this.B, (Rect) this.C);
                break;
            default:
                p pVar = (p) this.B;
                ViewGroup viewGroup = (ViewGroup) this.C;
                kotlin.jvm.internal.m.e(viewGroup, "$container");
                Iterator it = pVar.f788c.iterator();
                while (it.hasNext()) {
                    g2 g2Var = ((q) it.next()).f774a;
                    View view = g2Var.f735c.getView();
                    if (view != null) {
                        a1.b.a(g2Var.f733a, view, viewGroup);
                    }
                }
                break;
        }
    }
}
