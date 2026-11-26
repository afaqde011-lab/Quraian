package a1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.measurement.g4;
import com.google.firebase.encoders.EncodingException;
import com.google.protobuf.RuntimeVersion;
import g1.c3;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.IntConsumer;
import java.util.zip.Adler32;
import kotlin.NoWhenBranchMatchedException;

public final class i implements zd.b, d4.i, x8.d, h9.b0, id.c {
    public static i E;
    public final int A;
    public Object B;
    public Object C;
    public Object D;

    public i(int i10) {
        this.A = i10;
        switch (i10) {
            case 3:
                this.B = new me.i(7);
                this.C = new me.i(7);
                this.D = new me.i(7);
                break;
            case 8:
                this.B = new com.google.android.gms.internal.measurement.b(RuntimeVersion.SUFFIX, 0L, null);
                this.C = new com.google.android.gms.internal.measurement.b(RuntimeVersion.SUFFIX, 0L, null);
                this.D = new ArrayList();
                break;
            case 17:
                this.D = new ArrayList();
                break;
            default:
                b1.i iVar = new b1.i(0, false);
                iVar.f1965b = Float.NaN;
                this.B = iVar;
                this.C = new q0.x0();
                break;
        }
    }

    public i(int i10, boolean z10) {
        this.A = i10;
    }

    public i(ad.f fVar, cd.b bVar, rc.c cVar) {
        this.A = 23;
        kotlin.jvm.internal.m.e(bVar, "logger");
        this.B = fVar;
        this.C = bVar;
        this.D = cVar;
    }

    public i(Context context, LocationManager locationManager) {
        this.A = 25;
        this.D = new k.l0();
        this.B = context;
        this.C = locationManager;
    }

    public i(Uri uri, kh.v vVar) {
        this.A = 29;
        this.B = null;
        this.C = uri;
        this.D = vVar;
    }

    public i(androidx.lifecycle.z zVar) {
        this.A = 1;
        this.B = new androidx.lifecycle.y(zVar, true);
        this.C = new Handler(Looper.getMainLooper());
    }

    public i(androidx.media3.common.t0 t0Var, kh.v vVar) {
        this.A = 29;
        this.B = t0Var.f1637k;
        this.C = t0Var.m;
        this.D = vVar;
    }

    public i(com.google.android.gms.internal.measurement.b bVar) {
        this.A = 8;
        this.B = bVar;
        this.C = bVar.clone();
        this.D = new ArrayList();
    }

    public i(g4.f fVar) {
        this.A = 19;
        this.B = new ArrayList();
        this.C = new h4.b();
        this.D = fVar;
    }

    public i(i7.g gVar, j7.j jVar) {
        this.A = 21;
        this.D = gVar;
        this.B = new HashMap();
        this.C = jVar;
    }

    public i(i7.z zVar, Context context) {
        this.A = 22;
        this.D = zVar;
        this.B = new WeakReference(context);
        ?? r4 = new IntConsumer() {
            @Override
            public final void accept(int i10) {
                z zVar2 = (z) this.f7467a.D;
                if (zVar2.f7489l0) {
                    return;
                }
                zVar2.r(1, 19, Integer.valueOf(i10));
            }
        };
        this.C = r4;
        context.registerDeviceIdChangeListener(new androidx.media3.common.q1(zVar.f7507v.a(zVar.f7503t, null), 1), r4);
    }

