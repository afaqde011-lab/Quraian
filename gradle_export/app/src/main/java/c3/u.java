package c3;

import android.os.Handler;
import android.os.Looper;

public final class u extends kotlin.jvm.internal.n implements u00.k {
    public final int A;
    public final z B;

    public u(z zVar, int i10) {
        super(1);
        this.A = i10;
        this.B = zVar;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                ((g2.n) this.B.getFocusOwner()).h(((g2.f) obj).f6063a, false);
                return g00.b0.a;
            case 1:
                u00.a aVar = (u00.a) obj;
                z zVar = this.B;
                zVar.getUncaughtExceptionHandler$ui();
                Handler handler = zVar.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.invoke();
                } else {
                    Handler handler2 = zVar.getHandler();
                    if (handler2 != null) {
                        handler2.post(new b4.a(3, aVar));
                    }
                }
                return g00.b0.a;
            default:
                z zVar2 = this.B;
                return new q0(zVar2, zVar2.getTextInputService(), (a40.z) obj);
        }
    }
}
