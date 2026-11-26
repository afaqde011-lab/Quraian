package fh;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class m0 extends n0 {

    public Object[] f5675a;

    public int f5676b;

    public boolean f5677c;

    public m0(int i10) {
        w.g(i10, "initialCapacity");
        this.f5675a = new Object[i10];
        this.f5676b = 0;
    }

    public final void c(Object obj) {
        obj.getClass();
        f(1);
        Object[] objArr = this.f5675a;
        int i10 = this.f5676b;
        this.f5676b = i10 + 1;
        objArr[i10] = obj;
    }

    public final void d(Object... objArr) {
        int length = objArr.length;
        w.e(length, objArr);
        f(length);
        System.arraycopy(objArr, 0, this.f5675a, this.f5676b, length);
        this.f5676b += length;
    }

    public final void e(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            f(collection.size());
            if (collection instanceof o0) {
                this.f5676b = ((o0) collection).b(this.f5676b, this.f5675a);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final void f(int i10) {
        Object[] objArr = this.f5675a;
        int iB = n0.b(objArr.length, this.f5676b + i10);
        if (iB > objArr.length || this.f5677c) {
            this.f5675a = Arrays.copyOf(this.f5675a, iB);
            this.f5677c = false;
        }
    }
}
