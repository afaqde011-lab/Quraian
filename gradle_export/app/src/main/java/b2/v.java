package b2;

import a1.e1;
import a1.k2;
import a40.g0;
import android.os.Looper;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputConnection;
import b3.j0;
import b3.l0;
import b3.q2;
import c3.m2;
import c3.n1;
import c3.q0;
import c3.s3;
import c3.u0;
import c3.v0;
import c3.w0;
import c3.z1;
import c4.z;
import g00.b0;
import java.util.concurrent.CancellationException;
import r3.x;
import v2.y;
import z2.k1;
import z2.l1;

public final class v extends kotlin.jvm.internal.n implements u00.k {
    public final int A;
    public final Object B;
    public final Object C;

    public v(Object obj, Object obj2, int i10) {
        super(1);
        this.A = i10;
        this.B = obj;
        this.C = obj2;
    }

    public final Object invoke(Object obj) {
        InputConnection inputConnection;
        a1.i iVarG0;
        switch (this.A) {
            case 0:
                ((k1) obj).h((l1) this.B, 0, 0, ((w) this.C).O);
                return b0.a;
            case 1:
                ((l0) this.B).f0(((r) obj).V((r) this.C));
                return b0.a;
            case 2:
                return new z1((m2) this.B, new j0((q0) this.C, 4));
            case 3:
                z1 z1Var = (z1) this.B;
                synchronized (z1Var.f2823c) {
                    try {
                        z1Var.f2825e = true;
                        m1.e eVar = z1Var.f2824d;
                        Object[] objArr = eVar.A;
                        int i10 = eVar.C;
                        for (int i11 = 0; i11 < i10; i11++) {
                            r3.m mVar = (r3.m) ((q2) objArr[i11]).get();
                            if (mVar != null && (inputConnection = mVar.f13082b) != null) {
                                mVar.a(inputConnection);
                                mVar.f13082b = null;
                            }
                        }
                        z1Var.f2824d.g();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                x xVar = ((q0) this.C).B;
                xVar.f13103b.set(null);
                xVar.f13102a.d();
                return b0.a;
            case 4:
                u0 u0Var = (u0) this.B;
                v0 v0Var = (v0) this.C;
                synchronized (u0Var.E) {
                    u0Var.G.remove(v0Var);
                }
                return b0.a;
            case 5:
                ((Choreographer) ((w0) this.B).B).removeFrameCallback((v0) this.C);
                return b0.a;
            case 6:
                n1 n1Var = (n1) obj;
                u00.n nVar = (u00.n) this.C;
                s3 s3Var = (s3) this.B;
                if (!s3Var.C) {
                    androidx.lifecycle.w wVar = n1Var.f2702c;
                    View view = n1Var.f2700a;
                    androidx.lifecycle.q lifecycle = wVar.getLifecycle();
                    s3Var.E = nVar;
                    if (s3Var.D == null) {
                        if (kotlin.jvm.internal.m.a(Looper.myLooper(), view.getHandler().getLooper())) {
                            s3Var.D = lifecycle;
                            lifecycle.a(s3Var);
                        } else {
                            view.post(new ab.f(s3Var, lifecycle, 3));
                        }
                    } else if (lifecycle.b().compareTo(androidx.lifecycle.p.C) >= 0) {
                        s3Var.B.A(new v1.c(new b4.m(s3Var, n1Var, nVar), -1723985096, true));
                    }
                }
                return b0.a;
            case 7:
                z zVar = (z) this.B;
                zVar.setPositionProvider((c4.b0) this.C);
                zVar.q();
                return new c4.i();
            case 8:
                if (((Boolean) ((e1) this.B).invoke((e2.d) obj)).booleanValue()) {
                    return (k2) this.C;
                }
                return null;
            case 9:
                k1.s((k1) obj, (l1) this.B, 0, 0, ((i2.o) this.C).O, 4);
                return b0.a;
            case 10:
                k1.s((k1) obj, (l1) this.B, 0, 0, ((i2.u0) this.C).f7171b0, 4);
                return b0.a;
            case 11:
                k2.d dVar = (k2.d) obj;
                k2.d dVar2 = (k2.d) this.B;
                y3.c cVarO = dVar.G0().o();
                y3.m mVarP = dVar.G0().p();
                i2.s sVarN = dVar.G0().n();
                long jQ = dVar.G0().q();
                l2.b bVar = (l2.b) dVar.G0().C;
                u00.k kVar = (u00.k) this.C;
                y3.c cVarO2 = dVar2.G0().o();
                y3.m mVarP2 = dVar2.G0().p();
                i2.s sVarN2 = dVar2.G0().n();
                long jQ2 = dVar2.G0().q();
                l2.b bVar2 = (l2.b) dVar2.G0().C;
                a1.i iVarG1 = dVar2.G0();
                iVarG1.z(cVarO);
                iVarG1.B(mVarP);
                iVarG1.y(sVarN);
                iVarG1.C(jQ);
                iVarG1.C = bVar;
                sVarN.i();
                try {
                    kVar.invoke(dVar2);
                    return b0.a;
                } finally {
                    sVarN.q();
                    iVarG0 = dVar2.G0();
                    iVarG0.z(cVarO2);
                    iVarG0.B(mVarP2);
                    iVarG0.y(sVarN2);
                    iVarG0.C(jQ2);
                    iVarG0.C = bVar2;
                }
            case 12:
                MotionEvent motionEvent = (MotionEvent) obj;
                y yVar = (y) this.C;
                if (motionEvent.getActionMasked() == 0) {
                    p10.a aVar = (p10.a) this.B;
                    b4.e eVar2 = yVar.A;
                    if (eVar2 == null) {
                        kotlin.jvm.internal.m.k("onTouchEvent");
                        throw null;
                    }
                    aVar.B = ((Boolean) eVar2.invoke(motionEvent)).booleanValue() ? v2.w.B : v2.w.C;
                } else {
                    b4.e eVar3 = yVar.A;
                    if (eVar3 == null) {
                        kotlin.jvm.internal.m.k("onTouchEvent");
                        throw null;
                    }
                    eVar3.invoke(motionEvent);
                }
                return b0.a;
            case 13:
                ((k1) obj).h((l1) this.B, 0, 0, ((w.j0) this.C).f15778c.h());
                return b0.a;
            default:
                Throwable th3 = (Throwable) obj;
                d4.h hVar = (d4.h) this.B;
                if (th3 == null) {
                    hVar.a(((g0) this.C).D());
                } else if (th3 instanceof CancellationException) {
                    hVar.b();
                } else {
                    hVar.c(th3);
                }
                return b0.a;
        }
    }
}
