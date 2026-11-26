package a40;

import java.util.concurrent.ScheduledFuture;

public final class h implements i {
    public final int A;
    public final Object B;

    public h(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override
    public final void a(Throwable th) {
        switch (this.A) {
            case 0:
                ((ScheduledFuture) this.B).cancel(false);
                break;
            case 1:
                ((u00.k) this.B).invoke(th);
                break;
            default:
                ((o0) this.B).dispose();
                break;
        }
    }

    public final String toString() {
        switch (this.A) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.B) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((u00.k) this.B).getClass().getSimpleName() + '@' + c0.q(this) + ']';
            default:
                return "DisposeOnCancel[" + ((o0) this.B) + ']';
        }
    }
}
