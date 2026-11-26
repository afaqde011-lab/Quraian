package com.revenuecat.purchases;

import ab.k;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Trace;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.f0;
import com.mchutov.p000quranify.main.presentation.screen.main.MainActivity;
import com.revenuecat.purchases.interfaces.Callback;
import d.h0;
import d.s;
import e7.g;
import e7.i0;
import h00.x;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import k9.a2;
import k9.e1;
import k9.f;
import k9.g1;
import k9.i1;
import k9.j1;
import k9.k1;
import k9.l1;
import k9.m1;
import k9.s1;
import k9.z1;
import k9.z3;
import kh.b0;
import kh.o;
import kh.p;
import kh.v;
import kotlin.jvm.internal.m;
import l9.j;
import m3.r0;
import oj.q;
import qd.h;
import z1.l;
import za.a0;
import za.i;
import za.z;

/* JADX INFO: compiled from: r8-map-id-a01b4f2420a8ba15e12131951da5378c769dbc88f62863fce5643f768e2b9ab8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        this.A = i11;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
        this.E = obj4;
        this.F = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z1.b bVarC;
        switch (this.A) {
            case 0:
                PurchasesOrchestrator$Companion$canMakePayments$2$1.onBillingSetupFinished$lambda$3((AtomicBoolean) this.B, (h) this.C, (Callback) this.D, (qd.a) this.E, (List) this.F);
                return;
            case 1:
                s sVar = (s) this.B;
                h0 h0Var = (h0) this.C;
                h0 h0Var2 = (h0) this.D;
                MainActivity mainActivity = (MainActivity) this.E;
                View view = (View) this.F;
                Window window = mainActivity.getWindow();
                m.d(window, "getWindow(...)");
                bw.b bVar = h0Var.f5464c;
                Resources resources = view.getResources();
                m.d(resources, "getResources(...)");
                bVar.invoke(resources);
                Boolean bool = Boolean.TRUE;
                boolean zBooleanValue = bool.booleanValue();
                bw.b bVar2 = h0Var2.f5464c;
                Resources resources2 = view.getResources();
                m.d(resources2, "getResources(...)");
                bVar2.invoke(resources2);
                sVar.a(h0Var, h0Var2, window, view, zBooleanValue, bool.booleanValue());
                return;
            case 2:
                ((k9.e) this.D).run().a(new k((q) this.C, (AtomicBoolean) this.B, (f) this.E, (AtomicBoolean) this.F, 2), p.A);
                return;
            case 3:
                m1 m1Var = (m1) this.B;
                AtomicReference atomicReference = (AtomicReference) this.C;
                a2 a2Var = (a2) this.D;
                e1 e1Var = (e1) this.E;
                g gVar = (g) this.F;
                atomicReference.set(m1Var.M.u(a2Var, e1Var));
                gVar.d();
                return;
            case 4:
                m1 m1Var2 = (m1) this.B;
                String str = (String) this.C;
                a2 a2Var2 = (a2) this.D;
                j jVar = (j) this.E;
                Bundle bundle = (Bundle) this.F;
                z3 z3Var = new z3(str, Bundle.EMPTY);
                if (!m1Var2.K.Q(a2Var2, z3Var)) {
                    jVar.e();
                    return;
                }
                s1 s1Var = m1Var2.M;
                nv.p pVar = s1Var.f12895e;
                g1 g1Var = s1Var.f12901k;
                a2 a2VarF = s1Var.F(a2Var2);
                pVar.getClass();
                v vVarB = pVar.b(g1Var, a2VarF, z3Var, bundle);
                vVarB.a(new ji.a(vVarB, jVar, 12), p.A);
                return;
            case 5:
                p pVar2 = p.A;
                m1 m1Var3 = (m1) this.B;
                a2 a2Var3 = (a2) this.C;
                l9.q qVar = (l9.q) this.D;
                Bundle bundle2 = (Bundle) this.E;
                String str2 = (String) this.F;
                s1 s1Var2 = m1Var3.M;
                e1 e1VarH = null;
                if (!m1Var3.K.P(a2Var3, 50003)) {
                    qVar.f(null);
                    return;
                }
                if (bundle2 != null) {
                    bundle2.setClassLoader(s1Var2.f12896f.getClassLoader());
                    try {
                        int i11 = bundle2.getInt("android.media.browse.extra.PAGE");
                        int i12 = bundle2.getInt("android.media.browse.extra.PAGE_SIZE");
                        e1VarH = k9.p.h(s1Var2.f12896f, bundle2);
                        if (i11 >= 0 && i12 > 0) {
                            b0 b0VarV = i0.V(s1Var2.t(a2Var3, str2, i12, e1VarH), new i1(m1Var3, 1));
                            b0VarV.a(new j1(b0VarV, qVar, 1), pVar2);
                            return;
                        }
                    } catch (BadParcelableException unused) {
                    }
                }
                b0 b0VarV2 = i0.V(s1Var2.t(a2Var3, str2, Integer.MAX_VALUE, e1VarH), new i1(m1Var3, 1));
                b0VarV2.a(new j1(b0VarV2, qVar, 1), pVar2);
                return;
            case 6:
                m1 m1Var4 = (m1) this.B;
                a2 a2Var4 = (a2) this.C;
                j jVar2 = (j) this.D;
                String str3 = (String) this.E;
                Bundle bundle3 = (Bundle) this.F;
                if (!m1Var4.K.P(a2Var4, 50005)) {
                    jVar2.f(null);
                    return;
                }
                z1 z1Var = a2Var4.f12687d;
                z1Var.getClass();
                k1 k1Var = (k1) z1Var;
                synchronized (k1Var.A) {
                    k1Var.C.add(new l1(a2Var4, a2Var4.f12684a, str3, bundle3, jVar2));
                    break;
                }
                m1Var4.M.A(a2Var4, str3, k9.p.h(m1Var4.M.f12896f, bundle3));
                return;
            case 7:
                r0 r0Var = (r0) this.B;
                y3.m mVar = (y3.m) this.C;
                String str4 = (String) this.D;
                y3.c cVar = (y3.c) this.E;
                q3.h hVar = (q3.h) this.F;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    z1.f fVarJ = l.j();
                    z1.b bVar3 = fVarJ instanceof z1.b ? (z1.b) fVarJ : null;
                    if (bVar3 == null || (bVarC = bVar3.C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        z1.f fVarJ2 = bVarC.j();
                        try {
                            r0 r0VarJ = m3.h0.j(r0Var, mVar);
                            x xVar = x.A;
                            u3.c cVar2 = new u3.c(str4, r0VarJ, xVar, xVar, hVar, cVar);
                            cVar2.l();
                            cVar2.c();
                            z1.f.q(fVarJ2);
                            bVarC.w().e();
                            bVarC.c();
                            Trace.endSection();
                            return;
                        } catch (Throwable th2) {
                            z1.f.q(fVarJ2);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            bVarC.c();
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    Trace.endSection();
                    throw th5;
                }
            default:
                i iVar = (i) this.B;
                String label = (String) this.C;
                u00.a aVar = (u00.a) this.D;
                f0 f0Var = (f0) this.E;
                d4.h hVar2 = (d4.h) this.F;
                iVar.getClass();
                boolean zIsEnabled = Trace.isEnabled();
                if (zIsEnabled) {
                    try {
                        m.e(label, "label");
                        o.n(label);
                    } catch (Throwable th6) {
                        if (!zIsEnabled) {
                            throw th6;
                        }
                        Trace.endSection();
                        throw th6;
                    }
                }
                try {
                    aVar.invoke();
                    a0 a0Var = za.b0.f24121b;
                    f0Var.i(a0Var);
                    hVar2.a(a0Var);
                    break;
                } catch (Throwable th7) {
                    f0Var.i(new z(th7));
                    hVar2.c(th7);
                    break;
                }
                if (zIsEnabled) {
                    Trace.endSection();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ d(q qVar, k9.e eVar, AtomicBoolean atomicBoolean, f fVar, AtomicBoolean atomicBoolean2) {
        this.A = 2;
        this.C = qVar;
        this.D = eVar;
        this.B = atomicBoolean;
        this.E = fVar;
        this.F = atomicBoolean2;
    }
}
