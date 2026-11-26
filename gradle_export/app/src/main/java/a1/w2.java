package a1;

import com.google.protobuf.RuntimeVersion;
import kotlin.KotlinNothingValueException;

public final class w2 {

    public final z0.g f135a;

    public h1.l f136b;

    public final r f137c;

    public final l1.w f138d;

    public final l1.i1 f139e;

    public w2(z0.g gVar, h1.l lVar, r rVar) {
        this.f135a = gVar;
        this.f136b = lVar;
        this.f137c = rVar;
        this.f138d = rVar != null ? l1.q.r(new o1(this, rVar, 2)) : null;
        x2 x2Var = x2.A;
        this.f139e = l1.q.z(new g1(x2Var, x2Var));
    }

    public static void h(w2 w2Var, CharSequence charSequence, boolean z10, int i10) {
        c1.c cVar = c1.c.B;
        boolean z11 = (i10 & 2) == 0;
        if ((i10 & 4) != 0) {
            cVar = c1.c.A;
        }
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        z0.g gVar = w2Var.f135a;
        h1.l lVar = w2Var.f136b;
        gVar.f16994b.a().w();
        z0.a aVar = gVar.f16994b;
        if (z11) {
            aVar.e(null);
        }
        long j9 = aVar.D;
        aVar.c(m3.q0.g(j9), m3.q0.f(j9), charSequence);
        int length = charSequence.length() + m3.q0.g(j9);
        z0.h.i(aVar, length, length);
        w2Var.l(aVar);
        z0.g.a(gVar, lVar, z10, cVar);
        gVar.f(true);
    }

    public static void i(w2 w2Var, String str, long j9, boolean z10, int i10) {
        c1.c cVar = c1.c.A;
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        z0.g gVar = w2Var.f135a;
        h1.l lVar = w2Var.f136b;
        gVar.f16994b.a().w();
        z0.a aVar = gVar.f16994b;
        long jE = w2Var.e(j9);
        aVar.c(m3.q0.g(jE), m3.q0.f(jE), str);
        int length = str.length() + m3.q0.g(jE);
        z0.h.i(aVar, length, length);
        w2Var.l(aVar);
        z0.g.a(gVar, lVar, z10, cVar);
        gVar.f(true);
    }

    public final void a() {
        h1.l lVar = this.f136b;
        c1.c cVar = c1.c.A;
        z0.g gVar = this.f135a;
        gVar.f16994b.a().w();
        z0.a aVar = gVar.f16994b;
        int iF = m3.q0.f(aVar.D);
        z0.h.i(aVar, iF, iF);
        z0.g.a(gVar, lVar, true, cVar);
        gVar.f(true);
    }

    public final void b(m mVar, m00.c cVar) {
        u2 u2Var;
        if (cVar instanceof u2) {
            u2Var = (u2) cVar;
            int i10 = u2Var.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                u2Var.C = i10 - Integer.MIN_VALUE;
            } else {
                u2Var = new u2(this, cVar);
            }
        } else {
            u2Var = new u2(this, cVar);
        }
        Object obj = u2Var.A;
        l00.a aVar = l00.a.A;
        int i11 = u2Var.C;
        if (i11 == 0) {
            ri.t1.O(obj);
            u2Var.C = 1;
            a40.k kVar = new a40.k(1, qd.s0.j0(u2Var));
            kVar.r();
            this.f135a.f16999g.b(mVar);
            kVar.u(new v2(this, mVar, 0));
            if (kVar.q() == aVar) {
                return;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(obj);
        }
        throw new KotlinNothingValueException();
    }

    public final void c() {
        h1.l lVar = this.f136b;
        c1.c cVar = c1.c.B;
        z0.g gVar = this.f135a;
        gVar.f16994b.a().w();
        z0.a aVar = gVar.f16994b;
        aVar.c(m3.q0.g(aVar.D), m3.q0.f(aVar.D), RuntimeVersion.SUFFIX);
        int iG = m3.q0.g(aVar.D);
        z0.h.i(aVar, iG, iG);
        l(aVar);
        z0.g.a(gVar, lVar, true, cVar);
        gVar.f(true);
    }

