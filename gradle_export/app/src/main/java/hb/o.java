package hb;

import ab.a0;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import za.f0;
import za.g0;
import za.h0;

public final class o {

    public final String f6988a;

    public final g0 f6989b;

    public final za.g f6990c;

    public final long f6991d;

    public final long f6992e;

    public final long f6993f;

    public final za.e f6994g;

    public final int f6995h;

    public final za.a f6996i;

    public final long f6997j;

    public final long f6998k;
    public final int l;
    public final int m;

    public final long f6999n;

    public final int f7000o;

    public final List f7001p;

    public final List f7002q;

    public o(String str, g0 g0Var, za.g gVar, long j9, long j10, long j11, za.e eVar, int i10, za.a aVar, long j12, long j13, int i11, int i12, long j14, int i13, List list, List list2) {
        kotlin.jvm.internal.m.e(str, "id");
        kotlin.jvm.internal.m.e(gVar, "output");
        this.f6988a = str;
        this.f6989b = g0Var;
        this.f6990c = gVar;
        this.f6991d = j9;
        this.f6992e = j10;
        this.f6993f = j11;
        this.f6994g = eVar;
        this.f6995h = i10;
        this.f6996i = aVar;
        this.f6997j = j12;
        this.f6998k = j13;
        this.l = i11;
        this.m = i12;
        this.f6999n = j14;
        this.f7000o = i13;
        this.f7001p = list;
        this.f7002q = list2;
    }

    public final h0 a() {
        long j9;
        long jS;
        List list = this.f7002q;
        za.g gVar = !list.isEmpty() ? (za.g) list.get(0) : za.g.f17367b;
        UUID uuidFromString = UUID.fromString(this.f6988a);
        kotlin.jvm.internal.m.d(uuidFromString, "fromString(...)");
        HashSet hashSet = new HashSet(this.f7001p);
        long j10 = this.f6992e;
        f0 f0Var = j10 != 0 ? new f0(j10, this.f6993f) : null;
        g0 g0Var = g0.A;
        g0 g0Var2 = this.f6989b;
        int i10 = this.f6995h;
        long j11 = this.f6991d;
        if (g0Var2 == g0Var) {
            String str = p.f7003z;
            j9 = j11;
            jS = a0.s(g0Var2 == g0Var && i10 > 0, i10, this.f6996i, this.f6997j, this.f6998k, this.l, j10 != 0, j9, this.f6993f, j10, this.f6999n);
        } else {
            j9 = j11;
            jS = Long.MAX_VALUE;
        }
        return new h0(uuidFromString, g0Var2, hashSet, this.f6990c, gVar, i10, this.m, this.f6994g, j9, f0Var, jS, this.f7000o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.m.a(this.f6988a, oVar.f6988a) && this.f6989b == oVar.f6989b && kotlin.jvm.internal.m.a(this.f6990c, oVar.f6990c) && this.f6991d == oVar.f6991d && this.f6992e == oVar.f6992e && this.f6993f == oVar.f6993f && kotlin.jvm.internal.m.a(this.f6994g, oVar.f6994g) && this.f6995h == oVar.f6995h && this.f6996i == oVar.f6996i && this.f6997j == oVar.f6997j && this.f6998k == oVar.f6998k && this.l == oVar.l && this.m == oVar.m && this.f6999n == oVar.f6999n && this.f7000o == oVar.f7000o && kotlin.jvm.internal.m.a(this.f7001p, oVar.f7001p) && kotlin.jvm.internal.m.a(this.f7002q, oVar.f7002q);
    }

    public final int hashCode() {
        return this.f7002q.hashCode() + g4.c.a(w.c.d(this.f7000o, w.c.f(w.c.d(this.m, w.c.d(this.l, w.c.f(w.c.f((this.f6996i.hashCode() + w.c.d(this.f6995h, (this.f6994g.hashCode() + w.c.f(w.c.f(w.c.f((this.f6990c.hashCode() + ((this.f6989b.hashCode() + (this.f6988a.hashCode() * 31)) * 31)) * 31, this.f6991d, 31), this.f6992e, 31), this.f6993f, 31)) * 31, 31)) * 31, this.f6997j, 31), this.f6998k, 31), 31), 31), this.f6999n, 31), 31), 31, this.f7001p);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkInfoPojo(id=");
        sb2.append(this.f6988a);
        sb2.append(", state=");
        sb2.append(this.f6989b);
        sb2.append(", output=");
        sb2.append(this.f6990c);
        sb2.append(", initialDelay=");
        sb2.append(this.f6991d);
        sb2.append(", intervalDuration=");
        sb2.append(this.f6992e);
        sb2.append(", flexDuration=");
        sb2.append(this.f6993f);
        sb2.append(", constraints=");
        sb2.append(this.f6994g);
        sb2.append(", runAttemptCount=");
        sb2.append(this.f6995h);
        sb2.append(", backoffPolicy=");
        sb2.append(this.f6996i);
        sb2.append(", backoffDelayDuration=");
        sb2.append(this.f6997j);
        sb2.append(", lastEnqueueTime=");
        sb2.append(this.f6998k);
        sb2.append(", periodCount=");
        sb2.append(this.l);
        sb2.append(", generation=");
        sb2.append(this.m);
        sb2.append(", nextScheduleTimeOverride=");
        sb2.append(this.f6999n);
        sb2.append(", stopReason=");
        sb2.append(this.f7000o);
        sb2.append(", tags=");
        sb2.append(this.f7001p);
        sb2.append(", progress=");
        return oi.k.n(sb2, this.f7002q, ')');
    }
}
