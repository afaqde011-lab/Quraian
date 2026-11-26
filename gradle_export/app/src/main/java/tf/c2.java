package tf;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class c2 implements Runnable {
    public final int A;
    public final AtomicReference B;
    public final i2 C;

    public c2(i2 i2Var, AtomicReference atomicReference, int i10) {
        this.A = i10;
        switch (i10) {
            case 1:
                this.B = atomicReference;
                Objects.requireNonNull(i2Var);
                this.C = i2Var;
                break;
            case 2:
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

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                AtomicReference atomicReference = this.B;
                synchronized (atomicReference) {
                    try {
                        try {
                            h1 h1Var = (h1) this.C.B;
                            atomicReference.set(Boolean.valueOf(h1Var.D.f1(h1Var.l().b1(), b0.f14546a0)));
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
                            atomicReference2.set(h1Var2.D.b1(h1Var2.l().b1(), b0.f14549b0));
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
            default:
                AtomicReference atomicReference3 = this.B;
                synchronized (atomicReference3) {
                    try {
                        try {
                            h1 h1Var3 = (h1) this.C.B;
                            atomicReference3.set(Integer.valueOf(h1Var3.D.d1(h1Var3.l().b1(), b0.f14555d0)));
                            this.B.notify();
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    } catch (Throwable th7) {
                        this.B.notify();
                        throw th7;
                    }
                }
                return;
        }
    }
}
