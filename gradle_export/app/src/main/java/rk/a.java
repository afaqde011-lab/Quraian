package rk;

import android.graphics.Path;
import android.graphics.RectF;
import i2.g;
import kotlin.jvm.internal.m;

public final class a implements d {

    public final qk.b f13608a;

    public final double f13609b;

    public final double f13610c;

    public final double f13611d;

    public a(qk.b bVar, double d3, double d5, double d10) {
        this.f13608a = bVar;
        this.f13609b = d3;
        this.f13610c = d5;
        this.f13611d = d10;
    }

    @Override
    public final qk.b a() {
        qk.b bVar = this.f13608a;
        double d3 = bVar.f13039a;
        double d5 = this.f13610c;
        double dCos = Math.cos(d5);
        double d10 = this.f13609b;
        return new qk.b((dCos * d10) + d3, (Math.sin(d5) * d10) + bVar.f13040b);
    }

    @Override
    public final void b(g gVar) {
        Path path = gVar.f7128a;
        qk.b bVar = this.f13608a;
        double d3 = bVar.f13039a;
        double d5 = this.f13609b;
        double d10 = bVar.f13040b;
        path.arcTo(new RectF((float) (d3 - d5), (float) (d10 - d5), (float) (d3 + d5), (float) (d10 + d5)), (float) (this.f13610c * 57.29577951308232d), (float) (this.f13611d * 57.29577951308232d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f13608a, aVar.f13608a) && Double.compare(this.f13609b, aVar.f13609b) == 0 && Double.compare(this.f13610c, aVar.f13610c) == 0 && Double.compare(this.f13611d, aVar.f13611d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f13611d) + ((Double.hashCode(this.f13610c) + ((Double.hashCode(this.f13609b) + (this.f13608a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Arc(center=" + this.f13608a + ", radius=" + this.f13609b + ", startAngle=" + this.f13610c + ", sweepAngle=" + this.f13611d + ")";
    }
}
