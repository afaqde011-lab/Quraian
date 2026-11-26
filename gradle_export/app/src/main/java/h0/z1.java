package h0;

public abstract class z1 {

    public static final a0 f6476a;

    public static final a0 f6477b;

    public static final a0 f6478c;

    public static final n2 f6479d;

    public static final n2 f6480e;

    public static final n2 f6481f;

    public static final n2 f6482g;

    public static final n2 f6483h;

    public static final n2 f6484i;

    static {
        z zVar = z.B;
        f6476a = new a0(zVar, 1.0f, "fillMaxWidth");
        z zVar2 = z.A;
        f6477b = new a0(zVar2, 1.0f, "fillMaxHeight");
        z zVar3 = z.C;
        f6478c = new a0(zVar3, 1.0f, "fillMaxSize");
        b2.g gVar = b2.b.N;
        int i10 = 19;
        f6479d = new n2(zVar, false, new a1.y1(gVar, i10), gVar, "wrapContentWidth");
        b2.g gVar2 = b2.b.M;
        f6480e = new n2(zVar, false, new a1.y1(gVar2, i10), gVar2, "wrapContentWidth");
        b2.h hVar = b2.b.K;
        int i11 = 20;
        f6481f = new n2(zVar2, false, new a1.y1(hVar, i11), hVar, "wrapContentHeight");
        b2.h hVar2 = b2.b.J;
        f6482g = new n2(zVar2, false, new a1.y1(hVar2, i11), hVar2, "wrapContentHeight");
        b2.i iVar = b2.b.E;
        int i12 = 21;
        f6483h = new n2(zVar3, false, new a1.y1(iVar, i12), iVar, "wrapContentSize");
        b2.i iVar2 = b2.b.A;
        f6484i = new n2(zVar3, false, new a1.y1(iVar2, i12), iVar2, "wrapContentSize");
    }

    public static final b2.r a(b2.r rVar, float f3, float f10) {
        return rVar.V(new g2(f3, f10));
    }

    public static b2.r b(float f3, float f10, int i10) {
        if ((i10 & 1) != 0) {
            f3 = Float.NaN;
        }
        if ((i10 & 2) != 0) {
            f10 = Float.NaN;
        }
        return a(b2.o.A, f3, f10);
    }

    public static final b2.r c(b2.r rVar, float f3) {
        return rVar.V(f3 == 1.0f ? f6477b : new a0(z.A, f3, "fillMaxHeight"));
    }

    public static final b2.r d(b2.r rVar, float f3) {
        return rVar.V(f3 == 1.0f ? f6476a : new a0(z.B, f3, "fillMaxWidth"));
    }

    public static final b2.r e(b2.r rVar, float f3) {
        return rVar.V(new y1(0.0f, f3, 0.0f, f3, true, 5));
    }

    public static final b2.r f(b2.r rVar, float f3, float f10) {
        return rVar.V(new y1(0.0f, f3, 0.0f, f10, true, 5));
    }

    public static b2.r g(b2.r rVar, float f3, float f10, int i10) {
        if ((i10 & 1) != 0) {
            f3 = Float.NaN;
        }
        if ((i10 & 2) != 0) {
            f10 = Float.NaN;
        }
        return f(rVar, f3, f10);
    }

    public static final b2.r h(b2.r rVar, float f3) {
        return rVar.V(new y1(0.0f, f3, 0.0f, f3, false, 5));
    }

    public static final b2.r i(b2.r rVar, float f3) {
        return rVar.V(new y1(f3, f3, f3, f3, false));
    }

    public static final b2.r j(b2.r rVar, float f3, float f10) {
        return rVar.V(new y1(f3, f10, f3, f10, false));
    }

    public static b2.r k(b2.r rVar, float f3, float f10, float f11, float f12, int i10) {
        return rVar.V(new y1(f3, (i10 & 2) != 0 ? Float.NaN : f10, (i10 & 4) != 0 ? Float.NaN : f11, (i10 & 8) != 0 ? Float.NaN : f12, false));
    }

    public static final b2.r l(float f3) {
        return new y1(f3, 0.0f, f3, 0.0f, false, 10);
    }

    public static final b2.r m(b2.r rVar, float f3) {
        return rVar.V(new y1(f3, f3, f3, f3, true));
    }

    public static final b2.r n(b2.r rVar, float f3, float f10) {
        return rVar.V(new y1(f3, f10, f3, f10, true));
    }

    public static final b2.r o(b2.r rVar, float f3, float f10, float f11, float f12) {
        return rVar.V(new y1(f3, f10, f11, f12, true));
    }

    public static b2.r p(b2.r rVar, float f3, float f10, float f11, int i10) {
        if ((i10 & 2) != 0) {
            f10 = Float.NaN;
        }
        if ((i10 & 4) != 0) {
            f11 = Float.NaN;
        }
        return o(rVar, f3, f10, f11, Float.NaN);
    }

    public static final b2.r q(b2.r rVar, float f3) {
        return rVar.V(new y1(f3, 0.0f, f3, 0.0f, true, 10));
    }

    public static final b2.r r(b2.r rVar, float f3, float f10) {
        return rVar.V(new y1(f3, 0.0f, f10, 0.0f, true, 10));
    }

    public static b2.r s(b2.r rVar, float f3, float f10, int i10) {
        if ((i10 & 1) != 0) {
            f3 = Float.NaN;
        }
        if ((i10 & 2) != 0) {
            f10 = Float.NaN;
        }
        return r(rVar, f3, f10);
    }

    public static final b2.r t(b2.r rVar, b2.h hVar, boolean z10) {
        n2 n2Var;
        if (!hVar.equals(b2.b.K) || z10) {
            n2Var = (!hVar.equals(b2.b.J) || z10) ? new n2(z.A, z10, new a1.y1(hVar, 20), hVar, "wrapContentHeight") : f6482g;
        } else {
            n2Var = f6481f;
        }
        return rVar.V(n2Var);
    }

    public static b2.r v(b2.r rVar, int i10) {
        n2 n2Var;
        b2.i iVar = b2.b.E;
        boolean z10 = (i10 & 2) == 0;
        if (!iVar.equals(iVar) || z10) {
            n2Var = (!iVar.equals(b2.b.A) || z10) ? new n2(z.C, z10, new a1.y1(iVar, 21), iVar, "wrapContentSize") : f6484i;
        } else {
            n2Var = f6483h;
        }
        return rVar.V(n2Var);
    }

    public static final b2.r w(b2.r rVar, b2.c cVar, boolean z10) {
        n2 n2Var;
        if (!kotlin.jvm.internal.m.a(cVar, b2.b.N) || z10) {
            n2Var = (!kotlin.jvm.internal.m.a(cVar, b2.b.M) || z10) ? new n2(z.B, z10, new a1.y1(cVar, 19), cVar, "wrapContentWidth") : f6480e;
        } else {
            n2Var = f6479d;
        }
        return rVar.V(n2Var);
    }

    public static b2.r x(b2.r rVar, b2.g gVar, int i10) {
        if ((i10 & 1) != 0) {
            gVar = b2.b.N;
        }
        return w(rVar, gVar, false);
    }
}
