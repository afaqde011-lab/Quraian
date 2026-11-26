package l0;

import android.os.Trace;
import b3.n2;
import b3.o2;
import java.util.List;
import z2.s1;
import z2.t1;
import z2.v1;

public final class j1 implements u0 {

    public final int f9758a;

    public final k9.x0 f9759b;

    public final u00.k f9760c;

    public y3.a f9761d;

    public t1 f9762e;

    public s1 f9763f;

    public boolean f9764g;

    public boolean f9765h;

    public boolean f9766i;

    public Object f9767j;

    public boolean f9768k;
    public i1 l;
    public boolean m;

    public long f9769n;

    public long f9770o;

    public long f9771p = s30.f.a();

    public boolean f9772q;

    public final c7.c f9773r;

    public j1(c7.c cVar, int i10, k9.x0 x0Var, u00.k kVar) {
        this.f9773r = cVar;
        this.f9758a = i10;
        this.f9759b = x0Var;
        this.f9760c = kVar;
    }

    @Override
    public final void a() {
        this.m = true;
    }

    public final void b() {
        s1 s1Var = this.f9763f;
        if (s1Var != null) {
            s1Var.cancel();
        }
        this.f9763f = null;
        t1 t1Var = this.f9762e;
        if (t1Var != null) {
            t1Var.dispose();
        }
        this.f9762e = null;
        this.l = null;
    }

    public final boolean c(k.l0 l0Var) {
        boolean zD;
        if (!this.f9773r.A) {
            return false;
        }
        if (this.m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zD = d(l0Var);
                Trace.endSection();
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } else {
            zD = d(l0Var);
        }
        Trace.setCounter("compose:lazy:prefetch:execute:item", -1L);
        return zD;
    }

    @Override
    public final void cancel() {
        if (this.f9765h) {
            return;
        }
        this.f9765h = true;
        b();
    }

