package fh;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class a0 extends AbstractMap implements Serializable {
    public static final Object J = new Object();
    public transient Object A;
    public transient int[] B;
    public transient Object[] C;
    public transient Object[] D;
    public transient int E;
    public transient int F;
    public transient y G;
    public transient y H;
    public transient r I;

    public static a0 a() {
        a0 a0Var = new a0();
        a0Var.E = bi.b.u(3, 1);
        return a0Var;
    }

    public static a0 c(int i10) {
        a0 a0Var = new a0();
        ta.c0.r("Expected size must be >= 0", i10 >= 0);
        a0Var.E = bi.b.u(i10, 1);
        return a0Var;
    }

    @Override
    public final void clear() {
        if (h()) {
            return;
        }
        this.E += 32;
        Map mapD = d();
        if (mapD != null) {
            this.E = bi.b.u(size(), 3);
            mapD.clear();
            this.A = null;
            this.F = 0;
            return;
        }
        Arrays.fill(k(), 0, this.F, (Object) null);
        Arrays.fill(l(), 0, this.F, (Object) null);
        Object obj = this.A;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(j(), 0, this.F, 0);
        this.F = 0;
    }

    @Override
    public final boolean containsKey(Object obj) {
        Map mapD = d();
        if (mapD != null) {
            return mapD.containsKey(obj);
        }
        return f(obj) != -1;
    }

    @Override
    public final boolean containsValue(Object obj) {
        Map mapD = d();
        if (mapD != null) {
            return mapD.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.F; i10++) {
            if (w50.c.A(obj, l()[i10])) {
                return true;
            }
        }
        return false;
    }

    public final Map d() {
        Object obj = this.A;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int e() {
        return (1 << (this.E & 31)) - 1;
    }

    @Override
    public final Set entrySet() {
        y yVar = this.H;
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(this, 0);
        this.H = yVar2;
        return yVar2;
    }

    public final int f(Object obj) {
        if (h()) {
            return -1;
        }
        int iX = w.x(obj);
        int iE = e();
        Object obj2 = this.A;
        Objects.requireNonNull(obj2);
        int iY = w.y(iX & iE, obj2);
        if (iY == 0) {
            return -1;
        }
        int i10 = ~iE;
        int i11 = iX & i10;
        do {
            int i12 = iY - 1;
            int i13 = j()[i12];
            if ((i13 & i10) == i11 && w50.c.A(obj, k()[i12])) {
                return i12;
            }
            iY = i13 & iE;
        } while (iY != 0);
        return -1;
    }

    public final void g(int i10, int i11) {
        Object obj = this.A;
        Objects.requireNonNull(obj);
        int[] iArrJ = j();
        Object[] objArrK = k();
        Object[] objArrL = l();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrK[i10] = null;
            objArrL[i10] = null;
            iArrJ[i10] = 0;
            return;
        }
        Object obj2 = objArrK[i12];
        objArrK[i10] = obj2;
        objArrL[i10] = objArrL[i12];
        objArrK[i12] = null;
        objArrL[i12] = null;
        iArrJ[i10] = iArrJ[i12];
        iArrJ[i12] = 0;
        int iX = w.x(obj2) & i11;
        int iY = w.y(iX, obj);
        if (iY == size) {
            w.z(iX, i10 + 1, obj);
            return;
        }
        while (true) {
            int i13 = iY - 1;
            int i14 = iArrJ[i13];
            int i15 = i14 & i11;
            if (i15 == size) {
                iArrJ[i13] = w.q(i14, i10 + 1, i11);
                return;
            }
            iY = i15;
        }
    }

    @Override
    public final Object get(Object obj) {
        Map mapD = d();
        if (mapD != null) {
            return mapD.get(obj);
        }
        int iF = f(obj);
        if (iF == -1) {
            return null;
        }
        return l()[iF];
    }

    public final boolean h() {
        return this.A == null;
    }

    public final Object i(Object obj) {
        if (!h()) {
            int iE = e();
            Object obj2 = this.A;
            Objects.requireNonNull(obj2);
            int iT = w.t(obj, null, iE, obj2, j(), k(), null);
            if (iT != -1) {
                Object obj3 = l()[iT];
                g(iT, iE);
                this.F--;
                this.E += 32;
                return obj3;
            }
        }
        return J;
    }

    @Override
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final int[] j() {
        int[] iArr = this.B;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] k() {
        Object[] objArr = this.C;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override
    public final Set keySet() {
        y yVar = this.G;
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(this, 1);
        this.G = yVar2;
        return yVar2;
    }

    public final Object[] l() {
        Object[] objArr = this.D;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int m(int i10, int i11, int i12, int i13) {
        Object objH = w.h(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            w.z(i12 & i14, i13 + 1, objH);
        }
        Object obj = this.A;
        Objects.requireNonNull(obj);
        int[] iArrJ = j();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iY = w.y(i15, obj);
            while (iY != 0) {
                int i16 = iY - 1;
                int i17 = iArrJ[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iY2 = w.y(i19, objH);
                w.z(i19, iY, objH);
                iArrJ[i16] = w.q(i18, iY2, i14);
                iY = i17 & i10;
            }
        }
        this.A = objH;
        this.E = w.q(this.E, 32 - Integer.numberOfLeadingZeros(i14), 31);
        return i14;
    }

    @Override
    public final java.lang.Object put(java.lang.Object r20, java.lang.Object r21) {
        throw new UnsupportedOperationException("Method not decompiled: fh.a0.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override
    public final Object remove(Object obj) {
        Map mapD = d();
        if (mapD != null) {
            return mapD.remove(obj);
        }
        Object objI = i(obj);
        if (objI == J) {
            return null;
        }
        return objI;
    }

    @Override
    public final int size() {
        Map mapD = d();
        return mapD != null ? mapD.size() : this.F;
    }

    @Override
    public final Collection values() {
        r rVar = this.I;
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(this, 2);
        this.I = rVar2;
        return rVar2;
    }
}
