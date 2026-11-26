package bt;

import com.mchutov.quranify.auth.presentation.screen.root.AuthRootLauncher;

public final class a1 {
    public final ys.c a;
    public final boolean b;
    public final boolean c;
    public final bx.c d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final AuthRootLauncher j;
    public final ys.b k;
    public final ys.f l;
    public final u30.b m;
    public final ys.m n;
    public final ys.a o;
    public final mr.g p;
    public final int q;
    public final u30.b r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;

    public a1(ys.c selectedPeriod, boolean z, boolean z2, bx.c cVar, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, AuthRootLauncher authRootLauncher, ys.b bVar, ys.f fVar, u30.b topSurahs, ys.m mVar, ys.a aVar, mr.g timerState, int i, u30.b weeklyStreaks, boolean z8, boolean z9, boolean z11, boolean z12, boolean z13, boolean z14) {
        kotlin.jvm.internal.m.e(selectedPeriod, "selectedPeriod");
        kotlin.jvm.internal.m.e(topSurahs, "topSurahs");
        kotlin.jvm.internal.m.e(timerState, "timerState");
        kotlin.jvm.internal.m.e(weeklyStreaks, "weeklyStreaks");
        this.a = selectedPeriod;
        this.b = z;
        this.c = z2;
        this.d = cVar;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = authRootLauncher;
        this.k = bVar;
        this.l = fVar;
        this.m = topSurahs;
        this.n = mVar;
        this.o = aVar;
        this.p = timerState;
        this.q = i;
        this.r = weeklyStreaks;
        this.s = z8;
        this.t = z9;
        this.u = z11;
        this.v = z12;
        this.w = z13;
        this.x = z14;
    }

    public static a1 a(a1 a1Var, ys.c cVar, boolean z, boolean z2, bx.c cVar2, boolean z3, boolean z4, boolean z5, boolean z6, AuthRootLauncher authRootLauncher, ys.b bVar, ys.f fVar, u30.b bVar2, ys.m mVar, ys.a aVar, mr.g gVar, int i, u30.b bVar3, boolean z7, boolean z8, boolean z9, boolean z11, boolean z12, boolean z13, int i2) {
        ys.c selectedPeriod = (i2 & 1) != 0 ? a1Var.a : cVar;
        boolean z14 = (i2 & 2) != 0 ? a1Var.b : z;
        boolean z15 = (i2 & 4) != 0 ? a1Var.c : z2;
        bx.c cVar3 = (i2 & 8) != 0 ? a1Var.d : cVar2;
        boolean z16 = (i2 & 16) != 0 ? a1Var.e : z3;
        boolean z17 = (i2 & 32) != 0 ? a1Var.f : z4;
        boolean z18 = (i2 & 64) != 0 ? a1Var.g : z5;
        boolean z19 = (i2 & 128) != 0 ? a1Var.h : false;
        boolean z21 = (i2 & 256) != 0 ? a1Var.i : z6;
        AuthRootLauncher authRootLauncher2 = (i2 & 512) != 0 ? a1Var.j : authRootLauncher;
        ys.b bVar4 = (i2 & 1024) != 0 ? a1Var.k : bVar;
        ys.f fVar2 = (i2 & 2048) != 0 ? a1Var.l : fVar;
        u30.b topSurahs = (i2 & 4096) != 0 ? a1Var.m : bVar2;
        ys.m mVar2 = (i2 & 8192) != 0 ? a1Var.n : mVar;
        boolean z22 = z14;
        ys.a aVar2 = (i2 & 16384) != 0 ? a1Var.o : aVar;
        mr.g timerState = (i2 & 32768) != 0 ? a1Var.p : gVar;
        ys.a aVar3 = aVar2;
        int i3 = (i2 & 65536) != 0 ? a1Var.q : i;
        u30.b weeklyStreaks = (i2 & 131072) != 0 ? a1Var.r : bVar3;
        boolean z23 = (i2 & 262144) != 0 ? a1Var.s : z7;
        boolean z24 = (i2 & 524288) != 0 ? a1Var.t : z8;
        boolean z25 = (i2 & 1048576) != 0 ? a1Var.u : z9;
        boolean z26 = (i2 & 2097152) != 0 ? a1Var.v : z11;
        boolean z27 = (i2 & 4194304) != 0 ? a1Var.w : z12;
        boolean z28 = (i2 & 8388608) != 0 ? a1Var.x : z13;
        a1Var.getClass();
        kotlin.jvm.internal.m.e(selectedPeriod, "selectedPeriod");
        kotlin.jvm.internal.m.e(topSurahs, "topSurahs");
        kotlin.jvm.internal.m.e(timerState, "timerState");
        kotlin.jvm.internal.m.e(weeklyStreaks, "weeklyStreaks");
        return new a1(selectedPeriod, z22, z15, cVar3, z16, z17, z18, z19, z21, authRootLauncher2, bVar4, fVar2, topSurahs, mVar2, aVar3, timerState, i3, weeklyStreaks, z23, z24, z25, z26, z27, z28);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return this.a == a1Var.a && this.b == a1Var.b && this.c == a1Var.c && kotlin.jvm.internal.m.a(this.d, a1Var.d) && this.e == a1Var.e && this.f == a1Var.f && this.g == a1Var.g && this.h == a1Var.h && this.i == a1Var.i && kotlin.jvm.internal.m.a(this.j, a1Var.j) && kotlin.jvm.internal.m.a(this.k, a1Var.k) && kotlin.jvm.internal.m.a(this.l, a1Var.l) && kotlin.jvm.internal.m.a(this.m, a1Var.m) && kotlin.jvm.internal.m.a(this.n, a1Var.n) && kotlin.jvm.internal.m.a(this.o, a1Var.o) && kotlin.jvm.internal.m.a(this.p, a1Var.p) && this.q == a1Var.q && kotlin.jvm.internal.m.a(this.r, a1Var.r) && this.s == a1Var.s && this.t == a1Var.t && this.u == a1Var.u && this.v == a1Var.v && this.w == a1Var.w && this.x == a1Var.x;
    }

