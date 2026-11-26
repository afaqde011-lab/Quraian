package r1;

import com.google.android.gms.internal.measurement.y3;
import h00.n;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.m;

public final class i extends c {
    public static final i B = new i(new Object[0]);
    public final Object[] A;

    public i(Object[] objArr) {
        this.A = objArr;
    }

    public final int a() {
        return this.A.length;
    }

    @Override
    public final c c(int i10, Object obj) {
        Object[] objArr = this.A;
        y3.t(i10, objArr.length);
        if (i10 == objArr.length) {
            return e(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            n.v0(0, i10, 6, objArr, objArr2);
            n.q0(i10 + 1, i10, objArr.length, objArr, objArr2);
            objArr2[i10] = obj;
            return new i(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        m.d(objArrCopyOf, "copyOf(...)");
        n.q0(i10 + 1, i10, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i10] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new e(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override
    public final c e(Object obj) {
        Object[] objArr = this.A;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new e(objArr, objArr2, objArr.length + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        m.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[objArr.length] = obj;
        return new i(objArrCopyOf);
    }

    @Override
    public final Object get(int i10) {
        y3.s(i10, a());
        return this.A[i10];
    }

    @Override
    public final c h(Collection collection) {
        Object[] objArr = this.A;
        if (collection.size() + objArr.length > 32) {
            f fVarI = i();
            fVarI.addAll(collection);
            return fVarI.e();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        m.d(objArrCopyOf, "copyOf(...)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new i(objArrCopyOf);
    }

    @Override
    public final f i() {
        return new f(this, null, this.A, 0);
    }

    @Override
    public final int indexOf(Object obj) {
        return n.J0(obj, this.A);
    }

    @Override
    public final c k(b bVar) {
        Object[] objArr = this.A;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z10 = false;
        for (int i10 = 0; i10 < length2; i10++) {
            Object obj = objArr[i10];
            if (((Boolean) bVar.invoke(obj)).booleanValue()) {
                if (!z10) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    m.d(objArrCopyOf, "copyOf(...)");
                    z10 = true;
                    length = i10;
                }
            } else if (z10) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? B : new i(n.x0(objArrCopyOf, 0, length));
    }

    @Override
    public final c l(int i10) {
        Object[] objArr = this.A;
        y3.s(i10, objArr.length);
        if (objArr.length == 1) {
            return B;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        m.d(objArrCopyOf, "copyOf(...)");
        n.q0(i10, i10 + 1, objArr.length, objArr, objArrCopyOf);
        return new i(objArrCopyOf);
    }

    @Override
    public final int lastIndexOf(Object obj) {
        return n.O0(obj, this.A);
    }

    @Override
    public final ListIterator listIterator(int i10) {
        Object[] objArr = this.A;
        y3.t(i10, objArr.length);
        return new d(objArr, i10, objArr.length);
    }

    @Override
    public final c m(int i10, Object obj) {
        Object[] objArr = this.A;
        y3.s(i10, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        m.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = obj;
        return new i(objArrCopyOf);
    }
}
