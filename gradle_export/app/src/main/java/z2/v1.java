package z2;

public final class v1 {

    public final x1 f17164a;

    public q0 f17165b;

    public final u1 f17166c = new u1(this, 2);

    public final u1 f17167d = new u1(this, 0);

    public final u1 f17168e = new u1(this, 1);

    public v1(x1 x1Var) {
        this.f17164a = x1Var;
    }

    public final q0 a() {
        q0 q0Var = this.f17165b;
        if (q0Var != null) {
            return q0Var;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
