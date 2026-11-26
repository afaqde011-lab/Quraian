package r1;

import a10.h0;
import com.google.android.gms.internal.measurement.y3;
import h00.n;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.internal.m;
import l1.n1;

public final class e extends c {
    public final Object[] A;
    public final Object[] B;
    public final int C;
    public final int D;

    public e(Object[] objArr, Object[] objArr2, int i10, int i11) {
        this.A = objArr;
        this.B = objArr2;
        this.C = i10;
        this.D = i11;
        if (!(a() > 32)) {
            n1.a("Trie-based persistent vector should have at least 33 elements, got " + a());
        }
        int length = objArr2.length;
    }

    public static Object[] n(Object[] objArr, int i10, int i11, Object obj, a5.f fVar) {
        Object[] objArrCopyOf;
        int iD = h0.D(i11, i10);
        if (i10 == 0) {
            if (iD == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                m.d(objArrCopyOf, "copyOf(...)");
            }
            n.q0(iD + 1, iD, 31, objArr, objArrCopyOf);
            fVar.A = objArr[31];
            objArrCopyOf[iD] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        m.d(objArrCopyOf2, "copyOf(...)");
        int i12 = i10 - 5;
        Object obj2 = objArr[iD];
        m.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iD] = n((Object[]) obj2, i12, i11, obj, fVar);
        while (true) {
            iD++;
            if (iD >= 32 || objArrCopyOf2[iD] == null) {
                break;
            }
            Object obj3 = objArr[iD];
            m.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[iD] = n((Object[]) obj3, i12, 0, fVar.A, fVar);
        }
        return objArrCopyOf2;
    }

