package r1;

import java.util.NoSuchElementException;

public final class d extends a {
    public final int D = 1;
    public final Object E;

    public d(Object obj, int i10) {
        super(i10, 1, 0);
        this.E = obj;
    }

    public d(Object[] objArr, int i10, int i11) {
        super(i10, i11, 0);
        this.E = objArr;
    }

    @Override
    public final Object next() {
        switch (this.D) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.E;
                int i10 = this.B;
                this.B = i10 + 1;
                return objArr[i10];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.B++;
                return this.E;
        }
    }

    @Override
    public final Object previous() {
        switch (this.D) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.E;
                int i10 = this.B - 1;
                this.B = i10;
                return objArr[i10];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.B--;
                return this.E;
        }
    }
}
