package u4;

import a40.k;
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import ri.t1;

public final class c extends AtomicBoolean implements OutcomeReceiver {
    public final k A;

    public c(k kVar) {
        super(false);
        this.A = kVar;
    }

    @Override
    public final void onError(Throwable th2) {
        if (compareAndSet(false, true)) {
            this.A.resumeWith(t1.s(th2));
        }
    }

    @Override
    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.A.resumeWith(obj);
        }
    }

    @Override
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
