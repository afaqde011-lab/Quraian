package k9;

import android.graphics.Point;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.b5;

public final class f1 implements kh.m, s2, v7.m {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;

    public f1(Object obj, Object obj2, Object obj3, Object obj4) {
        this.A = obj;
        this.B = obj2;
        this.C = obj3;
        this.D = obj4;
    }

    public f1(v7.j jVar, String str, int[] iArr, Point point) {
        this.A = jVar;
        this.C = str;
        this.B = iArr;
        this.D = point;
    }

    @Override
    public void a(a2 a2Var) {
        t2 t2Var = (t2) this.A;
        z3 z3Var = (z3) this.B;
        Bundle bundle = (Bundle) this.C;
        ResultReceiver resultReceiver = (ResultReceiver) this.D;
        s1 s1Var = t2Var.f9463f;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        nv.p pVar = s1Var.f9417e;
        g1 g1Var = s1Var.f9423k;
        a2 a2VarF = s1Var.F(a2Var);
        pVar.getClass();
        kh.v vVarB = pVar.b(g1Var, a2VarF, z3Var, bundle);
        if (resultReceiver != null) {
            vVarB.a(new ji.a(vVarB, resultReceiver, 18), kh.p.A);
        }
    }

    @Override
    public kh.v apply(Object obj) {
        Object obj2;
        Boolean bool;
        a2 a2VarJ = (a2) this.A;
        g1 g1Var = (g1) this.B;
        String str = (String) this.C;
        e1 e1Var = (e1) this.D;
        q qVar = (q) obj;
        if (qVar.f9394a != 0 || (obj2 = qVar.f9396c) == null || (bool = ((androidx.media3.common.q0) obj2).f1416d.f1641q) == null || !bool.booleanValue()) {
            int i10 = qVar.f9394a;
            if (i10 == 0) {
                i10 = -3;
            }
            return b5.x(q.b(i10));
        }
        if (a2VarJ.f9207b != 0) {
            g1Var.getClass();
            ta.c0.s(!TextUtils.isEmpty(str));
            s1 s1Var = g1Var.f9307a;
            if (!s1Var.A || !s1Var.n(a2VarJ) || (a2VarJ = s1Var.j()) != null) {
                s1Var.e(a2VarJ, new n1(s1Var, str, Integer.MAX_VALUE, e1Var));
            }
        }
        return b5.x(q.d());
    }

    @Override
    public fh.d2 b(int i10, androidx.media3.common.l2 l2Var, int[] iArr) {
        int i11;
        int i12;
        int i13;
        int i14;
        androidx.media3.common.l2 l2Var2 = l2Var;
        v7.j jVar = (v7.j) this.A;
        String str = (String) this.C;
        int[] iArr2 = (int[]) this.B;
        Point point = (Point) this.D;
        int i15 = iArr2[i10];
        int i16 = point != null ? point.x : jVar.f1449i;
        int i17 = point != null ? point.y : jVar.f1450j;
        boolean z10 = jVar.l;
        if (i16 == Integer.MAX_VALUE || i17 == Integer.MAX_VALUE) {
            i11 = Integer.MAX_VALUE;
        } else {
            int i18 = Integer.MAX_VALUE;
            for (int i19 = 0; i19 < l2Var2.f1338a; i19++) {
                androidx.media3.common.t tVar = l2Var2.f1341d[i19];
                int i20 = tVar.f1601u;
                int i21 = tVar.f1602v;
                if (i20 > 0 && i21 > 0) {
                    if (!z10) {
                        i13 = i17;
                        i14 = i16;
                    } else if ((i20 > i21) != (i16 > i17)) {
                        i14 = i17;
                        i13 = i16;
                    } else {
                        i13 = i17;
                        i14 = i16;
                    }
                    int i22 = i20 * i13;
                    int i23 = i21 * i14;
                    Point point2 = i22 >= i23 ? new Point(i14, e7.i0.f(i23, i20)) : new Point(e7.i0.f(i22, i21), i13);
                    int i24 = tVar.f1601u;
                    int i25 = i24 * i21;
                    if (i24 >= ((int) (point2.x * 0.98f)) && i21 >= ((int) (point2.y * 0.98f)) && i25 < i18) {
                        i18 = i25;
                    }
                }
            }
            i11 = i18;
        }
        fh.q0 q0VarM = fh.t0.m();
        int i26 = 0;
        while (i26 < l2Var2.f1338a) {
            androidx.media3.common.t tVar2 = l2Var2.f1341d[i26];
            int i27 = tVar2.f1601u;
            int i28 = (i27 == -1 || (i12 = tVar2.f1602v) == -1) ? -1 : i27 * i12;
            q0VarM.c(new v7.o(i10, l2Var2, i26, jVar, iArr[i26], str, i15, i11 == Integer.MAX_VALUE || (i28 != -1 && i28 <= i11)));
            i26++;
            l2Var2 = l2Var;
        }
        return q0VarM.g();
    }
}
