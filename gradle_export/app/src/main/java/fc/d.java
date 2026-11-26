package fc;

import java.util.List;

public final class d implements b {
    public final pc.a A;
    public float B = -1.0f;

    public d(List list) {
        this.A = (pc.a) list.get(0);
    }

    @Override
    public final boolean c(float f3) {
        if (this.B == f3) {
            return true;
        }
        this.B = f3;
        return false;
    }

    @Override
    public final pc.a d() {
        return this.A;
    }

    @Override
    public final boolean e(float f3) {
        return !this.A.c();
    }

    @Override
    public final float i() {
        return this.A.a();
    }

    @Override
    public final boolean isEmpty() {
        return false;
    }

    @Override
    public final float k() {
        return this.A.b();
    }
}
