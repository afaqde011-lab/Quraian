package g9;

public final class f implements Comparable {
    public final int A;
    public final b B;

    public f(int i10, b bVar) {
        this.A = i10;
        this.B = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.A, ((f) obj).A);
    }
}
