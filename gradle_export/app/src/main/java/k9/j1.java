package k9;

import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public final class j1 implements Runnable {
    public final int A;
    public final kh.b0 B;
    public final l9.q C;

    public j1(kh.b0 b0Var, l9.q qVar, int i10) {
        this.A = i10;
        this.B = b0Var;
        this.C = qVar;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                kh.b0 b0Var = this.B;
                l9.q qVar = this.C;
                try {
                    qVar.f((l9.g) b0Var.get());
                } catch (InterruptedException | CancellationException | ExecutionException e3) {
                    e7.a.n("MLSLegacyStub", "Library operation failed", e3);
                    qVar.f(null);
                    return;
                }
                break;
            default:
                kh.b0 b0Var2 = this.B;
                l9.q qVar2 = this.C;
                try {
                    List list = (List) b0Var2.get();
                    qVar2.f(list == null ? null : q3.g(list));
                } catch (InterruptedException | CancellationException | ExecutionException e10) {
                    e7.a.n("MLSLegacyStub", "Library operation failed", e10);
                    qVar2.f(null);
                }
                break;
        }
    }
}
