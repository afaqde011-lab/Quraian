package a1;

import java.util.function.IntConsumer;

public final class p implements Runnable {
    public final int A;
    public final IntConsumer B;
    public final int C;

    public p(IntConsumer intConsumer, int i10, int i11) {
        this.A = i11;
        this.B = intConsumer;
        this.C = i10;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                this.B.accept(this.C);
                break;
            default:
                this.B.accept(this.C);
                break;
        }
    }
}
