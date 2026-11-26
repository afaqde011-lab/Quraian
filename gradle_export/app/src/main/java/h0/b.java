package h0;

import android.view.View;
import java.util.WeakHashMap;

public final class b implements e {

    public final int f6381a;

    public b(int i10) {
        this.f6381a = i10;
    }

    public static final a b(int i10, String str) {
        WeakHashMap weakHashMap = m2.f6423w;
        return new a(i10, str);
    }

    public static final i2 d(int i10, String str) {
        WeakHashMap weakHashMap = m2.f6423w;
        return new i2(new u0(0, 0, 0, 0), str);
    }

    public static m2 e(l1.j jVar) {
        l1.g0 g0Var = (l1.g0) jVar;
        View view = (View) g0Var.k(c3.o0.f2726f);
        m2 m2VarF = f(view);
        boolean zI = g0Var.i(m2VarF) | g0Var.i(view);
        Object objN = g0Var.N();
        if (zI || objN == l1.i.f9868a) {
            objN = new al.l(m2VarF, view, 25);
            g0Var.n0(objN);
        }
        l1.q.e(m2VarF, (u00.k) objN, jVar);
        return m2VarF;
    }

    public static m2 f(View view) {
        m2 m2Var;
        WeakHashMap weakHashMap = m2.f6423w;
        synchronized (weakHashMap) {
            try {
                Object m2Var2 = weakHashMap.get(view);
                if (m2Var2 == null) {
                    m2Var2 = new m2(view);
                    weakHashMap.put(view, m2Var2);
                }
                m2Var = (m2) m2Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m2Var;
    }

    @Override
    public void c(y3.c cVar, int i10, int[] iArr, y3.m mVar, int[] iArr2) {
        switch (this.f6381a) {
            case 0:
                i.b(iArr, iArr2, false);
                break;
            case 1:
                i.c(i10, iArr, iArr2, false);
                break;
            case 2:
                if (mVar != y3.m.A) {
                    i.b(iArr, iArr2, true);
                } else {
                    i.c(i10, iArr, iArr2, false);
                }
                break;
            default:
                if (mVar != y3.m.A) {
                    i.c(i10, iArr, iArr2, true);
                } else {
                    i.b(iArr, iArr2, false);
                }
                break;
        }
    }

    public String toString() {
        switch (this.f6381a) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case 2:
                return "Arrangement#End";
            case 3:
                return "Arrangement#Start";
            default:
                return super.toString();
        }
    }
}
