package androidx.glance.appwidget.protobuf;

public final class w implements o0 {

    public static final w f959b = new w(0);

    public final int f960a;

    public w(int i10) {
        this.f960a = i10;
    }

    @Override
    public final boolean isSupported(Class cls) {
        switch (this.f960a) {
            case 0:
                return z.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override
    public final y0 messageInfoFor(Class cls) {
        switch (this.f960a) {
            case 0:
                if (!z.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (y0) z.e(cls.asSubclass(z.class)).d(3);
                } catch (Exception e3) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e3);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
