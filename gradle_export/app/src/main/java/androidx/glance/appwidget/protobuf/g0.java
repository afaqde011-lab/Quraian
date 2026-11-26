package androidx.glance.appwidget.protobuf;

public final class g0 {
    public static d0 a(Object obj, long j9) {
        d0 d0Var = (d0) i1.f894c.i(obj, j9);
        if (((b) d0Var).A) {
            return d0Var;
        }
        int size = d0Var.size();
        d0 d0VarMutableCopyWithCapacity = d0Var.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        i1.p(obj, j9, d0VarMutableCopyWithCapacity);
        return d0VarMutableCopyWithCapacity;
    }
}
