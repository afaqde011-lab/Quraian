package h40;

import a40.v;

public final class e extends h {
    public static final e D;

    static {
        int i = k.c;
        int i2 = k.d;
        long j = k.e;
        String str = k.a;
        e eVar = new e();
        eVar.C = new c(j, i, i2, str);
        D = eVar;
    }

    @Override
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override
    public final v q0(int i) {
        f40.a.a(1);
        return 1 >= k.c ? this : super.q0(1);
    }

    @Override
    public final String toString() {
        return "Dispatchers.Default";
    }
}
