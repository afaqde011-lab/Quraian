package bt;

import android.view.View;
import java.util.WeakHashMap;

public final class z0 implements l1.y {
    public final int a;
    public final Object b;
    public final Object c;

    public z0(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void dispose() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((androidx.lifecycle.w) obj2).getLifecycle().d((androidx.lifecycle.l) obj);
                return;
            case 1:
                ((androidx.lifecycle.w) obj2).getLifecycle().d((androidx.lifecycle.l) obj);
                return;
            case 2:
                f.b bVar = (f.b) obj2;
                e.f fVar = (e.f) obj;
                if (bVar.a != null) {
                    fVar.b.f();
                    return;
                } else {
                    if (bVar.b == null) {
                        throw new IllegalStateException("Unreachable");
                    }
                    fVar.a.e();
                    return;
                }
            case 3:
                ((androidx.lifecycle.w) obj2).getLifecycle().d((androidx.lifecycle.l) obj);
                return;
            case 4:
                ((androidx.lifecycle.w) obj2).getLifecycle().d((androidx.lifecycle.l) obj);
                return;
            case 5:
                h0.m2 m2Var = (h0.m2) obj2;
                View view = (View) obj;
                int i2 = m2Var.u - 1;
                m2Var.u = i2;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = z4.j0.a;
                    z4.d0.b(view, (z4.r) null);
                    view.setWindowInsetsAnimationCallback(null);
                    view.removeOnAttachStateChangeListener(m2Var.v);
                    return;
                }
                return;
            case 6:
                ((l0.g1) obj2).C.j(obj);
                return;
            case 7:
                ((androidx.lifecycle.w) obj2).getLifecycle().d((lu.v) obj);
                return;
            case 8:
                ((q0.o) obj2).a.unregisterContentObserver((q0.p) obj);
                return;
            case 9:
                l1.z0 z0Var = (l1.z0) obj2;
                f0.k kVar = (f0.k) z0Var.getValue();
                if (kVar != null) {
                    f0.j jVar = new f0.j(kVar);
                    f0.i iVar = (f0.i) obj;
                    if (iVar != null) {
                        iVar.b(jVar);
                    }
                    z0Var.setValue((Object) null);
                    return;
                }
                return;
            case 10:
                ((q0.g2) obj2).c.remove((u00.k) obj);
                return;
            case 11:
                ((t9.a) obj2).f();
                ((t9.d) obj).e = null;
                return;
            case 12:
                ((androidx.lifecycle.w) obj2).getLifecycle().d((androidx.lifecycle.l) obj);
                return;
            case 13:
                ((x.g0) obj2).a.j((x.e0) obj);
                return;
            case 14:
                ((x.n1) obj2).j.remove((x.n1) obj);
                return;
            case 15:
                x.n1 n1Var = (x.n1) obj2;
                n1Var.getClass();
                x.i1 i1Var = (x.i1) ((x.j1) obj).b.getValue();
                if (i1Var != null) {
                    n1Var.i.remove(i1Var.A);
                    return;
                }
                return;
            default:
                ((x.n1) obj2).i.remove((x.m1) obj);
                return;
        }
    }
}
