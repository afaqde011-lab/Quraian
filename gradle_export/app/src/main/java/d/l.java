package d;

import android.content.Intent;
import android.content.IntentSender;
import android.os.RemoteException;
import android.util.Pair;
import i7.y0;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import k9.d4;
import k9.t0;

public final class l implements Runnable {
    public final int A;
    public final Object B;
    public final int C;
    public final Object D;

    public l(Object obj, int i10, Object obj2, int i11) {
        this.A = i11;
        this.B = obj;
        this.C = i10;
        this.D = obj2;
    }

    public l(Object obj, Object obj2, int i10, int i11) {
        this.A = i11;
        this.B = obj;
        this.D = obj2;
        this.C = i10;
    }

    @Override
    public final void run() {
        d4 d4Var;
        switch (this.A) {
            case 0:
                m mVar = (m) this.B;
                Serializable serializable = (Serializable) ((hf.c) this.D).B;
                String str = (String) mVar.f6370a.get(Integer.valueOf(this.C));
                if (str != null) {
                    h.f fVar = (h.f) mVar.f6374e.get(str);
                    if ((fVar != null ? fVar.f6362a : null) == null) {
                        mVar.f6376g.remove(str);
                        mVar.f6375f.put(str, serializable);
                    } else {
                        h.b bVar = fVar.f6362a;
                        kotlin.jvm.internal.m.c(bVar, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
                        if (mVar.f6373d.remove(str)) {
                            bVar.a(serializable);
                        }
                    }
                    break;
                }
                break;
            case 1:
                ((m) this.B).a(this.C, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.D));
                break;
            case 2:
                CopyOnWriteArraySet<e7.o> copyOnWriteArraySet = (CopyOnWriteArraySet) this.B;
                e7.m mVar2 = (e7.m) this.D;
                for (e7.o oVar : copyOnWriteArraySet) {
                    if (!oVar.f5155d) {
                        int i10 = this.C;
                        if (i10 != -1) {
                            oVar.f5153b.d(i10);
                        }
                        oVar.f5154c = true;
                        mVar2.invoke(oVar.f5152a);
                    }
                }
                break;
            case 3:
                y0 y0Var = (y0) this.B;
                Pair pair = (Pair) this.D;
                ((j7.f) y0Var.B.f7231i).B(((Integer) pair.first).intValue(), (s7.a0) pair.second, this.C);
                break;
            case 4:
                t0 t0Var = (t0) this.B;
                kh.v vVar = (kh.v) this.D;
                int i11 = this.C;
                try {
                    d4Var = (d4) vVar.get();
                    ta.c0.w(d4Var, "SessionResult must not be null");
                } catch (InterruptedException | ExecutionException e3) {
                    e7.a.n("MCImplBase", "Session operation failed", e3);
                    d4Var = new d4(-1);
                } catch (CancellationException e10) {
                    e7.a.n("MCImplBase", "Session operation cancelled", e10);
                    d4Var = new d4(1);
                }
                k9.m mVar3 = t0Var.E;
                if (mVar3 != null) {
                    try {
                        mVar3.w(t0Var.f9440c, i11, d4Var.b());
                    } catch (RemoteException unused) {
                        e7.a.m("MCImplBase", "Error in sending");
                        return;
                    }
                    break;
                }
                break;
            case 5:
                n7.h hVar = (n7.h) this.B;
                this.D.B(hVar.f11168a, hVar.f11169b, this.C);
                break;
            default:
                ((z9.b) ((k7.z) this.B).f9188c).i(this.C, this.D);
                break;
        }
    }
}
