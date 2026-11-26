package f40;

import kotlin.jvm.internal.a0;
import l1.p2;

public final class h extends kotlin.jvm.internal.u implements a10.r {
    public final int B;

    public h(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.B = i2;
    }

    @Override
    public final a10.q b() {
        return ((a10.r) getReflected()).b();
    }

    @Override
    public final a10.c computeReflected() {
        return a0.a.g(this);
    }

    @Override
    public final Object get() {
        switch (this.B) {
            case 0:
                return this.receiver.getClass().getSimpleName();
            case 1:
                return ((p2) this.receiver).getValue();
            case 2:
                return ((p2) this.receiver).getValue();
            case 3:
                return ((p2) this.receiver).getValue();
            case 4:
                return ((p2) this.receiver).getValue();
            default:
                return ((p2) this.receiver).getValue();
        }
    }

    @Override
    public final Object invoke() {
        return get();
    }
}
