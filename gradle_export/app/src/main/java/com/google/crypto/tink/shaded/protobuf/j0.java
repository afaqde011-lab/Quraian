package com.google.crypto.tink.shaded.protobuf;

public final class j0 implements o0 {

    public o0[] f4272a;

    @Override
    public final boolean isSupported(Class cls) {
        for (o0 o0Var : this.f4272a) {
            if (o0Var.isSupported(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final z0 messageInfoFor(Class cls) {
        for (o0 o0Var : this.f4272a) {
            if (o0Var.isSupported(cls)) {
                return o0Var.messageInfoFor(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
