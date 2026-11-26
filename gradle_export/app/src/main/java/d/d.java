package d;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.x0;

public final class d implements u00.a {
    public final int A;
    public final n B;

    public d(n nVar, int i10) {
        this.A = i10;
        this.B = nVar;
    }

    public final Object invoke() {
        switch (this.A) {
            case 0:
                this.B.reportFullyDrawn();
                return g00.b0.a;
            case 1:
                return n.b(this.B);
            case 2:
                s9.a aVar = new s9.a();
                this.B.getNavigationEventDispatcher().b(aVar);
                return aVar;
            case 3:
                n nVar = this.B;
                return new x0(nVar.getApplication(), nVar, nVar.getIntent() != null ? nVar.getIntent().getExtras() : null);
            default:
                n nVar2 = this.B;
                e0 e0Var = new e0(new c(nVar2, 1));
                if (kotlin.jvm.internal.m.a(Looper.myLooper(), Looper.getMainLooper())) {
                    nVar2.getLifecycle().a(new e(e0Var, nVar2, 0));
                } else {
                    new Handler(Looper.getMainLooper()).post(new ab.f(nVar2, e0Var, 9));
                }
                return e0Var;
        }
    }
}
