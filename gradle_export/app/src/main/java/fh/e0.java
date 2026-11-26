package fh;

import java.util.Comparator;

public final class e0 extends g0 {
    public static g0 f(int i10) {
        if (i10 < 0) {
            return g0.f5673b;
        }
        return i10 > 0 ? g0.f5674c : g0.f5672a;
    }

    @Override
    public final g0 a(int i10, int i11) {
        return f(Integer.compare(i10, i11));
    }

    @Override
    public final g0 b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override
    public final g0 c(boolean z10, boolean z11) {
        return f(Boolean.compare(z10, z11));
    }

    @Override
    public final g0 d(boolean z10, boolean z11) {
        return f(Boolean.compare(z11, z10));
    }

    @Override
    public final int e() {
        return 0;
    }
}
