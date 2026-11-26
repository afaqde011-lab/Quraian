package r30;

import ab.a0;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class b implements Iterator, v00.a {
    public int A = -1;
    public int B;
    public int C;
    public z00.e D;
    public int E;
    public final c F;

    public b(c cVar) {
        this.F = cVar;
        int iY = a0.y(0, 0, cVar.a.length());
        this.B = iY;
        this.C = iY;
    }

    public final void a() {
        g00.k kVar;
        int i = this.C;
        if (i < 0) {
            this.A = 0;
            this.D = null;
            return;
        }
        c cVar = this.F;
        int i2 = cVar.b;
        if (i2 > 0) {
            int i3 = this.E + 1;
            this.E = i3;
            if (i3 >= i2) {
                this.D = new z00.e(this.B, k.F0(cVar.a), 1);
                this.C = -1;
            } else if (i > cVar.a.length() && (kVar = (g00.k) cVar.c.invoke(cVar.a, Integer.valueOf(this.C))) != null) {
                int iIntValue = ((Number) kVar.A).intValue();
                int iIntValue2 = ((Number) kVar.B).intValue();
                this.D = a0.I0(this.B, iIntValue);
                int i4 = iIntValue + iIntValue2;
                this.B = i4;
                this.C = i4 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.D = new z00.e(this.B, k.F0(cVar.a), 1);
                this.C = -1;
            }
        } else if (i > cVar.a.length()) {
            this.D = new z00.e(this.B, k.F0(cVar.a), 1);
            this.C = -1;
        } else {
            int iIntValue3 = ((Number) kVar.A).intValue();
            int iIntValue4 = ((Number) kVar.B).intValue();
            this.D = a0.I0(this.B, iIntValue3);
            int i5 = iIntValue3 + iIntValue4;
            this.B = i5;
            this.C = i5 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.A = 1;
    }

    @Override
    public final boolean hasNext() {
        if (this.A == -1) {
            a();
        }
        return this.A == 1;
    }

    @Override
    public final Object next() {
        if (this.A == -1) {
            a();
        }
        if (this.A == 0) {
            throw new NoSuchElementException();
        }
        z00.e eVar = this.D;
        kotlin.jvm.internal.m.c(eVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.D = null;
        this.A = -1;
        return eVar;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