    public i(j10.i iVar, List list, i iVar2) {
        this.A = 24;
        kotlin.jvm.internal.m.e(iVar, "classifierDescriptor");
        kotlin.jvm.internal.m.e(list, "arguments");
        this.B = iVar;
        this.C = list;
        this.D = iVar2;
    }

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
    }

    public i(String str, int i10) {
        this.A = i10;
        switch (i10) {
            case 14:
                u0 u0Var = new u0(24, false);
                this.C = u0Var;
                this.D = u0Var;
                this.B = str;
                break;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                androidx.media3.common.s sVar = new androidx.media3.common.s();
                sVar.l = androidx.media3.common.x0.n("video/mp2t");
                sVar.m = androidx.media3.common.x0.n(str);
                this.B = new androidx.media3.common.t(sVar);
                break;
            default:
                u0 u0Var2 = new u0(16, false);
                this.C = u0Var2;
                this.D = u0Var2;
                this.B = str;
                break;
        }
    }

    public i(ArrayList arrayList) {
        this.A = 18;
        this.B = Collections.unmodifiableList(new ArrayList(arrayList));
        this.C = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            g9.c cVar = (g9.c) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = (long[]) this.C;
            jArr[i11] = cVar.f6262b;
            jArr[i11 + 1] = cVar.f6263c;
        }
        long[] jArr2 = (long[]) this.C;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.D = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public i(List list) {
        this.A = 16;
        this.D = list;
        this.B = new ArrayList(list.size());
        this.C = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((ArrayList) this.B).add(new fc.l((List) ((kc.f) list.get(i10)).f9607b.B));
            ((ArrayList) this.C).add(((kc.f) list.get(i10)).f9608c.m0());
        }
    }

    public i(k2.b bVar) {
        this.A = 26;
        this.D = bVar;
        this.B = new hf.c(this, 11);
    }

    public i(k7.s sVar) {
        this.A = 27;
        this.D = sVar;
        Handler handlerL = e7.i0.l(null);
        this.B = handlerL;
        k7.r rVar = new k7.r(this);
        this.C = rVar;
        sVar.f9134a.registerStreamEventCallback(new androidx.media3.cast.s(handlerL), rVar);
    }

    public i(oj.q qVar, a20.h hVar) {
        this.A = 4;
        kotlin.jvm.internal.m.e(hVar, "typeParameterResolver");
        this.B = qVar;
        this.C = hVar;
        this.D = new u0(new c20.e());
    }

    public i(s50.a aVar) {
        this.A = 5;
        this.B = aVar;
        this.C = new ConcurrentHashMap();
        this.D = new ConcurrentHashMap();
    }

    public i(z00.e eVar, List[] listArr, Method method) {
        this.A = 12;
        kotlin.jvm.internal.m.e(eVar, "argumentRange");
        this.B = eVar;
        this.C = listArr;
        this.D = method;
    }

    public i(byte[] bArr, kh.v vVar) {
        this.A = 29;
        this.B = bArr;
        this.C = null;
        this.D = vVar;
    }

    public i(c7.m[] mVarArr) {
        this.A = 28;
        k7.g0 g0Var = new k7.g0();
        c7.s sVar = new c7.s();
        sVar.f2965c = 1.0f;
        sVar.f2966d = 1.0f;
        c7.k kVar = c7.k.f2918e;
        sVar.f2967e = kVar;
        sVar.f2968f = kVar;
        sVar.f2969g = kVar;
        sVar.f2970h = kVar;
        ByteBuffer byteBuffer = c7.m.f2925a;
        sVar.f2973k = byteBuffer;
        sVar.l = byteBuffer;
        sVar.f2964b = -1;
        c7.m[] mVarArr2 = new c7.m[mVarArr.length + 2];
        this.B = mVarArr2;
        System.arraycopy(mVarArr, 0, mVarArr2, 0, mVarArr.length);
        this.C = g0Var;
        this.D = sVar;
        mVarArr2[mVarArr.length] = g0Var;
        mVarArr2[mVarArr.length + 1] = sVar;
    }

    public void A(String str) {
        this.C = str;
        Iterator it = ((ArrayList) this.D).iterator();
        while (it.hasNext()) {
            qc.a aVar = ((zc.a) it.next()).B;
            if (aVar == null) {
                kotlin.jvm.internal.m.k("connector");
                throw null;
            }
            p10.a aVar2 = aVar.f12829a;
            ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) aVar2.A).readLock();
            lock.lock();
            try {
                qc.b bVar = (qc.b) aVar2.B;
                lock.unlock();
                aVar2.z(new qc.b(bVar.f12831a, str, bVar.f12833c));
            } catch (Throwable th2) {
                lock.unlock();
                throw th2;
            }
        }
    }

    public void B(y3.m mVar) {
        ((k2.b) this.D).A.f8917b = mVar;
    }

    public void C(long j9) {
        ((k2.b) this.D).A.f8919d = j9;
    }

    public void D(String str) {
        this.B = str;
        Iterator it = ((ArrayList) this.D).iterator();
        while (it.hasNext()) {
            qc.a aVar = ((zc.a) it.next()).B;
            if (aVar == null) {
                kotlin.jvm.internal.m.k("connector");
                throw null;
            }
            p10.a aVar2 = aVar.f12829a;
            ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) aVar2.A).readLock();
            lock.lock();
            try {
                qc.b bVar = (qc.b) aVar2.B;
                lock.unlock();
                String str2 = bVar.f12831a;
                aVar2.z(new qc.b(str, bVar.f12832b, bVar.f12833c));
            } catch (Throwable th2) {
                lock.unlock();
                throw th2;
            }
        }
    }

    public void E(g4.f fVar, int i10, int i11, int i12) {
        int i13 = fVar.f6124a0;
        int i14 = fVar.f6126b0;
        fVar.f6124a0 = 0;
        fVar.f6126b0 = 0;
        fVar.J(i11);
        fVar.G(i12);
        if (i13 < 0) {
            fVar.f6124a0 = 0;
        } else {
            fVar.f6124a0 = i13;
        }
        if (i14 < 0) {
            fVar.f6126b0 = 0;
        } else {
            fVar.f6126b0 = i14;
        }
        g4.f fVar2 = (g4.f) this.D;
        fVar2.f6165s0 = i10;
        fVar2.P();
    }

    public e30.z0 F(p10.i iVar, c20.a aVar, boolean z10) {
        g10.k kVarD;
        oj.q qVar = (oj.q) this.B;
        a20.b bVar = (a20.b) qVar.B;
        kotlin.jvm.internal.m.e(iVar, "arrayType");
        boolean z11 = aVar.d;
        p10.z zVar = iVar.b;
        p10.z zVar2 = zVar instanceof p10.z ? zVar : null;
        if (zVar2 != null) {
            Class cls = zVar2.a;
            if (kotlin.jvm.internal.m.a(cls, Void.TYPE)) {
                kVarD = null;
            } else {
                kVarD = v20.c.b(cls.getName()).d();
            }
        } else {
            kVarD = null;
        }
        k10.h eVar = new a20.e(qVar, iVar, true);
        if (kVarD == null) {
            e30.w wVarG = G(zVar, p30.f.t0(e30.v0.B, z11, (b20.f0) null, 6));
            if (z11) {
                return bVar.o.d().i(z10 ? e30.a1.E : e30.a1.C, wVarG, eVar);
            }
            return e30.c.f(bVar.o.d().i(e30.a1.C, wVarG, eVar), bVar.o.d().i(e30.a1.E, wVarG, eVar).C0(true));
        }
        e30.a0 a0VarR = bVar.o.d().r(kVarD);
        e30.a0 a0VarY0 = ab.a0.y0(a0VarR, new k10.i(new k10.h[]{a0VarR.getAnnotations(), eVar}));
        kotlin.jvm.internal.m.c(a0VarY0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        e30.a0 a0Var = a0VarY0;
        return z11 ? a0Var : e30.c.f(a0Var, a0Var.C0(true));
    }

    public e30.w G(e20.d dVar, c20.a aVar) {
        e30.a0 a0VarK;
        a20.b bVar = (a20.b) ((oj.q) this.B).B;
        if (dVar instanceof p10.z) {
            Class cls = ((p10.z) dVar).a;
            g10.k kVarD = kotlin.jvm.internal.m.a(cls, Void.TYPE) ? null : v20.c.b(cls.getName()).d();
            return kVarD != null ? bVar.o.d().t(kVarD) : bVar.o.d().x();
        }
        boolean z10 = false;
        if (!(dVar instanceof p10.q)) {
            if (dVar instanceof p10.i) {
                return F((p10.i) dVar, aVar, false);
            }
            if (dVar instanceof p10.e0) {
                p10.b0 b0VarC = ((p10.e0) dVar).c();
                return b0VarC != null ? G(b0VarC, aVar) : bVar.o.d().n();
            }
            if (dVar == null) {
                return bVar.o.d().n();
            }
            throw new UnsupportedOperationException("Unsupported type: " + dVar);
        }
        p10.q qVar = (p10.q) dVar;
        if (!aVar.d && aVar.a != e30.v0.A) {
            z10 = true;
        }
        Type type = qVar.a;
        boolean zD = qVar.d();
        if (!zD && !z10) {
            e30.a0 a0VarK2 = k(qVar, aVar, null);
            return a0VarK2 != null ? a0VarK2 : g30.l.c(g30.k.C, new String[]{type.toString()});
        }
        e30.a0 a0VarK3 = k(qVar, c20.a.a(aVar, c20.b.C, false, (Set) null, (e30.a0) null, 61), null);
        if (a0VarK3 != null && (a0VarK = k(qVar, c20.a.a(aVar, c20.b.B, false, (Set) null, (e30.a0) null, 61), a0VarK3)) != null) {
            return zD ? new c20.i(a0VarK3, a0VarK) : e30.c.f(a0VarK3, a0VarK);
        }
        return g30.l.c(g30.k.C, new String[]{type.toString()});
    }

    public void H(g4.f fVar) {
        ArrayList arrayList = (ArrayList) this.B;
        arrayList.clear();
        int size = fVar.f6162p0.size();
        for (int i10 = 0; i10 < size; i10++) {
            g4.e eVar = (g4.e) fVar.f6162p0.get(i10);
            int[] iArr = eVar.f6150o0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(eVar);
            }
        }
        fVar.f6164r0.f3065b = true;
    }

    public void a(b3.l0 l0Var, b3.v vVar) throws NoWhenBranchMatchedException {
        me.i iVar = (me.i) this.B;
        me.i iVar2 = (me.i) this.C;
        me.i iVar3 = (me.i) this.D;
        int iOrdinal = vVar.ordinal();
        if (iOrdinal == 0) {
            iVar.y(l0Var);
            iVar3.y(l0Var);
            return;
        }
        if (iOrdinal == 1) {
            iVar2.y(l0Var);
            iVar3.y(l0Var);
            return;
        }
        if (iOrdinal == 2) {
            if (l0Var.I != null) {
                iVar3.y(l0Var);
                return;
            } else {
                iVar.y(l0Var);
                return;
            }
        }
        if (iOrdinal != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (l0Var.I != null) {
            iVar3.y(l0Var);
        } else {
            iVar2.y(l0Var);
        }
    }

    @Override
    public void b(e7.u uVar) {
        long jD;
        long j9;
        ((e7.e0) this.C).getClass();
        String str = e7.i0.f5136a;
        e7.e0 e0Var = (e7.e0) this.C;
        synchronized (e0Var) {
            try {
                long j10 = e0Var.f5126c;
                jD = j10 != -9223372036854775807L ? j10 + e0Var.f5125b : e0Var.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e7.e0 e0Var2 = (e7.e0) this.C;
        synchronized (e0Var2) {
            j9 = e0Var2.f5125b;
        }
        if (jD == -9223372036854775807L || j9 == -9223372036854775807L) {
            return;
        }
        androidx.media3.common.t tVar = (androidx.media3.common.t) this.B;
        if (j9 != tVar.f1599s) {
            androidx.media3.common.s sVarA = tVar.a();
            sVarA.f1506r = j9;
            androidx.media3.common.t tVar2 = new androidx.media3.common.t(sVarA);
            this.B = tVar2;
            ((a8.l0) this.D).f(tVar2);
        }
        int iA = uVar.a();
        ((a8.l0) this.D).g(iA, uVar);
        ((a8.l0) this.D).d(jD, 1, iA, 0, null);
    }

    @Override
    public void c(e7.e0 e0Var, a8.s sVar, c3 c3Var) {
        this.C = e0Var;
        c3Var.a();
        c3Var.b();
        a8.l0 l0VarW = sVar.w(c3Var.C, 5);
        this.D = l0VarW;
        l0VarW.f((androidx.media3.common.t) this.B);
    }

    public Object clone() {
        switch (this.A) {
            case 8:
                i iVar = new i(((com.google.android.gms.internal.measurement.b) this.B).clone());
                Iterator it = ((ArrayList) this.D).iterator();
                while (it.hasNext()) {
                    ((ArrayList) iVar.D).add(((com.google.android.gms.internal.measurement.b) it.next()).clone());
                }
                return iVar;
            default:
                return super.clone();
        }
    }

    @Override
    public int d(long j9) {
        long[] jArr = (long[]) this.D;
        int iB = e7.i0.b(jArr, j9, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    @Override
    public long e(int i10) {
        long[] jArr = (long[]) this.D;
        ta.c0.s(i10 >= 0);
        ta.c0.s(i10 < jArr.length);
        return jArr[i10];
    }

    @Override
    public Object f(k00.c cVar) {
        id.a aVar;
        if (cVar instanceof id.a) {
            aVar = (id.a) cVar;
            int i10 = aVar.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.D = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new id.a(this, (m00.c) cVar);
            }
        } else {
            aVar = new id.a(this, (m00.c) cVar);
        }
        Object obj = aVar.B;
        l00.a aVar2 = l00.a.A;
        int i11 = aVar.D;
        try {
            if (i11 == 0) {
                ri.t1.O(obj);
                ad.f fVar = (ad.f) this.B;
                aVar.A = this;
                aVar.D = 1;
                if (fVar.c(aVar) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this = aVar.A;
                ri.t1.O(obj);
            }
            ArrayList arrayList = (ArrayList) ((ad.f) this.B).b();
            if (!arrayList.isEmpty()) {
                for (Object obj2 : arrayList) {
                    kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.String");
                    this.v((String) obj2);
                }
            }
        } catch (FileNotFoundException e3) {
            String message = e3.getMessage();
            if (message != null) {
                ((cd.b) this.C).c("Event storage file not found: ".concat(message));
            }
        }
        return g00.b0.a;
    }

    @Override
    public List g(long j9) {
        List list = (List) this.B;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            long[] jArr = (long[]) this.C;
            int i11 = i10 * 2;
            if (jArr[i11] <= j9 && j9 < jArr[i11 + 1]) {
                g9.c cVar = (g9.c) list.get(i10);
                d7.b bVar = cVar.f6261a;
                if (bVar.f4751e == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        Collections.sort(arrayList2, new b3.c0(2));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            d7.a aVarA = ((g9.c) arrayList2.get(i12)).f6261a.a();
            aVarA.f4727e = (-1) - i12;
            aVarA.f4728f = 1;
            arrayList.add(aVarA.a());
        }
        return arrayList;
    }

    public Object get() {
        return new i((Context) ((f00.a) this.B).get(), (ee.d) ((f00.a) this.C).get(), (de.a) ((hb.f) this.D).get(), 11);
    }

    @Override
    public Object h(d4.h hVar) {
        com.google.android.gms.internal.cast.s0 s0Var = (com.google.android.gms.internal.cast.s0) this.B;
        o9.b0 b0Var = (o9.b0) this.C;
        o9.b0 b0Var2 = (o9.b0) this.D;
        s0Var.getClass();
        return Boolean.valueOf(s0Var.f3544b.post(new com.google.android.gms.internal.cast.r0(s0Var, b0Var, b0Var2, hVar, 0)));
    }

    @Override
    public int i() {
        return ((long[]) this.D).length;
    }

    @Override
    public java.lang.Object j(k00.c r20) {
        throw new UnsupportedOperationException("Method not decompiled: a1.i.j(k00.c):java.lang.Object");
    }

    public e30.a0 k(p10.q qVar, c20.a aVar, e30.a0 a0Var) {
        e30.h0 h0VarE;
        oj.q qVar2;
        e30.h0 h0Var;
        e30.a0 a0Var2;
        e30.m0 m0VarF;
        e30.m0 m0Var;
        Iterator it;
        List list;
        oj.q qVar3;
        boolean z10;
        e30.f0 f0Var;
        Object obj;
        List listN1;
        i iVar;
        e30.m0 m0Var2;
        p10.q qVar4;
        e30.p0 p0VarA;
        j10.e eVarC;
        e30.a1 a1VarF;
        i iVar2 = this;
        p10.q qVar5 = qVar;
        c20.a aVar2 = aVar;
        e30.v0 v0Var = aVar2.a;
        c20.b bVar = aVar2.b;
        boolean z11 = aVar2.d;
        oj.q qVar6 = (oj.q) iVar2.B;
        a20.b bVar2 = (a20.b) qVar6.B;
        if (a0Var == null || (h0VarE = a0Var.k0()) == null) {
            h0VarE = e30.c.E(new a20.e(qVar6, qVar5, false));
        }
        p10.o oVar = qVar5.b;
        if (oVar == null) {
            qVar5.getClass();
            throw new UnsupportedOperationException("Type not found: " + qVar5.a);
        }
        boolean z12 = false;
        if (oVar instanceof p10.o) {
            p10.o oVar2 = oVar;
            a0Var2 = null;
            n20.c cVarC = oVar2.c();
            if (cVarC == null) {
                throw new AssertionError("Class type should have a FQ name: " + oVar);
            }
            if (z11 && cVarC.equals(c20.d.a)) {
                g10.n nVar = bVar2.p;
                g10.m mVar = nVar.c;
                a10.c cVar = g10.n.e[0];
                mVar.getClass();
                h0Var = h0VarE;
                kotlin.jvm.internal.m.e(cVar, "property");
                n20.e eVarE = n20.e.e(ri.t1.p(cVar.getName()));
                qVar2 = qVar6;
                j10.e eVarG = ((x20.n) nVar.b.getValue()).g(eVarE, r10.c.B);
                j10.e eVar = eVarG instanceof j10.e ? eVarG : null;
                eVarC = eVar == null ? nVar.a.B(new n20.b(g10.p.i, eVarE), va.a.R(1)) : eVar;
            } else {
                qVar2 = qVar6;
                h0Var = h0VarE;
                eVarC = i10.e.c(cVarC, bVar2.o.d());
                if (eVarC == null) {
                    eVarC = null;
                } else {
                    String str = i10.d.a;
                    if (i10.d.k.containsKey(q20.d.f(eVarC))) {
                        if (bVar == c20.b.C || v0Var == e30.v0.A) {
                            eVarC = i10.e.a(eVarC);
                        } else {
                            p10.e0 e0Var = (e20.d) h00.q.U0(qVar5.c());
                            p10.e0 e0Var2 = e0Var instanceof p10.e0 ? e0Var : null;
                            if (e0Var2 != null && e0Var2.c() != null) {
                                Type[] upperBounds = e0Var2.a.getUpperBounds();
                                kotlin.jvm.internal.m.d(upperBounds, "getUpperBounds(...)");
                                if (kotlin.jvm.internal.m.a(h00.n.E0(upperBounds), Object.class)) {
                                    n20.d dVarF = q20.d.f(eVarC);
                                    String str2 = i10.d.a;
                                    n20.c cVarH = i10.d.h(dVarF);
                                    if (cVarH == null) {
                                        throw new IllegalArgumentException("Given class " + eVarC + " is not a read-only collection");
                                    }
                                    List parameters = u20.d.e(eVarC).j(cVarH).f().getParameters();
                                    kotlin.jvm.internal.m.d(parameters, "getParameters(...)");
                                    j10.r0 r0Var = (j10.r0) h00.q.U0(parameters);
                                    if (r0Var != null && (a1VarF = r0Var.F()) != null && a1VarF != e30.a1.E) {
                                        eVarC = i10.e.a(eVarC);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (eVarC == null) {
                qj.c cVar2 = bVar2.k;
                cVar2.getClass();
                o9.q qVar7 = (o9.q) cVar2.B;
                if (qVar7 == null) {
                    kotlin.jvm.internal.m.k("resolver");
                    throw null;
                }
                eVarC = qVar7.S(oVar2);
            }
            if (eVarC == null || (m0VarF = eVarC.f()) == null) {
                qVar5.getClass();
                throw new UnsupportedOperationException("Type not found: " + qVar5.a);
            }
        } else {
            qVar2 = qVar6;
            h0Var = h0VarE;
            a0Var2 = null;
            if (!(oVar instanceof p10.c0)) {
                throw new IllegalStateException("Unknown classifier kind: " + oVar);
            }
            j10.r0 r0VarA = ((a20.h) iVar2.C).a((p10.c0) oVar);
            m0VarF = r0VarA != null ? r0VarA.f() : null;
        }
        if (m0VarF == null) {
            return a0Var2;
        }
        boolean z13 = (bVar == c20.b.C || z11 || v0Var == e30.v0.A) ? false : true;
        if (kotlin.jvm.internal.m.a(a0Var != null ? a0Var.m0() : a0Var2, m0VarF) && !qVar5.d() && z13) {
            return a0Var.C0(true);
        }
        boolean z14 = true;
        if (!qVar5.d()) {
            if (qVar5.c().isEmpty()) {
                List parameters2 = m0VarF.getParameters();
                kotlin.jvm.internal.m.d(parameters2, "getParameters(...)");
                if (parameters2.isEmpty()) {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
        }
        List<j10.r0> parameters3 = m0VarF.getParameters();
        kotlin.jvm.internal.m.d(parameters3, "getParameters(...)");
        if (z14) {
            ArrayList arrayList = new ArrayList(h00.r.q0(parameters3, 10));
            for (j10.r0 r0Var2 : parameters3) {
                if (ab.a0.h0(r0Var2, a0Var2, aVar2.e)) {
                    p0VarA = e30.x0.k(r0Var2, aVar2);
                    qVar4 = qVar5;
                    m0Var2 = m0VarF;
                    iVar = iVar2;
                } else {
                    e30.m0 m0Var3 = m0VarF;
                    iVar = iVar2;
                    m0Var2 = m0Var3;
                    qVar4 = qVar5;
                    p0VarA = c20.e.a(r0Var2, c20.a.a(aVar, (c20.b) null, qVar4.d(), (Set) null, (e30.a0) null, 59), (u0) iVar.D, new e30.y(bVar2.a, new c20.c(iVar2, r0Var2, aVar, m0Var3, qVar5)));
                }
                arrayList.add(p0VarA);
                aVar2 = aVar;
                iVar2 = iVar;
                qVar5 = qVar4;
                m0VarF = m0Var2;
                a0Var2 = null;
            }
            m0Var = m0VarF;
            listN1 = arrayList;
        } else {
            m0Var = m0VarF;
            if (parameters3.size() != qVar5.c().size()) {
                ArrayList arrayList2 = new ArrayList(h00.r.q0(parameters3, 10));
                for (j10.r0 r0Var3 : parameters3) {
                    g30.k kVar = g30.k.S;
                    String strB = r0Var3.getName().b();
                    kotlin.jvm.internal.m.d(strB, "asString(...)");
                    arrayList2.add(new e30.f0(g30.l.c(kVar, new String[]{strB})));
                }
                listN1 = h00.q.n1(arrayList2);
            } else {
                h00.p pVarS1 = h00.q.s1(qVar5.c());
                ArrayList arrayList3 = new ArrayList(h00.r.q0(pVarS1, 10));
                Iterator it2 = pVarS1.iterator();
                while (true) {
                    h00.b0 b0Var = (h00.b0) it2;
                    if (b0Var.B.hasNext()) {
                        h00.a0 a0Var3 = (h00.a0) b0Var.next();
                        int i10 = a0Var3.a;
                        p10.e0 e0Var3 = (e20.d) a0Var3.b;
                        parameters3.size();
                        j10.r0 r0Var4 = (j10.r0) parameters3.get(i10);
                        c20.a aVarT0 = p30.f.t0(e30.v0.B, z12, (b20.f0) null, 7);
                        kotlin.jvm.internal.m.b(r0Var4);
                        if (e0Var3 instanceof p10.e0) {
                            p10.e0 e0Var4 = e0Var3;
                            p10.b0 b0VarC = e0Var4.c();
                            Type[] upperBounds2 = e0Var4.a.getUpperBounds();
                            kotlin.jvm.internal.m.d(upperBounds2, "getUpperBounds(...)");
                            e30.a1 a1Var = !kotlin.jvm.internal.m.a(h00.n.E0(upperBounds2), Object.class) ? e30.a1.E : e30.a1.D;
                            if (b0VarC == null || !(r0Var4.F() == e30.a1.C || a1Var == r0Var4.F())) {
                                it = it2;
                                list = parameters3;
                                qVar3 = qVar2;
                                z10 = false;
                                f0Var = e30.x0.k(r0Var4, aVarT0);
                            } else {
                                if (e0Var4.c() == null) {
                                    throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
                                }
                                qVar3 = qVar2;
                                q30.e it3 = new a20.e(qVar3, e0Var4, false).iterator();
                                while (true) {
                                    q30.e eVar2 = it3;
                                    if (!eVar2.hasNext()) {
                                        it = it2;
                                        list = parameters3;
                                        obj = null;
                                        break;
                                    }
                                    Object next = eVar2.next();
                                    k10.b bVar3 = (k10.b) next;
                                    n20.c[] cVarArr = x10.q.b;
                                    it = it2;
                                    int length = cVarArr.length;
                                    list = parameters3;
                                    int i11 = 0;
                                    while (i11 < length) {
                                        int i12 = length;
                                        int i13 = i11;
                                        if (kotlin.jvm.internal.m.a(bVar3.a(), cVarArr[i11])) {
                                            obj = next;
                                            break;
                                        }
                                        i11 = i13 + 1;
                                        length = i12;
                                    }
                                    it2 = it;
                                    parameters3 = list;
                                }
                                k10.b bVar4 = (k10.b) obj;
                                z10 = false;
                                e30.w wVarG = iVar2.G(b0VarC, p30.f.t0(e30.v0.B, false, (b20.f0) null, 7));
                                if (bVar4 != null) {
                                    ArrayList arrayListX0 = h00.q.X0(wVarG.getAnnotations(), bVar4);
                                    wVarG = ab.a0.y0(wVarG, arrayListX0.isEmpty() ? k10.g.a : new k10.i(0, arrayListX0));
                                }
                                f0Var = ab.a0.I(wVarG, a1Var, r0Var4);
                            }
                        } else {
                            it = it2;
                            list = parameters3;
                            qVar3 = qVar2;
                            z10 = false;
                            f0Var = new e30.f0(iVar2.G(e0Var3, aVarT0), e30.a1.C);
                        }
                        arrayList3.add(f0Var);
                        it2 = it;
                        parameters3 = list;
                        qVar2 = qVar3;
                        z12 = z10;
                    } else {
                        listN1 = h00.q.n1(arrayList3);
                    }
                }
            }
        }
        return e30.c.u(h0Var, m0Var, listN1, z13);
    }

    public boolean l(b3.l0 l0Var) {
        return !(l0Var.I == null) && (((b3.k2) ((me.i) this.B).B).contains(l0Var) || ((b3.k2) ((me.i) this.C).B).contains(l0Var));
    }

    public void m(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.B;
        ej.f fVar = new ej.f(byteArrayOutputStream, map, (HashMap) this.C, (bj.c) this.D);
        bj.c cVar = (bj.c) map.get(obj.getClass());
        if (cVar != null) {
            cVar.a(obj, fVar);
        } else {
            throw new EncodingException("No encoder for " + obj.getClass());
        }
    }

    public i2.s n() {
        return ((k2.b) this.D).A.f8918c;
    }

    public y3.c o() {
        return ((k2.b) this.D).A.f8916a;
    }

    public y3.m p() {
        return ((k2.b) this.D).A.f8917b;
    }

    public long q() {
        return ((k2.b) this.D).A.f8919d;
    }

    public boolean r() {
        return !(((b3.k2) ((me.i) this.B).B).isEmpty() && ((b3.k2) ((me.i) this.D).B).isEmpty() && ((b3.k2) ((me.i) this.C).B).isEmpty());
    }

    public boolean s(int i10, g4.e eVar, j4.f fVar) {
        h4.b bVar = (h4.b) this.C;
        int[] iArr = eVar.f6150o0;
        int[] iArr2 = eVar.f6154s;
        bVar.f6565a = iArr[0];
        bVar.f6566b = iArr[1];
        bVar.f6567c = eVar.n();
        bVar.f6568d = eVar.k();
        bVar.f6573i = false;
        bVar.f6574j = i10;
        boolean z10 = bVar.f6565a == 3;
        boolean z11 = bVar.f6566b == 3;
        boolean z12 = z10 && eVar.V > 0.0f;
        boolean z13 = z11 && eVar.V > 0.0f;
        if (z12 && iArr2[0] == 4) {
            bVar.f6565a = 1;
        }
        if (z13 && iArr2[1] == 4) {
            bVar.f6566b = 1;
        }
        fVar.b(eVar, bVar);
        eVar.J(bVar.f6569e);
        eVar.G(bVar.f6570f);
        eVar.D = bVar.f6572h;
        eVar.D(bVar.f6571g);
        bVar.f6574j = 0;
        return bVar.f6573i;
    }

    public void t(androidx.lifecycle.o oVar) {
        androidx.lifecycle.z0 z0Var = (androidx.lifecycle.z0) this.D;
        if (z0Var != null) {
            z0Var.run();
        }
        androidx.lifecycle.z0 z0Var2 = new androidx.lifecycle.z0((androidx.lifecycle.y) this.B, oVar);
        this.D = z0Var2;
        ((Handler) this.C).postAtFrontOfQueue(z0Var2);
    }

    public String toString() {
        switch (this.A) {
            case 9:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append((String) this.B);
                sb2.append('{');
                u0 u0Var = (u0) ((u0) this.C).B;
                String str = RuntimeVersion.SUFFIX;
                while (u0Var != null) {
                    Object obj = u0Var.C;
                    sb2.append(str);
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    u0Var = (u0) u0Var.B;
                    str = ", ";
                }
                sb2.append('}');
                return sb2.toString();
            case 14:
                StringBuilder sb3 = new StringBuilder(32);
                sb3.append((String) this.B);
                sb3.append('{');
                u0 u0Var2 = (u0) ((u0) this.C).B;
                String str2 = RuntimeVersion.SUFFIX;
                while (u0Var2 != null) {
                    Object obj2 = u0Var2.C;
                    sb3.append(str2);
                    if (obj2 == null || !obj2.getClass().isArray()) {
                        sb3.append(obj2);
                    } else {
                        String strDeepToString2 = Arrays.deepToString(new Object[]{obj2});
                        sb3.append((CharSequence) strDeepToString2, 1, strDeepToString2.length() - 1);
                    }
                    u0Var2 = (u0) u0Var2.B;
                    str2 = ", ";
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public void u(w7.a aVar) {
        j7.j jVar = (j7.j) ((HashMap) this.B).remove(aVar);
        jVar.getClass();
        i7.f fVar = (i7.f) ((i7.g) this.D).f7320q.get(jVar);
        if (fVar != null) {
            synchronized (fVar) {
                fVar.f7293d--;
            }
        }
    }

    public void v(String str) {
        rc.c cVar = (rc.c) this.D;
        a40.c0.y(cVar.f13153c, cVar.f13156f, (a40.a0) null, new c0(this, str, null, 24), 2);
    }

    public w50.b w(a10.d dVar, b60.a aVar, b60.a aVar2) {
        String value;
        kotlin.jvm.internal.m.e(dVar, "clazz");
        kotlin.jvm.internal.m.e(aVar2, "scopeQualifier");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g60.a.a(dVar));
        sb2.append(':');
        if (aVar == null || (value = aVar.getValue()) == null) {
            value = RuntimeVersion.SUFFIX;
        }
        sb2.append(value);
        sb2.append(':');
        sb2.append(aVar2);
        return (w50.b) ((ConcurrentHashMap) this.C).get(sb2.toString());
    }

    public void x(xd.i iVar, int i10, boolean z10) {
        de.a aVar = (de.a) this.D;
        Context context = (Context) this.B;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f16547a;
        String str2 = iVar.f16547a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        ud.d dVar = iVar.f16549c;
        adler32.update(byteBufferAllocate.putInt(he.a.a(dVar)).array());
        byte[] bArr = iVar.f16548b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int i11 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() == value) {
                    if (i11 < i10) {
                        break;
                    }
                    g4.y(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                    return;
                }
            }
        }
        Cursor cursorRawQuery = ((ee.h) ((ee.d) this.C)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(he.a.a(dVar))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aVar.a(dVar, jLongValue, i10));
            Set set = ((de.b) aVar.f4870b.get(dVar)).f4873c;
            if (set.contains(de.c.A)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(de.c.C)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(de.c.B)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i10);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", he.a.a(dVar));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {iVar, Integer.valueOf(value), Long.valueOf(aVar.a(dVar, jLongValue, i10)), lValueOf, Integer.valueOf(i10)};
            String strConcat = "TRuntime.".concat("JobInfoScheduler");
            if (Log.isLoggable(strConcat, 3)) {
                Log.d(strConcat, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            cursorRawQuery.close();
            throw th2;
        }
    }

    public void y(i2.s sVar) {
        ((k2.b) this.D).A.f8918c = sVar;
    }

    public void z(y3.c cVar) {
        ((k2.b) this.D).A.f8916a = cVar;
    }
}
