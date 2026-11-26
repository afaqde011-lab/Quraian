package jp;

import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import java.time.LocalDate;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;

public final class x {
    public final boolean A;
    public final ep.e B;
    public final String C;
    public final String D;
    public final boolean a;
    public final u30.b b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;
    public final int l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final int x;
    public final ep.f y;
    public final LocalDate z;

    public x(v30.a aVar, String str, String str2, ep.e eVar, String str3, String str4, int i) {
        this(false, (i & 2) != 0 ? v30.g.B.c(h00.n.k0(new kp.a[]{kp.a.A})) : aVar, "", null, null, "", null, "", "", "", false, 0, 0, false, false, false, null, "", "", null, (i & 1048576) != 0 ? "" : str, (i & 2097152) != 0 ? null : str2, null, 0, null, null, false, (i & 134217728) != 0 ? null : eVar, (i & 268435456) != 0 ? "" : str3, (i & 536870912) != 0 ? "" : str4);
    }

    public x(boolean z, u30.b pages, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, String str9, String str10, String str11, String str12, String nameValue, String str13, String str14, int i3, ep.f fVar, LocalDate localDate, boolean z6, ep.e eVar, String oauthIdToken, String oauthCode) {
        kotlin.jvm.internal.m.e(pages, "pages");
        kotlin.jvm.internal.m.e(nameValue, "nameValue");
        kotlin.jvm.internal.m.e(oauthIdToken, "oauthIdToken");
        kotlin.jvm.internal.m.e(oauthCode, "oauthCode");
        this.a = z;
        this.b = pages;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = z2;
        this.l = i;
        this.m = i2;
        this.n = z3;
        this.o = z4;
        this.p = z5;
        this.q = str9;
        this.r = str10;
        this.s = str11;
        this.t = str12;
        this.u = nameValue;
        this.v = str13;
        this.w = str14;
        this.x = i3;
        this.y = fVar;
        this.z = localDate;
        this.A = z6;
        this.B = eVar;
        this.C = oauthIdToken;
        this.D = oauthCode;
    }

    public static x b(x xVar, boolean z, v30.a aVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i3, ep.f fVar, LocalDate localDate, boolean z6, int i4) {
        boolean z7 = (i4 & 1) != 0 ? xVar.a : z;
        u30.b pages = (i4 & 2) != 0 ? xVar.b : aVar;
        String emailValue = (i4 & 4) != 0 ? xVar.c : str;
        String str16 = (i4 & 8) != 0 ? xVar.d : str2;
        String str17 = (i4 & 16) != 0 ? xVar.e : str3;
        String passwordValue = (i4 & 32) != 0 ? xVar.f : str4;
        String str18 = (i4 & 64) != 0 ? xVar.g : str5;
        String codeValue = (i4 & 128) != 0 ? xVar.h : str6;
        String signupToken = (i4 & 256) != 0 ? xVar.i : str7;
        String resetToken = (i4 & 512) != 0 ? xVar.j : str8;
        boolean z8 = (i4 & 1024) != 0 ? xVar.k : z2;
        int i5 = (i4 & 2048) != 0 ? xVar.l : i;
        int i6 = (i4 & 4096) != 0 ? xVar.m : i2;
        boolean z9 = (i4 & 8192) != 0 ? xVar.n : z3;
        boolean z11 = (i4 & 16384) != 0 ? xVar.o : z4;
        boolean z12 = (32768 & i4) != 0 ? xVar.p : z5;
        String str19 = (65536 & i4) != 0 ? xVar.q : str9;
        String newPasswordValue = (131072 & i4) != 0 ? xVar.r : str10;
        String newConfirmValue = (262144 & i4) != 0 ? xVar.s : str11;
        String str20 = (i4 & 524288) != 0 ? xVar.t : str12;
        String nameValue = (i4 & 1048576) != 0 ? xVar.u : str13;
        boolean z13 = z7;
        String str21 = (i4 & 2097152) != 0 ? xVar.v : str14;
        String str22 = (i4 & 4194304) != 0 ? xVar.w : str15;
        int i7 = (i4 & 8388608) != 0 ? xVar.x : i3;
        ep.f fVar2 = (i4 & 16777216) != 0 ? xVar.y : fVar;
        LocalDate localDate2 = (i4 & 33554432) != 0 ? xVar.z : localDate;
        boolean z14 = (i4 & 67108864) != 0 ? xVar.A : z6;
        ep.e eVar = xVar.B;
        String oauthIdToken = xVar.C;
        String str23 = str16;
        String oauthCode = xVar.D;
        xVar.getClass();
        kotlin.jvm.internal.m.e(pages, "pages");
        kotlin.jvm.internal.m.e(emailValue, "emailValue");
        kotlin.jvm.internal.m.e(passwordValue, "passwordValue");
        kotlin.jvm.internal.m.e(codeValue, "codeValue");
        kotlin.jvm.internal.m.e(signupToken, "signupToken");
        kotlin.jvm.internal.m.e(resetToken, "resetToken");
        kotlin.jvm.internal.m.e(newPasswordValue, "newPasswordValue");
        kotlin.jvm.internal.m.e(newConfirmValue, "newConfirmValue");
        kotlin.jvm.internal.m.e(nameValue, "nameValue");
        kotlin.jvm.internal.m.e(oauthIdToken, "oauthIdToken");
        kotlin.jvm.internal.m.e(oauthCode, "oauthCode");
        return new x(z13, pages, emailValue, str23, str17, passwordValue, str18, codeValue, signupToken, resetToken, z8, i5, i6, z9, z11, z12, str19, newPasswordValue, newConfirmValue, str20, nameValue, str21, str22, i7, fVar2, localDate2, z14, eVar, oauthIdToken, oauthCode);
    }

