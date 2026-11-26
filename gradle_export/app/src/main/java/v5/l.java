package v5;

public final class l implements k {
    public final int A;
    public int B = -1;
    public int C = -1;

    public l(int i10) {
        this.A = i10;
    }

    @Override
    public final Object a() {
        return this;
    }

    @Override
    public final boolean c(CharSequence charSequence, int i10, int i11, r rVar) {
        int i12 = this.A;
        if (i10 > i12 || i12 >= i11) {
            return i11 <= i12;
        }
        this.B = i10;
        this.C = i11;
        return false;
    }
}
