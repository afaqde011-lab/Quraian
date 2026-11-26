package rd;

import a10.h0;
import a40.z;
import ab.a0;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewParent;
import bt.a2;
import ca.t;
import ca.y;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.internal.measurement.v4;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import d0.q1;
import d10.i2;
import d10.j1;
import e30.a1;
import e30.f0;
import e30.p0;
import e30.u0;
import g00.c0;
import g00.p;
import g1.m6;
import g1.o3;
import g1.t4;
import g1.z6;
import h0.v;
import h0.v1;
import h0.z1;
import h00.r;
import h1.x0;
import ha.b;
import i2.b0;
import i2.j0;
import i2.k0;
import i2.s;
import i2.s0;
import j10.l0;
import j10.r0;
import java.lang.annotation.Annotation;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import k0.q;
import k00.f;
import k00.g;
import k00.h;
import k00.i;
import k00.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import l0.o0;
import l1.g0;
import l1.m1;
import l1.r1;
import m0.o;
import m3.i0;
import n20.c;
import p10.d;
import p10.e;
import p40.w0;
import q3.u;
import ri.t1;
import u.w;
import u00.k;
import x3.l;
import z.n;
import z2.v0;

public abstract class a {
    public static void A(int i10, Parcel parcel) {
        if (parcel.dataPosition() != i10) {
            throw new SafeParcelReader$ParseException(x5.j(i10, "Overread allowed size end=", new StringBuilder(String.valueOf(i10).length() + 26)), parcel);
        }
    }

    public static final e B(Annotation[] annotationArr, c cVar) {
        m.e(annotationArr, "<this>");
        m.e(cVar, "fqName");
        for (Annotation annotation : annotationArr) {
            if (m.a(d.a(f.D(f.z(annotation))).a(), cVar)) {
                if (annotation != null) {
                    return new e(annotation);
                }
                return null;
            }
        }
        annotation = null;
        if (annotation != null) {
            return new e(annotation);
        }
        return null;
    }

    public static g C(g gVar, h hVar) {
        m.e(hVar, "key");
        if (m.a(gVar.getKey(), hVar)) {
            return gVar;
        }
        return null;
    }

