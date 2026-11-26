package s1;

public final class n extends l {
    public final n30.g E;

    public n(n30.g gVar) {
        super(0);
        this.E = gVar;
    }

    @Override
    public final Object next() {
        int i10 = this.D;
        this.D = i10 + 2;
        Object[] objArr = this.B;
        return new b(this.E, objArr[i10], objArr[i10 + 1]);
    }
}
