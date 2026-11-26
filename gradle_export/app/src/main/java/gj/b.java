package gj;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import ii.p;
import java.util.concurrent.Executor;
import sd.y1;

public final class b implements ii.e {
    public final int A;
    public final p B;

    public b(p pVar, int i10) {
        this.A = i10;
        this.B = pVar;
    }

    @Override
    public final Object m(y1 y1Var) {
        switch (this.A) {
            case 0:
                return new d((Context) y1Var.a(Context.class), ((bi.g) y1Var.a(bi.g.class)).d(), y1Var.f(p.a(e.class)), y1Var.d(qj.b.class), (Executor) y1Var.g(this.B));
            case 1:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(this.B, y1Var);
            default:
                return RemoteConfigRegistrar.lambda$getComponents$0(this.B, y1Var);
        }
    }
}
