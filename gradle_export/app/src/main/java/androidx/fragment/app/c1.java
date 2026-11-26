package androidx.fragment.app;

public final class c1 implements n1 {
    public final j0 A;

    public c1(j0 j0Var) {
        this.A = j0Var;
    }

    @Override
    public final void a(j0 j0Var) {
        this.A.onAttachFragment(j0Var);
    }
}
