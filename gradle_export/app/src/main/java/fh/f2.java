package fh;

import java.util.Map;

public final class f2 extends e1 {
    public final transient w0 D;
    public final transient Object[] E;
    public final transient int F;
    public final transient int G;

    public f2(w0 w0Var, Object[] objArr, int i10, int i11) {
        this.D = w0Var;
        this.E = objArr;
        this.F = i10;
        this.G = i11;
    }

    @Override
    public final int b(int i10, Object[] objArr) {
        return a().b(i10, objArr);
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.D.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final s2 iterator() {
        return a().listIterator(0);
    }

    @Override
    public final t0 o() {
        return new e2(this);
    }

    @Override
    public final int size() {
        return this.G;
    }
}
