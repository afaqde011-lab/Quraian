package d6;

public final class u1 implements u00.k {
    public static final u1 B = new u1(0);
    public static final u1 C = new u1(1);
    public static final u1 D = new u1(2);
    public final int A;

    public u1(int i10) {
        this.A = i10;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                return Boolean.valueOf(((b6.l) obj) instanceof c6.b);
            case 1:
                return Boolean.valueOf(((b6.l) obj) instanceof b6.c);
            default:
                return Boolean.valueOf(((b6.l) obj) instanceof c6.b);
        }
    }
}
