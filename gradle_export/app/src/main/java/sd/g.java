package sd;

public final class g implements e {

    public final int f13985a;

    @Override
    public final boolean a(w0 w0Var) {
        switch (this.f13985a) {
            case 0:
                return !(w0Var instanceof u0) || ((u0) w0Var).a().size() == 0;
            case 1:
                return w0Var.f14130b == null;
            default:
                return false;
        }
    }

    public final String toString() {
        switch (this.f13985a) {
            case 0:
                return "empty";
            case 1:
                return "root";
            default:
                return "target";
        }
    }
}
