package oi;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

public final class s {

    public final Context f12033a;

    public final a2.o f12034b;

    public final h7.b f12035c;

    public final long f12036d;

    public h1.l f12037e;

    public h1.l f12038f;

    public n f12039g;

    public final x f12040h;

    public final ui.b f12041i;

    public final ki.a f12042j;

    public final ki.a f12043k;
    public final j l;
    public final li.a m;

    public final hf.c f12044n;

    public final pi.e f12045o;

    public s(bi.g gVar, x xVar, li.a aVar, a2.o oVar, ki.a aVar2, ki.a aVar3, ui.b bVar, j jVar, hf.c cVar, pi.e eVar) {
        this.f12034b = oVar;
        gVar.a();
        this.f12033a = gVar.f2531a;
        this.f12040h = xVar;
        this.m = aVar;
        this.f12042j = aVar2;
        this.f12043k = aVar3;
        this.f12041i = bVar;
        this.l = jVar;
        this.f12044n = cVar;
        this.f12045o = eVar;
        this.f12036d = System.currentTimeMillis();
        this.f12035c = new h7.b(26);
    }

    public final void a(a30.k kVar) {
        pi.e.a();
        pi.e.a();
        this.f12037e.M0();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.f12042j.e(new q(this));
                this.f12039g.g();
                if (!kVar.d().f16089b.f9047a) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.f12039g.d(kVar)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                this.f12039g.h(((xf.g) ((AtomicReference) kVar.i).get()).f16565a);
                c();
            } catch (Exception e3) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e3);
                c();
            }
        } catch (Throwable th2) {
            c();
            throw th2;
        }
    }

    public final void b(a30.k kVar) {
        Future<?> futureSubmit = this.f12045o.f12529a.A.submit(new o(this, kVar, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e3) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e3);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e10);
        } catch (TimeoutException e11) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e11);
        }
    }

    public final void c() {
        pi.e.a();
        try {
            h1.l lVar = this.f12037e;
            ui.b bVar = (ui.b) lVar.B;
            String str = (String) lVar.A;
            bVar.getClass();
            if (new File((File) bVar.D, str).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e3) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e3);
        }
    }
}
