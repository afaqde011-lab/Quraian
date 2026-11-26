package ab;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.LongSparseArray;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import androidx.media3.common.h2;
import androidx.media3.common.k2;
import androidx.work.impl.WorkDatabase;
import b3.i2;
import c3.s3;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.protobuf.RuntimeVersion;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.google.BillingWrapper;
import g1.j7;
import i7.c1;
import i7.h1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public final class f implements Runnable {
    public final int A;
    public final Object B;
    public final Object C;

    public f(Object obj, Object obj2, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
    }

    @Override
    public final void run() {
        int i10;
        long j9;
        boolean z10;
        ij.a aVar;
        int i11 = 3;
        int i12 = 1;
        int i13 = 0;
        switch (this.A) {
            case 0:
                g gVar = (g) this.B;
                hb.i iVar = (hb.i) this.C;
                synchronized (gVar.f378k) {
                    try {
                        Iterator it = gVar.f377j.iterator();
                        while (it.hasNext()) {
                            ((b) it.next()).d(iVar, false);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case 1:
                ((a40.k) this.B).D((b40.c) this.C, g00.b0.a);
                return;
            case 2:
                ((l9.f0) ((bb.d) this.B).C).u((m) this.C, 3);
                return;
            case 3:
                s3 s3Var = (s3) this.B;
                androidx.lifecycle.q qVar = (androidx.lifecycle.q) this.C;
                if (s3Var.C) {
                    return;
                }
                s3Var.D = qVar;
                qVar.a(s3Var);
                return;
            case 4:
                Context context = (Context) this.B;
                e7.g gVar2 = (e7.g) this.C;
                c7.i.f2913a = (AudioManager) context.getSystemService("audio");
                gVar2.d();
                return;
            case 5:
                Runnable runnable = (Runnable) this.B;
                ca.z zVar = (ca.z) this.C;
                try {
                    runnable.run();
                    return;
                } finally {
                    zVar.a();
                }
            case 6:
                Dispatcher.a((Runnable) this.B, (Dispatcher) this.C);
                return;
            case 7:
                BillingWrapper.c((qd.h) this.B, (BillingWrapper) this.C);
                return;
            case 8:
                BillingWrapper.e((u00.k) this.B, (PurchasesError) this.C);
                return;
            case 9:
                d.n nVar = (d.n) this.B;
                nVar.getLifecycle().a(new d.e((d.e0) this.C, nVar, i13));
                return;
            case 10:
                w50.c.y((d2.d) this.B, (LongSparseArray) this.C);
                return;
            case 11:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.B;
                JobParameters jobParameters = (JobParameters) this.C;
                int i14 = JobInfoSchedulerService.A;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 12:
                i2 i2Var = (i2) this.B;
                Object objApply = ((androidx.media3.cast.n) this.C).apply(i2Var.f2049f);
                i2Var.f2049f = objApply;
                e7.b bVar = new e7.b(i2Var, objApply, i12);
                e7.d0 d0Var = (e7.d0) i2Var.f2046c;
                if (d0Var.f5120a.getLooper().getThread().isAlive()) {
                    d0Var.d(bVar);
                    return;
                }
                return;
            case 13:
                e7.t tVar = (e7.t) this.B;
                Context context2 = (Context) this.C;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context2.registerReceiver(new androidx.mediarouter.app.g(tVar, i11), intentFilter);
                return;
            case 14:
                androidx.mediarouter.app.g gVar3 = (androidx.mediarouter.app.g) this.B;
                Context context3 = (Context) this.C;
                e7.t tVar2 = (e7.t) gVar3.f1733b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context3.getSystemService("connectivity");
                if (connectivityManager == null) {
                    i11 = 0;
                } else {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            i11 = 1;
                        } else {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i11 = 4;
                                        break;
                                    case 13:
                                        i11 = 5;
                                        break;
                                    case 16:
                                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                                    default:
                                        i11 = 6;
                                        break;
                                    case TYPE_SINT64_VALUE:
                                        i11 = 2;
                                        break;
                                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                                        i11 = 9;
                                        break;
                                }
                            } else if (type == 1) {
                                i11 = 2;
                            } else if (type == 4 || type == 5) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        break;
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i11 = 4;
                                        break;
                                    case 13:
                                        i11 = 5;
                                        break;
                                    case 16:
                                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                                    default:
                                        i11 = 6;
                                        break;
                                    case TYPE_SINT64_VALUE:
                                        i11 = 2;
                                        break;
                                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                                        i11 = 9;
                                        break;
                                }
                            } else if (type != 6) {
                                i11 = type != 9 ? 8 : 7;
                            } else {
                                i11 = 5;
                            }
                        }
                    } catch (SecurityException unused) {
                        i11 = 0;
                    }
                }
                if (i11 != 5) {
                    tVar2.c(i11);
                    return;
                }
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context3.getSystemService("phone");
                    telephonyManager.getClass();
                    e7.r rVar = new e7.r(tVar2);
                    telephonyManager.registerTelephonyCallback(tVar2.f5173a, rVar);
                    telephonyManager.unregisterTelephonyCallback(rVar);
                    return;
                } catch (RuntimeException unused2) {
                    tVar2.c(5);
                    return;
                }
            case 15:
                List list = (List) this.B;
                fb.a aVar2 = (fb.a) this.C;
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((eb.a) it2.next()).a(aVar2.f5584e);
                }
                return;
            case 16:
                ((i40.f) this.B).g((i40.b) this.C, g00.b0.a);
                return;
            case 17:
                ((f5.f) ((f5.g) this.B)).a(((kotlin.jvm.internal.z) this.C).A);
                return;
            case TYPE_SINT64_VALUE:
                ((f5.f) ((f5.g) this.B)).a(new ClearCredentialUnknownException(((Exception) this.C).getMessage()));
                return;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                i7.z zVar2 = (i7.z) this.B;
                ba.s sVar = (ba.s) this.C;
                int i15 = zVar2.J - sVar.f2410b;
                zVar2.J = i15;
                if (sVar.f2412d) {
                    zVar2.K = sVar.f2413e;
                    zVar2.L = true;
                }
                if (i15 == 0) {
                    k2 k2Var = ((c1) sVar.f2414f).f7247a;
                    int currentMediaItemIndex = -1;
                    if (!zVar2.f7502s0.f7247a.isEmpty() && k2Var.isEmpty()) {
                        zVar2.f7504t0 = -1;
                        zVar2.f7506u0 = 0L;
                    }
                    if (!k2Var.isEmpty()) {
                        List listAsList = Arrays.asList(((h1) k2Var).f7340g);
                        ta.c0.A(listAsList.size() == zVar2.f7495p.size());
                        for (int i16 = 0; i16 < listAsList.size(); i16++) {
                            ((i7.x) zVar2.f7495p.get(i16)).f7466c = (k2) listAsList.get(i16);
                        }
                    }
                    long j10 = -9223372036854775807L;
                    if (zVar2.L) {
                        boolean z11 = ((c1) sVar.f2414f).f7247a.isEmpty() && zVar2.f7502s0.f7247a.isEmpty();
                        boolean zEquals = ((c1) sVar.f2414f).f7248b.equals(zVar2.f7502s0.f7248b);
                        boolean z12 = ((c1) sVar.f2414f).f7250d == zVar2.f7502s0.f7263s;
                        if (z11 || (zEquals && z12)) {
                            i12 = 0;
                        }
                        if (i12 != 0) {
                            currentMediaItemIndex = zVar2.getCurrentMediaItemIndex();
                            if (k2Var.isEmpty() || ((c1) sVar.f2414f).f7248b.b()) {
                                j10 = ((c1) sVar.f2414f).f7250d;
                            } else {
                                c1 c1Var = (c1) sVar.f2414f;
                                s7.a0 a0Var = c1Var.f7248b;
                                long j11 = c1Var.f7250d;
                                Object obj = a0Var.f13644a;
                                h2 h2Var = zVar2.f7493o;
                                k2Var.getPeriodByUid(obj, h2Var);
                                j10 = j11 + h2Var.f1235e;
                            }
                        }
                        i10 = currentMediaItemIndex;
                        j9 = j10;
                        z10 = i12;
                    } else {
                        i10 = -1;
                        j9 = -9223372036854775807L;
                        z10 = 0;
                    }
                    zVar2.L = false;
                    zVar2.y((c1) sVar.f2414f, 1, z10, zVar2.K, j9, i10, false);
                    return;
                }
                return;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                y yVar = (y) this.B;
                String string = ((UUID) this.C).toString();
                kotlin.jvm.internal.m.d(string, "toString(...)");
                ib.g.a(yVar, string);
                return;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                WorkDatabase workDatabase = (WorkDatabase) this.B;
                y yVar2 = (y) this.C;
                Iterator it3 = ((List) rd.a.M(workDatabase.w().f7028a, true, false, new j7(20))).iterator();
                while (it3.hasNext()) {
                    ib.g.a(yVar2, (String) it3.next());
                }
                yVar2.f419b.f17340d.getClass();
                workDatabase.s().b(new hb.d("last_cancel_all_time_ms", Long.valueOf(System.currentTimeMillis())));
                return;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                ii.n nVar2 = (ii.n) this.B;
                ij.b bVar2 = (ij.b) this.C;
                if (nVar2.f7713b != ii.n.f7711d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (nVar2) {
                    aVar = nVar2.f7712a;
                    nVar2.f7712a = null;
                    nVar2.f7713b = bVar2;
                    break;
                }
                aVar.j(bVar2);
                return;
            case 23:
                ii.m mVar = (ii.m) this.B;
                ij.b bVar3 = (ij.b) this.C;
                synchronized (mVar) {
                    try {
                        if (mVar.f7709b == null) {
                            mVar.f7708a.add(bVar3);
                        } else {
                            mVar.f7709b.add(bVar3.get());
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            case 24:
                ((f5.f) ((f5.g) this.B)).a(this.C);
                return;
            case 25:
                ((j7.i) this.B).f8227d.reportTrackChangeEvent((TrackChangeEvent) this.C);
                return;
            case RuntimeVersion.MINOR:
                ((j7.i) this.B).f8227d.reportNetworkEvent((NetworkEvent) this.C);
                return;
            case 27:
                ((j7.i) this.B).f8227d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.C);
                return;
            case 28:
                ((j7.i) this.B).f8227d.reportPlaybackMetrics((PlaybackMetrics) this.C);
                return;
            default:
                ((j7.i) this.B).f8227d.reportPlaybackStateEvent((PlaybackStateEvent) this.C);
                return;
        }
    }
}
