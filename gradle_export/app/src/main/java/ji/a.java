package ji;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.session.MediaController;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.StrictMode;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.media3.common.t;
import androidx.media3.ui.PlayerView;
import ca.z;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import e7.i0;
import f5.o;
import i7.v;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import k7.n;
import k7.u;
import k9.a2;
import k9.c1;
import k9.d4;
import k9.i1;
import k9.j1;
import k9.k1;
import k9.l1;
import k9.m1;
import k9.p;
import k9.p3;
import k9.s1;
import k9.t0;
import k9.v3;
import k9.y0;
import k9.z0;
import kh.b0;
import l9.e0;
import l9.g0;
import oj.q;
import s7.a0;
import ta.c0;

public final class a implements Runnable {
    public final int A;
    public final Object B;
    public final Object C;

    public a(Object obj, Object obj2, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
    }

    public a(s1 s1Var, a2 a2Var, Runnable runnable) {
        this.A = 15;
        this.B = s1Var;
        this.C = runnable;
    }

    @Override
    public final void run() {
        k7.e eVar;
        int i10;
        int i11;
        int i12;
        int i13;
        d4 d4Var;
        int i14 = 1;
        switch (this.A) {
            case 0:
                b bVar = (b) this.B;
                Runnable runnable = (Runnable) this.C;
                Process.setThreadPriority(bVar.f8288c);
                StrictMode.ThreadPolicy threadPolicy = bVar.f8289d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 1:
                Callable callable = (Callable) this.B;
                h hVar = (h) ((gi.c) this.C).B;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e3) {
                    hVar.l(e3);
                    return;
                }
            case 2:
                z zVar = (z) this.B;
                Runnable runnable2 = (Runnable) this.C;
                zVar.getClass();
                try {
                    runnable2.run();
                    return;
                } finally {
                    zVar.a();
                }
            case 3:
                ((f5.f) ((k5.c) this.B).f()).b((o) this.C);
                return;
            case 4:
                ((f5.f) ((k5.c) this.B).f()).a(((kotlin.jvm.internal.z) this.C).A);
                return;
            case 5:
                ((f5.f) ((k5.c) this.B).f()).a((GetCredentialUnknownException) this.C);
                return;
            case 6:
                n nVar = (n) this.B;
                synchronized (((i7.c) this.C)) {
                }
                v vVar = nVar.f9112b;
                String str = i0.f5136a;
                j7.f fVar = vVar.A.f7501s;
                fVar.b0(fVar.Y((a0) fVar.D.F), 1013, new j7.c(8));
                return;
            case 7:
                n nVar2 = (n) this.B;
                i7.b bVar2 = (i7.b) this.C;
                v vVar2 = nVar2.f9112b;
                String str2 = i0.f5136a;
                h1.l.I0(vVar2.A.F, bVar2);
                return;
            case 8:
                q qVar = (q) this.B;
                AudioDeviceInfo routedDevice = ((AudioRouting) this.C).getRoutedDevice();
                if (routedDevice != null) {
                    ((Handler) qVar.D).post(new a(qVar, routedDevice, 9));
                    return;
                }
                return;
            case 9:
                q qVar2 = (q) this.B;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.C;
                if (((k7.q) qVar2.E) == null || (eVar = ((u) ((hf.c) qVar2.C).B).f9154h) == null || audioDeviceInfo.equals((AudioDeviceInfo) eVar.f9031i)) {
                    return;
                }
                eVar.f9031i = audioDeviceInfo;
                eVar.d(k7.b.c((Context) eVar.f9024b, (androidx.media3.common.d) eVar.f9032j, audioDeviceInfo));
                return;
            case 10:
                z0 z0Var = (z0) this.B;
                h7.b bVar3 = new h7.b(z0Var.f9557a, (e0) this.C);
                z0Var.f9565i = bVar3;
                y0 y0Var = z0Var.f9561e;
                Handler handler = z0Var.f9558b.f9523f;
                if (!((Set) bVar3.B).add(y0Var)) {
                    e7.a.m("MediaControllerCompat", "the callback has already been registered");
                    return;
                }
                if (handler == null) {
                    handler = new Handler();
                }
                y0Var.d(handler);
                l9.v vVar3 = (l9.v) bVar3.A;
                MediaController mediaController = vVar3.f10183a;
                android.support.v4.media.session.e eVar2 = y0Var.f9546a;
                eVar2.getClass();
                mediaController.registerCallback(eVar2, handler);
                synchronized (vVar3.f10184b) {
                    l9.d dVarA = vVar3.f10187e.a();
                    if (dVarA != null) {
                        l9.u uVar = new l9.u(y0Var);
                        vVar3.f10186d.put(y0Var, uVar);
                        y0Var.f9548c = uVar;
                        try {
                            dVarA.a2(uVar);
                            y0Var.c(13, null);
                        } catch (RemoteException | SecurityException e10) {
                            e7.a.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                        }
                    } else {
                        y0Var.f9548c = null;
                        vVar3.f10185c.add(y0Var);
                    }
                    break;
                }
                return;
            case 11:
                t0 t0Var = (t0) this.B;
                c1 c1Var = (c1) this.C;
                if (t0Var.f9451p) {
                    return;
                }
                c1Var.g(t0Var);
                return;
            case 12:
                kh.v vVar4 = (kh.v) this.B;
                l9.j jVar = (l9.j) this.C;
                try {
                    d4 d4Var2 = (d4) vVar4.get();
                    c0.w(d4Var2, "SessionResult must not be null");
                    jVar.f(d4Var2.f9269b);
                    return;
                } catch (InterruptedException | CancellationException | ExecutionException e11) {
                    e7.a.n("MLSLegacyStub", "Custom action failed", e11);
                    jVar.e();
                    return;
                }
            case 13:
                b0 b0Var = (b0) this.B;
                ArrayList arrayList = (ArrayList) this.C;
                if (b0Var.A instanceof kh.a) {
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        if (arrayList.get(i15) != null) {
                            ((kh.v) arrayList.get(i15)).cancel(false);
                        }
                    }
                    return;
                }
                return;
            case 14:
                k1 k1Var = (k1) this.B;
                ArrayList arrayList2 = (ArrayList) this.C;
                m1 m1Var = k1Var.D;
                s1 s1Var = m1Var.M;
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    l1 l1Var = (l1) arrayList2.get(i16);
                    Bundle bundle = l1Var.f9374d;
                    l9.j jVar2 = l1Var.f9375e;
                    if (bundle != null) {
                        try {
                            bundle.setClassLoader(s1Var.f9418f.getClassLoader());
                            i10 = bundle.getInt("android.media.browse.extra.PAGE", -1);
                            i11 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                        } catch (BadParcelableException unused) {
                            jVar2.f(null);
                            return;
                        }
                    } else {
                        i10 = 0;
                        i11 = Integer.MAX_VALUE;
                    }
                    if (i10 < 0 || i11 < 1) {
                        i12 = 0;
                        i13 = Integer.MAX_VALUE;
                    } else {
                        i12 = i10;
                        i13 = i11;
                    }
                    b0 b0VarV = i0.V(m1Var.M.v(l1Var.f9371a, l1Var.f9373c, i12, i13, p.h(s1Var.f9418f, bundle)), new i1(m1Var, i14));
                    b0VarV.a(new j1(b0VarV, jVar2, i14), kh.p.A);
                    break;
                }
                return;
            case 15:
                s1 s1Var2 = (s1) this.B;
                Runnable runnable3 = (Runnable) this.C;
                s1Var2.getClass();
                runnable3.run();
                return;
            case 16:
                ((b0) this.C).l(Boolean.valueOf(((s1) this.B).x()));
                return;
            case 17:
                ((s1) this.B).H(null, (v3) this.C);
                return;
            case TYPE_SINT64_VALUE:
                kh.v vVar5 = (kh.v) this.B;
                ResultReceiver resultReceiver = (ResultReceiver) this.C;
                try {
                    d4Var = (d4) vVar5.get();
                    c0.w(d4Var, "SessionResult must not be null");
                    break;
                } catch (InterruptedException | ExecutionException e12) {
                    e7.a.n("MediaSessionLegacyStub", "Custom command failed", e12);
                    d4Var = new d4(-1);
                } catch (CancellationException e13) {
                    e7.a.n("MediaSessionLegacyStub", "Custom command cancelled", e13);
                    d4Var = new d4(1);
                }
                resultReceiver.send(d4Var.f9268a, d4Var.f9269b);
                return;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                s1 s1Var3 = (s1) this.B;
                Intent intent = (Intent) this.C;
                a2 a2VarI = s1Var3.i();
                if (a2VarI == null) {
                    ComponentName component = intent.getComponent();
                    a2VarI = new a2(new g0(component != null ? component.getPackageName() : "androidx.media3.session.MediaSessionService", -1, -1), 1009000300, 8, false, null, Bundle.EMPTY);
                }
                if (s1Var3.w(a2VarI, intent)) {
                    return;
                }
                e7.a.b("MSessionService", "Ignored unrecognized media button intent.");
                return;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                AudioPlayerService audioPlayerService = (AudioPlayerService) this.B;
                oe.o oVar = (oe.o) this.C;
                audioPlayerService.b(oVar).H = oVar;
                return;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                p3 p3Var = (p3) this.B;
                k9.k kVar = (k9.k) this.C;
                q qVar3 = p3Var.f9384f;
                a2 a2VarE = qVar3.E(kVar.asBinder());
                if (a2VarE != null) {
                    qVar3.R(a2VarE);
                    return;
                }
                return;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                ((p3) this.B).f9384f.y((a2) this.C);
                return;
            case 23:
                ((f5.f) ((m5.c) this.B).g()).b((o) this.C);
                return;
            case 24:
                ((f5.f) ((m5.c) this.B).g()).a(((kotlin.jvm.internal.z) this.C).A);
                return;
            case 25:
                ((f5.f) ((m5.c) this.B).g()).a((GetCredentialUnknownException) this.C);
                return;
            case RuntimeVersion.MINOR:
                ((f5.f) ((m5.c) this.B).g()).a((GetCredentialUnsupportedException) this.C);
                return;
            case 27:
                PlayerView.a((PlayerView) this.B, (Bitmap) this.C);
                return;
            case 28:
                n7.c cVar = (n7.c) this.B;
                t tVar = (t) this.C;
                n7.d dVar = cVar.D;
                if (dVar.f11157p == 0 || cVar.C) {
                    return;
                }
                Looper looper = dVar.f11161t;
                looper.getClass();
                cVar.B = dVar.e(looper, cVar.A, tVar, false);
                dVar.f11155n.add(cVar);
                return;
            default:
                ((oi.n) this.B).c((String) this.C, Boolean.FALSE);
                return;
        }
    }
}
