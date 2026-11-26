package k9;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Task;
import java.util.List;

public final class l0 implements p0, xf.a {
    public final int A;
    public final Object B;
    public final boolean C;
    public final Object D;

    public l0(int i10, Object obj, Object obj2, boolean z10) {
        this.A = i10;
        this.B = obj;
        this.D = obj2;
        this.C = z10;
    }

    @Override
    public Object M(Task task) {
        return ((Integer) task.k()).intValue() != 402 ? task : oj.h.a((Context) this.B, (Intent) this.D, this.C).h(new f5.d(0), new b3(26));
    }

    @Override
    public void b(m mVar, int i10) {
        switch (this.A) {
            case 0:
                t0 t0Var = (t0) this.B;
                List list = (List) this.D;
                d1 d1Var = t0Var.f9440c;
                fh.q0 q0VarM = fh.t0.m();
                for (int i11 = 0; i11 < list.size(); i11++) {
                    q0VarM.c(((androidx.media3.common.q0) list.get(i11)).c(true));
                }
                mVar.p1(d1Var, i10, new androidx.media3.common.g(q0VarM.g()), this.C);
                break;
            case 1:
                mVar.z0(((t0) this.B).f9440c, i10, ((androidx.media3.common.q0) this.D).c(true), this.C);
                break;
            default:
                mVar.r(((t0) this.B).f9440c, i10, ((androidx.media3.common.d) this.D).c(), this.C);
                break;
        }
    }
}
