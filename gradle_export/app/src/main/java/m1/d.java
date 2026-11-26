package m1;

import java.util.List;
import java.util.ListIterator;

public final class d implements ListIterator, v00.a {
    public final int A;
    public final Object B;
    public int C;

    public d(int i10, int i11, List list) {
        this.A = i11;
        switch (i11) {
            case 1:
                this.B = list;
                this.C = i10 - 1;
                break;
            default:
                this.B = list;
                this.C = i10;
                break;
        }
    }

    @Override
    public final void add(Object obj) {
        switch (this.A) {
            case 0:
                this.B.add(this.C, obj);
                this.C++;
                break;
            default:
                int i10 = this.C + 1;
                this.C = i10;
                this.B.add(i10, obj);
                break;
        }
    }

    @Override
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                return this.C < this.B.size();
            default:
                return this.C < this.B.size() - 1;
        }
    }

    @Override
    public final boolean hasPrevious() {
        switch (this.A) {
            case 0:
                return this.C > 0;
            default:
                return this.C >= 0;
        }
    }

    @Override
    public final Object next() {
        switch (this.A) {
            case 0:
                int i10 = this.C;
                this.C = i10 + 1;
                return this.B.get(i10);
            default:
                int i11 = this.C + 1;
                this.C = i11;
                return this.B.get(i11);
        }
    }

    @Override
    public final int nextIndex() {
        switch (this.A) {
            case 0:
                return this.C;
            default:
                return this.C + 1;
        }
    }

    @Override
    public final Object previous() {
        switch (this.A) {
            case 0:
                int i10 = this.C - 1;
                this.C = i10;
                return this.B.get(i10);
            default:
                int i11 = this.C;
                this.C = i11 - 1;
                return this.B.get(i11);
        }
    }

    @Override
    public final int previousIndex() {
        switch (this.A) {
            case 0:
                return this.C - 1;
            default:
                return this.C;
        }
    }

    @Override
    public final void remove() {
        switch (this.A) {
            case 0:
                int i10 = this.C - 1;
                this.C = i10;
                this.B.remove(i10);
                break;
            default:
                this.B.remove(this.C);
                this.C--;
                break;
        }
    }

    @Override
    public final void set(Object obj) {
        switch (this.A) {
            case 0:
                this.B.set(this.C, obj);
                break;
            default:
                this.B.set(this.C, obj);
                break;
        }
    }
}
