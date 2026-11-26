package androidx.datastore.preferences.protobuf;

public final class c0 implements j0 {

    public j0[] f596a;

    @Override
    public final boolean isSupported(Class cls) {
        for (j0 j0Var : this.f596a) {
            if (j0Var.isSupported(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final t0 messageInfoFor(Class cls) {
        for (j0 j0Var : this.f596a) {
            if (j0Var.isSupported(cls)) {
                return j0Var.messageInfoFor(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
