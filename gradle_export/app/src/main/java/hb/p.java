package hb;

import ab.a0;
import androidx.work.OverwritingInputMerger;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.internal.measurement.x5;
import za.c0;
import za.g0;

public final class p {
    public static final du.w A;

    public static final String f7003z;

    public final String f7004a;

    public g0 f7005b;

    public final String f7006c;

    public final String f7007d;

    public za.g f7008e;

    public final za.g f7009f;

    public long f7010g;

    public long f7011h;

    public long f7012i;

    public za.e f7013j;

    public final int f7014k;
    public za.a l;
    public long m;

    public long f7015n;

    public final long f7016o;

    public final long f7017p;

    public boolean f7018q;

    public c0 f7019r;

    public final int f7020s;

    public final int f7021t;

    public long f7022u;

    public int f7023v;

    public final int f7024w;

    public String f7025x;

    public final Boolean f7026y;

    static {
        String strF = za.v.f("WorkSpec");
        kotlin.jvm.internal.m.d(strF, "tagWithPrefix(...)");
        f7003z = strF;
        A = new du.w(17);
    }

    public p(String str, g0 g0Var, String str2, String str3, za.g gVar, za.g gVar2, long j9, long j10, long j11, za.e eVar, int i10, za.a aVar, long j12, long j13, long j14, long j15, boolean z10, c0 c0Var, int i11, int i12, long j16, int i13, int i14, String str4, Boolean bool) {
        kotlin.jvm.internal.m.e(str, "id");
        kotlin.jvm.internal.m.e(g0Var, "state");
        kotlin.jvm.internal.m.e(str2, "workerClassName");
        kotlin.jvm.internal.m.e(str3, "inputMergerClassName");
        kotlin.jvm.internal.m.e(gVar, "input");
        kotlin.jvm.internal.m.e(gVar2, "output");
        kotlin.jvm.internal.m.e(eVar, "constraints");
        kotlin.jvm.internal.m.e(aVar, "backoffPolicy");
        kotlin.jvm.internal.m.e(c0Var, "outOfQuotaPolicy");
        this.f7004a = str;
        this.f7005b = g0Var;
        this.f7006c = str2;
        this.f7007d = str3;
        this.f7008e = gVar;
        this.f7009f = gVar2;
        this.f7010g = j9;
        this.f7011h = j10;
        this.f7012i = j11;
        this.f7013j = eVar;
        this.f7014k = i10;
        this.l = aVar;
        this.m = j12;
        this.f7015n = j13;
        this.f7016o = j14;
        this.f7017p = j15;
        this.f7018q = z10;
        this.f7019r = c0Var;
        this.f7020s = i11;
        this.f7021t = i12;
        this.f7022u = j16;
        this.f7023v = i13;
        this.f7024w = i14;
        this.f7025x = str4;
        this.f7026y = bool;
    }

    public p(String str, g0 g0Var, String str2, String str3, za.g gVar, za.g gVar2, long j9, long j10, long j11, za.e eVar, int i10, za.a aVar, long j12, long j13, long j14, long j15, boolean z10, c0 c0Var, int i11, long j16, int i12, int i13, String str4, Boolean bool, int i14) {
        this(str, (i14 & 2) != 0 ? g0.A : g0Var, str2, (i14 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i14 & 16) != 0 ? za.g.f17367b : gVar, (i14 & 32) != 0 ? za.g.f17367b : gVar2, (i14 & 64) != 0 ? 0L : j9, (i14 & Cast.MAX_NAMESPACE_LENGTH) != 0 ? 0L : j10, (i14 & 256) != 0 ? 0L : j11, (i14 & 512) != 0 ? za.e.f17355j : eVar, (i14 & 1024) != 0 ? 0 : i10, (i14 & 2048) != 0 ? za.a.A : aVar, (i14 & 4096) != 0 ? NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS : j12, (i14 & 8192) != 0 ? -1L : j13, (i14 & 16384) == 0 ? j14 : 0L, (32768 & i14) != 0 ? -1L : j15, (65536 & i14) != 0 ? false : z10, (131072 & i14) != 0 ? c0.A : c0Var, (262144 & i14) != 0 ? 0 : i11, 0, (1048576 & i14) != 0 ? Long.MAX_VALUE : j16, (2097152 & i14) != 0 ? 0 : i12, (4194304 & i14) != 0 ? -256 : i13, (8388608 & i14) != 0 ? null : str4, (i14 & 16777216) != 0 ? Boolean.FALSE : bool);
    }

