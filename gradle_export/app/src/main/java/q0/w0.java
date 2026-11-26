package q0;

import android.view.InputDevice;
import android.view.KeyEvent;
import c3.t2;
import java.util.List;

public final class w0 implements u00.k {
    public final int A;
    public final Object B;
    public final Object C;

    public w0(g2.l lVar, j1 j1Var) {
        this.A = 1;
        this.C = lVar;
        this.B = j1Var;
    }

    public w0(Object obj, Object obj2, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
    }

    public final Object invoke(Object obj) {
        boolean z10;
        long j9;
        switch (this.A) {
            case 0:
                KeyEvent keyEvent = ((t2.b) obj).f14351a;
                if (((j1) this.B).a() == z0.B && keyEvent.getKeyCode() == 4) {
                    z10 = true;
                    if (t2.d.c(keyEvent) == 1) {
                        ((e1.v0) this.C).g(null);
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 1:
                KeyEvent keyEvent2 = ((t2.b) obj).f14351a;
                g2.l lVar = (g2.l) this.C;
                InputDevice device = keyEvent2.getDevice();
                boolean zH = false;
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent2.getSource() == 33554433) && t2.d.c(keyEvent2) == 2 && keyEvent2.getSource() != 257)) {
                    if (q.p(19, keyEvent2)) {
                        zH = ((g2.n) lVar).h(5, true);
                    } else if (q.p(20, keyEvent2)) {
                        zH = ((g2.n) lVar).h(6, true);
                    } else if (q.p(21, keyEvent2)) {
                        zH = ((g2.n) lVar).h(3, true);
                    } else if (q.p(22, keyEvent2)) {
                        zH = ((g2.n) lVar).h(4, true);
                    } else if (q.p(23, keyEvent2)) {
                        t2 t2Var = ((j1) this.B).f12640c;
                        if (t2Var != null) {
                            ((c3.p1) t2Var).b();
                        }
                        zH = true;
                    }
                }
                return Boolean.valueOf(zH);
            case 2:
                j10.c cVar = (j10.c) obj;
                q20.k kVar = (q20.k) this.B;
                j10.c cVar2 = (j10.c) this.C;
                kotlin.jvm.internal.m.e(cVar, "second");
                kVar.d(cVar2, cVar);
                return g00.b0.a;
            case 3:
                return ((pp.d) this.B).invoke(((List) this.C).get(((Number) obj).intValue()));
            case 4:
                return ((pp.d) this.B).invoke(((List) this.C).get(((Number) obj).intValue()));
            case 5:
                return ((r9.e) this.B).invoke(((List) this.C).get(((Number) obj).intValue()));
            case 6:
                return ((r9.e) this.B).invoke(((List) this.C).get(((Number) obj).intValue()));
            case 7:
                return ((wp.a) this.B).invoke(((List) this.C).get(((Number) obj).intValue()));
            case 8:
                return ((wp.a) this.B).invoke(((List) this.C).get(((Number) obj).intValue()));
            case 9:
                return ((wp.a) this.B).invoke(((List) this.C).get(((Number) obj).intValue()));
            case 10:
                return ((wp.a) this.B).invoke(((List) this.C).get(((Number) obj).intValue()));
            case 11:
                return ((wp.a) this.B).invoke(((List) this.C).get(((Number) obj).intValue()));
            case 12:
                if (((xo.a) this.B).a == ((sd.p1) this.C)) {
                    ((xo.a) this.B).a = null;
                }
                return g00.b0.a;
            case 13:
                return ((xn.a) this.B).invoke(((List) this.C).get(((Number) obj).intValue()));
            default:
                z1.j jVar = (z1.j) obj;
                synchronized (z1.l.f17038c) {
                    j9 = z1.l.f17040e;
                    z1.l.f17040e = ((long) 1) + j9;
                }
                return new z1.b(j9, jVar, (u00.k) this.B, (u00.k) this.C);
        }
    }
}
