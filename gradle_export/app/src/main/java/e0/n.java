package e0;

public final class n implements o {

    public static final n f4951b = new n(0);

    public static final n f4952c = new n(1);

    public final int f4953a;

    public n(int i10) {
        this.f4953a = i10;
    }

    @Override
    public final int b(int i10, int i11, int i12, int i13) {
        switch (this.f4953a) {
            case 0:
                return (((i10 - i12) - i13) / 2) - (i11 / 2);
            default:
                return 0;
        }
    }

    public final String toString() {
        switch (this.f4953a) {
            case 0:
                return "Center";
            default:
                return "Start";
        }
    }
}
