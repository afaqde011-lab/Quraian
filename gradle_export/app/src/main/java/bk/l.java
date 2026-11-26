package bk;

public class l extends ek.x {

    public a0 f2557a = null;

    @Override
    public final Object b(ik.a aVar) {
        a0 a0Var = this.f2557a;
        if (a0Var != null) {
            return a0Var.b(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override
    public final void c(ik.b bVar, Object obj) {
        a0 a0Var = this.f2557a;
        if (a0Var == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        a0Var.c(bVar, obj);
    }

    @Override
    public final a0 d() {
        a0 a0Var = this.f2557a;
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
