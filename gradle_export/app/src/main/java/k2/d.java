package k2;

import a1.i;
import b2.v;
import b3.o0;
import i2.m;
import i2.q;
import kh.n;
import u00.k;

public interface d extends y3.c {
    static void B(o0 o0Var, q qVar, long j9, long j10, long j11, e eVar, int i10) {
        if ((i10 & 2) != 0) {
            j9 = 0;
        }
        long j12 = j9;
        o0Var.L(qVar, j12, (i10 & 4) != 0 ? n0(o0Var.A.b(), j12) : j10, j11, 1.0f, (i10 & 32) != 0 ? g.f8922a : eVar);
    }

    static void M(d dVar, long j9, float f3, long j10, int i10, int i11) {
        if ((i11 & 4) != 0) {
            j10 = dVar.Y0();
        }
        long j11 = j10;
        if ((i11 & 64) != 0) {
            i10 = 3;
        }
        dVar.E(j9, f3, j11, i10);
    }

    static void P0(d dVar, i2.g gVar, q qVar, float f3, h hVar, int i10) {
        if ((i10 & 4) != 0) {
            f3 = 1.0f;
        }
        float f10 = f3;
        e eVar = hVar;
        if ((i10 & 8) != 0) {
            eVar = g.f8922a;
        }
        dVar.g0(gVar, qVar, f10, eVar, (i10 & 32) != 0 ? 3 : 0);
    }

    static void R(d dVar, long j9, long j10, long j11, float f3, h hVar, int i10, int i11) {
        long j12 = (i11 & 2) != 0 ? 0L : j10;
        dVar.Q0(j9, j12, (i11 & 4) != 0 ? n0(dVar.b(), j12) : j11, (i11 & 8) != 0 ? 1.0f : f3, (i11 & 16) != 0 ? g.f8922a : hVar, (i11 & 64) != 0 ? 3 : i10);
    }

    static void X0(d dVar, i2.g gVar, long j9, float f3, e eVar, int i10) {
        if ((i10 & 4) != 0) {
            f3 = 1.0f;
        }
        float f10 = f3;
        if ((i10 & 8) != 0) {
            eVar = g.f8922a;
        }
        dVar.h1(gVar, j9, f10, eVar);
    }

    static void Z(o0 o0Var, l2.b bVar, k kVar) {
        o0Var.M0(n.k0(o0Var.A.b()), bVar, kVar);
    }

    static void a1(d dVar, long j9, long j10, long j11, long j12, e eVar, int i10) {
        long j13 = (i10 & 2) != 0 ? 0L : j10;
        dVar.q(j9, j13, (i10 & 4) != 0 ? n0(dVar.b(), j13) : j11, j12, (i10 & 16) != 0 ? g.f8922a : eVar);
    }

    static void m(d dVar, i2.d dVar2, long j9, float f3, m mVar, int i10) {
        if ((i10 & 2) != 0) {
            j9 = 0;
        }
        long j10 = j9;
        if ((i10 & 4) != 0) {
            f3 = 1.0f;
        }
        float f10 = f3;
        if ((i10 & 16) != 0) {
            mVar = null;
        }
        dVar.d1(dVar2, j10, f10, mVar, 3);
    }

    static void m0(d dVar, q qVar, long j9, long j10, float f3, e eVar, int i10, int i11) {
        if ((i11 & 2) != 0) {
            j9 = 0;
        }
        long j11 = j9;
        dVar.S(qVar, j11, (i11 & 4) != 0 ? n0(dVar.b(), j11) : j10, (i11 & 8) != 0 ? 1.0f : f3, (i11 & 16) != 0 ? g.f8922a : eVar, (i11 & 64) != 0 ? 3 : i10);
    }

    static long n0(long j9, long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32)) - Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L)) - Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    static void y(d dVar, i2.d dVar2, long j9, long j10, float f3, m mVar, int i10, int i11) {
        dVar.u0(dVar2, 0L, j9, (i11 & 16) != 0 ? j9 : j10, (i11 & 32) != 0 ? 1.0f : f3, mVar, (i11 & 512) != 0 ? 1 : i10);
    }

    void E(long j9, float f3, long j10, int i10);

    i G0();

    void K0(long j9, float f3, float f10, long j10, long j11, float f11, h hVar);

    void L(q qVar, long j9, long j10, long j11, float f3, e eVar);

    default void M0(long j9, l2.b bVar, k kVar) {
        bVar.e(this, getLayoutDirection(), j9, new v(this, kVar, 11));
    }

    void P(long j9, long j10, long j11, float f3, int i10);

    void Q0(long j9, long j10, long j11, float f3, e eVar, int i10);

    void S(q qVar, long j9, long j10, float f3, e eVar, int i10);

    default long Y0() {
        return ca.v.x(G0().q());
    }

    default long b() {
        return G0().q();
    }

    void d1(i2.d dVar, long j9, float f3, m mVar, int i10);

    void g0(i2.g gVar, q qVar, float f3, e eVar, int i10);

    y3.m getLayoutDirection();

    void h1(i2.g gVar, long j9, float f3, e eVar);

    void q(long j9, long j10, long j11, long j12, e eVar);

    void u0(i2.d dVar, long j9, long j10, long j11, float f3, m mVar, int i10);

    void x(q qVar, float f3, long j9, long j10, e eVar);
}
