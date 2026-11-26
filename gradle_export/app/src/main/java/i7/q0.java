package i7;

import android.util.Pair;
import androidx.media3.common.h2;
import androidx.media3.common.j2;
import androidx.media3.common.k2;
import java.util.ArrayList;

public final class q0 {

    public final j7.f f7450c;

    public final e7.d0 f7451d;

    public final ab.r f7452e;

    public long f7453f;

    public int f7454g;

    public boolean f7455h;

    public o0 f7456i;

    public o0 f7457j;

    public o0 f7458k;
    public o0 l;
    public o0 m;

    public int f7459n;

    public Object f7460o;

    public long f7461p;

    public final h2 f7448a = new h2();

    public final j2 f7449b = new j2();

    public ArrayList f7462q = new ArrayList();

    public q0(j7.f fVar, e7.d0 d0Var, ab.r rVar) {
        this.f7450c = fVar;
        this.f7451d = d0Var;
        this.f7452e = rVar;
    }

    public static s7.a0 p(k2 k2Var, Object obj, long j9, long j10, j2 j2Var, h2 h2Var) {
        k2Var.getPeriodByUid(obj, h2Var);
        k2Var.getWindow(h2Var.f1233c, j2Var);
        int indexOfPeriod = k2Var.getIndexOfPeriod(obj);
        Object obj2 = obj;
        while (true) {
            int i10 = h2Var.f1237g.f1134a;
            if (i10 == 0) {
                break;
            }
            if ((i10 == 1 && h2Var.g(0)) || !h2Var.h(h2Var.f1237g.f1137d)) {
                break;
            }
            long j11 = 0;
            if (h2Var.c(0L) != -1) {
                break;
            }
            if (h2Var.f1234d == 0) {
                if (indexOfPeriod <= j2Var.f1295o) {
                    break;
                    break;
                }
                k2Var.getPeriod(indexOfPeriod, h2Var, true);
                obj2 = h2Var.f1232b;
                obj2.getClass();
                indexOfPeriod++;
            } else {
                int i11 = i10 - (h2Var.g(i10 + (-1)) ? 2 : 1);
                for (int i12 = 0; i12 <= i11; i12++) {
                    j11 += h2Var.f1237g.a(i12).f1059j;
                }
                if (h2Var.f1234d > j11) {
                    break;
                }
                if (indexOfPeriod <= j2Var.f1295o) {
                    break;
                }
                k2Var.getPeriod(indexOfPeriod, h2Var, true);
                obj2 = h2Var.f1232b;
                obj2.getClass();
                indexOfPeriod++;
            }
        }
        k2Var.getPeriodByUid(obj2, h2Var);
        int iC = h2Var.c(j9);
        return iC == -1 ? new s7.a0(obj2, j10, h2Var.b(j9)) : new s7.a0(obj2, iC, h2Var.f(iC), j10, -1);
    }

    public final o0 a() {
        o0 o0Var = this.f7456i;
        if (o0Var == null) {
            return null;
        }
        if (o0Var == this.f7457j) {
            this.f7457j = o0Var.m;
        }
        if (o0Var == this.f7458k) {
            this.f7458k = o0Var.m;
        }
        o0Var.i();
        int i10 = this.f7459n - 1;
        this.f7459n = i10;
        if (i10 == 0) {
            this.l = null;
            o0 o0Var2 = this.f7456i;
            this.f7460o = o0Var2.f7425b;
            this.f7461p = o0Var2.f7430g.f7438a.f13647d;
        }
        this.f7456i = this.f7456i.m;
        m();
        return this.f7456i;
    }

    public final void b() {
        if (this.f7459n == 0) {
            return;
        }
        o0 o0Var = this.f7456i;
        o0Var.getClass();
        this.f7460o = o0Var.f7425b;
        this.f7461p = o0Var.f7430g.f7438a.f13647d;
        while (o0Var != null) {
            o0Var.i();
            o0Var = o0Var.m;
        }
        this.f7456i = null;
        this.l = null;
        this.f7457j = null;
        this.f7458k = null;
        this.f7459n = 0;
        m();
    }

