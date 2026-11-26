package d;

import android.window.OnBackInvokedDispatcher;

public final class e implements androidx.lifecycle.u {
    public final int A;
    public final Object B;
    public final Object C;

    public e(Object obj, Object obj2, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
    }

    @Override
    public final void a(androidx.lifecycle.w wVar, androidx.lifecycle.o oVar) {
        switch (this.A) {
            case 0:
                e0 e0Var = (e0) this.B;
                n nVar = (n) this.C;
                if (oVar == androidx.lifecycle.o.ON_CREATE) {
                    OnBackInvokedDispatcher onBackInvokedDispatcher = nVar.getOnBackInvokedDispatcher();
                    kotlin.jvm.internal.m.d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
                    e0Var.c(onBackInvokedDispatcher);
                }
                break;
            default:
                z4.m mVar = (z4.m) this.B;
                z4.n nVar2 = (z4.n) this.C;
                mVar.getClass();
                if (oVar == androidx.lifecycle.o.ON_DESTROY) {
                    mVar.b(nVar2);
                }
                break;
        }
    }
}
