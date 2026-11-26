package w30;

public final class l extends s1.l {
    public final int E;

    public l(int i) {
        super(1);
        this.E = i;
    }

    public final Object next() {
        switch (this.E) {
            case 0:
                int i = ((s1.l) this).D;
                ((s1.l) this).D = i + 2;
                Object[] objArr = ((s1.l) this).B;
                return new s1.a(objArr[i], objArr[i + 1], 2);
            case 1:
                int i2 = ((s1.l) this).D;
                ((s1.l) this).D = i2 + 2;
                return ((s1.l) this).B[i2];
            default:
                int i3 = ((s1.l) this).D;
                ((s1.l) this).D = i3 + 2;
                return ((s1.l) this).B[i3 + 1];
        }
    }
}
