package v7;

import android.os.SystemClock;
import androidx.media3.common.l2;
import e7.i0;
import java.util.Arrays;
import java.util.List;
import ta.c0;

public abstract class c implements r {

    public final l2 f15500a;

    public final int f15501b;

    public final int[] f15502c;

    public final androidx.media3.common.t[] f15503d;

    public final long[] f15504e;

    public int f15505f;

    public c(l2 l2Var, int[] iArr) {
        c0.A(iArr.length > 0);
        l2Var.getClass();
        androidx.media3.common.t[] tVarArr = l2Var.f1341d;
        this.f15500a = l2Var;
        int length = iArr.length;
        this.f15501b = length;
        this.f15503d = new androidx.media3.common.t[length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f15503d[i10] = tVarArr[iArr[i10]];
        }
        Arrays.sort(this.f15503d, new b3.c0(15));
        this.f15502c = new int[this.f15501b];
        int i11 = 0;
        while (true) {
            int i12 = this.f15501b;
            if (i11 >= i12) {
                this.f15504e = new long[i12];
                return;
            }
            int[] iArr2 = this.f15502c;
            androidx.media3.common.t tVar = this.f15503d[i11];
            int i13 = 0;
            while (true) {
                if (i13 >= tVarArr.length) {
                    i13 = -1;
                    break;
                } else if (tVar == tVarArr[i13]) {
                    break;
                } else {
                    i13++;
                }
            }
            iArr2[i11] = i13;
            i11++;
        }
    }

    @Override
    public final boolean a(int i10, long j9) {
        return this.f15504e[i10] > j9;
    }

    @Override
    public final int b(androidx.media3.common.t tVar) {
        for (int i10 = 0; i10 < this.f15501b; i10++) {
            if (this.f15503d[i10] == tVar) {
                return i10;
            }
        }
        return -1;
    }

    @Override
    public final l2 d() {
        return this.f15500a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f15500a.equals(cVar.f15500a) && Arrays.equals(this.f15502c, cVar.f15502c)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void g(boolean z10) {
    }

    @Override
    public final androidx.media3.common.t h(int i10) {
        return this.f15503d[i10];
    }

    public final int hashCode() {
        if (this.f15505f == 0) {
            this.f15505f = Arrays.hashCode(this.f15502c) + (System.identityHashCode(this.f15500a) * 31);
        }
        return this.f15505f;
    }

    @Override
    public void i() {
    }

    @Override
    public final int j(int i10) {
        return this.f15502c[i10];
    }

    @Override
    public int k(long j9, List list) {
        return list.size();
    }

    @Override
    public void l() {
    }

    @Override
    public final int length() {
        return this.f15502c.length;
    }

    @Override
    public final int m() {
        return this.f15502c[e()];
    }

    @Override
    public final androidx.media3.common.t n() {
        return this.f15503d[e()];
    }

    @Override
    public final boolean p(int i10, long j9) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zA = a(i10, jElapsedRealtime);
        int i11 = 0;
        while (i11 < this.f15501b && !zA) {
            zA = (i11 == i10 || a(i11, jElapsedRealtime)) ? false : true;
            i11++;
        }
        if (!zA) {
            return false;
        }
        long[] jArr = this.f15504e;
        jArr[i10] = Math.max(jArr[i10], i0.a(jElapsedRealtime, j9));
        return true;
    }

    @Override
    public void q(float f3) {
    }

    @Override
    public final int u(int i10) {
        for (int i11 = 0; i11 < this.f15501b; i11++) {
            if (this.f15502c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }
}
