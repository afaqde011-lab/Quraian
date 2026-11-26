package r1;

import java.util.NoSuchElementException;

public final class g extends a {
    public final Object[] D;
    public final j E;

    public g(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        super(i10, i11, 0);
        this.D = objArr2;
        int i13 = (i11 - 1) & (-32);
        this.E = new j(objArr, i10 > i13 ? i13 : i10, i13, i12);
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        j jVar = this.E;
        if (jVar.hasNext()) {
            this.B++;
            return jVar.next();
        }
        int i10 = this.B;
        this.B = i10 + 1;
        return this.D[i10 - jVar.C];
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.B;
        j jVar = this.E;
        int i11 = jVar.C;
        if (i10 <= i11) {
            this.B = i10 - 1;
            return jVar.previous();
        }
        int i12 = i10 - 1;
        this.B = i12;
        return this.D[i12 - i11];
    }
}
