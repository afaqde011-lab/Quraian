package j10;

public final class o0 implements y20.d, n0 {
    public static final o0 B = new o0(0);
    public static final o0 C = new o0(1);
    public final int A;

    public o0(int i) {
        this.A = i;
    }

    @Override
    public e30.w getType() {
        switch (this.A) {
            case 2:
                throw new IllegalStateException("This method should not be called");
            case 3:
                throw new IllegalStateException("This method should not be called");
            default:
                throw new IllegalStateException("This method should not be called");
        }
    }

    public String toString() {
        switch (this.A) {
            case 7:
                return "NO_SOURCE";
            default:
                return super.toString();
        }
    }
}
