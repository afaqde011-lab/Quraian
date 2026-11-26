package fh;

public final class i1 extends a {
    public static final i1 D = new i1(new Object[0]);
    public final Object[] C;

    public i1(Object[] objArr) {
        super(objArr.length, 0);
        this.C = objArr;
    }

    @Override
    public final Object a(int i10) {
        return this.C[i10];
    }
}
