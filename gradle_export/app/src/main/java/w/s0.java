package w;

import java.util.LinkedHashMap;

public abstract class s0 {

    public static final x.r1 f15806a = new x.r1(f.I, f.J);

    public static final x.b1 f15807b = x.c.v(0.0f, 400.0f, null, 5);

    public static final x.b1 f15808c;

    public static final x.b1 f15809d;

    static {
        x.c.v(0.0f, 400.0f, null, 5);
        long j9 = 1;
        long j10 = (j9 & 4294967295L) | (j9 << 32);
        f15808c = x.c.v(0.0f, 400.0f, new y3.j(j10), 1);
        f15809d = x.c.v(0.0f, 400.0f, new y3.l(j10), 1);
    }

    public static final x0 a(b2.d dVar, u00.k kVar, x.y yVar) {
        return new x0(new g2((z0) null, (d2) null, new i0(dVar, kVar, yVar), (d1) null, (LinkedHashMap) null, 123));
    }

    public static x0 b(x.y yVar, int i10) {
        b2.i iVar;
        b2.h hVar = b2.b.L;
        b2.h hVar2 = b2.b.J;
        int i11 = 1;
        if ((i10 & 1) != 0) {
            long j9 = 1;
            yVar = x.c.v(0.0f, 400.0f, new y3.l((j9 & 4294967295L) | (j9 << 32)), 1);
        }
        b2.h hVar3 = (i10 & 2) != 0 ? hVar : hVar2;
        if (kotlin.jvm.internal.m.a(hVar3, hVar2)) {
            iVar = b2.b.B;
        } else {
            iVar = kotlin.jvm.internal.m.a(hVar3, hVar) ? b2.b.H : b2.b.E;
        }
        return a(iVar, new f(i11, 16), yVar);
    }

    public static x0 c(x.y yVar, int i10) {
        if ((i10 & 1) != 0) {
            yVar = x.c.v(0.0f, 400.0f, null, 5);
        }
        return new x0(new g2(new z0(0.0f, yVar), (d2) null, (i0) null, (d1) null, (LinkedHashMap) null, 126));
    }

    public static y0 d(x.y yVar, int i10) {
        if ((i10 & 1) != 0) {
            yVar = x.c.v(0.0f, 400.0f, null, 5);
        }
        return new y0(new g2(new z0(0.0f, yVar), (d2) null, (i0) null, (d1) null, (LinkedHashMap) null, 126));
    }

    public static x0 e(x.y yVar, float f3, int i10) {
        if ((i10 & 2) != 0) {
            f3 = 0.0f;
        }
        return new x0(new g2((z0) null, (d2) null, (i0) null, new d1(f3, i2.w0.f7175b, yVar), (LinkedHashMap) null, 119));
    }

    public static y0 f(x.q1 q1Var, float f3, int i10) {
        x.y yVarV = q1Var;
        if ((i10 & 1) != 0) {
            yVarV = x.c.v(0.0f, 400.0f, null, 5);
        }
        if ((i10 & 2) != 0) {
            f3 = 0.0f;
        }
        return new y0(new g2((z0) null, (d2) null, (i0) null, new d1(f3, i2.w0.f7175b, yVarV), (LinkedHashMap) null, 119));
    }

    public static final y0 g(b2.d dVar, u00.k kVar, x.y yVar) {
        return new y0(new g2((z0) null, (d2) null, new i0(dVar, kVar, yVar), (d1) null, (LinkedHashMap) null, 123));
    }

    public static y0 h(x.y yVar, int i10) {
        b2.i iVar;
        b2.h hVar = b2.b.L;
        b2.h hVar2 = b2.b.J;
        int i11 = 1;
        if ((i10 & 1) != 0) {
            long j9 = 1;
            yVar = x.c.v(0.0f, 400.0f, new y3.l((j9 & 4294967295L) | (j9 << 32)), 1);
        }
        b2.h hVar3 = (i10 & 2) != 0 ? hVar : hVar2;
        if (kotlin.jvm.internal.m.a(hVar3, hVar2)) {
            iVar = b2.b.B;
        } else {
            iVar = kotlin.jvm.internal.m.a(hVar3, hVar) ? b2.b.H : b2.b.E;
        }
        return g(iVar, new f(i11, 17), yVar);
    }

    public static x0 i(u00.k kVar) {
        long j9 = 1;
        return new x0(new g2((z0) null, new d2(new r0(2, kVar), x.c.v(0.0f, 400.0f, new y3.j((j9 & 4294967295L) | (j9 << 32)), 1)), (i0) null, (d1) null, (LinkedHashMap) null, 125));
    }

    public static final x0 j(u00.k kVar, x.y yVar) {
        return new x0(new g2((z0) null, new d2(new r0(3, kVar), yVar), (i0) null, (d1) null, (LinkedHashMap) null, 125));
    }

    public static y0 k(u00.k kVar) {
        long j9 = 1;
        return new y0(new g2((z0) null, new d2(new r0(4, kVar), x.c.v(0.0f, 400.0f, new y3.j((j9 & 4294967295L) | (j9 << 32)), 1)), (i0) null, (d1) null, (LinkedHashMap) null, 125));
    }

    public static final y0 l(u00.k kVar, x.y yVar) {
        return new y0(new g2((z0) null, new d2(new r0(5, kVar), yVar), (i0) null, (d1) null, (LinkedHashMap) null, 125));
    }
}
