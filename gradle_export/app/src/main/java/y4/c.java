package y4;

import e4.d;

public final class c extends d {

    public final Object f16605c;

    public c() {
        super(12);
        this.f16605c = new Object();
    }

    @Override
    public final Object a() {
        Object objA;
        synchronized (this.f16605c) {
            objA = super.a();
        }
        return objA;
    }

    @Override
    public final boolean c(Object obj) {
        boolean zC;
        synchronized (this.f16605c) {
            zC = super.c(obj);
        }
        return zC;
    }
}
