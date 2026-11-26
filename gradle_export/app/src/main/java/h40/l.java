package h40;

import a40.v;

public final class l extends v {
    public static final l C = new l();

    @Override
    public final void n0(k00.i iVar, Runnable runnable) {
        e.D.C.i(runnable, true, false);
    }

    @Override
    public final void o0(k00.i iVar, Runnable runnable) {
        e.D.C.i(runnable, true, true);
    }

    @Override
    public final v q0(int i) {
        f40.a.a(i);
        return i >= k.d ? this : super.q0(i);
    }

    @Override
    public final String toString() {
        return "Dispatchers.IO";
    }
}
