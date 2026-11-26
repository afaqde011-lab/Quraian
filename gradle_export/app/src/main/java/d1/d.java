package d1;

import com.google.android.gms.internal.measurement.b5;
import h00.x;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import m3.h0;
import m3.m0;
import m3.n0;
import m3.r0;
import q0.q;

public final class d {

    public m3.h f4545a;

    public q3.h f4546b;

    public int f4547c;

    public boolean f4548d;

    public int f4549e;

    public int f4550f;

    public List f4551g;

    public b f4552h;

    public y3.c f4554j;

    public r0 f4555k;
    public ce.c l;
    public y3.m m;

    public n0 f4556n;

    public long f4559q;

    public long f4553i = a.f4533a;

    public int f4557o = -1;

    public int f4558p = -1;

    public d(m3.h hVar, r0 r0Var, q3.h hVar2, int i10, boolean z10, int i11, int i12, List list) {
        this.f4545a = hVar;
        this.f4546b = hVar2;
        this.f4547c = i10;
        this.f4548d = z10;
        this.f4549e = i11;
        this.f4550f = i12;
        this.f4551g = list;
        this.f4555k = r0Var;
    }

    public final int a(int i10, y3.m mVar) {
        int i11 = this.f4557o;
        int i12 = this.f4558p;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        long jA = y3.b.a(0, i10, 0, Integer.MAX_VALUE);
        if (this.f4550f > 1) {
            b bVar = this.f4552h;
            r0 r0Var = this.f4555k;
            y3.c cVar = this.f4554j;
            kotlin.jvm.internal.m.b(cVar);
            b bVarA = f50.c.A(bVar, mVar, r0Var, cVar, this.f4546b);
            this.f4552h = bVarA;
            jA = bVarA.a(this.f4550f, jA);
        }
        int iR = q.r(b(jA, mVar).f10514e);
        int i13 = y3.a.i(jA);
        if (iR < i13) {
            iR = i13;
        }
        this.f4557o = i10;
        this.f4558p = iR;
        return iR;
    }

    public final m3.q b(long j9, y3.m mVar) throws NoWhenBranchMatchedException {
        ce.c cVarE = e(mVar);
        long jS = b5.s(j9, this.f4548d, this.f4547c, cVarE.l());
        boolean z10 = this.f4548d;
        int i10 = this.f4547c;
        int i11 = this.f4549e;
        return new m3.q(cVarE, jS, ((z10 || !(i10 == 2 || i10 == 4 || i10 == 5)) && i11 >= 1) ? i11 : 1, i10);
    }

    public final boolean c(long j9, y3.m mVar) {
        this.f4559q = (this.f4559q << 2) | 3;
        if (this.f4550f > 1) {
            b bVar = this.f4552h;
            r0 r0Var = this.f4555k;
            y3.c cVar = this.f4554j;
            kotlin.jvm.internal.m.b(cVar);
            b bVarA = f50.c.A(bVar, mVar, r0Var, cVar, this.f4546b);
            this.f4552h = bVarA;
            j9 = bVarA.a(this.f4550f, j9);
        }
        n0 n0Var = this.f4556n;
        if (n0Var != null) {
            m3.q qVar = n0Var.f10497b;
            m0 m0Var = n0Var.f10496a;
            if (!qVar.f10510a.b()) {
                y3.m mVar2 = m0Var.f10490h;
                long j10 = m0Var.f10492j;
                if (mVar == mVar2 && (y3.a.b(j9, j10) || (y3.a.h(j9) == y3.a.h(j10) && y3.a.j(j9) == y3.a.j(j10) && y3.a.g(j9) >= qVar.f10514e && !qVar.f10512c))) {
                    n0 n0Var2 = this.f4556n;
                    kotlin.jvm.internal.m.b(n0Var2);
                    if (y3.a.b(j9, n0Var2.f10496a.f10492j)) {
                        return false;
                    }
                    n0 n0Var3 = this.f4556n;
                    kotlin.jvm.internal.m.b(n0Var3);
                    this.f4556n = f(mVar, j9, n0Var3.f10497b);
                    return true;
                }
            }
        }
        this.f4556n = f(mVar, j9, b(j9, mVar));
        return true;
    }

    public final void d(y3.c cVar) {
        long jA;
        y3.c cVar2 = this.f4554j;
        if (cVar != null) {
            int i10 = a.f4534b;
            jA = a.a(cVar.c(), cVar.t0());
        } else {
            jA = a.f4533a;
        }
        if (cVar2 == null) {
            this.f4554j = cVar;
            this.f4553i = jA;
        } else if (cVar == null || this.f4553i != jA) {
            this.f4554j = cVar;
            this.f4553i = jA;
            this.f4559q = (this.f4559q << 2) | 1;
            this.l = null;
            this.f4556n = null;
            this.f4558p = -1;
            this.f4557o = -1;
        }
    }

    public final ce.c e(y3.m mVar) throws NoWhenBranchMatchedException {
        ce.c cVar = this.l;
        if (cVar == null || mVar != this.m || cVar.b()) {
            this.m = mVar;
            m3.h hVar = this.f4545a;
            r0 r0VarJ = h0.j(this.f4555k, mVar);
            y3.c cVar2 = this.f4554j;
            kotlin.jvm.internal.m.b(cVar2);
            q3.h hVar2 = this.f4546b;
            x xVar = this.f4551g;
            if (xVar == null) {
                xVar = x.A;
            }
            cVar = new ce.c(hVar, r0VarJ, (List) xVar, cVar2, hVar2);
        }
        this.l = cVar;
        return cVar;
    }

    public final n0 f(y3.m mVar, long j9, m3.q qVar) {
        float fMin = Math.min(qVar.f10510a.l(), qVar.f10513d);
        m3.h hVar = this.f4545a;
        r0 r0Var = this.f4555k;
        x xVar = this.f4551g;
        if (xVar == null) {
            xVar = x.A;
        }
        int i10 = this.f4549e;
        boolean z10 = this.f4548d;
        int i11 = this.f4547c;
        y3.c cVar = this.f4554j;
        kotlin.jvm.internal.m.b(cVar);
        return new n0(new m0(hVar, r0Var, xVar, i10, z10, i11, cVar, mVar, this.f4546b, j9), qVar, y3.b.d(j9, (((long) q.r(fMin)) << 32) | (((long) q.r(qVar.f10514e)) & 4294967295L)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        sb2.append(this.f4556n != null ? "<TextLayoutResult>" : "null");
        sb2.append(", lastDensity=");
        sb2.append((Object) a.b(this.f4553i));
        sb2.append(", history=");
        sb2.append(this.f4559q);
        sb2.append(", constraints=");
        n0 n0Var = this.f4556n;
        sb2.append(n0Var != null ? new y3.a(n0Var.f10496a.f10492j) : "null");
        sb2.append(')');
        return sb2.toString();
    }
}
