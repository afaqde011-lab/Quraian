package androidx.lifecycle;

public abstract class d0 {
    public final g0 A;
    public boolean B;
    public int C = -1;
    public final e0 D;

    public d0(e0 e0Var, g0 g0Var) {
        this.D = e0Var;
        this.A = g0Var;
    }

    public final void b(boolean z10) {
        if (z10 == this.B) {
            return;
        }
        this.B = z10;
        int i10 = z10 ? 1 : -1;
        e0 e0Var = this.D;
        int i11 = e0Var.f990c;
        e0Var.f990c = i10 + i11;
        if (!e0Var.f991d) {
            e0Var.f991d = true;
            while (true) {
                try {
                    int i12 = e0Var.f990c;
                    if (i11 == i12) {
                        break;
                    }
                    boolean z11 = i11 == 0 && i12 > 0;
                    boolean z12 = i11 > 0 && i12 == 0;
                    if (z11) {
                        e0Var.e();
                    } else if (z12) {
                        e0Var.f();
                    }
                    i11 = i12;
                } catch (Throwable th2) {
                    e0Var.f991d = false;
                    throw th2;
                }
            }
            e0Var.f991d = false;
        }
        if (this.B) {
            e0Var.c(this);
        }
    }

    public void c() {
    }

    public boolean d(w wVar) {
        return false;
    }

    public abstract boolean e();
}
