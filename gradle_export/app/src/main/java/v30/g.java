package v30;

import c7.i;
import h00.n;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.m;

public final class g extends a implements u30.b {
    public static final g B = new g(new Object[0]);
    public final Object[] A;

    public g(Object[] objArr) {
        this.A = objArr;
    }

    @Override
    public final int a() {
        return this.A.length;
    }

    public final a c(Collection elements) {
        m.e(elements, "elements");
        Object[] objArr = this.A;
        if (elements.size() + objArr.length > 32) {
            d dVarE = e();
            dVarE.addAll(elements);
            return dVarE.e();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, elements.size() + objArr.length);
        m.d(objArrCopyOf, "copyOf(...)");
        int length = objArr.length;
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new g(objArrCopyOf);
    }

    public final d e() {
        return new d(this, null, this.A, 0);
    }

    @Override
    public final Object get(int i) {
        i.o(i, a());
        return this.A[i];
    }

    @Override
    public final int indexOf(Object obj) {
        return n.J0(obj, this.A);
    }

    @Override
    public final int lastIndexOf(Object obj) {
        return n.O0(obj, this.A);
    }

    @Override
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.A;
        i.p(i, objArr.length);
        return new b(objArr, i, objArr.length);
    }
}
