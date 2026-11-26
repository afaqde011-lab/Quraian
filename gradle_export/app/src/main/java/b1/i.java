package b1;

public final class i implements h0.e, h0.h {

    public final int f1964a;

    public float f1965b;

    public i(int i10) {
        this.f1964a = i10;
        switch (i10) {
            case 2:
                this.f1965b = 0;
                break;
            case 3:
                this.f1965b = 0;
                break;
            case 4:
                this.f1965b = 0;
                break;
            default:
                this.f1965b = 0;
                break;
        }
    }

    public i(int i10, boolean z10) {
        this.f1964a = i10;
    }

    @Override
    public float a() {
        switch (this.f1964a) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return this.f1965b;
    }

    @Override
    public void b(y3.c cVar, int i10, int[] iArr, int[] iArr2) {
        switch (this.f1964a) {
            case 1:
                h0.i.a(i10, iArr, iArr2, false);
                break;
            case 2:
                h0.i.d(i10, iArr, iArr2, false);
                break;
            case 3:
                h0.i.e(i10, iArr, iArr2, false);
                break;
            default:
                h0.i.f(i10, iArr, iArr2, false);
                break;
        }
    }

    @Override
    public void c(y3.c cVar, int i10, int[] iArr, y3.m mVar, int[] iArr2) {
        switch (this.f1964a) {
            case 1:
                if (mVar != y3.m.A) {
                    h0.i.a(i10, iArr, iArr2, true);
                } else {
                    h0.i.a(i10, iArr, iArr2, false);
                }
                break;
            case 2:
                if (mVar != y3.m.A) {
                    h0.i.d(i10, iArr, iArr2, true);
                } else {
                    h0.i.d(i10, iArr, iArr2, false);
                }
                break;
            case 3:
                if (mVar != y3.m.A) {
                    h0.i.e(i10, iArr, iArr2, true);
                } else {
                    h0.i.e(i10, iArr, iArr2, false);
                }
                break;
            default:
                if (mVar != y3.m.A) {
                    h0.i.f(i10, iArr, iArr2, true);
                } else {
                    h0.i.f(i10, iArr, iArr2, false);
                }
                break;
        }
    }

    public String toString() {
        switch (this.f1964a) {
            case 1:
                return "Arrangement#Center";
            case 2:
                return "Arrangement#SpaceAround";
            case 3:
                return "Arrangement#SpaceBetween";
            case 4:
                return "Arrangement#SpaceEvenly";
            default:
                return super.toString();
        }
    }
}
