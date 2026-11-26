package e7;

import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import k9.t0;
import k9.y0;
import k9.z0;

public final class l implements Handler.Callback {
    public final int A;
    public final Object B;

    public l(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i10 = this.A;
        Object obj = this.B;
        switch (i10) {
            case 0:
                p pVar = (p) obj;
                n nVar = pVar.f5158c;
                nVar.getClass();
                for (o oVar : pVar.f5159d) {
                    if (!oVar.f5155d && oVar.f5154c) {
                        androidx.media3.common.r rVarG = oVar.f5153b.g();
                        oVar.f5153b = new androidx.media3.common.q();
                        oVar.f5154c = false;
                        nVar.h(oVar.f5152a, rVarG);
                    }
                    d0 d0Var = pVar.f5157b;
                    d0Var.getClass();
                    if (d0Var.f5120a.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            case 1:
                a1.n nVar2 = (a1.n) obj;
                nVar2.getClass();
                int i11 = message.what;
                if (i11 == 1) {
                    ((x) nVar2.H).a();
                    return true;
                }
                if (i11 == 2) {
                    ((y) nVar2.I).a();
                    return true;
                }
                if (i11 == 3) {
                    ((z) nVar2.J).a();
                    return true;
                }
                if (i11 != 4) {
                    return false;
                }
                ((a0) nVar2.K).a();
                return true;
            case 2:
                h7.b bVar = (h7.b) obj;
                if (message.what == 1) {
                    try {
                        t0 t0Var = (t0) bVar.B;
                        t0Var.E.L0(t0Var.f9440c);
                    } catch (RemoteException unused) {
                        a.m("MCImplBase", "Error in sending flushCommandQueue");
                    }
                    break;
                }
                return true;
            default:
                y0 y0Var = (y0) obj;
                y0Var.getClass();
                if (message.what == 1) {
                    z0 z0Var = y0Var.f9550e;
                    z0Var.j(false, z0Var.f9568n);
                }
                return true;
        }
    }
}
