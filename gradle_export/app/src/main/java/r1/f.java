package r1;

import a10.h0;
import com.google.android.gms.internal.measurement.y3;
import g00.s;
import h00.n;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.m;
import l1.n1;
import u00.k;

public final class f extends h00.h implements Collection, v00.b {
    public c A;
    public Object[] B;
    public Object[] C;
    public int D;
    public u1.b E = new u1.b();
    public Object[] F;
    public Object[] G;
    public int H;

    public f(c cVar, Object[] objArr, Object[] objArr2, int i10) {
        this.A = cVar;
        this.B = objArr;
        this.C = objArr2;
        this.D = i10;
        this.F = objArr;
        this.G = objArr2;
        this.H = cVar.a();
    }

    public static void h(Object[] objArr, int i10, Iterator it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
    }

    public final int A(k kVar, Object[] objArr, int i10, int i11, a5.f fVar, ArrayList arrayList, ArrayList arrayList2) {
        if (n(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = fVar.A;
        m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrR = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj2 = objArr[i12];
            if (!((Boolean) kVar.invoke(obj2)).booleanValue()) {
                if (i11 == 32) {
                    objArrR = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : r();
                    i11 = 0;
                }
                objArrR[i11] = obj2;
                i11++;
            }
        }
        fVar.A = objArrR;
        if (objArr2 != objArrR) {
            arrayList2.add(objArr2);
        }
        return i11;
    }

    public final int B(k kVar, Object[] objArr, int i10, a5.f fVar) {
        Object[] objArrP = objArr;
        int i11 = i10;
        boolean z10 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (((Boolean) kVar.invoke(obj)).booleanValue()) {
                if (!z10) {
                    objArrP = p(objArr);
                    z10 = true;
                    i11 = i12;
                }
            } else if (z10) {
                objArrP[i11] = obj;
                i11++;
            }
        }
        fVar.A = objArrP;
        return i11;
    }

