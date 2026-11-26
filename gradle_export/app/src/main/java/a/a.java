package a;

import a1.y1;
import a10.a0;
import a10.x;
import a10.z;
import a40.w1;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.media3.common.x0;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import c3.c3;
import c3.o1;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.z3;
import e1.n;
import e30.a1;
import e30.h0;
import e30.m0;
import e30.p0;
import e30.q;
import e30.w;
import e30.z0;
import e7.i0;
import eh.y;
import f30.g;
import fh.d2;
import fh.t0;
import g1.z6;
import g10.i;
import g10.k;
import g20.j;
import g20.r;
import g30.l;
import h0.c1;
import h0.t1;
import h0.v1;
import h0.z1;
import h00.d0;
import hx.p;
import i2.s;
import i2.t;
import j10.e0;
import j10.q0;
import j10.r0;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringWriter;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import k10.h;
import k30.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.m1;
import l1.r1;
import m10.b0;
import q3.u;
import rs.f;
import s10.w0;
import t5.b;
import t5.d;
import ta.c0;
import u00.o;
import w50.c;
import x10.v;
import z4.k1;

public abstract class a {
    public static final Object E(b bVar, d dVar, Serializable serializable) {
        m.e(bVar, "<this>");
        m.e(dVar, "key");
        Object objC = bVar.c(dVar);
        return objC == null ? serializable : objC;
    }

    public static z I(x xVar) {
        m.e(xVar, "type");
        return new z(a0.A, xVar);
    }

    public static String J(e eVar, z10.e eVar2) {
        if (eVar.a(eVar2)) {
            return null;
        }
        return eVar.getDescription();
    }

