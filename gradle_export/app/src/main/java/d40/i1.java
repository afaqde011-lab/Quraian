package d40;

import bt.a2;
import d0.i2;

public final class i1 implements h1 {
    public final int a;

    @Override
    public final i a(e40.u uVar) {
        switch (this.a) {
            case 0:
                return new a2(f1.A, 1);
            default:
                return new a2(new i2(uVar, (k00.c) null, 4));
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "SharingStarted.Eagerly";
            default:
                return "SharingStarted.Lazily";
        }
    }
}
