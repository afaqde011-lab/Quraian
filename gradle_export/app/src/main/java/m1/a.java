package m1;

import ab.a0;
import h00.n;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;
import l1.r0;
import u.d0;
import u.i0;
import u.o0;
import u00.k;

public final class a {

    public final i0 f10412a;

    public static final void a(i0 i0Var, Object obj, Object obj2) {
        int iF = i0Var.f(obj);
        boolean z10 = iF < 0;
        Object obj3 = z10 ? null : i0Var.f14858c[iF];
        if (obj3 != null) {
            if (obj3 instanceof d0) {
                d0 d0Var = (d0) obj3;
                d0Var.a(obj2);
                obj2 = d0Var;
            } else {
                Object[] objArr = o0.f14881a;
                d0 d0Var2 = new d0(2);
                d0Var2.a(obj3);
                d0Var2.a(obj2);
                obj2 = d0Var2;
            }
        }
        if (!z10) {
            i0Var.f14858c[iF] = obj2;
            return;
        }
        int i10 = ~iF;
        i0Var.f14857b[i10] = obj;
        i0Var.f14858c[i10] = obj2;
    }

    public static final Object b(i0 i0Var, r0 r0Var) {
        Object objG = i0Var.g(r0Var);
        if (objG == null) {
            return null;
        }
        if (!(objG instanceof d0)) {
            i0Var.k(r0Var);
            return objG;
        }
        d0 d0Var = (d0) objG;
        if (d0Var.h()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i10 = d0Var.f14838b - 1;
        Object objF = d0Var.f(i10);
        d0Var.k(i10);
        m.c(objF, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (d0Var.h()) {
            i0Var.k(r0Var);
        }
        if (d0Var.f14838b == 1) {
            i0Var.m(r0Var, d0Var.e());
        }
        return objF;
    }

    public static final void c(i0 i0Var, r0 r0Var, k kVar) {
        Object objG = i0Var.g(r0Var);
        if (objG != null) {
            if (!(objG instanceof d0)) {
                if (((Boolean) kVar.invoke(objG)).booleanValue()) {
                    i0Var.k(r0Var);
                    return;
                }
                return;
            }
            d0 d0Var = (d0) objG;
            int i10 = d0Var.f14838b;
            Object[] objArr = d0Var.f14837a;
            int i11 = 0;
            z00.e eVarI0 = a0.I0(0, i10);
            int i12 = ((z00.c) eVarI0).A;
            int i13 = ((z00.c) eVarI0).B;
            if (i12 <= i13) {
                while (true) {
                    objArr[i12 - i11] = objArr[i12];
                    if (((Boolean) kVar.invoke(objArr[i12])).booleanValue()) {
                        i11++;
                    }
                    if (i12 == i13) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            n.y0(i10 - i11, i10, (Object) null, objArr);
            d0Var.f14838b -= i11;
            if (d0Var.h()) {
                i0Var.k(r0Var);
            }
            if (d0Var.f14838b == 0) {
                i0Var.m(r0Var, d0Var.e());
            }
        }
    }

    public static final d0 d(i0 i0Var) {
        if (i0Var.i()) {
            d0 d0Var = o0.f14882b;
            m.c(d0Var, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
            return d0Var;
        }
        d0 d0Var2 = new d0();
        Object[] objArr = i0Var.f14858c;
        long[] jArr = i0Var.f14856a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j9 = jArr[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j9) < 128) {
                            Object obj = objArr[(i10 << 3) + i12];
                            if (obj instanceof d0) {
                                d0Var2.c((d0) obj);
                            } else {
                                m.c(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                d0Var2.a(obj);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return d0Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return m.a(this.f10412a, ((a) obj).f10412a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10412a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f10412a + ')';
    }
}
