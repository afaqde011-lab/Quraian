package h0;

public final class d implements h {

    public final int f6395a;

    @Override
    public final void b(y3.c cVar, int i10, int[] iArr, int[] iArr2) {
        switch (this.f6395a) {
            case 0:
                i.c(i10, iArr, iArr2, false);
                break;
            default:
                i.b(iArr, iArr2, false);
                break;
        }
    }

    public final String toString() {
        switch (this.f6395a) {
            case 0:
                return "Arrangement#Bottom";
            default:
                return "Arrangement#Top";
        }
    }
}
