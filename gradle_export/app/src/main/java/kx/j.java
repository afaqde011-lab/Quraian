package kx;

import jx.s;
import qx.o;

public final class j implements u00.a {
    public final int A;
    public final float B;
    public final Object C;

    public j(Object obj, float f, int i) {
        this.A = i;
        this.C = obj;
        this.B = f;
    }

    @Override
    public final Object invoke() {
        int i = this.A;
        boolean z = false;
        float f = this.B;
        Object obj = this.C;
        switch (i) {
            case 0:
                s sVar = (s) obj;
                if (sVar.b()) {
                    float f2 = i.a;
                    if (y3.f.a((f - eq.m.c) / 2, i.a + i.b + i.c) >= 0 || sVar.g) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                o oVar = (o) obj;
                if (oVar.b()) {
                    float f3 = rx.b.a;
                    if (y3.f.a((f - eq.m.c) / 2, rx.b.a + rx.b.b + rx.b.c) >= 0 || oVar.h) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
