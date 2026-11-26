package p1;

import l1.r1;
import l1.z1;

public final class r extends k20.d {

    public static final r f12288e;

    public static final r f12289f;

    public static final r f12290g;

    public static final r f12291h;

    public final int f12292d;

    static {
        int i10 = 1;
        f12288e = new r(i10, 2, 0);
        int i11 = 1;
        f12289f = new r(i11, i11, 1);
        f12290g = new r(i10, 2, 2);
        int i12 = 1;
        f12291h = new r(i12, i12, 3);
    }

    public r(int i10, int i11, int i12) {
        super(i10, i11, 1, (byte) 0);
        this.f12292d = i12;
    }

    public final void d(androidx.media3.common.k kVar, l1.a aVar, o1.k kVar2, v1.i iVar, k0 k0Var) {
        switch (this.f12292d) {
            case 0:
                Object objInvoke = ((u00.a) kVar.d(0)).invoke();
                o1.b bVar = (o1.b) kVar.d(1);
                int iC = kVar.c(0);
                bVar.getClass();
                kVar2.X(kVar2.c(bVar), objInvoke);
                aVar.n(iC, objInvoke);
                aVar.e(objInvoke);
                break;
            case 1:
                o1.b bVar2 = (o1.b) kVar.d(0);
                int iC2 = kVar.c(0);
                aVar.l();
                bVar2.getClass();
                aVar.d(iC2, kVar2.E(kVar2.c(bVar2)));
                break;
            case 2:
                Object objD = kVar.d(0);
                o1.b bVar3 = (o1.b) kVar.d(1);
                int iC3 = kVar.c(0);
                if (objD instanceof z1) {
                    iVar.h((z1) objD);
                }
                Object objM = kVar2.M(kVar2.c(bVar3), iC3, objD);
                if (objM instanceof z1) {
                    iVar.e((z1) objM);
                } else if (objM instanceof r1) {
                    ((r1) objM).d();
                }
                break;
            default:
                Object objD2 = kVar.d(0);
                int iC4 = kVar.c(0);
                if (objD2 instanceof z1) {
                    iVar.h((z1) objD2);
                }
                Object objM2 = kVar2.M(kVar2.f11507t, iC4, objD2);
                if (objM2 instanceof z1) {
                    iVar.e((z1) objM2);
                } else if (objM2 instanceof r1) {
                    ((r1) objM2).d();
                }
                break;
        }
    }

    public o1.b f(androidx.media3.common.k kVar) {
        switch (this.f12292d) {
            case 0:
                return (o1.b) kVar.d(1);
            case 1:
                return (o1.b) kVar.d(0);
            default:
                return super.f(kVar);
        }
    }
}
