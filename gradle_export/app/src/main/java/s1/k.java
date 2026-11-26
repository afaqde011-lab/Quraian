package s1;

import ab.a0;
import com.google.android.gms.internal.measurement.y3;
import java.util.Arrays;
import l1.n1;

public final class k {

    public static final k f13620e = new k(0, 0, new Object[0], null);

    public int f13621a;

    public int f13622b;

    public final u1.b f13623c;

    public Object[] f13624d;

    public k(int i10, int i11, Object[] objArr, u1.b bVar) {
        this.f13621a = i10;
        this.f13622b = i11;
        this.f13623c = bVar;
        this.f13624d = objArr;
    }

    public static k j(int i10, Object obj, Object obj2, int i11, Object obj3, Object obj4, int i12, u1.b bVar) {
        if (i12 > 30) {
            return new k(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int iM = y3.M(i10, i12);
        int iM2 = y3.M(i11, i12);
        if (iM != iM2) {
            return new k((1 << iM) | (1 << iM2), 0, iM < iM2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new k(0, 1 << iM, new Object[]{j(i10, obj, obj2, i11, obj3, obj4, i12 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i10, int i11, int i12, Object obj, Object obj2, int i13, u1.b bVar) {
        Object obj3 = this.f13624d[i10];
        k kVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i10), i12, obj, obj2, i13 + 5, bVar);
        int iT = t(i11);
        int i14 = iT + 1;
        Object[] objArr = this.f13624d;
        Object[] objArr2 = new Object[objArr.length - 1];
        h00.n.v0(0, i10, 6, objArr, objArr2);
        h00.n.q0(i10, i10 + 2, i14, objArr, objArr2);
        objArr2[iT - 1] = kVarJ;
        h00.n.q0(iT, i14, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.f13622b == 0) {
            return this.f13624d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f13621a);
        int length = this.f13624d.length;
        for (int i10 = iBitCount * 2; i10 < length; i10++) {
            iBitCount += s(i10).b();
        }
        return iBitCount;
    }

    public final boolean c(Object obj) {
        z00.c cVarE0 = a0.E0(2, a0.I0(0, this.f13624d.length));
        int i10 = cVarE0.A;
        int i11 = cVarE0.B;
        int i12 = cVarE0.C;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (!kotlin.jvm.internal.m.a(obj, this.f13624d[i10])) {
                if (i10 != i11) {
                    i10 += i12;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i10, int i11, Object obj) {
        int iM = 1 << y3.M(i10, i11);
        if (h(iM)) {
            return kotlin.jvm.internal.m.a(obj, this.f13624d[f(iM)]);
        }
        if (!i(iM)) {
            return false;
        }
        k kVarS = s(t(iM));
        return i11 == 30 ? kVarS.c(obj) : kVarS.d(i10, i11 + 5, obj);
    }

    public final boolean e(k kVar) {
        if (this == kVar) {
            return true;
        }
        if (this.f13622b == kVar.f13622b && this.f13621a == kVar.f13621a) {
            int length = this.f13624d.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.f13624d[i10] == kVar.f13624d[i10]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i10) {
        return Integer.bitCount(this.f13621a & (i10 - 1)) * 2;
    }

    public final Object g(int i10, int i11, Object obj) {
        int iM = 1 << y3.M(i10, i11);
        if (h(iM)) {
            int iF = f(iM);
            if (kotlin.jvm.internal.m.a(obj, this.f13624d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iM)) {
            return null;
        }
        k kVarS = s(t(iM));
        if (i11 != 30) {
            return kVarS.g(i10, i11 + 5, obj);
        }
        z00.c cVarE0 = a0.E0(2, a0.I0(0, kVarS.f13624d.length));
        int i12 = cVarE0.A;
        int i13 = cVarE0.B;
        int i14 = cVarE0.C;
        if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
            return null;
        }
        while (!kotlin.jvm.internal.m.a(obj, kVarS.f13624d[i12])) {
            if (i12 == i13) {
                return null;
            }
            i12 += i14;
        }
        return kVarS.x(i12);
    }

    public final boolean h(int i10) {
        return (this.f13621a & i10) != 0;
    }

    public final boolean i(int i10) {
        return (this.f13622b & i10) != 0;
    }

    public final k k(int i10, e eVar) {
        eVar.i(eVar.F - 1);
        eVar.D = x(i10);
        Object[] objArr = this.f13624d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f13623c != eVar.B) {
            return new k(0, 0, y3.n(i10, objArr), eVar.B);
        }
        this.f13624d = y3.n(i10, objArr);
        return this;
    }

    public final k l(int i10, Object obj, Object obj2, int i11, e eVar) {
        e eVar2;
        k kVarL;
        int iM = 1 << y3.M(i10, i11);
        boolean zH = h(iM);
        u1.b bVar = this.f13623c;
        if (zH) {
            int iF = f(iM);
            if (!kotlin.jvm.internal.m.a(obj, this.f13624d[iF])) {
                eVar.i(eVar.F + 1);
                u1.b bVar2 = eVar.B;
                if (bVar != bVar2) {
                    return new k(this.f13621a ^ iM, this.f13622b | iM, a(iF, iM, i10, obj, obj2, i11, bVar2), bVar2);
                }
                this.f13624d = a(iF, iM, i10, obj, obj2, i11, bVar2);
                this.f13621a ^= iM;
                this.f13622b |= iM;
                return this;
            }
            eVar.D = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (bVar == eVar.B) {
                this.f13624d[iF + 1] = obj2;
                return this;
            }
            eVar.E++;
            Object[] objArr = this.f13624d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iF + 1] = obj2;
            return new k(this.f13621a, this.f13622b, objArrCopyOf, eVar.B);
        }
        if (!i(iM)) {
            eVar.i(eVar.F + 1);
            u1.b bVar3 = eVar.B;
            int iF2 = f(iM);
            if (bVar != bVar3) {
                return new k(this.f13621a | iM, this.f13622b, y3.m(this.f13624d, iF2, obj, obj2), bVar3);
            }
            this.f13624d = y3.m(this.f13624d, iF2, obj, obj2);
            this.f13621a |= iM;
            return this;
        }
        int iT = t(iM);
        k kVarS = s(iT);
        if (i11 == 30) {
            z00.c cVarE0 = a0.E0(2, a0.I0(0, kVarS.f13624d.length));
            int i12 = cVarE0.A;
            int i13 = cVarE0.B;
            int i14 = cVarE0.C;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (true) {
                    if (!kotlin.jvm.internal.m.a(obj, kVarS.f13624d[i12])) {
                        if (i12 == i13) {
                            eVar.i(eVar.F + 1);
                            kVarL = new k(0, 0, y3.m(kVarS.f13624d, 0, obj, obj2), eVar.B);
                            break;
                        }
                        i12 += i14;
                    } else {
                        eVar.D = kVarS.x(i12);
                        if (kVarS.f13623c != eVar.B) {
                            eVar.E++;
                            Object[] objArr2 = kVarS.f13624d;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            kotlin.jvm.internal.m.d(objArrCopyOf2, "copyOf(...)");
                            objArrCopyOf2[i12 + 1] = obj2;
                            kVarL = new k(0, 0, objArrCopyOf2, eVar.B);
                            break;
                        }
                        kVarS.f13624d[i12 + 1] = obj2;
                        kVarL = kVarS;
                        break;
                    }
                }
            } else {
                eVar.i(eVar.F + 1);
                kVarL = new k(0, 0, y3.m(kVarS.f13624d, 0, obj, obj2), eVar.B);
                break;
            }
            eVar2 = eVar;
        } else {
            eVar2 = eVar;
            kVarL = kVarS.l(i10, obj, obj2, i11 + 5, eVar2);
        }
        return kVarS == kVarL ? this : r(iT, kVarL, eVar2.B);
    }

    public final k m(k kVar, int i10, u1.a aVar, e eVar) {
        k kVar2;
        Object[] objArr;
        k kVarJ;
        if (this == kVar) {
            aVar.f14919a += b();
            return this;
        }
        int i11 = 0;
        if (i10 > 30) {
            u1.b bVar = eVar.B;
            int i12 = kVar.f13622b;
            Object[] objArr2 = this.f13624d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + kVar.f13624d.length);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            int length = this.f13624d.length;
            z00.c cVarE0 = a0.E0(2, a0.I0(0, kVar.f13624d.length));
            int i13 = cVarE0.A;
            int i14 = cVarE0.B;
            int i15 = cVarE0.C;
            if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                while (true) {
                    if (c(kVar.f13624d[i13])) {
                        aVar.f14919a++;
                    } else {
                        Object[] objArr3 = kVar.f13624d;
                        objArrCopyOf[length] = objArr3[i13];
                        objArrCopyOf[length + 1] = objArr3[i13 + 1];
                        length += 2;
                    }
                    if (i13 == i14) {
                        break;
                    }
                    i13 += i15;
                }
            }
            if (length != this.f13624d.length) {
                if (length == kVar.f13624d.length) {
                    return kVar;
                }
                if (length == objArrCopyOf.length) {
                    return new k(0, 0, objArrCopyOf, bVar);
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                kotlin.jvm.internal.m.d(objArrCopyOf2, "copyOf(...)");
                return new k(0, 0, objArrCopyOf2, bVar);
            }
        } else {
            int i16 = this.f13622b | kVar.f13622b;
            int i17 = this.f13621a;
            int i18 = kVar.f13621a;
            int i19 = (i17 ^ i18) & (~i16);
            int i20 = i17 & i18;
            int i21 = i19;
            while (i20 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i20);
                if (kotlin.jvm.internal.m.a(this.f13624d[f(iLowestOneBit)], kVar.f13624d[kVar.f(iLowestOneBit)])) {
                    i21 |= iLowestOneBit;
                } else {
                    i16 |= iLowestOneBit;
                }
                i20 ^= iLowestOneBit;
            }
            if ((i16 & i21) != 0) {
                n1.b("Check failed.");
            }
            if (kotlin.jvm.internal.m.a(this.f13623c, eVar.B) && this.f13621a == i21 && this.f13622b == i16) {
                kVar2 = this;
            } else {
                kVar2 = new k(i21, i16, new Object[Integer.bitCount(i16) + (Integer.bitCount(i21) * 2)], null);
            }
            int i22 = i16;
            int i23 = 0;
            while (i22 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i22);
                Object[] objArr4 = kVar2.f13624d;
                int length2 = (objArr4.length - 1) - i23;
                if (i(iLowestOneBit2)) {
                    kVarJ = s(t(iLowestOneBit2));
                    if (kVar.i(iLowestOneBit2)) {
                        kVarJ = kVarJ.m(kVar.s(kVar.t(iLowestOneBit2)), i10 + 5, aVar, eVar);
                        objArr = objArr4;
                    } else if (kVar.h(iLowestOneBit2)) {
                        int iF = kVar.f(iLowestOneBit2);
                        Object obj = kVar.f13624d[iF];
                        Object objX = kVar.x(iF);
                        int i24 = eVar.F;
                        objArr = objArr4;
                        kVarJ = kVarJ.l(obj != null ? obj.hashCode() : i11, obj, objX, i10 + 5, eVar);
                        if (eVar.F == i24) {
                            aVar.f14919a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (kVar.i(iLowestOneBit2)) {
                        k kVarS = kVar.s(kVar.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.f13624d[iF2];
                            int i25 = i10 + 5;
                            if (kVarS.d(obj2 != null ? obj2.hashCode() : 0, i25, obj2)) {
                                aVar.f14919a++;
                                kVarJ = kVarS;
                            } else {
                                kVarJ = kVarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i25, eVar);
                            }
                        } else {
                            kVarJ = kVarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.f13624d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = kVar.f(iLowestOneBit2);
                        Object obj4 = kVar.f13624d[iF4];
                        kVarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, kVar.x(iF4), i10 + 5, eVar.B);
                    }
                }
                objArr[length2] = kVarJ;
                i23++;
                i22 ^= iLowestOneBit2;
                i11 = 0;
            }
            int i26 = 0;
            while (i21 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i21);
                int i27 = i26 * 2;
                if (kVar.h(iLowestOneBit3)) {
                    int iF5 = kVar.f(iLowestOneBit3);
                    Object[] objArr5 = kVar2.f13624d;
                    objArr5[i27] = kVar.f13624d[iF5];
                    objArr5[i27 + 1] = kVar.x(iF5);
                    if (h(iLowestOneBit3)) {
                        aVar.f14919a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr6 = kVar2.f13624d;
                    objArr6[i27] = this.f13624d[iF6];
                    objArr6[i27 + 1] = x(iF6);
                }
                i26++;
                i21 ^= iLowestOneBit3;
            }
            if (!e(kVar2)) {
                return kVar.e(kVar2) ? kVar : kVar2;
            }
        }
        return this;
    }

    public final k n(int i10, Object obj, int i11, e eVar) {
        k kVarN;
        int iM = 1 << y3.M(i10, i11);
        if (h(iM)) {
            int iF = f(iM);
            if (kotlin.jvm.internal.m.a(obj, this.f13624d[iF])) {
                return p(iF, iM, eVar);
            }
        } else if (i(iM)) {
            int iT = t(iM);
            k kVarS = s(iT);
            if (i11 == 30) {
                z00.c cVarE0 = a0.E0(2, a0.I0(0, kVarS.f13624d.length));
                int i12 = cVarE0.A;
                int i13 = cVarE0.B;
                int i14 = cVarE0.C;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (true) {
                        if (!kotlin.jvm.internal.m.a(obj, kVarS.f13624d[i12])) {
                            if (i12 == i13) {
                                kVarN = kVarS;
                                break;
                            }
                            i12 += i14;
                        } else {
                            kVarN = kVarS.k(i12, eVar);
                            break;
                        }
                    }
                } else {
                    kVarN = kVarS;
                    break;
                }
            } else {
                kVarN = kVarS.n(i10, obj, i11 + 5, eVar);
            }
            return q(kVarS, kVarN, iT, iM, eVar.B);
        }
        return this;
    }

    public final k o(int i10, Object obj, Object obj2, int i11, e eVar) {
        e eVar2;
        k kVarO;
        int iM = 1 << y3.M(i10, i11);
        if (h(iM)) {
            int iF = f(iM);
            return (kotlin.jvm.internal.m.a(obj, this.f13624d[iF]) && kotlin.jvm.internal.m.a(obj2, x(iF))) ? p(iF, iM, eVar) : this;
        }
        if (!i(iM)) {
            return this;
        }
        int iT = t(iM);
        k kVarS = s(iT);
        if (i11 == 30) {
            z00.c cVarE0 = a0.E0(2, a0.I0(0, kVarS.f13624d.length));
            int i12 = cVarE0.A;
            int i13 = cVarE0.B;
            int i14 = cVarE0.C;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (true) {
                    if (!kotlin.jvm.internal.m.a(obj, kVarS.f13624d[i12]) || !kotlin.jvm.internal.m.a(obj2, kVarS.x(i12))) {
                        if (i12 == i13) {
                            kVarO = kVarS;
                            break;
                        }
                        i12 += i14;
                    } else {
                        kVarO = kVarS.k(i12, eVar);
                        break;
                    }
                }
            } else {
                kVarO = kVarS;
                break;
            }
            eVar2 = eVar;
        } else {
            eVar2 = eVar;
            kVarO = kVarS.o(i10, obj, obj2, i11 + 5, eVar2);
        }
        return q(kVarS, kVarO, iT, iM, eVar2.B);
    }

    public final k p(int i10, int i11, e eVar) {
        eVar.i(eVar.F - 1);
        eVar.D = x(i10);
        Object[] objArr = this.f13624d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f13623c != eVar.B) {
            return new k(i11 ^ this.f13621a, this.f13622b, y3.n(i10, objArr), eVar.B);
        }
        this.f13624d = y3.n(i10, objArr);
        this.f13621a ^= i11;
        return this;
    }

