package i7;

public final class k implements eh.x {
    public final int A;
    public final Object B;

    public k(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    @Override
    public final Object get() {
        int i10 = this.A;
        Object obj = this.B;
        switch (i10) {
            case 0:
                return (g) obj;
            case 1:
                return (i) obj;
            default:
                try {
                    return (s7.z) ((Class) obj).getConstructor(null).newInstance(null);
                } catch (Exception e3) {
                    throw new IllegalStateException(e3);
                }
        }
    }
}
