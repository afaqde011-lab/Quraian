package tf;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class e2 implements Runnable {
    public final int A;
    public final AtomicReference B;
    public final i2 C;

    public e2(i2 i2Var, AtomicReference atomicReference, int i10) {
        this.A = i10;
        switch (i10) {
            case 1:
                this.B = atomicReference;
                Objects.requireNonNull(i2Var);
                this.C = i2Var;
                break;
            default:
                this.B = atomicReference;
                Objects.requireNonNull(i2Var);
                this.C = i2Var;
                break;
        }
    }

    public e2(i2 i2Var, AtomicReference atomicReference, int i10, boolean z10) {
        this.A = i10;
        this.C = i2Var;
        this.B = atomicReference;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                AtomicReference atomicReference = this.B;
                synchronized (atomicReference) {
                    try {
                        try {
                            h1 h1Var = (h1) this.C.B;
                            atomicReference.set(Long.valueOf(h1Var.D.c1(h1Var.l().b1(), b0.f14552c0)));
                            this.B.notify();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        this.B.notify();
                        throw th3;
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.B;
                synchronized (atomicReference2) {
                    try {
                        try {
                            h1 h1Var2 = (h1) this.C.B;
                            atomicReference2.set(Double.valueOf(h1Var2.D.e1(h1Var2.l().b1(), b0.f14558e0)));
                            this.B.notify();
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        this.B.notify();
                        throw th5;
                    }
                }
                return;
            case 2:
                i2 i2Var = this.C;
                w0 w0Var = ((h1) i2Var.B).E;
                h1.e(w0Var);
                Bundle bundleF = w0Var.O.F();
                c3 c3VarJ = ((h1) i2Var.B).j();
                AtomicReference atomicReference3 = this.B;
                c3VarJ.V0();
                c3VarJ.W0();
                c3VarJ.j1(new com.google.android.gms.internal.cast.r0(c3VarJ, atomicReference3, c3VarJ.l1(false), bundleF, 11));
                return;
            default:
                c3 c3VarJ2 = ((h1) this.C.B).j();
                r3 r3VarA = r3.a(p2.SGTM_CLIENT);
                AtomicReference atomicReference4 = this.B;
                c3VarJ2.V0();
                c3VarJ2.W0();
                c3VarJ2.j1(new com.google.android.gms.internal.cast.r0(c3VarJ2, atomicReference4, c3VarJ2.l1(false), r3VarA, 12));
                return;
        }
    }
}