    public final k q(k kVar, k kVar2, int i10, int i11, u1.b bVar) {
        u1.b bVar2 = this.f13623c;
        if (kVar2 != null) {
            return (bVar2 == bVar || kVar != kVar2) ? r(i10, kVar2, bVar) : this;
        }
        Object[] objArr = this.f13624d;
        if (objArr.length == 1) {
            return null;
        }
        if (bVar2 != bVar) {
            return new k(this.f13621a, this.f13622b ^ i11, y3.o(i10, objArr), bVar);
        }
        this.f13624d = y3.o(i10, objArr);
        this.f13622b ^= i11;
        return this;
    }

    public final k r(int i10, k kVar, u1.b bVar) {
        Object[] objArr = this.f13624d;
        if (objArr.length == 1 && kVar.f13624d.length == 2 && kVar.f13622b == 0) {
            kVar.f13621a = this.f13622b;
            return kVar;
        }
        if (this.f13623c == bVar) {
            objArr[i10] = kVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = kVar;
        return new k(this.f13621a, this.f13622b, objArrCopyOf, bVar);
    }

    public final k s(int i10) {
        Object obj = this.f13624d[i10];
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (k) obj;
    }

    public final int t(int i10) {
        return (this.f13624d.length - 1) - Integer.bitCount(this.f13622b & (i10 - 1));
    }

    public final qd.j0 u(java.lang.Object r12, int r13, int r14, java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: s1.k.u(java.lang.Object, int, int, java.lang.Object):qd.j0");
    }

    public final k v(int i10, int i11, Object obj) {
        k kVarV;
        int iM = 1 << y3.M(i10, i11);
        if (h(iM)) {
            int iF = f(iM);
            if (!kotlin.jvm.internal.m.a(obj, this.f13624d[iF])) {
                return this;
            }
            Object[] objArr = this.f13624d;
            if (objArr.length != 2) {
                return new k(this.f13621a ^ iM, this.f13622b, y3.n(iF, objArr), null);
            }
        } else {
            if (!i(iM)) {
                return this;
            }
            int iT = t(iM);
            k kVarS = s(iT);
            if (i11 == 30) {
                z00.c cVarE0 = a0.E0(2, a0.I0(0, kVarS.f13624d.length));
                int i12 = cVarE0.A;
                int i13 = cVarE0.B;
                int i14 = cVarE0.C;
                if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                    while (true) {
                        if (!kotlin.jvm.internal.m.a(obj, kVarS.f13624d[i12])) {
                            if (i12 == i13) {
                                kVarV = kVarS;
                                break;
                            }
                            i12 += i14;
                        } else {
                            Object[] objArr2 = kVarS.f13624d;
                            if (objArr2.length != 2) {
                                kVarV = new k(0, 0, y3.n(i12, objArr2), null);
                                break;
                            }
                            kVarV = null;
                            break;
                        }
                    }
                } else {
                    kVarV = kVarS;
                    break;
                }
            } else {
                kVarV = kVarS.v(i10, i11 + 5, obj);
            }
            if (kVarV != null) {
                return kVarS != kVarV ? w(iT, iM, kVarV) : this;
            }
            Object[] objArr3 = this.f13624d;
            if (objArr3.length != 1) {
                return new k(this.f13621a, this.f13622b ^ iM, y3.o(iT, objArr3), null);
            }
        }
        return null;
    }

    public final k w(int i10, int i11, k kVar) {
        Object[] objArr = kVar.f13624d;
        if (objArr.length != 2 || kVar.f13622b != 0) {
            Object[] objArr2 = this.f13624d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i10] = kVar;
            return new k(this.f13621a, this.f13622b, objArrCopyOf, null);
        }
        if (this.f13624d.length == 1) {
            kVar.f13621a = this.f13622b;
            return kVar;
        }
        int iF = f(i11);
        Object[] objArr3 = this.f13624d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        kotlin.jvm.internal.m.d(objArrCopyOf2, "copyOf(...)");
        h00.n.q0(i10 + 2, i10 + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        h00.n.q0(iF + 2, iF, i10, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new k(this.f13621a ^ i11, this.f13622b ^ i11, objArrCopyOf2, null);
    }

    public final Object x(int i10) {
        return this.f13624d[i10 + 1];
    }
}
