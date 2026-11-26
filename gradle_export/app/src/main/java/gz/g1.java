package gz;

import com.google.android.gms.internal.measurement.x5;
import com.mchutov.quranify.auth.presentation.screen.root.AuthRootLauncher;

public final class g1 {
    public final boolean A;
    public final String B;
    public final String a;
    public final String b;
    public final boolean c;
    public final xp.a d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final zz.b i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final AuthRootLauncher p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final String x;
    public final String y;
    public final boolean z;

    public g1(String str, String str2, boolean z, xp.a aVar, boolean z2, boolean z3, boolean z4, boolean z5, zz.b selectedVideoQuality, boolean z6, boolean z7, boolean z8, boolean z9, boolean z11, boolean z12, AuthRootLauncher authRootLauncher, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, String str3, String str4, boolean z21, boolean z22, String str5) {
        kotlin.jvm.internal.m.e(selectedVideoQuality, "selectedVideoQuality");
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = aVar;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = selectedVideoQuality;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = z9;
        this.n = z11;
        this.o = z12;
        this.p = authRootLauncher;
        this.q = z13;
        this.r = z14;
        this.s = z15;
        this.t = z16;
        this.u = z17;
        this.v = z18;
        this.w = z19;
        this.x = str3;
        this.y = str4;
        this.z = z21;
        this.A = z22;
        this.B = str5;
    }

