package p0;

import i2.l0;
import i2.t0;
import y3.m;

public abstract class a implements t0 {

    public final b f12239a;

    public final b f12240b;

    public final b f12241c;

    public final b f12242d;

    public a(b bVar, b bVar2, b bVar3, b bVar4) {
        this.f12239a = bVar;
        this.f12240b = bVar2;
        this.f12241c = bVar3;
        this.f12242d = bVar4;
    }

    public static a c(a aVar, b bVar, b bVar2, b bVar3, b bVar4, int i10) {
        if ((i10 & 1) != 0) {
            bVar = aVar.f12239a;
        }
        if ((i10 & 2) != 0) {
            bVar2 = aVar.f12240b;
        }
        if ((i10 & 4) != 0) {
            bVar3 = aVar.f12241c;
        }
        if ((i10 & 8) != 0) {
            bVar4 = aVar.f12242d;
        }
        return aVar.b(bVar, bVar2, bVar3, bVar4);
    }

    @Override
    public final l0 a(long j9, m mVar, y3.c cVar) {
        float fA = this.f12239a.a(j9, cVar);
        float fA2 = this.f12240b.a(j9, cVar);
        float fA3 = this.f12241c.a(j9, cVar);
        float fA4 = this.f12242d.a(j9, cVar);
        float fD = h2.e.d(j9);
        float f3 = fA + fA4;
        if (f3 > fD) {
            float f10 = fD / f3;
            fA *= f10;
            fA4 *= f10;
        }
        float f11 = fA2 + fA3;
        if (f11 > fD) {
            float f12 = fD / f11;
            fA2 *= f12;
            fA3 *= f12;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            g0.a.a("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        return d(j9, fA, fA2, fA3, fA4, mVar);
    }

    public abstract a b(b bVar, b bVar2, b bVar3, b bVar4);

    public abstract l0 d(long j9, float f3, float f10, float f11, float f12, m mVar);
}
