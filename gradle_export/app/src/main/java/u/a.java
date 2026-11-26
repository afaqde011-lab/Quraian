package u;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a implements Iterator, v00.a {
    public int A;
    public int B;
    public boolean C;
    public final int D;
    public final Object E;

    public a(int i10) {
        this.A = i10;
    }

    public a(e eVar, int i10) {
        this(eVar.C);
        this.D = i10;
        switch (i10) {
            case 1:
                this.E = eVar;
                this(eVar.C);
                break;
            default:
                this.E = eVar;
                break;
        }
    }

    public a(f fVar) {
        this(fVar.C);
        this.D = 2;
        this.E = fVar;
    }

    @Override
    public final boolean hasNext() {
        return this.B < this.A;
    }

    @Override
    public final Object next() {
        Object objG;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.B;
        switch (this.D) {
            case 0:
                objG = ((e) this.E).g(i10);
                break;
            case 1:
                objG = ((e) this.E).j(i10);
                break;
            default:
                objG = ((f) this.E).B[i10];
                break;
        }
        this.B++;
        this.C = true;
        return objG;
    }

    @Override
    public final void remove() {
        if (!this.C) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i10 = this.B - 1;
        this.B = i10;
        switch (this.D) {
            case 0:
                ((e) this.E).h(i10);
                break;
            case 1:
                ((e) this.E).h(i10);
                break;
            default:
                ((f) this.E).a(i10);
                break;
        }
        this.A--;
        this.C = false;
    }
}
