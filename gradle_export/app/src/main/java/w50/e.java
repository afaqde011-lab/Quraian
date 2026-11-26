package w50;

import sd.y1;

public final class e extends b {
    public volatile Object b;

    @Override
    public final Object a(y1 y1Var) {
        if (this.b == null) {
            return super.a(y1Var);
        }
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }

    @Override
    public final Object b(y1 y1Var) {
        if (this.b == null) {
            synchronized (this) {
                if (!(this.b != null)) {
                    this.b = a(y1Var);
                }
            }
        }
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }
}