    public final int hashCode() {
        int iE = w.c.e(w.c.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        bx.c cVar = this.d;
        int iE2 = w.c.e(w.c.e(w.c.e(w.c.e(w.c.e((iE + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        AuthRootLauncher authRootLauncher = this.j;
        int iHashCode = (iE2 + (authRootLauncher == null ? 0 : authRootLauncher.hashCode())) * 31;
        ys.b bVar = this.k;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        ys.f fVar = this.l;
        int iC = g4.c.c(this.m, (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31, 31);
        ys.m mVar = this.n;
        int iHashCode3 = (iC + (mVar == null ? 0 : mVar.hashCode())) * 31;
        ys.a aVar = this.o;
        return Boolean.hashCode(this.x) + w.c.e(w.c.e(w.c.e(w.c.e(w.c.e(g4.c.c(this.r, w.c.d(this.q, (this.p.hashCode() + ((iHashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31)) * 31, 31), 31), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsightsUiState(selectedPeriod=");
        sb.append(this.a);
        sb.append(", isPremium=");
        sb.append(this.b);
        sb.append(", isPlaying=");
        sb.append(this.c);
        sb.append(", selectedReciter=");
        sb.append(this.d);
        sb.append(", isMinutePickerVisible=");
        oi.k.y(sb, this.e, ", isGoalSaving=", this.f, ", isAuthBannerVisible=");
        oi.k.y(sb, this.g, ", isDebugConfigurationVisible=", this.h, ", isAuthMethodSheetVisible=");
        sb.append(this.i);
        sb.append(", authFlowLauncher=");
        sb.append(this.j);
        sb.append(", headerDvo=");
        sb.append(this.k);
        sb.append(", topReciter=");
        sb.append(this.l);
        sb.append(", topSurahs=");
        sb.append(this.m);
        sb.append(", yearOverview=");
        sb.append(this.n);
        sb.append(", bestListeningTime=");
        sb.append(this.o);
        sb.append(", timerState=");
        sb.append(this.p);
        sb.append(", dailyGoalMinute=");
        sb.append(this.q);
        sb.append(", weeklyStreaks=");
        sb.append(this.r);
        sb.append(", hasActiveSurah=");
        oi.k.y(sb, this.s, ", isPeriodLoading=", this.t, ", isYearLoading=");
        oi.k.y(sb, this.u, ", isRefreshing=", this.v, ", isImporting=");
        sb.append(this.w);
        sb.append(", isPeriodRequestRunning=");
        sb.append(this.x);
        sb.append(")");
        return sb.toString();
    }
}
