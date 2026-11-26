package u;

import java.util.List;

public final class d0 {

    public Object[] f14837a;

    public int f14838b;

    public m1.b f14839c;

    public d0() {
        this(16);
    }

    public d0(int i10) {
        this.f14837a = i10 == 0 ? o0.f14881a : new Object[i10];
    }

    public final void a(Object obj) {
        int i10 = this.f14838b + 1;
        Object[] objArr = this.f14837a;
        if (objArr.length < i10) {
            m(i10, objArr);
        }
        Object[] objArr2 = this.f14837a;
        int i11 = this.f14838b;
        objArr2[i11] = obj;
        this.f14838b = i11 + 1;
    }

    public final void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i10 = this.f14838b;
        int size = list.size() + i10;
        Object[] objArr = this.f14837a;
        if (objArr.length < size) {
            m(size, objArr);
        }
        Object[] objArr2 = this.f14837a;
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            objArr2[i11 + i10] = list.get(i11);
        }
        this.f14838b = list.size() + this.f14838b;
    }

    public final void c(d0 d0Var) {
        kotlin.jvm.internal.m.e(d0Var, "elements");
        if (d0Var.h()) {
            return;
        }
        int i10 = this.f14838b + d0Var.f14838b;
        Object[] objArr = this.f14837a;
        if (objArr.length < i10) {
            m(i10, objArr);
        }
        h00.n.q0(this.f14838b, 0, d0Var.f14838b, d0Var.f14837a, this.f14837a);
        this.f14838b += d0Var.f14838b;
    }

    public final void d() {
        h00.n.y0(0, this.f14838b, (Object) null, this.f14837a);
        this.f14838b = 0;
    }

    public final Object e() {
        if (!h()) {
            return this.f14837a[0];
        }
        v.a.e("ObjectList is empty.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            int i10 = d0Var.f14838b;
            int i11 = this.f14838b;
            if (i10 == i11) {
                Object[] objArr = this.f14837a;
                Object[] objArr2 = d0Var.f14837a;
                z00.e eVarI0 = ab.a0.I0(0, i11);
                int i12 = ((z00.c) eVarI0).A;
                int i13 = ((z00.c) eVarI0).B;
                if (i12 > i13) {
                    return true;
                }
                while (kotlin.jvm.internal.m.a(objArr[i12], objArr2[i12])) {
                    if (i12 == i13) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    public final Object f(int i10) {
        if (i10 >= 0 && i10 < this.f14838b) {
            return this.f14837a[i10];
        }
        o(i10);
        throw null;
    }

    public final int g(Object obj) {
        int i10 = 0;
        if (obj == null) {
            Object[] objArr = this.f14837a;
            int i11 = this.f14838b;
            while (i10 < i11) {
                if (objArr[i10] == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        Object[] objArr2 = this.f14837a;
        int i12 = this.f14838b;
        while (i10 < i12) {
            if (obj.equals(objArr2[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final boolean h() {
        return this.f14838b == 0;
    }

    public final int hashCode() {
        Object[] objArr = this.f14837a;
        int i10 = this.f14838b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final boolean i() {
        return this.f14838b != 0;
    }

    public final boolean j(Object obj) {
        int iG = g(obj);
        if (iG < 0) {
            return false;
        }
        k(iG);
        return true;
    }

    public final Object k(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f14838b)) {
            o(i10);
            throw null;
        }
        Object[] objArr = this.f14837a;
        Object obj = objArr[i10];
        if (i10 != i11 - 1) {
            h00.n.q0(i10, i10 + 1, i11, objArr, objArr);
        }
        int i12 = this.f14838b - 1;
        this.f14838b = i12;
        objArr[i12] = null;
        return obj;
    }

    public final void l(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f14838b) || i11 < 0 || i11 > i12) {
            StringBuilder sbP = oi.k.p(i10, i11, "Start (", ") and end (", ") must be in 0..");
            sbP.append(this.f14838b);
            v.a.d(sbP.toString());
            throw null;
        }
        if (i11 < i10) {
            v.a.c("Start (" + i10 + ") is more than end (" + i11 + ')');
            throw null;
        }
        if (i11 != i10) {
            if (i11 < i12) {
                Object[] objArr = this.f14837a;
                h00.n.q0(i10, i11, i12, objArr, objArr);
            }
            int i13 = this.f14838b;
            int i14 = i13 - (i11 - i10);
            h00.n.y0(i14, i13, (Object) null, this.f14837a);
            this.f14838b = i14;
        }
    }

    public final void m(int i10, Object[] objArr) {
        kotlin.jvm.internal.m.e(objArr, "oldContent");
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i10, (length * 3) / 2)];
        h00.n.q0(0, 0, length, objArr, objArr2);
        this.f14837a = objArr2;
    }

    public final Object n(int i10, Object obj) {
        if (i10 < 0 || i10 >= this.f14838b) {
            o(i10);
            throw null;
        }
        Object[] objArr = this.f14837a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    public final void o(int i10) {
        StringBuilder sbQ = oi.k.q("Index ", i10, " must be in 0..");
        sbQ.append(this.f14838b - 1);
        v.a.d(sbQ.toString());
        throw null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        Object[] objArr = this.f14837a;
        int i10 = this.f14838b;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = objArr[i11];
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            sb2.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
        }
        sb2.append((CharSequence) "]");
        return sb2.toString();
    }
}
