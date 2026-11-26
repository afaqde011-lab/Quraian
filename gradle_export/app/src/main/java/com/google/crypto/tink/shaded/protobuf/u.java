package com.google.crypto.tink.shaded.protobuf;

public final class u implements o0 {

    public static final u f4329b = new u(0);

    public final int f4330a;

    public u(int i10) {
        this.f4330a = i10;
    }

    @Override
    public final boolean isSupported(Class cls) {
        switch (this.f4330a) {
            case 0:
                return x.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override
    public final z0 messageInfoFor(Class cls) {
        switch (this.f4330a) {
            case 0:
                if (!x.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (z0) x.i(cls.asSubclass(x.class)).h(3);
                } catch (Exception e3) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e3);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
