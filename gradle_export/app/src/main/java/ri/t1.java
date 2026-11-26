package ri;

import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastStatusCodes;
import com.google.android.gms.internal.cast.t8;
import com.google.android.gms.internal.measurement.y3;
import g1.o3;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import org.koin.core.error.NoDefinitionFoundException;

public abstract class t1 {
    public static boolean B(k10.h hVar, n20.c cVar) {
        kotlin.jvm.internal.m.e(cVar, "fqName");
        return hVar.f(cVar) != null;
    }

    public static final int C(int i10, int i11) {
        return (i10 >> i11) & 31;
    }

    public static final boolean D(d10.u1 u1Var) {
        kotlin.jvm.internal.m.e(u1Var, "<this>");
        return u1Var.q() != kotlin.jvm.internal.c.NO_RECEIVER;
    }

    public static final boolean E(int i10, String str) {
        char cCharAt = str.charAt(i10);
        return 'A' <= cCharAt && cCharAt < '[';
    }

    public static q30.k F(u00.n nVar) {
        q30.k kVar = new q30.k();
        kVar.D = qd.s0.Z(kVar, kVar, nVar);
        return kVar;
    }

    public static long G(int i10, String str) {
        int iU = u(0, i10, str, false);
        Matcher matcher = x40.l.m.matcher(str);
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int iJ0 = -1;
        int i14 = -1;
        int i15 = -1;
        while (iU < i10) {
            int iU2 = u(iU + 1, i10, str, true);
            matcher.region(iU, iU2);
            if (i12 == -1 && matcher.usePattern(x40.l.m).matches()) {
                String strGroup = matcher.group(1);
                kotlin.jvm.internal.m.d(strGroup, "matcher.group(1)");
                i12 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                kotlin.jvm.internal.m.d(strGroup2, "matcher.group(2)");
                i14 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                kotlin.jvm.internal.m.d(strGroup3, "matcher.group(3)");
                i15 = Integer.parseInt(strGroup3);
            } else if (i13 == -1 && matcher.usePattern(x40.l.l).matches()) {
                String strGroup4 = matcher.group(1);
                kotlin.jvm.internal.m.d(strGroup4, "matcher.group(1)");
                i13 = Integer.parseInt(strGroup4);
            } else if (iJ0 == -1) {
                Pattern pattern = x40.l.k;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    kotlin.jvm.internal.m.d(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    kotlin.jvm.internal.m.d(locale, "US");
                    String lowerCase = strGroup5.toLowerCase(locale);
                    kotlin.jvm.internal.m.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = pattern.pattern();
                    kotlin.jvm.internal.m.d(strPattern, "MONTH_PATTERN.pattern()");
                    iJ0 = r30.k.J0(strPattern, lowerCase, 0, false, 6) / 4;
                } else if (i11 != -1 && matcher.usePattern(x40.l.j).matches()) {
                    String strGroup6 = matcher.group(1);
                    kotlin.jvm.internal.m.d(strGroup6, "matcher.group(1)");
                    i11 = Integer.parseInt(strGroup6);
                }
            } else if (i11 != -1) {
            }
            iU = u(iU2 + 1, i10, str, false);
        }
        if (70 <= i11 && i11 < 100) {
            i11 += 1900;
        }
        if (i11 >= 0 && i11 < 70) {
            i11 += CastStatusCodes.AUTHENTICATION_FAILED;
        }
        if (i11 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iJ0 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i13 || i13 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i12 < 0 || i12 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i14 < 0 || i14 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i15 < 0 || i15 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(y40.b.e);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i11);
        gregorianCalendar.set(2, iJ0 - 1);
        gregorianCalendar.set(5, i13);
        gregorianCalendar.set(11, i12);
        gregorianCalendar.set(12, i14);
        gregorianCalendar.set(13, i15);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final e0.h I(j0.v vVar, l1.j jVar) {
        e0.n nVar = e0.n.f4951b;
        boolean zG = ((l1.g0) jVar).g(vVar);
        l1.g0 g0Var = (l1.g0) jVar;
        Object objN = g0Var.N();
        l1.c cVar = l1.i.f9868a;
        if (zG || objN == cVar) {
            objN = new e0.c(vVar, nVar);
            g0Var.n0(objN);
        }
        e0.m mVar = (e0.m) objN;
        float f3 = e0.l.f4950a;
        y3.c cVar2 = (y3.c) g0Var.k(c3.o1.f2734h);
        x.t tVarA = w.e2.a(jVar);
        boolean zG2 = g0Var.g(cVar2) | g0Var.g(mVar) | g0Var.g(tVarA);
        Object objN2 = g0Var.N();
        if (zG2 || objN2 == cVar) {
            objN2 = new e0.h(mVar, tVarA, x.c.v(0.0f, 400.0f, null, 5));
            g0Var.n0(objN2);
        }
        return (e0.h) objN2;
    }

    public static final Object J(u00.n nVar) {
        Thread.interrupted();
        return a40.c0.C(k00.j.A, new a1.c0(nVar, (k00.c) null));
    }

    public static final long K(l1.j jVar) throws NoWhenBranchMatchedException {
        int iOrdinal = ((gm.a) ((l1.g0) jVar).k(dl.e.a)).ordinal();
        if (iOrdinal == 0) {
            return kh.o.z(20);
        }
        if (iOrdinal == 1) {
            return kh.o.z(22);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final long L(l1.j jVar) throws NoWhenBranchMatchedException {
        int iOrdinal = ((gm.a) ((l1.g0) jVar).k(dl.e.a)).ordinal();
        if (iOrdinal == 0) {
            return kh.o.z(15);
        }
        if (iOrdinal == 1) {
            return kh.o.z(17);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final long M(l1.j jVar) throws NoWhenBranchMatchedException {
        int iOrdinal = ((gm.a) ((l1.g0) jVar).k(dl.e.a)).ordinal();
        if (iOrdinal == 0) {
            return kh.o.z(26);
        }
        if (iOrdinal == 1) {
            return kh.o.z(28);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final long N(l1.j jVar) throws NoWhenBranchMatchedException {
        int iOrdinal = ((gm.a) ((l1.g0) jVar).k(dl.e.a)).ordinal();
        if (iOrdinal == 0) {
            return kh.o.z(22);
        }
        if (iOrdinal == 1) {
            return kh.o.z(24);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void O(Object obj) {
        if (obj instanceof g00.m) {
            throw ((g00.m) obj).A;
        }
    }

    public static final String P(String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        int i10 = 0;
        int i11 = -1;
        if (!r30.k.A0(str, ":", false)) {
            try {
                String ascii = IDN.toASCII(str);
                kotlin.jvm.internal.m.d(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                kotlin.jvm.internal.m.d(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                kotlin.jvm.internal.m.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i12 = 0; i12 < length; i12++) {
                    char cCharAt = lowerCase.charAt(i12);
                    if (kotlin.jvm.internal.m.f(cCharAt, 31) <= 0 || kotlin.jvm.internal.m.f(cCharAt, 127) >= 0 || r30.k.I0(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressV = (r30.r.x0(str, "[", false) && r30.r.p0(str, "]", false)) ? v(1, str, str.length() - 1) : v(0, str, str.length());
        if (inetAddressV == null) {
            return null;
        }
        byte[] address = inetAddressV.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressV.getHostAddress();
            }
            throw new AssertionError(oi.k.g('\'', "Invalid IPv6 address: '", str));
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < address.length) {
            int i15 = i13;
            while (i15 < 16 && address[i15] == 0 && address[i15 + 1] == 0) {
                i15 += 2;
            }
            int i16 = i15 - i13;
            if (i16 > i14 && i16 >= 4) {
                i11 = i13;
                i14 = i16;
            }
            i13 = i15 + 2;
        }
        k50.i iVar = new k50.i();
        while (i10 < address.length) {
            if (i10 == i11) {
                iVar.q0(58);
                i10 += i14;
                if (i10 == 16) {
                    iVar.q0(58);
                }
            } else {
                if (i10 > 0) {
                    iVar.q0(58);
                }
                byte b7 = address[i10];
                byte[] bArr = y40.b.a;
                iVar.s0(((b7 & 255) << 8) | (address[i10 + 1] & 255));
                i10 += 2;
            }
        }
        return iVar.b0();
    }

    public static final String Q(String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb2.append(cCharAt);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public static p20.h R(u00.k kVar) {
        kotlin.jvm.internal.m.e(kVar, "changeOptions");
        p20.l lVar = new p20.l();
        kVar.invoke(lVar);
        lVar.a = true;
        return new p20.h(lVar);
    }

    public static void S(Parcel parcel, int i10, Boolean bool) {
        if (bool == null) {
            return;
        }
        f0(parcel, i10, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void T(Parcel parcel, int i10, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iG0 = g0(i10, parcel);
        parcel.writeBundle(bundle);
        h0(iG0, parcel);
    }

    public static void U(Parcel parcel, int i10, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iG0 = g0(i10, parcel);
        parcel.writeByteArray(bArr);
        h0(iG0, parcel);
    }

    public static void V(Parcel parcel, int i10, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iG0 = g0(i10, parcel);
        parcel.writeStrongBinder(iBinder);
        h0(iG0, parcel);
    }

    public static void W(Parcel parcel, int i10, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iG0 = g0(i10, parcel);
        parcel.writeIntArray(iArr);
        h0(iG0, parcel);
    }

    public static void X(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int iG0 = g0(i10, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeInt(((Integer) list.get(i11)).intValue());
        }
        h0(iG0, parcel);
    }

    public static void Y(Parcel parcel, int i10, Integer num) {
        if (num == null) {
            return;
        }
        f0(parcel, i10, 4);
        parcel.writeInt(num.intValue());
    }

    public static void Z(Parcel parcel, int i10, long[] jArr) {
        if (jArr == null) {
            return;
        }
        int iG0 = g0(i10, parcel);
        parcel.writeLongArray(jArr);
        h0(iG0, parcel);
    }

    public static final void a(String str, u00.k kVar, g2.t tVar, b2.r rVar, l1.j jVar, int i10) {
        b2.r rVar2;
        b2.o oVar;
        boolean z10;
        kotlin.jvm.internal.m.e(str, "text");
        kotlin.jvm.internal.m.e(kVar, "onTextChanged");
        kotlin.jvm.internal.m.e(tVar, "focusRequester");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(825188457);
        int i11 = i10 | (g0Var.g(str) ? 4 : 2) | (g0Var.i(kVar) ? 32 : 16) | 3072;
        if (g0Var.S(i11 & 1, (i11 & 1171) != 1170)) {
            b2.o oVar2 = b2.o.A;
            float f3 = 16;
            b2.r rVarE = h0.c.E(z.n.f(f2.h.c(h0.z1.g(h0.z1.d(oVar2, 1.0f), 52, 0.0f, 2), p0.f.a(24)), dl.a.x, i2.b0.f7111b), f3, 0.0f, 2);
            h0.v1 v1VarA = h0.t1.a(h0.i.f6406a, b2.b.K, g0Var, 48);
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarE, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.f2040g);
            l1.q.E(g0Var, b3.h.f2041h);
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            b2.r rVarE2 = h0.c.E(g2.d.j(new h0.c1(1.0f, true), tVar), 0.0f, f3, 1);
            long j9 = dl.a.k;
            int i12 = 0;
            int i13 = (i11 & 14) | 806879232;
            int i14 = i11 & 112;
            q0.c0.a(str, kVar, rVarE2, false, new m3.r0(j9, kh.o.z(15), q3.u.B, null, 0L, 0L, 0, 0, kh.o.z(20), null, 16646136), new q0.i1(3, i12, i12, 126), null, false, 5, 1, null, null, null, new i2.v0(j9), v1.d.d(-2044146840, new fv.a(str, 8), g0Var), g0Var, i13 | i14, 196614, 14744);
            if (str.length() > 0) {
                g0Var.c0(-1274666607);
                m2.b bVarR = y3.R(2131231431, g0Var, 0);
                long j10 = dl.a.o;
                oVar = oVar2;
                b2.r rVarM = h0.z1.m(oVar, 36);
                boolean z11 = i14 == 32;
                Object objN = g0Var.N();
                if (z11 || objN == l1.i.f9868a) {
                    objN = new qt.h(1, kVar);
                    g0Var.n0(objN);
                }
                z10 = true;
                o3.a(bVarR, null, h0.c.C(w50.c.n(rVarM, true, (u00.a) objN), 8), j10, g0Var, 56, 0);
                g0Var.r(false);
            } else {
                oVar = oVar2;
                z10 = true;
                g0Var.c0(-1274337635);
                g0Var.r(false);
            }
            g0Var.r(z10);
            rVar2 = oVar;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new dz.k(str, kVar, tVar, rVar2, i10, 14);
        }
    }

    public static void a0(Parcel parcel, int i10, Parcelable parcelable, int i11) {
        if (parcelable == null) {
            return;
        }
        int iG0 = g0(i10, parcel);
        parcelable.writeToParcel(parcel, i11);
        h0(iG0, parcel);
    }

    public static c40.h b(int i10, int i11, c40.a aVar) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            aVar = c40.a.A;
        }
        if (i10 == -2) {
            if (aVar != c40.a.A) {
                return new c40.q(1, aVar);
            }
            c40.l.d.getClass();
            return new c40.h(c40.k.b);
        }
        if (i10 == -1) {
            if (aVar == c40.a.A) {
                return new c40.q(1, c40.a.B);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i10 == 0) {
            return aVar == c40.a.A ? new c40.h(0) : new c40.q(1, aVar);
        }
        if (i10 != Integer.MAX_VALUE) {
            return aVar == c40.a.A ? new c40.h(i10) : new c40.q(i10, aVar);
        }
        return new c40.h(Integer.MAX_VALUE);
    }

    public static void b0(Parcel parcel, int i10, String str) {
        if (str == null) {
            return;
        }
        int iG0 = g0(i10, parcel);
        parcel.writeString(str);
        h0(iG0, parcel);
    }

    public static final void c(b2.r rVar, List list, l1.j jVar, int i10) {
        kotlin.jvm.internal.m.e(list, "parties");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-882086200);
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        g0Var.d0(-492369756);
        Object objN = g0Var.N();
        l1.c cVar = l1.i.f9868a;
        if (objN == cVar) {
            objN = l1.q.z(h00.x.A);
            g0Var.n0(objN);
        }
        g0Var.r(false);
        l1.z0 z0Var = (l1.z0) objN;
        g0Var.d0(-492369756);
        Object objN2 = g0Var.N();
        if (objN2 == cVar) {
            objN2 = l1.q.z(0L);
            g0Var.n0(objN2);
        }
        g0Var.r(false);
        l1.z0 z0Var2 = (l1.z0) objN2;
        g0Var.d0(-492369756);
        Object objN3 = g0Var.N();
        if (objN3 == cVar) {
            objN3 = l1.q.z(new Rect());
            g0Var.n0(objN3);
        }
        g0Var.r(false);
        l1.z0 z0Var3 = (l1.z0) objN3;
        l1.q.i(g00.b0.a, g0Var, new a1.f(zVar, list, z0Var2, z0Var, z0Var3, null, 13));
        g0Var.d0(1157296644);
        boolean zG = g0Var.g(z0Var3);
        Object objN4 = g0Var.N();
        if (zG || objN4 == cVar) {
            objN4 = new t40.b(z0Var3, 0);
            g0Var.n0(objN4);
        }
        g0Var.r(false);
        b2.r rVarN = z2.d0.n(rVar, (u00.k) objN4);
        g0Var.d0(1157296644);
        boolean zG2 = g0Var.g(z0Var);
        Object objN5 = g0Var.N();
        if (zG2 || objN5 == cVar) {
            objN5 = new t40.b(z0Var, 1);
            g0Var.n0(objN5);
        }
        g0Var.r(false);
        z.n.b(0, rVarN, g0Var, (u00.k) objN5);
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT == null) {
            return;
        }
        r1VarT.f9921d = new b3.l1(rVar, list, i10, 3);
    }

    public static void c0(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int iG0 = g0(i10, parcel);
        parcel.writeStringList(list);
        h0(iG0, parcel);
    }

    public static final void d(u00.a aVar, u00.k kVar, jk.a aVar2, b2.r rVar, long j9, i2.t tVar, float f3, float f10, float f11, u00.o oVar, v1.c cVar, l1.j jVar, int i10, int i11, int i12) {
        int i13;
        i2.t tVar2;
        float f12;
        float f13;
        int i14;
        u00.o oVar2;
        int i15;
        int i16;
        boolean z10;
        l1.g0 g0Var;
        float f14;
        long j10;
        l1.r1 r1VarT;
        int i17;
        int i18;
        i2.t tVar3;
        float f15;
        float f16;
        int i19;
        u00.o oVar3;
        i2.t tVar4;
        kotlin.jvm.internal.m.e(aVar, "selectedTabIndex");
        kotlin.jvm.internal.m.e(kVar, "onTabSelected");
        kotlin.jvm.internal.m.e(aVar2, "backdrop");
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(-1256654577);
        if ((i10 & 6) == 0) {
            i13 = (g0Var2.i(aVar) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i10 & 48) == 0) {
            i13 |= g0Var2.i(kVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i13 |= g0Var2.i(aVar2) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i13 |= g0Var2.e(5) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i13 |= g0Var2.g(rVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i13 |= Cast.MAX_MESSAGE_LENGTH;
        }
        if ((1572864 & i10) == 0) {
            if ((i12 & 64) == 0) {
                tVar2 = tVar;
                int i20 = g0Var2.g(tVar2) ? 1048576 : 524288;
                i13 |= i20;
            } else {
                tVar2 = tVar;
            }
            i13 |= i20;
        } else {
            tVar2 = tVar;
        }
        if ((12582912 & i10) == 0) {
            i13 |= g0Var2.d(f3) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            f12 = f10;
            i13 |= g0Var2.d(f12) ? 67108864 : 33554432;
        } else {
            f12 = f10;
        }
        int i21 = i12 & 512;
        if (i21 == 0) {
            if ((805306368 & i10) == 0) {
                f13 = f11;
                i13 |= g0Var2.d(f13) ? 536870912 : 268435456;
            }
            i14 = i12 & 1024;
            if (i14 != 0) {
                i15 = 54;
                oVar2 = oVar;
            } else {
                oVar2 = oVar;
                if ((i11 & 6) == 0) {
                    i15 = i11 | (g0Var2.i(oVar2) ? 4 : 2);
                } else {
                    i15 = i11;
                }
            }
            i16 = i13;
            if ((i16 & 306783379) == 306783378 || (i15 & 19) != 18) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (g0Var2.S(i16 & 1, z10)) {
                g0Var2.X();
                if ((i10 & 1) != 0 || g0Var2.A()) {
                    long j11 = dl.a.k;
                    i17 = i16 & (-458753);
                    if ((i12 & 64) != 0) {
                        tVar3 = new i2.t(dl.a.P);
                        i18 = i16 & (-4128769);
                    } else {
                        i18 = i17;
                        tVar3 = tVar2;
                    }
                    if (i21 != 0) {
                        f15 = 0.0f;
                    } else {
                        f15 = f13;
                    }
                    if (i14 != 0) {
                        oVar2 = null;
                    }
                    f16 = f15;
                    j10 = j11;
                    i19 = i18;
                    oVar3 = oVar2;
                    tVar4 = tVar3;
                } else {
                    g0Var2.V();
                    int i22 = i16 & (-458753);
                    if ((i12 & 64) != 0) {
                        i22 = i16 & (-4128769);
                    }
                    i19 = i22;
                    oVar3 = oVar2;
                    tVar4 = tVar2;
                    f16 = f13;
                    j10 = j9;
                }
                g0Var2.s();
                g0Var = g0Var2;
                h0.c.a(rVar, b2.b.D, false, v1.d.d(-1161578139, new sm.i(oVar3, aVar, aVar2, tVar4, f3, kk.e.d(g0Var2), f12, f16, kVar, cVar, j10), g0Var2), g0Var, ((i19 >> 12) & 14) | 3120, 4);
                tVar2 = tVar4;
                f14 = f16;
                oVar2 = oVar3;
            } else {
                g0Var = g0Var2;
                g0Var.V();
                f14 = f13;
                j10 = j9;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new sm.j(aVar, kVar, aVar2, rVar, j10, tVar2, f3, f10, f14, oVar2, cVar, i10, i11, i12);
            }
        }
        i13 |= 805306368;
        f13 = f11;
        i14 = i12 & 1024;
        if (i14 != 0) {
            i15 = 54;
            oVar2 = oVar;
        } else {
            oVar2 = oVar;
            if ((i11 & 6) == 0) {
                i15 = i11 | (g0Var2.i(oVar2) ? 4 : 2);
            } else {
                i15 = i11;
            }
        }
        i16 = i13;
        if ((i16 & 306783379) == 306783378) {
            z10 = true;
        } else {
            z10 = true;
        }
        if (g0Var2.S(i16 & 1, z10)) {
            g0Var2.X();
            if ((i10 & 1) != 0) {
                long j12 = dl.a.k;
                i17 = i16 & (-458753);
                if ((i12 & 64) != 0) {
                    tVar3 = new i2.t(dl.a.P);
                    i18 = i16 & (-4128769);
                } else {
                    i18 = i17;
                    tVar3 = tVar2;
                }
                if (i21 != 0) {
                    f15 = 0.0f;
                } else {
                    f15 = f13;
                }
                if (i14 != 0) {
                    oVar2 = null;
                }
                f16 = f15;
                j10 = j12;
                i19 = i18;
                oVar3 = oVar2;
                tVar4 = tVar3;
            } else {
                long j13 = dl.a.k;
                i17 = i16 & (-458753);
                if ((i12 & 64) != 0) {
                    tVar3 = new i2.t(dl.a.P);
                    i18 = i16 & (-4128769);
                } else {
                    i18 = i17;
                    tVar3 = tVar2;
                }
                if (i21 != 0) {
                    f15 = 0.0f;
                } else {
                    f15 = f13;
                }
                if (i14 != 0) {
                    oVar2 = null;
                }
                f16 = f15;
                j10 = j13;
                i19 = i18;
                oVar3 = oVar2;
                tVar4 = tVar3;
            }
            g0Var2.s();
            g0Var = g0Var2;
            h0.c.a(rVar, b2.b.D, false, v1.d.d(-1161578139, new sm.i(oVar3, aVar, aVar2, tVar4, f3, kk.e.d(g0Var2), f12, f16, kVar, cVar, j10), g0Var2), g0Var, ((i19 >> 12) & 14) | 3120, 4);
            tVar2 = tVar4;
            f14 = f16;
            oVar2 = oVar3;
        } else {
            g0Var = g0Var2;
            g0Var.V();
            f14 = f13;
            j10 = j9;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new sm.j(aVar, kVar, aVar2, rVar, j10, tVar2, f3, f10, f14, oVar2, cVar, i10, i11, i12);
        }
    }

    public static void d0(Parcel parcel, int i10, Parcelable[] parcelableArr, int i11) {
        if (parcelableArr == null) {
            return;
        }
        int iG0 = g0(i10, parcel);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i11);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        h0(iG0, parcel);
    }

    public static final p40.u0 e(String str, n40.d dVar) {
        if (r30.k.L0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        i00.c it = p40.v0.a.values().iterator();
        while (((i00.e) it).hasNext()) {
            l40.a aVar = (l40.a) it.next();
            if (str.equals(aVar.getDescriptor().a())) {
                StringBuilder sbN = g4.c.n("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbN.append(kotlin.jvm.internal.a0.a.b(aVar.getClass()).n());
                sbN.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                throw new IllegalArgumentException(r30.l.j0(sbN.toString()));
            }
        }
        return new p40.u0(str, dVar);
    }

    public static void e0(Parcel parcel, int i10, List list) {
        if (list == null) {
            return;
        }
        int iG0 = g0(i10, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            Parcelable parcelable = (Parcelable) list.get(i11);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        h0(iG0, parcel);
    }

    public static Object f(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void f0(Parcel parcel, int i10, int i11) {
        parcel.writeInt(i10 | (i11 << 16));
    }

    public static void g(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static int g0(int i10, Parcel parcel) {
        parcel.writeInt(i10 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static final Application h(e60.a aVar) throws t8 {
        kotlin.jvm.internal.m.e(aVar, "<this>");
        try {
            return (Application) aVar.f(kotlin.jvm.internal.a0.a.b(Application.class), (a60.a) null, (b60.a) null);
        } catch (NoDefinitionFoundException unused) {
            throw new t8("Can't resolve Application instance. Please use androidContext() function in your KoinApplication configuration.", 2);
        }
    }

    public static void h0(int i10, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i10 - 4);
        parcel.writeInt(iDataPosition - i10);
        parcel.setDataPosition(iDataPosition);
    }

    public static final Context i(e60.a aVar) throws t8 {
        kotlin.jvm.internal.m.e(aVar, "<this>");
        try {
            return (Context) aVar.f(kotlin.jvm.internal.a0.a.b(Context.class), (a60.a) null, (b60.a) null);
        } catch (NoDefinitionFoundException unused) {
            throw new t8("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.", 2);
        }
    }

    public static boolean i0(byte b7) {
        return b7 > -65;
    }

    public static d4.k j(a40.g0 g0Var) {
        return a10.h0.A(new k7.t(g0Var, 27));
    }

    public static final n40.f k(String str, n40.e[] eVarArr, u00.k kVar) {
        kotlin.jvm.internal.m.e(kVar, "builderAction");
        if (r30.k.L0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        n40.a aVar = new n40.a(str);
        kVar.invoke(aVar);
        return new n40.f(str, n40.i.c, aVar.c.size(), h00.n.V0(eVarArr), aVar);
    }

    public static final n40.f l(String str, va.a aVar, n40.e[] eVarArr, u00.k kVar) {
        kotlin.jvm.internal.m.e(str, "serialName");
        if (r30.k.L0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (aVar.equals(n40.i.c)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        n40.a aVar2 = new n40.a(str);
        kVar.invoke(aVar2);
        return new n40.f(str, aVar, aVar2.c.size(), h00.n.V0(eVarArr), aVar2);
    }

    public static n40.f m(String str, va.a aVar, n40.e[] eVarArr) {
        kotlin.jvm.internal.m.e(str, "serialName");
        if (r30.k.L0(str)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (aVar.equals(n40.i.c)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        n40.a aVar2 = new n40.a(str);
        return new n40.f(str, aVar, aVar2.c.size(), h00.n.V0(eVarArr), aVar2);
    }

    public static final String p(String str) {
        char cCharAt;
        kotlin.jvm.internal.m.e(str, "<this>");
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        sb2.append(Character.toUpperCase(cCharAt));
        sb2.append((CharSequence) str, 1, str.length());
        return sb2.toString();
    }

    public static final void r(int i10, int i11) {
        if (i10 > i11) {
            throw new IndexOutOfBoundsException(g4.c.e(i10, i11, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static final g00.m s(Throwable th2) {
        kotlin.jvm.internal.m.e(th2, "exception");
        return new g00.m(th2);
    }

    public static final long t(m0.w wVar) {
        return w00.a.G(((l1.e1) wVar.f10388d.D).h() * wVar.n()) + (((long) ((l1.f1) wVar.f10388d.B).h()) * ((long) wVar.n()));
    }

    public static int u(int i10, int i11, String str, boolean z10) {
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z10)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final InetAddress v(int i10, String str, int i11) {
        int i12;
        int i13;
        int iQ;
        byte[] bArr = new byte[16];
        int i14 = i10;
        int i15 = 0;
        int i16 = -1;
        int i17 = -1;
        while (i14 < i11) {
            if (i15 == 16) {
                return null;
            }
            int i18 = i14 + 2;
            if (i18 <= i11 && r30.r.w0(i14, str, "::", false)) {
                if (i16 != -1) {
                    return null;
                }
                i15 += 2;
                i16 = i15;
                if (i18 == i11) {
                    break;
                }
                i17 = i18;
                i12 = 0;
                i14 = i17;
                while (i14 < i11) {
                    iQ = y40.b.q(str.charAt(i14));
                    if (iQ != -1) {
                        break;
                        break;
                    }
                    i12 = (i12 << 4) + iQ;
                    i14++;
                }
                i13 = i14 - i17;
                return i13 == 0 ? null : null;
            }
            if (i15 != 0) {
                if (!r30.r.w0(i14, str, ":", false)) {
                    if (!r30.r.w0(i14, str, ".", false)) {
                        return null;
                    }
                    int i19 = i15 - 2;
                    int i20 = i19;
                    while (i17 < i11) {
                        if (i20 == 16) {
                            return null;
                        }
                        if (i20 != i19) {
                            if (str.charAt(i17) != '.') {
                                return null;
                            }
                            i17++;
                        }
                        int i21 = 0;
                        int i22 = i17;
                        while (i22 < i11) {
                            char cCharAt = str.charAt(i22);
                            if (kotlin.jvm.internal.m.f(cCharAt, 48) < 0 || kotlin.jvm.internal.m.f(cCharAt, 57) > 0) {
                                break;
                            }
                            if ((i21 == 0 && i17 != i22) || (i21 = ((i21 * 10) + cCharAt) - 48) > 255) {
                                return null;
                            }
                            i22++;
                        }
                        if (i22 - i17 == 0) {
                            return null;
                        }
                        bArr[i20] = (byte) i21;
                        i20++;
                        i17 = i22;
                    }
                    if (i20 != i15 + 2) {
                        return null;
                    }
                    i15 += 2;
                    break;
                }
                i14++;
            }
            i17 = i14;
            i12 = 0;
            i14 = i17;
            while (i14 < i11) {
                iQ = y40.b.q(str.charAt(i14));
                if (iQ != -1) {
                    break;
                }
                i12 = (i12 << 4) + iQ;
                i14++;
            }
            i13 = i14 - i17;
            if (i13 == 0 && i13 <= 4) {
                int i23 = i15 + 1;
                bArr[i15] = (byte) (255 & (i12 >>> 8));
                i15 += 2;
                bArr[i23] = (byte) (i12 & 255);
            }
        }
        if (i15 != 16) {
            if (i16 == -1) {
                return null;
            }
            int i24 = i15 - i16;
            System.arraycopy(bArr, i16, bArr, 16 - i24, i24);
            Arrays.fill(bArr, i16, (16 - i15) + i16, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static k10.b y(k10.h hVar, n20.c cVar) {
        Object next;
        kotlin.jvm.internal.m.e(cVar, "fqName");
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (kotlin.jvm.internal.m.a(((k10.b) next).a(), cVar)) {
                return (k10.b) next;
            }
        }
        next = null;
        return (k10.b) next;
    }

    public static final int z(j0.n nVar) {
        return (int) (nVar.f7783o == d0.q1.A ? nVar.g() & 4294967295L : nVar.g() >> 32);
    }

    public abstract d40.i A(String str);

    public abstract za.b0 H();

    public abstract za.b0 n(String str);

    public abstract za.b0 o(UUID uuid);

    public abstract List q(String str, List list);

    public void w(za.k0 k0Var) {
        kotlin.jvm.internal.m.e(k0Var, "request");
        List listR = va.a.R(k0Var);
        ab.y yVar = (ab.y) this;
        if (listR.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        new ab.q(yVar, null, za.l.B, listR, 0).n0();
    }

    public za.b0 x(String str, za.l lVar, za.y yVar) {
        kotlin.jvm.internal.m.e(str, "uniqueWorkName");
        kotlin.jvm.internal.m.e(yVar, "request");
        return new ab.q((ab.y) this, str, lVar, va.a.R(yVar), 0).n0();
    }
}
