package r1;

import a10.h0;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

public final class j extends a {
    public int D;
    public Object[] E;
    public boolean F;

    public j(Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11, 0);
        this.D = i12;
        Object[] objArr2 = new Object[i12];
        this.E = objArr2;
        ?? r7 = i10 == i11 ? 1 : 0;
        this.F = r7;
        objArr2[0] = objArr;
        c(i10 - r7, 1);
    }

    public final Object a() {
        int i10 = this.B & 31;
        Object obj = this.E[this.D - 1];
        m.c(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i10];
    }

    public final void c(int i10, int i11) {
        int i12 = (this.D - i11) * 5;
        while (i11 < this.D) {
            Object[] objArr = this.E;
            Object obj = objArr[i11 - 1];
            m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = ((Object[]) obj)[h0.D(i10, i12)];
            i12 -= 5;
            i11++;
        }
    }

    public final void e(int i10) {
        int i11 = 0;
        while (h0.D(this.B, i11) == i10) {
            i11 += 5;
        }
        if (i11 > 0) {
            c(this.B, ((this.D - 1) - (i11 / 5)) + 1);
        }
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a();
        int i10 = this.B + 1;
        this.B = i10;
        if (i10 == this.C) {
            this.F = true;
            return objA;
        }
        e(0);
        return objA;
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.B--;
        if (this.F) {
            this.F = false;
            return a();
        }
        e(31);
        return a();
    }
}