    public final boolean d(k.l0 l0Var) {
        ?? r12;
        h00.x xVar;
        int i10 = this.f9758a;
        long j9 = i10;
        Trace.setCounter("compose:lazy:prefetch:execute:item", j9);
        j0 j0Var = (j0) ((i0) this.f9773r.B).f9749b.invoke();
        if (!this.f9765h) {
            int iA = j0Var.a();
            if (i10 >= 0 && i10 < iA) {
                Object objB = j0Var.b(i10);
                Object obj = this.f9767j;
                if (obj != null && !objB.equals(obj)) {
                    b();
                    return false;
                }
                Object objC = j0Var.c(i10);
                k9.x0 x0Var = this.f9759b;
                b bVar = (b) x0Var.D;
                if (x0Var.C != objC || bVar == null) {
                    u.i0 i0Var = (u.i0) x0Var.B;
                    Object objG = i0Var.g(objC);
                    Object obj2 = objG;
                    if (objG == null) {
                        b bVar2 = new b();
                        bVar2.f9720e = -1;
                        i0Var.m(objC, bVar2);
                        obj2 = bVar2;
                    }
                    bVar = (b) obj2;
                    x0Var.C = objC;
                    x0Var.D = bVar;
                }
                e();
                long jA = l0Var.a();
                this.f9769n = jA;
                this.f9771p = s30.f.a();
                this.f9770o = 0L;
                Trace.setCounter("compose:lazy:prefetch:available_time_nanos", jA);
                if (!e()) {
                    if (g(this.f9769n, bVar.f9716a + bVar.f9717b)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            f(objB, objC, bVar);
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                    if (!e()) {
                        return true;
                    }
                }
                if (this.f9763f != null) {
                    if (!g(this.f9769n, bVar.f9718c)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        s1 s1Var = this.f9763f;
                        if (s1Var == null) {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                        this.f9762e = s1Var.apply();
                        this.f9763f = null;
                        this.f9766i = true;
                        Trace.endSection();
                        h();
                        bVar.f9718c = b.a(this.f9770o, bVar.f9718c);
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
                if (!this.f9768k) {
                    if (this.f9769n <= r13) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        t1 t1Var = this.f9762e;
                        if (t1Var == 0) {
                            throw g4.c.o("Should precompose before resolving nested prefetch states");
                        }
                        final kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
                        final int i11 = 0;
                        t1Var.c(new u00.k() {
                            public final Object invoke(Object obj3) {
                                switch (i11) {
                                    case 0:
                                        o2 o2Var = (o2) obj3;
                                        kotlin.jvm.internal.m.c(o2Var, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                                        v0 v0Var = ((q1) o2Var).O;
                                        kotlin.jvm.internal.z zVar2 = zVar;
                                        List listW = (List) zVar2.A;
                                        if (listW != null) {
                                            listW.add(v0Var);
                                        } else {
                                            listW = va.a.W(v0Var);
                                        }
                                        zVar2.A = listW;
                                        return n2.B;
                                    default:
                                        q40.l lVar = (q40.l) obj3;
                                        kotlin.jvm.internal.m.e(lVar, "it");
                                        zVar.A = lVar;
                                        return g00.b0.a;
                                }
                            }
                        });
                        List list = (List) zVar.A;
                        this.l = list != null ? new i1(this, list) : null;
                        this.f9768k = true;
                        Trace.endSection();
                    } catch (Throwable th4) {
                        Trace.endSection();
                        throw th4;
                    }
                }
                i1 i1Var = this.l;
                if (i1Var != null) {
                    int i12 = bVar.f9720e;
                    boolean z10 = this.m;
                    List[] listArr = i1Var.f9752b;
                    int i13 = i1Var.f9753c;
                    List list2 = i1Var.f9751a;
                    if (i13 < list2.size()) {
                        if (i1Var.f9756f.f9765h) {
                            g0.a.c("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list2.size();
                            for (int i14 = 0; i14 < size; i14++) {
                                ((v0) list2.get(i14)).f9801d = i12;
                            }
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (i1Var.f9753c < list2.size()) {
                                try {
                                    if (listArr[i1Var.f9753c] == 0) {
                                        if (l0Var.a() <= r13) {
                                            Trace.endSection();
                                            return true;
                                        }
                                        int i15 = i1Var.f9753c;
                                        v0 v0Var = (v0) list2.get(i15);
                                        u00.k kVar = v0Var.f9798a;
                                        if (kVar == null) {
                                            xVar = h00.x.A;
                                        } else {
                                            t0 t0Var = new t0(v0Var, v0Var.f9801d);
                                            kVar.invoke(t0Var);
                                            h00.x xVar2 = t0Var.f9796b;
                                            v0Var.f9803f = xVar2.size();
                                            xVar = xVar2;
                                        }
                                        listArr[i15] = xVar;
                                    }
                                    androidx.glance.appwidget.protobuf.i0 i0Var2 = listArr[i1Var.f9753c];
                                    kotlin.jvm.internal.m.b(i0Var2);
                                    while (i1Var.f9754d < i0Var2.size()) {
                                        j1 j1Var = (j1) i0Var2.get(i1Var.f9754d);
                                        if (z10) {
                                            j1 j1Var2 = j1Var != null ? j1Var : null;
                                            if (j1Var2 != null) {
                                                r12 = 1;
                                                j1Var2.m = true;
                                            } else {
                                                r12 = 1;
                                            }
                                        } else {
                                            r12 = 1;
                                        }
                                        i1Var.f9755e = r12;
                                        if (j1Var.c(l0Var)) {
                                            Trace.endSection();
                                            return r12;
                                        }
                                        i1Var.f9754d += r12;
                                    }
                                    i1Var.f9754d = 0;
                                    i1Var.f9753c++;
                                } catch (Throwable th5) {
                                    Trace.endSection();
                                    throw th5;
                                }
                            }
                            Trace.endSection();
                        } catch (Throwable th6) {
                            Trace.endSection();
                            throw th6;
                        }
                    }
                }
                i1 i1Var2 = this.l;
                if (i1Var2 != null && i1Var2.f9755e) {
                    h();
                    Trace.setCounter("compose:lazy:prefetch:execute:item", j9);
                    i1 i1Var3 = this.l;
                    if (i1Var3 != null) {
                        i1Var3.f9755e = false;
                    }
                }
                y3.a aVar = this.f9761d;
                if (!this.f9764g && aVar != null) {
                    if (!g(this.f9769n, bVar.f9719d)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        long j10 = aVar.f16587a;
                        if (this.f9765h) {
                            g0.a.a("Callers should check whether the request is still valid before calling performMeasure()");
                        }
                        if (this.f9764g) {
                            g0.a.a("Request was already measured!");
                        }
                        this.f9764g = true;
                        t1 t1Var2 = this.f9762e;
                        if (t1Var2 == null) {
                            throw g4.c.o("performComposition() must be called before performMeasure()");
                        }
                        int iA2 = t1Var2.a();
                        for (int i16 = 0; i16 < iA2; i16++) {
                            t1Var2.d(i16, j10);
                        }
                        Trace.endSection();
                        h();
                        bVar.f9719d = b.a(this.f9770o, bVar.f9719d);
                        u00.k kVar2 = this.f9760c;
                        if (kVar2 != null) {
                            kVar2.invoke(this);
                        }
                    } catch (Throwable th7) {
                        Trace.endSection();
                        throw th7;
                    }
                }
                i1 i1Var4 = this.l;
                if (this.f9764g && this.f9768k && i1Var4 != null) {
                    List list3 = i1Var4.f9751a;
                    int size2 = list3.size();
                    int iMin = Integer.MAX_VALUE;
                    for (int i17 = 0; i17 < size2; i17++) {
                        iMin = Math.min(iMin, ((v0) list3.get(i17)).f9802e);
                    }
                    if (iMin == Integer.MAX_VALUE) {
                        iMin = 0;
                    }
                    int i18 = bVar.f9720e;
                    bVar.f9720e = i18 == -1 ? iMin : ((i18 * 3) + iMin) / 4;
                    int size3 = list3.size();
                    int iMin2 = Integer.MAX_VALUE;
                    for (int i19 = 0; i19 < size3; i19++) {
                        iMin2 = Math.min(iMin2, ((v0) list3.get(i19)).f9803f);
                    }
                    if (iMin2 == Integer.MAX_VALUE) {
                        iMin2 = 0;
                    }
                    if (iMin2 < iMin) {
                        bVar.f9719d = 0L;
                    }
                }
                return false;
            }
        }
        b();
        return false;
    }

    public final boolean e() {
        s1 s1Var;
        return this.f9766i || ((s1Var = this.f9763f) != null && s1Var.g());
    }

    public final void f(Object obj, Object obj2, b bVar) {
        s10.w0 e0Var;
        s10.w0 w0Var = this.f9763f;
        if (w0Var == null) {
            c7.c cVar = this.f9773r;
            u00.n nVarA = ((i0) cVar.B).a(this.f9758a, obj, obj2);
            z2.q0 q0VarA = ((v1) cVar.C).a();
            if (q0VarA.A.J()) {
                q0VarA.l(obj, nVarA, true);
                e0Var = new q3.e0(q0VarA, obj, 23);
            } else {
                e0Var = new s10.w0(q0VarA, obj, 19);
            }
            w0Var = e0Var;
            this.f9763f = w0Var;
            this.f9767j = obj;
        }
        this.f9772q = false;
        while (!w0Var.g() && !this.f9772q) {
            w0Var.b(new ak.a(this, bVar, 23));
        }
        h();
        if (this.f9772q) {
            bVar.f9717b = b.a(this.f9770o, bVar.f9717b);
        } else {
            bVar.f9716a = b.a(this.f9770o, bVar.f9716a);
        }
    }

    public final boolean g(long j9, long j10) {
        if (this.m) {
            j10 = 0;
        }
        return j9 > j10;
    }

    public final void h() {
        long jL;
        long jA = s30.f.a();
        long j9 = this.f9771p;
        s30.d dVar = s30.d.B;
        kotlin.jvm.internal.m.e(dVar, "unit");
        long j10 = Long.MAX_VALUE;
        if (((j9 - 1) | 1) != Long.MAX_VALUE) {
            jL = (1 | (jA - 1)) == Long.MAX_VALUE ? f50.c.L(jA) : f50.c.U(jA, j9, dVar);
        } else if (jA == j9) {
            s30.a aVar = s30.b.B;
            jL = 0;
        } else {
            jL = s30.b.k(f50.c.L(j9));
        }
        long j11 = jL >> 1;
        s30.a aVar2 = s30.b.B;
        if ((((int) jL) & 1) == 0) {
            j10 = j11;
        } else if (j11 <= 9223372036854L) {
            j10 = j11 < -9223372036854L ? Long.MIN_VALUE : j11 * ((long) 1000000);
        }
        this.f9770o = j10;
        long j12 = this.f9769n - j10;
        this.f9769n = j12;
        this.f9771p = jA;
        Trace.setCounter("compose:lazy:prefetch:available_time_nanos", j12);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HandleAndRequestImpl { index = ");
        sb2.append(this.f9758a);
        sb2.append(", constraints = ");
        sb2.append(this.f9761d);
        sb2.append(", isComposed = ");
        sb2.append(e());
        sb2.append(", isMeasured = ");
        sb2.append(this.f9764g);
        sb2.append(", isCanceled = ");
        return g4.c.l(sb2, this.f9765h, " }");
    }
}