    public static p b(p pVar, String str, g0 g0Var, String str2, za.g gVar, int i10, long j9, int i11, int i12, long j10, int i13, int i14) {
        String str3 = (i14 & 1) != 0 ? pVar.f7004a : str;
        g0 g0Var2 = (i14 & 2) != 0 ? pVar.f7005b : g0Var;
        String str4 = (i14 & 4) != 0 ? pVar.f7006c : str2;
        String str5 = pVar.f7007d;
        za.g gVar2 = (i14 & 16) != 0 ? pVar.f7008e : gVar;
        za.g gVar3 = pVar.f7009f;
        long j11 = pVar.f7010g;
        long j12 = pVar.f7011h;
        long j13 = pVar.f7012i;
        za.e eVar = pVar.f7013j;
        int i15 = (i14 & 1024) != 0 ? pVar.f7014k : i10;
        za.a aVar = pVar.l;
        long j14 = pVar.m;
        long j15 = (i14 & 8192) != 0 ? pVar.f7015n : j9;
        long j16 = pVar.f7016o;
        long j17 = pVar.f7017p;
        boolean z10 = pVar.f7018q;
        c0 c0Var = pVar.f7019r;
        int i16 = (i14 & 262144) != 0 ? pVar.f7020s : i11;
        int i17 = (i14 & 524288) != 0 ? pVar.f7021t : i12;
        long j18 = (i14 & 1048576) != 0 ? pVar.f7022u : j10;
        int i18 = (i14 & 2097152) != 0 ? pVar.f7023v : i13;
        int i19 = pVar.f7024w;
        String str6 = pVar.f7025x;
        Boolean bool = pVar.f7026y;
        pVar.getClass();
        kotlin.jvm.internal.m.e(str3, "id");
        kotlin.jvm.internal.m.e(g0Var2, "state");
        kotlin.jvm.internal.m.e(str4, "workerClassName");
        kotlin.jvm.internal.m.e(str5, "inputMergerClassName");
        kotlin.jvm.internal.m.e(gVar2, "input");
        kotlin.jvm.internal.m.e(gVar3, "output");
        kotlin.jvm.internal.m.e(eVar, "constraints");
        kotlin.jvm.internal.m.e(aVar, "backoffPolicy");
        kotlin.jvm.internal.m.e(c0Var, "outOfQuotaPolicy");
        return new p(str3, g0Var2, str4, str5, gVar2, gVar3, j11, j12, j13, eVar, i15, aVar, j14, j15, j16, j17, z10, c0Var, i16, i17, j18, i18, i19, str6, bool);
    }

    public final long a() {
        return a0.s(this.f7005b == g0.A && this.f7014k > 0, this.f7014k, this.l, this.m, this.f7015n, this.f7020s, c(), this.f7010g, this.f7012i, this.f7011h, this.f7022u);
    }

    public final boolean c() {
        return this.f7011h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.m.a(this.f7004a, pVar.f7004a) && this.f7005b == pVar.f7005b && kotlin.jvm.internal.m.a(this.f7006c, pVar.f7006c) && kotlin.jvm.internal.m.a(this.f7007d, pVar.f7007d) && kotlin.jvm.internal.m.a(this.f7008e, pVar.f7008e) && kotlin.jvm.internal.m.a(this.f7009f, pVar.f7009f) && this.f7010g == pVar.f7010g && this.f7011h == pVar.f7011h && this.f7012i == pVar.f7012i && kotlin.jvm.internal.m.a(this.f7013j, pVar.f7013j) && this.f7014k == pVar.f7014k && this.l == pVar.l && this.m == pVar.m && this.f7015n == pVar.f7015n && this.f7016o == pVar.f7016o && this.f7017p == pVar.f7017p && this.f7018q == pVar.f7018q && this.f7019r == pVar.f7019r && this.f7020s == pVar.f7020s && this.f7021t == pVar.f7021t && this.f7022u == pVar.f7022u && this.f7023v == pVar.f7023v && this.f7024w == pVar.f7024w && kotlin.jvm.internal.m.a(this.f7025x, pVar.f7025x) && kotlin.jvm.internal.m.a(this.f7026y, pVar.f7026y);
    }

    public final int hashCode() {
        int iD = w.c.d(this.f7024w, w.c.d(this.f7023v, w.c.f(w.c.d(this.f7021t, w.c.d(this.f7020s, (this.f7019r.hashCode() + w.c.e(w.c.f(w.c.f(w.c.f(w.c.f((this.l.hashCode() + w.c.d(this.f7014k, (this.f7013j.hashCode() + w.c.f(w.c.f(w.c.f((this.f7009f.hashCode() + ((this.f7008e.hashCode() + x5.e(x5.e((this.f7005b.hashCode() + (this.f7004a.hashCode() * 31)) * 31, this.f7006c, 31), this.f7007d, 31)) * 31)) * 31, this.f7010g, 31), this.f7011h, 31), this.f7012i, 31)) * 31, 31)) * 31, this.m, 31), this.f7015n, 31), this.f7016o, 31), this.f7017p, 31), 31, this.f7018q)) * 31, 31), 31), this.f7022u, 31), 31), 31);
        String str = this.f7025x;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f7026y;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return g4.c.k(new StringBuilder("{WorkSpec: "), this.f7004a, '}');
    }
}
