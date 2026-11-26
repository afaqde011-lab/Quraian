package androidx.glance.appwidget.protobuf;

public final class j0 implements o0 {

    public o0[] f906a;

    @Override
    public final boolean isSupported(Class cls) {
        for (o0 o0Var : this.f906a) {
            if (o0Var.isSupported(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final y0 messageInfoFor(Class cls) {
        for (o0 o0Var : this.f906a) {
            if (o0Var.isSupported(cls)) {
                return o0Var.messageInfoFor(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
