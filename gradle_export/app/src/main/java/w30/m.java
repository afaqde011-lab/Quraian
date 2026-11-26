package w30;

public final class m extends s1.l {
    public final n30.g E;

    public m(n30.g gVar) {
        super(1);
        this.E = gVar;
    }

    public final Object next() {
        int i = ((s1.l) this).D;
        ((s1.l) this).D = i + 2;
        Object[] objArr = ((s1.l) this).B;
        return new a(this.E, objArr[i], objArr[i + 1]);
    }
}
