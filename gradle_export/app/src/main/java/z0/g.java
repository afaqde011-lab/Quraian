package z0;

import a1.m;
import a1.u0;
import android.view.View;
import h1.l;
import kotlin.NoWhenBranchMatchedException;
import l1.f1;
import l1.i1;
import l1.q;
import l9.f0;
import m3.h0;
import m3.q0;
import q3.e0;
import r30.r;
import u00.k;

public final class g {

    public final e0 f16993a;

    public a f16994b;

    public final i1 f16995c;

    public final i1 f16996d;

    public final i1 f16997e;

    public final fv.d f16998f;

    public final m1.e f16999g;

    public g(String str, long j9, e0 e0Var) {
        this.f16993a = e0Var;
        this.f16994b = new a(new b(str, h0.c(str.length(), j9), null, null, null, null, 60), null, null, 14);
        Boolean bool = Boolean.FALSE;
        this.f16995c = q.z(bool);
        this.f16996d = q.z(new b(str, j9, null, null, null, null, 60));
        this.f16997e = q.z(bool);
        this.f16998f = new fv.d(this);
        this.f16999g = new m1.e(0, new m[16]);
    }

    public static final void a(g gVar, l lVar, boolean z10, c1.c cVar) {
        b bVarD = gVar.d();
        if (((m1.e) gVar.f16994b.a().B).C == 0 && q0.c(bVarD.D, gVar.f16994b.D)) {
            if (kotlin.jvm.internal.m.a(bVarD.E, gVar.f16994b.E) && kotlin.jvm.internal.m.a(bVarD.F, gVar.f16994b.G) && kotlin.jvm.internal.m.a(bVarD.A, gVar.f16994b.F)) {
                return;
            }
            b bVarD2 = gVar.d();
            String string = gVar.f16994b.B.toString();
            a aVar = gVar.f16994b;
            long j9 = aVar.D;
            q0 q0Var = aVar.E;
            gVar.i(bVarD2, new b(string, j9, q0Var, aVar.G, h.a(q0Var, aVar.F), null, 32), z10);
            return;
        }
        boolean z11 = false;
        boolean z12 = ((m1.e) gVar.f16994b.a().B).C != 0;
        String string2 = gVar.f16994b.B.toString();
        a aVar2 = gVar.f16994b;
        long j10 = aVar2.D;
        q0 q0Var2 = aVar2.E;
        b bVar = new b(string2, j10, q0Var2, aVar2.G, h.a(q0Var2, aVar2.F), null, 32);
        if (lVar == null) {
            if (z12 && z10) {
                z11 = true;
            }
            gVar.i(bVarD, bVar, z11);
            gVar.e(bVarD, bVar, gVar.f16994b.a(), cVar);
            return;
        }
        a aVar3 = new a(bVar, gVar.f16994b.a(), null, 8);
        lVar.getClass();
        if (((m1.e) aVar3.a().B).C == 1) {
            a1.q qVar = (a1.q) ((m1.e) aVar3.a().B).A[0];
            if (q0.e(h0.b(qVar.f112a, qVar.f113b)) == 1 && q0.d(aVar3.D)) {
                a1.q qVar2 = (a1.q) ((m1.e) aVar3.a().B).A[0];
                int iG = q0.g(h0.b(qVar2.f112a, qVar2.f113b));
                if (((f1) lVar.B).h() != iG) {
                    ((pi.c) lVar.A).invoke();
                    lVar.Z0(iG);
                }
            } else {
                lVar.Z0(-1);
            }
        } else {
            lVar.Z0(-1);
        }
        boolean zN0 = r.n0(aVar3.B, bVar);
        boolean z13 = !zN0;
        boolean zC = q0.c(aVar3.D, bVar.D);
        boolean z14 = !zC;
        if (zN0 && zC) {
            gVar.i(bVarD, a.g(aVar3, 0L, bVar.E, 13), z10);
        } else {
            gVar.h(aVar3, z13, z14);
        }
        gVar.e(bVarD, gVar.d(), aVar3.a(), cVar);
    }

