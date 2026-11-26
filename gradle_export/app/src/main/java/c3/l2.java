package c3;

import android.view.View;
import java.util.WeakHashMap;

public final class l2 implements u2.a {
    public final View A;
    public final z4.o B;
    public final int[] C;

    public l2(View view) {
        this.A = view;
        z4.o oVar = new z4.o(view);
        if (oVar.f17215d) {
            WeakHashMap weakHashMap = z4.j0.f17198a;
            view.stopNestedScroll();
        }
        oVar.f17215d = true;
        this.B = oVar;
        this.C = new int[2];
        WeakHashMap weakHashMap2 = z4.j0.f17198a;
        view.setNestedScrollingEnabled(true);
    }

    @Override
    public final Object D(long j9, k00.c cVar) {
        float fB = y3.q.b(j9) * (-1.0f);
        float fC = y3.q.c(j9) * (-1.0f);
        z4.o oVar = this.B;
        if (!oVar.b(fB, fC) && !oVar.a(y3.q.b(j9) * (-1.0f), y3.q.c(j9) * (-1.0f), true)) {
            j9 = 0;
        }
        return new y3.q(j9);
    }

    @Override
    public final long N0(int i10, long j9, long j10) {
        if (!this.B.g(m0.c(j10), (i10 == 1 ? 1 : 0) ^ 1)) {
            return 0L;
        }
        int[] iArr = this.C;
        h00.n.A0(iArr, 0);
        int i11 = m0.i(Float.intBitsToFloat((int) (j10 >> 32)));
        int i12 = m0.i(Float.intBitsToFloat((int) (j10 & 4294967295L)));
        int i13 = m0.i(Float.intBitsToFloat((int) (j9 >> 32)));
        int i14 = m0.i(Float.intBitsToFloat((int) (j9 & 4294967295L)));
        int i15 = i10 == 1 ? 1 : 0;
        this.B.d(i13, i14, i11, i12, i15 ^ 1, null, this.C);
        return m0.e(i11, i12, iArr, j10);
    }

    @Override
    public final Object a0(long j9, long j10, k00.c cVar) {
        z4.o oVar = this.B;
        if (oVar.f(0)) {
            oVar.h(0);
        }
        if (oVar.f(1)) {
            oVar.h(1);
        }
        return new y3.q(0L);
    }

    @Override
    public final long c0(int i10, long j9) {
        if (!this.B.g(m0.c(j9), (i10 == 1 ? 1 : 0) ^ 1)) {
            return 0L;
        }
        int[] iArr = this.C;
        h00.n.A0(iArr, 0);
        int i11 = m0.i(Float.intBitsToFloat((int) (j9 >> 32)));
        int i12 = m0.i(Float.intBitsToFloat((int) (4294967295L & j9)));
        this.B.c(i11, i12, (i10 == 1 ? 1 : 0) ^ 1, this.C, null);
        return m0.e(i11, i12, iArr, j9);
    }
}
