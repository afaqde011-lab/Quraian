package xf;

import com.google.android.gms.internal.play_billing.r0;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import kh.r;

public final class j implements m, e, d, b {
    public final int A;
    public final Executor B;
    public final a C;
    public final n D;

    public j(Executor executor, a aVar, n nVar, int i10) {
        this.A = i10;
        this.B = executor;
        this.C = aVar;
        this.D = nVar;
    }

    @Override
    public final void a(Task task) {
        switch (this.A) {
            case 0:
                this.B.execute(new r0(24, this, task, false));
                break;
            default:
                this.B.execute(new r(25, this, task, false));
                break;
        }
    }

    @Override
    public void f() {
        this.D.t();
    }

    @Override
    public void onFailure(Exception exc) {
        this.D.s(exc);
    }

    @Override
    public void onSuccess(Object obj) {
        this.D.q(obj);
    }
}
