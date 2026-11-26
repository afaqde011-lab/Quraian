package d1;

import com.google.android.gms.internal.measurement.b5;
import h00.x;
import kotlin.NoWhenBranchMatchedException;
import m3.h0;
import m3.r0;
import m3.u;
import q0.q;

public final class e {

    public String f4560a;

    public r0 f4561b;

    public q3.h f4562c;

    public int f4563d;

    public boolean f4564e;

    public int f4565f;

    public int f4566g;

    public y3.c f4568i;

    public m3.b f4569j;

    public boolean f4570k;
    public long l;
    public b m;

    public u f4571n;

    public y3.m f4572o;

    public long f4576s;

    public long f4567h = a.f4533a;

    public long f4573p = y3.b.h(0, 0, 0, 0);

    public int f4574q = -1;

    public int f4575r = -1;

    public e(String str, r0 r0Var, q3.h hVar, int i10, boolean z10, int i11, int i12) {
        this.f4560a = str;
        this.f4561b = r0Var;
        this.f4562c = hVar;
        this.f4563d = i10;
        this.f4564e = z10;
        this.f4565f = i11;
        this.f4566g = i12;
        long j9 = 0;
        this.l = (j9 & 4294967295L) | (j9 << 32);
    }

    public static long g(e eVar, long j9, y3.m mVar) {
        r0 r0Var = eVar.f4561b;
        b bVar = eVar.m;
        y3.c cVar = eVar.f4568i;
        kotlin.jvm.internal.m.b(cVar);
        b bVarA = f50.c.A(bVar, mVar, r0Var, cVar, eVar.f4562c);
        eVar.m = bVarA;
        return bVarA.a(eVar.f4566g, j9);
    }

    public final int a(int i10, y3.m mVar) throws NoWhenBranchMatchedException {
        int i11 = this.f4574q;
        int i12 = this.f4575r;
        if (i10 == i11 && i11 != -1) {
            return i12;
        }
        long jA = y3.b.a(0, i10, 0, Integer.MAX_VALUE);
        if (this.f4566g > 1) {
            jA = g(this, jA, mVar);
        }
        u uVarE = e(mVar);
        long jS = b5.s(jA, this.f4564e, this.f4563d, uVarE.l());
        boolean z10 = this.f4564e;
        int i13 = this.f4563d;
        int i14 = this.f4565f;
        int iR = q.r(new m3.b((u3.c) uVarE, ((z10 || !(i13 == 2 || i13 == 4 || i13 == 5)) && i14 >= 1) ? i14 : 1, i13, jS).b());
        int i15 = y3.a.i(jA);
        if (iR < i15) {
            iR = i15;
        }
        this.f4574q = i10;
        this.f4575r = iR;
        return iR;
    }

    public final boolean b(long j9, y3.m mVar) throws NoWhenBranchMatchedException {
        u uVar;
        this.f4576s = (this.f4576s << 2) | 3;
        boolean z10 = true;
        long jG = this.f4566g > 1 ? g(this, j9, mVar) : j9;
        m3.b bVar = this.f4569j;
        boolean z11 = false;
        if (bVar != null && (uVar = this.f4571n) != null && !uVar.b() && mVar == this.f4572o && (y3.a.b(jG, this.f4573p) || (y3.a.h(jG) == y3.a.h(this.f4573p) && y3.a.j(jG) == y3.a.j(this.f4573p) && y3.a.g(jG) >= bVar.b() && !bVar.f10416d.f11041d))) {
            if (!y3.a.b(jG, this.f4573p)) {
                m3.b bVar2 = this.f4569j;
                kotlin.jvm.internal.m.b(bVar2);
                long jD = y3.b.d(jG, (((long) q.r(Math.min(bVar2.f10413a.I.b(), bVar2.d()))) << 32) | (((long) q.r(bVar2.b())) & 4294967295L));
                this.l = jD;
                if (this.f4563d == 3 || (((int) (jD >> 32)) >= bVar2.d() && ((int) (4294967295L & jD)) >= bVar2.b())) {
                    z10 = false;
                }
                this.f4570k = z10;
                this.f4573p = jG;
            }
            return false;
        }
        u uVarE = e(mVar);
        long jS = b5.s(jG, this.f4564e, this.f4563d, uVarE.l());
        boolean z12 = this.f4564e;
        int i10 = this.f4563d;
        int i11 = this.f4565f;
        m3.b bVar3 = new m3.b((u3.c) uVarE, ((z12 || !(i10 == 2 || i10 == 4 || i10 == 5)) && i11 >= 1) ? i11 : 1, i10, jS);
        this.f4573p = jG;
        long jD2 = y3.b.d(jG, (((long) q.r(bVar3.b())) & 4294967295L) | (((long) q.r(bVar3.d())) << 32));
        this.l = jD2;
        if (this.f4563d != 3 && (((int) (jD2 >> 32)) < bVar3.d() || ((int) (jD2 & 4294967295L)) < bVar3.b())) {
            z11 = true;
        }
        this.f4570k = z11;
        this.f4569j = bVar3;
        return true;
    }

    public final void c() {
        this.f4569j = null;
        this.f4571n = null;
        this.f4572o = null;
        this.f4574q = -1;
        this.f4575r = -1;
        this.f4573p = y3.b.h(0, 0, 0, 0);
        long j9 = 0;
        this.l = (j9 & 4294967295L) | (j9 << 32);
        this.f4570k = false;
    }

    public final void d(y3.c cVar) {
        long jA;
        y3.c cVar2 = this.f4568i;
        if (cVar != null) {
            int i10 = a.f4534b;
            jA = a.a(cVar.c(), cVar.t0());
        } else {
            jA = a.f4533a;
        }
        if (cVar2 == null) {
            this.f4568i = cVar;
            this.f4567h = jA;
        } else if (cVar == null || this.f4567h != jA) {
            this.f4568i = cVar;
            this.f4567h = jA;
            this.f4576s = (this.f4576s << 2) | 1;
            c();
        }
    }

    public final u e(y3.m mVar) throws NoWhenBranchMatchedException {
        u cVar = this.f4571n;
        if (cVar == null || mVar != this.f4572o || cVar.b()) {
            this.f4572o = mVar;
            String str = this.f4560a;
            r0 r0VarJ = h0.j(this.f4561b, mVar);
            y3.c cVar2 = this.f4568i;
            kotlin.jvm.internal.m.b(cVar2);
            q3.h hVar = this.f4562c;
            x xVar = x.A;
            cVar = new u3.c(str, r0VarJ, xVar, xVar, hVar, cVar2);
        }
        this.f4571n = cVar;
        return cVar;
    }

    public final void f(String str, r0 r0Var, q3.h hVar, int i10, boolean z10, int i11, int i12) {
        this.f4560a = str;
        this.f4561b = r0Var;
        this.f4562c = hVar;
        this.f4563d = i10;
        this.f4564e = z10;
        this.f4565f = i11;
        this.f4566g = i12;
        this.f4576s = (this.f4576s << 2) | 2;
        c();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb2.append(this.f4569j != null ? "<paragraph>" : "null");
        sb2.append(", lastDensity=");
        sb2.append((Object) a.b(this.f4567h));
        sb2.append(", history=");
        return a1.b.k(this.f4576s, ", constraints=$)", sb2);
    }
}
