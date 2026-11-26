package r1;

import java.util.ListIterator;

public abstract class a implements ListIterator, v00.a {
    public final int A;
    public int B;
    public int C;

    public a(int i10, int i11, int i12) {
        this.A = i12;
        this.B = i10;
        this.C = i11;
    }

    @Override
    public void add(Object obj) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                return this.B < this.C;
            default:
                return this.B < this.C;
        }
    }

    @Override
    public final boolean hasPrevious() {
        switch (this.A) {
            case 0:
                return this.B > 0;
            default:
                return this.B > 0;
        }
    }

    @Override
    public final int nextIndex() {
        switch (this.A) {
            case 0:
                break;
        }
        return this.B;
    }

    @Override
    public final int previousIndex() {
        int i10;
        switch (this.A) {
            case 0:
                i10 = this.B;
                break;
            default:
                i10 = this.B;
                break;
        }
        return i10 - 1;
    }

    @Override
    public void remove() {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override
    public void set(Object obj) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
