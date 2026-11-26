package i7;

public final class f0 implements Comparable {
    public final f1 A;
    public int B;
    public long C;
    public Object D;

    public f0(f1 f1Var) {
        this.A = f1Var;
    }

    @Override
    public final int compareTo(Object obj) {
        f0 f0Var = (f0) obj;
        Object obj2 = this.D;
        if ((obj2 == null) != (f0Var.D == null)) {
            return obj2 != null ? -1 : 1;
        }
        if (obj2 == null) {
            return 0;
        }
        int i10 = this.B - f0Var.B;
        return i10 != 0 ? i10 : Long.compare(this.C, f0Var.C);
    }
}
