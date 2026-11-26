package o1;

import a1.c1;
import java.util.ArrayList;
import l1.n1;

public final class g {

    public final h f11478a;

    public final int[] f11479b;

    public final int f11480c;

    public Object[] f11481d;

    public final int f11482e;

    public boolean f11483f;

    public int f11484g;

    public int f11485h;

    public int f11486i;

    public final c1 f11487j;

    public int f11488k;
    public int l;
    public int m;

    public boolean f11489n;

    public g(h hVar) {
        this.f11478a = hVar;
        this.f11479b = hVar.A;
        int i10 = hVar.B;
        this.f11480c = i10;
        this.f11481d = hVar.C;
        this.f11482e = hVar.D;
        this.f11485h = i10;
        this.f11486i = -1;
        this.f11487j = new c1(2, false);
    }

    public final b a(int i10) {
        ArrayList arrayList = this.f11478a.I;
        int iE = j.e(arrayList, i10, this.f11480c);
        if (iE >= 0) {
            return (b) arrayList.get(iE);
        }
        b bVar = new b(i10);
        arrayList.add(-(iE + 1), bVar);
        return bVar;
    }

    public final Object b(int[] iArr, int i10) {
        int i11 = i10 * 5;
        int i12 = iArr[i11 + 1];
        if ((268435456 & i12) != 0) {
            return this.f11481d[i11 >= iArr.length ? iArr.length : iArr[i11 + 4] + Integer.bitCount(i12 >> 29)];
        }
        return l1.i.f9868a;
    }

    public final void c() {
        this.f11483f = true;
        h hVar = this.f11478a;
        hVar.getClass();
        if (this.f11478a != hVar || hVar.E <= 0) {
            l1.l.a("Unexpected reader close()");
        }
        hVar.E--;
        this.f11481d = new Object[0];
    }

    public final boolean d(int i10) {
        return (this.f11479b[(i10 * 5) + 1] & 67108864) != 0;
    }

    public final void e() {
        if (this.f11488k == 0) {
            if (this.f11484g != this.f11485h) {
                l1.l.a("endGroup() not called at the end of a group");
            }
            int i10 = (this.f11486i * 5) + 2;
            int[] iArr = this.f11479b;
            int i11 = iArr[i10];
            this.f11486i = i11;
            int i12 = this.f11480c;
            this.f11485h = i11 < 0 ? i12 : iArr[(i11 * 5) + 3] + i11;
            int iD = this.f11487j.d();
            if (iD < 0) {
                this.l = 0;
                this.m = 0;
            } else {
                this.l = iD;
                this.m = i11 >= i12 + (-1) ? this.f11482e : iArr[((i11 + 1) * 5) + 4];
            }
        }
    }

    public final Object f() {
        int i10 = this.f11484g;
        if (i10 < this.f11485h) {
            return b(this.f11479b, i10);
        }
        return 0;
    }

    public final int g() {
        int i10 = this.f11484g;
        if (i10 >= this.f11485h) {
            return 0;
        }
        return this.f11479b[i10 * 5];
    }

    public final Object h(int i10, int i11) {
        int[] iArr = this.f11479b;
        int iB = j.b(iArr, i10);
        int i12 = i10 + 1;
        int i13 = iB + i11;
        return i13 < (i12 < this.f11480c ? iArr[(i12 * 5) + 4] : this.f11482e) ? this.f11481d[i13] : l1.i.f9868a;
    }

    public final int i(int i10) {
        return this.f11479b[i10 * 5];
    }

    public final boolean j(int i10) {
        return (this.f11479b[(i10 * 5) + 1] & 134217728) != 0;
    }

    public final boolean k(int i10) {
        return (this.f11479b[(i10 * 5) + 1] & 536870912) != 0;
    }

    public final boolean l(int i10) {
        return (this.f11479b[(i10 * 5) + 1] & 1073741824) != 0;
    }

    public final Object m() {
        int i10;
        if (this.f11488k > 0 || (i10 = this.l) >= this.m) {
            this.f11489n = false;
            return l1.i.f9868a;
        }
        this.f11489n = true;
        Object[] objArr = this.f11481d;
        this.l = i10 + 1;
        return objArr[i10];
    }

    public final Object n(int i10) {
        int i11 = i10 * 5;
        int[] iArr = this.f11479b;
        int i12 = iArr[i11 + 1] & 1073741824;
        if (i12 != 0) {
            return i12 != 0 ? this.f11481d[iArr[i11 + 4]] : l1.i.f9868a;
        }
        return null;
    }

    public final int o(int i10) {
        return this.f11479b[(i10 * 5) + 1] & 67108863;
    }

    public final Object p(int[] iArr, int i10) {
        int i11 = i10 * 5;
        int i12 = iArr[i11 + 1];
        if ((536870912 & i12) == 0) {
            return null;
        }
        return this.f11481d[Integer.bitCount(i12 >> 30) + iArr[i11 + 4]];
    }

    public final int q(int i10) {
        return this.f11479b[(i10 * 5) + 2];
    }

    public final void r(int i10) {
        if (this.f11488k != 0) {
            l1.l.a("Cannot reposition while in an empty region");
        }
        this.f11484g = i10;
        int[] iArr = this.f11479b;
        int i11 = this.f11480c;
        int i12 = i10 < i11 ? iArr[(i10 * 5) + 2] : -1;
        if (i12 != this.f11486i) {
            this.f11486i = i12;
            if (i12 < 0) {
                this.f11485h = i11;
            } else {
                this.f11485h = iArr[(i12 * 5) + 3] + i12;
            }
            this.l = 0;
            this.m = 0;
        }
    }

    public final int s() {
        if (this.f11488k != 0) {
            l1.l.a("Cannot skip while in an empty region");
        }
        int i10 = this.f11484g;
        int i11 = i10 * 5;
        int[] iArr = this.f11479b;
        int i12 = iArr[i11 + 1];
        int i13 = (1073741824 & i12) != 0 ? 1 : i12 & 67108863;
        this.f11484g = iArr[i11 + 3] + i10;
        return i13;
    }

    public final void t() {
        if (!(this.f11488k == 0)) {
            l1.l.a("Cannot skip the enclosing group while in an empty region");
        }
        this.f11484g = this.f11485h;
        this.l = 0;
        this.m = 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SlotReader(current=");
        sb2.append(this.f11484g);
        sb2.append(", key=");
        sb2.append(g());
        sb2.append(", parent=");
        sb2.append(this.f11486i);
        sb2.append(", end=");
        return oi.k.l(sb2, this.f11485h, ')');
    }

    public final void u() {
        if (this.f11488k <= 0) {
            int i10 = this.f11486i;
            int i11 = this.f11484g;
            int i12 = i11 * 5;
            int[] iArr = this.f11479b;
            if (iArr[i12 + 2] != i10) {
                n1.a("Invalid slot table detected");
            }
            int i13 = this.l;
            int i14 = this.m;
            c1 c1Var = this.f11487j;
            if (i13 == 0 && i14 == 0) {
                c1Var.e(-1);
            } else {
                c1Var.e(i13);
            }
            this.f11486i = i11;
            this.f11485h = iArr[i12 + 3] + i11;
            int i15 = i11 + 1;
            this.f11484g = i15;
            this.l = j.b(iArr, i11);
            this.m = i11 >= this.f11480c + (-1) ? this.f11482e : iArr[(i15 * 5) + 4];
        }
    }
}
