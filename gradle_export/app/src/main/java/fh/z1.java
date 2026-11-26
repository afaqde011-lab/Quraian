package fh;

public final class z1 {

    public final Object f5681a;

    public int f5682b;

    public final a2 f5683c;

    public z1(a2 a2Var, int i10) {
        this.f5683c = a2Var;
        this.f5681a = a2Var.f5664a[i10];
        this.f5682b = i10;
    }

    public final int a() {
        int i10 = this.f5682b;
        Object obj = this.f5681a;
        a2 a2Var = this.f5683c;
        if (i10 == -1 || i10 >= a2Var.f5666c || !w50.c.A(obj, a2Var.f5664a[i10])) {
            this.f5682b = a2Var.c(obj);
        }
        int i11 = this.f5682b;
        if (i11 == -1) {
            return 0;
        }
        return a2Var.f5665b[i11];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z1) {
            z1 z1Var = (z1) obj;
            if (a() == z1Var.a() && w50.c.A(this.f5681a, z1Var.f5681a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f5681a;
        return a() ^ (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f5681a);
        int iA = a();
        if (iA == 1) {
            return strValueOf;
        }
        return strValueOf + " x " + iA;
    }
}