    public static boolean K(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static boolean M(Throwable th2) {
        return Build.VERSION.SDK_INT == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean N(Throwable th2) {
        return Build.VERSION.SDK_INT == 34 && (th2 instanceof NoSuchMethodError) && th2.getMessage() != null && th2.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    public static boolean O(f fVar) {
        return fVar.c >= ((long) (fVar.d * 60));
    }

    public static long R(int i10, byte[] bArr) {
        return ((long) (((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16))) & 4294967295L;
    }

    public static final Object S(w wVar, r rVar, o oVar) throws NoWhenBranchMatchedException {
        w wVarE;
        r rVar2;
        Object objS;
        List list;
        j jVar;
        boolean z10;
        q qVarG;
        g20.f fVar = g20.f.d;
        m.e(wVar, "kotlinType");
        m.e(oVar, "writeGenericType");
        if (c.U(wVar)) {
            b0 b0Var = g10.q.a;
            c.U(wVar);
            i iVarC0 = ab.a0.c0(wVar);
            h annotations = wVar.getAnnotations();
            w wVarP = c.P(wVar);
            List listJ = c.J(wVar);
            List listQ = c.Q(wVar);
            ArrayList arrayList = new ArrayList(h00.r.q0(listQ, 10));
            Iterator it = listQ.iterator();
            while (it.hasNext()) {
                arrayList.add(((p0) it.next()).b());
            }
            h0.B.getClass();
            h0 h0Var = h0.C;
            m0 m0VarF = g10.q.a.f();
            c.S(wVar);
            w wVarB = ((p0) h00.q.T0(wVar.e0())).b();
            m.d(wVarB, "getType(...)");
            ArrayList arrayListZ0 = h00.q.Z0(e30.c.u(h0Var, m0VarF, va.a.R(ab.a0.p(wVarB)), false), arrayList);
            e30.a0 a0VarP = ab.a0.c0(wVar).p();
            m.d(a0VarP, "getNullableAnyType(...)");
            return S(c.x(iVarC0, annotations, wVarP, listJ, arrayListZ0, a0VarP, false).C0(wVar.t0()), rVar, oVar);
        }
        e30.a0 a0VarH = g.h(wVar);
        if (a0VarH == null && ((qVarG = g.g(wVar)) == null || (a0VarH = g.R(qVarG)) == null)) {
            a0VarH = g.h(wVar);
            m.b(a0VarH);
        }
        m0 m0VarA0 = g.a0(a0VarH);
        Object objD = null;
        if (g.C(m0VarA0)) {
            m.e(m0VarA0, "$receiver");
            if (!(m0VarA0 instanceof m0)) {
                throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, m0VarA0.getClass(), x5.r("ClassicTypeSystemContext couldn't handle: ", m0VarA0, ", ")).toString());
            }
            j10.e eVarG = m0VarA0.g();
            m.c(eVarG, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            k kVarU = i.u(eVarG);
            if (kVarU != null) {
                switch (kVarU.ordinal()) {
                    case 0:
                        jVar = g20.k.a;
                        break;
                    case 1:
                        jVar = g20.k.b;
                        break;
                    case 2:
                        jVar = g20.k.c;
                        break;
                    case 3:
                        jVar = g20.k.d;
                        break;
                    case 4:
                        jVar = g20.k.e;
                        break;
                    case 5:
                        jVar = g20.k.f;
                        break;
                    case 6:
                        jVar = g20.k.g;
                        break;
                    case 7:
                        jVar = g20.k.h;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                if (g.L(wVar)) {
                    z10 = true;
                } else {
                    n20.c cVar = v.p;
                    m.d(cVar, "ENHANCED_NULLABILITY_ANNOTATION");
                    if (g.y(wVar, cVar)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                objD = ca.v.q(jVar, z10);
            } else {
                m.e(m0VarA0, "$receiver");
                if (!(m0VarA0 instanceof m0)) {
                    throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, m0VarA0.getClass(), x5.r("ClassicTypeSystemContext couldn't handle: ", m0VarA0, ", ")).toString());
                }
                j10.e eVarG2 = m0VarA0.g();
                m.c(eVarG2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                k kVarS = i.s(eVarG2);
                if (kVarS != null) {
                    StringBuilder sb2 = new StringBuilder("[");
                    v20.c cVar2 = (v20.c) v20.c.N.get(kVarS);
                    if (cVar2 == null) {
                        v20.c.a(6);
                        throw null;
                    }
                    sb2.append(cVar2.c());
                    objD = g20.f.c(sb2.toString());
                } else {
                    m.e(m0VarA0, "$receiver");
                    if (!(m0VarA0 instanceof m0)) {
                        throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, m0VarA0.getClass(), x5.r("ClassicTypeSystemContext couldn't handle: ", m0VarA0, ", ")).toString());
                    }
                    j10.h hVarG = m0VarA0.g();
                    if (hVarG != null && i.J(hVarG)) {
                        m.e(m0VarA0, "$receiver");
                        if (!(m0VarA0 instanceof m0)) {
                            throw new IllegalArgumentException(x5.p(kotlin.jvm.internal.a0.a, m0VarA0.getClass(), x5.r("ClassicTypeSystemContext couldn't handle: ", m0VarA0, ", ")).toString());
                        }
                        j10.e eVarG3 = m0VarA0.g();
                        m.c(eVarG3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        n20.d dVarH = u20.d.h(eVarG3);
                        String str = i10.d.a;
                        n20.b bVarG = i10.d.g(dVarH);
                        if (bVarG != null) {
                            if (!rVar.d && ((list = i10.d.o) == null || !list.isEmpty())) {
                                Iterator it2 = list.iterator();
                                do {
                                    if (!it2.hasNext()) {
                                        objD = g20.f.d(v20.b.e(bVarG));
                                        break;
                                    }
                                } while (!((i10.c) it2.next()).a.equals(bVarG));
                            } else {
                                objD = g20.f.d(v20.b.e(bVarG));
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (objD != null) {
            Object objQ = ca.v.q(objD, rVar.a);
            oVar.invoke(wVar, objQ, rVar);
            return objQ;
        }
        e30.v vVarM0 = wVar.m0();
        if (vVarM0 instanceof e30.v) {
            e30.v vVar = vVarM0;
            w wVar2 = vVar.A;
            if (wVar2 != null) {
                return S(ab.a0.z0(wVar2), rVar, oVar);
            }
            LinkedHashSet linkedHashSet = vVar.B;
            m.e(linkedHashSet, "types");
            throw new AssertionError("There should be no intersection type in existing descriptors, but found: " + h00.q.R0(linkedHashSet, (CharSequence) null, (String) null, (String) null, (u00.k) null, 63));
        }
        j10.e eVarG4 = vVarM0.g();
        if (eVarG4 == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + wVar);
        }
        if (l.f(eVarG4)) {
            return g20.f.d("error/NonExistentClass");
        }
        boolean z11 = eVarG4 instanceof j10.e;
        if (z11 && i.z(wVar)) {
            if (wVar.e0().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            p0 p0Var = (p0) wVar.e0().get(0);
            w wVarB2 = p0Var.b();
            m.d(wVarB2, "getType(...)");
            if (p0Var.a() == a1.D) {
                objS = g20.f.d("java/lang/Object");
            } else {
                a1 a1VarA = p0Var.a();
                m.d(a1VarA, "getProjectionKind(...)");
                int iOrdinal = a1VarA.ordinal();
                if (iOrdinal == 0 ? (rVar2 = rVar.f) == null : !(iOrdinal == 1 ? (rVar2 = rVar.e) != null : (rVar2 = rVar.c) != null)) {
                    rVar2 = rVar;
                }
                objS = S(wVarB2, rVar2, oVar);
            }
            return g20.f.c("[" + g20.f.h((g20.k) objS));
        }
        if (!z11) {
            if (eVarG4 instanceof r0) {
                z0 z0VarG0 = ab.a0.g0((r0) eVarG4);
                if (wVar.t0()) {
                    z0VarG0 = ab.a0.n0(z0VarG0);
                }
                return S(z0VarG0, rVar, n30.c.A);
            }
            if ((eVarG4 instanceof q0) && rVar.g) {
                return S(((q0) eVarG4).Z0(), rVar, oVar);
            }
            throw new UnsupportedOperationException("Unknown type " + wVar);
        }
        if (q20.f.b(eVarG4) && !rVar.b && (wVarE = e30.c.e(wVar, new HashSet())) != null) {
            return S(wVarE, new r(rVar.a, true, rVar.c, rVar.d, rVar.e, rVar.f, rVar.g, rVar.h), oVar);
        }
        j10.e eVar = eVarG4;
        m.d(eVar.a(), "getOriginal(...)");
        if (eVar.getKind() == j10.f.D) {
            j10.k kVarL = eVar.l();
            m.c(kVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            eVar = (j10.e) kVarL;
        }
        j10.e eVarA = eVar.a();
        m.d(eVarA, "getOriginal(...)");
        g20.i iVarD = g20.f.d(n(eVarA, fVar));
        oVar.invoke(wVar, iVarD, rVar);
        return iVarD;
    }

    public static eh.x T(eh.x xVar) {
        if ((xVar instanceof eh.a0) || (xVar instanceof y)) {
            return xVar;
        }
        return xVar instanceof Serializable ? new y(xVar) : new eh.a0(xVar);
    }

    public static final c6.f U(c6.d... dVarArr) {
        ArrayList arrayList = new ArrayList(dVarArr.length);
        for (c6.d dVar : dVarArr) {
            arrayList.add(new g00.k(dVar.f2889a, dVar.f2890b));
        }
        g00.k[] kVarArr = (g00.k[]) arrayList.toArray(new g00.k[0]);
        g00.k[] kVarArr2 = (g00.k[]) Arrays.copyOf(kVarArr, kVarArr.length);
        m.e(kVarArr2, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(d0.P(kVarArr2.length));
        d0.W(linkedHashMap, kVarArr2);
        return new c6.f(linkedHashMap);
    }

    public static ha.i X(ma.a aVar, String str) {
        h00.y yVarC;
        AbstractSet abstractSet;
        m.e(aVar, "connection");
        ma.c cVarK0 = aVar.k0("PRAGMA table_info(`" + str + "`)");
        try {
            long j9 = 0;
            if (cVarK0.d0()) {
                int iP = c.p(cVarK0, "name");
                int iP2 = c.p(cVarK0, "type");
                int iP3 = c.p(cVarK0, "notnull");
                int iP4 = c.p(cVarK0, "pk");
                int iP5 = c.p(cVarK0, "dflt_value");
                i00.f fVar = new i00.f();
                do {
                    String strR = cVarK0.R(iP);
                    fVar.put(strR, new ha.f((int) cVarK0.getLong(iP4), 2, strR, cVarK0.R(iP2), cVarK0.isNull(iP5) ? null : cVarK0.R(iP5), cVarK0.getLong(iP3) != 0));
                } while (cVarK0.d0());
                yVarC = fVar.c();
                ca.v.s(cVarK0, null);
            } else {
                yVarC = h00.y.A;
                ca.v.s(cVarK0, null);
            }
            ma.c cVarK1 = aVar.k0("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int iP6 = c.p(cVarK1, "id");
                int iP7 = c.p(cVarK1, "seq");
                int iP8 = c.p(cVarK1, "table");
                int iP9 = c.p(cVarK1, "on_delete");
                int iP10 = c.p(cVarK1, "on_update");
                List listS = c0.S(cVarK1);
                cVarK1.reset();
                i00.i iVar = new i00.i();
                while (cVarK1.d0()) {
                    if (cVarK1.getLong(iP7) == j9) {
                        int i10 = (int) cVarK1.getLong(iP6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i11 = iP6;
                        ArrayList<ha.e> arrayList3 = new ArrayList();
                        for (Object obj : listS) {
                            int i12 = iP7;
                            List list = listS;
                            if (((ha.e) obj).A == i10) {
                                arrayList3.add(obj);
                            }
                            iP7 = i12;
                            listS = list;
                        }
                        int i13 = iP7;
                        List list2 = listS;
                        for (ha.e eVar : arrayList3) {
                            arrayList.add(eVar.C);
                            arrayList2.add(eVar.D);
                        }
                        iVar.add(new ha.g(cVarK1.R(iP8), cVarK1.R(iP9), cVarK1.R(iP10), arrayList, arrayList2));
                        iP6 = i11;
                        iP7 = i13;
                        listS = list2;
                        j9 = 0;
                    }
                }
                i00.i iVarM = c.m(iVar);
                ca.v.s(cVarK1, null);
                ma.c cVarK2 = aVar.k0("PRAGMA index_list(`" + str + "`)");
                try {
                    int iP11 = c.p(cVarK2, "name");
                    int iP12 = c.p(cVarK2, "origin");
                    int iP13 = c.p(cVarK2, "unique");
                    if (iP11 == -1 || iP12 == -1 || iP13 == -1) {
                        ca.v.s(cVarK2, null);
                        abstractSet = null;
                    } else {
                        i00.i iVar2 = new i00.i();
                        while (cVarK2.d0()) {
                            if ("c".equals(cVarK2.R(iP12))) {
                                ha.h hVarT = c0.T(aVar, cVarK2.R(iP11), cVarK2.getLong(iP13) == 1);
                                if (hVarT == null) {
                                    ca.v.s(cVarK2, null);
                                    abstractSet = null;
                                } else {
                                    iVar2.add(hVarT);
                                }
                            }
                        }
                        AbstractSet abstractSetM = c.m(iVar2);
                        ca.v.s(cVarK2, null);
                        abstractSet = abstractSetM;
                    }
                    return new ha.i(str, yVarC, iVarM, abstractSet);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ca.v.s(cVarK2, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    ca.v.s(cVarK1, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                ca.v.s(cVarK0, th6);
                throw th7;
            }
        }
    }

    public static final String Y(Reader reader) throws IOException {
        m.e(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i10 = reader.read(cArr);
        while (i10 >= 0) {
            stringWriter.write(cArr, 0, i10);
            i10 = reader.read(cArr);
        }
        String string = stringWriter.toString();
        m.d(string, "toString(...)");
        return string;
    }

    public static void Z(d7.a aVar) {
        aVar.f4733k = -3.4028235E38f;
        aVar.f4732j = Integer.MIN_VALUE;
        CharSequence charSequence = aVar.f4723a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                aVar.f4723a = SpannableString.valueOf(charSequence);
                aVar.f4724b = null;
            }
            CharSequence charSequence2 = aVar.f4723a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static final void a(n nVar, b2.d dVar, v1.c cVar, l1.j jVar, int i10) {
        int i11;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1090171650);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? g0Var.g(nVar) : g0Var.i(nVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.g(dVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.i(cVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if (g0Var.S(i11 & 1, (i11 & 147) != 146)) {
            boolean z10 = ((i11 & 14) == 4 || ((i11 & 8) != 0 && g0Var.g(nVar))) | ((i11 & 112) == 32);
            Object objN = g0Var.N();
            if (z10 || objN == l1.i.f9868a) {
                objN = new e1.l(dVar, nVar);
                g0Var.n0(objN);
            }
            c4.n.a((e1.l) objN, null, new c4.c0(false, true, c4.d0.A, false), cVar, g0Var, ((i11 << 3) & 7168) | 384, 2);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new bs.f(i10, 5, nVar, dVar, cVar);
        }
    }

    public static float a0(int i10, float f3, int i11, int i12) {
        float f10;
        if (f3 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i10 == 0) {
            f10 = i12;
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    return -3.4028235E38f;
                }
                return f3;
            }
            f10 = i11;
        }
        return f3 * f10;
    }

    public static final void b(String str, int i10, b2.r rVar, u00.a aVar, l1.j jVar, int i11, int i12) {
        b2.r rVar2;
        int i13;
        u00.a aVar2;
        int i14;
        b2.r rVar3;
        u00.a aVar3;
        m.e(str, "title");
        g0 g0Var = (g0) jVar;
        g0Var.e0(692700787);
        int i15 = i11 | (g0Var.g(str) ? 4 : 2) | (g0Var.e(i10) ? 32 : 16);
        int i16 = i12 & 4;
        if (i16 != 0) {
            i13 = i15 | 384;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i13 = i15 | (g0Var.g(rVar2) ? 256 : Cast.MAX_NAMESPACE_LENGTH);
        }
        int i17 = i12 & 8;
        if (i17 != 0) {
            i14 = i13 | 3072;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i14 = i13 | (g0Var.i(aVar2) ? 2048 : 1024);
        }
        if (g0Var.S(i14 & 1, (i14 & 1171) != 1170)) {
            b2.o oVar = b2.o.A;
            b2.r rVar4 = i16 != 0 ? oVar : rVar2;
            u00.a aVar4 = i17 != 0 ? null : aVar2;
            b2.r rVarE = h0.c.E(rVar4, 0.0f, 12, 1);
            v1 v1VarA = t1.a(h0.i.g(8), b2.b.K, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
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
            z3.k(g4.h0(i10, g0Var, (i14 & 112) | 6), null, z1.m(oVar, 24), dl.a.i, g0Var, 432);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            b2.r rVar5 = rVar4;
            u00.a aVar5 = aVar4;
            z6.b(str, new c1(1.0f, true), dl.a.n, kh.o.z(22), u.M, null, 0L, null, null, kh.o.z(22), 0, false, 0, 0, null, null, g0Var, (i14 & 14) | 1597440, 48, 260008);
            g0Var = g0Var;
            if (aVar5 == null) {
                g0Var.c0(1482496422);
                g0Var.r(false);
            } else {
                g0Var.c0(1482496423);
                z6.b(z3.U(g0Var, 2131886580), c.o(oVar, false, (j3.k) null, aVar5, 7), dl.a.m, kh.o.z(15), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, g0Var, 24576, 0, 262120);
                g0Var = g0Var;
                g0Var.r(false);
            }
            g0Var.r(true);
            aVar3 = aVar5;
            rVar3 = rVar5;
        } else {
            g0Var.V();
            rVar3 = rVar2;
            aVar3 = aVar2;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.a(str, i10, rVar3, aVar3, i11, i12);
        }
    }

    public static final void c(u00.a aVar, u00.k kVar, u00.k kVar2, z00.a aVar2, float f3, jk.a aVar3, b2.r rVar, l1.j jVar, int i10, int i11) {
        int i12;
        b2.r rVar2;
        boolean z10;
        g0 g0Var;
        b2.r rVar3;
        r1 r1VarT;
        b2.r rVar4;
        m.e(aVar, "value");
        m.e(kVar, "onValueChange");
        m.e(kVar2, "onValueChangeFinished");
        m.e(aVar3, "backdrop");
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(384366370);
        if ((i10 & 6) == 0) {
            i12 = (g0Var2.i(aVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= g0Var2.i(kVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= g0Var2.i(kVar2) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i12 |= g0Var2.g(aVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= g0Var2.d(f3) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= g0Var2.i(aVar3) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        int i13 = i11 & 64;
        if (i13 == 0) {
            if ((1572864 & i10) == 0) {
                rVar2 = rVar;
                i12 |= g0Var2.g(rVar2) ? 1048576 : 524288;
            }
            if ((599187 & i12) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (g0Var2.S(i12 & 1, z10)) {
                if (i13 != 0) {
                    rVar4 = b2.o.A;
                } else {
                    rVar4 = rVar2;
                }
                g0Var = g0Var2;
                h0.c.a(z1.d(rVar4, 1.0f), b2.b.D, false, v1.d.d(1115328376, new p(aVar, kk.e.d(g0Var2), aVar3, aVar2, f3, kVar2, kVar, 1), g0Var2), g0Var, 3120, 4);
                rVar3 = rVar4;
            } else {
                g0Var = g0Var2;
                g0Var.V();
                rVar3 = rVar2;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new sm.w(aVar, kVar, kVar2, aVar2, f3, aVar3, rVar3, i10, i11);
            }
        }
        i12 |= 1572864;
        rVar2 = rVar;
        if ((599187 & i12) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (g0Var2.S(i12 & 1, z10)) {
            if (i13 != 0) {
                rVar4 = b2.o.A;
            } else {
                rVar4 = rVar2;
            }
            g0Var = g0Var2;
            h0.c.a(z1.d(rVar4, 1.0f), b2.b.D, false, v1.d.d(1115328376, new p(aVar, kk.e.d(g0Var2), aVar3, aVar2, f3, kVar2, kVar, 1), g0Var2), g0Var, 3120, 4);
            rVar3 = rVar4;
        } else {
            g0Var = g0Var2;
            g0Var.V();
            rVar3 = rVar2;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new sm.w(aVar, kVar, kVar2, aVar2, f3, aVar3, rVar3, i10, i11);
        }
    }

    public static final void d(final n nVar, final boolean z10, final x3.j jVar, final boolean z11, long j9, final float f3, final b2.r rVar, l1.j jVar2, final int i10, final int i11) {
        int i12;
        long j10;
        long j11;
        final boolean z12;
        g0 g0Var = (g0) jVar2;
        g0Var.e0(-466280168);
        if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? g0Var.g(nVar) : g0Var.i(nVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= g0Var.h(z10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= g0Var.e(jVar.ordinal()) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i12 |= g0Var.h(z11) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            j10 = j9;
            i12 |= ((i11 & 16) == 0 && g0Var.f(j10)) ? 16384 : 8192;
        } else {
            j10 = j9;
        }
        if ((1572864 & i10) == 0) {
            i12 |= g0Var.g(rVar) ? 1048576 : 524288;
        }
        if (g0Var.S(i12 & 1, (533651 & i12) != 533650)) {
            g0Var.X();
            if ((i10 & 1) != 0 && !g0Var.A()) {
                g0Var.V();
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                }
            } else if ((i11 & 16) != 0) {
                i12 &= -57345;
                j10 = 9205357640488583168L;
            }
            g0Var.s();
            if (z10) {
                float f10 = e1.g0.f4962a;
                if ((jVar != x3.j.A || z11) && !(jVar == x3.j.B && z11)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
            } else {
                float f11 = e1.g0.f4962a;
                if ((jVar == x3.j.A && !z11) || (jVar == x3.j.B && z11)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
            }
            b2.f fVar = z12 ? b2.a.f1975b : b2.a.f1974a;
            int i13 = i12 & 14;
            boolean zH = ((i12 & 112) == 32) | (i13 == 4 || ((i12 & 8) != 0 && g0Var.i(nVar))) | g0Var.h(z12);
            Object objN = g0Var.N();
            if (zH || objN == l1.i.f9868a) {
                objN = new u00.k() {
                    public final Object invoke(Object obj) {
                        j3.a0 a0Var = (j3.a0) obj;
                        long jA = nVar.a();
                        a0Var.a(g0.f4964c, new f0(z10 ? q0.y0.B : q0.y0.C, jA, z12 ? e0.A : e0.C, (9223372034707292159L & jA) != 9205357640488583168L));
                        return g00.b0.a;
                    }
                };
                g0Var.n0(objN);
            }
            long j12 = j10;
            boolean z13 = z12;
            j11 = j12;
            a(nVar, fVar, v1.d.d(1365123137, new e1.b((c3) g0Var.k(o1.f2744t), j11, z13, j3.q.c(rVar, false, (u00.k) objN), nVar), g0Var), g0Var, i13 | 384);
        } else {
            g0Var.V();
            j11 = j10;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            final long j13 = j11;
            r1VarT.f9921d = new u00.n() {
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a.a.d(nVar, z10, jVar, z11, j13, f3, rVar, (l1.j) obj, l1.q.K(i10 | 1), i11);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void d0(Window window, boolean z10) {
        wb.o oVar = new wb.o(window.getDecorView());
        w0 k1Var = Build.VERSION.SDK_INT >= 35 ? new k1(window, oVar) : new w0(window, oVar);
        WindowInsetsController windowInsetsController = (WindowInsetsController) k1Var.B;
        if (!z10) {
            windowInsetsController.show(519);
        } else {
            k1Var.u();
            windowInsetsController.hide(519);
        }
    }

    public static final void e(int i10, b2.r rVar, l1.j jVar, u00.a aVar, boolean z10) {
        int i11;
        g0 g0Var = (g0) jVar;
        g0Var.e0(2111672474);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | (g0Var.i(aVar) ? 32 : 16) | (g0Var.h(z10) ? 256 : Cast.MAX_NAMESPACE_LENGTH);
        if (g0Var.S(i12 & 1, (i12 & 147) != 146)) {
            h0.c.h(b2.a.a(z1.n(rVar, e1.g0.f4962a, e1.g0.f4963b), new e1.f(aVar, z10)), g0Var);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.h(aVar, z10, rVar, i10);
        }
    }

    public static final void f(b6.m mVar, l1.j jVar, int i10) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1380468206);
        if ((((g0Var.g(mVar) ? 4 : 2) | i10) & 3) == 2 && g0Var.C()) {
            g0Var.V();
        } else {
            g0Var.d0(1849434622);
            Object objN = g0Var.N();
            if (objN == l1.i.f9868a) {
                objN = j6.r.A;
                g0Var.n0(objN);
            }
            g0Var.r(false);
            u00.a aVar = (a10.g) objN;
            g0Var.d0(-1115894518);
            g0Var.d0(1886828752);
            if (!(g0Var.f9842a instanceof b6.b)) {
                l1.q.w();
                throw null;
            }
            g0Var.a0();
            if (g0Var.S) {
                g0Var.l(new b6.n(0, aVar));
            } else {
                g0Var.q0();
            }
            l1.q.I(mVar, g0Var, new ir.b(29));
            g0Var.r(true);
            g0Var.r(false);
            g0Var.r(false);
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new y1(mVar, i10, 23);
        }
    }

    public static int f0(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int g(List list, ZoneId zoneId) {
        LocalDate localDateMinusDays;
        int i10 = 0;
        if (list.isEmpty()) {
            return 0;
        }
        int iP = d0.P(h00.r.q0(list, 10));
        if (iP < 16) {
            iP = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
        for (Object obj : list) {
            linkedHashMap.put(Instant.ofEpochSecond(((f) obj).b).atZone(zoneId).toLocalDate(), obj);
        }
        LocalDate localDateNow = LocalDate.now(zoneId);
        f fVar = (f) linkedHashMap.get(localDateNow);
        if (fVar != null) {
            boolean zO = O(fVar);
            localDateMinusDays = localDateNow.minusDays(1L);
            i10 = zO;
        } else {
            localDateMinusDays = localDateNow.minusDays(1L);
        }
        while (true) {
            f fVar2 = (f) linkedHashMap.get(localDateMinusDays);
            if (fVar2 == null || !O(fVar2)) {
                break;
            }
            i10++;
            localDateMinusDays = localDateMinusDays.minusDays(1L);
        }
        return i10;
    }

    public static void g0(byte[] bArr, long j9, int i10) {
        int i11 = 0;
        while (i11 < 4) {
            bArr[i10 + i11] = (byte) (255 & j9);
            i11++;
            j9 >>= 8;
        }
    }

    public static String h0(long j9) {
        int i10 = (int) (j9 >> 32);
        int i11 = (int) (j9 & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11)) {
            return "CornerRadius.circular(" + a10.h0.U(Float.intBitsToFloat(i10)) + ')';
        }
        return "CornerRadius.elliptical(" + a10.h0.U(Float.intBitsToFloat(i10)) + ", " + a10.h0.U(Float.intBitsToFloat(i11)) + ')';
    }

    public static x40.p m(x40.p pVar, x40.p pVar2) {
        db.g gVar = new db.g(9, (byte) 0);
        int size = pVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strC = pVar.c(i10);
            String strH = pVar.h(i10);
            if ((!"Warning".equalsIgnoreCase(strC) || !r30.r.x0(strH, "1", false)) && ("Content-Length".equalsIgnoreCase(strC) || "Content-Encoding".equalsIgnoreCase(strC) || "Content-Type".equalsIgnoreCase(strC) || !K(strC) || pVar2.a(strC) == null)) {
                gVar.g(strC, strH);
            }
        }
        int size2 = pVar2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            String strC2 = pVar2.c(i11);
            if (!"Content-Length".equalsIgnoreCase(strC2) && !"Content-Encoding".equalsIgnoreCase(strC2) && !"Content-Type".equalsIgnoreCase(strC2) && K(strC2)) {
                gVar.g(strC2, pVar2.h(i11));
            }
        }
        return gVar.j();
    }

    public static final String n(j10.e eVar, g20.f fVar) {
        m.e(eVar, "klass");
        m.e(fVar, "typeMappingConfiguration");
        m10.c0 c0VarL = eVar.l();
        m.d(c0VarL, "getContainingDeclaration(...)");
        n20.e name = eVar.getName();
        if (name != null) {
            n20.e eVar2 = n20.g.a;
            if (name.B) {
                name = n20.g.c;
            }
        } else {
            name = n20.g.c;
        }
        String strC = name.c();
        if (c0VarL instanceof e0) {
            n20.c cVar = ((e0) c0VarL).F;
            if (cVar.a.c()) {
                return strC;
            }
            return r30.r.u0(cVar.a.a, '.', '/') + '/' + strC;
        }
        j10.e eVar3 = c0VarL instanceof j10.e ? (j10.e) c0VarL : null;
        if (eVar3 == null) {
            throw new IllegalArgumentException("Unexpected container: " + c0VarL + " for " + eVar);
        }
        return n(eVar3, fVar) + '$' + strC;
    }

    public static byte[] o(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long jR = R(0, bArr) & 67108863;
        int i10 = 3;
        long jR2 = (R(3, bArr) >> 2) & 67108611;
        long jR3 = (R(6, bArr) >> 4) & 67092735;
        long jR4 = (R(9, bArr) >> 6) & 66076671;
        long jR5 = (R(12, bArr) >> 8) & 1048575;
        long j9 = jR2 * 5;
        long j10 = jR3 * 5;
        long j11 = jR4 * 5;
        long j12 = jR5 * 5;
        byte[] bArr3 = new byte[17];
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        int i11 = 0;
        while (i11 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i11);
            System.arraycopy(bArr2, i11, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long jR6 = j17 + (R(0, bArr3) & 67108863);
            long jR7 = j13 + ((R(i10, bArr3) >> 2) & 67108863);
            long jR8 = j14 + ((R(6, bArr3) >> 4) & 67108863);
            long jR9 = j15 + ((R(9, bArr3) >> 6) & 67108863);
            long j18 = jR2;
            long jR10 = j16 + (((R(12, bArr3) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
            long j19 = (jR10 * j9) + (jR9 * j10) + (jR8 * j11) + (jR7 * j12) + (jR6 * jR);
            long j20 = (jR10 * j10) + (jR9 * j11) + (jR8 * j12) + (jR7 * jR) + (jR6 * j18);
            long j21 = (jR10 * j11) + (jR9 * j12) + (jR8 * jR) + (jR7 * j18) + (jR6 * jR3);
            long j22 = (jR10 * j12) + (jR9 * jR) + (jR8 * j18) + (jR7 * jR3) + (jR6 * jR4);
            long j23 = jR9 * j18;
            long j24 = jR10 * jR;
            long j25 = j20 + (j19 >> 26);
            long j26 = j21 + (j25 >> 26);
            long j27 = j22 + (j26 >> 26);
            long j28 = j24 + j23 + (jR8 * jR3) + (jR7 * jR4) + (jR6 * jR5) + (j27 >> 26);
            long j29 = j28 >> 26;
            j16 = j28 & 67108863;
            long j30 = (j29 * 5) + (j19 & 67108863);
            i11 += 16;
            j14 = j26 & 67108863;
            j15 = j27 & 67108863;
            j17 = j30 & 67108863;
            j13 = (j25 & 67108863) + (j30 >> 26);
            jR2 = j18;
            i10 = 3;
        }
        long j31 = j14 + (j13 >> 26);
        long j32 = j31 & 67108863;
        long j33 = j15 + (j31 >> 26);
        long j34 = j33 & 67108863;
        long j35 = j16 + (j33 >> 26);
        long j36 = j35 & 67108863;
        long j37 = ((j35 >> 26) * 5) + j17;
        long j38 = j37 >> 26;
        long j39 = j37 & 67108863;
        long j40 = (j13 & 67108863) + j38;
        long j41 = j39 + 5;
        long j42 = j41 & 67108863;
        long j43 = j40 + (j41 >> 26);
        long j44 = j32 + (j43 >> 26);
        long j45 = j34 + (j44 >> 26);
        long j46 = j45 & 67108863;
        long j47 = (j36 + (j45 >> 26)) - 67108864;
        long j48 = j47 >> 63;
        long j49 = j39 & j48;
        long j50 = j40 & j48;
        long j51 = j32 & j48;
        long j52 = j34 & j48;
        long j53 = j36 & j48;
        long j54 = ~j48;
        long j55 = j50 | (j43 & 67108863 & j54);
        long j56 = j51 | (j44 & 67108863 & j54);
        long j57 = j52 | (j46 & j54);
        long j58 = (j49 | (j42 & j54) | (j55 << 26)) & 4294967295L;
        long j59 = ((j55 >> 6) | (j56 << 20)) & 4294967295L;
        long j60 = ((j56 >> 12) | (j57 << 14)) & 4294967295L;
        long j61 = ((j57 >> 18) | ((j53 | (j47 & j54)) << 8)) & 4294967295L;
        long jR11 = R(16, bArr) + j58;
        long j62 = jR11 & 4294967295L;
        long jR12 = R(20, bArr) + j59 + (jR11 >> 32);
        long jR13 = R(24, bArr) + j60 + (jR12 >> 32);
        long jR14 = (R(28, bArr) + j61 + (jR13 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        g0(bArr4, j62, 0);
        g0(bArr4, jR12 & 4294967295L, 4);
        g0(bArr4, jR13 & 4294967295L, 8);
        g0(bArr4, jR14, 12);
        return bArr4;
    }

    public static Parcelable p(Parcelable parcelable, Parcelable.Creator creator) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(parcelObtain);
        } finally {
            parcelObtain.recycle();
        }
    }

    public static ArrayList q(List list, Parcelable.Creator creator) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(p((Parcelable) list.get(i10), creator));
        }
        return arrayList;
    }

    public static final i2.d r(f2.d dVar, float f3) {
        int iCeil = ((int) Math.ceil(f3)) * 2;
        i2.d dVarF = a10.h0.b;
        i2.a aVarA = a10.h0.c;
        k2.b bVar = a10.h0.d;
        if (dVarF == null || aVarA == null) {
            dVarF = i2.b0.f(iCeil, iCeil, 1);
            a10.h0.b = dVarF;
            aVarA = i2.b0.a(dVarF);
            a10.h0.c = aVarA;
        } else {
            Bitmap bitmap = dVarF.f7117a;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
                dVarF = i2.b0.f(iCeil, iCeil, 1);
                a10.h0.b = dVarF;
                aVarA = i2.b0.a(dVarF);
                a10.h0.c = aVarA;
            }
        }
        i2.d dVar2 = dVarF;
        i2.a aVar = aVarA;
        if (bVar == null) {
            bVar = new k2.b();
            a10.h0.d = bVar;
        }
        k2.b bVar2 = bVar;
        k2.a aVar2 = bVar2.A;
        y3.m layoutDirection = dVar.A.getLayoutDirection();
        Bitmap bitmap2 = dVar2.f7117a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        y3.c cVar = aVar2.f8916a;
        y3.m mVar = aVar2.f8917b;
        s sVar = aVar2.f8918c;
        long j9 = aVar2.f8919d;
        aVar2.f8916a = dVar;
        aVar2.f8917b = layoutDirection;
        aVar2.f8918c = aVar;
        aVar2.f8919d = jFloatToRawIntBits;
        aVar.i();
        k2.d.R(bVar2, t.f7162b, 0L, bVar2.b(), 0.0f, null, 0, 58);
        k2.d.R(bVar2, i2.b0.d(4278190080L), 0L, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), 0.0f, null, 0, 120);
        k2.d.M(bVar2, i2.b0.d(4278190080L), f3, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), 0, 120);
        aVar.q();
        aVar2.f8916a = cVar;
        aVar2.f8917b = mVar;
        aVar2.f8918c = sVar;
        aVar2.f8919d = j9;
        return dVar2;
    }

    public static final e30.g0 s(j10.e eVar, j10.e eVar2) {
        m.e(eVar, "from");
        m.e(eVar2, "to");
        eVar.p().size();
        eVar2.p().size();
        List listP = eVar.p();
        m.d(listP, "getDeclaredTypeParameters(...)");
        ArrayList arrayList = new ArrayList(h00.r.q0(listP, 10));
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(((r0) it.next()).f());
        }
        List listP2 = eVar2.p();
        m.d(listP2, "getDeclaredTypeParameters(...)");
        ArrayList arrayList2 = new ArrayList(h00.r.q0(listP2, 10));
        Iterator it2 = listP2.iterator();
        while (it2.hasNext()) {
            e30.a0 a0VarN = ((r0) it2.next()).n();
            m.d(a0VarN, "getDefaultType(...)");
            arrayList2.add(ab.a0.p(a0VarN));
        }
        return new e30.g0(d0.Y(h00.q.t1(arrayList, arrayList2)), 1);
    }

    public static q5.b t(String str, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, int i10) {
        if ((i10 & 4) != 0) {
            replaceFileCorruptionHandler = null;
        }
        ReplaceFileCorruptionHandler replaceFileCorruptionHandler2 = replaceFileCorruptionHandler;
        h40.e eVar = a40.m0.a;
        h40.d dVar = h40.d.C;
        w1 w1VarE = a40.c0.e();
        dVar.getClass();
        return new q5.b(str, new o10.b(serializer, 12), replaceFileCorruptionHandler2, q5.a.A, a40.c0.c(rd.a.P(dVar, w1VarE)));
    }

    public static final boolean u(long j9, long j10) {
        return j9 == j10;
    }

    public static int v(boolean z10) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
        try {
            androidx.media3.common.s sVar = new androidx.media3.common.s();
            sVar.m = x0.n("video/avc");
            androidx.media3.common.t tVar = new androidx.media3.common.t(sVar);
            String str = tVar.f1594n;
            if (str != null) {
                List listC = p7.p.c(str, z10, false);
                String strA = p7.p.a(tVar);
                Iterable iterableC = strA == null ? d2.E : p7.p.c(strA, z10, false);
                fh.q0 q0VarM = t0.m();
                q0VarM.e(listC);
                q0VarM.e(iterableC);
                d2 d2VarG = q0VarM.g();
                for (int i10 = 0; i10 < d2VarG.D; i10++) {
                    if (((p7.k) d2VarG.get(i10)).f12398d != null && (videoCapabilities = ((p7.k) d2VarG.get(i10)).f12398d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint = new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
                        for (int i11 = 0; i11 < supportedPerformancePoints.size(); i11++) {
                            if (supportedPerformancePoints.get(i11).covers(performancePoint)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (MediaCodecUtil$DecoderQueryException unused) {
        }
        return 0;
    }

    public static n7.t w(g7.f fVar, String str, byte[] bArr, Map map) throws MediaDrmCallbackException {
        Map map2;
        List list;
        g7.r rVar = new g7.r(fVar);
        Map map3 = Collections.EMPTY_MAP;
        Uri uri = Uri.parse(str);
        c0.w(uri, "The uri must be set.");
        g7.j jVar = new g7.j(uri, 2, bArr, map, 0L, -1L, null, 1);
        int i10 = 0;
        g7.j jVar2 = jVar;
        while (true) {
            try {
                g7.h hVar = new g7.h(rVar, jVar2);
                try {
                    byte[] bArrB = gh.f.b(hVar);
                    s7.r rVar2 = new s7.r(jVar, rVar.C, rVar.D, SystemClock.elapsedRealtime(), bArrB.length);
                    h1.l lVar = new h1.l(bArrB);
                    lVar.B = rVar2;
                    n7.t tVar = new n7.t(lVar);
                    String str2 = i0.f5136a;
                    try {
                        hVar.close();
                    } catch (IOException unused) {
                    }
                    return tVar;
                } catch (HttpDataSource$InvalidResponseCodeException e3) {
                    try {
                        int i11 = e3.D;
                        String str3 = null;
                        if ((i11 == 307 || i11 == 308) && i10 < 5 && (map2 = e3.E) != null && (list = (List) map2.get("Location")) != null && !list.isEmpty()) {
                            str3 = (String) list.get(0);
                        }
                        if (str3 == null) {
                            throw e3;
                        }
                        i10++;
                        g7.i iVarA = jVar2.a();
                        Uri uri2 = Uri.parse(str3);
                        iVarA.f6213e = uri2;
                        c0.w(uri2, "The uri must be set.");
                        g7.j jVar3 = new g7.j((Uri) iVarA.f6213e, iVarA.f6209a, (byte[]) iVarA.f6214f, (Map) iVarA.f6215g, iVarA.f6210b, iVarA.f6212d, (String) iVarA.f6216h, iVarA.f6211c);
                        String str4 = i0.f5136a;
                        try {
                            hVar.close();
                        } catch (IOException unused2) {
                        }
                        jVar2 = jVar3;
                    } catch (Throwable th2) {
                        String str5 = i0.f5136a;
                        try {
                            hVar.close();
                        } catch (IOException unused3) {
                        }
                        throw th2;
                    }
                }
            } catch (Exception e10) {
                throw new MediaDrmCallbackException(jVar, rVar.C, rVar.A.r(), rVar.B, e10);
            }
        }
    }

    public static final int x(Bitmap bitmap) {
        int i10;
        if (bitmap.isRecycled()) {
            throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (Exception unused) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            Bitmap.Config config = bitmap.getConfig();
            if (config == Bitmap.Config.ALPHA_8) {
                i10 = 1;
            } else if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
                i10 = 2;
            } else {
                i10 = config == Bitmap.Config.RGBA_F16 ? 8 : 4;
            }
            return height * i10;
        }
    }

    public abstract InputFilter[] A(InputFilter[] inputFilterArr);

    public abstract int B();

    public abstract int C();

    public abstract int D();

    public abstract int F(View view);

    public abstract int G(CoordinatorLayout coordinatorLayout);

    public abstract int H();

    public abstract boolean L(float f3);

    public abstract boolean P(View view);

    public abstract boolean Q(float f3, float f10);

    public abstract void V(d4.f fVar, d4.f fVar2);

    public abstract void W(d4.f fVar, Thread thread);

    public abstract void b0(boolean z10);

    public abstract void c0(boolean z10);

    public abstract boolean e0(View view, float f3);

    public abstract int h(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float i(int i10);

    public abstract void i0(ViewGroup.MarginLayoutParams marginLayoutParams, int i10);

    public abstract boolean j(d4.g gVar, d4.c cVar, d4.c cVar2);

    public abstract void j0(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11);

    public abstract boolean k(d4.g gVar, Object obj, Object obj2);

    public abstract boolean l(d4.g gVar, d4.f fVar, d4.f fVar2);

    public abstract int y(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int z();
}
