package c7;

import android.content.Context;
import android.content.SharedPreferences;
import android.icu.text.MeasureFormat;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.media.AudioManager;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import androidx.lifecycle.a1;
import androidx.lifecycle.e1;
import bt.y1;
import ca.v;
import ca.z;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.play_billing.s3;
import d40.z0;
import e30.x0;
import h0.z1;
import h00.u;
import i2.b0;
import i2.t0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import k50.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.a0;
import l1.m1;
import l1.p2;
import l1.q2;
import l1.r1;
import m10.j0;
import m10.l0;
import m10.r0;
import m3.h0;
import m3.m0;
import m3.n0;
import m3.q0;
import q3.e0;
import qd.s0;
import ta.c0;
import tf.x;
import z2.w0;
import za.g0;
import za.w;

public abstract class i {

    public static AudioManager f2913a;

    public static String A(androidx.glance.appwidget.protobuf.i iVar) {
        StringBuilder sb2 = new StringBuilder(iVar.size());
        for (int i10 = 0; i10 < iVar.size(); i10++) {
            byte bA = iVar.a(i10);
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

    public static final byte[] B(ib.f fVar) throws IOException {
        kotlin.jvm.internal.m.e(fVar, "requestCompat");
        NetworkRequest networkRequest = (NetworkRequest) fVar.f7571a;
        if (networkRequest == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                int[] transportTypes = networkRequest.getTransportTypes();
                kotlin.jvm.internal.m.d(transportTypes, "getTransportTypes(...)");
                int[] capabilities = networkRequest.getCapabilities();
                kotlin.jvm.internal.m.d(capabilities, "getCapabilities(...)");
                objectOutputStream.writeInt(transportTypes.length);
                for (int i10 : transportTypes) {
                    objectOutputStream.writeInt(i10);
                }
                objectOutputStream.writeInt(capabilities.length);
                for (int i11 : capabilities) {
                    objectOutputStream.writeInt(i11);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                kotlin.jvm.internal.m.d(byteArray, "toByteArray(...)");
                return byteArray;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    c0.C(objectOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                c0.C(byteArrayOutputStream, th4);
                throw th5;
            }
        }
    }

    public static synchronized AudioManager C(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                f2913a = null;
            }
            AudioManager audioManager = f2913a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                e7.g gVar = new e7.g();
                e7.a.f().execute(new ab.f(applicationContext, gVar, 4));
                gVar.b();
                AudioManager audioManager2 = f2913a;
                audioManager2.getClass();
                return audioManager2;
            }
            AudioManager audioManager3 = (AudioManager) applicationContext.getSystemService("audio");
            f2913a = audioManager3;
            audioManager3.getClass();
            return audioManager3;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static SharedPreferences D(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final x3.j E(n0 n0Var, int i10) {
        m0 m0Var = n0Var.f10496a;
        m3.q qVar = n0Var.f10497b;
        if (m0Var.f10483a.B.length() != 0) {
            int iD = qVar.d(i10);
            if ((i10 != 0 && iD == qVar.d(i10 - 1)) || (i10 != m0Var.f10483a.B.length() && iD == qVar.d(i10 + 1))) {
                return n0Var.a(i10);
            }
        }
        return n0Var.i(i10);
    }

    public static boolean F(j10.c cVar) {
        kotlin.jvm.internal.m.e(cVar, "callableMemberDescriptor");
        if (!x10.f.d.contains(cVar.getName())) {
            return false;
        }
        if (h00.q.F0(x10.f.c, u20.d.c(cVar)) && cVar.O().isEmpty()) {
            return true;
        }
        if (!g10.i.A(cVar)) {
            return false;
        }
        Collection collectionM = cVar.m();
        kotlin.jvm.internal.m.d(collectionM, "getOverriddenDescriptors(...)");
        Collection<j10.c> collection = collectionM;
        if (collection.isEmpty()) {
            return false;
        }
        for (j10.c cVar2 : collection) {
            kotlin.jvm.internal.m.b(cVar2);
            if (F(cVar2)) {
                return true;
            }
        }
        return false;
    }

    public static int G(long j9) {
        return (int) (j9 ^ (j9 >>> 32));
    }

    public static final b2.r H(b2.r rVar, boolean z10, t0 t0Var) {
        kotlin.jvm.internal.m.e(rVar, "<this>");
        long j9 = dl.a.i;
        return p30.f.k0(rVar, z10, i2.t.b(0.08f, j9), t0Var, s0.r0(i2.t.b(0.28f, j9)));
    }

    public static final za.a I(int i10) {
        if (i10 == 0) {
            return za.a.A;
        }
        if (i10 == 1) {
            return za.a.B;
        }
        throw new IllegalArgumentException(g4.c.i("Could not convert ", i10, " to BackoffPolicy"));
    }

    public static final w J(int i10) {
        if (i10 == 0) {
            return w.A;
        }
        if (i10 == 1) {
            return w.B;
        }
        if (i10 == 2) {
            return w.C;
        }
        if (i10 == 3) {
            return w.D;
        }
        if (i10 == 4) {
            return w.E;
        }
        if (i10 == 5) {
            return w.F;
        }
        throw new IllegalArgumentException(g4.c.i("Could not convert ", i10, " to NetworkType"));
    }

    public static final za.c0 K(int i10) {
        if (i10 == 0) {
            return za.c0.A;
        }
        if (i10 == 1) {
            return za.c0.B;
        }
        throw new IllegalArgumentException(g4.c.i("Could not convert ", i10, " to OutOfQuotaPolicy"));
    }

    public static final g0 L(int i10) {
        if (i10 == 0) {
            return g0.A;
        }
        if (i10 == 1) {
            return g0.B;
        }
        if (i10 == 2) {
            return g0.C;
        }
        if (i10 == 3) {
            return g0.D;
        }
        if (i10 == 4) {
            return g0.E;
        }
        if (i10 == 5) {
            return g0.F;
        }
        throw new IllegalArgumentException(g4.c.i("Could not convert ", i10, " to State"));
    }

    public static final boolean M(h2.d dVar) {
        long j9 = dVar.f6554e;
        return (j9 >>> 32) == (4294967295L & j9) && j9 == dVar.f6555f && j9 == dVar.f6556g && j9 == dVar.f6557h;
    }

    public static final void N(Exception exc, cd.b bVar, String str) {
        kotlin.jvm.internal.m.e(bVar, "logger");
        String message = exc.getMessage();
        if (message != null) {
            bVar.a(str + ": " + message);
        }
        if (exc.getStackTrace() != null) {
            bVar.a("Stack trace: ".concat(s0.s0(exc)));
        }
    }

    public static final int O(w wVar) {
        kotlin.jvm.internal.m.e(wVar, "networkType");
        int iOrdinal = wVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i10 = 1;
        if (iOrdinal != 1) {
            i10 = 2;
            if (iOrdinal != 2) {
                i10 = 3;
                if (iOrdinal != 3) {
                    i10 = 4;
                    if (iOrdinal != 4) {
                        if (wVar == w.F) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + wVar + " to int");
                    }
                }
            }
        }
        return i10;
    }

    public static y P(k50.l... lVarArr) {
        if (lVarArr.length == 0) {
            return new y(new k50.l[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList((Collection) new h00.l(lVarArr, false));
        u.s0(arrayList);
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(-1);
        }
        int length = lVarArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            arrayList2.set(va.a.j(arrayList, lVarArr[i11]), Integer.valueOf(i12));
            i11++;
            i12++;
        }
        if (((k50.l) arrayList.get(0)).d() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i13 = 0;
        while (i13 < arrayList.size()) {
            k50.l lVar = (k50.l) arrayList.get(i13);
            int i14 = i13 + 1;
            int i15 = i14;
            while (i15 < arrayList.size()) {
                k50.l lVar2 = (k50.l) arrayList.get(i15);
                lVar2.getClass();
                kotlin.jvm.internal.m.e(lVar, "prefix");
                if (!lVar2.l(0, lVar, lVar.d())) {
                    break;
                }
                if (lVar2.d() == lVar.d()) {
                    throw new IllegalArgumentException(("duplicate option: " + lVar2).toString());
                }
                if (((Number) arrayList2.get(i15)).intValue() > ((Number) arrayList2.get(i13)).intValue()) {
                    arrayList.remove(i15);
                    arrayList2.remove(i15);
                } else {
                    i15++;
                }
            }
            i13 = i14;
        }
        k50.i iVar = new k50.i();
        m(0L, iVar, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i16 = (int) (iVar.B / ((long) 4));
        int[] iArr = new int[i16];
        for (int i17 = 0; i17 < i16; i17++) {
            iArr[i17] = iVar.readInt();
        }
        Object[] objArrCopyOf = Arrays.copyOf(lVarArr, lVarArr.length);
        kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
        return new y((k50.l[]) objArrCopyOf, iArr);
    }

    public static final to.f Q(go.a aVar, l1.j jVar) {
        e60.a aVarA = q50.c.a(jVar);
        l1.g0 g0Var = (l1.g0) jVar;
        boolean zG = g0Var.g(null) | g0Var.g(aVarA);
        Object objN = g0Var.N();
        l1.c cVar = l1.i.f9868a;
        if (zG || objN == cVar) {
            objN = oi.k.f(a0.a, ko.c.class, aVarA, null, g0Var);
        }
        ko.c cVar2 = (ko.c) objN;
        boolean zG2 = g0Var.g(aVar) | g0Var.g(cVar2);
        Object objN2 = g0Var.N();
        if (zG2 || objN2 == cVar) {
            objN2 = d40.o.o(new y1(new z0(((no.n) aVar).r), cVar2, 18));
            g0Var.n0(objN2);
        }
        return (to.f) k00.f.p((d40.i) objN2, (Object) null, jVar, 48).getValue();
    }

    public static final xk.d R(l1.j jVar) {
        xk.b[] bVarArr = xk.b.A;
        l1.g0 g0Var = (l1.g0) jVar;
        Object objN = g0Var.N();
        if (objN == l1.i.f9868a) {
            objN = new xk.d();
            g0Var.n0(objN);
        }
        return (xk.d) objN;
    }

    public static final a1 S(a10.d dVar, e1 e1Var, String str, t6.b bVar, e60.a aVar, u00.a aVar2) {
        kotlin.jvm.internal.m.e(dVar, "vmClass");
        kotlin.jvm.internal.m.e(e1Var, "viewModelStore");
        kotlin.jvm.internal.m.e(bVar, "extras");
        kotlin.jvm.internal.m.e(aVar, "scope");
        p10.a aVar3 = new p10.a(e1Var, new j60.b(dVar, aVar, aVar2), bVar);
        dVar.m();
        if (str == null) {
            str = null;
        }
        if (str != null) {
            return aVar3.o(dVar, str);
        }
        String strM = dVar.m();
        if (strM != null) {
            return aVar3.o(dVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public static final Integer T(long j9, List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        if (j9 < 0) {
            j9 = 0;
        }
        if (j9 < ((ot.a) h00.q.L0(list)).b) {
            return Integer.valueOf(((ot.a) h00.q.L0(list)).a);
        }
        int iM = va.a.M(list);
        int i10 = 0;
        int i11 = 0;
        while (i10 <= iM) {
            int i12 = (i10 + iM) / 2;
            if (((ot.a) list.get(i12)).b <= j9) {
                i10 = i12 + 1;
                i11 = i12;
            } else {
                iM = i12 - 1;
            }
        }
        return Integer.valueOf(((ot.a) list.get(i11)).a);
    }

    public static final byte[] U(Set set) throws IOException {
        kotlin.jvm.internal.m.e(set, "triggers");
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    za.d dVar = (za.d) it.next();
                    objectOutputStream.writeUTF(dVar.f17353a.toString());
                    objectOutputStream.writeBoolean(dVar.f17354b);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                kotlin.jvm.internal.m.d(byteArray, "toByteArray(...)");
                return byteArray;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    c0.C(objectOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                c0.C(byteArrayOutputStream, th4);
                throw th5;
            }
        }
    }

    public static final b2.r V(b2.r rVar, xk.d dVar, l1.j jVar) {
        kotlin.jvm.internal.m.e(rVar, "<this>");
        kotlin.jvm.internal.m.e(dVar, "state");
        float fFloatValue = ((Number) dVar.a.d()).floatValue();
        l1.g0 g0Var = (l1.g0) jVar;
        boolean zD = g0Var.d(fFloatValue);
        Object objN = g0Var.N();
        if (zD || objN == l1.i.f9868a) {
            objN = new cs.i(fFloatValue, 6);
            g0Var.n0(objN);
        }
        return b0.p(rVar, (u00.k) objN);
    }

    public static final int W(g0 g0Var) throws NoWhenBranchMatchedException {
        kotlin.jvm.internal.m.e(g0Var, "state");
        int iOrdinal = g0Var.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i10 = 1;
        if (iOrdinal != 1) {
            i10 = 2;
            if (iOrdinal != 2) {
                i10 = 3;
                if (iOrdinal != 3) {
                    i10 = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
        }
        return i10;
    }

    public static final ib.f X(byte[] bArr) throws IOException {
        kotlin.jvm.internal.m.e(bArr, "bytes");
        if (bArr.length == 0) {
            return new ib.f(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i10 = objectInputStream.readInt();
                int[] iArr = new int[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    iArr[i11] = objectInputStream.readInt();
                }
                int i12 = objectInputStream.readInt();
                int[] iArr2 = new int[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    iArr2[i13] = objectInputStream.readInt();
                }
                ib.f fVarC = ib.g.c(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return fVarC;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    c0.C(objectInputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                c0.C(byteArrayInputStream, th4);
                throw th5;
            }
        }
    }

    public static final float Y(ab.a0 a0Var, xb.f fVar) throws NoWhenBranchMatchedException {
        if (a0Var instanceof xb.a) {
            return ((xb.a) a0Var).f16510a;
        }
        int iOrdinal = fVar.ordinal();
        if (iOrdinal == 0) {
            return Float.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Float.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final long Z(long j9, long j10) {
        int iE;
        int iG = q0.g(j9);
        int iF = q0.f(j9);
        if ((q0.g(j10) < q0.f(j9)) && (q0.g(j9) < q0.f(j10))) {
            if (q0.a(j10, j9)) {
                iG = q0.g(j10);
                iF = iG;
            } else {
                if (q0.a(j9, j10)) {
                    iE = q0.e(j10);
                } else {
                    int iG2 = q0.g(j10);
                    if (iG >= q0.f(j10) || iG2 > iG) {
                        iF = q0.g(j10);
                    } else {
                        iG = q0.g(j10);
                        iE = q0.e(j10);
                    }
                }
                iF -= iE;
            }
        } else if (iF > q0.g(j10)) {
            iG -= q0.e(j10);
            iE = q0.e(j10);
            iF -= iE;
        }
        return h0.b(iG, iF);
    }

    public static final void a(jk.a aVar, u00.a aVar2, b2.r rVar, l1.j jVar, int i10) {
        b2.r rVar2;
        kotlin.jvm.internal.m.e(aVar, "backdrop");
        kotlin.jvm.internal.m.e(aVar2, "onMiniPlayerClicked");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1710724686);
        int i11 = (g0Var.i(aVar) ? 4 : 2) | i10 | (g0Var.i(aVar2) ? 32 : 16) | 384;
        if (g0Var.S(i11 & 1, (i11 & 147) != 146)) {
            e60.a aVarA = q50.c.a(g0Var);
            boolean zG = g0Var.g(null) | g0Var.g(aVarA);
            Object objN = g0Var.N();
            if (zG || objN == l1.i.f9868a) {
                objN = oi.k.f(a0.a, go.a.class, aVarA, null, g0Var);
            }
            go.a aVar3 = (go.a) objN;
            to.f fVarQ = Q(aVar3, g0Var);
            if (fVarQ == null) {
                r1 r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new lv.a(aVar, aVar2, i10, 1);
                    return;
                }
                return;
            }
            b2.o oVar = b2.o.A;
            ze.d.d(aVar2, aVar, h0.c.E(z1.d(oVar, 1.0f), 16, 0.0f, 2), false, 0L, dl.a.P, 0.0f, null, v1.d.d(-1219272205, new c0.f(aVar3, fVarQ, 19), g0Var), g0Var, ((i11 >> 3) & 14) | 806879232 | ((i11 << 3) & 112), 408);
            rVar2 = oVar;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT2 = g0Var.t();
        if (r1VarT2 != null) {
            r1VarT2.f9921d = new po.b(aVar, aVar2, rVar2, i10, 1);
        }
    }

    public static void a0(int i10, qd.h hVar, qd.n0 n0Var, int i11) {
        int i12 = qd.m0.f12911a;
        ((e0) n0Var).x(qd.m0.b(i10, 29, hVar, null, s3.BROADCAST_ACTION_UNSPECIFIED), i11);
    }

    public static final void b(jk.a aVar, u00.a aVar2, u00.a aVar3, u00.a aVar4, b2.r rVar, l1.j jVar, int i10) {
        b2.r rVar2;
        r1 r1VarT;
        to.h hVar;
        kotlin.jvm.internal.m.e(aVar, "backdrop");
        kotlin.jvm.internal.m.e(aVar2, "onMiniPlayerClicked");
        kotlin.jvm.internal.m.e(aVar3, "onEpisodesClicked");
        kotlin.jvm.internal.m.e(aVar4, "onTextClicked");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-717843716);
        int i11 = i10 | (g0Var.i(aVar) ? 4 : 2) | (g0Var.i(aVar2) ? 32 : 16) | (g0Var.i(aVar3) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | (g0Var.i(aVar4) ? 2048 : 1024) | (g0Var.g(rVar) ? 16384 : 8192);
        if (g0Var.S(i11 & 1, (i11 & 9363) != 9362)) {
            e60.a aVarA = q50.c.a(g0Var);
            boolean zG = g0Var.g(null) | g0Var.g(aVarA);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (zG || objN == cVar) {
                objN = oi.k.f(a0.a, go.a.class, aVarA, null, g0Var);
            }
            go.a aVar5 = (go.a) objN;
            to.f fVarQ = Q(aVar5, g0Var);
            if (fVarQ == null) {
                r1VarT = g0Var.t();
                if (r1VarT == null) {
                    return;
                } else {
                    hVar = new to.h(aVar, aVar2, aVar3, aVar4, rVar, i10, 0);
                }
            } else {
                rVar2 = rVar;
                Object objN2 = g0Var.N();
                if (objN2 == cVar) {
                    objN2 = l1.q.z(Boolean.FALSE);
                    g0Var.n0(objN2);
                }
                l1.z0 z0Var = (l1.z0) objN2;
                Object objN3 = g0Var.N();
                if (objN3 == cVar) {
                    objN3 = l1.q.z(Boolean.FALSE);
                    g0Var.n0(objN3);
                }
                ze.d.d(aVar2, aVar, z1.r(rVar2, MediaError.DetailedErrorCode.DASH_MANIFEST_UNKNOWN, 660), false, 0L, dl.a.P, 65, null, v1.d.d(341469793, new gz.z0(fVarQ, aVar5, aVar4, aVar3, z0Var, (l1.z0) objN3, 5), g0Var), g0Var, ((i11 >> 3) & 14) | 819462144 | ((i11 << 3) & 112), 280);
            }
            r1VarT.f9921d = hVar;
        }
        rVar2 = rVar;
        g0Var.V();
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            hVar = new to.h(aVar, aVar2, aVar3, aVar4, rVar2, i10, 1);
            r1VarT.f9921d = hVar;
        }
    }

    public static void b0(int i10, int i11) {
        String strL;
        if (i10 < 0 || i10 >= i11) {
            if (i10 < 0) {
                strL = v.L("%s (%s) must not be negative", "index", Integer.valueOf(i10));
            } else {
                if (i11 < 0) {
                    throw new IllegalArgumentException(x5.j(i11, "negative size: ", new StringBuilder(String.valueOf(i11).length() + 15)));
                }
                strL = v.L("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            }
            throw new IndexOutOfBoundsException(strL);
        }
    }

    public static final h2.d c(float f3, float f10, float f11, float f12, float f13, float f14) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L);
        return new h2.d(f3, f10, f11, f12, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits);
    }

    public static void c0(int i10, int i11, int i12) {
        String strD0;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strD0 = d0(i10, "start index", i12);
            } else {
                strD0 = (i11 < 0 || i11 > i12) ? d0(i11, "end index", i12) : v.L("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strD0);
        }
    }

    public static final h2.d d(h2.c cVar, long j9, long j10, long j11, long j12) {
        return new h2.d(cVar.f6546a, cVar.f6547b, cVar.f6548c, cVar.f6549d, j9, j10, j11, j12);
    }

    public static String d0(int i10, String str, int i11) {
        if (i10 < 0) {
            return v.L("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return v.L("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(x5.j(i11, "negative size: ", new StringBuilder(String.valueOf(i11).length() + 15)));
    }

    public static h2.d e(h2.c cVar, long j9, long j10, long j11, long j12, int i10) {
        if ((i10 & 2) != 0) {
            j9 = 0;
        }
        if ((i10 & 4) != 0) {
            j10 = 0;
        }
        if ((i10 & 8) != 0) {
            j11 = 0;
        }
        if ((i10 & 16) != 0) {
            j12 = 0;
        }
        return d(cVar, j9, j10, j11, j12);
    }

    public static final h2.d f(float f3, float f10, float f11, float f12, long j9) {
        return c(f3, f10, f11, f12, Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)));
    }

    public static final void g(u00.a aVar, b2.r rVar, i2.q qVar, long j9, float f3, int i10, l1.j jVar, int i11) {
        i2.q qVar2;
        long j10;
        int i12;
        int i13;
        i2.q qVarL;
        boolean z10;
        int i14;
        long jB;
        kotlin.jvm.internal.m.e(aVar, "progress");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1064696892);
        int i15 = i11 | (g0Var.i(aVar) ? 4 : 2);
        if ((i11 & 48) == 0) {
            i15 |= g0Var.g(rVar) ? 32 : 16;
        }
        int i16 = i15 | 1152 | (g0Var.d(f3) ? 16384 : 8192) | Cast.MAX_MESSAGE_LENGTH;
        if (g0Var.S(i16 & 1, (74899 & i16) != 74898)) {
            g0Var.X();
            if ((i11 & 1) == 0 || g0Var.A()) {
                long j11 = dl.a.n;
                i13 = i16 & (-466817);
                qVarL = sg.f.L(va.a.S(new i2.t(j11), new i2.t(j11)), 0.0f, 0.0f, 14);
                z10 = true;
                i14 = 1;
                jB = i2.t.b(0.25f, dl.a.o);
            } else {
                g0Var.V();
                i13 = i16 & (-466817);
                qVarL = qVar;
                i14 = i10;
                z10 = true;
                jB = j9;
            }
            g0Var.s();
            boolean z11 = (i13 & 14) == 4 ? z10 : false;
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (z11 || objN == cVar) {
                objN = new es.b(0, aVar);
                g0Var.n0(objN);
            }
            u00.a aVar2 = (u00.a) objN;
            b2.r rVarM = h0.c.m(rVar, 2.0f);
            boolean zG = g0Var.g(aVar2);
            Object objN2 = g0Var.N();
            if (zG || objN2 == cVar) {
                objN2 = new ca.q(3, aVar2);
                g0Var.n0(objN2);
            }
            b2.r rVarC = j3.q.c(rVarM, false, (u00.k) objN2);
            boolean zG2 = ((i13 & 57344) == 16384) | g0Var.g(aVar2) | g0Var.f(jB) | g0Var.e(i14) | g0Var.g(qVarL);
            Object objN3 = g0Var.N();
            if (zG2 || objN3 == cVar) {
                objN3 = new es.c(f3, aVar2, jB, i14, qVarL);
                g0Var.n0(objN3);
            }
            z.n.b(0, rVarC, g0Var, (u00.k) objN3);
            j10 = jB;
            i12 = i14;
            qVar2 = qVarL;
        } else {
            g0Var.V();
            qVar2 = qVar;
            j10 = j9;
            i12 = i10;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new es.d(aVar, rVar, qVar2, j10, f3, i12, i11);
        }
    }

    public static final void h(l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1527245859);
        if (g0Var.S(i10 & 1, i10 != 0)) {
            e60.a aVarA = q50.c.a(g0Var);
            boolean zG = g0Var.g(null) | g0Var.g(aVarA);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (zG || objN == cVar) {
                objN = oi.k.f(a0.a, sy.b.class, aVarA, null, g0Var);
            }
            sy.b bVar = (sy.b) objN;
            e60.a aVarA2 = q50.c.a(g0Var);
            boolean zG2 = g0Var.g(null) | g0Var.g(aVarA2);
            Object objN2 = g0Var.N();
            if (zG2 || objN2 == cVar) {
                objN2 = oi.k.f(a0.a, sy.c.class, aVarA2, null, g0Var);
            }
            sy.c cVar2 = (sy.c) objN2;
            e60.a aVarA3 = q50.c.a(g0Var);
            boolean zG3 = g0Var.g(null) | g0Var.g(aVarA3);
            Object objN3 = g0Var.N();
            if (zG3 || objN3 == cVar) {
                objN3 = oi.k.f(a0.a, wo.c0.class, aVarA3, null, g0Var);
            }
            l1.z0 z0VarQ = k00.f.q(new z0(((wo.c0) objN3).c), g0Var, 0);
            h00.a aVarT = f50.k.t(q50.c.b(g0Var).c("SETTINGS_SCOPE_KEY", new b60.b("SETTINGS_SCOPE_KEY")), g0Var);
            Boolean bool = (Boolean) z0VarQ.getValue();
            bool.booleanValue();
            boolean zG4 = g0Var.g(z0VarQ) | g0Var.i(cVar2);
            Object objN4 = g0Var.N();
            if (zG4 || objN4 == cVar) {
                objN4 = new lu.w(cVar2, z0VarQ, (k00.c) null, 13);
                g0Var.n0(objN4);
            }
            l1.q.i(bool, g0Var, (u00.n) objN4);
            Object objU0 = h00.q.U0(cVar2.b);
            boolean zI = g0Var.i(cVar2) | g0Var.g(bVar);
            Object objN5 = g0Var.N();
            if (zI || objN5 == cVar) {
                objN5 = new lu.w(cVar2, bVar, (k00.c) null, 14);
                g0Var.n0(objN5);
            }
            l1.q.i(objU0, g0Var, (u00.n) objN5);
            z1.p pVar = cVar2.b;
            h0.a0 a0Var = z1.f6478c;
            boolean zI2 = g0Var.i(cVar2);
            Object objN6 = g0Var.N();
            if (zI2 || objN6 == cVar) {
                pi.c cVar3 = new pi.c(0, cVar2, sy.c.class, "navigateBack", "navigateBack()V", 0, 6);
                g0Var.n0(cVar3);
                objN6 = cVar3;
            }
            List listS = va.a.S(bi.b.N(g0Var), p30.f.o0(g0Var));
            q2 q2Var = cq.l.a;
            p30.f.O(pVar, a0Var, (b2.d) null, (a10.g) objN6, listS, (sg.f) null, (u00.k) null, (u00.k) null, (u00.n) null, new a1.e1(aVarT, 7), g0Var, 48);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new qs.c(i10, 21);
        }
    }

    public static final void i(ru.d dVar, boolean z10, u00.a aVar, u00.a aVar2, u00.k kVar, b2.r rVar, l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1959742929);
        int i11 = i10 | (g0Var.e(dVar.ordinal()) ? 4 : 2) | (g0Var.h(z10) ? 32 : 16) | (g0Var.i(kVar) ? 16384 : 8192);
        if (g0Var.S(i11 & 1, (i11 & 74899) != 74898)) {
            p2 p2VarB = x.d.b(dVar != ru.d.E ? 1.0f : 0.7f, null, null, g0Var, 0, 30);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVar, g0Var);
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
            m2.b bVarR = y3.R(2131231392, g0Var, 0);
            long jB = i2.t.b(((Number) p2VarB.getValue()).floatValue(), dl.a.i);
            float f3 = 20;
            gv.p.i(bVarR, jB, false, aVar, (b2.r) null, false, f3, f3, 0L, g0Var, 14159240, 304);
            ru.d.B.getClass();
            int i12 = i11 >> 3;
            gv.p.x(z10, dVar, aVar2, kVar, 2131886149, ru.d.D, g0Var, (i12 & 14) | ((i11 << 3) & 112) | 384 | (i12 & 7168), 0);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new as.h0(dVar, z10, aVar, aVar2, kVar, rVar, i10);
        }
    }

    public static final void j(float f3, boolean z10, u00.a aVar, u00.a aVar2, u00.k kVar, l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1689946228);
        int i11 = i10 | (g0Var.d(f3) ? 4 : 2) | (g0Var.h(z10) ? 32 : 16) | (g0Var.i(kVar) ? 16384 : 8192);
        if (g0Var.S(i11 & 1, (i11 & 9363) != 9362)) {
            boolean z11 = (i11 & 14) == 4;
            Object objN = g0Var.N();
            if (z11 || objN == l1.i.f9868a) {
                yu.f.B.getClass();
                objN = x.a(f3).a();
                g0Var.n0(objN);
            }
            String str = (String) objN;
            p2 p2VarB = x.d.b(f3 == 1.0f ? 0.7f : 1.0f, null, null, g0Var, 0, 30);
            b2.r rVarS = z1.s(b2.o.A, 20, 0.0f, 2);
            w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarS, g0Var);
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
            int i12 = i11 << 3;
            gv.p.j(str, i2.t.b(((Number) p2VarB.getValue()).floatValue(), dl.a.i), false, aVar, (b2.r) null, kh.o.z(15), g0Var, 200064);
            int i13 = i11 >> 3;
            gv.p.m(z10, f3, aVar2, kVar, g0Var, (i13 & 14) | (i12 & 112) | 384 | (i13 & 7168));
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new dn.h(f3, z10, aVar, aVar2, kVar, i10);
        }
    }

    public static final ArrayList k(List list) {
        ArrayList arrayList = new ArrayList(h00.r.q0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ho.a aVar = (ho.a) it.next();
            List<ho.g> list2 = aVar.g;
            ArrayList arrayList2 = new ArrayList(h00.r.q0(list2, 10));
            for (ho.g gVar : list2) {
                arrayList2.add(ho.g.a(gVar, 0, (String) null, (String) null, 0L, (String) null, gVar.c() ? 1L : 0L, false, 0, 15359));
            }
            arrayList.add(ho.a.a(aVar, arrayList2));
        }
        return arrayList;
    }

    public static void l(SpannableStringBuilder spannableStringBuilder, Object obj, int i10, int i11) {
        for (Object obj2 : spannableStringBuilder.getSpans(i10, i11, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i10 && spannableStringBuilder.getSpanEnd(obj2) == i11 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i10, i11, 33);
    }

    public static void m(long j9, k50.i iVar, int i10, ArrayList arrayList, int i11, int i12, ArrayList arrayList2) {
        int i13;
        int i14;
        ArrayList arrayList3;
        long j10;
        int i15;
        int i16 = i10;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i11 >= i12) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i17 = i11; i17 < i12; i17++) {
            if (((k50.l) arrayList4.get(i17)).d() < i16) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        k50.l lVar = (k50.l) arrayList.get(i11);
        k50.l lVar2 = (k50.l) arrayList4.get(i12 - 1);
        if (i16 == lVar.d()) {
            int iIntValue = ((Number) arrayList5.get(i11)).intValue();
            int i18 = i11 + 1;
            k50.l lVar3 = (k50.l) arrayList4.get(i18);
            i13 = i18;
            i14 = iIntValue;
            lVar = lVar3;
        } else {
            i13 = i11;
            i14 = -1;
        }
        if (lVar.i(i16) == lVar2.i(i16)) {
            int iMin = Math.min(lVar.d(), lVar2.d());
            int i19 = 0;
            for (int i20 = i16; i20 < iMin && lVar.i(i20) == lVar2.i(i20); i20++) {
                i19++;
            }
            long j11 = 4;
            long j12 = (iVar.B / j11) + j9 + ((long) 2) + ((long) i19) + 1;
            iVar.t0(-i19);
            iVar.t0(i14);
            int i21 = i16 + i19;
            while (i16 < i21) {
                iVar.t0(lVar.i(i16) & 255);
                i16++;
            }
            if (i13 + 1 == i12) {
                if (i21 != ((k50.l) arrayList4.get(i13)).d()) {
                    throw new IllegalStateException("Check failed.");
                }
                iVar.t0(((Number) arrayList5.get(i13)).intValue());
                return;
            } else {
                k50.i iVar2 = new k50.i();
                iVar.t0(((int) ((iVar2.B / j11) + j12)) * (-1));
                m(j12, iVar2, i21, arrayList4, i13, i12, arrayList5);
                iVar.p0(iVar2);
                return;
            }
        }
        int i22 = 1;
        for (int i23 = i13 + 1; i23 < i12; i23++) {
            if (((k50.l) arrayList4.get(i23 - 1)).i(i16) != ((k50.l) arrayList4.get(i23)).i(i16)) {
                i22++;
            }
        }
        long j13 = 4;
        long j14 = (iVar.B / j13) + j9 + ((long) 2) + ((long) (i22 * 2));
        iVar.t0(i22);
        iVar.t0(i14);
        for (int i24 = i13; i24 < i12; i24++) {
            byte bI = ((k50.l) arrayList4.get(i24)).i(i16);
            if (i24 == i13 || bI != ((k50.l) arrayList4.get(i24 - 1)).i(i16)) {
                iVar.t0(bI & 255);
            }
        }
        k50.i iVar3 = new k50.i();
        int i25 = i13;
        while (i25 < i12) {
            byte bI2 = ((k50.l) arrayList4.get(i25)).i(i16);
            int i26 = i25 + 1;
            int i27 = i26;
            while (true) {
                if (i27 >= i12) {
                    i27 = i12;
                    break;
                } else if (bI2 != ((k50.l) arrayList4.get(i27)).i(i16)) {
                    break;
                } else {
                    i27++;
                }
            }
            if (i26 == i27 && i16 + 1 == ((k50.l) arrayList4.get(i25)).d()) {
                iVar.t0(((Number) arrayList5.get(i25)).intValue());
                arrayList3 = arrayList5;
                j10 = j14;
                i15 = i27;
            } else {
                iVar.t0(((int) ((iVar3.B / j13) + j14)) * (-1));
                arrayList3 = arrayList5;
                j10 = j14;
                i15 = i27;
                m(j10, iVar3, i16 + 1, arrayList, i25, i15, arrayList3);
                arrayList4 = arrayList;
            }
            j14 = j10;
            i25 = i15;
            arrayList5 = arrayList3;
        }
        iVar.p0(iVar3);
    }

    public static final LinkedHashSet n(byte[] bArr) throws IOException {
        kotlin.jvm.internal.m.e(bArr, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i10 = objectInputStream.readInt();
                    for (int i11 = 0; i11 < i10; i11++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z10 = objectInputStream.readBoolean();
                        kotlin.jvm.internal.m.b(uri);
                        linkedHashSet.add(new za.d(z10, uri));
                    }
                    objectInputStream.close();
                    byteArrayInputStream.close();
                    return linkedHashSet;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        c0.C(objectInputStream, th2);
                        throw th3;
                    }
                }
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                c0.C(byteArrayInputStream, th4);
                throw th5;
            }
        }
    }

    public static final void o(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(w.c.h(i10, i11, "index: ", ", size: "));
        }
    }

    public static final void p(int i10, int i11) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(w.c.h(i10, i11, "index: ", ", size: "));
        }
    }

    public static final void q(int i10, int i11, int i12) {
        if (i10 < 0 || i11 > i12) {
            StringBuilder sbP = oi.k.p(i10, i11, "fromIndex: ", ", toIndex: ", ", size: ");
            sbP.append(i12);
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        if (i10 > i11) {
            throw new IllegalArgumentException(w.c.h(i10, i11, "fromIndex: ", " > toIndex: "));
        }
    }

    public static oj.q r(oj.q qVar, j10.g gVar, p10.o oVar, int i10) throws NoWhenBranchMatchedException {
        if ((i10 & 2) != 0) {
            oVar = null;
        }
        kotlin.jvm.internal.m.e(qVar, "<this>");
        return new oj.q((a20.b) qVar.B, (a20.h) (oVar != null ? new a20.g(qVar, gVar, oVar, 0) : (a20.h) qVar.C), rd.a.I(g00.i.C, new a20.a(qVar, gVar, 0)));
    }

    public static String s(long j9) {
        if (j9 < 0) {
            j9 = 0;
        }
        long j10 = j9 / 1000;
        long j11 = j10 / 3600;
        long j12 = (j10 % 3600) / 60;
        long j13 = j10 % 60;
        return j11 > 0 ? String.format(Locale.ROOT, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(j13)}, 3)) : String.format(Locale.ROOT, "%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j12), Long.valueOf(j13)}, 2));
    }

    public static final Object t(ca.t tVar, u00.k kVar, k00.c cVar) {
        if ((!tVar.k() || !tVar.n() || !tVar.l()) && cVar.getContext().get(ca.w.A) != null) {
            a1.d dVar = new a1.d(kVar, null, 23);
            ca.y yVar = (ca.y) cVar.getContext().get(ca.y.B);
            k00.e eVar = yVar != null ? yVar.A : null;
            if (eVar != null) {
                return a40.c0.J(dVar, eVar, cVar);
            }
            a40.k kVar2 = new a40.k(1, s0.j0(cVar));
            kVar2.r();
            try {
                z zVar = tVar.f3093d;
                if (zVar == null) {
                    kotlin.jvm.internal.m.k("internalTransactionExecutor");
                    throw null;
                }
                zVar.execute(new ca.u(kVar2, tVar, dVar, 0));
                Object objQ = kVar2.q();
                l00.a aVar = l00.a.A;
                return objQ;
            } catch (RejectedExecutionException e3) {
                kVar2.h(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e3));
            }
        }
        return kVar.invoke(cVar);
    }

    public static String u(j10.u uVar, int i10) {
        String strB;
        boolean z10 = (i10 & 1) != 0;
        boolean z11 = (i10 & 2) != 0;
        kotlin.jvm.internal.m.e(uVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (z11) {
            if (uVar instanceof j10.j) {
                strB = "<init>";
            } else {
                strB = ((m10.m) uVar).getName().b();
                kotlin.jvm.internal.m.d(strB, "asString(...)");
            }
            sb2.append(strB);
        }
        sb2.append("(");
        m10.u uVarX = uVar.X();
        n30.c cVar = n30.c.A;
        if (uVarX != null) {
            e30.w type = uVarX.getType();
            kotlin.jvm.internal.m.d(type, "getType(...)");
            sb2.append((g20.k) a.a.S(type, g20.r.i, cVar));
        }
        Iterator it = uVar.O().iterator();
        while (it.hasNext()) {
            e30.w type2 = ((r0) it.next()).getType();
            kotlin.jvm.internal.m.d(type2, "getType(...)");
            sb2.append((g20.k) a.a.S(type2, g20.r.i, cVar));
        }
        sb2.append(")");
        if (z10) {
            if (uVar instanceof j10.j) {
                sb2.append("V");
            } else {
                e30.w returnType = uVar.getReturnType();
                kotlin.jvm.internal.m.b(returnType);
                n20.e eVar = g10.i.e;
                if (g10.i.E(returnType, g10.o.d)) {
                    e30.w returnType2 = uVar.getReturnType();
                    kotlin.jvm.internal.m.b(returnType2);
                    if (!x0.e(returnType2) && !(uVar instanceof j0)) {
                        sb2.append("V");
                    }
                }
                e30.w returnType3 = uVar.getReturnType();
                kotlin.jvm.internal.m.b(returnType3);
                sb2.append((g20.k) a.a.S(returnType3, g20.r.i, cVar));
            }
        }
        return sb2.toString();
    }

    public static final String v(j10.b bVar) {
        kotlin.jvm.internal.m.e(bVar, "<this>");
        if (!q20.d.m(bVar)) {
            j10.e eVarL = bVar.l();
            j10.e eVar = eVarL instanceof j10.e ? eVarL : null;
            if (eVar != null && !eVar.getName().B) {
                l0 l0VarA = bVar.a();
                l0 l0Var = l0VarA instanceof l0 ? l0VarA : null;
                if (l0Var != null) {
                    return bi.b.Q(eVar, u(l0Var, 3));
                }
            }
        }
        return null;
    }

    public static long[] w(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += (long) jArr2.length;
        }
        int i10 = (int) length;
        c0.p(length, "the total number of elements (%s) in the arrays must fit in an int", length == ((long) i10));
        long[] jArr3 = new long[i10];
        int length2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, length2, jArr4.length);
            length2 += jArr4.length;
        }
        return jArr3;
    }

    public static final oj.q x(oj.q qVar, k10.h hVar) {
        kotlin.jvm.internal.m.e(qVar, "<this>");
        kotlin.jvm.internal.m.e(hVar, "additionalAnnotations");
        return hVar.isEmpty() ? qVar : new oj.q((a20.b) qVar.B, (a20.h) qVar.C, rd.a.I(g00.i.C, new a20.a(qVar, hVar, 1)));
    }

    public static final void y(File file) throws IOException {
        if (file.exists() || file.mkdirs() || file.isDirectory()) {
            return;
        }
        throw new IOException("Could not create directory at " + file);
    }

    public static String z(long j9, Locale locale) {
        List listS;
        if (j9 < 0) {
            j9 = 0;
        }
        long j10 = j9 / 1000;
        long j11 = j10 / 3600;
        long j12 = (j10 % 3600) / 60;
        long j13 = j10 % 60;
        MeasureFormat measureFormat = MeasureFormat.getInstance(locale, MeasureFormat.FormatWidth.SHORT);
        if (j11 > 0) {
            listS = va.a.S(new Measure(Long.valueOf(j11), MeasureUnit.HOUR), new Measure(Long.valueOf(j12), MeasureUnit.MINUTE));
        } else {
            listS = j12 > 0 ? va.a.S(new Measure(Long.valueOf(j12), MeasureUnit.MINUTE), new Measure(Long.valueOf(j13), MeasureUnit.SECOND)) : va.a.R(new Measure(Long.valueOf(j13), MeasureUnit.SECOND));
        }
        return h00.q.R0(listS, " ", (String) null, (String) null, new q0.a(measureFormat, 10), 30);
    }
}
