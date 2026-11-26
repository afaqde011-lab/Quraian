package c3;

import android.view.ActionMode;
import com.google.android.gms.internal.measurement.b5;
import g1.g4;
import g1.k8;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

public final class k1 implements l1.y {

    public final int f2688a;

    public final Object f2689b;

    public k1(Object obj, int i10) {
        this.f2688a = i10;
        this.f2689b = obj;
    }

    @Override
    public final void dispose() {
        a40.u1 u1Var;
        switch (this.f2688a) {
            case 0:
                ((r1) this.f2689b).B.invoke();
                return;
            case 1:
                c4.x xVar = (c4.x) this.f2689b;
                xVar.dismiss();
                xVar.H.e();
                return;
            case 2:
                c4.z zVar = (c4.z) this.f2689b;
                zVar.e();
                androidx.lifecycle.u0.k(zVar, null);
                zVar.P.removeViewImmediate(zVar);
                return;
            case 3:
                for (cl.d dVar : (ArrayList) this.f2689b) {
                    dVar.a.setNavigationBarColor(dVar.b);
                    dVar.a.setNavigationBarContrastEnforced(dVar.c);
                }
                return;
            case 4:
                am.c cVar = (am.c) this.f2689b;
                cVar.i = false;
                cVar.b();
                return;
            case 5:
                h.h hVar = ((e.a) this.f2689b).f4929a;
                if (hVar == null) {
                    throw new IllegalStateException("Launcher has not been initialized");
                }
                hVar.b();
                return;
            case 6:
                ((ez.s) this.f2689b).A.a();
                return;
            case 7:
                g4 g4Var = (g4) this.f2689b;
                g4Var.dismiss();
                g4Var.I.e();
                return;
            case 8:
                ((gv.l) this.f2689b).A.a();
                return;
            case 9:
                ((gv.n0) this.f2689b).A.a();
                return;
            case 10:
                ((gv.f1) this.f2689b).A.a();
                return;
            case 11:
                a40.k kVar = ((k8) this.f2689b).f5851c;
                if (kVar != null) {
                    kVar.h((Throwable) null);
                    return;
                }
                return;
            case 12:
                Object obj = this.f2689b;
                kotlin.jvm.internal.m.e(obj, "key");
                g00.k kVar2 = b5.f3677a;
                if ((kVar2 != null ? kVar2.A : null) == obj) {
                    b5.f3677a = null;
                    return;
                }
                return;
            case 13:
                ((l0.h0) this.f2689b).f9746d = null;
                return;
            case 14:
                l0.v0 v0Var = (l0.v0) this.f2689b;
                c7.c cVar2 = v0Var.f9800c;
                if (cVar2 != null) {
                    cVar2.A = false;
                }
                v0Var.f9800c = null;
                return;
            case 15:
                ((l0.r0) this.f2689b).f9790f = true;
                return;
            case 16:
                b1.e0 e0Var = (b1.e0) this.f2689b;
                w0.j jVar = e0Var.f1945f.f15828a;
                if (jVar != null && (u1Var = jVar.U) != null) {
                    u1Var.i((CancellationException) null);
                    jVar.U = null;
                }
                e0Var.f1950k = null;
                return;
            case 17:
                ((e1.v0) this.f2689b).o();
                return;
            case TYPE_SINT64_VALUE:
                ((tp.e) this.f2689b).A.a();
                return;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                ((tp.g) this.f2689b).A.a();
                return;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                v0.f fVar = (v0.f) this.f2689b;
                z1.u uVar = fVar.f15319e;
                y8.g gVar = uVar.f17071h;
                if (gVar != null) {
                    gVar.a();
                }
                uVar.a();
                ActionMode actionMode = fVar.f15322h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                fVar.f15322h = null;
                return;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                ((wy.n) this.f2689b).A.a();
                return;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                ((x.y0) ((f5.c) this.f2689b)).g1(null);
                return;
            default:
                x0.b bVar = (x0.b) ((x0.c) this.f2689b).f16396c.getValue();
                if (bVar != null) {
                    bVar.close();
                    return;
                }
                return;
        }
    }
}
