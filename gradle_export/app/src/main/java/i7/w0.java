package i7;

import android.graphics.Bitmap;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.internal.measurement.b5;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import k9.a2;
import k9.s2;
import k9.t2;
import k9.z3;

public final class w0 implements Runnable {
    public final int A;
    public final int B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;

    public w0(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.A = i11;
        this.C = obj;
        this.D = obj2;
        this.E = obj3;
        this.F = obj4;
        this.B = i10;
    }

    public w0(t2 t2Var, z3 z3Var, int i10, l9.g0 g0Var, s2 s2Var) {
        this.A = 2;
        this.C = t2Var;
        this.D = z3Var;
        this.B = i10;
        this.E = g0Var;
        this.F = s2Var;
    }

    @Override
    public final void run() {
        Bitmap bitmap;
        switch (this.A) {
            case 0:
                y0 y0Var = (y0) this.C;
                Pair pair = (Pair) this.D;
                ((j7.f) y0Var.B.f7231i).c(((Integer) pair.first).intValue(), (s7.a0) pair.second, (s7.r) this.E, (s7.w) this.F, this.B);
                break;
            case 1:
                k9.z0 z0Var = (k9.z0) this.C;
                AtomicInteger atomicInteger = (AtomicInteger) this.D;
                List list = (List) this.E;
                ArrayList arrayList = (ArrayList) this.F;
                if (atomicInteger.incrementAndGet() == list.size()) {
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        kh.v vVar = (kh.v) arrayList.get(i10);
                        if (vVar != null) {
                            try {
                                bitmap = (Bitmap) b5.u(vVar);
                            } catch (CancellationException | ExecutionException e3) {
                                e7.a.c("MCImplLegacy", "Failed to get bitmap", e3);
                                bitmap = null;
                            }
                        } else {
                            bitmap = null;
                        }
                        z0Var.f9565i.l(k9.p.i((androidx.media3.common.q0) list.get(i10), bitmap), this.B + i10);
                    }
                }
                break;
            default:
                t2 t2Var = (t2) this.C;
                z3 z3Var = (z3) this.D;
                l9.g0 g0Var = (l9.g0) this.E;
                s2 s2Var = (s2) this.F;
                oj.q qVar = t2Var.f9462e;
                if (!t2Var.f9463f.o()) {
                    boolean zIsActive = ((l9.c0) t2Var.f9467j.B).f10126a.isActive();
                    int i11 = this.B;
                    if (!zIsActive) {
                        StringBuilder sb2 = new StringBuilder("Ignore incoming session command before initialization. command=");
                        sb2.append(z3Var == null ? Integer.valueOf(i11) : z3Var.f9579b);
                        sb2.append(", pid=");
                        sb2.append(g0Var.f10146a.f10151b);
                        e7.a.m("MediaSessionLegacyStub", sb2.toString());
                    } else {
                        a2 a2VarN = t2Var.N(g0Var);
                        if (z3Var != null) {
                            if (!qVar.Q(a2VarN, z3Var)) {
                            }
                        } else if (!qVar.P(a2VarN, i11)) {
                        }
                        try {
                            s2Var.a(a2VarN);
                        } catch (RemoteException e10) {
                            e7.a.n("MediaSessionLegacyStub", "Exception in " + a2VarN, e10);
                        }
                    }
                    break;
                }
                break;
        }
    }
}
