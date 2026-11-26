package va;

import a10.g;
import a40.c0;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.media.MediaRoute2Info;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;
import b2.r;
import b3.h;
import bs.f;
import c3.o1;
import c40.v;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.a1;
import com.google.crypto.tink.shaded.protobuf.d1;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.p1;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.protobuf.RuntimeVersion;
import d0.q1;
import d10.x1;
import g1.o3;
import g1.z6;
import h0.c1;
import h0.s;
import h0.t1;
import h0.v1;
import h0.z1;
import h00.l;
import h00.n;
import h00.x;
import i2.t;
import i2.t0;
import i20.h0;
import j10.z;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import l1.g0;
import l1.m1;
import l1.q;
import l1.r1;
import m0.w;
import p40.o0;
import q3.u;
import u.i0;
import u.j0;
import u.q0;
import u00.k;
import w.s0;
import x40.f0;
import x40.j;
import x40.o;
import z00.e;
import z2.w0;

public abstract class a {

    public static SharedPreferences f15571b;

    public final int f15572a = 16;

    public static int A(int i10, byte[] bArr, int i11, int i12, d1 d1Var, com.google.crypto.tink.shaded.protobuf.d dVar) throws InvalidProtocolBufferException {
        if ((i10 >>> 3) == 0) {
            throw InvalidProtocolBufferException.a();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iE = E(bArr, i11, dVar);
            d1Var.d(i10, Long.valueOf(dVar.f4253b));
            return iE;
        }
        if (i13 == 1) {
            d1Var.d(i10, Long.valueOf(w(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iC = C(bArr, i11, dVar);
            int i14 = dVar.f4252a;
            if (i14 < 0) {
                throw InvalidProtocolBufferException.e();
            }
            if (i14 > bArr.length - iC) {
                throw InvalidProtocolBufferException.g();
            }
            if (i14 == 0) {
                d1Var.d(i10, i.B);
            } else {
                d1Var.d(i10, i.c(iC, i14, bArr));
            }
            return iC + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw InvalidProtocolBufferException.a();
            }
            d1Var.d(i10, Integer.valueOf(v(bArr, i11)));
            return i11 + 4;
        }
        d1 d1VarC = d1.c();
        int i15 = (i10 & (-8)) | 4;
        int i16 = 0;
        while (i11 < i12) {
            int iC2 = C(bArr, i11, dVar);
            i16 = dVar.f4252a;
            if (i16 == i15) {
                i11 = iC2;
                break;
            }
            i11 = A(i16, bArr, iC2, i12, d1VarC, dVar);
        }
        if (i11 > i12 || i16 != i15) {
            throw InvalidProtocolBufferException.f();
        }
        d1Var.d(i10, d1VarC);
        return i11;
    }

    public static int B(int i10, byte[] bArr, int i11, com.google.crypto.tink.shaded.protobuf.d dVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b7 = bArr[i11];
        if (b7 >= 0) {
            dVar.f4252a = i12 | (b7 << 7);
            return i13;
        }
        int i14 = i12 | ((b7 & 127) << 7);
        int i15 = i11 + 2;
        byte b10 = bArr[i13];
        if (b10 >= 0) {
            dVar.f4252a = i14 | (b10 << 14);
            return i15;
        }
        int i16 = i14 | ((b10 & 127) << 14);
        int i17 = i11 + 3;
        byte b11 = bArr[i15];
        if (b11 >= 0) {
            dVar.f4252a = i16 | (b11 << 21);
            return i17;
        }
        int i18 = i16 | ((b11 & 127) << 21);
        int i19 = i11 + 4;
        byte b12 = bArr[i17];
        if (b12 >= 0) {
            dVar.f4252a = i18 | (b12 << 28);
            return i19;
        }
        int i20 = i18 | ((b12 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                dVar.f4252a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int C(byte[] bArr, int i10, com.google.crypto.tink.shaded.protobuf.d dVar) {
        int i11 = i10 + 1;
        byte b7 = bArr[i10];
        if (b7 < 0) {
            return B(b7, bArr, i11, dVar);
        }
        dVar.f4252a = b7;
        return i11;
    }

    public static int D(int i10, byte[] bArr, int i11, int i12, a0 a0Var, com.google.crypto.tink.shaded.protobuf.d dVar) {
        y yVar = (y) a0Var;
        int iC = C(bArr, i11, dVar);
        yVar.addInt(dVar.f4252a);
        while (iC < i12) {
            int iC2 = C(bArr, iC, dVar);
            if (i10 != dVar.f4252a) {
                break;
            }
            iC = C(bArr, iC2, dVar);
            yVar.addInt(dVar.f4252a);
        }
        return iC;
    }

    public static int E(byte[] bArr, int i10, com.google.crypto.tink.shaded.protobuf.d dVar) {
        int i11 = i10 + 1;
        long j9 = bArr[i10];
        if (j9 >= 0) {
            dVar.f4253b = j9;
            return i11;
        }
        int i12 = i10 + 2;
        byte b7 = bArr[i11];
        long j10 = (j9 & 127) | (((long) (b7 & 127)) << 7);
        int i13 = 7;
        while (b7 < 0) {
            int i14 = i12 + 1;
            byte b10 = bArr[i12];
            i13 += 7;
            j10 |= ((long) (b10 & 127)) << i13;
            b7 = b10;
            i12 = i14;
        }
        dVar.f4253b = j10;
        return i12;
    }

    public static q4.c[] F(q4.c[] cVarArr) {
        q4.c[] cVarArr2 = new q4.c[cVarArr.length];
        for (int i10 = 0; i10 < cVarArr.length; i10++) {
            cVarArr2[i10] = new q4.c(cVarArr[i10]);
        }
        return cVarArr2;
    }

    public static re.b G(byte[] bArr, Parcelable.Creator creator) {
        d0.h(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        re.b bVar = (re.b) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return bVar;
    }

    public static final float H(w wVar) {
        return wVar.k().f10369e == q1.B ? Float.intBitsToFloat((int) (wVar.o() >> 32)) : Float.intBitsToFloat((int) (wVar.o() & 4294967295L));
    }

    public static final l40.a I(l40.c cVar, o40.a aVar, String str) {
        l40.a aVar2;
        m.e(cVar, "<this>");
        a10.d dVar = cVar.a;
        l40.a aVar3 = (l40.a) cVar.e.get(str);
        if (aVar3 != null) {
            aVar2 = aVar3;
        } else {
            ce.c cVarB = aVar.b();
            cVarB.getClass();
            m.e(dVar, "baseClass");
            Map map = (Map) ((Map) cVarB.E).get(dVar);
            l40.a aVar4 = map != null ? (l40.a) map.get(str) : null;
            if (!(aVar4 instanceof l40.a)) {
                aVar4 = null;
            }
            if (aVar4 != null) {
                aVar2 = aVar4;
            } else {
                Object obj = ((Map) cVarB.F).get(dVar);
                k kVar = kotlin.jvm.internal.d0.f(1, obj) ? (k) obj : null;
                aVar2 = kVar != null ? (l40.a) kVar.invoke(str) : null;
            }
        }
        if (aVar2 != null) {
            return aVar2;
        }
        o0.h(dVar, str);
        throw null;
    }

    public static final l40.a J(l40.c cVar, o40.d dVar, Object obj) {
        l40.a aVar;
        m.e(cVar, "<this>");
        a10.d dVar2 = cVar.a;
        m.e(dVar, "encoder");
        m.e(obj, "value");
        Map map = cVar.d;
        Class<?> cls = obj.getClass();
        b0 b0Var = kotlin.jvm.internal.a0.a;
        l40.a aVar2 = (l40.a) map.get(b0Var.b(cls));
        if (aVar2 != null) {
            aVar = aVar2;
        } else {
            ce.c cVarB = dVar.b();
            cVarB.getClass();
            m.e(dVar2, "baseClass");
            if (dVar2.u(obj)) {
                Map map2 = (Map) ((Map) cVarB.C).get(dVar2);
                l40.a aVar3 = map2 != null ? (l40.a) map2.get(b0Var.b(obj.getClass())) : null;
                l40.a aVar4 = aVar3 instanceof l40.a ? aVar3 : null;
                if (aVar4 != null) {
                    aVar = aVar4;
                } else {
                    Object obj2 = ((Map) cVarB.D).get(dVar2);
                    k kVar = kotlin.jvm.internal.d0.f(1, obj2) ? (k) obj2 : null;
                    if (kVar != null) {
                        aVar = (l40.a) kVar.invoke(obj);
                    } else {
                        aVar = null;
                    }
                }
            } else {
                aVar = null;
            }
        }
        if (aVar == null) {
            aVar = null;
        }
        if (aVar != null) {
            return aVar;
        }
        a10.d dVarB = b0Var.b(obj.getClass());
        m.e(dVar2, "baseClass");
        String strN = dVarB.n();
        if (strN == null) {
            strN = String.valueOf(dVarB);
        }
        o0.h(dVar2, strN);
        throw null;
    }

    public static o K(SSLSession sSLSession) throws IOException {
        List listK;
        List listK2 = x.A;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") ? true : cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        j jVarC = j.b.c(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        f0 f0VarW = ze.d.w(protocol);
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            listK = peerCertificates != null ? y40.b.k(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listK2;
        } catch (SSLPeerUnverifiedException unused) {
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listK2 = y40.b.k(Arrays.copyOf(localCertificates, localCertificates.length));
        }
        return new o(f0VarW, jVarC, listK2, new defpackage.a(1, listK));
    }

    public static e L(Collection collection) {
        m.e(collection, "<this>");
        return new e(0, collection.size() - 1, 1);
    }

    public static int M(List list) {
        m.e(list, "<this>");
        return list.size() - 1;
    }

    public static ArrayList N(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2Info = (MediaRoute2Info) it.next();
            if (mediaRoute2Info != null) {
                arrayList.add(mediaRoute2Info.getId());
            }
        }
        return arrayList;
    }

    public static d O(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(a.class.getClassLoader());
            Parcelable parcelable = bundle2.getParcelable("a");
            if (parcelable instanceof ParcelImpl) {
                return ((ParcelImpl) parcelable).A;
            }
            throw new IllegalArgumentException("Invalid parcel");
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final boolean P(w wVar, float f3) {
        wVar.k().getClass();
        return !(((wVar.p() ? -f3 : H(wVar)) > 0.0f ? 1 : ((wVar.p() ? -f3 : H(wVar)) == 0.0f ? 0 : -1)) > 0);
    }

    public static x1 Q(j10.c cVar, u00.a aVar) {
        if (aVar != null) {
            return new x1(cVar, aVar);
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
    }

    public static List R(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        m.d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static List S(Object... objArr) {
        m.e(objArr, "elements");
        return objArr.length > 0 ? n.k0(objArr) : x.A;
    }

    public static List T(Object obj) {
        return obj != null ? R(obj) : x.A;
    }

    public static final t5.d U(String str) {
        m.e(str, "name");
        return new t5.d(str);
    }

    public static int V(Object obj, a1 a1Var, byte[] bArr, int i10, int i11, com.google.crypto.tink.shaded.protobuf.d dVar) throws InvalidProtocolBufferException {
        int iB = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iB = B(i12, bArr, iB, dVar);
            i12 = dVar.f4252a;
        }
        int i13 = iB;
        if (i12 < 0 || i12 > i11 - i13) {
            throw InvalidProtocolBufferException.g();
        }
        int i14 = i13 + i12;
        a1Var.d(obj, bArr, i13, i14, dVar);
        dVar.f4254c = obj;
        return i14;
    }

    public static ArrayList W(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList((Collection) new l(objArr, true));
    }

    public static final List X(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : R(list.get(0));
        }
        return x.A;
    }

    public static void Y(Bundle bundle, d dVar) {
        if (dVar == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("a", new ParcelImpl(dVar));
        bundle.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle2);
    }

    public static final void Z(int i10, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException(g4.c.i("fromIndex (0) is greater than toIndex (", i11, ")."));
        }
        if (i11 > i10) {
            throw new IndexOutOfBoundsException(g4.c.e(i11, i10, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static final void a(int i10, long j9, u uVar, long j10, r rVar, l1.j jVar, int i11) {
        int i12;
        r rVar2;
        m.e(uVar, "fontWeight");
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1857033515);
        if ((i11 & 6) == 0) {
            i12 = (g0Var.e(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= g0Var.f(j9) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= g0Var.g(uVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i11 & 3072) == 0) {
            i12 |= g0Var.f(j10) ? 2048 : 1024;
        }
        int i13 = i12 | 24576;
        if (g0Var.S(i13 & 1, (i13 & 9363) != 9362)) {
            q.a(o1.f2738n.a(y3.m.A), v1.d.d(1828355605, new wk.a(i10, j10, j9, uVar), g0Var), g0Var, 56);
            rVar2 = b2.o.A;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new wk.b(i10, j9, uVar, j10, rVar2, i11);
        }
    }

    public static final void a0(u.e eVar, k kVar) {
        m.e(eVar, "map");
        u.e eVar2 = new u.e(MediaError.DetailedErrorCode.GENERIC);
        int i10 = eVar.C;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            eVar2.put(eVar.g(i11), eVar.j(i11));
            i11++;
            i12++;
            if (i12 == 999) {
                kVar.invoke(eVar2);
                eVar2.clear();
                i12 = 0;
            }
        }
        if (i12 > 0) {
            kVar.invoke(eVar2);
        }
    }

    public static final void b(b6.m mVar, j6.c cVar, v1.c cVar2, l1.j jVar, int i10, int i11) {
        int i12;
        g0 g0Var = (g0) jVar;
        g0Var.e0(227045628);
        int i13 = (g0Var.g(mVar) ? 4 : 2) | i10;
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 = i13 | 48;
        } else {
            i12 = i13 | (g0Var.g(cVar) ? 32 : 16);
        }
        if ((i12 & 147) == 146 && g0Var.C()) {
            g0Var.V();
        } else {
            if (i14 != 0) {
                cVar = j6.c.f8172c;
            }
            g0Var.d0(1849434622);
            Object objN = g0Var.N();
            if (objN == l1.i.f9868a) {
                objN = j6.d.A;
                g0Var.n0(objN);
            }
            g0Var.r(false);
            u00.a aVar = (u00.a) ((g) objN);
            g0Var.d0(-683746039);
            g0Var.d0(-548224868);
            if (!(g0Var.f9842a instanceof b6.b)) {
                q.w();
                throw null;
            }
            g0Var.a0();
            if (g0Var.S) {
                g0Var.l(aVar);
            } else {
                g0Var.q0();
            }
            q.I(mVar, g0Var, new ir.b(21));
            q.I(cVar, g0Var, new ir.b(22));
            cVar2.invoke(g0Var, 6);
            g0Var.r(true);
            g0Var.r(false);
            g0Var.r(false);
        }
        j6.c cVar3 = cVar;
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new f(mVar, cVar3, cVar2, i10, i11, 10);
        }
    }

    public static final boolean b0(i0 i0Var, Object obj, Object obj2) {
        Object objG = i0Var.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof j0)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            i0Var.k(obj);
            return true;
        }
        j0 j0Var = (j0) objG;
        boolean zL = j0Var.l(obj2);
        if (zL && j0Var.g()) {
            i0Var.k(obj);
        }
        return zL;
    }

    public static final void c(int i10, r rVar, String str, l1.j jVar, u00.a aVar, boolean z10) {
        r rVar2;
        float f3;
        m.e(str, "title");
        m.e(aVar, "onClick");
        g0 g0Var = (g0) jVar;
        g0Var.e0(1508526350);
        int i11 = i10 | (g0Var.g(str) ? 4 : 2) | (g0Var.h(z10) ? 32 : 16) | (g0Var.i(aVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | 3072;
        if (g0Var.S(i11 & 1, (i11 & 1171) != 1170)) {
            b2.o oVar = b2.o.A;
            float f10 = 16;
            r rVarC = h0.c.C(w50.c.n(z1.d(oVar, 1.0f), true, aVar), f10);
            v1 v1VarA = t1.a(h0.i.g(f10), b2.b.K, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            r rVarC2 = b2.a.c(rVarC, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = h.f2039f;
            q.I(v1VarA, g0Var, fVar);
            b3.f fVar2 = h.f2038e;
            q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = h.f2040g;
            q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = h.f2041h;
            q.E(g0Var, eVar);
            b3.f fVar4 = h.f2037d;
            q.I(rVarC2, g0Var, fVar4);
            float f11 = 4;
            r rVarG = z.n.g(z.n.f(f2.h.c(z1.m(oVar, 20), p0.f.a(f11)), z10 ? dl.a.i : t.f7166f, i2.b0.f7111b), (float) 1.5d, z10 ? dl.a.i : t.b(0.35f, dl.a.i), p0.f.a(f11));
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            r rVarC3 = b2.a.c(rVarG, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD, g0Var, fVar);
            q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            q.I(rVarC3, g0Var, fVar4);
            if (z10) {
                g0Var.c0(-513469825);
                f3 = 1.0f;
                o3.a(y3.R(2131231094, g0Var, 0), null, z1.m(oVar, 12), t.f7162b, g0Var, 3512, 0);
                g0Var.r(false);
            } else {
                f3 = 1.0f;
                g0Var.c0(-513230102);
                g0Var.r(false);
            }
            g0Var.r(true);
            long j9 = dl.a.k;
            long jZ = kh.o.z(16);
            long jZ2 = kh.o.z(22);
            u uVar = u.D;
            if (f3 <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            z6.b(str, new c1(f3, true), j9, jZ, uVar, null, 0L, null, null, jZ2, 0, false, 0, 0, null, null, g0Var, (i11 & 14) | 1597440, 48, 260008);
            g0Var = g0Var;
            g0Var.r(true);
            rVar2 = oVar;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new mu.i(str, z10, aVar, rVar2, i10);
        }
    }

    public static final void c0(i0 i0Var, Object obj) {
        boolean zG;
        long[] jArr = i0Var.f14856a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j9 = jArr[i10];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j9) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj2 = i0Var.f14857b[i13];
                        Object obj3 = i0Var.f14858c[i13];
                        if (obj3 instanceof j0) {
                            j0 j0Var = (j0) obj3;
                            j0Var.l(obj);
                            zG = j0Var.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            i0Var.l(i13);
                        }
                    }
                    j9 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public static final void d(r rVar, l1.j jVar, int i10) {
        g0 g0Var;
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(933333411);
        int i11 = i10 | (g0Var2.g(rVar) ? 4 : 2);
        if (g0Var2.S(i11 & 1, (i11 & 3) != 2)) {
            g0Var = g0Var2;
            z6.b(z3.U(g0Var2, 2131886416), rVar, dl.a.i, kh.o.z(32), u.D, null, 0L, null, null, kh.o.z(32), 2, false, 1, 0, null, null, g0Var, ((i11 << 3) & 112) | 1597440, 25008, 239528);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new bs.b(rVar, i10, 13);
        }
    }

    public static String d0(n20.e eVar) {
        m.e(eVar, "<this>");
        String strB = eVar.b();
        m.b(strB);
        if (!p20.n.a.contains(strB)) {
            for (int i10 = 0; i10 < strB.length(); i10++) {
                char cCharAt = strB.charAt(i10);
                if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_') {
                }
            }
            if (strB.length() != 0 && Character.isJavaIdentifierStart(strB.codePointAt(0))) {
                return strB;
            }
        }
        return "`".concat(strB) + '`';
    }

    public static final void e(r rVar, jk.a aVar, t0 t0Var, float f3, b2.d dVar, boolean z10, float f10, float f11, t tVar, v1.c cVar, l1.j jVar, int i10, int i11) {
        int i12;
        b2.d dVar2;
        int i13;
        int i14;
        float f12;
        int i15;
        int i16;
        int i17;
        boolean z11;
        g0 g0Var;
        boolean z12;
        float f13;
        b2.d dVar3;
        float f14;
        r1 r1VarT;
        float f15;
        float f16;
        boolean z13;
        Object objN;
        l1.c cVar2;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        Object objN2;
        Object objN3;
        long j9;
        boolean zF;
        Object objN4;
        k kVar;
        boolean z19;
        b3.g gVar;
        int i18;
        int i19;
        m.e(rVar, "modifier");
        m.e(aVar, "backdrop");
        m.e(t0Var, "cornerRadiusShape");
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(1603747860);
        if ((i10 & 6) == 0) {
            i12 = (g0Var2.g(rVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= g0Var2.i(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= g0Var2.g(t0Var) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i12 |= g0Var2.d(f3) ? 2048 : 1024;
        }
        int i20 = i11 & 16;
        if (i20 == 0) {
            if ((i10 & 24576) == 0) {
                dVar2 = dVar;
                i12 |= g0Var2.g(dVar2) ? 16384 : 8192;
            }
            i13 = 196608 | i12;
            i14 = i11 & 64;
            if (i14 != 0) {
                if ((1572864 & i10) == 0) {
                    f12 = f10;
                    if (g0Var2.d(f12)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i13 |= i15;
                }
                i16 = i11 & Cast.MAX_NAMESPACE_LENGTH;
                if (i16 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (g0Var2.d(f11)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i13 |= i17;
                }
                if ((i10 & 100663296) == 0) {
                    if (g0Var2.g(tVar)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i13 |= i19;
                }
                if ((i10 & 805306368) == 0) {
                    if (g0Var2.i(cVar)) {
                        i18 = 536870912;
                    } else {
                        i18 = 268435456;
                    }
                    i13 |= i18;
                }
                if ((i13 & 306783379) != 306783378) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (g0Var2.S(i13 & 1, z11)) {
                    if (i20 != 0) {
                        dVar2 = b2.b.A;
                    }
                    if (i14 != 0) {
                        f15 = 0.781935f;
                    } else {
                        f15 = f12;
                    }
                    if (i16 != 0) {
                        f16 = 0.7437542f;
                    } else {
                        f16 = f11;
                    }
                    if ((i13 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objN = g0Var2.N();
                    cVar2 = l1.i.f9868a;
                    if (z13 || objN == cVar2) {
                        objN = new sm.l(t0Var, 0);
                        g0Var2.n0(objN);
                    }
                    u00.a aVar2 = (u00.a) objN;
                    if ((i13 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((3670016 & i13) == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z20 = z14 | z15;
                    if ((29360128 & i13) == 8388608) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z21 = z20 | z16;
                    if ((458752 & i13) == 131072) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    z18 = z21 | z17;
                    objN2 = g0Var2.N();
                    if (z18 || objN2 == cVar2) {
                        objN2 = new sm.m(f3, f15, f16, 0);
                        g0Var2.n0(objN2);
                    }
                    k kVar2 = (k) objN2;
                    objN3 = g0Var2.N();
                    if (objN3 == cVar2) {
                        objN3 = new q50.b(18);
                        g0Var2.n0(objN3);
                    }
                    u00.a aVar3 = (u00.a) objN3;
                    if (tVar == null) {
                        g0Var2.c0(37465877);
                        g0Var2.r(false);
                        kVar = null;
                        z19 = false;
                    } else {
                        g0Var2.c0(37465878);
                        j9 = tVar.f7169a;
                        zF = g0Var2.f(j9);
                        objN4 = g0Var2.N();
                        if (zF || objN4 == cVar2) {
                            objN4 = new gj.h(j9, 8);
                            g0Var2.n0(objN4);
                        }
                        kVar = (k) objN4;
                        z19 = false;
                        g0Var2.r(false);
                    }
                    float f17 = f15;
                    b2.d dVar4 = dVar2;
                    g0Var = g0Var2;
                    float f18 = f16;
                    int i21 = i13;
                    r rVarB = jk.d.b(rVar, aVar, aVar2, kVar2, aVar3, null, null, null, kVar, 3056);
                    int i22 = ((i21 >> 9) & 112) | ((i21 >> 18) & 7168);
                    w0 w0VarD = h0.o.d(dVar4, z19);
                    int iHashCode = Long.hashCode(g0Var.T);
                    m1 m1VarM = g0Var.m();
                    r rVarC = b2.a.c(rVarB, g0Var);
                    b3.i.f2042c.getClass();
                    gVar = h.f2035b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    q.I(w0VarD, g0Var, h.f2039f);
                    q.I(m1VarM, g0Var, h.f2038e);
                    q.I(Integer.valueOf(iHashCode), g0Var, h.f2040g);
                    q.E(g0Var, h.f2041h);
                    q.I(rVarC, g0Var, h.f2037d);
                    cVar.invoke(s.f6456a, g0Var, Integer.valueOf(((i22 >> 6) & 112) | 6));
                    g0Var.r(true);
                    z12 = true;
                    dVar3 = dVar4;
                    f13 = f18;
                    f14 = f17;
                } else {
                    g0Var = g0Var2;
                    g0Var.V();
                    z12 = z10;
                    f13 = f11;
                    dVar3 = dVar2;
                    f14 = f12;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new sm.n(rVar, aVar, t0Var, f3, dVar3, z12, f14, f13, tVar, cVar, i10, i11);
                }
            }
            i13 = 1769472 | i12;
            f12 = f10;
            i16 = i11 & Cast.MAX_NAMESPACE_LENGTH;
            if (i16 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (g0Var2.d(f11)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i13 |= i17;
            }
            if ((i10 & 100663296) == 0) {
                if (g0Var2.g(tVar)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i13 |= i19;
            }
            if ((i10 & 805306368) == 0) {
                if (g0Var2.i(cVar)) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i13 |= i18;
            }
            if ((i13 & 306783379) != 306783378) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (g0Var2.S(i13 & 1, z11)) {
                if (i20 != 0) {
                    dVar2 = b2.b.A;
                }
                if (i14 != 0) {
                    f15 = 0.781935f;
                } else {
                    f15 = f12;
                }
                if (i16 != 0) {
                    f16 = 0.7437542f;
                } else {
                    f16 = f11;
                }
                if ((i13 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objN = g0Var2.N();
                cVar2 = l1.i.f9868a;
                if (z13) {
                    objN = new sm.l(t0Var, 0);
                    g0Var2.n0(objN);
                } else {
                    objN = new sm.l(t0Var, 0);
                    g0Var2.n0(objN);
                }
                u00.a aVar4 = (u00.a) objN;
                if ((i13 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((3670016 & i13) == 1048576) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z22 = z14 | z15;
                if ((29360128 & i13) == 8388608) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z23 = z22 | z16;
                if ((458752 & i13) == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z23 | z17;
                objN2 = g0Var2.N();
                if (z18) {
                    objN2 = new sm.m(f3, f15, f16, 0);
                    g0Var2.n0(objN2);
                } else {
                    objN2 = new sm.m(f3, f15, f16, 0);
                    g0Var2.n0(objN2);
                }
                k kVar3 = (k) objN2;
                objN3 = g0Var2.N();
                if (objN3 == cVar2) {
                    objN3 = new q50.b(18);
                    g0Var2.n0(objN3);
                }
                u00.a aVar5 = (u00.a) objN3;
                if (tVar == null) {
                    g0Var2.c0(37465877);
                    g0Var2.r(false);
                    kVar = null;
                    z19 = false;
                } else {
                    g0Var2.c0(37465878);
                    j9 = tVar.f7169a;
                    zF = g0Var2.f(j9);
                    objN4 = g0Var2.N();
                    if (zF) {
                        objN4 = new gj.h(j9, 8);
                        g0Var2.n0(objN4);
                    } else {
                        objN4 = new gj.h(j9, 8);
                        g0Var2.n0(objN4);
                    }
                    kVar = (k) objN4;
                    z19 = false;
                    g0Var2.r(false);
                }
                float f19 = f15;
                b2.d dVar5 = dVar2;
                g0Var = g0Var2;
                float f110 = f16;
                int i23 = i13;
                r rVarB2 = jk.d.b(rVar, aVar, aVar4, kVar3, aVar5, null, null, null, kVar, 3056);
                int i24 = ((i23 >> 9) & 112) | ((i23 >> 18) & 7168);
                w0 w0VarD2 = h0.o.d(dVar5, z19);
                int iHashCode2 = Long.hashCode(g0Var.T);
                m1 m1VarM2 = g0Var.m();
                r rVarC2 = b2.a.c(rVarB2, g0Var);
                b3.i.f2042c.getClass();
                gVar = h.f2035b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                q.I(w0VarD2, g0Var, h.f2039f);
                q.I(m1VarM2, g0Var, h.f2038e);
                q.I(Integer.valueOf(iHashCode2), g0Var, h.f2040g);
                q.E(g0Var, h.f2041h);
                q.I(rVarC2, g0Var, h.f2037d);
                cVar.invoke(s.f6456a, g0Var, Integer.valueOf(((i24 >> 6) & 112) | 6));
                g0Var.r(true);
                z12 = true;
                dVar3 = dVar5;
                f13 = f110;
                f14 = f19;
            } else {
                g0Var = g0Var2;
                g0Var.V();
                z12 = z10;
                f13 = f11;
                dVar3 = dVar2;
                f14 = f12;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new sm.n(rVar, aVar, t0Var, f3, dVar3, z12, f14, f13, tVar, cVar, i10, i11);
            }
        }
        i12 |= 24576;
        dVar2 = dVar;
        i13 = 196608 | i12;
        i14 = i11 & 64;
        if (i14 != 0) {
            if ((1572864 & i10) == 0) {
                f12 = f10;
                if (g0Var2.d(f12)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i13 |= i15;
            }
            i16 = i11 & Cast.MAX_NAMESPACE_LENGTH;
            if (i16 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (g0Var2.d(f11)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i13 |= i17;
            }
            if ((i10 & 100663296) == 0) {
                if (g0Var2.g(tVar)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i13 |= i19;
            }
            if ((i10 & 805306368) == 0) {
                if (g0Var2.i(cVar)) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i13 |= i18;
            }
            if ((i13 & 306783379) != 306783378) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (g0Var2.S(i13 & 1, z11)) {
                if (i20 != 0) {
                    dVar2 = b2.b.A;
                }
                if (i14 != 0) {
                    f15 = 0.781935f;
                } else {
                    f15 = f12;
                }
                if (i16 != 0) {
                    f16 = 0.7437542f;
                } else {
                    f16 = f11;
                }
                if ((i13 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objN = g0Var2.N();
                cVar2 = l1.i.f9868a;
                if (z13) {
                    objN = new sm.l(t0Var, 0);
                    g0Var2.n0(objN);
                } else {
                    objN = new sm.l(t0Var, 0);
                    g0Var2.n0(objN);
                }
                u00.a aVar6 = (u00.a) objN;
                if ((i13 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((3670016 & i13) == 1048576) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z24 = z14 | z15;
                if ((29360128 & i13) == 8388608) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z25 = z24 | z16;
                if ((458752 & i13) == 131072) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z25 | z17;
                objN2 = g0Var2.N();
                if (z18) {
                    objN2 = new sm.m(f3, f15, f16, 0);
                    g0Var2.n0(objN2);
                } else {
                    objN2 = new sm.m(f3, f15, f16, 0);
                    g0Var2.n0(objN2);
                }
                k kVar4 = (k) objN2;
                objN3 = g0Var2.N();
                if (objN3 == cVar2) {
                    objN3 = new q50.b(18);
                    g0Var2.n0(objN3);
                }
                u00.a aVar7 = (u00.a) objN3;
                if (tVar == null) {
                    g0Var2.c0(37465877);
                    g0Var2.r(false);
                    kVar = null;
                    z19 = false;
                } else {
                    g0Var2.c0(37465878);
                    j9 = tVar.f7169a;
                    zF = g0Var2.f(j9);
                    objN4 = g0Var2.N();
                    if (zF) {
                        objN4 = new gj.h(j9, 8);
                        g0Var2.n0(objN4);
                    } else {
                        objN4 = new gj.h(j9, 8);
                        g0Var2.n0(objN4);
                    }
                    kVar = (k) objN4;
                    z19 = false;
                    g0Var2.r(false);
                }
                float f111 = f15;
                b2.d dVar6 = dVar2;
                g0Var = g0Var2;
                float f112 = f16;
                int i25 = i13;
                r rVarB3 = jk.d.b(rVar, aVar, aVar6, kVar4, aVar7, null, null, null, kVar, 3056);
                int i26 = ((i25 >> 9) & 112) | ((i25 >> 18) & 7168);
                w0 w0VarD3 = h0.o.d(dVar6, z19);
                int iHashCode3 = Long.hashCode(g0Var.T);
                m1 m1VarM3 = g0Var.m();
                r rVarC3 = b2.a.c(rVarB3, g0Var);
                b3.i.f2042c.getClass();
                gVar = h.f2035b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                q.I(w0VarD3, g0Var, h.f2039f);
                q.I(m1VarM3, g0Var, h.f2038e);
                q.I(Integer.valueOf(iHashCode3), g0Var, h.f2040g);
                q.E(g0Var, h.f2041h);
                q.I(rVarC3, g0Var, h.f2037d);
                cVar.invoke(s.f6456a, g0Var, Integer.valueOf(((i26 >> 6) & 112) | 6));
                g0Var.r(true);
                z12 = true;
                dVar3 = dVar6;
                f13 = f112;
                f14 = f111;
            } else {
                g0Var = g0Var2;
                g0Var.V();
                z12 = z10;
                f13 = f11;
                dVar3 = dVar2;
                f14 = f12;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.f9921d = new sm.n(rVar, aVar, t0Var, f3, dVar3, z12, f14, f13, tVar, cVar, i10, i11);
            }
        }
        i13 = 1769472 | i12;
        f12 = f10;
        i16 = i11 & Cast.MAX_NAMESPACE_LENGTH;
        if (i16 != 0) {
            i13 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (g0Var2.d(f11)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i13 |= i17;
        }
        if ((i10 & 100663296) == 0) {
            if (g0Var2.g(tVar)) {
                i19 = 67108864;
            } else {
                i19 = 33554432;
            }
            i13 |= i19;
        }
        if ((i10 & 805306368) == 0) {
            if (g0Var2.i(cVar)) {
                i18 = 536870912;
            } else {
                i18 = 268435456;
            }
            i13 |= i18;
        }
        if ((i13 & 306783379) != 306783378) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (g0Var2.S(i13 & 1, z11)) {
            if (i20 != 0) {
                dVar2 = b2.b.A;
            }
            if (i14 != 0) {
                f15 = 0.781935f;
            } else {
                f15 = f12;
            }
            if (i16 != 0) {
                f16 = 0.7437542f;
            } else {
                f16 = f11;
            }
            if ((i13 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            objN = g0Var2.N();
            cVar2 = l1.i.f9868a;
            if (z13) {
                objN = new sm.l(t0Var, 0);
                g0Var2.n0(objN);
            } else {
                objN = new sm.l(t0Var, 0);
                g0Var2.n0(objN);
            }
            u00.a aVar8 = (u00.a) objN;
            if ((i13 & 7168) == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            if ((3670016 & i13) == 1048576) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z26 = z14 | z15;
            if ((29360128 & i13) == 8388608) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z27 = z26 | z16;
            if ((458752 & i13) == 131072) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = z27 | z17;
            objN2 = g0Var2.N();
            if (z18) {
                objN2 = new sm.m(f3, f15, f16, 0);
                g0Var2.n0(objN2);
            } else {
                objN2 = new sm.m(f3, f15, f16, 0);
                g0Var2.n0(objN2);
            }
            k kVar5 = (k) objN2;
            objN3 = g0Var2.N();
            if (objN3 == cVar2) {
                objN3 = new q50.b(18);
                g0Var2.n0(objN3);
            }
            u00.a aVar9 = (u00.a) objN3;
            if (tVar == null) {
                g0Var2.c0(37465877);
                g0Var2.r(false);
                kVar = null;
                z19 = false;
            } else {
                g0Var2.c0(37465878);
                j9 = tVar.f7169a;
                zF = g0Var2.f(j9);
                objN4 = g0Var2.N();
                if (zF) {
                    objN4 = new gj.h(j9, 8);
                    g0Var2.n0(objN4);
                } else {
                    objN4 = new gj.h(j9, 8);
                    g0Var2.n0(objN4);
                }
                kVar = (k) objN4;
                z19 = false;
                g0Var2.r(false);
            }
            float f113 = f15;
            b2.d dVar7 = dVar2;
            g0Var = g0Var2;
            float f114 = f16;
            int i27 = i13;
            r rVarB4 = jk.d.b(rVar, aVar, aVar8, kVar5, aVar9, null, null, null, kVar, 3056);
            int i28 = ((i27 >> 9) & 112) | ((i27 >> 18) & 7168);
            w0 w0VarD4 = h0.o.d(dVar7, z19);
            int iHashCode4 = Long.hashCode(g0Var.T);
            m1 m1VarM4 = g0Var.m();
            r rVarC4 = b2.a.c(rVarB4, g0Var);
            b3.i.f2042c.getClass();
            gVar = h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            q.I(w0VarD4, g0Var, h.f2039f);
            q.I(m1VarM4, g0Var, h.f2038e);
            q.I(Integer.valueOf(iHashCode4), g0Var, h.f2040g);
            q.E(g0Var, h.f2041h);
            q.I(rVarC4, g0Var, h.f2037d);
            cVar.invoke(s.f6456a, g0Var, Integer.valueOf(((i28 >> 6) & 112) | 6));
            g0Var.r(true);
            z12 = true;
            dVar3 = dVar7;
            f13 = f114;
            f14 = f113;
        } else {
            g0Var = g0Var2;
            g0Var.V();
            z12 = z10;
            f13 = f11;
            dVar3 = dVar2;
            f14 = f12;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new sm.n(rVar, aVar, t0Var, f3, dVar3, z12, f14, f13, tVar, cVar, i10, i11);
        }
    }

    public static final String e0(String str, String str2, u00.a aVar, u00.a aVar2, k kVar) {
        m.e(str, "lowerRendered");
        m.e(str2, "upperRendered");
        m.e(kVar, "escape");
        String str3 = (String) aVar.invoke();
        String strG0 = g0(str, w.c.j(str3, "Mutable"), str2, str3, w.c.j(str3, "(Mutable)"));
        if (strG0 != null) {
            return strG0;
        }
        String strG1 = g0(str, str3.concat("MutableMap.MutableEntry"), str2, str3.concat("Map.Entry"), str3.concat("(Mutable)Map.(Mutable)Entry"));
        if (strG1 != null) {
            return strG1;
        }
        String str4 = (String) aVar2.invoke();
        StringBuilder sbQ = x5.q(str4);
        sbQ.append((String) kVar.invoke("Array<"));
        String string = sbQ.toString();
        StringBuilder sbQ2 = x5.q(str4);
        sbQ2.append((String) kVar.invoke("Array<out "));
        String string2 = sbQ2.toString();
        StringBuilder sbQ3 = x5.q(str4);
        sbQ3.append((String) kVar.invoke("Array<(out) "));
        String strG2 = g0(str, string, str2, string2, sbQ3.toString());
        if (strG2 != null) {
            return strG2;
        }
        return null;
    }

    public static Object f(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final String f0(List list) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n20.e eVar = (n20.e) it.next();
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(d0(eVar));
        }
        return sb2.toString();
    }

    public static final void g(i0 i0Var, Object obj, Object obj2) {
        int iF = i0Var.f(obj);
        boolean z10 = iF < 0;
        Object obj3 = z10 ? null : i0Var.f14858c[iF];
        if (obj3 != null) {
            if (obj3 instanceof j0) {
                ((j0) obj3).a(obj2);
            } else if (obj3 != obj2) {
                j0 j0Var = new j0();
                j0Var.a(obj3);
                j0Var.a(obj2);
                obj2 = j0Var;
            }
            obj2 = obj3;
        }
        if (!z10) {
            i0Var.f14858c[iF] = obj2;
            return;
        }
        int i10 = ~iF;
        i0Var.f14857b[i10] = obj;
        i0Var.f14858c[i10] = obj2;
    }

    public static final String g0(String str, String str2, String str3, String str4, String str5) {
        m.e(str, "lowerRendered");
        m.e(str2, "lowerPrefix");
        m.e(str3, "upperRendered");
        m.e(str4, "upperPrefix");
        m.e(str5, "foldedPrefix");
        if (!r30.r.x0(str, str2, false) || !r30.r.x0(str3, str4, false)) {
            return null;
        }
        String strSubstring = str.substring(str2.length());
        m.d(strSubstring, "substring(...)");
        String strSubstring2 = str3.substring(str4.length());
        m.d(strSubstring2, "substring(...)");
        String strConcat = str5.concat(strSubstring);
        if (strSubstring.equals(strSubstring2)) {
            return strConcat;
        }
        if (!n0(strSubstring, strSubstring2)) {
            return null;
        }
        return strConcat + '!';
    }

    public static final x.q1 h() {
        return x.c.w(350, 0, x.x.f16384a, 2);
    }

    public static final w.j0 h0() {
        return w.m.d(s0.j(new r9.e(28), h()).a(s0.c(h(), 2)), s0.l(new r9.e(29), h()).a(s0.d(h(), 2)));
    }

    public static ArrayList i(Object... objArr) {
        m.e(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList((Collection) new l(objArr, true));
    }

    public static final t5.d i0(String str) {
        m.e(str, "name");
        return new t5.d(str);
    }

    public static int j(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        m.e(arrayList, "<this>");
        Z(arrayList.size(), size);
        int i10 = size - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            int iZ = p30.f.Z((Comparable) arrayList.get(i12), comparable);
            if (iZ < 0) {
                i11 = i12 + 1;
            } else {
                if (iZ <= 0) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static void j0() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static i00.b k(List list) {
        m.e(list, "builder");
        i00.b bVar = (i00.b) list;
        bVar.k();
        bVar.C = true;
        return bVar.B > 0 ? bVar : i00.b.D;
    }

    public static void k0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final void l(v vVar, Throwable th2) {
        CancellationException cancellationExceptionA = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (cancellationExceptionA == null) {
            cancellationExceptionA = c0.a("Channel was consumed, consumer had failed", th2);
        }
        vVar.i(cancellationExceptionA);
    }

    public static final g00.k l0(Object obj, Object obj2) {
        return new g00.k(obj, obj2);
    }

    public static final k10.h m(k10.h hVar, k10.h hVar2) {
        m.e(hVar, "first");
        m.e(hVar2, "second");
        if (hVar.isEmpty()) {
            return hVar2;
        }
        return hVar2.isEmpty() ? hVar : new k10.i(new k10.h[]{hVar, hVar2});
    }

    public static o9.m m0(MediaRoute2Info mediaRoute2Info) {
        int i10;
        if (mediaRoute2Info != null) {
            oj.q qVar = new oj.q(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString());
            Bundle bundle = (Bundle) qVar.B;
            bundle.putInt("connectionState", mediaRoute2Info.getConnectionState());
            bundle.putInt("volumeHandling", mediaRoute2Info.getVolumeHandling());
            bundle.putInt("volumeMax", mediaRoute2Info.getVolumeMax());
            bundle.putInt("volume", mediaRoute2Info.getVolume());
            Bundle extras = mediaRoute2Info.getExtras();
            if (extras == null) {
                bundle.putBundle("extras", null);
            } else {
                bundle.putBundle("extras", new Bundle(extras));
            }
            bundle.putBoolean("enabled", true);
            bundle.putBoolean("canDisconnect", false);
            if (Build.VERSION.SDK_INT >= 34) {
                bundle.putStringArrayList("deduplicationIds", new ArrayList<>(a5.b.e(mediaRoute2Info)));
                int iH = a5.b.h(mediaRoute2Info);
                i10 = 2;
                if (iH == 2) {
                    i10 = 12;
                } else if (iH == 3) {
                    i10 = 13;
                } else if (iH == 4) {
                    i10 = 14;
                } else if (iH == 22) {
                    i10 = 20;
                } else if (iH == 23) {
                    i10 = 21;
                } else if (iH == 26) {
                    i10 = 22;
                } else if (iH == 29) {
                    i10 = 24;
                } else if (iH != 2000) {
                    switch (iH) {
                        case 8:
                            i10 = 3;
                            break;
                        case 9:
                            i10 = 16;
                            break;
                        case 10:
                            i10 = 23;
                            break;
                        case 11:
                            i10 = 17;
                            break;
                        case 12:
                            i10 = 18;
                            break;
                        case 13:
                            i10 = 19;
                            break;
                        default:
                            switch (iH) {
                                case 1001:
                                    i10 = 1;
                                    break;
                                case 1002:
                                    break;
                                case 1003:
                                    i10 = 4;
                                    break;
                                case 1004:
                                    i10 = 5;
                                    break;
                                case 1005:
                                    i10 = 6;
                                    break;
                                case 1006:
                                    i10 = 7;
                                    break;
                                case 1007:
                                    i10 = 8;
                                    break;
                                case 1008:
                                    i10 = 9;
                                    break;
                                case 1009:
                                    i10 = 10;
                                    break;
                                case 1010:
                                    i10 = 11;
                                    break;
                                default:
                                    i10 = 0;
                                    break;
                            }
                            break;
                    }
                } else {
                    i10 = 1000;
                }
            } else {
                i10 = 0;
            }
            CharSequence description = mediaRoute2Info.getDescription();
            if (description != null) {
                bundle.putString("status", description.toString());
            }
            Uri iconUri = mediaRoute2Info.getIconUri();
            if (iconUri != null) {
                bundle.putString("iconUri", iconUri.toString());
            }
            Bundle extras2 = mediaRoute2Info.getExtras();
            if (extras2 != null && extras2.containsKey("androidx.mediarouter.media.KEY_EXTRAS") && extras2.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") && extras2.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
                Bundle bundle2 = extras2.getBundle("androidx.mediarouter.media.KEY_EXTRAS");
                if (bundle2 == null) {
                    bundle.putBundle("extras", null);
                } else {
                    bundle.putBundle("extras", new Bundle(bundle2));
                }
                if (i10 == 0) {
                    i10 = extras2.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0);
                }
                bundle.putInt("deviceType", i10);
                bundle.putInt("playbackType", extras2.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
                ArrayList parcelableArrayList = extras2.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
                if (parcelableArrayList != null) {
                    qVar.o(parcelableArrayList);
                }
                List<String> features = mediaRoute2Info.getFeatures();
                if (features.contains("android.media.route.feature.REMOTE_DYNAMIC_GROUP_ROUTE")) {
                    bundle.putBoolean("isDynamicGroupRoute", true);
                }
                if (features.contains("android.media.route.feature.REMOTE_GROUP_PLAYBACK")) {
                    ArrayList<String> stringArrayList = extras2.getStringArrayList("androidx.mediarouter.media.KEY_GROUP_MEMBER_IDS");
                    if (stringArrayList == null || stringArrayList.isEmpty()) {
                        Log.w("MediaRouter2Utils", "Invalid feature of a group without members");
                    } else {
                        qVar.r(stringArrayList);
                    }
                }
                return qVar.v();
            }
        }
        return null;
    }

    public static i0 n() {
        long[] jArr = q0.f14885a;
        return new i0();
    }

    public static final boolean n0(String str, String str2) {
        m.e(str, "lower");
        m.e(str2, "upper");
        if (str.equals(r30.r.v0(str2, "?", RuntimeVersion.SUFFIX))) {
            return true;
        }
        if (r30.r.p0(str2, "?", false) && m.a(str.concat("?"), str2)) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(str);
        sb2.append(")?");
        return m.a(sb2.toString(), str2);
    }

    public static long[] o(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            jArr[i10] = iArr[i10];
        }
        return jArr;
    }

    public static void o0(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
        }
    }

    public static float[] p(float[] fArr, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i10, length);
        float[] fArr2 = new float[i10];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static SharedPreferences p0(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f15571b == null) {
                    f15571b = (SharedPreferences) ta.c0.Z(new ef.b(context, 0));
                }
                sharedPreferences = f15571b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sharedPreferences;
    }

    public static b30.c q(n20.c cVar, d30.l lVar, z zVar, InputStream inputStream) throws IOException {
        h0 h0Var;
        o20.b bVar;
        m.e(cVar, "fqName");
        m.e(zVar, "module");
        try {
            j20.a aVar = j20.a.f;
            j20.a aVarN0 = qd.s0.n0(inputStream);
            j20.a aVar2 = j20.a.f;
            int i10 = ((k20.a) aVarN0).c;
            m.e(aVar2, "ourVersion");
            int i11 = ((k20.a) aVar2).c;
            int i12 = ((k20.a) aVar2).b;
            int i13 = ((k20.a) aVarN0).b;
            if (i13 == 0) {
                if (i12 == 0 && i10 == i11) {
                    o20.h hVar = new o20.h();
                    j20.b.a(hVar);
                    i20.a aVar3 = h0.K;
                    aVar3.getClass();
                    o20.f fVar = new o20.f(inputStream);
                    bVar = (o20.b) aVar3.a(fVar, hVar);
                    try {
                        fVar.a(0);
                        if (bVar.isInitialized()) {
                            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException invalidProtocolBufferException = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
                            invalidProtocolBufferException.A = bVar;
                            throw invalidProtocolBufferException;
                        }
                        h0Var = (h0) bVar;
                    } catch (kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException e3) {
                        e3.A = bVar;
                        throw e3;
                    }
                } else {
                    h0Var = null;
                }
            } else if (i13 != i12 || i10 > i11) {
                h0Var = null;
            } else {
                o20.h hVar2 = new o20.h();
                j20.b.a(hVar2);
                i20.a aVar4 = h0.K;
                aVar4.getClass();
                o20.f fVar2 = new o20.f(inputStream);
                bVar = (o20.b) aVar4.a(fVar2, hVar2);
                fVar2.a(0);
                if (bVar.isInitialized()) {
                    kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException invalidProtocolBufferException2 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
                    invalidProtocolBufferException2.A = bVar;
                    throw invalidProtocolBufferException2;
                }
                h0Var = (h0) bVar;
            }
            h0 h0Var2 = h0Var;
            inputStream.close();
            if (h0Var2 != null) {
                return new b30.c(cVar, lVar, zVar, h0Var2, aVarN0);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + aVar2 + ", actual " + aVarN0 + ". Please update Kotlin");
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ta.c0.C(inputStream, th2);
                throw th3;
            }
        }
    }

    public static v5.n r(Context context) {
        ProviderInfo providerInfo;
        v4.c cVar;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        rd.a.i(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            cVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                cVar = new v4.c(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e3) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e3);
                cVar = null;
            }
        }
        if (cVar == null) {
            return null;
        }
        return new v5.n(new v5.m(context, cVar));
    }

    public static i00.b s() {
        return new i00.b(10);
    }

    public static q4.c[] t(String str) {
        int i10;
        String strTrim;
        float[] fArrP;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i13 < str.length()) {
            while (i13 < str.length()) {
                char cCharAt = str.charAt(i13);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i12, i13).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i11) != 'z' || strTrim.charAt(i11) == 'Z') {
                                fArrP = new float[i11];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i14 = i11;
                                    int i15 = 1;
                                    while (i15 < length) {
                                        int i16 = i11;
                                        int i17 = i16;
                                        int i18 = i17;
                                        int i19 = i18;
                                        for (int i20 = i15; i20 < strTrim.length(); i20++) {
                                            char cCharAt2 = strTrim.charAt(i20);
                                            if (cCharAt2 == ' ') {
                                                i16 = 0;
                                                i18 = 1;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        i16 = 0;
                                                        i18 = 1;
                                                        break;
                                                    case '-':
                                                        if (i20 == i15 || i16 != 0) {
                                                            i16 = 0;
                                                        } else {
                                                            i16 = 0;
                                                            i18 = 1;
                                                            i19 = 1;
                                                        }
                                                        break;
                                                    case '.':
                                                        if (i17 == 0) {
                                                            i16 = 0;
                                                            i17 = 1;
                                                        } else {
                                                            i16 = 0;
                                                            i18 = 1;
                                                            i19 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i16 = 0;
                                                        break;
                                                }
                                            } else {
                                                i16 = 1;
                                            }
                                            if (i18 != 0) {
                                                if (i15 < i20) {
                                                    fArr[i14] = Float.parseFloat(strTrim.substring(i15, i20));
                                                    i14++;
                                                }
                                                if (i19 != 0) {
                                                    i15 = i20;
                                                } else {
                                                    i15 = i20 + 1;
                                                }
                                                i11 = 0;
                                            }
                                        }
                                        if (i15 < i20) {
                                            fArr[i14] = Float.parseFloat(strTrim.substring(i15, i20));
                                            i14++;
                                        }
                                        if (i19 != 0) {
                                            i15 = i20;
                                        } else {
                                            i15 = i20 + 1;
                                        }
                                        i11 = 0;
                                    }
                                    fArrP = p(fArr, i14);
                                    i11 = 0;
                                } catch (NumberFormatException e3) {
                                    throw new RuntimeException(a1.b.p("error in parsing \"", strTrim, "\""), e3);
                                }
                            }
                            arrayList.add(new q4.c(strTrim.charAt(i11), fArrP));
                        }
                        i12 = i13;
                        i13++;
                        i11 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i13++;
            }
            strTrim = str.substring(i12, i13).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i11) != 'z') {
                    fArrP = new float[i11];
                } else {
                    fArrP = new float[i11];
                }
                arrayList.add(new q4.c(strTrim.charAt(i11), fArrP));
            }
            i12 = i13;
            i13++;
            i11 = 0;
        }
        if (i13 - i12 != 1 || i12 >= str.length()) {
            i10 = 0;
        } else {
            i10 = 0;
            arrayList.add(new q4.c(str.charAt(i12), new float[0]));
        }
        return (q4.c[]) arrayList.toArray(new q4.c[i10]);
    }

    public static int u(byte[] bArr, int i10, com.google.crypto.tink.shaded.protobuf.d dVar) throws InvalidProtocolBufferException {
        int iC = C(bArr, i10, dVar);
        int i11 = dVar.f4252a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (i11 > bArr.length - iC) {
            throw InvalidProtocolBufferException.g();
        }
        if (i11 == 0) {
            dVar.f4254c = i.B;
            return iC;
        }
        dVar.f4254c = i.c(iC, i11, bArr);
        return iC + i11;
    }

    public static int v(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static long w(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public static int x(a1 a1Var, int i10, byte[] bArr, int i11, int i12, a0 a0Var, com.google.crypto.tink.shaded.protobuf.d dVar) throws InvalidProtocolBufferException {
        Object objNewInstance = a1Var.newInstance();
        a1 a1Var2 = a1Var;
        byte[] bArr2 = bArr;
        int i13 = i12;
        com.google.crypto.tink.shaded.protobuf.d dVar2 = dVar;
        int iV = V(objNewInstance, a1Var2, bArr2, i11, i13, dVar2);
        a1Var2.makeImmutable(objNewInstance);
        dVar2.f4254c = objNewInstance;
        a0Var.add(objNewInstance);
        while (iV < i13) {
            com.google.crypto.tink.shaded.protobuf.d dVar3 = dVar2;
            int i14 = i13;
            int iC = C(bArr2, iV, dVar3);
            if (i10 != dVar3.f4252a) {
                break;
            }
            byte[] bArr3 = bArr2;
            a1 a1Var3 = a1Var2;
            Object objNewInstance2 = a1Var3.newInstance();
            iV = V(objNewInstance2, a1Var3, bArr3, iC, i14, dVar3);
            a1Var2 = a1Var3;
            bArr2 = bArr3;
            i13 = i14;
            dVar2 = dVar3;
            a1Var2.makeImmutable(objNewInstance2);
            dVar2.f4254c = objNewInstance2;
            a0Var.add(objNewInstance2);
        }
        return iV;
    }

    public static int y(byte[] bArr, int i10, com.google.crypto.tink.shaded.protobuf.d dVar) throws InvalidProtocolBufferException {
        int iC = C(bArr, i10, dVar);
        int i11 = dVar.f4252a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (i11 == 0) {
            dVar.f4254c = RuntimeVersion.SUFFIX;
            return iC;
        }
        dVar.f4254c = new String(bArr, iC, i11, com.google.crypto.tink.shaded.protobuf.b0.f4244a);
        return iC + i11;
    }

    public static int z(byte[] bArr, int i10, com.google.crypto.tink.shaded.protobuf.d dVar) throws InvalidProtocolBufferException {
        int iC = C(bArr, i10, dVar);
        int i11 = dVar.f4252a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (i11 == 0) {
            dVar.f4254c = RuntimeVersion.SUFFIX;
            return iC;
        }
        dVar.f4254c = p1.f4308a.s(bArr, iC, i11);
        return iC + i11;
    }

    public int hashCode() {
        switch (this.f15572a) {
            case 16:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f15572a) {
            case 16:
                String strN = kotlin.jvm.internal.a0.a.b(getClass()).n();
                m.b(strN);
                return strN;
            default:
                return super.toString();
        }
    }
}
