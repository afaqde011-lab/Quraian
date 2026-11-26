package rk;

import i2.g;
import kotlin.jvm.internal.m;

public final class b implements d {

    public final qk.b f13612a;

    public final qk.b f13613b;

    public final qk.b f13614c;

    public final qk.b f13615d;

    public b(qk.b bVar, qk.b bVar2, qk.b bVar3, qk.b bVar4) {
        this.f13612a = bVar;
        this.f13613b = bVar2;
        this.f13614c = bVar3;
        this.f13615d = bVar4;
    }

    @Override
    public final qk.b a() {
        return this.f13612a;
    }

    @Override
    public final void b(g gVar) {
        qk.b bVar = this.f13613b;
        float f3 = (float) bVar.f13039a;
        float f10 = (float) bVar.f13040b;
        qk.b bVar2 = this.f13614c;
        float f11 = (float) bVar2.f13039a;
        float f12 = (float) bVar2.f13040b;
        qk.b bVar3 = this.f13615d;
        gVar.f7128a.cubicTo(f3, f10, f11, f12, (float) bVar3.f13039a, (float) bVar3.f13040b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.f13612a, bVar.f13612a) && m.a(this.f13613b, bVar.f13613b) && m.a(this.f13614c, bVar.f13614c) && m.a(this.f13615d, bVar.f13615d);
    }

    public final int hashCode() {
        return this.f13615d.hashCode() + ((this.f13614c.hashCode() + ((this.f13613b.hashCode() + (this.f13612a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Cubic(p0=" + this.f13612a + ", p1=" + this.f13613b + ", p2=" + this.f13614c + ", p3=" + this.f13615d + ")";
    }
}