    public final p0 c(k2 k2Var, o0 o0Var, long j9) {
        Object obj;
        long j10;
        long j11;
        long j12;
        p0 p0Var = o0Var.f7430g;
        s7.a0 a0Var = p0Var.f7438a;
        long j13 = p0Var.f7440c;
        int nextPeriodIndex = k2Var.getNextPeriodIndex(k2Var.getIndexOfPeriod(a0Var.f13644a), this.f7448a, this.f7449b, this.f7454g, this.f7455h);
        if (nextPeriodIndex == -1) {
            return null;
        }
        h2 h2Var = this.f7448a;
        int i10 = k2Var.getPeriod(nextPeriodIndex, h2Var, true).f1233c;
        Object obj2 = h2Var.f1232b;
        obj2.getClass();
        long j14 = a0Var.f13647d;
        long j15 = 0;
        if (k2Var.getWindow(i10, this.f7449b).f1294n == nextPeriodIndex) {
            Pair<Object, Long> periodPositionUs = k2Var.getPeriodPositionUs(this.f7449b, this.f7448a, i10, -9223372036854775807L, Math.max(0L, j9));
            if (periodPositionUs == null) {
                return null;
            }
            Object obj3 = periodPositionUs.first;
            long jLongValue = ((Long) periodPositionUs.second).longValue();
            o0 o0Var2 = o0Var.m;
            if (o0Var2 == null || !o0Var2.f7425b.equals(obj3)) {
                long jR = r(obj3);
                if (jR == -1) {
                    jR = this.f7453f;
                    this.f7453f = 1 + jR;
                }
                j14 = jR;
            } else {
                j14 = o0Var2.f7430g.f7438a.f13647d;
            }
            obj = obj3;
            j10 = jLongValue;
            j15 = -9223372036854775807L;
        } else {
            obj = obj2;
            j10 = 0;
        }
        s7.a0 a0VarP = p(k2Var, obj, j10, j14, this.f7449b, this.f7448a);
        if (j15 == -9223372036854775807L || j13 == -9223372036854775807L) {
            j11 = j10;
            j12 = j15;
        } else {
            int i11 = k2Var.getPeriodByUid(a0Var.f13644a, h2Var).f1237g.f1134a;
            int i12 = h2Var.f1237g.f1137d;
            boolean z10 = i11 > 0 && h2Var.h(i12) && (i11 > 1 || h2Var.d(i12) != Long.MIN_VALUE);
            if (a0VarP.b() && z10) {
                j11 = j10;
                j12 = j13;
            } else {
                if (z10) {
                    j11 = j13;
                } else {
                    j11 = j10;
                }
                j12 = j15;
            }
        }
        return e(k2Var, a0VarP, j12, j11);
    }

