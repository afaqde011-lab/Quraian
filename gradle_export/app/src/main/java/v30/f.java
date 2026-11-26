package v30;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

public final class f extends r1.a {
    public final d D;
    public int E;
    public h F;
    public int G;

    public f(d dVar, int i) {
        super(i, dVar.H, 1);
        this.D = dVar;
        this.E = dVar.i();
        this.G = -1;
        c();
    }

    public final void a() {
        if (this.E != this.D.i()) {
            throw new ConcurrentModificationException();
        }
    }

    public final void add(Object obj) {
        a();
        int i = ((r1.a) this).B;
        d dVar = this.D;
        dVar.add(i, obj);
        ((r1.a) this).B++;
        ((r1.a) this).C = dVar.a();
        this.E = dVar.i();
        this.G = -1;
        c();
    }

    public final void c() {
        d dVar = this.D;
        Object[] objArr = dVar.F;
        if (objArr == null) {
            this.F = null;
            return;
        }
        int i = (dVar.H - 1) & (-32);
        int i2 = ((r1.a) this).B;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (dVar.D / 5) + 1;
        h hVar = this.F;
        if (hVar == null) {
            this.F = new h(objArr, i2, i, i3);
            return;
        }
        ((r1.a) hVar).B = i2;
        ((r1.a) hVar).C = i;
        hVar.D = i3;
        if (hVar.E.length < i3) {
            hVar.E = new Object[i3];
        }
        hVar.E[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        hVar.F = r0;
        hVar.c(i2 - r0, 1);
    }

    public final Object next() {
        a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = ((r1.a) this).B;
        this.G = i;
        h hVar = this.F;
        d dVar = this.D;
        if (hVar == null) {
            Object[] objArr = dVar.G;
            ((r1.a) this).B = i + 1;
            return objArr[i];
        }
        if (hVar.hasNext()) {
            ((r1.a) this).B++;
            return hVar.next();
        }
        Object[] objArr2 = dVar.G;
        int i2 = ((r1.a) this).B;
        ((r1.a) this).B = i2 + 1;
        return objArr2[i2 - ((r1.a) hVar).C];
    }

    public final Object previous() {
        a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = ((r1.a) this).B;
        this.G = i - 1;
        h hVar = this.F;
        d dVar = this.D;
        if (hVar == null) {
            Object[] objArr = dVar.G;
            int i2 = i - 1;
            ((r1.a) this).B = i2;
            return objArr[i2];
        }
        int i3 = ((r1.a) hVar).C;
        if (i <= i3) {
            ((r1.a) this).B = i - 1;
            return hVar.previous();
        }
        Object[] objArr2 = dVar.G;
        int i4 = i - 1;
        ((r1.a) this).B = i4;
        return objArr2[i4 - i3];
    }

    public final void remove() {
        a();
        int i = this.G;
        if (i == -1) {
            throw new IllegalStateException();
        }
        d dVar = this.D;
        dVar.c(i);
        int i2 = this.G;
        if (i2 < ((r1.a) this).B) {
            ((r1.a) this).B = i2;
        }
        ((r1.a) this).C = dVar.a();
        this.E = dVar.i();
        this.G = -1;
        c();
    }

    public final void set(Object obj) {
        a();
        int i = this.G;
        if (i == -1) {
            throw new IllegalStateException();
        }
        d dVar = this.D;
        dVar.set(i, obj);
        this.E = dVar.i();
        c();
    }
}
