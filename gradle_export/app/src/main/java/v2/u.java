package v2;

import java.util.ArrayList;

public final class u {

    public final long f15417a;

    public final long f15418b;

    public final long f15419c;

    public final long f15420d;

    public final boolean f15421e;

    public final float f15422f;

    public final int f15423g;

    public final boolean f15424h;

    public final ArrayList f15425i;

    public final long f15426j;

    public final float f15427k;
    public final long l;
    public final long m;

    public u(long j9, long j10, long j11, long j12, boolean z10, float f3, int i10, boolean z11, ArrayList arrayList, long j13, float f10, long j14, long j15) {
        this.f15417a = j9;
        this.f15418b = j10;
        this.f15419c = j11;
        this.f15420d = j12;
        this.f15421e = z10;
        this.f15422f = f3;
        this.f15423g = i10;
        this.f15424h = z11;
        this.f15425i = arrayList;
        this.f15426j = j13;
        this.f15427k = f10;
        this.l = j14;
        this.m = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return r.e(this.f15417a, uVar.f15417a) && this.f15418b == uVar.f15418b && h2.b.b(this.f15419c, uVar.f15419c) && h2.b.b(this.f15420d, uVar.f15420d) && this.f15421e == uVar.f15421e && Float.compare(this.f15422f, uVar.f15422f) == 0 && this.f15423g == uVar.f15423g && this.f15424h == uVar.f15424h && this.f15425i.equals(uVar.f15425i) && h2.b.b(this.f15426j, uVar.f15426j) && Float.compare(this.f15427k, uVar.f15427k) == 0 && h2.b.b(this.l, uVar.l) && h2.b.b(this.m, uVar.m);
    }

    public final int hashCode() {
        return Long.hashCode(this.m) + w.c.f(w.c.c(this.f15427k, w.c.f((this.f15425i.hashCode() + w.c.e(w.c.d(this.f15423g, w.c.c(this.f15422f, w.c.e(w.c.f(w.c.f(w.c.f(Long.hashCode(this.f15417a) * 31, this.f15418b, 31), this.f15419c, 31), this.f15420d, 31), 31, this.f15421e), 31), 31), 31, this.f15424h)) * 31, this.f15426j, 31), 31), this.l, 31);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) r.j(this.f15417a)) + ", uptime=" + this.f15418b + ", positionOnScreen=" + ((Object) h2.b.h(this.f15419c)) + ", position=" + ((Object) h2.b.h(this.f15420d)) + ", down=" + this.f15421e + ", pressure=" + this.f15422f + ", type=" + ((Object) a0.a(this.f15423g)) + ", activeHover=" + this.f15424h + ", historical=" + this.f15425i + ", scrollDelta=" + ((Object) h2.b.h(this.f15426j)) + ", scaleGestureFactor=" + this.f15427k + ", panGestureOffset=" + ((Object) h2.b.h(this.l)) + ", originalEventPosition=" + ((Object) h2.b.h(this.m)) + ')';
    }
}