    public final p0 d(k2 k2Var, o0 o0Var, long j9) {
        k2 k2Var2;
        p0 p0Var = o0Var.f7430g;
        long j10 = (o0Var.f7437p + p0Var.f7442e) - j9;
        if (p0Var.f7445h) {
            return c(k2Var, o0Var, j10);
        }
        s7.a0 a0Var = p0Var.f7438a;
        Object obj = a0Var.f13644a;
        int i10 = a0Var.f13648e;
        h2 h2Var = this.f7448a;
        k2Var.getPeriodByUid(obj, h2Var);
        boolean z10 = p0Var.f7444g;
        if (!a0Var.b()) {
            if (i10 != -1 && h2Var.g(i10)) {
                return c(k2Var, o0Var, j10);
            }
            int iF = h2Var.f(i10);
            boolean z11 = h2Var.h(i10) && h2Var.e(i10, iF) == 3;
            if (iF != h2Var.f1237g.a(i10).f1051b && !z11) {
                return f(k2Var, a0Var.f13644a, a0Var.f13648e, iF, p0Var.f7442e, a0Var.f13647d, z10);
            }
            k2Var.getPeriodByUid(obj, h2Var);
            long jD = h2Var.d(i10);
            return g(k2Var, a0Var.f13644a, jD == Long.MIN_VALUE ? h2Var.f1234d : h2Var.f1237g.a(i10).f1059j + jD, p0Var.f7442e, a0Var.f13647d, false);
        }
        int i11 = a0Var.f13645b;
        int i12 = h2Var.f1237g.a(i11).f1051b;
        if (i12 == -1) {
            return null;
        }
        int iA = h2Var.f1237g.a(i11).a(a0Var.f13646c);
        if (iA < i12) {
            return f(k2Var, a0Var.f13644a, i11, iA, p0Var.f7440c, a0Var.f13647d, z10);
        }
        long jLongValue = p0Var.f7440c;
        if (jLongValue == -9223372036854775807L) {
            Pair<Object, Long> periodPositionUs = k2Var.getPeriodPositionUs(this.f7449b, h2Var, h2Var.f1233c, -9223372036854775807L, Math.max(0L, j10));
            k2Var2 = k2Var;
            if (periodPositionUs == null) {
                return null;
            }
            jLongValue = ((Long) periodPositionUs.second).longValue();
        } else {
            k2Var2 = k2Var;
        }
        int i13 = a0Var.f13645b;
        k2Var2.getPeriodByUid(obj, h2Var);
        long jD2 = h2Var.d(i13);
        return g(k2Var, a0Var.f13644a, Math.max(jD2 == Long.MIN_VALUE ? h2Var.f1234d : h2Var.f1237g.a(i13).f1059j + jD2, jLongValue), p0Var.f7440c, a0Var.f13647d, z10);
    }

    public final p0 e(k2 k2Var, s7.a0 a0Var, long j9, long j10) {
        k2Var.getPeriodByUid(a0Var.f13644a, this.f7448a);
        return a0Var.b() ? f(k2Var, a0Var.f13644a, a0Var.f13645b, a0Var.f13646c, j9, a0Var.f13647d, false) : g(k2Var, a0Var.f13644a, j10, j9, a0Var.f13647d, false);
    }

