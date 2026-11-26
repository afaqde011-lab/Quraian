package k9;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;

public final class g2 extends Handler {

    public boolean f9308a;

    public boolean f9309b;

    public final s1 f9310c;

    public g2(s1 s1Var, Looper looper) {
        super(looper);
        this.f9310c = s1Var;
        this.f9308a = true;
        this.f9309b = true;
    }

    public final void a(boolean z10, boolean z11) {
        boolean z12 = false;
        this.f9308a = this.f9308a && z10;
        if (this.f9309b && z11) {
            z12 = true;
        }
        this.f9309b = z12;
        if (hasMessages(1)) {
            return;
        }
        sendEmptyMessage(1);
    }

    @Override
    public final void handleMessage(Message message) {
        a2 a2Var;
        int iF;
        s1 s1Var = this.f9310c;
        p3 p3Var = s1Var.f9419g;
        if (message.what != 1) {
            throw new IllegalStateException("Invalid message what=" + message.what);
        }
        t3 t3VarN = s1Var.f9429s.n(s1Var.f9430t.d(), s1Var.f9430t.b(), s1Var.f9429s.f9505k);
        s1Var.f9429s = t3VarN;
        boolean z10 = this.f9308a;
        boolean z11 = this.f9309b;
        t3 t3VarG2 = p3Var.g2(t3VarN);
        oj.q qVar = p3Var.f9384f;
        fh.t0 t0VarC = qVar.C();
        for (int i10 = 0; i10 < t0VarC.size(); i10++) {
            a2 a2Var2 = (a2) t0VarC.get(i10);
            try {
                b3.g1 g1VarI = qVar.I(a2Var2);
                if (g1VarI != null) {
                    iF = g1VarI.f();
                } else if (!s1Var.m(a2Var2)) {
                    break;
                } else {
                    iF = 0;
                }
                t3 t3VarH = qVar.H(a2Var2);
                if (t3VarH == null) {
                    qVar.G(a2Var2);
                    androidx.media3.common.b1 b1VarD = q3.d(qVar.A(a2Var2), s1Var.f9430t.getAvailableCommands());
                    a2Var = a2Var2;
                    try {
                        z1 z1Var = a2Var.f9209d;
                        z1Var.getClass();
                        try {
                            z1Var.r(iF, t3VarH == null ? t3VarG2 : t3VarH, b1VarD, z10, z11);
                        } catch (DeadObjectException unused) {
                            p3Var.f9384f.R(a2Var);
                        } catch (RemoteException e3) {
                            e = e3;
                            e7.a.n("MediaSessionImpl", "Exception in " + a2Var, e);
                        }
                    } catch (DeadObjectException unused2) {
                        a2Var = a2Var;
                    } catch (RemoteException e10) {
                        e = e10;
                        a2Var = a2Var;
                    }
                }
            } catch (DeadObjectException unused3) {
                a2Var = a2Var2;
            } catch (RemoteException e11) {
                e = e11;
                a2Var = a2Var2;
            }
        }
        this.f9308a = true;
        this.f9309b = true;
    }
}
