package v30;

import androidx.fragment.app.r;
import c7.i;
import g00.s;
import h00.n;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.m;
import ri.t1;

public final class d extends h00.h implements u30.d {
    public a A;
    public Object[] B;
    public Object[] C;
    public int D;
    public z30.b E;
    public Object[] F;
    public Object[] G;
    public int H;

    public d(a aVar, Object[] objArr, Object[] vectorTail, int i) {
        m.e(vectorTail, "vectorTail");
        this.A = aVar;
        this.B = objArr;
        this.C = vectorTail;
        this.D = i;
        this.E = new z30.b();
        this.F = objArr;
        this.G = vectorTail;
        this.H = aVar.a();
    }

    public static void h(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final int A(r rVar, Object[] objArr, int i, int i2, a5.f fVar, ArrayList arrayList, ArrayList arrayList2) {
        if (n(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = fVar.A;
        m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrR = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) rVar.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrR = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : r();
                    i2 = 0;
                }
                objArrR[i2] = obj2;
                i2++;
            }
        }
        fVar.A = objArrR;
        if (objArr2 != objArrR) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int B(r rVar, Object[] objArr, int i, a5.f fVar) {
        Object[] objArrP = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) rVar.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrP = p(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrP[i2] = obj;
                i2++;
            }
        }
        fVar.A = objArrP;
        return i2;
    }

    public final int C(r rVar, int i, a5.f fVar) {
        int iB = B(rVar, this.G, i, fVar);
        if (iB == i) {
            return i;
        }
        Object obj = fVar.A;
        m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iB, i, (Object) null);
        this.G = objArr;
        this.H -= i - iB;
        return iB;
    }

    public final Object[] D(Object[] objArr, int i, int i2, a5.f fVar) {
        int iC = t1.C(i2, i);
        if (i == 0) {
            Object obj = objArr[iC];
            Object[] objArrP = p(objArr);
            n.q0(iC, iC + 1, 32, objArr, objArrP);
            objArrP[31] = fVar.A;
            fVar.A = obj;
            return objArrP;
        }
        int iC2 = objArr[31] == null ? t1.C(F() - 1, i) : 31;
        Object[] objArrP2 = p(objArr);
        int i3 = i - 5;
        int i4 = iC + 1;
        if (i4 <= iC2) {
            while (true) {
                Object obj2 = objArrP2[iC2];
                m.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrP2[iC2] = D((Object[]) obj2, i3, 0, fVar);
                if (iC2 == i4) {
                    break;
                }
                iC2--;
            }
        }
        Object obj3 = objArrP2[iC];
        m.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrP2[iC] = D((Object[]) obj3, i3, i2, fVar);
        return objArrP2;
    }

    public final Object E(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.H - i;
        if (i4 == 1) {
            Object obj = this.G[0];
            v(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.G;
        Object obj2 = objArr2[i3];
        Object[] objArrP = p(objArr2);
        n.q0(i3, i3 + 1, i4, objArr2, objArrP);
        objArrP[i4 - 1] = null;
        this.F = objArr;
        this.G = objArrP;
        this.H = (i + i4) - 1;
        this.D = i2;
        return obj2;
    }

    public final int F() {
        int i = this.H;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] G(Object[] objArr, int i, int i2, Object obj, a5.f fVar) {
        int iC = t1.C(i2, i);
        Object[] objArrP = p(objArr);
        if (i != 0) {
            Object obj2 = objArrP[iC];
            m.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrP[iC] = G((Object[]) obj2, i - 5, i2, obj, fVar);
            return objArrP;
        }
        if (objArrP != objArr) {
            ((AbstractList) this).modCount++;
        }
        fVar.A = objArrP[iC];
        objArrP[iC] = obj;
        return objArrP;
    }

    public final void H(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrR;
        if (i3 < 1) {
            throw new IllegalStateException("Check failed.");
        }
        Object[] objArrP = p(objArr);
        objArr2[0] = objArrP;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            n.q0(size + 1, i4, i2, objArrP, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrR = objArrP;
            } else {
                objArrR = r();
                i3--;
                objArr2[i3] = objArrR;
            }
            int i7 = i2 - i6;
            n.q0(0, i7, i2, objArrP, objArr3);
            n.q0(size + 1, i4, i7, objArrP, objArrR);
            objArr3 = objArrR;
        }
        Iterator it = collection.iterator();
        h(objArrP, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrR2 = r();
            h(objArrR2, 0, it);
            objArr2[i8] = objArrR2;
        }
        h(objArr3, 0, it);
    }

    public final int I() {
        int i = this.H;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override
    public final int a() {
        return this.H;
    }

    @Override
    public final void add(int i, Object obj) {
        i.p(i, a());
        if (i == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iF = F();
        if (i >= iF) {
            m(i - iF, obj, this.F);
            return;
        }
        a5.f fVar = new a5.f((Object) null);
        Object[] objArr = this.F;
        m.b(objArr);
        m(0, fVar.A, k(objArr, this.D, i, obj, fVar));
    }

    @Override
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int I = I();
        if (I < 32) {
            Object[] objArrP = p(this.G);
            objArrP[I] = obj;
            this.G = objArrP;
            this.H = a() + 1;
        } else {
            y(this.F, this.G, s(obj));
        }
        return true;
    }

    @Override
    public final boolean addAll(int i, Collection elements) {
        Collection collection;
        Object[] objArrR;
        m.e(elements, "elements");
        i.p(i, this.H);
        if (i == this.H) {
            return addAll(elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((elements.size() + (this.H - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((elements.size() + i) - 1) & 31;
            Object[] objArr = this.G;
            Object[] objArrP = p(objArr);
            n.q0(size2 + 1, i3, I(), objArr, objArrP);
            h(objArrP, i3, elements.iterator());
            this.G = objArrP;
            this.H = elements.size() + this.H;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int I = I();
        int size3 = elements.size() + this.H;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= F()) {
            objArrR = r();
            collection = elements;
            H(collection, i, this.G, I, objArr2, size, objArrR);
            objArr2 = objArr2;
        } else {
            collection = elements;
            if (size3 > I) {
                int i4 = size3 - I;
                Object[] objArrQ = q(i4, this.G);
                l(collection, i, i4, objArr2, size, objArrQ);
                objArr2 = objArr2;
                objArrR = objArrQ;
            } else {
                Object[] objArr3 = this.G;
                objArrR = r();
                int i5 = I - size3;
                n.q0(0, i5, I, objArr3, objArrR);
                int i6 = 32 - i5;
                Object[] objArrQ2 = q(i6, this.G);
                int i7 = size - 1;
                objArr2[i7] = objArrQ2;
                l(collection, i, i6, objArr2, i7, objArrQ2);
                collection = collection;
            }
        }
        this.F = x(this.F, i2, objArr2);
        this.G = objArrR;
        this.H = collection.size() + this.H;
        return true;
    }

    @Override
    public final boolean addAll(Collection elements) {
        m.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int I = I();
        Iterator it = elements.iterator();
        if (32 - I >= elements.size()) {
            Object[] objArrP = p(this.G);
            h(objArrP, I, it);
            this.G = objArrP;
            this.H = elements.size() + this.H;
            return true;
        }
        int size = ((elements.size() + I) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrP2 = p(this.G);
        h(objArrP2, I, it);
        objArr[0] = objArrP2;
        for (int i = 1; i < size; i++) {
            Object[] objArrR = r();
            h(objArrR, 0, it);
            objArr[i] = objArrR;
        }
        this.F = x(this.F, F(), objArr);
        Object[] objArrR2 = r();
        h(objArrR2, 0, it);
        this.G = objArrR2;
        this.H = elements.size() + this.H;
        return true;
    }

    @Override
    public final Object c(int i) {
        i.o(i, a());
        ((AbstractList) this).modCount++;
        int iF = F();
        if (i >= iF) {
            return E(this.F, iF, this.D, i - iF);
        }
        a5.f fVar = new a5.f(this.G[0]);
        Object[] objArr = this.F;
        m.b(objArr);
        E(D(objArr, this.D, i, fVar), iF, this.D, 0);
        return fVar.A;
    }

    public final a e() {
        a cVar;
        Object[] objArr = this.F;
        if (objArr == this.B && this.G == this.C) {
            cVar = this.A;
        } else {
            this.E = new z30.b();
            this.B = objArr;
            Object[] objArr2 = this.G;
            this.C = objArr2;
            if (objArr != null) {
                cVar = new c(objArr, objArr2, this.H, this.D);
            } else if (objArr2.length == 0) {
                cVar = g.B;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, this.H);
                m.d(objArrCopyOf, "copyOf(...)");
                cVar = new g(objArrCopyOf);
            }
        }
        this.A = cVar;
        return cVar;
    }

    @Override
    public final Object get(int i) {
        Object[] objArr;
        i.o(i, a());
        if (F() <= i) {
            objArr = this.G;
        } else {
            Object[] objArr2 = this.F;
            m.b(objArr2);
            for (int i2 = this.D; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[t1.C(i, i2)];
                m.c(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    public final int i() {
        return ((AbstractList) this).modCount;
    }

    @Override
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object[] k(Object[] objArr, int i, int i2, Object obj, a5.f fVar) {
        Object obj2;
        int iC = t1.C(i2, i);
        if (i == 0) {
            fVar.A = objArr[31];
            Object[] objArrP = p(objArr);
            n.q0(iC + 1, iC, 31, objArr, objArrP);
            objArrP[iC] = obj;
            return objArrP;
        }
        Object[] objArrP2 = p(objArr);
        int i3 = i - 5;
        Object obj3 = objArrP2[iC];
        m.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrP2[iC] = k((Object[]) obj3, i3, i2, obj, fVar);
        while (true) {
            iC++;
            if (iC >= 32 || (obj2 = objArrP2[iC]) == null) {
                break;
            }
            objArrP2[iC] = k((Object[]) obj2, i3, 0, fVar.A, fVar);
        }
        return objArrP2;
    }

    public final void l(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.F == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i4 = i >> 5;
        r1.a aVarO = o(F() >> 5);
        int i5 = i3;
        Object[] objArrQ = objArr2;
        while (aVarO.B - 1 != i4) {
            Object[] objArr3 = (Object[]) aVarO.previous();
            n.q0(0, 32 - i2, 32, objArr3, objArrQ);
            objArrQ = q(i2, objArr3);
            i5--;
            objArr[i5] = objArrQ;
        }
        Object[] objArr4 = (Object[]) aVarO.previous();
        int iF = i3 - (((F() >> 5) - 1) - i4);
        if (iF < i3) {
            objArr2 = objArr[iF];
            m.b(objArr2);
        }
        H(collection, i, objArr4, 32, objArr, iF, objArr2);
    }

    @Override
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override
    public final ListIterator listIterator(int i) {
        i.p(i, this.H);
        return new f(this, i);
    }

    public final void m(int i, Object obj, Object[] objArr) {
        int I = I();
        Object[] objArrP = p(this.G);
        if (I >= 32) {
            Object[] objArr2 = this.G;
            Object obj2 = objArr2[31];
            n.q0(i + 1, i, 31, objArr2, objArrP);
            objArrP[i] = obj;
            y(objArr, objArrP, s(obj2));
            return;
        }
        n.q0(i + 1, i, I, this.G, objArrP);
        objArrP[i] = obj;
        this.F = objArr;
        this.G = objArrP;
        this.H++;
    }

    public final boolean n(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.E;
    }

    public final r1.a o(int i) {
        if (this.F == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int iF = F() >> 5;
        i.p(i, iF);
        int i2 = this.D;
        if (i2 == 0) {
            Object[] objArr = this.F;
            m.b(objArr);
            return new b(objArr, i);
        }
        Object[] objArr2 = this.F;
        m.b(objArr2);
        return new h(objArr2, i, iF, i2 / 5);
    }

    public final Object[] p(Object[] objArr) {
        if (objArr == null) {
            return r();
        }
        if (n(objArr)) {
            return objArr;
        }
        Object[] objArrR = r();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        n.v0(0, length, 6, objArr, objArrR);
        return objArrR;
    }

    public final Object[] q(int i, Object[] objArr) {
        if (n(objArr)) {
            n.q0(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] objArrR = r();
        n.q0(i, 0, 32 - i, objArr, objArrR);
        return objArrR;
    }

    public final Object[] r() {
        Object[] objArr = new Object[33];
        objArr[32] = this.E;
        return objArr;
    }

    @Override
    public final boolean removeAll(Collection elements) {
        d dVar;
        Object[] objArrW;
        int i;
        m.e(elements, "elements");
        r rVar = new r(1, elements);
        int I = I();
        Object[] objArrT = null;
        a5.f fVar = new a5.f((Object) null);
        boolean z = false;
        if (this.F != null) {
            r1.a aVarO = o(0);
            int iB = 32;
            while (iB == 32 && aVarO.hasNext()) {
                iB = B(rVar, (Object[]) aVarO.next(), 32, fVar);
            }
            if (iB == 32) {
                int iC = C(rVar, I, fVar);
                if (iC == 0) {
                    v(this.F, this.H, this.D);
                }
                if (iC != I) {
                    dVar = this;
                } else {
                    dVar = this;
                }
            } else {
                int i2 = (aVarO.B - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iA = iB;
                while (aVarO.hasNext()) {
                    iA = A(rVar, (Object[]) aVarO.next(), 32, iA, fVar, arrayList2, arrayList);
                }
                dVar = this;
                int iA2 = dVar.A(rVar, dVar.G, I, iA, fVar, arrayList2, arrayList);
                Object obj = fVar.A;
                m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iA2, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrW = dVar.F;
                    m.b(objArrW);
                } else {
                    objArrW = dVar.w(dVar.F, i2, dVar.D, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (size == 0) {
                    dVar.D = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = dVar.D;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        dVar.D = i - 5;
                        Object[] objArr2 = objArrW[0];
                        m.c(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrW = objArr2;
                    }
                    objArrT = dVar.t(objArrW, i3, i);
                }
                dVar.F = objArrT;
                dVar.G = objArr;
                dVar.H = size + iA2;
            }
            z = true;
        } else if (C(rVar, I, fVar) != I) {
            dVar = this;
            z = true;
        } else {
            dVar = this;
        }
        if (z) {
            ((AbstractList) dVar).modCount++;
        }
        return z;
    }

    public final Object[] s(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.E;
        return objArr;
    }

    @Override
    public final Object set(int i, Object obj) {
        i.o(i, a());
        if (F() > i) {
            a5.f fVar = new a5.f((Object) null);
            Object[] objArr = this.F;
            m.b(objArr);
            this.F = G(objArr, this.D, i, obj, fVar);
            return fVar.A;
        }
        Object[] objArrP = p(this.G);
        if (objArrP != this.G) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrP[i2];
        objArrP[i2] = obj;
        this.G = objArrP;
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iC = t1.C(i, i2);
        Object obj = objArr[iC];
        m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objT = t((Object[]) obj, i, i2 - 5);
        if (iC < 31) {
            int i3 = iC + 1;
            if (objArr[i3] != null) {
                if (n(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrR = r();
                n.q0(0, 0, i3, objArr, objArrR);
                objArr = objArrR;
            }
        }
        if (objT == objArr[iC]) {
            return objArr;
        }
        Object[] objArrP = p(objArr);
        objArrP[iC] = objT;
        return objArrP;
    }

    public final Object[] u(Object[] objArr, int i, int i2, a5.f fVar) {
        Object[] objArrU;
        int iC = t1.C(i2 - 1, i);
        if (i == 5) {
            fVar.A = objArr[iC];
            objArrU = null;
        } else {
            Object obj = objArr[iC];
            m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrU = u((Object[]) obj, i - 5, i2, fVar);
        }
        if (objArrU == null && iC == 0) {
            return null;
        }
        Object[] objArrP = p(objArr);
        objArrP[iC] = objArrU;
        return objArrP;
    }

    public final void v(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.F = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.G = objArr;
            this.H = i;
            this.D = i2;
            return;
        }
        a5.f fVar = new a5.f((Object) null);
        m.b(objArr);
        Object[] objArrU = u(objArr, i2, i, fVar);
        m.b(objArrU);
        Object obj = fVar.A;
        m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.G = (Object[]) obj;
        this.H = i;
        if (objArrU[1] == null) {
            this.F = (Object[]) objArrU[0];
            this.D = i2 - 5;
        } else {
            this.F = objArrU;
            this.D = i2;
        }
    }

    public final Object[] w(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            throw new IllegalStateException("Check failed.");
        }
        if (i2 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrP = p(objArr);
        int iC = t1.C(i, i2);
        int i3 = i2 - 5;
        objArrP[iC] = w((Object[]) objArrP[iC], i, i3, it);
        while (true) {
            iC++;
            if (iC >= 32 || !it.hasNext()) {
                break;
            }
            objArrP[iC] = w((Object[]) objArrP[iC], 0, i3, it);
        }
        return objArrP;
    }

    public final Object[] x(Object[] objArr, int i, Object[][] objArr2) {
        s sVarI = m.i(objArr2);
        int i2 = i >> 5;
        int i3 = this.D;
        Object[] objArrW = i2 < (1 << i3) ? w(objArr, i, i3, sVarI) : p(objArr);
        while (sVarI.hasNext()) {
            this.D += 5;
            objArrW = s(objArrW);
            int i4 = this.D;
            w(objArrW, 1 << i4, i4, sVarI);
        }
        return objArrW;
    }

    public final void y(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.H;
        int i2 = i >> 5;
        int i3 = this.D;
        if (i2 > (1 << i3)) {
            this.F = z(s(objArr), objArr2, this.D + 5);
            this.G = objArr3;
            this.D += 5;
            this.H++;
            return;
        }
        if (objArr == null) {
            this.F = objArr2;
            this.G = objArr3;
            this.H = i + 1;
        } else {
            this.F = z(objArr, objArr2, i3);
            this.G = objArr3;
            this.H++;
        }
    }

    public final Object[] z(Object[] objArr, Object[] objArr2, int i) {
        int iC = t1.C(a() - 1, i);
        Object[] objArrP = p(objArr);
        if (i == 5) {
            objArrP[iC] = objArr2;
            return objArrP;
        }
        objArrP[iC] = z((Object[]) objArrP[iC], objArr2, i - 5);
        return objArrP;
    }
}