    public final void b(a aVar) throws NoWhenBranchMatchedException {
        boolean z10 = ((m1.e) aVar.a().B).C > 0;
        boolean zC = true ^ q0.c(aVar.D, this.f16994b.D);
        if (z10) {
            e(d(), a.g(aVar, 0L, null, 15), aVar.a(), c1.c.B);
        }
        h(aVar, z10, zC);
    }

    public final void c() {
        this.f16995c.setValue(Boolean.FALSE);
        f(false);
    }

    public final b d() {
        return (b) this.f16996d.getValue();
    }

    public final void e(b bVar, b bVar2, u0 u0Var, c1.c cVar) throws NoWhenBranchMatchedException {
        int iOrdinal = cVar.ordinal();
        e0 e0Var = this.f16993a;
        if (iOrdinal == 0) {
            h.g(e0Var, bVar, bVar2, u0Var, true);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            h.g(e0Var, bVar, bVar2, u0Var, false);
        } else {
            ((i1) e0Var.C).setValue(null);
            c1.e eVar = (c1.e) e0Var.B;
            eVar.f2608b.clear();
            eVar.f2609c.clear();
        }
    }

    public final void f(boolean z10) {
        this.f16997e.setValue(Boolean.valueOf(z10));
    }

    public final a g() {
        i1 i1Var = this.f16995c;
        z1.f fVarF = z1.q.f();
        k kVarE = fVarF != null ? fVarF.e() : null;
        z1.f fVarK = z1.q.k(fVarF);
        try {
            boolean zBooleanValue = ((Boolean) i1Var.getValue()).booleanValue();
            z1.q.n(fVarF, fVarK, kVarE);
            if (zBooleanValue) {
                g0.a.c("TextFieldState does not support concurrent or nested editing.");
            }
            i1Var.setValue(Boolean.TRUE);
            return new a(d(), null, null, 14);
        } catch (Throwable th2) {
            z1.q.n(fVarF, fVarK, kVarE);
            throw th2;
        }
    }

    public final void h(a aVar, boolean z10, boolean z11) {
        b bVarG = a.g(this.f16994b, 0L, null, 15);
        if (z10) {
            this.f16994b = new a(new b(aVar.B.toString(), aVar.D, null, null, null, null, 60), null, null, 14);
        } else if (z11) {
            a aVar2 = this.f16994b;
            long j9 = aVar.D;
            int i10 = q0.f10519c;
            aVar2.f(h0.b((int) (j9 >> 32), (int) (j9 & 4294967295L)));
        }
        if (z10 || z11 || !kotlin.jvm.internal.m.a(bVarG.E, aVar.E)) {
            this.f16994b.e(null);
        }
        i(bVarG, a.g(this.f16994b, 0L, null, 15), true);
    }

    public final void i(b bVar, b bVar2, boolean z10) {
        this.f16996d.setValue(bVar2);
        m1.e eVar = this.f16999g;
        Object[] objArr = eVar.A;
        int i10 = eVar.C;
        for (int i11 = 0; i11 < i10; i11++) {
            m mVar = (m) objArr[i11];
            boolean z11 = (!z10 || r.n0(bVar.C, bVar2) || bVar.E == null) ? false : true;
            f0 f0Var = mVar.f96a;
            long j9 = bVar.D;
            q0 q0Var = bVar.E;
            long j10 = bVar2.D;
            q0 q0Var2 = bVar2.E;
            if (z11) {
                f0Var.p().restartInput((View) f0Var.B);
            } else if (!q0.c(j9, j10) || !kotlin.jvm.internal.m.a(q0Var, q0Var2)) {
                f0Var.p().updateSelection((View) f0Var.B, q0.g(j10), q0.f(j10), q0Var2 != null ? q0.g(q0Var2.f10520a) : -1, q0Var2 != null ? q0.f(q0Var2.f10520a) : -1);
            }
        }
        f(false);
    }

    public final String toString() {
        z1.f fVarF = z1.q.f();
        k kVarE = fVarF != null ? fVarF.e() : null;
        z1.f fVarK = z1.q.k(fVarF);
        try {
            return "TextFieldState(selection=" + ((Object) q0.i(d().D)) + ", text=\"" + ((Object) d().C) + "\")";
        } finally {
            z1.q.n(fVarF, fVarK, kVarE);
        }
    }
}
