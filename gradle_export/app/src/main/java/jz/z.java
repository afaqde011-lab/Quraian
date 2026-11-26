package jz;

import com.google.android.gms.internal.measurement.x5;
import java.util.List;

public final class z {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final List l;
    public final boolean m;
    public final String n;
    public final String o;
    public final String p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;

    public z(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z6, String str7, String str8, String str9, boolean z7, boolean z8, boolean z9, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? true : z5, (i & 32) != 0 ? "" : str, (i & 64) != 0 ? "" : str2, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? "" : str4, (i & 512) != 0 ? "" : str5, (i & 1024) != 0 ? "" : str6, (i & 2048) != 0 ? h00.x.A : list, (i & 4096) != 0 ? false : z6, (i & 8192) != 0 ? "" : str7, (i & 16384) != 0 ? "" : str8, (32768 & i) != 0 ? "" : str9, (65536 & i) != 0 ? false : z7, (131072 & i) != 0 ? false : z8, (i & 262144) != 0 ? false : z9, false, false);
    }

    public z(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String renewDate, String subscriptionPrice, String purchaseDeviceName, String purchaseDeviceLocation, String serverPurchaseDeviceName, String serverPurchaseDeviceLocation, List sessionDevices, boolean z6, String monthlyPrice, String annualPerMonthPrice, String annualPriceSuffix, boolean z7, boolean z8, boolean z9, boolean z11, boolean z12) {
        kotlin.jvm.internal.m.e(renewDate, "renewDate");
        kotlin.jvm.internal.m.e(subscriptionPrice, "subscriptionPrice");
        kotlin.jvm.internal.m.e(purchaseDeviceName, "purchaseDeviceName");
        kotlin.jvm.internal.m.e(purchaseDeviceLocation, "purchaseDeviceLocation");
        kotlin.jvm.internal.m.e(serverPurchaseDeviceName, "serverPurchaseDeviceName");
        kotlin.jvm.internal.m.e(serverPurchaseDeviceLocation, "serverPurchaseDeviceLocation");
        kotlin.jvm.internal.m.e(sessionDevices, "sessionDevices");
        kotlin.jvm.internal.m.e(monthlyPrice, "monthlyPrice");
        kotlin.jvm.internal.m.e(annualPerMonthPrice, "annualPerMonthPrice");
        kotlin.jvm.internal.m.e(annualPriceSuffix, "annualPriceSuffix");
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = renewDate;
        this.g = subscriptionPrice;
        this.h = purchaseDeviceName;
        this.i = purchaseDeviceLocation;
        this.j = serverPurchaseDeviceName;
        this.k = serverPurchaseDeviceLocation;
        this.l = sessionDevices;
        this.m = z6;
        this.n = monthlyPrice;
        this.o = annualPerMonthPrice;
        this.p = annualPriceSuffix;
        this.q = z7;
        this.r = z8;
        this.s = z9;
        this.t = z11;
        this.u = z12;
    }

    public static z a(z zVar, String str, String str2, List list, boolean z, boolean z2, int i) {
        boolean z3 = (i & 1) != 0 ? zVar.a : false;
        boolean z4 = zVar.b;
        boolean z5 = zVar.c;
        boolean z6 = zVar.d;
        boolean z7 = zVar.e;
        String renewDate = zVar.f;
        String subscriptionPrice = zVar.g;
        String purchaseDeviceName = zVar.h;
        String purchaseDeviceLocation = zVar.i;
        String serverPurchaseDeviceName = (i & 512) != 0 ? zVar.j : str;
        String serverPurchaseDeviceLocation = (i & 1024) != 0 ? zVar.k : str2;
        List sessionDevices = (i & 2048) != 0 ? zVar.l : list;
        boolean z8 = zVar.m;
        String monthlyPrice = zVar.n;
        String annualPerMonthPrice = zVar.o;
        String annualPriceSuffix = zVar.p;
        boolean z9 = zVar.q;
        boolean z11 = zVar.r;
        boolean z12 = zVar.s;
        boolean z13 = (i & 524288) != 0 ? zVar.t : z;
        boolean z14 = (i & 1048576) != 0 ? zVar.u : z2;
        zVar.getClass();
        kotlin.jvm.internal.m.e(renewDate, "renewDate");
        kotlin.jvm.internal.m.e(subscriptionPrice, "subscriptionPrice");
        kotlin.jvm.internal.m.e(purchaseDeviceName, "purchaseDeviceName");
        kotlin.jvm.internal.m.e(purchaseDeviceLocation, "purchaseDeviceLocation");
        kotlin.jvm.internal.m.e(serverPurchaseDeviceName, "serverPurchaseDeviceName");
        kotlin.jvm.internal.m.e(serverPurchaseDeviceLocation, "serverPurchaseDeviceLocation");
        kotlin.jvm.internal.m.e(sessionDevices, "sessionDevices");
        kotlin.jvm.internal.m.e(monthlyPrice, "monthlyPrice");
        kotlin.jvm.internal.m.e(annualPerMonthPrice, "annualPerMonthPrice");
        kotlin.jvm.internal.m.e(annualPriceSuffix, "annualPriceSuffix");
        return new z(z3, z4, z5, z6, z7, renewDate, subscriptionPrice, purchaseDeviceName, purchaseDeviceLocation, serverPurchaseDeviceName, serverPurchaseDeviceLocation, sessionDevices, z8, monthlyPrice, annualPerMonthPrice, annualPriceSuffix, z9, z11, z12, z13, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.a == zVar.a && this.b == zVar.b && this.c == zVar.c && this.d == zVar.d && this.e == zVar.e && kotlin.jvm.internal.m.a(this.f, zVar.f) && kotlin.jvm.internal.m.a(this.g, zVar.g) && kotlin.jvm.internal.m.a(this.h, zVar.h) && kotlin.jvm.internal.m.a(this.i, zVar.i) && kotlin.jvm.internal.m.a(this.j, zVar.j) && kotlin.jvm.internal.m.a(this.k, zVar.k) && kotlin.jvm.internal.m.a(this.l, zVar.l) && this.m == zVar.m && kotlin.jvm.internal.m.a(this.n, zVar.n) && kotlin.jvm.internal.m.a(this.o, zVar.o) && kotlin.jvm.internal.m.a(this.p, zVar.p) && this.q == zVar.q && this.r == zVar.r && this.s == zVar.s && this.t == zVar.t && this.u == zVar.u;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.u) + w.c.e(w.c.e(w.c.e(w.c.e(x5.e(x5.e(x5.e(w.c.e(g4.c.a(x5.e(x5.e(x5.e(x5.e(x5.e(x5.e(w.c.e(w.c.e(w.c.e(w.c.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), this.f, 31), this.g, 31), this.h, 31), this.i, 31), this.j, 31), this.k, 31), 31, this.l), 31, this.m), this.n, 31), this.o, 31), this.p, 31), 31, this.q), 31, this.r), 31, this.s), 31, this.t);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ManageSubscriptionUiState(isAuthBannerVisible=");
        sb.append(this.a);
        sb.append(", isActive=");
        sb.append(this.b);
        sb.append(", isCancelling=");
        oi.k.y(sb, this.c, ", isCancelled=", this.d, ", willRenew=");
        sb.append(this.e);
        sb.append(", renewDate=");
        sb.append(this.f);
        sb.append(", subscriptionPrice=");
        a1.b.z(sb, this.g, ", purchaseDeviceName=", this.h, ", purchaseDeviceLocation=");
        a1.b.z(sb, this.i, ", serverPurchaseDeviceName=", this.j, ", serverPurchaseDeviceLocation=");
        sb.append(this.k);
        sb.append(", sessionDevices=");
        sb.append(this.l);
        sb.append(", showChangeToAnnual=");
        sb.append(this.m);
        sb.append(", monthlyPrice=");
        sb.append(this.n);
        sb.append(", annualPerMonthPrice=");
        a1.b.z(sb, this.o, ", annualPriceSuffix=", this.p, ", canCancelOnThisDevice=");
        oi.k.y(sb, this.q, ", showReactivate=", this.r, ", showCancelOnPurchaseDeviceNote=");
        oi.k.y(sb, this.s, ", isUpgrading=", this.t, ", isRefreshing=");
        return g4.c.l(sb, this.u, ")");
    }
}
