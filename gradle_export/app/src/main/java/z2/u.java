package z2;

import java.io.Serializable;

public final class u {

    public final int f17158a;

    public final t f17159b;

    public final t f17160c;

    public final t f17161d;

    public final t f17162e;

    public final Serializable f17163f;

    public u(String str) {
        this.f17158a = 1;
        this.f17163f = str;
        this.f17159b = new t(1, null);
        this.f17160c = new t(0, null);
        this.f17161d = new t(1, null);
        this.f17162e = new t(0, null);
    }

    public u(u[] uVarArr) {
        this.f17158a = 0;
        this.f17163f = uVarArr;
        int length = uVarArr.length;
        t[] tVarArr = new t[length];
        for (int i10 = 0; i10 < length; i10++) {
            tVarArr[i10] = ((u[]) this.f17163f)[i10].b();
        }
        this.f17159b = new t(1, new z1(tVarArr, 0));
        int length2 = ((u[]) this.f17163f).length;
        t[] tVarArr2 = new t[length2];
        for (int i11 = 0; i11 < length2; i11++) {
            tVarArr2[i11] = ((u[]) this.f17163f)[i11].d();
        }
        this.f17160c = new t(0, new s(tVarArr2, 0));
        int length3 = ((u[]) this.f17163f).length;
        t[] tVarArr3 = new t[length3];
        for (int i12 = 0; i12 < length3; i12++) {
            tVarArr3[i12] = ((u[]) this.f17163f)[i12].c();
        }
        this.f17161d = new t(1, new z1(tVarArr3, 1));
        int length4 = ((u[]) this.f17163f).length;
        t[] tVarArr4 = new t[length4];
        for (int i13 = 0; i13 < length4; i13++) {
            tVarArr4[i13] = ((u[]) this.f17163f)[i13].a();
        }
        this.f17162e = new t(0, new s(tVarArr4, 1));
    }

    public final t a() {
        switch (this.f17158a) {
            case 0:
                break;
        }
        return this.f17162e;
    }

    public final t b() {
        switch (this.f17158a) {
            case 0:
                break;
        }
        return this.f17159b;
    }

    public final t c() {
        switch (this.f17158a) {
            case 0:
                break;
        }
        return this.f17161d;
    }

    public final t d() {
        switch (this.f17158a) {
            case 0:
                break;
        }
        return this.f17160c;
    }

    public final String toString() {
        switch (this.f17158a) {
            case 0:
                return h00.n.M0((u[]) this.f17163f, (String) null, "innermostOf(", ")", (u00.k) null, 57);
            default:
                String str = (String) this.f17163f;
                return str != null ? oi.k.g(')', "RectRulers(", str) : super.toString();
        }
    }
}
