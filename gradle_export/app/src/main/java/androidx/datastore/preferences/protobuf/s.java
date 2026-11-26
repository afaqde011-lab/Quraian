package androidx.datastore.preferences.protobuf;

public final class s implements j0 {

    public static final s f675b = new s(0);

    public final int f676a;

    public s(int i10) {
        this.f676a = i10;
    }

    @Override
    public final boolean isSupported(Class cls) {
        switch (this.f676a) {
            case 0:
                return v.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override
    public final t0 messageInfoFor(Class cls) {
        switch (this.f676a) {
            case 0:
                if (!v.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (t0) v.d(cls.asSubclass(v.class)).c(3);
                } catch (Exception e3) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e3);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
