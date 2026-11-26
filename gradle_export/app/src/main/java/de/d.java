package de;

import a30.k;
import ab.r;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.SparseBooleanArray;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import ee.h;
import java.util.List;
import java.util.Objects;
import k9.a2;
import k9.g1;
import k9.s1;
import k9.t2;
import k9.w1;
import xd.i;

public final class d implements Runnable {
    public final int A;
    public final int B;
    public final Object C;
    public final Object D;
    public final Object E;

    public d(int i10, int i11, Object obj, Object obj2, Object obj3) {
        this.A = i11;
        this.C = obj;
        this.B = i10;
        this.D = obj2;
        this.E = obj3;
    }

    public d(k kVar, i iVar, int i10, Runnable runnable) {
        this.A = 0;
        this.C = kVar;
        this.D = iVar;
        this.B = i10;
        this.E = runnable;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                k kVar = (k) this.C;
                i iVar = (i) this.D;
                int i10 = this.B;
                Runnable runnable = (Runnable) this.E;
                fe.b bVar = (fe.b) kVar.f;
                try {
                    try {
                        ee.d dVar = (ee.d) kVar.c;
                        Objects.requireNonNull(dVar);
                        ((h) bVar).x(new r(dVar, 5));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) kVar.a).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((h) bVar).x(new androidx.media3.cast.a(kVar, iVar, i10));
                        } else {
                            kVar.e(iVar, i10);
                        }
                        break;
                    } catch (SynchronizationException unused) {
                        ((a1.i) kVar.d).x(iVar, i10 + 1, false);
                    }
                    return;
                } finally {
                    runnable.run();
                }
            case 1:
                w1 w1Var = (w1) this.C;
                g1 g1Var = (g1) this.D;
                gi.c cVar = (gi.c) this.E;
                if (this.B == w1Var.I) {
                    w1Var.e(g1Var, cVar, w1Var.c());
                    return;
                }
                return;
            default:
                c50.h hVar = (c50.h) this.C;
                List list = (List) this.D;
                a2 a2Var = (a2) this.E;
                s1 s1Var = ((t2) hVar.D).f9463f;
                int i11 = this.B;
                if (i11 == -1) {
                    s1Var.f9430t.addMediaItems(list);
                } else {
                    s1Var.f9430t.addMediaItems(i11, list);
                }
                new SparseBooleanArray().append(20, true);
                s1Var.y(a2Var);
                return;
        }
    }
}