    public final z0.b d() {
        t2 t2Var;
        l1.w wVar = this.f138d;
        return (wVar == null || (t2Var = (t2) wVar.getValue()) == null) ? this.f135a.d() : t2Var.f132a;
    }

    public final long e(long j9) {
        t2 t2Var;
        l1.w wVar = this.f138d;
        c1 c1Var = (wVar == null || (t2Var = (t2) wVar.getValue()) == null) ? null : t2Var.f133b;
        if (c1Var == null) {
            return j9;
        }
        int i10 = m3.q0.f10519c;
        long jA = c1Var.a((int) (j9 >> 32), false);
        long jA2 = m3.q0.d(j9) ? jA : c1Var.a((int) (4294967295L & j9), false);
        int iMin = Math.min(m3.q0.g(jA), m3.q0.g(jA2));
        int iMax = Math.max(m3.q0.f(jA), m3.q0.f(jA2));
        return m3.q0.h(j9) ? m3.h0.b(iMax, iMin) : m3.h0.b(iMin, iMax);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj;
        return kotlin.jvm.internal.m.a(this.f135a, w2Var.f135a) && kotlin.jvm.internal.m.a(this.f137c, w2Var.f137c);
    }

    public final long f(long j9) {
        t2 t2Var;
        l1.w wVar = this.f138d;
        c1 c1Var = (wVar == null || (t2Var = (t2) wVar.getValue()) == null) ? null : t2Var.f133b;
        return c1Var != null ? i1.b(j9, c1Var, (g1) this.f139e.getValue()) : j9;
    }

    public final void g(CharSequence charSequence) {
        h1.l lVar = this.f136b;
        c1.c cVar = c1.c.A;
        z0.g gVar = this.f135a;
        gVar.f16994b.a().w();
        z0.a aVar = gVar.f16994b;
        aVar.c(0, aVar.B.length(), RuntimeVersion.SUFFIX);
        aVar.append(charSequence.toString());
        l(aVar);
        z0.g.a(gVar, lVar, true, cVar);
        gVar.f(true);
    }

    public final int hashCode() {
        int iHashCode = this.f135a.hashCode() * 31;
        r rVar = this.f137c;
        return (iHashCode + (rVar != null ? rVar.hashCode() : 0)) * 31;
    }

    public final void j(long j9) {
        k(e(j9));
    }

    public final void k(long j9) {
        h1.l lVar = this.f136b;
        c1.c cVar = c1.c.A;
        z0.g gVar = this.f135a;
        gVar.f16994b.a().w();
        z0.a aVar = gVar.f16994b;
        int i10 = m3.q0.f10519c;
        z0.h.i(aVar, (int) (j9 >> 32), (int) (j9 & 4294967295L));
        z0.g.a(gVar, lVar, true, cVar);
        gVar.f(true);
    }

    public final void l(z0.a aVar) {
        if (((m1.e) aVar.a().B).C <= 0 || !m3.q0.d(aVar.D)) {
            return;
        }
        x2 x2Var = x2.A;
        this.f139e.setValue(new g1(x2Var, x2Var));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransformedTextFieldState(textFieldState=");
        z0.g gVar = this.f135a;
        sb2.append(gVar);
        sb2.append(", outputTransformation=null, outputTransformedText=null, codepointTransformation=");
        sb2.append(this.f137c);
        sb2.append(", codepointTransformedText=");
        sb2.append(this.f138d);
        sb2.append(", outputText=\"");
        sb2.append((Object) gVar.d());
        sb2.append("\", visualText=\"");
        sb2.append((Object) d());
        sb2.append("\")");
        return sb2.toString();
    }
}