    public final p0 f(k2 k2Var, Object obj, int i10, int i11, long j9, long j10, boolean z10) {
        s7.a0 a0Var = new s7.a0(obj, i10, i11, j10, -1);
        h2 h2Var = this.f7448a;
        long jA = k2Var.getPeriodByUid(obj, h2Var).a(i10, i11);
        long jMax = i11 == h2Var.f(i10) ? h2Var.f1237g.f1135b : 0L;
        boolean zH = h2Var.h(i10);
        if (jA != -9223372036854775807L && jMax >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new p0(a0Var, jMax, j9, -9223372036854775807L, jA, z10, zH, false, false, false);
    }

    public final p0 g(k2 k2Var, Object obj, long j9, long j10, long j11, boolean z10) {
        boolean z11;
        boolean z12;
        long j12;
        long jD;
        long j13;
        long jMax;
        h2 h2Var = this.f7448a;
        k2Var.getPeriodByUid(obj, h2Var);
        int iB = h2Var.b(j9);
        int i10 = 1;
        if (iB == -1) {
            androidx.media3.common.c cVar = h2Var.f1237g;
            if (cVar.f1134a <= 0 || !h2Var.h(cVar.f1137d)) {
                z12 = false;
            } else {
                z12 = true;
            }
        } else if (h2Var.h(iB) && h2Var.d(iB) == h2Var.f1234d) {
            androidx.media3.common.a aVarA = h2Var.f1237g.a(iB);
            int i11 = aVarA.f1051b;
            if (i11 == -1) {
                z11 = true;
                break;
            }
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    z11 = false;
                    break;
                }
                int i13 = aVarA.f1055f[i12];
                if (i13 == 0 || i13 == 1) {
                    z11 = true;
                    break;
                }
                i12++;
            }
            if (z11) {
                z12 = false;
            } else {
                z12 = true;
                iB = -1;
            }
        } else {
            z12 = false;
        }
        s7.a0 a0Var = new s7.a0(obj, j11, iB);
        boolean z13 = !a0Var.b() && iB == -1;
        boolean zK = k(k2Var, a0Var);
        boolean zJ = j(k2Var, a0Var, z13);
        boolean z14 = (iB == -1 || !h2Var.h(iB) || h2Var.g(iB)) ? false : true;
        boolean z15 = iB != -1 && h2Var.g(iB) && h2Var.h(iB);
        if (iB == -1 || z15) {
            if (z12) {
                jD = h2Var.f1234d;
            } else {
                j12 = -9223372036854775807L;
            }
            if (j12 != -9223372036854775807L || j12 == Long.MIN_VALUE) {
                j13 = h2Var.f1234d;
            } else {
                j13 = j12;
            }
            if (j13 != -9223372036854775807L || j9 < j13) {
                jMax = j9;
            } else {
                if (!zJ && z12) {
                    i10 = 0;
                }
                jMax = Math.max(0L, j13 - ((long) i10));
            }
            return new p0(a0Var, jMax, j10, j12, j13, z10, z14, z13, zK, zJ);
        }
        jD = h2Var.d(iB);
        j12 = jD;
        if (j12 != -9223372036854775807L) {
            j13 = h2Var.f1234d;
        } else {
            j13 = h2Var.f1234d;
        }
        if (j13 != -9223372036854775807L) {
            jMax = j9;
        } else {
            jMax = j9;
        }
        return new p0(a0Var, jMax, j10, j12, j13, z10, z14, z13, zK, zJ);
    }

    public final o0 h() {
        return this.f7458k;
    }

    public final p0 i(k2 k2Var, p0 p0Var) {
        long jA;
        boolean z10;
        s7.a0 a0Var = p0Var.f7438a;
        boolean zB = a0Var.b();
        int i10 = a0Var.f13648e;
        boolean zH = false;
        boolean z11 = !zB && i10 == -1;
        int i11 = a0Var.f13645b;
        boolean zK = k(k2Var, a0Var);
        boolean zJ = j(k2Var, a0Var, z11);
        Object obj = a0Var.f13644a;
        h2 h2Var = this.f7448a;
        k2Var.getPeriodByUid(obj, h2Var);
        long jD = (a0Var.b() || i10 == -1) ? -9223372036854775807L : h2Var.d(i10);
        if (a0Var.b()) {
            jA = h2Var.a(i11, a0Var.f13646c);
        } else {
            jA = (jD == -9223372036854775807L || jD == Long.MIN_VALUE) ? h2Var.f1234d : jD;
        }
        if (!a0Var.b()) {
            if (i10 != -1 && h2Var.h(i10)) {
                z10 = true;
            }
            return new p0(a0Var, p0Var.f7439b, p0Var.f7440c, jD, jA, p0Var.f7443f, z10, z11, zK, zJ);
        }
        zH = h2Var.h(i11);
        z10 = zH;
        return new p0(a0Var, p0Var.f7439b, p0Var.f7440c, jD, jA, p0Var.f7443f, z10, z11, zK, zJ);
    }

    public final boolean j(k2 k2Var, s7.a0 a0Var, boolean z10) {
        int indexOfPeriod = k2Var.getIndexOfPeriod(a0Var.f13644a);
        if (k2Var.getWindow(k2Var.getPeriod(indexOfPeriod, this.f7448a).f1233c, this.f7449b).f1291i) {
            return false;
        }
        return k2Var.isLastPeriod(indexOfPeriod, this.f7448a, this.f7449b, this.f7454g, this.f7455h) && z10;
    }

    public final boolean k(k2 k2Var, s7.a0 a0Var) {
        boolean z10 = !a0Var.b() && a0Var.f13648e == -1;
        Object obj = a0Var.f13644a;
        if (z10) {
            if (k2Var.getWindow(k2Var.getPeriodByUid(obj, this.f7448a).f1233c, this.f7449b).f1295o == k2Var.getIndexOfPeriod(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void l() {
        o0 o0Var = this.m;
        if (o0Var == null || o0Var.h()) {
            this.m = null;
            for (int i10 = 0; i10 < this.f7462q.size(); i10++) {
                o0 o0Var2 = (o0) this.f7462q.get(i10);
                if (!o0Var2.h()) {
                    this.m = o0Var2;
                    return;
                }
            }
        }
    }

    public final void m() {
        fh.q0 q0VarM = fh.t0.m();
        for (o0 o0Var = this.f7456i; o0Var != null; o0Var = o0Var.m) {
            q0VarM.c(o0Var.f7430g.f7438a);
        }
        o0 o0Var2 = this.f7457j;
        this.f7451d.d(new ab.e(this, q0VarM, o0Var2 == null ? null : o0Var2.f7430g.f7438a, 8));
    }

    public final void n(long j9) {
        o0 o0Var = this.l;
        if (o0Var != null) {
            ta.c0.A(o0Var.m == null);
            if (o0Var.f7428e) {
                o0Var.f7424a.v(j9 - o0Var.f7437p);
            }
        }
    }

    public final int o(o0 o0Var) {
        o0Var.getClass();
        int i10 = 0;
        if (o0Var.equals(this.l)) {
            return 0;
        }
        this.l = o0Var;
        while (true) {
            o0Var = o0Var.m;
            if (o0Var == null) {
                break;
            }
            if (o0Var == this.f7457j) {
                o0 o0Var2 = this.f7456i;
                this.f7457j = o0Var2;
                this.f7458k = o0Var2;
                i10 = 3;
            }
            if (o0Var == this.f7458k) {
                this.f7458k = this.f7457j;
                i10 |= 2;
            }
            o0Var.i();
            this.f7459n--;
        }
        o0 o0Var3 = this.l;
        o0Var3.getClass();
        if (o0Var3.m != null) {
            o0Var3.b();
            o0Var3.m = null;
            o0Var3.c();
        }
        m();
        return i10;
    }

    public final s7.a0 q(k2 k2Var, Object obj, long j9) {
        long jR;
        int indexOfPeriod;
        Object obj2 = obj;
        h2 h2Var = this.f7448a;
        int i10 = k2Var.getPeriodByUid(obj2, h2Var).f1233c;
        Object obj3 = this.f7460o;
        if (obj3 == null || (indexOfPeriod = k2Var.getIndexOfPeriod(obj3)) == -1 || k2Var.getPeriod(indexOfPeriod, h2Var).f1233c != i10) {
            o0 o0Var = this.f7456i;
            while (true) {
                if (o0Var == null) {
                    o0 o0Var2 = this.f7456i;
                    while (true) {
                        if (o0Var2 == null) {
                            jR = r(obj2);
                            if (jR != -1) {
                                break;
                            }
                            jR = this.f7453f;
                            this.f7453f = 1 + jR;
                            if (this.f7456i != null) {
                                break;
                            }
                            this.f7460o = obj2;
                            this.f7461p = jR;
                            break;
                        }
                        int indexOfPeriod2 = k2Var.getIndexOfPeriod(o0Var2.f7425b);
                        if (indexOfPeriod2 != -1 && k2Var.getPeriod(indexOfPeriod2, h2Var).f1233c == i10) {
                            jR = o0Var2.f7430g.f7438a.f13647d;
                            break;
                        }
                        o0Var2 = o0Var2.m;
                    }
                } else {
                    if (o0Var.f7425b.equals(obj2)) {
                        jR = o0Var.f7430g.f7438a.f13647d;
                        break;
                    }
                    o0Var = o0Var.m;
                }
            }
        } else {
            jR = this.f7461p;
        }
        k2Var.getPeriodByUid(obj2, h2Var);
        int i11 = h2Var.f1233c;
        j2 j2Var = this.f7449b;
        k2Var.getWindow(i11, j2Var);
        boolean z10 = false;
        for (int indexOfPeriod3 = k2Var.getIndexOfPeriod(obj); indexOfPeriod3 >= j2Var.f1294n; indexOfPeriod3--) {
            k2Var.getPeriod(indexOfPeriod3, h2Var, true);
            boolean z11 = h2Var.f1237g.f1134a > 0;
            z10 |= z11;
            if (h2Var.c(h2Var.f1234d) != -1) {
                obj2 = h2Var.f1232b;
                obj2.getClass();
            }
            if (z10 && (!z11 || h2Var.f1234d != 0)) {
                break;
            }
        }
        return p(k2Var, obj2, j9, jR, this.f7449b, this.f7448a);
    }

    public final long r(Object obj) {
        for (int i10 = 0; i10 < this.f7462q.size(); i10++) {
            o0 o0Var = (o0) this.f7462q.get(i10);
            if (o0Var.f7425b.equals(obj)) {
                return o0Var.f7430g.f7438a.f13647d;
            }
        }
        return -1L;
    }

    public final int s(k2 k2Var) {
        k2 k2Var2;
        o0 o0Var;
        o0 o0Var2 = this.f7456i;
        if (o0Var2 == null) {
            return 0;
        }
        int indexOfPeriod = k2Var.getIndexOfPeriod(o0Var2.f7425b);
        while (true) {
            k2Var2 = k2Var;
            indexOfPeriod = k2Var2.getNextPeriodIndex(indexOfPeriod, this.f7448a, this.f7449b, this.f7454g, this.f7455h);
            while (true) {
                o0Var2.getClass();
                o0Var = o0Var2.m;
                if (o0Var == null || o0Var2.f7430g.f7445h) {
                    break;
                }
                o0Var2 = o0Var;
            }
            if (indexOfPeriod == -1 || o0Var == null || k2Var2.getIndexOfPeriod(o0Var.f7425b) != indexOfPeriod) {
                break;
            }
            o0Var2 = o0Var;
            k2Var = k2Var2;
        }
        int iO = o(o0Var2);
        o0Var2.f7430g = i(k2Var2, o0Var2.f7430g);
        return iO;
    }

    public final int t(k2 k2Var, long j9, long j10, long j11) {
        p0 p0VarI;
        boolean z10;
        o0 o0Var = this.f7456i;
        o0 o0Var2 = null;
        while (true) {
            int i10 = 0;
            if (o0Var == null) {
                return 0;
            }
            p0 p0Var = o0Var.f7430g;
            if (o0Var2 == null) {
                p0VarI = i(k2Var, p0Var);
            } else {
                p0 p0VarD = d(k2Var, o0Var2, j9);
                if (p0VarD == null || p0Var.f7439b != p0VarD.f7439b || !p0Var.f7438a.equals(p0VarD.f7438a)) {
                    return o(o0Var2);
                }
                p0VarI = p0VarD;
            }
            long j12 = p0VarI.f7442e;
            long j13 = p0Var.f7440c;
            long j14 = p0Var.f7442e;
            o0Var.f7430g = p0VarI.a(j13);
            if (j14 != j12) {
                o0Var.k();
                long j15 = j12 == -9223372036854775807L ? Long.MAX_VALUE : j12 + o0Var.f7437p;
                boolean z11 = o0Var == this.f7457j && !o0Var.f7430g.f7444g && (j10 == Long.MIN_VALUE || j10 >= j15);
                boolean z12 = o0Var == this.f7458k && (j11 == Long.MIN_VALUE || j11 >= j15);
                int iO = o(o0Var);
                if (iO != 0) {
                    return iO;
                }
                if (j14 == -9223372036854775807L && p0Var.f7441d == Long.MIN_VALUE) {
                    long j16 = p0VarI.f7441d;
                    if (j16 == -9223372036854775807L || j16 == Long.MIN_VALUE) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
                if (z11 && (j14 != -9223372036854775807L || z10)) {
                    i10 = 1;
                }
                return z12 ? i10 | 2 : i10;
            }
            o0Var2 = o0Var;
            o0Var = o0Var.m;
        }
    }
}
