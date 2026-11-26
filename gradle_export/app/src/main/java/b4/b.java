package b4;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import q3.e0;
import z2.d0;
import z4.j1;
import z4.q0;

public final class b extends f7.e {
    public final int C;
    public final ViewGroup D;

    public b(ViewGroup viewGroup, int i10) {
        super(1, 3);
        this.C = i10;
        this.D = viewGroup;
    }

    @Override
    public final j1 o(j1 j1Var, List list) {
        switch (this.C) {
            case 0:
                return ((z) this.D).m(j1Var);
            default:
                c4.u uVar = (c4.u) this.D;
                if (uVar.M) {
                    return j1Var;
                }
                View childAt = uVar.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, uVar.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, uVar.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? j1Var : j1Var.f17202a.r(iMax, iMax2, iMax3, iMax4);
        }
    }

    @Override
    public final e0 p(q0 q0Var, e0 e0Var) {
        switch (this.C) {
            case 0:
                b3.u uVar = (b3.u) ((z) this.D).f2153c0.f2059g0.D;
                if (!uVar.f2133u0.N) {
                    return e0Var;
                }
                long jC = f50.k.C(uVar.d0(0L));
                int i10 = (int) (jC >> 32);
                if (i10 < 0) {
                    i10 = 0;
                }
                int i11 = (int) (jC & 4294967295L);
                if (i11 < 0) {
                    i11 = 0;
                }
                long jP = d0.i(uVar).p();
                int i12 = (int) (jP >> 32);
                int i13 = (int) (jP & 4294967295L);
                long j9 = uVar.C;
                long jC2 = f50.k.C(uVar.d0((((long) Float.floatToRawIntBits((int) (j9 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j9 & 4294967295L))) & 4294967295L)));
                int i14 = i12 - ((int) (jC2 >> 32));
                if (i14 < 0) {
                    i14 = 0;
                }
                int i15 = i13 - ((int) (jC2 & 4294967295L));
                int i16 = i15 >= 0 ? i15 : 0;
                return (i10 == 0 && i11 == 0 && i14 == 0 && i16 == 0) ? e0Var : new e0(j.l((q4.b) e0Var.B, i10, i11, i14, i16), j.l((q4.b) e0Var.C, i10, i11, i14, i16), 24);
            default:
                c4.u uVar2 = (c4.u) this.D;
                if (uVar2.M) {
                    return e0Var;
                }
                View childAt = uVar2.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, uVar2.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, uVar2.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return e0Var;
                }
                q4.b bVarC = q4.b.c(iMax, iMax2, iMax3, iMax4);
                int i17 = bVarC.f12755a;
                q4.b bVar = (q4.b) e0Var.B;
                int i18 = bVarC.f12756b;
                int i19 = bVarC.f12757c;
                int i20 = bVarC.f12758d;
                return new e0(j1.e(bVar, i17, i18, i19, i20), j1.e((q4.b) e0Var.C, i17, i18, i19, i20), 24);
        }
    }
}
