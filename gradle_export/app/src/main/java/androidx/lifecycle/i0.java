package androidx.lifecycle;

import android.content.Context;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.Trace;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.media3.exoplayer.ExoPlaybackException;
import b3.g1;
import b3.i2;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.protobuf.RuntimeVersion;
import com.revenuecat.purchases.amazon.AmazonBilling;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.simulatedstore.SimulatedStoreBillingWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import k9.h1;

public final class i0 implements Runnable {
    public final int A;
    public final Object B;

    public i0(i7.i0 i0Var, int i10) {
        this.A = 20;
        this.B = i0Var;
    }

    public i0(i7.i0 i0Var, i7.f1 f1Var) {
        this.A = 21;
        this.B = f1Var;
    }

    public i0(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    @Override
    public final void run() {
        String strK;
        TelephonyManager telephonyManager;
        int i10 = this.A;
        int i11 = 2;
        int i12 = 7;
        int i13 = 0;
        Object obj = this.B;
        switch (i10) {
            case 0:
                k0 k0Var = (k0) obj;
                y yVar = k0Var.F;
                if (k0Var.B == 0) {
                    k0Var.C = true;
                    yVar.g(o.ON_PAUSE);
                }
                if (k0Var.A == 0 && k0Var.C) {
                    yVar.g(o.ON_STOP);
                    k0Var.D = true;
                    return;
                }
                return;
            case 1:
                ((c3.a) obj).b();
                return;
            case 2:
                c3.f0 f0Var = (c3.f0) obj;
                Trace.beginSection("measureAndLayout");
                try {
                    f0Var.D.t(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        f0Var.n();
                        Trace.endSection();
                        f0Var.f2664i0 = false;
                        return;
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    Trace.endSection();
                    throw th3;
                }
            case 3:
                c5.e eVar = ((c5.g) obj).f2882a;
                ViewParent parent = eVar.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(eVar);
                    return;
                }
                return;
            case 4:
                c7.b bVar = (c7.b) obj;
                if (bVar.f2894c.A) {
                    bVar.f2892a.A.x(3, false);
                    return;
                }
                return;
            case 5:
                cc.n nVar = (cc.n) obj;
                cc.l lVar = nVar.f3141d;
                if (lVar == null) {
                    return;
                }
                Object obj2 = lVar.f3135a;
                if (obj2 != null) {
                    synchronized (nVar) {
                        Iterator it = new ArrayList(nVar.f3138a).iterator();
                        while (it.hasNext()) {
                            ((cc.k) it.next()).onResult(obj2);
                        }
                    }
                    return;
                }
                Throwable th4 = lVar.f3136b;
                synchronized (nVar) {
                    ArrayList arrayList = new ArrayList(nVar.f3139b);
                    if (arrayList.isEmpty()) {
                        oc.b.b("Lottie encountered an error but no failure listener was added:", th4);
                        return;
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((cc.k) it2.next()).onResult(th4);
                    }
                    return;
                }
            case 6:
                AmazonBilling.b((u00.k) obj);
                return;
            case 7:
                AmazonBilling.a((AmazonBilling) obj);
                return;
            case 8:
                Dispatcher.b((Throwable) obj);
                return;
            case 9:
                SimulatedStoreBillingWrapper.a((SimulatedStoreBillingWrapper) obj);
                return;
            case 10:
                d.k kVar = (d.k) obj;
                Runnable runnable = kVar.B;
                if (runnable != null) {
                    runnable.run();
                    kVar.B = null;
                    return;
                }
                return;
            case 11:
                d.p.a((d.p) obj);
                return;
            case 12:
                d2.d dVar = (d2.d) obj;
                boolean zF = dVar.f();
                c3.z zVar = dVar.A;
                if (zF) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        zVar.t(true);
                        u.w wVar = dVar.K;
                        int[] iArr = wVar.f14872b;
                        long[] jArr = wVar.f14871a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i14 = 0;
                            while (true) {
                                long j9 = jArr[i14];
                                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                                    for (int i16 = i13; i16 < i15; i16++) {
                                        if ((255 & j9) < 128) {
                                            int i17 = iArr[(i14 << 3) + i16];
                                            if (!dVar.e().a(i17)) {
                                                dVar.D.add(new d2.e(i17, dVar.J, d2.f.B, null));
                                                dVar.H.j(g00.b0.a);
                                            }
                                        }
                                        j9 >>= 8;
                                    }
                                    if (i15 == 8) {
                                        if (i14 != length) {
                                            i14++;
                                            i13 = 0;
                                        }
                                    }
                                } else if (i14 != length) {
                                    i14++;
                                    i13 = 0;
                                }
                            }
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        try {
                            dVar.h(zVar.getSemanticsOwner().a(), dVar.L);
                            Trace.endSection();
                            dVar.c(dVar.e());
                            dVar.k();
                            dVar.M = false;
                            return;
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th5) {
                        Trace.endSection();
                        throw th5;
                    }
                }
                return;
            case 13:
                oj.q qVar = (oj.q) obj;
                ((ee.h) ((fe.b) qVar.E)).x(new ab.r(qVar, i12));
                return;
            case 14:
                e7.s sVar = (e7.s) obj;
                w7.f fVar = (w7.f) sVar.f5169a.get();
                if (fVar != null) {
                    int iB = sVar.f5171c.b();
                    w7.g gVar = fVar.f15853a;
                    synchronized (gVar) {
                        int i18 = gVar.f15872n;
                        if (i18 == 0 || gVar.f15865e) {
                            if (i18 != iB || gVar.f15873o == null) {
                                gVar.f15872n = iB;
                                if (iB != 1 && iB != 0 && iB != 8) {
                                    if (gVar.f15873o == null) {
                                        Context context = gVar.f15861a;
                                        String str = e7.i0.f5136a;
                                        if (context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                                            strK = w00.a.K(Locale.getDefault().getCountry());
                                        } else {
                                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                            if (TextUtils.isEmpty(networkCountryIso)) {
                                                strK = w00.a.K(Locale.getDefault().getCountry());
                                            } else {
                                                strK = w00.a.K(networkCountryIso);
                                            }
                                        }
                                        gVar.f15873o = strK;
                                    }
                                    gVar.l = gVar.a(iB);
                                    gVar.f15864d.getClass();
                                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                                    gVar.b(gVar.f15867g > 0 ? (int) (jElapsedRealtime - gVar.f15868h) : 0, gVar.f15869i, gVar.l);
                                    gVar.f15868h = jElapsedRealtime;
                                    gVar.f15869i = 0L;
                                    gVar.f15871k = 0L;
                                    gVar.f15870j = 0L;
                                    w7.q qVar2 = gVar.f15866f;
                                    qVar2.f15884a.clear();
                                    qVar2.f15886c = -1;
                                    qVar2.f15887d = 0;
                                    qVar2.f15888e = 0;
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
            case 15:
                a1.u0 u0Var = (a1.u0) obj;
                synchronized (u0Var) {
                    PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) u0Var.C;
                    if (wakeLock != null) {
                        wakeLock.release();
                    }
                    break;
                }
                return;
            case 16:
                f1.e.setRippleState$lambda$1((f1.e) obj);
                return;
            case 17:
                MaterialButton.a((MaterialButton) obj);
                return;
            case TYPE_SINT64_VALUE:
                ((CarouselLayoutManager) obj).o0();
                return;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                i7.z zVar2 = (i7.z) obj;
                i2 i2Var = zVar2.C;
                Context context2 = zVar2.f7475e;
                String str2 = e7.i0.f5136a;
                int iGenerateAudioSessionId = c7.i.C(context2).generateAudioSessionId();
                if (iGenerateAudioSessionId == -1) {
                    iGenerateAudioSessionId = 0;
                }
                Integer numValueOf = Integer.valueOf(iGenerateAudioSessionId);
                i2Var.f2049f = numValueOf;
                e7.b bVar2 = new e7.b(i2Var, numValueOf, i13);
                e7.d0 d0Var = (e7.d0) i2Var.f2046c;
                if (d0Var.f5120a.getLooper().getThread().isAlive()) {
                    d0Var.d(bVar2);
                    return;
                }
                return;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                j7.f fVar2 = ((i7.i0) obj).X;
                fVar2.b0(fVar2.W(), 1034, new j2.n(19));
                return;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                try {
                    i7.i0.h((i7.f1) obj);
                    return;
                } catch (ExoPlaybackException e3) {
                    e7.a.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e3);
                    throw new RuntimeException(e3);
                }
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                j7.f fVar3 = (j7.f) obj;
                fVar3.b0(fVar3.W(), 1028, new j7.c(i11));
                fVar3.F.d();
                return;
            case 23:
                ((f5.f) ((k5.c) obj).f()).a(new GetCredentialUnknownException("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                return;
            case 24:
                ((e7.p) obj).f(-1, new j7.e(i12));
                return;
            case 25:
                k7.c0 c0Var = (k7.c0) obj;
                if (c0Var.f8994a0 >= 300000) {
                    ((k7.e0) c0Var.f9006n.B).f9043o1 = true;
                    c0Var.f8994a0 = 0L;
                    return;
                }
                return;
            case RuntimeVersion.MINOR:
                ((k9.u) obj).release();
                return;
            case 27:
                synchronized (((h1) obj).A) {
                    break;
                }
                return;
            case 28:
                ((g1) obj).h();
                return;
            default:
                ((f5.f) ((m5.c) obj).g()).a(new GetCredentialUnknownException("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                return;
        }
    }
}