    public final x a(kp.a page) {
        kotlin.jvm.internal.m.e(page, "page");
        int iOrdinal = page.ordinal();
        if (iOrdinal == 0) {
            return this;
        }
        if (iOrdinal == 1) {
            return b(this, false, null, null, null, null, "", null, null, null, null, false, 0, 0, false, false, false, null, null, null, null, null, null, null, 0, null, null, false, 1073741727);
        }
        if (iOrdinal == 2) {
            return b(this, false, null, null, null, null, null, null, "", null, null, false, 0, 0, false, false, false, null, null, null, null, null, null, null, 0, null, null, false, 1073614719);
        }
        if (iOrdinal != 3) {
            if (iOrdinal == 4) {
                return b(this, false, null, null, null, null, null, null, null, null, null, false, 0, 0, false, false, false, null, null, null, null, "", null, null, 0, null, null, false, 1016070143);
            }
            if (iOrdinal != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return b(this, false, null, null, null, null, null, null, "", null, null, false, 0, 0, false, false, false, null, "", "", null, null, null, null, 0, null, null, false, 1072697215);
    }

    public final u30.f c() {
        ip.b bVar = ip.b.A;
        Pattern patternCompile = Pattern.compile(".*\\d.*");
        kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
        String input = this.r;
        kotlin.jvm.internal.m.e(input, "input");
        g00.k kVar = new g00.k(bVar, Boolean.valueOf(patternCompile.matcher(input).matches()));
        ip.b bVar2 = ip.b.B;
        Pattern patternCompile2 = Pattern.compile(".*[A-Z].*");
        kotlin.jvm.internal.m.d(patternCompile2, "compile(...)");
        g00.k kVar2 = new g00.k(bVar2, Boolean.valueOf(patternCompile2.matcher(input).matches()));
        ip.b bVar3 = ip.b.C;
        Pattern patternCompile3 = Pattern.compile("^.{8,}$");
        kotlin.jvm.internal.m.d(patternCompile3, "compile(...)");
        g00.k kVar3 = new g00.k(bVar3, Boolean.valueOf(patternCompile3.matcher(input).matches()));
        ip.b bVar4 = ip.b.D;
        Pattern patternCompile4 = Pattern.compile(".*[^A-Za-z0-9 ].*");
        kotlin.jvm.internal.m.d(patternCompile4, "compile(...)");
        return g4.g0(h00.d0.R(kVar, kVar2, kVar3, new g00.k(bVar4, Boolean.valueOf(patternCompile4.matcher(input).matches()))));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.a == xVar.a && kotlin.jvm.internal.m.a(this.b, xVar.b) && kotlin.jvm.internal.m.a(this.c, xVar.c) && kotlin.jvm.internal.m.a(this.d, xVar.d) && kotlin.jvm.internal.m.a(this.e, xVar.e) && kotlin.jvm.internal.m.a(this.f, xVar.f) && kotlin.jvm.internal.m.a(this.g, xVar.g) && kotlin.jvm.internal.m.a(this.h, xVar.h) && kotlin.jvm.internal.m.a(this.i, xVar.i) && kotlin.jvm.internal.m.a(this.j, xVar.j) && this.k == xVar.k && this.l == xVar.l && this.m == xVar.m && this.n == xVar.n && this.o == xVar.o && this.p == xVar.p && kotlin.jvm.internal.m.a(this.q, xVar.q) && kotlin.jvm.internal.m.a(this.r, xVar.r) && kotlin.jvm.internal.m.a(this.s, xVar.s) && kotlin.jvm.internal.m.a(this.t, xVar.t) && kotlin.jvm.internal.m.a(this.u, xVar.u) && kotlin.jvm.internal.m.a(this.v, xVar.v) && kotlin.jvm.internal.m.a(this.w, xVar.w) && this.x == xVar.x && this.y == xVar.y && kotlin.jvm.internal.m.a(this.z, xVar.z) && this.A == xVar.A && this.B == xVar.B && kotlin.jvm.internal.m.a(this.C, xVar.C) && kotlin.jvm.internal.m.a(this.D, xVar.D);
    }

    public final int hashCode() {
        int iE = x5.e(g4.c.c(this.b, Boolean.hashCode(this.a) * 31, 31), this.c, 31);
        String str = this.d;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iE2 = x5.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, this.f, 31);
        String str3 = this.g;
        int iE3 = w.c.e(w.c.e(w.c.e(w.c.d(this.m, w.c.d(this.l, w.c.e(x5.e(x5.e(x5.e((iE2 + (str3 == null ? 0 : str3.hashCode())) * 31, this.h, 31), this.i, 31), this.j, 31), 31, this.k), 31), 31), 31, this.n), 31, this.o), 31, this.p);
        String str4 = this.q;
        int iE4 = x5.e(x5.e((iE3 + (str4 == null ? 0 : str4.hashCode())) * 31, this.r, 31), this.s, 31);
        String str5 = this.t;
        int iE5 = x5.e((iE4 + (str5 == null ? 0 : str5.hashCode())) * 31, this.u, 31);
        String str6 = this.v;
        int iHashCode2 = (iE5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.w;
        int iD = w.c.d(this.x, (iHashCode2 + (str7 == null ? 0 : str7.hashCode())) * 31, 31);
        ep.f fVar = this.y;
        int iHashCode3 = (iD + (fVar == null ? 0 : fVar.hashCode())) * 31;
        LocalDate localDate = this.z;
        int iE6 = w.c.e((iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.A);
        ep.e eVar = this.B;
        return this.D.hashCode() + x5.e((iE6 + (eVar != null ? eVar.hashCode() : 0)) * 31, this.C, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthUiState(isLoading=");
        sb.append(this.a);
        sb.append(", pages=");
        sb.append(this.b);
        sb.append(", emailValue=");
        a1.b.z(sb, this.c, ", emailError=", this.d, ", emailSubmitError=");
        a1.b.z(sb, this.e, ", passwordValue=", this.f, ", passwordError=");
        a1.b.z(sb, this.g, ", codeValue=", this.h, ", signupToken=");
        a1.b.z(sb, this.i, ", resetToken=", this.j, ", isPasswordReset=");
        sb.append(this.k);
        sb.append(", resendSeconds=");
        sb.append(this.l);
        sb.append(", resendSecondsLeft=");
        sb.append(this.m);
        sb.append(", isResendAvailable=");
        sb.append(this.n);
        sb.append(", isCodeError=");
        oi.k.y(sb, this.o, ", isCodeSuccess=", this.p, ", codeResendError=");
        a1.b.z(sb, this.q, ", newPasswordValue=", this.r, ", newConfirmValue=");
        a1.b.z(sb, this.s, ", newPasswordSubmitError=", this.t, ", nameValue=");
        a1.b.z(sb, this.u, ", nameError=", this.v, ", detailsSubmitError=");
        sb.append(this.w);
        sb.append(", errorShakeKey=");
        sb.append(this.x);
        sb.append(", sex=");
        sb.append(this.y);
        sb.append(", birthDate=");
        sb.append(this.z);
        sb.append(", declinesMarketingEmails=");
        sb.append(this.A);
        sb.append(", oauthMethod=");
        sb.append(this.B);
        sb.append(", oauthIdToken=");
        return oi.k.m(sb, this.C, ", oauthCode=", this.D, ")");
    }
}
