package r1;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public final class h extends a {
    public final f D;
    public int E;
    public j F;
    public int G;

    public h(f fVar, int i10) {
        super(i10, fVar.H, 0);
        this.D = fVar;
        this.E = fVar.i();
        this.G = -1;
        c();
    }

    public final void a() {
        if (this.E != this.D.i()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override
    public final void add(Object obj) {
        a();
        int i10 = this.B;
        f fVar = this.D;
        fVar.add(i10, obj);
        this.B++;
        this.C = fVar.a();
        this.E = fVar.i();
        this.G = -1;
        c();
    }

    public final void c() {
        f fVar = this.D;
        Object[] objArr = fVar.F;
        if (objArr == null) {
            this.F = null;
            return;
        }
        int i10 = (fVar.H - 1) & (-32);
        int i11 = this.B;
        if (i11 > i10) {
            i11 = i10;
        }
        int i12 = (fVar.D / 5) + 1;
        j jVar = this.F;
        if (jVar == null) {
            this.F = new j(objArr, i11, i10, i12);
            return;
        }
        jVar.B = i11;
        jVar.C = i10;
        jVar.D = i12;
        if (jVar.E.length < i12) {
            jVar.E = new Object[i12];
        }
        jVar.E[0] = objArr;
        ?? r4 = i11 == i10 ? 1 : 0;
        jVar.F = r4;
        jVar.c(i11 - r4, 1);
    }

    @Override
    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.B;
        this.G = i10;
        j jVar = this.F;
        f fVar = this.D;
        if (jVar == null) {
            Object[] objArr = fVar.G;
            this.B = i10 + 1;
            return objArr[i10];
        }
        if (jVar.hasNext()) {
            this.B++;
            return jVar.next();
        }
        Object[] objArr2 = fVar.G;
        int i11 = this.B;
        this.B = i11 + 1;
        return objArr2[i11 - jVar.C];
    }

    @Override
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.B;
        this.G = i10 - 1;
        j jVar = this.F;
        f fVar = this.D;
        if (jVar == null) {
            Object[] objArr = fVar.G;
            int i11 = i10 - 1;
            this.B = i11;
            return objArr[i11];
        }
        int i12 = jVar.C;
        if (i10 <= i12) {
            this.B = i10 - 1;
            return jVar.previous();
        }
        Object[] objArr2 = fVar.G;
        int i13 = i10 - 1;
        this.B = i13;
        return objArr2[i13 - i12];
    }

    @Override
    public final void remove() {
        a();
        int i10 = this.G;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.D;
        fVar.c(i10);
        int i11 = this.G;
        if (i11 < this.B) {
            this.B = i11;
        }
        this.C = fVar.a();
        this.E = fVar.i();
        this.G = -1;
        c();
    }

    @Override
    public final void set(Object obj) {
        a();
        int i10 = this.G;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        f fVar = this.D;
        fVar.set(i10, obj);
        this.E = fVar.i();
        c();
    }
}
