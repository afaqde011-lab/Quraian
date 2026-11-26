package z;

import androidx.compose.foundation.MutationInterruptedException;
import c3.o3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

public final class e1 {

    public final AtomicReference f16911a = new AtomicReference(null);

    public final j40.c f16912b = j40.d.a();

    public static final void a(e1 e1Var, c1 c1Var) {
        c1 c1Var2;
        AtomicReference atomicReference = e1Var.f16911a;
        do {
            c1Var2 = (c1) atomicReference.get();
            if (c1Var2 != null && c1Var.f16898a.compareTo(c1Var2.f16898a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
        } while (!atomicReference.compareAndSet(c1Var2, c1Var));
        if (c1Var2 != null) {
            c1Var2.f16899b.i(new MutationInterruptedException());
        }
    }

    public static Object b(e1 e1Var, u00.k kVar, m00.i iVar) {
        b1 b1Var = b1.A;
        e1Var.getClass();
        return a40.c0.k(new o3(b1Var, e1Var, kVar, (k00.c) null), iVar);
    }
}
