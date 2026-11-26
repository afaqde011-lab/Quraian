package za;

import java.util.concurrent.atomic.AtomicBoolean;

public final class o implements Runnable {
    public final int A;
    public final AtomicBoolean B;

    public o(AtomicBoolean atomicBoolean, int i10) {
        this.A = i10;
        this.B = atomicBoolean;
    }

    @Override
    public final void run() {
        int i10 = this.A;
        AtomicBoolean atomicBoolean = this.B;
        switch (i10) {
            case 0:
                atomicBoolean.set(true);
                break;
            default:
                atomicBoolean.set(true);
                break;
        }
    }
}
