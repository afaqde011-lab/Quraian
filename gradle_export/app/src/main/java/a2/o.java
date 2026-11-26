package a2;

import a1.u0;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import com.google.android.gms.cast.Cast;
import eh.x;
import h00.q;
import java.lang.reflect.GenericDeclaration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kh.r;
import l0.q0;
import l1.e1;
import l1.f1;
import m0.w;
import s7.z;

public final class o implements com.google.android.gms.common.internal.d {
    public final Object A;
    public final Object B;
    public boolean C;
    public Object D;
    public Object E;
    public Object F;

    public o(int i10, float f3, w wVar) {
        this.A = wVar;
        this.B = new f1(i10);
        this.D = new e1(f3);
        this.F = new q0(i10, 30, 100);
    }

    public o(a8.o oVar, tf.w wVar) {
        this.A = oVar;
        this.F = wVar;
        this.B = new HashMap();
        this.D = new HashMap();
        this.C = true;
    }

    public o(bi.g gVar) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.E = new Object();
        this.B = new xf.g();
        this.C = false;
        this.F = new xf.g();
        gVar.a();
        Context context = gVar.f2531a;
        this.A = gVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.C = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), Cast.MAX_NAMESPACE_LENGTH)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            } catch (PackageManager.NameNotFoundException e3) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e3);
            }
            if (boolValueOf2 == null) {
                this.C = false;
                boolValueOf = null;
            } else {
                this.C = true;
                boolValueOf = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
        }
        this.D = boolValueOf;
        synchronized (this.E) {
            try {
                if (c()) {
                    ((xf.g) this.B).d(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public o(com.google.android.gms.common.api.internal.h hVar, com.google.android.gms.common.api.g gVar, com.google.android.gms.common.api.internal.a aVar) {
        Objects.requireNonNull(hVar);
        this.F = hVar;
        this.D = null;
        this.E = null;
        this.C = false;
        this.A = gVar;
        this.B = aVar;
    }

    public o(h1.l lVar) {
        kotlin.jvm.internal.m.e(lVar, "identityStorage");
        this.A = lVar;
        this.B = new ReentrantReadWriteLock(true);
        this.D = new od.a(null, null);
        this.E = new Object();
        this.F = new LinkedHashSet();
        f(lVar.T0(), od.d.A);
    }

    public o(String str, String str2, ArrayList arrayList, ay.f fVar, boolean z10, Integer num) {
        this.A = str;
        this.B = str2;
        this.D = arrayList;
        this.E = fVar;
        this.C = z10;
        this.F = num;
    }

    public o(boolean z10, String str, String str2, List list, String str3, List list2) {
        this.C = z10;
        this.A = str;
        this.B = str2;
        this.E = list;
        this.D = str3;
        this.F = list2;
    }

    @Override
    public void a(pe.b bVar) {
        ((com.google.android.gms.common.api.internal.h) this.F).N.post(new r(4, this, bVar, false));
    }

    public od.a b() {
        ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) this.B).readLock();
        lock.lock();
        try {
            return (od.a) this.D;
        } finally {
            lock.unlock();
        }
    }

    public synchronized boolean c() {
        boolean zH;
        Boolean bool = (Boolean) this.D;
        if (bool != null) {
            zH = bool.booleanValue();
        } else {
            try {
                zH = ((bi.g) this.A).h();
            } catch (IllegalStateException unused) {
                zH = false;
            }
        }
        e(zH);
        return zH;
    }

    public x d(int i10) {
        x kVar;
        HashMap map = (HashMap) this.B;
        x xVar = (x) map.get(Integer.valueOf(i10));
        if (xVar != null) {
            return xVar;
        }
        final u0 u0Var = (u0) this.E;
        u0Var.getClass();
        if (i10 != 0) {
            final int i11 = 1;
            if (i10 != 1) {
                final int i12 = 2;
                if (i10 != 2) {
                    final int i13 = 3;
                    if (i10 == 3) {
                        kVar = new i7.k(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(z.class), i12);
                    } else {
                        if (i10 != 4) {
                            throw new IllegalArgumentException(g4.c.f(i10, "Unrecognized contentType: "));
                        }
                        kVar = new x() {
                            @Override
                            public final Object get() {
                                switch (i13) {
                                    case 0:
                                        return n.e((Class) this, u0Var);
                                    case 1:
                                        return n.e((Class) this, u0Var);
                                    case 2:
                                        return n.e((Class) this, u0Var);
                                    default:
                                        return new u0(u0Var, (a8.o) ((a2.o) this).A);
                                }
                            }
                        };
                    }
                } else {
                    final GenericDeclaration genericDeclarationAsSubclass = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(z.class);
                    kVar = new x() {
                        @Override
                        public final Object get() {
                            switch (i12) {
                                case 0:
                                    return n.e((Class) genericDeclarationAsSubclass, u0Var);
                                case 1:
                                    return n.e((Class) genericDeclarationAsSubclass, u0Var);
                                case 2:
                                    return n.e((Class) genericDeclarationAsSubclass, u0Var);
                                default:
                                    return new u0(u0Var, (a8.o) ((a2.o) genericDeclarationAsSubclass).A);
                            }
                        }
                    };
                }
            } else {
                final GenericDeclaration genericDeclarationAsSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(z.class);
                kVar = new x() {
                    @Override
                    public final Object get() {
                        switch (i11) {
                            case 0:
                                return n.e((Class) genericDeclarationAsSubclass2, u0Var);
                            case 1:
                                return n.e((Class) genericDeclarationAsSubclass2, u0Var);
                            case 2:
                                return n.e((Class) genericDeclarationAsSubclass2, u0Var);
                            default:
                                return new u0(u0Var, (a8.o) ((a2.o) genericDeclarationAsSubclass2).A);
                        }
                    }
                };
            }
        } else {
            final Class clsAsSubclass = DashMediaSource$Factory.class.asSubclass(z.class);
            final int i14 = 0;
            kVar = new x() {
                @Override
                public final Object get() {
                    switch (i14) {
                        case 0:
                            return n.e((Class) clsAsSubclass, u0Var);
                        case 1:
                            return n.e((Class) clsAsSubclass, u0Var);
                        case 2:
                            return n.e((Class) clsAsSubclass, u0Var);
                        default:
                            return new u0(u0Var, (a8.o) ((a2.o) clsAsSubclass).A);
                    }
                }
            };
        }
        map.put(Integer.valueOf(i10), kVar);
        return kVar;
    }

    public void e(boolean z10) {
        String str;
        String str2 = z10 ? "ENABLED" : "DISABLED";
        if (((Boolean) this.D) == null) {
            str = "global Firebase setting";
        } else {
            str = this.C ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        String strQ = a1.b.q("Crashlytics automatic data collection ", str2, " by ", str, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strQ, null);
        }
    }

    public void f(od.a aVar, od.d dVar) {
        Set<ld.a> setR1;
        kotlin.jvm.internal.m.e(aVar, "identity");
        kotlin.jvm.internal.m.e(dVar, "updateType");
        od.a aVarB = b();
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) this.B;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i10 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i11 = 0; i11 < readHoldCount; i11++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.D = aVar;
            if (dVar == od.d.A) {
                this.C = true;
            }
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            if (aVar.equals(aVarB)) {
                return;
            }
            synchronized (this.E) {
                setR1 = q.r1((LinkedHashSet) this.F);
            }
            if (dVar != od.d.A) {
                if (!kotlin.jvm.internal.m.a(aVar.f11927a, aVarB.f11927a)) {
                    ((h1.l) this.A).Y0(aVar.f11927a);
                }
                if (!kotlin.jvm.internal.m.a(aVar.f11928b, aVarB.f11928b)) {
                    ((h1.l) this.A).X0(aVar.f11928b);
                }
            }
            for (ld.a aVar2 : setR1) {
                if (!kotlin.jvm.internal.m.a(aVar.f11927a, aVarB.f11927a)) {
                    aVar2.f10263a.D(aVar.f11927a);
                }
                if (!kotlin.jvm.internal.m.a(aVar.f11928b, aVarB.f11928b)) {
                    aVar2.f10263a.A(aVar.f11928b);
                }
                a1.i iVar = aVar2.f10263a;
                if (dVar == od.d.A) {
                    iVar.D(aVar.f11927a);
                    iVar.A(aVar.f11928b);
                }
            }
        } catch (Throwable th2) {
            while (i10 < readHoldCount) {
                lock.lock();
                i10++;
            }
            writeLock.unlock();
            throw th2;
        }
    }

    public void g(pe.b bVar) {
        com.google.android.gms.common.api.internal.z zVar = (com.google.android.gms.common.api.internal.z) ((com.google.android.gms.common.api.internal.h) this.F).J.get((com.google.android.gms.common.api.internal.a) this.B);
        if (zVar != null) {
            zVar.n(bVar);
        }
    }
}
