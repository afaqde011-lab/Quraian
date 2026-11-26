package fh;

import java.io.Serializable;

public final class p0 extends q implements Serializable {
    public final Object A;
    public final Object B;

    public p0(Object obj, Object obj2) {
        this.A = obj;
        this.B = obj2;
    }

    @Override
    public final Object getKey() {
        return this.A;
    }

    @Override
    public final Object getValue() {
        return this.B;
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
