package oi;

import a8.d0;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.util.Log;
import android.view.Surface;
import androidx.media3.common.w2;
import b3.g1;
import com.google.firebase.messaging.FirebaseMessaging;
import e7.i0;
import i7.z;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import q3.e0;
import s7.a0;
import s7.s0;

public final class p implements Runnable {
    public final int A;
    public final Object B;
    public final Object C;

    public p(Object obj, Object obj2, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
    }

    public p(s sVar, Throwable th2) {
        this.A = 0;
        Map map = Collections.EMPTY_MAP;
        this.B = sVar;
        this.C = th2;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                s sVar = (s) this.B;
                Throwable th2 = (Throwable) this.C;
                Map map = Collections.EMPTY_MAP;
                n nVar = sVar.f12039g;
                Thread threadCurrentThread = Thread.currentThread();
                nVar.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                u uVar = nVar.f12028n;
                if (uVar == null || !uVar.f12057e.get()) {
                    long j9 = jCurrentTimeMillis / 1000;
                    String strE = nVar.e();
                    if (strE == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    qi.c cVar = new qi.c(strE, j9, map);
                    ui.b bVar = nVar.m;
                    bVar.getClass();
                    String strConcat = "Persisting non-fatal event for session ".concat(strE);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", strConcat, null);
                    }
                    bVar.s(th2, threadCurrentThread, "error", cVar, false);
                    return;
                }
                return;
            case 1:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.B;
                xf.g gVar = (xf.g) this.C;
                bd.d dVar = FirebaseMessaging.f4353k;
                firebaseMessaging.getClass();
                try {
                    gVar.b(firebaseMessaging.a());
                    return;
                } catch (Exception e3) {
                    gVar.a(e3);
                    return;
                }
            case 2:
                oj.k kVar = (oj.k) this.B;
                xf.g gVar2 = (xf.g) this.C;
                try {
                    gVar2.b(kVar.a());
                    return;
                } catch (Exception e10) {
                    gVar2.a(e10);
                    return;
                }
            case 3:
                ((p4.a) this.B).i((Typeface) this.C);
                return;
            case 4:
                g1 g1Var = (g1) this.B;
                p pVar = (p) this.C;
                ((p7.j) g1Var.f2032f).t();
                p7.e eVar = (p7.e) g1Var.f2031e;
                synchronized (eVar.f12381a) {
                    eVar.b();
                    pVar.run();
                    break;
                }
                return;
            case 5:
                p7.m mVar = (p7.m) this.B;
                mVar.f12419d0.set(mVar.w((h7.b) this.C, mVar.X, 0));
                return;
            case 6:
                ui.b bVar2 = (ui.b) this.B;
                ((qi.h) bVar2.C).i((String) bVar2.B, (List) this.C);
                return;
            case 7:
                ((e7.h) this.B).accept(this.C);
                return;
            case 8:
                ((s0) this.B).C((d0) this.C);
                return;
            case 9:
                uu.w wVar = (uu.w) this.B;
                try {
                    Object obj = ((k9.v) this.C).get();
                    kotlin.jvm.internal.m.d(obj, "get(...)");
                    wVar.o((k9.u) obj);
                    return;
                } catch (Exception unused) {
                    wVar.x();
                    return;
                }
            case 10:
                vi.b bVar3 = (vi.b) this.B;
                CountDownLatch countDownLatch = (CountDownLatch) this.C;
                try {
                    ce.c cVar2 = bVar3.f15710h;
                    xd.p.a().f16561d.e(((xd.i) cVar2.B).b(ud.d.C), 1);
                    break;
                } catch (Exception unused2) {
                }
                countDownLatch.countDown();
                return;
            case 11:
                e0 e0Var = (e0) this.B;
                ((y7.c) e0Var.C).f16650h.a((w2) this.C);
                return;
            case 12:
                k7.n nVar2 = (k7.n) this.B;
                i7.b bVar4 = (i7.b) this.C;
                i7.v vVar = nVar2.f9112b;
                String str = i0.f5136a;
                h1.l.I0(vVar.A.G, bVar4);
                return;
            case 13:
                k7.n nVar3 = (k7.n) this.B;
                w2 w2Var = (w2) this.C;
                i7.v vVar2 = nVar3.f9112b;
                String str2 = i0.f5136a;
                z zVar = vVar2.A;
                zVar.f7492n0 = w2Var;
                zVar.m.f(25, new i7.u(w2Var));
                return;
            case 14:
                k7.n nVar4 = (k7.n) this.B;
                i7.c cVar3 = (i7.c) this.C;
                synchronized (cVar3) {
                }
                i7.v vVar3 = nVar4.f9112b;
                String str3 = i0.f5136a;
                j7.f fVar = vVar3.A.f7501s;
                j7.a aVarY = fVar.Y((a0) fVar.D.F);
                fVar.b0(aVarY, 1020, new ab.r(aVarY, cVar3));
                return;
            default:
                z7.k kVar2 = (z7.k) this.B;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.C;
                SurfaceTexture surfaceTexture2 = kVar2.G;
                Surface surface = kVar2.H;
                Surface surface2 = new Surface(surfaceTexture);
                kVar2.G = surfaceTexture;
                kVar2.H = surface2;
                Iterator it = kVar2.A.iterator();
                while (it.hasNext()) {
                    ((i7.v) it.next()).A.u(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
        }
    }
}