    public static final m0.f D(o0 o0Var, int i10, long j9, o oVar, long j10, b2.h hVar, y3.m mVar, int i11, w wVar) {
        List list;
        q1 q1Var = q1.A;
        Object objB = oVar.b(i10);
        List list2 = (List) wVar.b(i10);
        if (list2 != null) {
            list = list2;
        } else {
            List listA = o0Var.a(i10);
            int size = listA.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                arrayList.add(((v0) listA.get(i12)).O(j9));
            }
            wVar.i(i10, arrayList);
            list = arrayList;
        }
        return new m0.f(i10, i11, list, j10, objB, hVar, mVar);
    }

    public static final ArrayList E(Annotation[] annotationArr) {
        m.e(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new e(annotation));
        }
        return arrayList;
    }

    public static final a10.d F(n40.e eVar) {
        m.e(eVar, "<this>");
        if (eVar instanceof w0) {
            return F(((w0) eVar).a);
        }
        return null;
    }

    public static final i G(t tVar, boolean z10, m00.c cVar) {
        y yVar = (y) cVar.getContext().get(y.B);
        k00.e eVar = yVar != null ? yVar.A : null;
        if (!tVar.k()) {
            f40.c cVar2 = tVar.f3090a;
            if (cVar2 == null) {
                m.k("coroutineScope");
                throw null;
            }
            i iVar = cVar2.A;
            if (eVar == null) {
                eVar = j.A;
            }
            return iVar.plus(eVar);
        }
        if (eVar != null) {
            f40.c cVar3 = tVar.f3090a;
            if (cVar3 != null) {
                return cVar3.A.plus(eVar);
            }
            m.k("coroutineScope");
            throw null;
        }
        if (z10) {
            i iVar2 = tVar.f3091b;
            if (iVar2 != null) {
                return iVar2;
            }
            m.k("transactionContext");
            throw null;
        }
        f40.c cVar4 = tVar.f3090a;
        if (cVar4 != null) {
            return cVar4.A;
        }
        m.k("coroutineScope");
        throw null;
    }

    public static final boolean H(l0 l0Var) {
        m.e(l0Var, "<this>");
        return l0Var.b() == null;
    }

    public static g00.h I(g00.i iVar, u00.a aVar) throws NoWhenBranchMatchedException {
        g00.y yVar = g00.y.a;
        m.e(aVar, "initializer");
        int iOrdinal = iVar.ordinal();
        if (iOrdinal == 0) {
            return new p(aVar);
        }
        if (iOrdinal == 1) {
            g00.o oVar = new g00.o();
            oVar.A = aVar;
            oVar.B = yVar;
            return oVar;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        c0 c0Var = new c0();
        c0Var.A = aVar;
        c0Var.B = yVar;
        return c0Var;
    }

    public static p J(u00.a aVar) {
        m.e(aVar, "initializer");
        return new p(aVar);
    }

    public static i K(g gVar, h hVar) {
        m.e(hVar, "key");
        return m.a(gVar.getKey(), hVar) ? j.A : gVar;
    }

    public static final int L(q qVar, q1 q1Var) {
        return (int) (q1Var == q1.A ? qVar.f8525t & 4294967295L : qVar.f8525t >> 32);
    }

    public static final Object M(t tVar, boolean z10, boolean z11, k kVar) {
        m.e(tVar, "db");
        ThreadLocal threadLocal = tVar.f3098i;
        tVar.a();
        if (tVar.k() && !tVar.l()) {
            i iVar = (i) threadLocal.get();
            if ((iVar != null ? (y) iVar.get(y.B) : null) != null) {
                throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
            }
        }
        j jVar = (i) threadLocal.get();
        if (jVar == null) {
            jVar = j.A;
        }
        return t1.J(new bz.q(jVar, tVar, z11, z10, kVar, (k00.c) null));
    }

    public static final Object N(t tVar, boolean z10, boolean z11, k kVar, k00.c cVar) {
        ha.d dVar;
        boolean z12;
        t tVar2;
        boolean z13;
        k kVar2;
        if (cVar instanceof ha.d) {
            dVar = (ha.d) cVar;
            int i10 = dVar.F;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.F = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new ha.d(cVar);
            }
        } else {
            dVar = new ha.d(cVar);
        }
        ha.d dVar2 = dVar;
        Object obj = dVar2.E;
        i iVar = l00.a.A;
        int i11 = dVar2.F;
        if (i11 == 0) {
            t1.O(obj);
            if (tVar.k() && tVar.n() && tVar.l()) {
                b bVar = new b(z11, z10, tVar, null, kVar, 1);
                dVar2.F = 1;
                Object objQ = tVar.q(z10, bVar, dVar2);
                if (objQ != iVar) {
                    return objQ;
                }
            } else {
                z12 = z10;
                dVar2.A = tVar;
                dVar2.B = kVar;
                dVar2.C = z12;
                dVar2.D = z11;
                dVar2.F = 2;
                i iVarG = G(tVar, z11, dVar2);
                if (iVarG != iVar) {
                    tVar2 = tVar;
                    obj = iVarG;
                    z13 = z11;
                    kVar2 = kVar;
                }
            }
        }
        if (i11 == 1) {
            t1.O(obj);
            return obj;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            return obj;
        }
        boolean z14 = dVar2.D;
        z12 = dVar2.C;
        k kVar3 = dVar2.B;
        t tVar3 = dVar2.A;
        t1.O(obj);
        z13 = z14;
        kVar2 = kVar3;
        tVar2 = tVar3;
        ha.c cVar2 = new ha.c((k00.c) null, tVar2, z12, z13, kVar2);
        dVar2.A = null;
        dVar2.B = null;
        dVar2.F = 3;
        Object objJ = a40.c0.J(cVar2, (i) obj, dVar2);
        return objJ == iVar ? iVar : objJ;
    }

    public static String O(X509Certificate x509Certificate) {
        m.e(x509Certificate, "certificate");
        return "sha256/" + f0(x509Certificate).a();
    }

    public static i P(g gVar, i iVar) {
        m.e(iVar, "context");
        return iVar == j.A ? gVar : (i) iVar.fold(gVar, new jk.c(7));
    }

    public static boolean Q(int i10, Parcel parcel) {
        l0(parcel, i10, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean R(int i10, Parcel parcel) {
        int iX = X(i10, parcel);
        if (iX == 0) {
            return null;
        }
        m0(parcel, iX, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static double S(int i10, Parcel parcel) {
        l0(parcel, i10, 8);
        return parcel.readDouble();
    }

    public static IBinder T(int i10, Parcel parcel) {
        int iX = X(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iX);
        return strongBinder;
    }

    public static int U(int i10, Parcel parcel) {
        l0(parcel, i10, 4);
        return parcel.readInt();
    }

    public static Integer V(int i10, Parcel parcel) {
        int iX = X(i10, parcel);
        if (iX == 0) {
            return null;
        }
        m0(parcel, iX, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long W(int i10, Parcel parcel) {
        l0(parcel, i10, 8);
        return parcel.readLong();
    }

    public static int X(int i10, Parcel parcel) {
        return (i10 & (-65536)) != -65536 ? (char) (i10 >> 16) : parcel.readInt();
    }

    public static Uri Y(Uri uri) {
        if (!uri.isHierarchical() || uri.getQueryParameter("CMCD") == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str : uri.getQueryParameterNames()) {
            if (!str.equals("CMCD")) {
                Iterator<String> it = uri.getQueryParameters(str).iterator();
                while (it.hasNext()) {
                    builderBuildUpon.appendQueryParameter(str, it.next());
                }
            }
        }
        return builderBuildUpon.build();
    }

    public static final e30.w Z(e30.w wVar, ArrayList arrayList) {
        f0 f0Var;
        wVar.e0().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(r.q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j30.d dVar = (j30.d) it.next();
            dVar.getClass();
            e30.w wVar2 = dVar.c;
            e30.w wVar3 = dVar.b;
            r0 r0Var = dVar.a;
            f30.d.a.b(wVar3, wVar2);
            if (m.a(wVar3, wVar2)) {
                f0Var = new f0(wVar3);
            } else {
                a1 a1VarF = r0Var.F();
                a1 a1Var = a1.D;
                if (a1VarF == a1Var) {
                    f0Var = new f0(wVar3);
                } else if (g10.i.F(wVar3) && r0Var.F() != a1Var) {
                    a1 a1Var2 = a1.E;
                    if (a1Var2 == r0Var.F()) {
                        a1Var2 = a1.C;
                    }
                    f0Var = new f0(wVar2, a1Var2);
                } else {
                    if (wVar2 == null) {
                        g10.i.a(140);
                        throw null;
                    }
                    if (g10.i.y(wVar2) && wVar2.t0()) {
                        if (a1Var == r0Var.F()) {
                            a1Var = a1.C;
                        }
                        f0Var = new f0(wVar3, a1Var);
                    } else {
                        a1 a1Var3 = a1.E;
                        if (a1Var3 == r0Var.F()) {
                            a1Var3 = a1.C;
                        }
                        f0Var = new f0(wVar2, a1Var3);
                    }
                }
            }
            arrayList2.add(f0Var);
        }
        return e30.c.q(wVar, arrayList2, (k10.h) null, 6);
    }

    public static final void a(u00.a aVar, l1.j jVar, int i10) {
        u00.a aVar2 = aVar;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1983476568);
        int i11 = i10 | (g0Var.i(aVar2) ? 4 : 2);
        if (g0Var.S(i11 & 1, (i11 & 3) != 2)) {
            m2.b bVarR = y3.R(2131231174, g0Var, 0);
            long j9 = dl.a.i;
            float f3 = 24;
            b2.o oVar = b2.o.A;
            o3.a(bVarR, null, z1.m(h0.c.G(oVar, 0.0f, f3, 0.0f, 0.0f, 13), 48), j9, g0Var, 440, 0);
            String strU = z3.U(g0Var, 2131886261);
            long j10 = dl.a.k;
            z6.b(strU, z1.d(h0.c.G(oVar, 0.0f, f3, 0.0f, 0.0f, 13), 1.0f), j10, kh.o.z(22), u.M, null, 0L, null, new x3.k(3), kh.o.z(28), 0, false, 0, 0, null, null, g0Var, 1597488, 48, 258984);
            z6.b(z3.U(g0Var, 2131886260), z1.d(h0.c.G(oVar, 0.0f, 12, 0.0f, 0.0f, 13), 1.0f), i2.t.b(0.7f, j10), kh.o.z(16), u.B, null, 0L, null, new x3.k(3), kh.o.z(22), 0, false, 0, 0, null, null, g0Var, 1597488, 48, 258984);
            b2.r rVarE = h0.c.E(w50.c.n(n.f(f2.h.c(z1.d(h0.c.G(oVar, 0.0f, 32, 0.0f, 0.0f, 13), 1.0f), p0.f.a(28)), j9, b0.f7111b), true, aVar), 0.0f, 16, 1);
            z2.w0 w0VarD = h0.o.d(b2.b.E, false);
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
            l1.q.I(w0VarD, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.f2040g);
            l1.q.E(g0Var, b3.h.f2041h);
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            aVar2 = aVar;
            z6.b(z3.U(g0Var, 2131886259), null, i2.t.f7162b, kh.o.z(16), u.D, null, 0L, null, null, kh.o.z(20), 0, false, 0, 0, null, null, g0Var, 1597824, 48, 260010);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new eu.d(aVar2, i10, 18);
        }
    }

    public static final float a0(long j9, float f3, y3.c cVar) {
        float fC;
        long jB = y3.o.b(j9);
        if (y3.p.a(jB, 4294967296L)) {
            if (cVar.t0() <= 1.05d) {
                return cVar.f1(j9);
            }
            fC = y3.o.c(j9) / y3.o.c(cVar.b0(f3));
        } else {
            if (!y3.p.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = y3.o.c(j9);
        }
        return fC * f3;
    }

    public static final void b(boolean z10, u00.a aVar, boolean z11, l1.j jVar, int i10) {
        int i11;
        g0 g0Var;
        r1 r1VarT;
        qz.e eVar;
        m.e(aVar, "onDismiss");
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(1932419190);
        if ((i10 & 6) == 0) {
            i11 = (g0Var2.h(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var2.i(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var2.h(z11) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if (g0Var2.S(i11 & 1, (i11 & 147) != 146)) {
            if (!z10) {
                r1VarT = g0Var2.t();
                if (r1VarT == null) {
                    return;
                } else {
                    eVar = new qz.e(z10, aVar, z11, i10, 0);
                }
            } else if (z11) {
                g0Var2.c0(-1041338127);
                c(aVar, g0Var2, (i11 >> 3) & 14);
                g0Var2.r(false);
                r1VarT = g0Var2.t();
                if (r1VarT == null) {
                    return;
                } else {
                    eVar = new qz.e(z10, aVar, z11, i10, 1);
                }
            } else {
                g0Var2.c0(-1041250676);
                g0Var2.r(false);
                m6 m6VarF = t4.f(true, null, g0Var2, 6, 2);
                Object objN = g0Var2.N();
                l1.c cVar = l1.i.f9868a;
                if (objN == cVar) {
                    objN = l1.q.o(g0Var2);
                    g0Var2.n0(objN);
                }
                z zVar = (z) objN;
                boolean zI = g0Var2.i(zVar) | g0Var2.g(m6VarF) | ((i11 & 112) == 32);
                Object objN2 = g0Var2.N();
                if (zI || objN2 == cVar) {
                    objN2 = new cz.c(zVar, m6VarF, aVar, 12);
                    g0Var2.n0(objN2);
                }
                u00.a aVar2 = (u00.a) objN2;
                g0Var = g0Var2;
                t4.a(aVar2, null, m6VarF, 0.0f, false, null, dl.a.q, 0L, 0.0f, 0L, null, new qs.c(16), null, v1.d.d(775550804, new x0(3, aVar2), g0Var2), g0Var, 0, 3078, 5050);
            }
            r1VarT.f9921d = eVar;
        }
        g0Var = g0Var2;
        g0Var.V();
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            eVar = new qz.e(z10, aVar, z11, i10, 2);
            r1VarT.f9921d = eVar;
        }
    }

    public static final void b0(Spannable spannable, long j9, int i10, int i11) {
        if (j9 != 16) {
            spannable.setSpan(new ForegroundColorSpan(b0.C(j9)), i10, i11, 33);
        }
    }

    public static final void c(u00.a aVar, l1.j jVar, int i10) {
        int i11;
        u00.a aVar2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-599496916);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.i(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if (g0Var.S(i11 & 1, (i11 & 3) != 2)) {
            aVar2 = aVar;
            qz.d.a(480, MediaError.DetailedErrorCode.TEXT_UNKNOWN, aVar2, false, dl.a.q, false, v1.d.d(-347971082, new eu.d(19, aVar), g0Var), g0Var, ((i11 << 6) & 896) | 1769526, 8);
        } else {
            aVar2 = aVar;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new po.i(aVar2, i10, 1);
        }
    }

    public static final void c0(Spannable spannable, long j9, y3.c cVar, int i10, int i11) {
        long jB = y3.o.b(j9);
        if (y3.p.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(w00.a.F(cVar.f1(j9)), false), i10, i11, 33);
        } else if (y3.p.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(y3.o.c(j9)), i10, i11, 33);
        }
    }

    public static final void d(b2.r rVar, l1.j jVar, int i10) throws NoWhenBranchMatchedException {
        long jZ;
        long jZ2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1266450669);
        int i11 = (g0Var.g(rVar) ? 4 : 2) | i10;
        if (g0Var.S(i11 & 1, (i11 & 3) != 2)) {
            b2.r rVarC = h0.c.C(n.f(f2.h.c(rVar, p0.f.a(20)), i2.t.b(0.08f, dl.a.i), b0.f7111b), 16);
            v vVarA = h0.u.a(h0.i.g(24), b2.b.M, g0Var, 6);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarC, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.f2040g);
            l1.q.E(g0Var, b3.h.f2041h);
            l1.q.I(rVarC2, g0Var, b3.h.f2037d);
            String strU = z3.U(g0Var, 2131887181);
            l1.t tVar = dl.e.a;
            int iOrdinal = ((gm.a) g0Var.k(tVar)).ordinal();
            if (iOrdinal == 0) {
                jZ = kh.o.z(13);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                jZ = kh.o.z(15);
            }
            int iOrdinal2 = ((gm.a) g0Var.k(tVar)).ordinal();
            if (iOrdinal2 == 0) {
                jZ2 = kh.o.z(18);
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                jZ2 = kh.o.z(20);
            }
            z6.b(strU, null, i2.t.b(0.5f, dl.a.k), jZ, u.B, null, 0L, null, null, jZ2, 0, false, 0, 0, null, null, g0Var, 1572864, 0, 260010);
            g0Var = g0Var;
            e(2131231367, z3.U(g0Var, 2131887180), z3.U(g0Var, 2131887178), g0Var, 0);
            e(2131231082, z3.U(g0Var, 2131886542), z3.U(g0Var, 2131886543), g0Var, 0);
            e(2131231360, z3.U(g0Var, 2131886540), z3.U(g0Var, 2131886541), g0Var, 0);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new bs.b(rVar, i10, 12);
        }
    }

    public static final void d0(Spannable spannable, t3.b bVar, int i10, int i11) {
        if (bVar != null) {
            ArrayList arrayList = new ArrayList(r.q0(bVar, 10));
            Iterator it = bVar.A.iterator();
            while (it.hasNext()) {
                arrayList.add(((t3.a) it.next()).f14352a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i10, i11, 33);
        }
    }

    public static final void e(int i10, String str, String str2, l1.j jVar, int i11) throws NoWhenBranchMatchedException {
        long jZ;
        long jZ2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-459337571);
        int i12 = (g0Var.e(i10) ? 4 : 2) | i11 | (g0Var.g(str) ? 32 : 16) | (g0Var.g(str2) ? 256 : Cast.MAX_NAMESPACE_LENGTH);
        if (g0Var.S(i12 & 1, (i12 & 147) != 146)) {
            v1 v1VarA = h0.t1.a(h0.i.g(8), b2.b.K, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.o oVar = b2.o.A;
            b2.r rVarC = b2.a.c(oVar, g0Var);
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
            o3.a(y3.R(i10, g0Var, i12 & 14), null, z1.m(oVar, 20), dl.a.i, g0Var, 440, 0);
            g0Var.c0(1412772432);
            m3.e eVar = new m3.e();
            long j9 = dl.a.k;
            int iE = eVar.e(new i0(j9, 0L, (u) null, (q3.o) null, (q3.p) null, (q3.i) null, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, 0L, (l) null, (s0) null, 65534));
            try {
                eVar.b(str);
                eVar.d(iE);
                g0Var.c0(1412777037);
                int iE2 = eVar.e(new i0(i2.t.b(0.5f, j9), 0L, (u) null, (q3.o) null, (q3.p) null, (q3.i) null, (String) null, 0L, (x3.a) null, (x3.p) null, (t3.b) null, 0L, (l) null, (s0) null, 65534));
                try {
                    eVar.b(" " + z3.U(g0Var, 2131887179) + " ");
                    eVar.b(str2);
                    eVar.d(iE2);
                    g0Var.r(false);
                    m3.h hVarF = eVar.f();
                    g0Var.r(false);
                    l1.t tVar = dl.e.a;
                    int iOrdinal = ((gm.a) g0Var.k(tVar)).ordinal();
                    if (iOrdinal == 0) {
                        jZ = kh.o.z(15);
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jZ = kh.o.z(17);
                    }
                    int iOrdinal2 = ((gm.a) g0Var.k(tVar)).ordinal();
                    if (iOrdinal2 == 0) {
                        jZ2 = kh.o.z(20);
                    } else {
                        if (iOrdinal2 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jZ2 = kh.o.z(22);
                    }
                    z6.c(hVarF, null, 0L, jZ, u.B, 0L, null, jZ2, 0, false, 0, 0, null, null, null, g0Var, 1572864, 0, 522158);
                    g0Var = g0Var;
                    g0Var.r(true);
                } catch (Throwable th2) {
                    eVar.d(iE2);
                    throw th2;
                }
            } catch (Throwable th3) {
                eVar.d(iE);
                throw th3;
            }
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.l(i10, i11, str, str2);
        }
    }

    public static void e0(View view, sg.i iVar) {
        mg.a aVar = iVar.B.f14152c;
        if (aVar == null || !aVar.f10898a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        sg.g gVar = iVar.B;
        if (gVar.m != elevation) {
            gVar.m = elevation;
            iVar.r();
        }
    }

    public static final j30.a f(e30.w wVar) throws NoWhenBranchMatchedException {
        j30.d dVar;
        j30.d dVar2;
        m.e(wVar, "type");
        if (e30.c.l(wVar)) {
            j30.a aVarF = f(e30.c.m(wVar));
            j30.a aVarF2 = f(e30.c.G(wVar));
            return new j30.a(e30.c.i(e30.c.f(e30.c.m((e30.w) aVarF.a), e30.c.G((e30.w) aVarF2.a)), wVar), e30.c.i(e30.c.f(e30.c.m((e30.w) aVarF.b), e30.c.G((e30.w) aVarF2.b)), wVar));
        }
        r20.b bVarM0 = wVar.m0();
        boolean z10 = true;
        if (wVar.m0() instanceof r20.b) {
            m.c(bVarM0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            p0 p0VarT = bVarM0.t();
            e30.w wVarB = p0VarT.b();
            m.d(wVarB, "getType(...)");
            e30.w wVarH = e30.x0.h(wVarB, wVar.t0());
            int iOrdinal = p0VarT.a().ordinal();
            if (iOrdinal == 1) {
                return new j30.a(wVarH, a0.c0(wVar).p());
            }
            if (iOrdinal == 2) {
                return new j30.a(e30.x0.h(a0.c0(wVar).o(), wVar.t0()), wVarH);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + p0VarT);
        }
        if (wVar.e0().isEmpty() || wVar.e0().size() != bVarM0.getParameters().size()) {
            return new j30.a(wVar, wVar);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listE0 = wVar.e0();
        List parameters = bVarM0.getParameters();
        m.d(parameters, "getParameters(...)");
        for (g00.k kVar : h00.q.t1(listE0, parameters)) {
            p0 p0Var = (p0) kVar.A;
            r0 r0Var = (r0) kVar.B;
            m.b(r0Var);
            a1 a1VarF = r0Var.F();
            if (a1VarF == null) {
                u0.a(35);
                throw null;
            }
            if (p0Var == null) {
                u0.a(36);
                throw null;
            }
            u0 u0Var = u0.b;
            int iOrdinal2 = (p0Var.c() ? a1.E : u0.b(a1VarF, p0Var.a())).ordinal();
            if (iOrdinal2 == 0) {
                e30.w wVarB2 = p0Var.b();
                m.d(wVarB2, "getType(...)");
                e30.w wVarB3 = p0Var.b();
                m.d(wVarB3, "getType(...)");
                dVar2 = new j30.d(r0Var, wVarB2, wVarB3);
            } else if (iOrdinal2 == 1) {
                e30.w wVarB4 = p0Var.b();
                m.d(wVarB4, "getType(...)");
                e30.a0 a0VarP = u20.d.e(r0Var).p();
                m.d(a0VarP, "getNullableAnyType(...)");
                dVar2 = new j30.d(r0Var, wVarB4, a0VarP);
            } else {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                e30.a0 a0VarO = u20.d.e(r0Var).o();
                e30.w wVarB5 = p0Var.b();
                m.d(wVarB5, "getType(...)");
                dVar2 = new j30.d(r0Var, a0VarO, wVarB5);
            }
            if (p0Var.c()) {
                arrayList.add(dVar2);
                arrayList2.add(dVar2);
            } else {
                j30.a aVarF3 = f(dVar2.b);
                e30.w wVar2 = (e30.w) aVarF3.a;
                e30.w wVar3 = (e30.w) aVarF3.b;
                j30.a aVarF4 = f(dVar2.c);
                e30.w wVar4 = (e30.w) aVarF4.a;
                e30.w wVar5 = (e30.w) aVarF4.b;
                r0 r0Var2 = dVar2.a;
                j30.d dVar3 = new j30.d(r0Var2, wVar3, wVar4);
                j30.d dVar4 = new j30.d(r0Var2, wVar2, wVar5);
                arrayList.add(dVar3);
                arrayList2.add(dVar4);
            }
        }
        if (arrayList.isEmpty()) {
            z10 = false;
            break;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            dVar = (j30.d) it.next();
            dVar.getClass();
        } while (f30.d.a.b(dVar.b, dVar.c));
        return new j30.a(z10 ? a0.c0(wVar).o() : Z(wVar, arrayList), Z(wVar, arrayList2));
    }

    public static k50.l f0(X509Certificate x509Certificate) {
        m.e(x509Certificate, "<this>");
        k50.l lVar = k50.l.D;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        m.d(encoded, "publicKey.encoded");
        return sg.f.M(encoded).c("SHA-256");
    }

    public static void g(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static final b2.r g0(float f3, int i10, long j9, b2.r rVar, boolean z10) {
        m.e(rVar, "$this$shimmer");
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 4) != 0) {
            j9 = dl.a.s;
        }
        return p30.f.k0(rVar, z11, j9, p0.f.a(f3), qd.s0.r0(dl.a.I));
    }

    public static void h(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void h0(int i10, Parcel parcel) {
        parcel.setDataPosition(parcel.dataPosition() + X(i10, parcel));
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final j1 i0(j10.e eVar) throws a40.b0 {
        Class clsI = i2.i(eVar);
        j1 j1Var = (j1) (clsI != null ? f.I(clsI) : null);
        if (j1Var != null) {
            return j1Var;
        }
        throw new a40.b0("Type parameter container is not resolved: " + eVar.l());
    }

    public static void j(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder sbP = oi.k.p(i10, i11, "fromIndex: ", ", toIndex: ", ", size: ");
            sbP.append(i12);
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(w.c.h(i10, i11, "fromIndex: ", " > toIndex: "));
        }
    }

    public static int j0(Parcel parcel) {
        int i10 = parcel.readInt();
        int iX = X(i10, parcel);
        char c10 = (char) i10;
        int iDataPosition = parcel.dataPosition();
        if (c10 != 20293) {
            throw new SafeParcelReader$ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i10))), parcel);
        }
        int i11 = iX + iDataPosition;
        if (i11 >= iDataPosition && i11 <= parcel.dataSize()) {
            return i11;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i11).length());
        sb2.append("Size read is invalid start=");
        sb2.append(iDataPosition);
        sb2.append(" end=");
        sb2.append(i11);
        throw new SafeParcelReader$ParseException(sb2.toString(), parcel);
    }

    public static int k(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    public static String k0(v4 v4Var) {
        StringBuilder sb2 = new StringBuilder(v4Var.c());
        for (int i10 = 0; i10 < v4Var.c(); i10++) {
            byte bA = v4Var.a(i10);
            if (bA == 34) {
                sb2.append("\\\"");
            } else if (bA == 39) {
                sb2.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bA >>> 6) & 3) + 48));
                            sb2.append((char) (((bA >>> 3) & 7) + 48));
                            sb2.append((char) ((bA & 7) + 48));
                        } else {
                            sb2.append((char) bA);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static Bundle l(int i10, Parcel parcel) {
        int iX = X(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iX);
        return bundle;
    }

    public static void l0(Parcel parcel, int i10, int i11) {
        int iX = X(i10, parcel);
        if (iX == i11) {
            return;
        }
        String hexString = Integer.toHexString(iX);
        int length = String.valueOf(i11).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iX).length() + 4 + 1);
        w.c.v(sb2, "Expected size ", i11, " got ", iX);
        throw new SafeParcelReader$ParseException(w.c.l(sb2, " (0x", hexString, ")"), parcel);
    }

    public static byte[] m(int i10, Parcel parcel) {
        int iX = X(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iX);
        return bArrCreateByteArray;
    }

    public static void m0(Parcel parcel, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        String hexString = Integer.toHexString(i10);
        int length = String.valueOf(i11).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i10).length() + 4 + 1);
        w.c.v(sb2, "Expected size ", i11, " got ", i10);
        throw new SafeParcelReader$ParseException(w.c.l(sb2, " (0x", hexString, ")"), parcel);
    }

    public static qd.s0 n(int i10) {
        if (i10 != 0 && i10 == 1) {
            return new sg.e();
        }
        return new sg.k();
    }

    public static final ea.l o(t tVar, boolean z10, String[] strArr, k kVar) {
        m.e(tVar, "db");
        ca.g gVarG = tVar.g();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        m.e(strArr2, "tables");
        ca.l0 l0Var = gVarG.f3039b;
        l0Var.getClass();
        i00.i iVar = new i00.i();
        for (String str : strArr2) {
            LinkedHashMap linkedHashMap = l0Var.f3055c;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            m.d(lowerCase, "toLowerCase(...)");
            Set set = (Set) linkedHashMap.get(lowerCase);
            if (set != null) {
                iVar.addAll(set);
            } else {
                iVar.add(str);
            }
        }
        String[] strArr3 = (String[]) w50.c.m(iVar).toArray(new String[0]);
        int length = strArr3.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str2 = strArr3[i10];
            LinkedHashMap linkedHashMap2 = l0Var.f3058f;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            m.d(lowerCase2, "toLowerCase(...)");
            Integer num = (Integer) linkedHashMap2.get(lowerCase2);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
            iArr[i10] = num.intValue();
        }
        g00.k kVar2 = new g00.k(strArr3, iArr);
        String[] strArr4 = (String[]) kVar2.A;
        int[] iArr2 = (int[]) kVar2.B;
        m.e(strArr4, "resolvedTableNames");
        m.e(iArr2, "tableIds");
        return new ea.l(d40.o.g(new a2(new a1.g(l0Var, iArr2, strArr4, (k00.c) null, 13)), -1), tVar, z10, kVar);
    }

    public static int[] p(int i10, Parcel parcel) {
        int iX = X(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iX);
        return iArrCreateIntArray;
    }

    public static ArrayList q(int i10, Parcel parcel) {
        int iX = X(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iX);
        return arrayList;
    }

    public static long[] r(int i10, Parcel parcel) {
        int iX = X(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        long[] jArrCreateLongArray = parcel.createLongArray();
        parcel.setDataPosition(iDataPosition + iX);
        return jArrCreateLongArray;
    }

    public static Parcelable s(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iX = X(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iX);
        return parcelable;
    }

    public static String t(int i10, Parcel parcel) {
        int iX = X(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iX);
        return string;
    }

    public static ArrayList u(int i10, Parcel parcel) {
        int iX = X(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iX);
        return arrayListCreateStringArrayList;
    }

    public static Object[] v(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iX = X(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iX);
        return objArrCreateTypedArray;
    }

    public static ArrayList w(Parcel parcel, int i10, Parcelable.Creator creator) {
        int iX = X(i10, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iX == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iX);
        return arrayListCreateTypedArrayList;
    }

    public static final void x(k2.d dVar, l2.b bVar) throws NoWhenBranchMatchedException {
        boolean z10;
        boolean z11;
        float f3;
        Matrix matrix;
        s sVarN = dVar.G0().n();
        l2.b bVar2 = (l2.b) dVar.G0().C;
        l2.c cVar = bVar.f9973a;
        RenderNode renderNode = cVar.f9997c;
        if (bVar.f9989s) {
            return;
        }
        bVar.a();
        if (!renderNode.hasDisplayList()) {
            try {
                l2.c cVar2 = bVar.f9973a;
                y3.c cVar3 = bVar.f9974b;
                y3.m mVar = bVar.f9975c;
                b3.a aVar = bVar.f9977e;
                k2.b bVar3 = cVar2.f9996b;
                RenderNode renderNode2 = cVar2.f9997c;
                RecordingCanvas recordingCanvasBeginRecording = renderNode2.beginRecording();
                try {
                    hf.c cVar4 = cVar2.f9995a;
                    i2.a aVar2 = (i2.a) cVar4.B;
                    Canvas canvas = aVar2.f7106a;
                    aVar2.f7106a = recordingCanvasBeginRecording;
                    a1.i iVar = bVar3.B;
                    iVar.z(cVar3);
                    iVar.B(mVar);
                    iVar.C = bVar;
                    iVar.C(cVar2.f9998d);
                    iVar.y(aVar2);
                    aVar.invoke(bVar3);
                    ((i2.a) cVar4.B).f7106a = canvas;
                    renderNode2.endRecording();
                } catch (Throwable th2) {
                    renderNode2.endRecording();
                    throw th2;
                }
            } catch (Throwable unused) {
            }
        }
        boolean z12 = cVar.f10007o > 0.0f;
        if (z12) {
            sVarN.t();
        }
        Canvas canvasA = i2.b.a(sVarN);
        boolean zIsHardwareAccelerated = canvasA.isHardwareAccelerated();
        if (zIsHardwareAccelerated) {
            z10 = z12;
        } else {
            long j9 = bVar.f9990t;
            float f10 = (int) (j9 >> 32);
            float f11 = (int) (j9 & 4294967295L);
            long j10 = bVar.f9991u;
            float f12 = f10 + ((int) (j10 >> 32));
            float f13 = ((int) (j10 & 4294967295L)) + f11;
            float f14 = cVar.f10002h;
            i2.m mVar2 = cVar.f10004j;
            int i10 = cVar.f10003i;
            if (f14 >= 1.0f && i10 == 3 && mVar2 == null) {
                z10 = z12;
                if (cVar.f10016x != 1) {
                    canvasA.save();
                    canvasA = canvasA;
                    f3 = f10;
                }
                canvasA.translate(f3, f11);
                matrix = cVar.f10000f;
                if (matrix == null) {
                    matrix = new Matrix();
                    cVar.f10000f = matrix;
                }
                renderNode.getMatrix(matrix);
                canvasA.concat(matrix);
            } else {
                z10 = z12;
            }
            i2.e eVarG = bVar.f9986p;
            if (eVarG == null) {
                eVarG = b0.g();
                bVar.f9986p = eVarG;
            }
            eVarG.c(f14);
            eVarG.d(i10);
            eVarG.f(mVar2);
            canvasA = canvasA;
            f3 = f10;
            canvasA.saveLayer(f3, f11, f12, f13, b0.o(eVarG));
            canvasA.translate(f3, f11);
            matrix = cVar.f10000f;
            if (matrix == null) {
                matrix = new Matrix();
                cVar.f10000f = matrix;
            }
            renderNode.getMatrix(matrix);
            canvasA.concat(matrix);
        }
        boolean z13 = !zIsHardwareAccelerated && bVar.f9993w;
        if (z13) {
            sVarN.i();
            i2.l0 l0VarD = bVar.d();
            if (l0VarD instanceof j0) {
                s.s(sVarN, ((j0) l0VarD).f7140a);
            } else if (l0VarD instanceof k0) {
                i2.g gVarA = bVar.m;
                if (gVarA != null) {
                    gVarA.i();
                } else {
                    gVarA = i2.j.a();
                    bVar.m = gVarA;
                }
                i2.g.c(gVarA, ((k0) l0VarD).f7142a);
                sVarN.e(gVarA);
            } else {
                if (!(l0VarD instanceof i2.i0)) {
                    throw new NoWhenBranchMatchedException();
                }
                sVarN.e(((i2.i0) l0VarD).f7139a);
            }
        }
        if (bVar2 != null) {
            b50.e eVar = bVar2.f9988r;
            if (!eVar.a) {
                i2.f0.a("Only add dependencies during a tracking");
            }
            u.j0 j0Var = (u.j0) eVar.d;
            if (j0Var != null) {
                j0Var.a(bVar);
            } else if (((l2.b) eVar.b) != null) {
                u.j0 j0Var2 = u.r0.f14890a;
                u.j0 j0Var3 = new u.j0();
                l2.b bVar4 = (l2.b) eVar.b;
                m.b(bVar4);
                j0Var3.a(bVar4);
                j0Var3.a(bVar);
                eVar.d = j0Var3;
                eVar.b = null;
            } else {
                eVar.b = bVar;
            }
            u.j0 j0Var4 = (u.j0) eVar.e;
            if (j0Var4 != null) {
                z11 = !j0Var4.l(bVar);
            } else if (((l2.b) eVar.c) != bVar) {
                z11 = true;
            } else {
                eVar.c = null;
                z11 = false;
            }
            if (z11) {
                bVar.f9987q++;
            }
        }
        if (i2.b.a(sVarN).isHardwareAccelerated()) {
            i2.b.a(sVarN).drawRenderNode(renderNode);
        } else {
            k2.b bVar5 = bVar.f9985o;
            if (bVar5 == null) {
                bVar5 = new k2.b();
                bVar.f9985o = bVar5;
            }
            a1.i iVar2 = bVar5.B;
            y3.c cVar5 = bVar.f9974b;
            y3.m mVar3 = bVar.f9975c;
            long jM0 = kh.n.m0(bVar.f9991u);
            y3.c cVarO = iVar2.o();
            y3.m mVarP = iVar2.p();
            s sVarN2 = iVar2.n();
            long jQ = iVar2.q();
            l2.b bVar6 = (l2.b) iVar2.C;
            iVar2.z(cVar5);
            iVar2.B(mVar3);
            iVar2.y(sVarN);
            iVar2.C(jM0);
            iVar2.C = bVar;
            sVarN.i();
            try {
                bVar.c(bVar5);
                sVarN.q();
                iVar2.z(cVarO);
                iVar2.B(mVarP);
                iVar2.y(sVarN2);
                iVar2.C(jQ);
                iVar2.C = bVar6;
            } catch (Throwable th3) {
                sVarN.q();
                iVar2.z(cVarO);
                iVar2.B(mVarP);
                iVar2.y(sVarN2);
                iVar2.C(jQ);
                iVar2.C = bVar6;
                throw th3;
            }
        }
        if (z13) {
            sVarN.q();
        }
        if (z10) {
            sVarN.j();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasA.restore();
    }

    public static final void y(ma.a aVar) {
        m.e(aVar, "connection");
        i00.b bVarS = va.a.s();
        ma.c cVarK0 = aVar.k0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cVarK0.d0()) {
            try {
                bVarS.add(cVarK0.R(0));
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ca.v.s(cVarK0, th2);
                    throw th3;
                }
            }
        }
        ca.v.s(cVarK0, null);
        ListIterator listIterator = va.a.k(bVarS).listIterator(0);
        while (true) {
            b3.q qVar = (b3.q) listIterator;
            if (!qVar.hasNext()) {
                return;
            }
            String str = (String) qVar.next();
            if (r30.r.x0(str, "room_fts_content_sync_", false)) {
                h0.v(aVar, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static void z(o40.d dVar, l40.a aVar, Object obj) {
        m.e(aVar, "serializer");
        if (aVar.getDescriptor().c()) {
            dVar.y(aVar, obj);
        } else if (obj == null) {
            dVar.d();
        } else {
            dVar.y(aVar, obj);
        }
    }
}