    public static Object[] p(Object[] objArr, int i10, int i11, a5.f fVar) {
        Object[] objArrP;
        int iD = h0.D(i11, i10);
        if (i10 == 5) {
            fVar.A = objArr[iD];
            objArrP = null;
        } else {
            Object obj = objArr[iD];
            m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrP = p((Object[]) obj, i10 - 5, i11, fVar);
        }
        if (objArrP == null && iD == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        m.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[iD] = objArrP;
        return objArrCopyOf;
    }

    public static Object[] v(int i10, int i11, Object obj, Object[] objArr) {
        int iD = h0.D(i11, i10);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        m.d(objArrCopyOf, "copyOf(...)");
        if (i10 == 0) {
            objArrCopyOf[iD] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iD];
        m.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[iD] = v(i10 - 5, i11, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    public final int a() {
        return this.C;
    }

    @Override
    public final c c(int i10, Object obj) {
        int i11 = this.C;
        y3.t(i10, i11);
        if (i10 == i11) {
            return e(obj);
        }
        int iU = u();
        Object[] objArr = this.A;
        if (i10 >= iU) {
            return o(i10 - iU, obj, objArr);
        }
        a5.f fVar = new a5.f(null);
        return o(0, fVar.A, n(objArr, this.D, i10, obj, fVar));
    }

    @Override
    public final c e(Object obj) {
        int iU = u();
        int i10 = this.C;
        int i11 = i10 - iU;
        Object[] objArr = this.A;
        Object[] objArr2 = this.B;
        if (i11 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return q(objArr, objArr2, objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        m.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i11] = obj;
        return new e(objArr, objArrCopyOf, i10 + 1, this.D);
    }

    @Override
    public final Object get(int i10) {
        Object[] objArr;
        y3.s(i10, a());
        if (u() <= i10) {
            objArr = this.B;
        } else {
            Object[] objArr2 = this.A;
            for (int i11 = this.D; i11 > 0; i11 -= 5) {
                Object[] objArr3 = objArr2[h0.D(i10, i11)];
                m.c(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i10 & 31];
    }

    @Override
    public final f i() {
        return new f(this, this.A, this.B, this.D);
    }

    @Override
    public final c k(b bVar) {
        f fVar = new f(this, this.A, this.B, this.D);
        fVar.D(bVar);
        return fVar.e();
    }

    @Override
    public final c l(int i10) {
        y3.s(i10, this.C);
        int iU = u();
        Object[] objArr = this.A;
        int i11 = this.D;
        return i10 >= iU ? t(objArr, iU, i11, i10 - iU) : t(s(objArr, i11, i10, new a5.f(this.B[0])), iU, i11, 0);
    }

    @Override
    public final ListIterator listIterator(int i10) {
        y3.t(i10, this.C);
        return new g(i10, this.C, (this.D / 5) + 1, this.A, this.B);
    }

    @Override
    public final c m(int i10, Object obj) {
        int i11 = this.C;
        y3.s(i10, i11);
        int iU = u();
        Object[] objArr = this.A;
        Object[] objArr2 = this.B;
        int i12 = this.D;
        if (iU > i10) {
            return new e(v(i12, i10, obj, objArr), objArr2, i11, i12);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        m.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10 & 31] = obj;
        return new e(objArr, objArrCopyOf, i11, i12);
    }

    public final e o(int i10, Object obj, Object[] objArr) {
        int iU = u();
        int i11 = this.C;
        int i12 = i11 - iU;
        Object[] objArr2 = this.B;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        m.d(objArrCopyOf, "copyOf(...)");
        if (i12 < 32) {
            n.q0(i10 + 1, i10, i12, objArr2, objArrCopyOf);
            objArrCopyOf[i10] = obj;
            return new e(objArr, objArrCopyOf, i11 + 1, this.D);
        }
        Object obj2 = objArr2[31];
        n.q0(i10 + 1, i10, i12 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i10] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return q(objArr, objArrCopyOf, objArr3);
    }

    public final e q(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.C;
        int i11 = i10 >> 5;
        int i12 = this.D;
        if (i11 <= (1 << i12)) {
            return new e(r(objArr, objArr2, i12), objArr3, i10 + 1, i12);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i13 = i12 + 5;
        return new e(r(objArr4, objArr2, i13), objArr3, i10 + 1, i13);
    }

    public final Object[] r(Object[] objArr, Object[] objArr2, int i10) {
        Object[] objArrCopyOf;
        int iD = h0.D(a() - 1, i10);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            m.d(objArrCopyOf, "copyOf(...)");
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i10 == 5) {
            objArrCopyOf[iD] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iD] = r((Object[]) objArrCopyOf[iD], objArr2, i10 - 5);
        return objArrCopyOf;
    }

    public final Object[] s(Object[] objArr, int i10, int i11, a5.f fVar) {
        Object[] objArrCopyOf;
        int iD = h0.D(i11, i10);
        if (i10 == 0) {
            if (iD == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                m.d(objArrCopyOf, "copyOf(...)");
            }
            n.q0(iD, iD + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = fVar.A;
            fVar.A = objArr[iD];
            return objArrCopyOf;
        }
        int iD2 = objArr[31] == null ? h0.D(u() - 1, i10) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        m.d(objArrCopyOf2, "copyOf(...)");
        int i12 = i10 - 5;
        int i13 = iD + 1;
        if (i13 <= iD2) {
            while (true) {
                Object obj = objArrCopyOf2[iD2];
                m.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iD2] = s((Object[]) obj, i12, 0, fVar);
                if (iD2 == i13) {
                    break;
                }
                iD2--;
            }
        }
        Object obj2 = objArrCopyOf2[iD];
        m.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[iD] = s((Object[]) obj2, i12, i11, fVar);
        return objArrCopyOf2;
    }

    public final c t(Object[] objArr, int i10, int i11, int i12) {
        int i13 = this.C - i10;
        Object obj = null;
        if (i13 != 1) {
            Object[] objArr2 = this.B;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            m.d(objArrCopyOf, "copyOf(...)");
            int i14 = i13 - 1;
            if (i12 < i14) {
                n.q0(i12, i12 + 1, i13, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i14] = null;
            return new e(objArr, objArrCopyOf, (i10 + i13) - 1, i11);
        }
        if (i11 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                m.d(objArr, "copyOf(...)");
            }
            return new i(objArr);
        }
        a5.f fVar = new a5.f(obj);
        Object[] objArrP = p(objArr, i11, i10 - 1, fVar);
        m.b(objArrP);
        Object obj2 = fVar.A;
        m.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj2;
        if (objArrP[1] != null) {
            return new e(objArrP, objArr3, i10, i11);
        }
        Object obj3 = objArrP[0];
        m.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new e((Object[]) obj3, objArr3, i10, i11 - 5);
    }

    public final int u() {
        return (this.C - 1) & (-32);
    }
}
