package a2;

import com.google.android.gms.internal.measurement.y3;

public final class m extends b {
    public final int B;
    public final Object C;

    public m(Object obj, int i10) {
        super(0);
        this.B = i10;
        this.C = obj;
    }

    @Override
    public final int f(o1.b bVar) {
        switch (this.B) {
            case 0:
                o1.g gVar = (o1.g) this.C;
                return gVar.i(gVar.f11478a.a(y3.q(bVar)));
            default:
                o1.k kVar = (o1.k) this.C;
                return kVar.s(kVar.c(y3.q(bVar)));
        }
    }

    @Override
    public final o1.c j(o1.b bVar) {
        switch (this.B) {
            case 0:
                o1.h hVar = ((o1.g) this.C).f11478a;
                hVar.m(hVar.a(y3.q(bVar)));
                break;
            default:
                o1.k kVar = (o1.k) this.C;
                kVar.Q(kVar.c(y3.q(bVar)));
                break;
        }
        return null;
    }
}
