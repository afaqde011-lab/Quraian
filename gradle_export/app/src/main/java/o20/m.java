package o20;

public final class m implements Comparable {
    public final int A;
    public final l0 B;
    public final boolean C;

    public m(int i, l0 l0Var, boolean z) {
        this.A = i;
        this.B = l0Var;
        this.C = z;
    }

    @Override
    public final int compareTo(Object obj) {
        return this.A - ((m) obj).A;
    }
}
