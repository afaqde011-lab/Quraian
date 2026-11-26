package w30;

import ab.a0;
import h00.n;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kh.o;

public final class k {
    public static final k e = new k(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final z30.b c;
    public Object[] d;

    public k(int i, int i2, Object[] objArr, z30.b bVar) {
        this.a = i;
        this.b = i2;
        this.c = bVar;
        this.d = objArr;
    }

    public static k k(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, z30.b bVar) {
        if (i3 > 30) {
            return new k(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int iA = o.A(i, i3);
        int iA2 = o.A(i2, i3);
        if (iA != iA2) {
            return new k((1 << iA) | (1 << iA2), 0, iA < iA2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new k(0, 1 << iA, new Object[]{k(i, obj, obj2, i2, obj3, obj4, i3 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, z30.b bVar) {
        Object obj3 = this.d[i];
        k kVarK = k(obj3 != null ? obj3.hashCode() : 0, obj3, v(i), i3, obj, obj2, i4 + 5, bVar);
        int iU = u(i2);
        int i5 = iU + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        n.v0(0, i, 6, objArr, objArr2);
        n.q0(i, i + 2, i5, objArr, objArr2);
        objArr2[iU - 1] = kVarK;
        n.q0(iU, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += t(i).b();
        }
        return iBitCount;
    }

    public final int c(Object obj) {
        z00.c cVarE0 = a0.E0(2, a0.I0(0, this.d.length));
        int i = cVarE0.A;
        int i2 = cVarE0.B;
        int i3 = cVarE0.C;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return -1;
        }
        while (!kotlin.jvm.internal.m.a(obj, this.d[i])) {
            if (i == i2) {
                return -1;
            }
            i += i3;
        }
        return i;
    }

    public final boolean d(int i, int i2, Object obj) {
        int iA = 1 << o.A(i, i2);
        if (i(iA)) {
            return kotlin.jvm.internal.m.a(obj, this.d[f(iA)]);
        }
        if (!j(iA)) {
            return false;
        }
        k kVarT = t(u(iA));
        if (i2 == 30) {
            return kVarT.c(obj) != -1;
        }
        return kVarT.d(i, i2 + 5, obj);
    }

    public final boolean e(k kVar) {
        if (this == kVar) {
            return true;
        }
        if (this.b == kVar.b && this.a == kVar.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == kVar.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final boolean g(k that, u00.n equalityComparator) {
        int i;
        int length;
        Object objV;
        int iC;
        kotlin.jvm.internal.m.e(that, "that");
        kotlin.jvm.internal.m.e(equalityComparator, "equalityComparator");
        if (this == that) {
            return true;
        }
        int i2 = this.a;
        if (i2 == that.a && (i = this.b) == that.b) {
            if (i2 == 0 && i == 0) {
                Object[] objArr = this.d;
                if (objArr.length == that.d.length) {
                    Iterable iterableE0 = a0.E0(2, a0.I0(0, objArr.length));
                    if ((iterableE0 instanceof Collection) && ((Collection) iterableE0).isEmpty()) {
                        return true;
                    }
                    Iterator it = iterableE0.iterator();
                    do {
                        z00.d dVar = (z00.d) it;
                        if (!dVar.C) {
                            return true;
                        }
                        int iNextInt = dVar.nextInt();
                        Object obj = that.d[iNextInt];
                        objV = that.v(iNextInt);
                        iC = c(obj);
                    } while (iC != -1 ? ((Boolean) equalityComparator.invoke(v(iC), objV)).booleanValue() : false);
                }
            } else {
                int iBitCount = Integer.bitCount(i2) * 2;
                z00.c cVarE0 = a0.E0(2, a0.I0(0, iBitCount));
                int i3 = cVarE0.A;
                int i4 = cVarE0.B;
                int i5 = cVarE0.C;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    length = this.d.length;
                    while (iBitCount < length) {
                        if (!t(iBitCount).g(that.t(iBitCount), equalityComparator)) {
                            break;
                        }
                        iBitCount++;
                    }
                    return true;
                }
                while (kotlin.jvm.internal.m.a(this.d[i3], that.d[i3]) && ((Boolean) equalityComparator.invoke(v(i3), that.v(i3))).booleanValue()) {
                    if (i3 == i4) {
                        length = this.d.length;
                        while (iBitCount < length) {
                            if (!t(iBitCount).g(that.t(iBitCount), equalityComparator)) {
                                break;
                                break;
                            }
                            iBitCount++;
                        }
                        return true;
                    }
                    i3 += i5;
                }
            }
        }
        return false;
    }

    public final Object h(int i, int i2, Object obj) {
        int iA = 1 << o.A(i, i2);
        if (i(iA)) {
            int iF = f(iA);
            if (kotlin.jvm.internal.m.a(obj, this.d[iF])) {
                return v(iF);
            }
            return null;
        }
        if (!j(iA)) {
            return null;
        }
        k kVarT = t(u(iA));
        if (i2 != 30) {
            return kVarT.h(i, i2 + 5, obj);
        }
        int iC = kVarT.c(obj);
        if (iC != -1) {
            return kVarT.v(iC);
        }
        return null;
    }

    public final boolean i(int i) {
        return (this.a & i) != 0;
    }

    public final boolean j(int i) {
        return (this.b & i) != 0;
    }

    public final k l(int i, d dVar) {
        dVar.i(dVar.F - 1);
        dVar.D = v(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != dVar.B) {
            return new k(0, 0, o.l(i, objArr), dVar.B);
        }
        this.d = o.l(i, objArr);
        return this;
    }

    public final k m(int i, Object obj, Object obj2, int i2, d dVar) {
        d dVar2;
        k kVarM;
        int iA = 1 << o.A(i, i2);
        boolean zI = i(iA);
        z30.b bVar = this.c;
        if (zI) {
            int iF = f(iA);
            if (!kotlin.jvm.internal.m.a(obj, this.d[iF])) {
                dVar.i(dVar.F + 1);
                z30.b bVar2 = dVar.B;
                if (bVar != bVar2) {
                    return new k(this.a ^ iA, this.b | iA, a(iF, iA, i, obj, obj2, i2, bVar2), bVar2);
                }
                this.d = a(iF, iA, i, obj, obj2, i2, bVar2);
                this.a ^= iA;
                this.b |= iA;
                return this;
            }
            dVar.D = v(iF);
            if (v(iF) == obj2) {
                return this;
            }
            if (bVar == dVar.B) {
                this.d[iF + 1] = obj2;
                return this;
            }
            dVar.E++;
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iF + 1] = obj2;
            return new k(this.a, this.b, objArrCopyOf, dVar.B);
        }
        if (!j(iA)) {
            dVar.i(dVar.F + 1);
            z30.b bVar3 = dVar.B;
            int iF2 = f(iA);
            if (bVar != bVar3) {
                return new k(this.a | iA, this.b, o.k(this.d, iF2, obj, obj2), bVar3);
            }
            this.d = o.k(this.d, iF2, obj, obj2);
            this.a |= iA;
            return this;
        }
        int iU = u(iA);
        k kVarT = t(iU);
        if (i2 == 30) {
            int iC = kVarT.c(obj);
            if (iC != -1) {
                dVar.D = kVarT.v(iC);
                if (kVarT.c == dVar.B) {
                    kVarT.d[iC + 1] = obj2;
                    kVarM = kVarT;
                } else {
                    dVar.E++;
                    Object[] objArr2 = kVarT.d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    kotlin.jvm.internal.m.d(objArrCopyOf2, "copyOf(...)");
                    objArrCopyOf2[iC + 1] = obj2;
                    kVarM = new k(0, 0, objArrCopyOf2, dVar.B);
                }
            } else {
                dVar.i(dVar.F + 1);
                kVarM = new k(0, 0, o.k(kVarT.d, 0, obj, obj2), dVar.B);
            }
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            kVarM = kVarT.m(i, obj, obj2, i2 + 5, dVar2);
        }
        return kVarT == kVarM ? this : s(iU, kVarM, dVar2.B);
    }

    public final k n(k otherNode, int i, z30.a aVar, d dVar) {
        k kVar;
        Object[] objArr;
        k kVarK;
        kotlin.jvm.internal.m.e(otherNode, "otherNode");
        if (this == otherNode) {
            aVar.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            z30.b bVar = dVar.B;
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + otherNode.d.length);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            int length = this.d.length;
            z00.c cVarE0 = a0.E0(2, a0.I0(0, otherNode.d.length));
            int i3 = cVarE0.A;
            int i4 = cVarE0.B;
            int i5 = cVarE0.C;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (c(otherNode.d[i3]) != -1) {
                        aVar.a++;
                    } else {
                        Object[] objArr3 = otherNode.d;
                        objArrCopyOf[length] = objArr3[i3];
                        objArrCopyOf[length + 1] = objArr3[i3 + 1];
                        length += 2;
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3 += i5;
                }
            }
            if (length != this.d.length) {
                if (length != otherNode.d.length) {
                    if (length == objArrCopyOf.length) {
                        return new k(0, 0, objArrCopyOf, bVar);
                    }
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                    kotlin.jvm.internal.m.d(objArrCopyOf2, "copyOf(...)");
                    return new k(0, 0, objArrCopyOf2, bVar);
                }
            }
            return this;
        }
        int i6 = this.b | otherNode.b;
        int i7 = this.a;
        int i8 = otherNode.a;
        int i9 = (i7 ^ i8) & (~i6);
        int i11 = i7 & i8;
        int i12 = i9;
        while (i11 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i11);
            if (kotlin.jvm.internal.m.a(this.d[f(iLowestOneBit)], otherNode.d[otherNode.f(iLowestOneBit)])) {
                i12 |= iLowestOneBit;
            } else {
                i6 |= iLowestOneBit;
            }
            i11 ^= iLowestOneBit;
        }
        if ((i6 & i12) != 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (kotlin.jvm.internal.m.a(this.c, dVar.B) && this.a == i12 && this.b == i6) {
            kVar = this;
        } else {
            kVar = new k(i12, i6, new Object[Integer.bitCount(i6) + (Integer.bitCount(i12) * 2)], null);
        }
        int i13 = i6;
        int i14 = 0;
        while (i13 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i13);
            Object[] objArr4 = kVar.d;
            int length2 = (objArr4.length - 1) - i14;
            if (j(iLowestOneBit2)) {
                kVarK = t(u(iLowestOneBit2));
                if (otherNode.j(iLowestOneBit2)) {
                    kVarK = kVarK.n(otherNode.t(otherNode.u(iLowestOneBit2)), i + 5, aVar, dVar);
                    objArr = objArr4;
                } else if (otherNode.i(iLowestOneBit2)) {
                    int iF = otherNode.f(iLowestOneBit2);
                    Object obj = otherNode.d[iF];
                    Object objV = otherNode.v(iF);
                    int i15 = dVar.F;
                    objArr = objArr4;
                    kVarK = kVarK.m(obj != null ? obj.hashCode() : i2, obj, objV, i + 5, dVar);
                    if (dVar.F == i15) {
                        aVar.a++;
                    }
                } else {
                    objArr = objArr4;
                }
            } else {
                objArr = objArr4;
                if (otherNode.j(iLowestOneBit2)) {
                    k kVarT = otherNode.t(otherNode.u(iLowestOneBit2));
                    if (i(iLowestOneBit2)) {
                        int iF2 = f(iLowestOneBit2);
                        Object obj2 = this.d[iF2];
                        int i16 = i + 5;
                        if (kVarT.d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                            aVar.a++;
                            kVarK = kVarT;
                        } else {
                            kVarK = kVarT.m(obj2 != null ? obj2.hashCode() : 0, obj2, v(iF2), i16, dVar);
                        }
                    } else {
                        kVarK = kVarT;
                    }
                } else {
                    int iF3 = f(iLowestOneBit2);
                    Object obj3 = this.d[iF3];
                    Object objV2 = v(iF3);
                    int iF4 = otherNode.f(iLowestOneBit2);
                    Object obj4 = otherNode.d[iF4];
                    kVarK = k(obj3 != null ? obj3.hashCode() : 0, obj3, objV2, obj4 != null ? obj4.hashCode() : 0, obj4, otherNode.v(iF4), i + 5, dVar.B);
                }
            }
            objArr[length2] = kVarK;
            i14++;
            i13 ^= iLowestOneBit2;
            i2 = 0;
        }
        int i17 = 0;
        while (i12 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i12);
            int i18 = i17 * 2;
            if (otherNode.i(iLowestOneBit3)) {
                int iF5 = otherNode.f(iLowestOneBit3);
                Object[] objArr5 = kVar.d;
                objArr5[i18] = otherNode.d[iF5];
                objArr5[i18 + 1] = otherNode.v(iF5);
                if (i(iLowestOneBit3)) {
                    aVar.a++;
                }
            } else {
                int iF6 = f(iLowestOneBit3);
                Object[] objArr6 = kVar.d;
                objArr6[i18] = this.d[iF6];
                objArr6[i18 + 1] = v(iF6);
            }
            i17++;
            i12 ^= iLowestOneBit3;
        }
        if (!e(kVar)) {
            return otherNode.e(kVar) ? otherNode : kVar;
        }
        return this;
    }

    public final k o(int i, Object obj, int i2, d dVar) {
        k kVarO;
        int iA = 1 << o.A(i, i2);
        if (i(iA)) {
            int iF = f(iA);
            if (kotlin.jvm.internal.m.a(obj, this.d[iF])) {
                return q(iF, iA, dVar);
            }
        } else if (j(iA)) {
            int iU = u(iA);
            k kVarT = t(iU);
            if (i2 == 30) {
                int iC = kVarT.c(obj);
                kVarO = iC != -1 ? kVarT.l(iC, dVar) : kVarT;
            } else {
                kVarO = kVarT.o(i, obj, i2 + 5, dVar);
            }
            return r(kVarT, kVarO, iU, iA, dVar.B);
        }
        return this;
    }

    public final k p(int i, Object obj, Object obj2, int i2, d dVar) {
        d dVar2;
        k kVarP;
        int iA = 1 << o.A(i, i2);
        if (i(iA)) {
            int iF = f(iA);
            return (kotlin.jvm.internal.m.a(obj, this.d[iF]) && kotlin.jvm.internal.m.a(obj2, v(iF))) ? q(iF, iA, dVar) : this;
        }
        if (!j(iA)) {
            return this;
        }
        int iU = u(iA);
        k kVarT = t(iU);
        if (i2 == 30) {
            int iC = kVarT.c(obj);
            kVarP = (iC == -1 || !kotlin.jvm.internal.m.a(obj2, kVarT.v(iC))) ? kVarT : kVarT.l(iC, dVar);
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            kVarP = kVarT.p(i, obj, obj2, i2 + 5, dVar2);
        }
        return r(kVarT, kVarP, iU, iA, dVar2.B);
    }

    public final k q(int i, int i2, d dVar) {
        dVar.i(dVar.F - 1);
        dVar.D = v(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != dVar.B) {
            return new k(i2 ^ this.a, this.b, o.l(i, objArr), dVar.B);
        }
        this.d = o.l(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final k r(k kVar, k kVar2, int i, int i2, z30.b bVar) {
        if (kVar2 != null) {
            return kVar != kVar2 ? s(i, kVar2, bVar) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.c != bVar) {
            Object[] objArr2 = new Object[objArr.length - 1];
            n.v0(0, i, 6, objArr, objArr2);
            n.q0(i, i + 1, objArr.length, objArr, objArr2);
            return new k(this.a, this.b ^ i2, objArr2, bVar);
        }
        Object[] objArr3 = new Object[objArr.length - 1];
        n.v0(0, i, 6, objArr, objArr3);
        n.q0(i, i + 1, objArr.length, objArr, objArr3);
        this.d = objArr3;
        this.b ^= i2;
        return this;
    }

    public final k s(int i, k kVar, z30.b bVar) {
        z30.b bVar2 = kVar.c;
        Object[] objArr = this.d;
        if (objArr.length == 1 && kVar.d.length == 2 && kVar.b == 0) {
            kVar.a = this.b;
            return kVar;
        }
        if (this.c == bVar) {
            objArr[i] = kVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i] = kVar;
        return new k(this.a, this.b, objArrCopyOf, bVar);
    }

    public final k t(int i) {
        Object obj = this.d[i];
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (k) obj;
    }

    public final int u(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    public final Object v(int i) {
        return this.d[i + 1];
    }
}
