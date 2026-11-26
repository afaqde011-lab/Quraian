package g00;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class s implements Iterator, v00.a {
    public final int A;
    public int B;
    public final Object C;

    public s(Object obj, int i) {
        this.A = i;
        this.C = obj;
    }

    public s(p40.u uVar) {
        this.A = 6;
        this.C = uVar;
        this.B = uVar.c;
    }

    public s(Object[] array) {
        this.A = 5;
        kotlin.jvm.internal.m.e(array, "array");
        this.C = array;
    }

    @Override
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                return this.B < ((byte[]) this.C).length;
            case 1:
                return this.B < ((int[]) this.C).length;
            case 2:
                return this.B < ((long[]) this.C).length;
            case 3:
                return this.B < ((short[]) this.C).length;
            case 4:
                return this.B < ((h00.f) this.C).a();
            case 5:
                return this.B < ((Object[]) this.C).length;
            case 6:
                return this.B > 0;
            default:
                return this.B < ((ViewGroup) this.C).getChildCount();
        }
    }

    @Override
    public final Object next() {
        switch (this.A) {
            case 0:
                int i = this.B;
                byte[] bArr = (byte[]) this.C;
                if (i >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.B));
                }
                this.B = i + 1;
                return new r(bArr[i]);
            case 1:
                int i2 = this.B;
                int[] iArr = (int[]) this.C;
                if (i2 >= iArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.B));
                }
                this.B = i2 + 1;
                return new u(iArr[i2]);
            case 2:
                int i3 = this.B;
                long[] jArr = (long[]) this.C;
                if (i3 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.B));
                }
                this.B = i3 + 1;
                return new w(jArr[i3]);
            case 3:
                int i4 = this.B;
                short[] sArr = (short[]) this.C;
                if (i4 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.B));
                }
                this.B = i4 + 1;
                return new z(sArr[i4]);
            case 4:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                h00.f fVar = (h00.f) this.C;
                int i5 = this.B;
                this.B = i5 + 1;
                return fVar.get(i5);
            case 5:
                try {
                    Object[] objArr = (Object[]) this.C;
                    int i6 = this.B;
                    this.B = i6 + 1;
                    return objArr[i6];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.B--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 6:
                p40.u uVar = (p40.u) this.C;
                int i7 = uVar.c;
                int i8 = this.B;
                this.B = i8 - 1;
                return uVar.e[i7 - i8];
            default:
                ViewGroup viewGroup = (ViewGroup) this.C;
                int i9 = this.B;
                this.B = i9 + 1;
                View childAt = viewGroup.getChildAt(i9);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public final void remove() {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.C;
                int i = this.B - 1;
                this.B = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }
}
