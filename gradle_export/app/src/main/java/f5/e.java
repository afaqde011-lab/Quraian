package f5;

import android.os.CancellationSignal;
import g00.b0;

public final class e extends kotlin.jvm.internal.n implements u00.k {
    public final int A;
    public final CancellationSignal B;

    public e(CancellationSignal cancellationSignal, int i10) {
        super(1);
        this.A = i10;
        this.B = cancellationSignal;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                this.B.cancel();
                break;
            default:
                if (((Throwable) obj) != null) {
                    this.B.cancel();
                }
                break;
        }
        return b0.a;
    }
}
