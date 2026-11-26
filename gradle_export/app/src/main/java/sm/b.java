package sm;

import com.google.android.gms.internal.measurement.b5;

public final class b implements u00.a {
    public final int A;
    public final tm.e B;

    public b(tm.e eVar, int i) {
        this.A = i;
        this.B = eVar;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                return Float.valueOf(b5.A(1.0f, 1.2f, this.B.b()));
            case 1:
                return mk.a.a(mk.a.e, 0.0f, 0.0f, this.B.b(), 11);
            case 2:
                return new nk.f(0.0f, this.B.b(), 23, 0L);
            case 3:
                float fB = this.B.b();
                return new nk.a(8.0f * fB, fB, 22);
            case 4:
                return mk.a.a(mk.a.e, 0.0f, 0.0f, this.B.b(), 11);
            case 5:
                float fB2 = this.B.b();
                mk.a aVar = mk.a.f;
                return mk.a.a(aVar, aVar.a / 1.5f, aVar.b / 1.5f, fB2, 8);
            case 6:
                float fB3 = this.B.b();
                return new nk.a(4.0f * fB3, fB3, 22);
            case 7:
                float fB4 = this.B.b();
                mk.a aVar2 = mk.a.f;
                return mk.a.a(aVar2, aVar2.a / 1.5f, aVar2.b / 1.5f, fB4, 8);
            case 8:
                float fB5 = this.B.b();
                return new nk.a(4.0f * fB5, fB5, 22);
            case 9:
                tm.e eVar = this.B;
                eVar.g.invoke(eVar);
                eVar.f();
                return g00.b0.a;
            default:
                return Float.valueOf(((Number) this.B.m.d()).floatValue());
        }
    }
}
