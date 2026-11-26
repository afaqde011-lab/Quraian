package c4;

import android.os.Handler;
import android.os.Looper;

public final class j extends kotlin.jvm.internal.n implements u00.k {
    public final int A;
    public final z B;

    public j(z zVar, int i10) {
        super(1);
        this.A = i10;
        this.B = zVar;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                z2.a0 a0VarW = ((z2.a0) obj).W();
                kotlin.jvm.internal.m.b(a0VarW);
                this.B.p(a0VarW);
                break;
            case 1:
                y3.l lVar = new y3.l(((y3.l) obj).f16596a);
                z zVar = this.B;
                zVar.m22setPopupContentSizefhxjrPA(lVar);
                zVar.q();
                break;
            default:
                u00.a aVar = (u00.a) obj;
                z zVar2 = this.B;
                Handler handler = zVar2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.invoke();
                } else {
                    Handler handler2 = zVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new b4.a(4, aVar));
                    }
                }
                break;
        }
        return g00.b0.a;
    }
}
