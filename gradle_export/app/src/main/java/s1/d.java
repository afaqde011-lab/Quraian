package s1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class d implements Iterator, v00.a {
    public final int A;
    public int B;
    public boolean C;
    public final Object[] D;

    public d(k kVar, l[] lVarArr) {
        this.A = 0;
        this.D = lVarArr;
        this.C = true;
        lVarArr[0].a(kVar.f13624d, Integer.bitCount(kVar.f13621a) * 2, 0);
        this.B = 0;
        a();
    }

    public d(w30.k kVar, l[] lVarArr) {
        this.A = 1;
        kotlin.jvm.internal.m.e(kVar, "node");
        this.D = lVarArr;
        this.C = true;
        l lVar = lVarArr[0];
        Object[] objArr = kVar.d;
        int iBitCount = Integer.bitCount(kVar.a) * 2;
        lVar.getClass();
        kotlin.jvm.internal.m.e(objArr, "buffer");
        lVar.B = objArr;
        lVar.C = iBitCount;
        lVar.D = 0;
        this.B = 0;
        c();
    }

    public void a() {
        l[] lVarArr = (l[]) this.D;
        int i10 = this.B;
        l lVar = lVarArr[i10];
        if (lVar.D < lVar.C) {
            return;
        }
        while (-1 < i10) {
            int iE = e(i10);
            if (iE == -1) {
                l lVar2 = lVarArr[i10];
                int i11 = lVar2.D;
                Object[] objArr = lVar2.B;
                if (i11 < objArr.length) {
                    int length = objArr.length;
                    lVar2.D = i11 + 1;
                    iE = e(i10);
                }
            }
            if (iE != -1) {
                this.B = iE;
                return;
            }
            if (i10 > 0) {
                l lVar3 = lVarArr[i10 - 1];
                int i12 = lVar3.D;
                int length2 = lVar3.B.length;
                lVar3.D = i12 + 1;
            }
            lVarArr[i10].a(k.f13620e.f13624d, 0, 0);
            i10--;
        }
        this.C = false;
    }

    public void c() {
        l[] lVarArr = (l[]) this.D;
        int i10 = this.B;
        l lVar = lVarArr[i10];
        if (lVar.D < lVar.C) {
            return;
        }
        while (-1 < i10) {
            int iG = g(i10);
            if (iG == -1) {
                l lVar2 = lVarArr[i10];
                int i11 = lVar2.D;
                Object[] objArr = lVar2.B;
                if (i11 < objArr.length) {
                    int length = objArr.length;
                    lVar2.D = i11 + 1;
                    iG = g(i10);
                }
            }
            if (iG != -1) {
                this.B = iG;
                return;
            }
            if (i10 > 0) {
                l lVar3 = lVarArr[i10 - 1];
                int i12 = lVar3.D;
                int length2 = lVar3.B.length;
                lVar3.D = i12 + 1;
            }
            l lVar4 = lVarArr[i10];
            Object[] objArr2 = w30.k.e.d;
            lVar4.getClass();
            kotlin.jvm.internal.m.e(objArr2, "buffer");
            lVar4.B = objArr2;
            lVar4.C = 0;
            lVar4.D = 0;
            i10--;
        }
        this.C = false;
    }

    public int e(int i10) {
        l[] lVarArr = (l[]) this.D;
        l lVar = lVarArr[i10];
        int i11 = lVar.D;
        if (i11 < lVar.C) {
            return i10;
        }
        Object[] objArr = lVar.B;
        if (i11 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i11];
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        k kVar = (k) obj;
        if (i10 == 6) {
            l lVar2 = lVarArr[i10 + 1];
            Object[] objArr2 = kVar.f13624d;
            lVar2.a(objArr2, objArr2.length, 0);
        } else {
            lVarArr[i10 + 1].a(kVar.f13624d, Integer.bitCount(kVar.f13621a) * 2, 0);
        }
        return e(i10 + 1);
    }

    public int g(int i10) {
        l[] lVarArr = (l[]) this.D;
        l lVar = lVarArr[i10];
        int i11 = lVar.D;
        if (i11 < lVar.C) {
            return i10;
        }
        Object[] objArr = lVar.B;
        if (i11 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i11];
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        w30.k kVar = (w30.k) obj;
        if (i10 == 6) {
            l lVar2 = lVarArr[i10 + 1];
            Object[] objArr2 = kVar.d;
            int length2 = objArr2.length;
            lVar2.getClass();
            lVar2.B = objArr2;
            lVar2.C = length2;
            lVar2.D = 0;
        } else {
            l lVar3 = lVarArr[i10 + 1];
            Object[] objArr3 = kVar.d;
            int iBitCount = Integer.bitCount(kVar.a) * 2;
            lVar3.getClass();
            kotlin.jvm.internal.m.e(objArr3, "buffer");
            lVar3.B = objArr3;
            lVar3.C = iBitCount;
            lVar3.D = 0;
        }
        return g(i10 + 1);
    }

    @Override
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                break;
        }
        return this.C;
    }

    @Override
    public Object next() {
        switch (this.A) {
            case 0:
                if (!this.C) {
                    throw new NoSuchElementException();
                }
                Object next = ((l[]) this.D)[this.B].next();
                a();
                return next;
            default:
                if (!this.C) {
                    throw new NoSuchElementException();
                }
                Object next2 = ((l[]) this.D)[this.B].next();
                c();
                return next2;
        }
    }

    @Override
    public void remove() {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
