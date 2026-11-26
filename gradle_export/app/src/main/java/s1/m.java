package s1;

public final class m extends l {
    public final int E;

    public m(int i10) {
        super(0);
        this.E = i10;
    }

    @Override
    public final Object next() {
        switch (this.E) {
            case 0:
                int i10 = this.D;
                this.D = i10 + 2;
                Object[] objArr = this.B;
                return new a(objArr[i10], objArr[i10 + 1], 0);
            case 1:
                int i11 = this.D;
                this.D = i11 + 2;
                return this.B[i11];
            default:
                int i12 = this.D;
                this.D = i12 + 2;
                return this.B[i12 + 1];
        }
    }
}
