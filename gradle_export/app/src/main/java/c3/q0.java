package c3;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;

public final class q0 implements a40.z {
    public final View A;
    public final r3.x B;
    public final a40.z C;
    public final AtomicReference D = new AtomicReference(null);

    public q0(View view, r3.x xVar, a40.z zVar) {
        this.A = view;
        this.B = xVar;
        this.C = zVar;
    }

    public final k00.i A() {
        return this.C.A();
    }

    public final void a(m2 m2Var, m00.c cVar) {
        p0 p0Var;
        if (cVar instanceof p0) {
            p0Var = (p0) cVar;
            int i10 = p0Var.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                p0Var.C = i10 - Integer.MIN_VALUE;
            } else {
                p0Var = new p0(this, cVar);
            }
        } else {
            p0Var = new p0(this, cVar);
        }
        Object obj = p0Var.A;
        l00.a aVar = l00.a.A;
        int i11 = p0Var.C;
        if (i11 == 0) {
            ri.t1.O(obj);
            b2.v vVar = new b2.v(m2Var, this, 2);
            a1.d dVar = new a1.d(this, null, 18);
            p0Var.C = 1;
            if (a40.c0.k(new a1.g(vVar, this.D, dVar, (k00.c) null), p0Var) == aVar) {
                return;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(obj);
        }
        throw new KotlinNothingValueException();
    }
}
