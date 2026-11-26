package d40;

import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

public class d1 extends e40.a implements w0, i, e40.m {
    public final int E;
    public final int F;
    public final c40.a G;
    public Object[] H;
    public long I;
    public long J;
    public int K;
    public int L;

    public d1(int i, int i2, c40.a aVar) {
        this.E = i;
        this.F = i2;
        this.G = aVar;
    }

    public static void k(d40.d1 r8, d40.j r9, k00.c r10) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: d40.d1.k(d40.d1, d40.j, k00.c):void");
    }

    @Override
    public final void a() throws Throwable {
        d1 d1Var;
        synchronized (this) {
            try {
                d1Var = this;
                try {
                    d1Var.t(o() + ((long) this.K), this.J, o() + ((long) this.K), o() + ((long) this.K) + ((long) this.L));
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                d1Var = this;
            }
        }
    }

    @Override
    public final i b(k00.i iVar, int i, c40.a aVar) {
        return o.w(this, iVar, i, aVar);
    }

    @Override
    public final Object collect(j jVar, k00.c cVar) throws Throwable {
        k(this, jVar, cVar);
        return l00.a.A;
    }

    @Override
    public final e40.c d() {
        e1 e1Var = new e1();
        e1Var.a = -1L;
        return e1Var;
    }

    @Override
    public final e40.c[] e() {
        return new e1[2];
    }

    @Override
    public final Object emit(Object obj, k00.c cVar) throws Throwable {
        d1 d1Var;
        Throwable th;
        k00.c[] cVarArrN;
        b1 b1Var;
        if (f(obj)) {
            return g00.b0.a;
        }
        a40.k kVar = new a40.k(1, qd.s0.j0(cVar));
        kVar.r();
        k00.c[] cVarArrN2 = e40.b.a;
        synchronized (this) {
            try {
                if (q(obj)) {
                    try {
                        kVar.resumeWith(g00.b0.a);
                        cVarArrN = n(cVarArrN2);
                        b1Var = null;
                        d1Var = this;
                    } catch (Throwable th2) {
                        th = th2;
                        d1Var = this;
                        throw th;
                    }
                } else {
                    try {
                        d1Var = this;
                        try {
                            b1 b1Var2 = new b1(d1Var, o() + ((long) (this.K + this.L)), obj, kVar);
                            d1Var.m(b1Var2);
                            d1Var.L++;
                            if (d1Var.F == 0) {
                                cVarArrN2 = d1Var.n(cVarArrN2);
                            }
                            cVarArrN = cVarArrN2;
                            b1Var = b1Var2;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        d1Var = this;
                        th = th4;
                        throw th;
                    }
                }
                if (b1Var != null) {
                    kVar.v(new a40.h(b1Var, 2));
                }
                for (k00.c cVar2 : cVarArrN) {
                    if (cVar2 != null) {
                        cVar2.resumeWith(g00.b0.a);
                    }
                }
                Object objQ = kVar.q();
                l00.a aVar = l00.a.A;
                if (objQ != aVar) {
                    objQ = g00.b0.a;
                }
                return objQ == aVar ? objQ : g00.b0.a;
            } catch (Throwable th5) {
                th = th5;
                d1Var = this;
            }
        }
    }

    @Override
    public final boolean f(Object obj) {
        int i;
        boolean z;
        k00.c[] cVarArrN = e40.b.a;
        synchronized (this) {
            if (q(obj)) {
                cVarArrN = n(cVarArrN);
                z = true;
            } else {
                z = false;
            }
        }
        for (k00.c cVar : cVarArrN) {
            if (cVar != null) {
                cVar.resumeWith(g00.b0.a);
            }
        }
        return z;
    }

    public final Object i(e1 e1Var, c1 c1Var) {
        a40.k kVar = new a40.k(1, qd.s0.j0(c1Var));
        kVar.r();
        synchronized (this) {
            try {
                if (r(e1Var) < 0) {
                    e1Var.b = kVar;
                } else {
                    kVar.resumeWith(g00.b0.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object objQ = kVar.q();
        return objQ == l00.a.A ? objQ : g00.b0.a;
    }

    public final void j() {
        if (this.F != 0 || this.L > 1) {
            Object[] objArr = this.H;
            kotlin.jvm.internal.m.b(objArr);
            while (this.L > 0) {
                long jO = o();
                int i = this.K;
                int i2 = this.L;
                if (objArr[((int) ((jO + ((long) (i + i2))) - 1)) & (objArr.length - 1)] != o.c) {
                    return;
                }
                this.L = i2 - 1;
                o.f(objArr, o() + ((long) (this.K + this.L)), null);
            }
        }
    }

    public final void l() {
        e40.c[] cVarArr;
        Object[] objArr = this.H;
        kotlin.jvm.internal.m.b(objArr);
        o.f(objArr, o(), null);
        this.K--;
        long jO = o() + 1;
        if (this.I < jO) {
            this.I = jO;
        }
        if (this.J < jO) {
            if (this.B != 0 && (cVarArr = this.A) != null) {
                for (e40.c cVar : cVarArr) {
                    if (cVar != null) {
                        e1 e1Var = (e1) cVar;
                        long j = e1Var.a;
                        if (j >= 0 && j < jO) {
                            e1Var.a = jO;
                        }
                    }
                }
            }
            this.J = jO;
        }
    }

    public final void m(Object obj) {
        int i = this.K + this.L;
        Object[] objArrP = this.H;
        if (objArrP == null) {
            objArrP = p(null, 0, 2);
        } else if (i >= objArrP.length) {
            objArrP = p(objArrP, i, objArrP.length * 2);
        }
        o.f(objArrP, o() + ((long) i), obj);
    }

    public final k00.c[] n(k00.c[] cVarArr) {
        e40.c[] cVarArr2;
        e1 e1Var;
        a40.k kVar;
        int length = cVarArr.length;
        if (this.B != 0 && (cVarArr2 = this.A) != null) {
            int length2 = cVarArr2.length;
            int i = 0;
            cVarArr = cVarArr;
            while (i < length2) {
                e40.c cVar = cVarArr2[i];
                if (cVar != null && (kVar = (e1Var = (e1) cVar).b) != null && r(e1Var) >= 0) {
                    int length3 = cVarArr.length;
                    cVarArr = cVarArr;
                    if (length >= length3) {
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) cVarArr, Math.max(2, cVarArr.length * 2));
                        kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
                        cVarArr = objArrCopyOf;
                    }
                    ((k00.c[]) cVarArr)[length] = kVar;
                    e1Var.b = null;
                    length++;
                }
                i++;
                cVarArr = cVarArr;
            }
        }
        return (k00.c[]) cVarArr;
    }

    public final long o() {
        return Math.min(this.J, this.I);
    }

    public final Object[] p(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.H = objArr2;
        if (objArr != null) {
            long jO = o();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + jO;
                o.f(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean q(Object obj) {
        int i;
        long jO;
        long j;
        int i2 = this.B;
        int i3 = this.E;
        if (i2 != 0) {
            int i4 = this.K;
            int i5 = this.F;
            if (i4 < i5 || this.J > this.I) {
                m(obj);
                i = this.K + 1;
                this.K = i;
                if (i > i5) {
                    l();
                }
                jO = o() + ((long) this.K);
                j = this.I;
                if (((int) (jO - j)) > i3) {
                    t(1 + j, this.J, o() + ((long) this.K), o() + ((long) this.K) + ((long) this.L));
                }
            } else {
                int iOrdinal = this.G.ordinal();
                if (iOrdinal == 0) {
                    return false;
                }
                if (iOrdinal == 1) {
                    m(obj);
                    i = this.K + 1;
                    this.K = i;
                    if (i > i5) {
                        l();
                    }
                    jO = o() + ((long) this.K);
                    j = this.I;
                    if (((int) (jO - j)) > i3) {
                        t(1 + j, this.J, o() + ((long) this.K), o() + ((long) this.K) + ((long) this.L));
                    }
                } else if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else if (i3 != 0) {
            m(obj);
            int i6 = this.K + 1;
            this.K = i6;
            if (i6 > i3) {
                l();
            }
            this.J = o() + ((long) this.K);
            return true;
        }
        return true;
    }

    public final long r(e1 e1Var) {
        long j = e1Var.a;
        if (j >= o() + ((long) this.K) && (this.F > 0 || j > o() || this.L == 0)) {
            return -1L;
        }
        return j;
    }

    public final Object s(e1 e1Var) {
        Object obj;
        k00.c[] cVarArrU = e40.b.a;
        synchronized (this) {
            try {
                long jR = r(e1Var);
                if (jR < 0) {
                    obj = o.c;
                } else {
                    long j = e1Var.a;
                    Object[] objArr = this.H;
                    kotlin.jvm.internal.m.b(objArr);
                    Object obj2 = objArr[((int) jR) & (objArr.length - 1)];
                    if (obj2 instanceof b1) {
                        obj2 = ((b1) obj2).C;
                    }
                    e1Var.a = jR + 1;
                    Object obj3 = obj2;
                    cVarArrU = u(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (k00.c cVar : cVarArrU) {
            if (cVar != null) {
                cVar.resumeWith(g00.b0.a);
            }
        }
        return obj;
    }

    public final void t(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jO = o(); jO < jMin; jO++) {
            Object[] objArr = this.H;
            kotlin.jvm.internal.m.b(objArr);
            o.f(objArr, jO, null);
        }
        this.I = j;
        this.J = j2;
        this.K = (int) (j3 - jMin);
        this.L = (int) (j4 - j3);
    }

    public final k00.c[] u(long j) {
        long j2;
        long j3;
        k00.c[] cVarArr;
        k00.c[] cVarArr2;
        e40.c[] cVarArr3;
        eh.l lVar = o.c;
        k00.c[] cVarArr4 = e40.b.a;
        if (j <= this.J) {
            long jO = o();
            long j4 = ((long) this.K) + jO;
            int i = this.F;
            if (i == 0 && this.L > 0) {
                j4++;
            }
            int i2 = 0;
            if (this.B != 0 && (cVarArr3 = this.A) != null) {
                for (e40.c cVar : cVarArr3) {
                    if (cVar != null) {
                        long j5 = ((e1) cVar).a;
                        if (j5 >= 0 && j5 < j4) {
                            j4 = j5;
                        }
                    }
                }
            }
            if (j4 > this.J) {
                long jO2 = o() + ((long) this.K);
                int iMin = this.B > 0 ? Math.min(this.L, i - ((int) (jO2 - j4))) : this.L;
                long j6 = ((long) this.L) + jO2;
                if (iMin > 0) {
                    j3 = 1;
                    Object[] objArr = this.H;
                    kotlin.jvm.internal.m.b(objArr);
                    k00.c[] cVarArr5 = new k00.c[iMin];
                    long j7 = jO2;
                    while (true) {
                        if (jO2 >= j6) {
                            cVarArr2 = cVarArr5;
                            j2 = j4;
                            break;
                        }
                        cVarArr2 = cVarArr5;
                        Object obj = objArr[(objArr.length - 1) & ((int) jO2)];
                        if (obj != lVar) {
                            kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            b1 b1Var = (b1) obj;
                            int i3 = i2 + 1;
                            j2 = j4;
                            cVarArr2[i2] = b1Var.D;
                            o.f(objArr, jO2, lVar);
                            o.f(objArr, j7, b1Var.C);
                            j7++;
                            if (i3 >= iMin) {
                                break;
                            }
                            i2 = i3;
                        } else {
                            j2 = j4;
                        }
                        jO2++;
                        cVarArr5 = cVarArr2;
                        j4 = j2;
                    }
                    jO2 = j7;
                    cVarArr = cVarArr2;
                } else {
                    j2 = j4;
                    j3 = 1;
                    cVarArr = cVarArr4;
                }
                int i4 = (int) (jO2 - jO);
                long j8 = this.B == 0 ? jO2 : j2;
                long jMax = Math.max(this.I, jO2 - ((long) Math.min(this.E, i4)));
                if (i == 0 && jMax < j6) {
                    Object[] objArr2 = this.H;
                    kotlin.jvm.internal.m.b(objArr2);
                    if (kotlin.jvm.internal.m.a(objArr2[((int) jMax) & (objArr2.length - 1)], lVar)) {
                        jO2 += j3;
                        jMax += j3;
                    }
                }
                t(jMax, j8, jO2, j6);
                j();
                return cVarArr.length == 0 ? cVarArr : n(cVarArr);
            }
        }
        return cVarArr4;
    }
}
