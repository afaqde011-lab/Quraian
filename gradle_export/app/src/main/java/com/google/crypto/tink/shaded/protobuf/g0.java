package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

public final class g0 extends h0 {
    @Override
    public final void a(Object obj, long j9) {
        ((b) ((a0) m1.f4297c.i(obj, j9))).A = false;
    }

    @Override
    public final void b(Object obj, Object obj2, long j9) {
        l1 l1Var = m1.f4297c;
        a0 a0VarMutableCopyWithCapacity = (a0) l1Var.i(obj, j9);
        a0 a0Var = (a0) l1Var.i(obj2, j9);
        int size = a0VarMutableCopyWithCapacity.size();
        int size2 = a0Var.size();
        if (size > 0 && size2 > 0) {
            if (!((b) a0VarMutableCopyWithCapacity).A) {
                a0VarMutableCopyWithCapacity = a0VarMutableCopyWithCapacity.mutableCopyWithCapacity(size2 + size);
            }
            a0VarMutableCopyWithCapacity.addAll(a0Var);
        }
        if (size > 0) {
            a0Var = a0VarMutableCopyWithCapacity;
        }
        m1.p(obj, j9, a0Var);
    }

    @Override
    public final List c(Object obj, long j9) {
        a0 a0Var = (a0) m1.f4297c.i(obj, j9);
        if (((b) a0Var).A) {
            return a0Var;
        }
        int size = a0Var.size();
        a0 a0VarMutableCopyWithCapacity = a0Var.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        m1.p(obj, j9, a0VarMutableCopyWithCapacity);
        return a0VarMutableCopyWithCapacity;
    }
}