    public static g1 a(g1 g1Var, boolean z, xp.a aVar, boolean z2, boolean z3, boolean z4, boolean z5, zz.b bVar, boolean z6, boolean z7, boolean z8, boolean z9, boolean z11, boolean z12, AuthRootLauncher authRootLauncher, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, String str, String str2, boolean z21, boolean z22, String str3, int i) {
        String str4 = g1Var.a;
        String str5 = g1Var.b;
        boolean z23 = (i & 4) != 0 ? g1Var.c : z;
        xp.a aVar2 = (i & 8) != 0 ? g1Var.d : aVar;
        boolean z24 = (i & 16) != 0 ? g1Var.e : z2;
        boolean z25 = (i & 32) != 0 ? g1Var.f : z3;
        boolean z26 = (i & 64) != 0 ? g1Var.g : z4;
        boolean z27 = (i & 128) != 0 ? g1Var.h : z5;
        zz.b selectedVideoQuality = (i & 256) != 0 ? g1Var.i : bVar;
        boolean z28 = (i & 512) != 0 ? g1Var.j : z6;
        boolean z29 = (i & 1024) != 0 ? g1Var.k : z7;
        boolean z31 = (i & 2048) != 0 ? g1Var.l : z8;
        boolean z32 = (i & 4096) != 0 ? g1Var.m : z9;
        boolean z33 = (i & 8192) != 0 ? g1Var.n : z11;
        boolean z34 = (i & 16384) != 0 ? g1Var.o : z12;
        AuthRootLauncher authRootLauncher2 = (i & 32768) != 0 ? g1Var.p : authRootLauncher;
        boolean z35 = (i & 65536) != 0 ? g1Var.q : z13;
        boolean z36 = (i & 131072) != 0 ? g1Var.r : z14;
        boolean z37 = (i & 262144) != 0 ? g1Var.s : z15;
        boolean z38 = (i & 524288) != 0 ? g1Var.t : z16;
        boolean z39 = (i & 1048576) != 0 ? g1Var.u : z17;
        boolean z41 = (i & 2097152) != 0 ? g1Var.v : z18;
        boolean z42 = (i & 4194304) != 0 ? g1Var.w : z19;
        String profileName = (i & 8388608) != 0 ? g1Var.x : str;
        boolean z43 = z34;
        String profileDetails = (i & 16777216) != 0 ? g1Var.y : str2;
        boolean z44 = (i & 33554432) != 0 ? g1Var.z : z21;
        boolean z45 = (i & 67108864) != 0 ? g1Var.A : z22;
        String str6 = (i & 134217728) != 0 ? g1Var.B : str3;
        g1Var.getClass();
        kotlin.jvm.internal.m.e(selectedVideoQuality, "selectedVideoQuality");
        kotlin.jvm.internal.m.e(profileName, "profileName");
        kotlin.jvm.internal.m.e(profileDetails, "profileDetails");
        return new g1(str4, str5, z23, aVar2, z24, z25, z26, z27, selectedVideoQuality, z28, z29, z31, z32, z33, z43, authRootLauncher2, z35, z36, z37, z38, z39, z41, z42, profileName, profileDetails, z44, z45, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return kotlin.jvm.internal.m.a(this.a, g1Var.a) && kotlin.jvm.internal.m.a(this.b, g1Var.b) && this.c == g1Var.c && this.d == g1Var.d && this.e == g1Var.e && this.f == g1Var.f && this.g == g1Var.g && this.h == g1Var.h && this.i == g1Var.i && this.j == g1Var.j && this.k == g1Var.k && this.l == g1Var.l && this.m == g1Var.m && this.n == g1Var.n && this.o == g1Var.o && kotlin.jvm.internal.m.a(this.p, g1Var.p) && this.q == g1Var.q && this.r == g1Var.r && this.s == g1Var.s && this.t == g1Var.t && this.u == g1Var.u && this.v == g1Var.v && this.w == g1Var.w && kotlin.jvm.internal.m.a(this.x, g1Var.x) && kotlin.jvm.internal.m.a(this.y, g1Var.y) && this.z == g1Var.z && this.A == g1Var.A && kotlin.jvm.internal.m.a(this.B, g1Var.B);
    }

    public final int hashCode() {
        int iE = w.c.e(x5.e(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        xp.a aVar = this.d;
        int iE2 = w.c.e(w.c.e(w.c.e(w.c.e(w.c.e(w.c.e((this.i.hashCode() + w.c.e(w.c.e(w.c.e(w.c.e((iE + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
        AuthRootLauncher authRootLauncher = this.p;
        return this.B.hashCode() + w.c.e(w.c.e(x5.e(x5.e(w.c.e(w.c.e(w.c.e(w.c.e(w.c.e(w.c.e(w.c.e((iE2 + (authRootLauncher != null ? authRootLauncher.hashCode() : 0)) * 31, 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), this.x, 31), this.y, 31), 31, this.z), 31, this.A);
    }

    public final String toString() {
        StringBuilder sbS = a1.b.s("SettingsUiState(appName=", this.a, ", version=", this.b, ", isPremium=");
        sbS.append(this.c);
        sbS.append(", subscriptionState=");
        sbS.append(this.d);
        sbS.append(", isFollowUsDialogVisible=");
        oi.k.y(sbS, this.e, ", isCisCountry=", this.f, ", isMembershipDialogVisible=");
        oi.k.y(sbS, this.g, ", isVideoQualityDialogVisible=", this.h, ", selectedVideoQuality=");
        sbS.append(this.i);
        sbS.append(", promoCodeDialogLoading=");
        sbS.append(this.j);
        sbS.append(", promoCodeDialogVisible=");
        oi.k.y(sbS, this.k, ", promoCodeDialogHasError=", this.l, ", isCollaborationDialogVisible=");
        oi.k.y(sbS, this.m, ", isChangeLogVisible=", this.n, ", isAuthMethodSheetVisible=");
        sbS.append(this.o);
        sbS.append(", authFlowLauncher=");
        sbS.append(this.p);
        sbS.append(", isAccountSheetVisible=");
        oi.k.y(sbS, this.q, ", isEditDetailsDialogVisible=", this.r, ", isChangePasswordDialogVisible=");
        oi.k.y(sbS, this.s, ", isSignOutDialogVisible=", this.t, ", isSigningOut=");
        oi.k.y(sbS, this.u, ", isAuthorized=", this.v, ", isRefreshing=");
        sbS.append(this.w);
        sbS.append(", profileName=");
        sbS.append(this.x);
        sbS.append(", profileDetails=");
        sbS.append(this.y);
        sbS.append(", hasEmailProvider=");
        sbS.append(this.z);
        sbS.append(", isCancelSubscriptionReminderVisible=");
        sbS.append(this.A);
        sbS.append(", cancelSubscriptionExpiresOn=");
        sbS.append(this.B);
        sbS.append(")");
        return sbS.toString();
    }
}
