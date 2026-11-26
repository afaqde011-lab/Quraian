package v30;

import java.util.NoSuchElementException;

public final class b extends r1.a {
    public final int D = 1;
    public final Object E;

    public b(Object obj, int i) {
        super(i, 1, 1);
        this.E = obj;
    }

    public b(Object[] objArr, int i, int i2) {
        super(i, i2, 1);
        this.E = objArr;
    }

    public final Object next() {
        switch (this.D) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.E;
                int i = ((r1.a) this).B;
                ((r1.a) this).B = i + 1;
                return objArr[i];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                ((r1.a) this).B++;
                return this.E;
        }
    }

    public final Object previous() {
        switch (this.D) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.E;
                int i = ((r1.a) this).B - 1;
                ((r1.a) this).B = i;
                return objArr[i];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                ((r1.a) this).B--;
                return this.E;
        }
    }
}
