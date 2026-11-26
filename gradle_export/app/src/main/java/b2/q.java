package b2;

import a40.c0;
import a40.f1;
import a40.z;
import androidx.compose.ui.ModifierNodeDetachedCancellationException;
import b3.k0;
import b3.p1;
import b3.w1;

public abstract class q implements b3.k {
    public f40.c B;
    public int C;
    public q E;
    public q F;
    public w1 G;
    public p1 H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public k0 M;
    public boolean N;
    public q A = this;
    public int D = -1;

    public void A1(p1 p1Var) {
        this.H = p1Var;
    }

    public final z p1() {
        f40.c cVar = this.B;
        if (cVar != null) {
            return cVar;
        }
        f40.c cVarC = c0.c(((c3.z) b3.m.z(this)).getCoroutineContext().plus(new f1(((c3.z) b3.m.z(this)).getCoroutineContext().get(a40.w.B))));
        this.B = cVarC;
        return cVarC;
    }

    public boolean q1() {
        return !(this instanceof z.o);
    }

    public void r1() {
        if (this.N) {
            y2.a.c("node attached multiple times");
        }
        if (this.H == null) {
            y2.a.c("attach invoked on a node without a coordinator");
        }
        this.N = true;
        this.K = true;
    }

    public void s1() {
        if (!this.N) {
            y2.a.c("Cannot detach a node that is not attached");
        }
        if (this.K) {
            y2.a.c("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.L) {
            y2.a.c("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.N = false;
        f40.c cVar = this.B;
        if (cVar != null) {
            c0.i(cVar, new ModifierNodeDetachedCancellationException());
            this.B = null;
        }
    }

    public void t1() {
    }

    public void u1() {
    }

    public void v1() {
    }

    public void w1() {
        if (!this.N) {
            y2.a.c("reset() called on an unattached node");
        }
        v1();
    }

    public void x1() {
        if (!this.N) {
            y2.a.c("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.K) {
            y2.a.c("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.K = false;
        t1();
        this.L = true;
    }

    public void y1() {
        if (!this.N) {
            y2.a.c("node detached multiple times");
        }
        if (this.H == null) {
            y2.a.c("detach invoked on a node without a coordinator");
        }
        if (!this.L) {
            y2.a.c("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.L = false;
        k0 k0Var = this.M;
        if (k0Var != null) {
            k0Var.invoke();
        }
        u1();
    }

    public void z1(q qVar) {
        this.A = qVar;
    }
}
