package androidx.mediarouter.app;

public final class z {

    public final Object f1838a;

    public final int f1839b;

    public z(Object obj) {
        this.f1838a = obj;
        if (obj instanceof String) {
            this.f1839b = 1;
        } else {
            if (!(obj instanceof o9.b0)) {
                throw new IllegalArgumentException();
            }
            this.f1839b = 2;
        }
    }
}
