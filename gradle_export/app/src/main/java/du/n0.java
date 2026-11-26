package du;

import com.google.android.gms.internal.measurement.x5;

public final class n0 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final ep.k m;
    public final boolean n;
    public final bu.b o;
    public final bu.b p;
    public final bu.b q;

    public n0(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z11, boolean z12, ep.k kVar, boolean z13, bu.b bVar, bu.b bVar2, bu.b bVar3) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = z9;
        this.k = z11;
        this.l = z12;
        this.m = kVar;
        this.n = z13;
        this.o = bVar;
        this.p = bVar2;
        this.q = bVar3;
    }

    public static n0 a(n0 n0Var, boolean z, String str, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, ep.k kVar, boolean z11, bu.b bVar, bu.b bVar2, bu.b bVar3, int i) {
        boolean z12 = n0Var.a;
        boolean z13 = (i & 2) != 0 ? n0Var.b : z;
        String str2 = (i & 4) != 0 ? n0Var.c : str;
        boolean z14 = (i & 8) != 0 ? n0Var.d : false;
        boolean z15 = (i & 16) != 0 ? n0Var.e : z2;
        boolean z16 = (i & 32) != 0 ? n0Var.f : z3;
        boolean z17 = (i & 64) != 0 ? n0Var.g : z4;
        boolean z18 = (i & 128) != 0 ? n0Var.h : z5;
        boolean z19 = (i & 256) != 0 ? n0Var.i : z6;
        boolean z21 = (i & 512) != 0 ? n0Var.j : z7;
        boolean z22 = (i & 1024) != 0 ? n0Var.k : z8;
        boolean z23 = (i & 2048) != 0 ? n0Var.l : z9;
        ep.k kVar2 = (i & 4096) != 0 ? n0Var.m : kVar;
        boolean z24 = (i & 8192) != 0 ? n0Var.n : z11;
        bu.b bVar4 = (i & 16384) != 0 ? n0Var.o : bVar;
        bu.b bVar5 = (i & 32768) != 0 ? n0Var.p : bVar2;
        bu.b selectedPaywallPlan = (i & 65536) != 0 ? n0Var.q : bVar3;
        n0Var.getClass();
        kotlin.jvm.internal.m.e(selectedPaywallPlan, "selectedPaywallPlan");
        return new n0(z12, z13, str2, z14, z15, z16, z17, z18, z19, z21, z22, z23, kVar2, z24, bVar4, bVar5, selectedPaywallPlan);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.a == n0Var.a && this.b == n0Var.b && kotlin.jvm.internal.m.a(this.c, n0Var.c) && this.d == n0Var.d && this.e == n0Var.e && this.f == n0Var.f && this.g == n0Var.g && this.h == n0Var.h && this.i == n0Var.i && this.j == n0Var.j && this.k == n0Var.k && this.l == n0Var.l && this.m == n0Var.m && this.n == n0Var.n && kotlin.jvm.internal.m.a(this.o, n0Var.o) && kotlin.jvm.internal.m.a(this.p, n0Var.p) && kotlin.jvm.internal.m.a(this.q, n0Var.q);
    }

    public final int hashCode() {
        int iE = w.c.e(w.c.e(w.c.e(w.c.e(w.c.e(w.c.e(w.c.e(w.c.e(w.c.e(x5.e(w.c.e(Boolean.hashCode(this.a) * 31, 31, this.b), this.c, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
        ep.k kVar = this.m;
        return this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + w.c.e((iE + (kVar == null ? 0 : kVar.hashCode())) * 31, 31, this.n)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MainUiState(isOnboardingFinished=");
        sb.append(this.a);
        sb.append(", isQuestionerVisible=");
        sb.append(this.b);
        sb.append(", localeCode=");
        sb.append(this.c);
        sb.append(", isInitialLoad=");
        sb.append(this.d);
        sb.append(", isInternetConnected=");
        oi.k.y(sb, this.e, ", isTechnicalWorkModeEnabled=", this.f, ", isHardUpdateRequired=");
        oi.k.y(sb, this.g, ", isSoftUpdateVisible=", this.h, ", isPremiumPaywallVisible=");
        oi.k.y(sb, this.i, ", isRestoreLoading=", this.j, ", isPaywallOpenLogged=");
        oi.k.y(sb, this.k, ", isPremiumAuthPromptVisible=", this.l, ", forcedLogoutReason=");
        sb.append(this.m);
        sb.append(", isListeningImportDecisionVisible=");
        sb.append(this.n);
        sb.append(", annualPaywallPlan=");
        sb.append(this.o);
        sb.append(", monthlyPaywallPlan=");
        sb.append(this.p);
        sb.append(", selectedPaywallPlan=");
        sb.append(this.q);
        sb.append(")");
        return sb.toString();
    }
}
