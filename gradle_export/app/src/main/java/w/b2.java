package w;

import l1.p2;

public abstract class b2 {

    public static final x.b1 f15742a = x.c.v(0.0f, 0.0f, null, 7);

    public static final p2 a(long j9, x.y yVar, String str, l1.j jVar, int i10, int i11) {
        if ((i11 & 2) != 0) {
            yVar = f15742a;
        }
        x.y yVar2 = yVar;
        if ((i11 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        l1.g0 g0Var = (l1.g0) jVar;
        boolean zG = g0Var.g(i2.t.f(j9));
        Object objN = g0Var.N();
        if (zG || objN == l1.i.f9868a) {
            x.r1 r1Var = new x.r1(f.G, new g(i2.t.f(j9), 3));
            g0Var.n0(r1Var);
            objN = r1Var;
        }
        return x.d.c(new i2.t(j9), (x.r1) objN, yVar2, null, str2, jVar, ((i10 << 3) & 896) | ((i10 << 6) & 57344), 8);
    }
}
