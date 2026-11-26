package v7;

import android.os.SystemClock;
import androidx.media3.common.l2;
import e7.b0;
import e7.i0;
import fh.q0;
import fh.t0;
import fh.w;
import java.util.ArrayList;
import java.util.List;

public final class b extends c {

    public final w7.d f15487g;

    public final long f15488h;

    public final long f15489i;

    public final long f15490j;

    public final int f15491k;
    public final int l;
    public final float m;

    public final float f15492n;

    public final t0 f15493o;

    public final b0 f15494p;

    public float f15495q;

    public int f15496r;

    public int f15497s;

    public long f15498t;

    public t7.a f15499u;

    public b(l2 l2Var, int[] iArr, w7.d dVar, long j9, long j10, long j11, t0 t0Var) {
        super(l2Var, iArr);
        if (j11 < j9) {
            e7.a.m("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j11 = j9;
        }
        this.f15487g = dVar;
        this.f15488h = j9 * 1000;
        this.f15489i = j10 * 1000;
        this.f15490j = j11 * 1000;
        this.f15491k = 1279;
        this.l = 719;
        this.m = 0.7f;
        this.f15492n = 0.75f;
        this.f15493o = t0.o(t0Var);
        this.f15494p = b0.f5117a;
        this.f15495q = 1.0f;
        this.f15497s = 0;
        this.f15498t = -9223372036854775807L;
    }

    public static void v(ArrayList arrayList, long[] jArr) {
        long j9 = 0;
        for (long j10 : jArr) {
            j9 += j10;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            q0 q0Var = (q0) arrayList.get(i10);
            if (q0Var != null) {
                q0Var.c(new a(j9, jArr[i10]));
            }
        }
    }

    public static long x(List list) {
        if (!list.isEmpty()) {
            t7.a aVar = (t7.a) w.n(list);
            long j9 = aVar.G;
            if (j9 != -9223372036854775807L) {
                long j10 = aVar.H;
                if (j10 != -9223372036854775807L) {
                    return j10 - j9;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override
    public final void c(long j9, long j10, long j11, List list, t7.k[] kVarArr) {
        long jX;
        this.f15494p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = this.f15496r;
        if (i10 >= kVarArr.length || !kVarArr[i10].next()) {
            int length = kVarArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    jX = x(list);
                    break;
                }
                t7.k kVar = kVarArr[i11];
                if (kVar.next()) {
                    jX = kVar.b() - kVar.a();
                    break;
                }
                i11++;
            }
        } else {
            t7.k kVar2 = kVarArr[this.f15496r];
            jX = kVar2.b() - kVar2.a();
        }
        int i12 = this.f15497s;
        if (i12 == 0) {
            this.f15497s = 1;
            this.f15496r = w(jElapsedRealtime);
            return;
        }
        int i13 = this.f15496r;
        int iB = list.isEmpty() ? -1 : b(((t7.a) w.n(list)).D);
        if (iB != -1) {
            i12 = ((t7.a) w.n(list)).E;
            i13 = iB;
        }
        int iW = w(jElapsedRealtime);
        if (iW != i13 && !a(i13, jElapsedRealtime)) {
            androidx.media3.common.t[] tVarArr = this.f15503d;
            androidx.media3.common.t tVar = tVarArr[i13];
            androidx.media3.common.t tVar2 = tVarArr[iW];
            long jMin = this.f15488h;
            if (j11 != -9223372036854775807L) {
                jMin = Math.min((long) ((jX != -9223372036854775807L ? j11 - jX : j11) * this.f15492n), jMin);
            }
            int i14 = tVar2.f1592j;
            int i15 = tVar.f1592j;
            if ((i14 > i15 && j10 < jMin) || (i14 < i15 && j10 >= this.f15489i)) {
                iW = i13;
            }
        }
        if (iW != i13) {
            i12 = 3;
        }
        this.f15497s = i12;
        this.f15496r = iW;
    }

    @Override
    public final int e() {
        return this.f15496r;
    }

    @Override
    public final void i() {
        this.f15498t = -9223372036854775807L;
        this.f15499u = null;
    }

    @Override
    public final int k(long j9, List list) {
        int i10;
        int i11;
        this.f15494p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f15498t;
        if (j10 != -9223372036854775807L && jElapsedRealtime - j10 < 1000 && (list.isEmpty() || ((t7.a) w.n(list)).equals(this.f15499u))) {
            return list.size();
        }
        this.f15498t = jElapsedRealtime;
        this.f15499u = list.isEmpty() ? null : (t7.a) w.n(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jX = i0.x(this.f15495q, ((t7.a) list.get(size - 1)).G - j9);
        long j11 = this.f15490j;
        if (jX >= j11) {
            x(list);
            androidx.media3.common.t tVar = this.f15503d[w(jElapsedRealtime)];
            for (int i12 = 0; i12 < size; i12++) {
                t7.a aVar = (t7.a) list.get(i12);
                androidx.media3.common.t tVar2 = aVar.D;
                if (i0.x(this.f15495q, aVar.G - j9) >= j11 && tVar2.f1592j < tVar.f1592j && (i10 = tVar2.f1602v) != -1 && i10 <= this.l && (i11 = tVar2.f1601u) != -1 && i11 <= this.f15491k && i10 < tVar.f1602v) {
                    return i12;
                }
            }
        }
        return size;
    }

    @Override
    public final void l() {
        this.f15499u = null;
    }

    @Override
    public final int o() {
        return this.f15497s;
    }

    @Override
    public final void q(float f3) {
        this.f15495q = f3;
    }

    @Override
    public final Object r() {
        return null;
    }

    public final int w(long j9) {
        long j10;
        w7.g gVar = (w7.g) this.f15487g;
        synchronized (gVar) {
            j10 = gVar.l;
        }
        long j11 = (long) (j10 * this.m);
        this.f15487g.getClass();
        long j12 = (long) (j11 / this.f15495q);
        if (!this.f15493o.isEmpty()) {
            int i10 = 1;
            while (i10 < this.f15493o.size() - 1 && ((a) this.f15493o.get(i10)).f15485a < j12) {
                i10++;
            }
            a aVar = (a) this.f15493o.get(i10 - 1);
            a aVar2 = (a) this.f15493o.get(i10);
            long j13 = aVar.f15485a;
            float f3 = (j12 - j13) / (aVar2.f15485a - j13);
            long j14 = aVar.f15486b;
            j12 = j14 + ((long) (f3 * (aVar2.f15486b - j14)));
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f15501b; i12++) {
            if (j9 == Long.MIN_VALUE || !a(i12, j9)) {
                if (this.f15503d[i12].f1592j <= j12) {
                    return i12;
                }
                i11 = i12;
            }
        }
        return i11;
    }
}
