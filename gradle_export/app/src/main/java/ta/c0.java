package ta;

import a10.h0;
import a40.u1;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.glance.session.TimeoutCancellationException;
import b3.o0;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.quranify.QuranifyApplication;
import d00.r0;
import g1.y1;
import g1.z6;
import i20.h1;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import k9.b3;
import l1.g0;
import l1.m1;
import l1.r1;
import l1.z0;
import p40.n0;
import qd.s0;
import ri.t1;
import x.b1;
import z2.w0;

public abstract class c0 {

    public static Context f14430a;

    public static Boolean f14431b;

    public static void A(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static final void B(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException((i10 != i11 ? g4.c.e(i10, i11, "Both size ", " and step ", " must be greater than zero.") : g4.c.i("size ", i10, " must be greater than zero.")).toString());
        }
    }

    public static final void C(Closeable closeable, Throwable th2) throws IOException {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                s0.V(th2, th3);
            }
        }
    }

    public static k20.j D(h1 h1Var) {
        kotlin.jvm.internal.m.e(h1Var, "table");
        if (h1Var.B.size() == 0) {
            return k20.j.b;
        }
        List list = h1Var.B;
        kotlin.jvm.internal.m.d(list, "getRequirementList(...)");
        return new k20.j(list);
    }

    public static x40.x E(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return x40.x.B;
        }
        if (str.equals("http/1.1")) {
            return x40.x.C;
        }
        if (str.equals("h2_prior_knowledge")) {
            return x40.x.F;
        }
        if (str.equals("h2")) {
            return x40.x.E;
        }
        if (str.equals("spdy/3.1")) {
            return x40.x.D;
        }
        if (str.equals("quic")) {
            return x40.x.G;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public static final s50.a F(QuranifyApplication quranifyApplication) {
        if (quranifyApplication instanceof t50.a) {
            return t50.a.c();
        }
        s50.a aVar = u50.a.b;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("KoinApplication has not been started");
    }

    public static final l40.a G(l40.a aVar) {
        kotlin.jvm.internal.m.e(aVar, "<this>");
        return aVar.getDescriptor().c() ? aVar : new n0(aVar);
    }

    public static o10.c H(a30.x xVar, boolean z10, boolean z11, Boolean bool, boolean z12, hf.c cVar, k20.f fVar) {
        g20.g gVar;
        o10.c cVar2;
        a30.v vVar;
        i20.j jVar;
        kotlin.jvm.internal.m.e(xVar, "container");
        g20.g gVar2 = (j10.n0) xVar.D;
        kotlin.jvm.internal.m.e(fVar, "metadataVersion");
        i20.j jVar2 = i20.j.C;
        if (z10) {
            if (bool == null) {
                throw new IllegalStateException(("isConst should not be null for property (container=" + xVar + ')').toString());
            }
            if (xVar instanceof a30.v) {
                a30.v vVar2 = (a30.v) xVar;
                if (vVar2.H == jVar2) {
                    return h0.w(cVar, vVar2.G.d(n20.e.e("DefaultImpls")), fVar);
                }
            }
            if (bool.booleanValue() && (xVar instanceof a30.w)) {
                g20.g gVar3 = gVar2 instanceof g20.g ? gVar2 : null;
                v20.b bVar = gVar3 != null ? gVar3.B : null;
                if (bVar != null) {
                    String strD = bVar.d();
                    kotlin.jvm.internal.m.d(strD, "getInternalName(...)");
                    n20.c cVar3 = new n20.c(r30.r.u0(strD, '/', '.'));
                    return h0.w(cVar, new n20.b(cVar3.b(), cVar3.a.g()), fVar);
                }
            }
        }
        if (z11 && (xVar instanceof a30.v)) {
            a30.v vVar3 = (a30.v) xVar;
            if (vVar3.H == i20.j.F && (vVar = vVar3.F) != null && ((jVar = vVar.H) == i20.j.B || jVar == i20.j.D || (z12 && (jVar == jVar2 || jVar == i20.j.E)))) {
                g20.o oVar = (j10.n0) ((a30.x) vVar).D;
                g20.o oVar2 = oVar instanceof g20.o ? oVar : null;
                if (oVar2 != null) {
                    return oVar2.A;
                }
            } else if (xVar instanceof a30.w) {
                gVar = gVar2;
                cVar2 = gVar.C;
                if (cVar2 == null) {
                    return h0.w(cVar, gVar.b(), fVar);
                }
                return cVar2;
            }
        } else if ((xVar instanceof a30.w) && (gVar2 instanceof g20.g)) {
            gVar = gVar2;
            cVar2 = gVar.C;
            if (cVar2 == null) {
                return h0.w(cVar, gVar.b(), fVar);
            }
            return cVar2;
        }
        return null;
    }

    public static boolean I(int i10, Rect rect, Rect rect2) {
        if (i10 == 17) {
            int i11 = rect.right;
            int i12 = rect2.right;
            return (i11 > i12 || rect.left >= i12) && rect.left > rect2.left;
        }
        if (i10 == 33) {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            return (i13 > i14 || rect.top >= i14) && rect.top > rect2.top;
        }
        if (i10 == 66) {
            int i15 = rect.left;
            int i16 = rect2.left;
            return (i15 < i16 || rect.right <= i16) && rect.right < rect2.right;
        }
        if (i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        return (i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom;
    }

    public static synchronized boolean J(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f14430a;
        if (context2 != null && (bool = f14431b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f14431b = null;
        Boolean boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        f14431b = boolValueOf;
        f14430a = applicationContext;
        return boolValueOf.booleanValue();
    }

    public static boolean K(byte b7) {
        return b7 > -65;
    }

    public static boolean L(byte b7) {
        return b7 > -65;
    }

    public static u1 M(a40.z zVar, k00.i iVar, u00.n nVar, u00.k kVar, u00.n nVar2, int i10) {
        if ((i10 & 1) != 0) {
            iVar = k00.j.A;
        }
        a40.a0 a0Var = a40.a0.A;
        u00.n nVar3 = (i10 & 4) != 0 ? null : nVar;
        if ((i10 & 8) != 0) {
            kVar = new rm.b(1, (k00.c) null, 1);
        }
        q50.b bVar = new q50.b(9);
        kotlin.jvm.internal.m.e(zVar, "<this>");
        kotlin.jvm.internal.m.e(iVar, "context");
        return a40.c0.x(zVar, iVar, a0Var, new androidx.lifecycle.n0(nVar2, nVar3, (u00.a) bVar, kVar, (k00.c) null));
    }

    public static int N(int i10, Rect rect, Rect rect2) {
        int i11;
        int i12;
        if (i10 == 17) {
            i11 = rect.left;
            i12 = rect2.right;
        } else if (i10 == 33) {
            i11 = rect.top;
            i12 = rect2.bottom;
        } else if (i10 == 66) {
            i11 = rect2.left;
            i12 = rect.right;
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i11 = rect2.top;
            i12 = rect.bottom;
        }
        return Math.max(0, i11 - i12);
    }

    public static int O(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final b60.b P() {
        ot.e eVar = ot.e.E;
        String lowerCase = "TRANSCRIPTION".toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        return new b60.b(lowerCase);
    }

    public static c50.h Q(String str) throws ProtocolException {
        int i10;
        String strSubstring;
        kotlin.jvm.internal.m.e(str, "statusLine");
        boolean zX0 = r30.r.x0(str, "HTTP/1.", false);
        x40.x xVar = x40.x.B;
        if (zX0) {
            i10 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                xVar = x40.x.C;
            }
        } else {
            if (!r30.r.x0(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i10 = 4;
        }
        int i11 = i10 + 3;
        if (str.length() < i11) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String strSubstring2 = str.substring(i10, i11);
            kotlin.jvm.internal.m.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            int i12 = Integer.parseInt(strSubstring2);
            if (str.length() <= i11) {
                strSubstring = RuntimeVersion.SUFFIX;
            } else {
                if (str.charAt(i11) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i10 + 4);
                kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String).substring(startIndex)");
            }
            return new c50.h(i12, 0, xVar, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static w5.b R(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j9;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i10 = byteBufferDuplicate.getShort() & 65535;
        if (i10 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                j9 = -1;
                break;
            }
            int i12 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j9 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i12) {
                break;
            }
            i11++;
        }
        if (j9 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j9 - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j10 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i13 = 0; i13 < j10; i13++) {
                int i14 = byteBufferDuplicate.getInt();
                long j11 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i14 || 1701669481 == i14) {
                    byteBufferDuplicate.position((int) (j11 + j9));
                    w5.b bVar = new w5.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    ((i00.e) bVar).D = byteBufferDuplicate;
                    ((i00.e) bVar).A = iPosition;
                    int i15 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    ((i00.e) bVar).B = i15;
                    ((i00.e) bVar).C = ((ByteBuffer) ((i00.e) bVar).D).getShort(i15);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final List S(ma.c cVar) {
        int iP = w50.c.p(cVar, "id");
        int iP2 = w50.c.p(cVar, "seq");
        int iP3 = w50.c.p(cVar, "from");
        int iP4 = w50.c.p(cVar, "to");
        i00.b bVarS = va.a.s();
        while (cVar.d0()) {
            bVarS.add(new ha.e((int) cVar.getLong(iP), (int) cVar.getLong(iP2), cVar.R(iP3), cVar.R(iP4)));
        }
        return h00.q.h1(va.a.k(bVarS));
    }

    public static final ha.h T(ma.a aVar, String str, boolean z10) {
        ma.c cVarK0 = aVar.k0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iP = w50.c.p(cVarK0, "seqno");
            int iP2 = w50.c.p(cVarK0, "cid");
            int iP3 = w50.c.p(cVarK0, "name");
            int iP4 = w50.c.p(cVarK0, "desc");
            if (iP != -1 && iP2 != -1 && iP3 != -1 && iP4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (cVarK0.d0()) {
                    if (((int) cVarK0.getLong(iP2)) >= 0) {
                        int i10 = (int) cVarK0.getLong(iP);
                        String strR = cVarK0.R(iP3);
                        String str2 = cVarK0.getLong(iP4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i10), strR);
                        linkedHashMap2.put(Integer.valueOf(i10), str2);
                    }
                }
                List listI1 = h00.q.i1(linkedHashMap.entrySet(), new ba.m(5));
                ArrayList arrayList = new ArrayList(h00.r.q0(listI1, 10));
                Iterator it = listI1.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listN1 = h00.q.n1(arrayList);
                List listI2 = h00.q.i1(linkedHashMap2.entrySet(), new ba.m(6));
                ArrayList arrayList2 = new ArrayList(h00.r.q0(listI2, 10));
                Iterator it2 = listI2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                ha.h hVar = new ha.h(str, z10, listN1, h00.q.n1(arrayList2));
                ca.v.s(cVarK0, null);
                return hVar;
            }
            ca.v.s(cVarK0, null);
            return null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ca.v.s(cVarK0, th2);
                throw th3;
            }
        }
    }

    public static final void U(a5.g gVar, j3.s sVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f187a;
        Object objG = sVar.k().A.g(j3.w.f7983f);
        if (objG == null) {
            objG = null;
        }
        j3.d dVar = (j3.d) objG;
        if (dVar != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(dVar.f7930a, dVar.f7931b, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object objG2 = sVar.k().A.g(j3.w.f7982e);
        if ((objG2 != null ? objG2 : null) != null) {
            List listJ = j3.s.j(4, sVar);
            int size = listJ.size();
            for (int i10 = 0; i10 < size; i10++) {
                j3.s sVar2 = (j3.s) listJ.get(i10);
                if (sVar2.k().A.c(j3.w.K)) {
                    arrayList.add(sVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zN = n(arrayList);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(zN ? 1 : arrayList.size(), zN ? arrayList.size() : 1, false, 0));
    }

    public static final void V(a5.g gVar, j3.s sVar) {
        Object objG = sVar.k().A.g(j3.w.f7984g);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            throw new ClassCastException();
        }
        j3.s sVarL = sVar.l();
        if (sVarL == null) {
            return;
        }
        Object objG2 = sVarL.k().A.g(j3.w.f7982e);
        if (objG2 == null) {
            objG2 = null;
        }
        if (objG2 != null) {
            Object objG3 = sVarL.k().A.g(j3.w.f7983f);
            j3.d dVar = (j3.d) (objG3 != null ? objG3 : null);
            if (dVar == null || (dVar.f7930a >= 0 && dVar.f7931b >= 0)) {
                if (sVar.k().A.c(j3.w.K)) {
                    ArrayList arrayList = new ArrayList();
                    List listJ = j3.s.j(4, sVarL);
                    int size = listJ.size();
                    int i10 = 0;
                    for (int i11 = 0; i11 < size; i11++) {
                        j3.s sVar2 = (j3.s) listJ.get(i11);
                        if (sVar2.k().A.c(j3.w.K)) {
                            arrayList.add(sVar2);
                            if (sVar2.f7967c.y() < sVar.f7967c.y()) {
                                i10++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zN = n(arrayList);
                    int i12 = zN ? 0 : i10;
                    int i13 = zN ? i10 : 0;
                    Object objG4 = sVar.k().A.g(j3.w.K);
                    if (objG4 == null) {
                        objG4 = Boolean.FALSE;
                    }
                    gVar.i(a5.f.a(((Boolean) objG4).booleanValue(), i12, 1, i13, 1));
                }
            }
        }
    }

    public static final e00.c W(e00.d dVar, r0 r0Var, o0 o0Var) {
        e00.c cVarS;
        kotlin.jvm.internal.m.e(r0Var, "context");
        boolean zIsHardwareAccelerated = i2.b.a(o0Var.A.B.n()).isHardwareAccelerated();
        float f3 = e00.f.a;
        if (zIsHardwareAccelerated) {
            e00.c cVar = dVar.d;
            return cVar instanceof e00.o ? cVar : new e00.o(dVar);
        }
        e00.c cVar2 = dVar.d;
        if (!(cVar2 instanceof e00.t)) {
            e00.c cVar3 = null;
            if (e00.t.k) {
                try {
                    cVarS = new e00.t(dVar, b3.m.w(r0Var.a), d00.h0.f(r0Var.a));
                } catch (Throwable th2) {
                    cVarS = t1.s(th2);
                }
                if (g00.n.a(cVarS) != null) {
                    e00.t.k = false;
                }
                cVar3 = (e00.t) (cVarS instanceof g00.m ? null : cVarS);
            }
            cVar2 = cVar3;
        }
        if (cVar2 != null) {
            return cVar2;
        }
        e00.c cVar4 = dVar.d;
        return cVar4 instanceof e00.w ? cVar4 : new e00.w(dVar);
    }

    public static final Object X(b3 b3Var, ev.p pVar, m00.c cVar) {
        l6.z zVar;
        if (cVar instanceof l6.z) {
            zVar = (l6.z) cVar;
            int i10 = zVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                zVar.C = i10 - Integer.MIN_VALUE;
            } else {
                zVar = new l6.z(cVar);
            }
        } else {
            zVar = new l6.z(cVar);
        }
        Object obj = zVar.B;
        l00.a aVar = l00.a.A;
        int i11 = zVar.C;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ev.p pVar2 = zVar.A;
                t1.O(obj);
                return obj;
            }
            t1.O(obj);
            zVar.A = pVar;
            zVar.C = 1;
            Object objK = a40.c0.k(new ev.p(pVar, b3Var, (k00.c) null, 22), zVar);
            return objK == aVar ? aVar : objK;
        } catch (TimeoutCancellationException e3) {
            if (e3.B == pVar.hashCode()) {
                return null;
            }
            throw e3;
        }
    }

    public static final Bundle Y(String str, String str2) {
        kotlin.jvm.internal.m.e(str, "serverClientId");
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_SERVER_CLIENT_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_NONCE", str2);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FILTER_BY_AUTHORIZED_ACCOUNTS", false);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_LINKED_SERVICE_ID", null);
        bundle.putStringArrayList("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN_DEPOSITION_SCOPES", null);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_REQUEST_VERIFIED_PHONE_NUMBER", false);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_AUTO_SELECT_ENABLED", false);
        return bundle;
    }

    public static Object Z(Callable callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static final void a(m2.b bVar, String str, u00.a aVar, jk.a aVar2, long j9, b2.r rVar, float f3, float f10, long j10, l1.j jVar, int i10) {
        int i11;
        String str2;
        float f11;
        float f12;
        float f13;
        float f14;
        kotlin.jvm.internal.m.e(bVar, "painter");
        kotlin.jvm.internal.m.e(aVar, "onClick");
        kotlin.jvm.internal.m.e(aVar2, "backdrop");
        g0 g0Var = (g0) jVar;
        g0Var.e0(364401283);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? g0Var.g(bVar) : g0Var.i(bVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            str2 = str;
            i11 |= g0Var.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.i(aVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i11 |= g0Var.i(aVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= g0Var.f(j9) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= g0Var.g(rVar) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        int i12 = i11 | 14155776;
        if ((100663296 & i10) == 0) {
            i12 |= g0Var.f(j10) ? 67108864 : 33554432;
        }
        int i13 = i12;
        if (g0Var.S(i13 & 1, (38347923 & i13) != 38347922)) {
            g0Var.X();
            if ((i10 & 1) == 0 || g0Var.A()) {
                f13 = 38;
                f14 = 16;
            } else {
                g0Var.V();
                f13 = f3;
                f14 = f10;
            }
            g0Var.s();
            y3.f fVar = new y3.f(f13);
            float f15 = f13;
            float f16 = f14;
            v1.c cVarD = v1.d.d(24312079, new sm.s(f14, bVar, str2, j10), g0Var);
            int i14 = i13 >> 6;
            w50.c.f(aVar, aVar2, rVar, false, false, 0.0f, fVar, 0L, j9, 32, p0.f.f12243a, 0, cVarD, g0Var, (i14 & 112) | (i14 & 14) | 805306368 | ((i13 >> 9) & 896) | (3670016 & i13) | ((i13 << 12) & 234881024), 432, 184);
            f11 = f15;
            f12 = f16;
        } else {
            g0Var.V();
            f11 = f3;
            f12 = f10;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new sm.t(bVar, str, aVar, aVar2, j9, rVar, f11, f12, j10, i10);
        }
    }

    public static final p40.c b(l40.a aVar) {
        kotlin.jvm.internal.m.e(aVar, "elementSerializer");
        return new p40.c(aVar);
    }

    public static final p40.g0 c(l40.a aVar, l40.a aVar2) {
        kotlin.jvm.internal.m.e(aVar, "keySerializer");
        kotlin.jvm.internal.m.e(aVar2, "valueSerializer");
        return new p40.g0(aVar, aVar2);
    }

    public static final void d(b6.m mVar, int i10, v1.c cVar, l1.j jVar, int i11, int i12) {
        int i13;
        int i14;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1208072102);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
        } else {
            i13 = (g0Var.g(mVar) ? 4 : 2) | i11;
        }
        int i16 = i13 | 48;
        int i17 = i12 & 4;
        if (i17 != 0) {
            i14 = i13 | 432;
        } else {
            i14 = (g0Var.e(i10) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | i16;
        }
        if ((i14 & 1171) == 1170 && g0Var.C()) {
            g0Var.V();
        } else {
            if (i15 != 0) {
                mVar = b6.k.f2179a;
            }
            int i18 = 0;
            if (i17 != 0) {
                i10 = 0;
            }
            g0Var.d0(1849434622);
            Object objN = g0Var.N();
            if (objN == l1.i.f9868a) {
                objN = j6.p.A;
                g0Var.n0(objN);
            }
            g0Var.r(false);
            u00.a aVar = (u00.a) ((a10.g) objN);
            g0Var.d0(-683746039);
            g0Var.d0(-548224868);
            if (!(g0Var.f9842a instanceof b6.b)) {
                l1.q.w();
                throw null;
            }
            g0Var.a0();
            if (g0Var.S) {
                g0Var.l(aVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(mVar, g0Var, new ir.b(26));
            l1.q.I(new j6.b(i10), g0Var, new ir.b(27));
            l1.q.I(new j6.a(i18), g0Var, new ir.b(28));
            cVar.invoke(j6.q.f8196a, g0Var, 54);
            g0Var.r(true);
            g0Var.r(false);
            g0Var.r(false);
        }
        b6.m mVar2 = mVar;
        int i19 = i10;
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new iv.l(mVar2, i19, cVar, i11, i12);
        }
    }

    public static final void e(Boolean bool, b2.r rVar, b1 b1Var, v1.c cVar, l1.j jVar, int i10) {
        v1.c cVar2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1082250944);
        int i11 = i10 | (g0Var.g(bool) ? 4 : 2) | (g0Var.i(b1Var) ? 256 : Cast.MAX_NAMESPACE_LENGTH);
        if (g0Var.S(i11 & 1, (i11 & 1171) != 1170)) {
            Object objN = g0Var.N();
            l1.c cVar3 = l1.i.f9868a;
            if (objN == cVar3) {
                objN = l1.q.z(bool);
                g0Var.n0(objN);
            }
            z0 z0Var = (z0) objN;
            l2.b bVarA = i2.d0.a(g0Var);
            l2.b bVarA2 = i2.d0.a(g0Var);
            Object objN2 = g0Var.N();
            if (objN2 == cVar3) {
                objN2 = l1.q.z(Boolean.TRUE);
                g0Var.n0(objN2);
            }
            z0 z0Var2 = (z0) objN2;
            Object objN3 = g0Var.N();
            if (objN3 == cVar3) {
                objN3 = l1.q.z(Boolean.FALSE);
                g0Var.n0(objN3);
            }
            z0 z0Var3 = (z0) objN3;
            Object objN4 = g0Var.N();
            if (objN4 == cVar3) {
                objN4 = x.c.a(1.0f, 0.01f);
                g0Var.n0(objN4);
            }
            x.b bVar = (x.b) objN4;
            boolean zI = ((i11 & 14) == 4) | g0Var.i(bVar) | g0Var.i(b1Var);
            Object objN5 = g0Var.N();
            if (zI || objN5 == cVar3) {
                androidx.lifecycle.n0 n0Var = new androidx.lifecycle.n0(bool, bVar, b1Var, z0Var, z0Var2, z0Var3, (k00.c) null);
                g0Var.n0(n0Var);
                objN5 = n0Var;
            }
            l1.q.i(bool, g0Var, (u00.n) objN5);
            boolean zI2 = g0Var.i(bVarA) | g0Var.i(bVarA2) | g0Var.i(bVar);
            Object objN6 = g0Var.N();
            if (zI2 || objN6 == cVar3) {
                a1.a aVar = new a1.a(bVarA, bVarA2, bVar, z0Var2, z0Var3, 6);
                g0Var.n0(aVar);
                objN6 = aVar;
            }
            b2.r rVarG = f2.h.g(rVar, (u00.k) objN6);
            w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarG, g0Var);
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
            Object value = z0Var.getValue();
            cVar2 = cVar;
            cVar2.invoke(value, g0Var, 48);
            g0Var.r(true);
        } else {
            cVar2 = cVar;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new dz.k(bool, rVar, b1Var, cVar2, i10, 18);
        }
    }

    public static final void f(int i10, b2.r rVar, l1.j jVar, u00.a aVar, v1.c cVar, boolean z10) {
        u00.a aVar2;
        b2.r rVar2;
        boolean z11;
        kotlin.jvm.internal.m.e(aVar, "onReveal");
        g0 g0Var = (g0) jVar;
        g0Var.e0(443913107);
        int i11 = (g0Var.h(z10) ? 4 : 2) | i10;
        if (g0Var.S(i11 & 1, (i11 & 1171) != 1170)) {
            g4.k(z10, aVar, rVar, 0L, v1.d.d(1231794628, new gv.r(cVar, 5), g0Var), g0Var, (i11 & 14) | 25008);
            z11 = z10;
            aVar2 = aVar;
            rVar2 = rVar;
        } else {
            aVar2 = aVar;
            rVar2 = rVar;
            z11 = z10;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new c00.l(z11, aVar2, rVar2, cVar, i10);
        }
    }

    public static final void g(int i10, b2.r rVar, l1.j jVar, u00.a aVar, v1.c cVar, boolean z10) {
        int i11;
        u00.a aVar2;
        boolean z11;
        b2.r rVar2;
        kotlin.jvm.internal.m.e(aVar, "onReveal");
        g0 g0Var = (g0) jVar;
        g0Var.e0(1809688907);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.h(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(aVar) ? 32 : 16;
        }
        int i12 = i11 | 384;
        if ((i10 & 3072) == 0) {
            i12 |= g0Var.i(cVar) ? 2048 : 1024;
        }
        if (g0Var.S(i12 & 1, (i12 & 1171) != 1170)) {
            b2.o oVar = b2.o.A;
            z11 = z10;
            b5.g(z11, aVar, oVar, 0L, cVar, g0Var, (i12 & 1022) | ((i12 << 3) & 57344));
            aVar2 = aVar;
            rVar2 = oVar;
        } else {
            aVar2 = aVar;
            z11 = z10;
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new y1(z11, aVar2, rVar2, cVar, i10);
        }
    }

    public static final void h(String str, b2.r rVar, l1.j jVar, int i10) {
        g0 g0Var;
        kotlin.jvm.internal.m.e(str, "title");
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(1166601680);
        int i11 = i10 | (g0Var2.g(str) ? 4 : 2) | (g0Var2.g(rVar) ? 32 : 16);
        if (g0Var2.S(i11 & 1, (i11 & 19) != 18)) {
            g0Var = g0Var2;
            z6.b(str, rVar, i2.t.b(0.5f, dl.a.k), kh.o.z(17), q3.u.B, null, 0L, null, null, kh.o.z(18), 0, false, 0, 0, null, null, g0Var, (i11 & 14) | 1597440 | (i11 & 112), 48, 260008);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new c00.m(str, rVar, i10, 2);
        }
    }

    public static final void i(o40.d dVar) {
        kotlin.jvm.internal.m.e(dVar, "<this>");
        if ((dVar instanceof q40.p ? (q40.p) dVar : null) != null) {
            return;
        }
        throw new IllegalStateException(x5.p(kotlin.jvm.internal.a0.a, dVar.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ")));
    }

    public static final q40.j j(o40.c cVar) {
        kotlin.jvm.internal.m.e(cVar, "<this>");
        q40.j jVar = cVar instanceof q40.j ? (q40.j) cVar : null;
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalStateException(x5.p(kotlin.jvm.internal.a0.a, cVar.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ")));
    }

    public static String k(int i10, String str, int i11) {
        if (i10 < 0) {
            return ze.d.H("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return ze.d.H("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(g4.c.f(i11, "negative size: "));
    }

    public static boolean l(int i10, Rect rect, Rect rect2, Rect rect3) {
        int iN;
        int i11;
        int i12;
        boolean zM = m(i10, rect, rect2);
        if (m(i10, rect, rect3) || !zM) {
            return false;
        }
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (rect.bottom <= rect3.top) {
                        if (i10 != 17 && i10 != 66) {
                            iN = N(i10, rect, rect2);
                            if (i10 != 17) {
                                i11 = rect.left;
                                i12 = rect3.left;
                            } else if (i10 != 33) {
                                i11 = rect.top;
                                i12 = rect3.top;
                            } else if (i10 != 66) {
                                i11 = rect3.right;
                                i12 = rect.right;
                            } else {
                                if (i10 == 130) {
                                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                }
                                i11 = rect3.bottom;
                                i12 = rect.bottom;
                            }
                            if (iN < Math.max(1, i11 - i12)) {
                                return false;
                            }
                        }
                    }
                } else if (rect.right <= rect3.left) {
                    if (i10 != 17) {
                        iN = N(i10, rect, rect2);
                        if (i10 != 17) {
                            i11 = rect.left;
                            i12 = rect3.left;
                        } else if (i10 != 33) {
                            i11 = rect.top;
                            i12 = rect3.top;
                        } else if (i10 != 66) {
                            i11 = rect3.right;
                            i12 = rect.right;
                        } else {
                            if (i10 == 130) {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                            i11 = rect3.bottom;
                            i12 = rect.bottom;
                        }
                        if (iN < Math.max(1, i11 - i12)) {
                            return false;
                        }
                    }
                }
            } else if (rect.top >= rect3.bottom) {
                if (i10 != 17) {
                    iN = N(i10, rect, rect2);
                    if (i10 != 17) {
                        i11 = rect.left;
                        i12 = rect3.left;
                    } else if (i10 != 33) {
                        i11 = rect.top;
                        i12 = rect3.top;
                    } else if (i10 != 66) {
                        i11 = rect3.right;
                        i12 = rect.right;
                    } else {
                        if (i10 == 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        i11 = rect3.bottom;
                        i12 = rect.bottom;
                    }
                    if (iN < Math.max(1, i11 - i12)) {
                        return false;
                    }
                }
            }
        } else if (rect.left >= rect3.right) {
            if (i10 != 17) {
                iN = N(i10, rect, rect2);
                if (i10 != 17) {
                    i11 = rect.left;
                    i12 = rect3.left;
                } else if (i10 != 33) {
                    i11 = rect.top;
                    i12 = rect3.top;
                } else if (i10 != 66) {
                    i11 = rect3.right;
                    i12 = rect.right;
                } else {
                    if (i10 == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i11 = rect3.bottom;
                    i12 = rect.bottom;
                }
                if (iN < Math.max(1, i11 - i12)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean m(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static final boolean n(ArrayList arrayList) {
        h00.x xVar;
        long j9;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                xVar = h00.x.A;
            } else {
                h00.x arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int iM = va.a.M(arrayList);
                int i10 = 0;
                while (i10 < iM) {
                    i10++;
                    Object obj2 = arrayList.get(i10);
                    j3.s sVar = (j3.s) obj2;
                    j3.s sVar2 = (j3.s) obj;
                    arrayList2.add(new h2.b((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (sVar2.g().c() >> 32)) - Float.intBitsToFloat((int) (sVar.g().c() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (sVar2.g().c() & 4294967295L)) - Float.intBitsToFloat((int) (sVar.g().c() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                xVar = arrayList2;
            }
            if (xVar.size() == 1) {
                j9 = ((h2.b) h00.q.L0(xVar)).f6544a;
            } else {
                if (xVar.isEmpty()) {
                    a4.a.c("Empty collection can't be reduced.");
                }
                Object objL0 = h00.q.L0(xVar);
                int iM2 = va.a.M(xVar);
                if (1 <= iM2) {
                    int i11 = 1;
                    while (true) {
                        objL0 = new h2.b(h2.b.f(((h2.b) objL0).f6544a, ((h2.b) xVar.get(i11)).f6544a));
                        if (i11 == iM2) {
                            break;
                        }
                        i11++;
                    }
                }
                j9 = ((h2.b) objL0).f6544a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j9)) >= Float.intBitsToFloat((int) (j9 >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static void o(int i10, int i11, String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(ze.d.H(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    public static void p(long j9, String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(ze.d.H(str, Long.valueOf(j9)));
        }
    }

    public static void q(String str, int i10, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(ze.d.H(str, Integer.valueOf(i10)));
        }
    }

    public static void r(String str, boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void s(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void t(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(ze.d.H(str, obj));
        }
    }

    public static void u(int i10, int i11) {
        String strH;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strH = ze.d.H("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(g4.c.f(i11, "negative size: "));
                }
                strH = ze.d.H("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strH);
        }
    }

    public static void v(i7.o0 o0Var) {
        o0Var.getClass();
    }

    public static void w(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void x(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(k(i10, "index", i11));
        }
    }

    public static void y(int i10, int i11, int i12) {
        String strK;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strK = k(i10, "start index", i12);
            } else {
                strK = (i11 < 0 || i11 > i12) ? k(i11, "end index", i12) : ze.d.H("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strK);
        }
    }

    public static void z(String str, boolean z10) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }
}
