package i20;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;

public final class a extends o20.c {
    public final int a;

    public a(int i) {
        this.a = i;
    }

    @Override
    public final Object a(o20.f fVar, o20.h hVar) {
        switch (this.a) {
            case 0:
                return new h(fVar, hVar);
            case 1:
                return new f(fVar, hVar);
            case 2:
                return new e(fVar, hVar);
            case 3:
                return new k(fVar, hVar);
            case 4:
                return new l(fVar);
            case 5:
                return new n(fVar, hVar);
            case 6:
                return new p(fVar, hVar);
            case 7:
                return new u(fVar, hVar);
            case 8:
                return new w(fVar, hVar);
            case 9:
                return new z(fVar, hVar);
            case 10:
                return new b0(fVar, hVar);
            case 11:
                return new f0(fVar, hVar);
            case 12:
                return new h0(fVar, hVar);
            case 13:
                return new j0(fVar, hVar);
            case 14:
                return new n0(fVar, hVar);
            case 15:
                return new m0(fVar);
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                return new p0(fVar);
            case 17:
                return new u0(fVar, hVar);
            case 18:
                return new s0(fVar, hVar);
            case 19:
                return new w0(fVar, hVar);
            case 20:
                return new z0(fVar, hVar);
            case 21:
                return new a1(fVar, hVar);
            case 22:
                return new c1(fVar, hVar);
            case 23:
                return new g1(fVar);
            case 24:
                return new h1(fVar, hVar);
            case 25:
                return new l20.b(fVar);
            case 26:
                return new l20.c(fVar);
            case 27:
                return new l20.d(fVar, hVar);
            case 28:
                return new l20.i(fVar, hVar);
            default:
                return new l20.h(fVar);
        }
    }
}