    public final int C(k kVar, int i10, a5.f fVar) {
        int iB = B(kVar, this.G, i10, fVar);
        if (iB == i10) {
            return i10;
        }
        Object obj = fVar.A;
        m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iB, i10, (Object) null);
        this.G = objArr;
        this.H -= i10 - iB;
        return iB;
    }

    public final boolean D(k kVar) {
        Object[] objArrW;
        int i10;
        k kVar2 = kVar;
        int iJ = J();
        Object[] objArrT = null;
        a5.f fVar = new a5.f(objArrT);
        boolean z10 = false;
        if (this.F != null) {
            a aVarO = o(0);
            int iB = 32;
            while (iB == 32 && aVarO.hasNext()) {
                iB = B(kVar2, (Object[]) aVarO.next(), 32, fVar);
            }
            if (iB == 32) {
                int iC = C(kVar2, iJ, fVar);
                if (iC == 0) {
                    v(this.F, this.H, this.D);
                }
                if (iC != iJ) {
                }
            } else {
                int i11 = (aVarO.B - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iA = iB;
                while (aVarO.hasNext()) {
                    iA = A(kVar2, (Object[]) aVarO.next(), 32, iA, fVar, arrayList2, arrayList);
                    kVar2 = kVar;
                }
                int iA2 = A(kVar, this.G, iJ, iA, fVar, arrayList2, arrayList);
                Object obj = fVar.A;
                m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iA2, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrW = this.F;
                    m.b(objArrW);
                } else {
                    objArrW = w(this.F, i11, this.D, arrayList.iterator());
                }
                int size = i11 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    n1.a("invalid size");
                }
                if (size == 0) {
                    this.D = 0;
                } else {
                    int i12 = size - 1;
                    while (true) {
                        i10 = this.D;
                        if ((i12 >> i10) != 0) {
                            break;
                        }
                        this.D = i10 - 5;
                        Object[] objArr2 = objArrW[0];
                        m.c(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrW = objArr2;
                    }
                    objArrT = t(objArrW, i12, i10);
                }
                this.F = objArrT;
                this.G = objArr;
                this.H = size + iA2;
            }
            z10 = true;
        } else if (C(kVar2, iJ, fVar) != iJ) {
            z10 = true;
        }
        if (z10) {
            ((AbstractList) this).modCount++;
        }
        return z10;
    }

    public final Object[] E(Object[] objArr, int i10, int i11, a5.f fVar) {
        int iD = h0.D(i11, i10);
        if (i10 == 0) {
            Object obj = objArr[iD];
            Object[] objArrP = p(objArr);
            n.q0(iD, iD + 1, 32, objArr, objArrP);
            objArrP[31] = fVar.A;
            fVar.A = obj;
            return objArrP;
        }
        int iD2 = objArr[31] == null ? h0.D(G() - 1, i10) : 31;
        Object[] objArrP2 = p(objArr);
        int i12 = i10 - 5;
        int i13 = iD + 1;
        if (i13 <= iD2) {
            while (true) {
                Object obj2 = objArrP2[iD2];
                m.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrP2[iD2] = E((Object[]) obj2, i12, 0, fVar);
                if (iD2 == i13) {
                    break;
                }
                iD2--;
            }
        }
        Object obj3 = objArrP2[iD];
        m.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrP2[iD] = E((Object[]) obj3, i12, i11, fVar);
        return objArrP2;
    }

    public final Object F(Object[] objArr, int i10, int i11, int i12) {
        int i13 = this.H - i10;
        if (i13 == 1) {
            Object obj = this.G[0];
            v(objArr, i10, i11);
            return obj;
        }
        Object[] objArr2 = this.G;
        Object obj2 = objArr2[i12];
        Object[] objArrP = p(objArr2);
        n.q0(i12, i12 + 1, i13, objArr2, objArrP);
        objArrP[i13 - 1] = null;
        this.F = objArr;
        this.G = objArrP;
        this.H = (i10 + i13) - 1;
        this.D = i11;
        return obj2;
    }

    public final int G() {
        int i10 = this.H;
        if (i10 <= 32) {
            return 0;
        }
        return (i10 - 1) & (-32);
    }

    public final Object[] H(Object[] objArr, int i10, int i11, Object obj, a5.f fVar) {
        int iD = h0.D(i11, i10);
        Object[] objArrP = p(objArr);
        if (i10 != 0) {
            Object obj2 = objArrP[iD];
            m.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrP[iD] = H((Object[]) obj2, i10 - 5, i11, obj, fVar);
            return objArrP;
        }
        if (objArrP != objArr) {
            ((AbstractList) this).modCount++;
        }
        fVar.A = objArrP[iD];
        objArrP[iD] = obj;
        return objArrP;
    }

    public final void I(Collection collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] objArrR;
        if (i12 < 1) {
            n1.a("requires at least one nullBuffer");
        }
        Object[] objArrP = p(objArr);
        objArr2[0] = objArrP;
        int i13 = i10 & 31;
        int size = ((collection.size() + i10) - 1) & 31;
        int i14 = (i11 - i13) + size;
        if (i14 < 32) {
            n.q0(size + 1, i13, i11, objArrP, objArr3);
        } else {
            int i15 = i14 - 31;
            if (i12 == 1) {
                objArrR = objArrP;
            } else {
                objArrR = r();
                i12--;
                objArr2[i12] = objArrR;
            }
            int i16 = i11 - i15;
            n.q0(0, i16, i11, objArrP, objArr3);
            n.q0(size + 1, i13, i16, objArrP, objArrR);
            objArr3 = objArrR;
        }
        Iterator it = collection.iterator();
        h(objArrP, i13, it);
        for (int i17 = 1; i17 < i12; i17++) {
            Object[] objArrR2 = r();
            h(objArrR2, 0, it);
            objArr2[i17] = objArrR2;
        }
        h(objArr3, 0, it);
    }

    public final int J() {
        int i10 = this.H;
        return i10 <= 32 ? i10 : i10 - ((i10 - 1) & (-32));
    }

    public final int a() {
        return this.H;
    }

    public final void add(int i10, Object obj) {
        y3.t(i10, a());
        if (i10 == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iG = G();
        if (i10 >= iG) {
            m(i10 - iG, obj, this.F);
            return;
        }
        a5.f fVar = new a5.f(null);
        Object[] objArr = this.F;
        m.b(objArr);
        m(0, fVar.A, l(objArr, this.D, i10, obj, fVar));
    }

    @Override
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iJ = J();
        if (iJ < 32) {
            Object[] objArrP = p(this.G);
            objArrP[iJ] = obj;
            this.G = objArrP;
            this.H = a() + 1;
        } else {
            y(this.F, this.G, s(obj));
        }
        return true;
    }

    public final boolean addAll(int i10, Collection collection) {
        Collection collection2;
        Object[] objArrR;
        y3.t(i10, this.H);
        if (i10 == this.H) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = ((collection.size() + (this.H - i11)) - 1) / 32;
        if (size == 0) {
            int i12 = i10 & 31;
            int size2 = ((collection.size() + i10) - 1) & 31;
            Object[] objArr = this.G;
            Object[] objArrP = p(objArr);
            n.q0(size2 + 1, i12, J(), objArr, objArrP);
            h(objArrP, i12, collection.iterator());
            this.G = objArrP;
            this.H = collection.size() + this.H;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iJ = J();
        int size3 = collection.size() + this.H;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i10 >= G()) {
            objArrR = r();
            collection2 = collection;
            I(collection2, i10, this.G, iJ, objArr2, size, objArrR);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            if (size3 > iJ) {
                int i13 = size3 - iJ;
                Object[] objArrQ = q(i13, this.G);
                k(collection2, i10, i13, objArr2, size, objArrQ);
                objArr2 = objArr2;
                objArrR = objArrQ;
            } else {
                Object[] objArr3 = this.G;
                objArrR = r();
                int i14 = iJ - size3;
                n.q0(0, i14, iJ, objArr3, objArrR);
                int i15 = 32 - i14;
                Object[] objArrQ2 = q(i15, this.G);
                int i16 = size - 1;
                objArr2[i16] = objArrQ2;
                k(collection2, i10, i15, objArr2, i16, objArrQ2);
                collection2 = collection2;
            }
        }
        this.F = x(this.F, i11, objArr2);
        this.G = objArrR;
        this.H = collection2.size() + this.H;
        return true;
    }

    @Override
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iJ = J();
        Iterator it = collection.iterator();
        if (32 - iJ >= collection.size()) {
            Object[] objArrP = p(this.G);
            h(objArrP, iJ, it);
            this.G = objArrP;
            this.H = collection.size() + this.H;
            return true;
        }
        int size = ((collection.size() + iJ) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrP2 = p(this.G);
        h(objArrP2, iJ, it);
        objArr[0] = objArrP2;
        for (int i10 = 1; i10 < size; i10++) {
            Object[] objArrR = r();
            h(objArrR, 0, it);
            objArr[i10] = objArrR;
        }
        this.F = x(this.F, G(), objArr);
        Object[] objArrR2 = r();
        h(objArrR2, 0, it);
        this.G = objArrR2;
        this.H = collection.size() + this.H;
        return true;
    }

    public final Object c(int i10) {
        y3.s(i10, a());
        ((AbstractList) this).modCount++;
        int iG = G();
        if (i10 >= iG) {
            return F(this.F, iG, this.D, i10 - iG);
        }
        a5.f fVar = new a5.f(this.G[0]);
        Object[] objArr = this.F;
        m.b(objArr);
        F(E(objArr, this.D, i10, fVar), iG, this.D, 0);
        return fVar.A;
    }

    public final c e() {
        c eVar;
        Object[] objArr = this.F;
        if (objArr == this.B && this.G == this.C) {
            eVar = this.A;
        } else {
            this.E = new u1.b();
            this.B = objArr;
            Object[] objArr2 = this.G;
            this.C = objArr2;
            if (objArr != null) {
                eVar = new e(objArr, objArr2, this.H, this.D);
            } else if (objArr2.length == 0) {
                eVar = i.B;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, this.H);
                m.d(objArrCopyOf, "copyOf(...)");
                eVar = new i(objArrCopyOf);
            }
        }
        this.A = eVar;
        return eVar;
    }

    public final Object get(int i10) {
        Object[] objArr;
        y3.s(i10, a());
        if (G() <= i10) {
            objArr = this.G;
        } else {
            Object[] objArr2 = this.F;
            m.b(objArr2);
            for (int i11 = this.D; i11 > 0; i11 -= 5) {
                Object[] objArr3 = objArr2[h0.D(i10, i11)];
                m.c(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i10 & 31];
    }

    public final int i() {
        return ((AbstractList) this).modCount;
    }

    @Override
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void k(Collection collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.F == null) {
            throw new IllegalStateException("root is null");
        }
        int i13 = i10 >> 5;
        a aVarO = o(G() >> 5);
        int i14 = i12;
        Object[] objArrQ = objArr2;
        while (aVarO.B - 1 != i13) {
            Object[] objArr3 = (Object[]) aVarO.previous();
            n.q0(0, 32 - i11, 32, objArr3, objArrQ);
            objArrQ = q(i11, objArr3);
            i14--;
            objArr[i14] = objArrQ;
        }
        Object[] objArr4 = (Object[]) aVarO.previous();
        int iG = i12 - (((G() >> 5) - 1) - i13);
        if (iG < i12) {
            objArr2 = objArr[iG];
            m.b(objArr2);
        }
        I(collection, i10, objArr4, 32, objArr, iG, objArr2);
    }

    public final Object[] l(Object[] objArr, int i10, int i11, Object obj, a5.f fVar) {
        Object obj2;
        int iD = h0.D(i11, i10);
        if (i10 == 0) {
            fVar.A = objArr[31];
            Object[] objArrP = p(objArr);
            n.q0(iD + 1, iD, 31, objArr, objArrP);
            objArrP[iD] = obj;
            return objArrP;
        }
        Object[] objArrP2 = p(objArr);
        int i12 = i10 - 5;
        Object obj3 = objArrP2[iD];
        m.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrP2[iD] = l((Object[]) obj3, i12, i11, obj, fVar);
        while (true) {
            iD++;
            if (iD >= 32 || (obj2 = objArrP2[iD]) == null) {
                break;
            }
            objArrP2[iD] = l((Object[]) obj2, i12, 0, fVar.A, fVar);
        }
        return objArrP2;
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final ListIterator listIterator(int i10) {
        y3.t(i10, this.H);
        return new h(this, i10);
    }

    public final void m(int i10, Object obj, Object[] objArr) {
        int iJ = J();
        Object[] objArrP = p(this.G);
        if (iJ >= 32) {
            Object[] objArr2 = this.G;
            Object obj2 = objArr2[31];
            n.q0(i10 + 1, i10, 31, objArr2, objArrP);
            objArrP[i10] = obj;
            y(objArr, objArrP, s(obj2));
            return;
        }
        n.q0(i10 + 1, i10, iJ, this.G, objArrP);
        objArrP[i10] = obj;
        this.F = objArr;
        this.G = objArrP;
        this.H++;
    }

    public final boolean n(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.E;
    }

    public final a o(int i10) {
        Object[] objArr = this.F;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iG = G() >> 5;
        y3.t(i10, iG);
        int i11 = this.D;
        return i11 == 0 ? new d(objArr, i10) : new j(objArr, i10, iG, i11 / 5);
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

    public final Object[] q(int i10, Object[] objArr) {
        if (n(objArr)) {
            n.q0(i10, 0, 32 - i10, objArr, objArr);
            return objArr;
        }
        Object[] objArrR = r();
        n.q0(i10, 0, 32 - i10, objArr, objArrR);
        return objArrR;
    }

    public final Object[] r() {
        Object[] objArr = new Object[33];
        objArr[32] = this.E;
        return objArr;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        return D(new b(1, collection));
    }

    public final Object[] s(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.E;
        return objArr;
    }

    public final Object set(int i10, Object obj) {
        y3.s(i10, a());
        if (G() > i10) {
            a5.f fVar = new a5.f(null);
            Object[] objArr = this.F;
            m.b(objArr);
            this.F = H(objArr, this.D, i10, obj, fVar);
            return fVar.A;
        }
        Object[] objArrP = p(this.G);
        if (objArrP != this.G) {
            ((AbstractList) this).modCount++;
        }
        int i11 = i10 & 31;
        Object obj2 = objArrP[i11];
        objArrP[i11] = obj;
        this.G = objArrP;
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i10, int i11) {
        if (i11 < 0) {
            n1.a("shift should be positive");
        }
        if (i11 == 0) {
            return objArr;
        }
        int iD = h0.D(i10, i11);
        Object obj = objArr[iD];
        m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objT = t((Object[]) obj, i10, i11 - 5);
        if (iD < 31) {
            int i12 = iD + 1;
            if (objArr[i12] != null) {
                if (n(objArr)) {
                    Arrays.fill(objArr, i12, 32, (Object) null);
                }
                Object[] objArrR = r();
                n.q0(0, 0, i12, objArr, objArrR);
                objArr = objArrR;
            }
        }
        if (objT == objArr[iD]) {
            return objArr;
        }
        Object[] objArrP = p(objArr);
        objArrP[iD] = objT;
        return objArrP;
    }

    public final Object[] u(Object[] objArr, int i10, int i11, a5.f fVar) {
        Object[] objArrU;
        int iD = h0.D(i11 - 1, i10);
        if (i10 == 5) {
            fVar.A = objArr[iD];
            objArrU = null;
        } else {
            Object obj = objArr[iD];
            m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrU = u((Object[]) obj, i10 - 5, i11, fVar);
        }
        if (objArrU == null && iD == 0) {
            return null;
        }
        Object[] objArrP = p(objArr);
        objArrP[iD] = objArrU;
        return objArrP;
    }

    public final void v(Object[] objArr, int i10, int i11) {
        Object obj = null;
        if (i11 == 0) {
            this.F = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.G = objArr;
            this.H = i10;
            this.D = i11;
            return;
        }
        a5.f fVar = new a5.f(obj);
        m.b(objArr);
        Object[] objArrU = u(objArr, i11, i10, fVar);
        m.b(objArrU);
        Object obj2 = fVar.A;
        m.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.G = (Object[]) obj2;
        this.H = i10;
        if (objArrU[1] == null) {
            this.F = (Object[]) objArrU[0];
            this.D = i11 - 5;
        } else {
            this.F = objArrU;
            this.D = i11;
        }
    }

    public final Object[] w(Object[] objArr, int i10, int i11, Iterator it) {
        if (!it.hasNext()) {
            n1.a("invalid buffersIterator");
        }
        if (!(i11 >= 0)) {
            n1.a("negative shift");
        }
        if (i11 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrP = p(objArr);
        int iD = h0.D(i10, i11);
        int i12 = i11 - 5;
        objArrP[iD] = w((Object[]) objArrP[iD], i10, i12, it);
        while (true) {
            iD++;
            if (iD >= 32 || !it.hasNext()) {
                break;
            }
            objArrP[iD] = w((Object[]) objArrP[iD], 0, i12, it);
        }
        return objArrP;
    }

    public final Object[] x(Object[] objArr, int i10, Object[][] objArr2) {
        s sVarI = m.i(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.D;
        Object[] objArrW = i11 < (1 << i12) ? w(objArr, i10, i12, sVarI) : p(objArr);
        while (sVarI.hasNext()) {
            this.D += 5;
            objArrW = s(objArrW);
            int i13 = this.D;
            w(objArrW, 1 << i13, i13, sVarI);
        }
        return objArrW;
    }

    public final void y(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.H;
        int i11 = i10 >> 5;
        int i12 = this.D;
        if (i11 > (1 << i12)) {
            this.F = z(s(objArr), objArr2, this.D + 5);
            this.G = objArr3;
            this.D += 5;
            this.H++;
            return;
        }
        if (objArr == null) {
            this.F = objArr2;
            this.G = objArr3;
            this.H = i10 + 1;
        } else {
            this.F = z(objArr, objArr2, i12);
            this.G = objArr3;
            this.H++;
        }
    }

    public final Object[] z(Object[] objArr, Object[] objArr2, int i10) {
        int iD = h0.D(a() - 1, i10);
        Object[] objArrP = p(objArr);
        if (i10 == 5) {
            objArrP[iD] = objArr2;
            return objArrP;
        }
        objArrP[iD] = z((Object[]) objArrP[iD], objArr2, i10 - 5);
        return objArrP;
    }
}
