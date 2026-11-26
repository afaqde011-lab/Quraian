package mu;

import com.google.android.gms.internal.measurement.z3;
import g00.b0;
import h0.z1;
import l1.g0;

public final class j implements u00.n {
    public final int A = 1;
    public final u00.k B;
    public final boolean C;
    public final boolean D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;

    public j(String str, u00.k kVar, b2.r rVar, u00.a aVar, boolean z, boolean z2, g2.t tVar, int i) {
        this.E = str;
        this.B = kVar;
        this.F = rVar;
        this.G = aVar;
        this.C = z;
        this.D = z2;
        this.H = tVar;
    }

    public j(lu.z zVar, ju.f fVar, u00.k kVar, boolean z, boolean z2, lu.z zVar2, jk.a aVar) {
        this.E = zVar;
        this.G = fVar;
        this.B = kVar;
        this.C = z;
        this.D = z2;
        this.F = zVar2;
        this.H = aVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        b2.r rVar;
        b2.r rVar2;
        boolean zG;
        Object objN;
        switch (this.A) {
            case 0:
                lu.z zVar = (lu.z) this.E;
                ju.f fVar = (ju.f) this.G;
                lu.z zVar2 = (lu.z) this.F;
                jk.a aVar = (jk.a) this.H;
                g0 g0Var = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var2 = g0Var;
                if (!g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g0Var2.V();
                } else if (!zVar.a || fVar.a.equals("reciters")) {
                    g0Var2.c0(-1027150605);
                    g0Var2.r(false);
                    boolean z = zVar.b;
                    u00.k kVar = this.B;
                    Object obj3 = l1.i.a;
                    if (!z || fVar.a.equals("reciters")) {
                        g0Var2.c0(-1026735949);
                        g0Var2.r(false);
                        String str = fVar.a;
                        int iHashCode = str.hashCode();
                        b2.r rVar3 = b2.o.A;
                        boolean z2 = this.C;
                        switch (iHashCode) {
                            case -1613332748:
                                z2 = z2;
                                rVar = rVar3;
                                if (!str.equals("tailored_playlists")) {
                                    g0Var2.c0(1629515182);
                                    zG = g0Var2.g(kVar);
                                    objN = g0Var2.N();
                                    if (zG || objN == obj3) {
                                        objN = new jz.t(18, kVar);
                                        g0Var2.n0(objN);
                                    }
                                    m.a(fVar, (u00.a) objN, z2, rVar, false, g0Var, 3072, 16);
                                    g0Var2.r(false);
                                } else {
                                    g0Var2.c0(1629478235);
                                    d.A(fVar, rVar, g0Var, 48);
                                    g0Var2.r(false);
                                }
                                break;
                            case -1570882062:
                                z2 = z2;
                                rVar = rVar3;
                                if (!str.equals("social_proof")) {
                                    g0Var2.c0(1629515182);
                                    zG = g0Var2.g(kVar);
                                    objN = g0Var2.N();
                                    if (zG) {
                                        objN = new jz.t(18, kVar);
                                        g0Var2.n0(objN);
                                    } else {
                                        objN = new jz.t(18, kVar);
                                        g0Var2.n0(objN);
                                    }
                                    m.a(fVar, (u00.a) objN, z2, rVar, false, g0Var, 3072, 16);
                                    g0Var2.r(false);
                                } else {
                                    g0Var2.c0(1629482939);
                                    u.a(fVar, zVar, rVar, g0Var, 384);
                                    g0Var2.r(false);
                                }
                                break;
                            case -1156855605:
                                rVar2 = rVar3;
                                if (!str.equals("ambient_sounds")) {
                                    rVar = rVar2;
                                    g0Var2.c0(1629515182);
                                    zG = g0Var2.g(kVar);
                                    objN = g0Var2.N();
                                    if (zG) {
                                        objN = new jz.t(18, kVar);
                                        g0Var2.n0(objN);
                                    } else {
                                        objN = new jz.t(18, kVar);
                                        g0Var2.n0(objN);
                                    }
                                    m.a(fVar, (u00.a) objN, z2, rVar, false, g0Var, 3072, 16);
                                    g0Var2.r(false);
                                } else {
                                    g0Var2.c0(1629488776);
                                    d.a(fVar, zVar, aVar, kVar, rVar2, g0Var, 24576);
                                    g0Var2.r(false);
                                }
                                break;
                            case -881251677:
                                rVar2 = rVar3;
                                if (!str.equals("tafsir")) {
                                    rVar = rVar2;
                                    g0Var2.c0(1629515182);
                                    zG = g0Var2.g(kVar);
                                    objN = g0Var2.N();
                                    if (zG) {
                                        objN = new jz.t(18, kVar);
                                        g0Var2.n0(objN);
                                    } else {
                                        objN = new jz.t(18, kVar);
                                        g0Var2.n0(objN);
                                    }
                                    m.a(fVar, (u00.a) objN, z2, rVar, false, g0Var, 3072, 16);
                                    g0Var2.r(false);
                                } else {
                                    g0Var2.c0(1629496592);
                                    d.w(fVar, rVar2, g0Var, 48);
                                    g0Var2.r(false);
                                }
                                break;
                            case -804714037:
                                rVar2 = rVar3;
                                if (!str.equals("reciters")) {
                                    rVar = rVar2;
                                    g0Var2.c0(1629515182);
                                    zG = g0Var2.g(kVar);
                                    objN = g0Var2.N();
                                    if (zG) {
                                        objN = new jz.t(18, kVar);
                                        g0Var2.n0(objN);
                                    } else {
                                        objN = new jz.t(18, kVar);
                                        g0Var2.n0(objN);
                                    }
                                    m.a(fVar, (u00.a) objN, z2, rVar, false, g0Var, 3072, 16);
                                    g0Var2.r(false);
                                } else {
                                    g0Var2.c0(-1026257867);
                                    boolean zG2 = g0Var2.g(kVar);
                                    Object objN2 = g0Var2.N();
                                    if (zG2 || objN2 == obj3) {
                                        objN2 = new lp.k(3, kVar);
                                        g0Var2.n0(objN2);
                                    }
                                    u00.k kVar2 = (u00.k) objN2;
                                    boolean zG3 = g0Var2.g(kVar);
                                    Object objN3 = g0Var2.N();
                                    if (zG3 || objN3 == obj3) {
                                        objN3 = new lp.k(4, kVar);
                                        g0Var2.n0(objN3);
                                    }
                                    u00.k kVar3 = (u00.k) objN3;
                                    boolean zG4 = g0Var2.g(kVar);
                                    Object objN4 = g0Var2.N();
                                    if (zG4 || objN4 == obj3) {
                                        objN4 = new jz.t(17, kVar);
                                        g0Var2.n0(objN4);
                                    }
                                    d.m(fVar, zVar, kVar2, kVar3, (u00.a) objN4, g0Var, 24576);
                                    g0Var2.r(false);
                                }
                                break;
                            case 109757538:
                                rVar = rVar3;
                                if (!str.equals("start")) {
                                    z2 = z2;
                                    g0Var2.c0(1629515182);
                                    zG = g0Var2.g(kVar);
                                    objN = g0Var2.N();
                                    if (zG) {
                                        objN = new jz.t(18, kVar);
                                        g0Var2.n0(objN);
                                    } else {
                                        objN = new jz.t(18, kVar);
                                        g0Var2.n0(objN);
                                    }
                                    m.a(fVar, (u00.a) objN, z2, rVar, false, g0Var, 3072, 16);
                                    g0Var2.r(false);
                                } else {
                                    g0Var2.c0(1629449641);
                                    boolean zG5 = g0Var2.g(kVar);
                                    Object objN5 = g0Var2.N();
                                    if (zG5 || objN5 == obj3) {
                                        objN5 = new jz.t(16, kVar);
                                        g0Var2.n0(objN5);
                                    }
                                    m.a(fVar, (u00.a) objN5, z2, rVar, this.D || zVar2.b || zVar2.a, g0Var, 3072, 0);
                                    g0Var2.r(false);
                                }
                                break;
                            case 379775976:
                                if (!str.equals("daily_minimum")) {
                                    z2 = z2;
                                    rVar = rVar3;
                                    g0Var2.c0(1629515182);
                                    zG = g0Var2.g(kVar);
                                    objN = g0Var2.N();
                                    if (zG) {
                                        objN = new jz.t(18, kVar);
                                        g0Var2.n0(objN);
                                    } else {
                                        objN = new jz.t(18, kVar);
                                        g0Var2.n0(objN);
                                    }
                                    m.a(fVar, (u00.a) objN, z2, rVar, false, g0Var, 3072, 16);
                                    g0Var2.r(false);
                                } else {
                                    g0Var2.c0(1629501087);
                                    boolean zG6 = g0Var2.g(kVar);
                                    Object objN6 = g0Var2.N();
                                    if (zG6 || objN6 == obj3) {
                                        objN6 = new lp.k(5, kVar);
                                        g0Var2.n0(objN6);
                                    }
                                    d.d(fVar, zVar, (u00.k) objN6, rVar3, g0Var, 3072);
                                    g0Var2.r(false);
                                }
                                break;
                            case 1272354024:
                                if (!str.equals("notifications")) {
                                    z2 = z2;
                                    rVar = rVar3;
                                    g0Var2.c0(1629515182);
                                    zG = g0Var2.g(kVar);
                                    objN = g0Var2.N();
                                    if (zG) {
                                        objN = new jz.t(18, kVar);
                                        g0Var2.n0(objN);
                                    } else {
                                        objN = new jz.t(18, kVar);
                                        g0Var2.n0(objN);
                                    }
                                    m.a(fVar, (u00.a) objN, z2, rVar, false, g0Var, 3072, 16);
                                    g0Var2.r(false);
                                } else {
                                    g0Var2.c0(1629509915);
                                    d.h(fVar, aVar, rVar3, g0Var, 384);
                                    g0Var2.r(false);
                                }
                                break;
                            default:
                                z2 = z2;
                                rVar = rVar3;
                                g0Var2.c0(1629515182);
                                zG = g0Var2.g(kVar);
                                objN = g0Var2.N();
                                if (zG) {
                                    objN = new jz.t(18, kVar);
                                    g0Var2.n0(objN);
                                } else {
                                    objN = new jz.t(18, kVar);
                                    g0Var2.n0(objN);
                                }
                                m.a(fVar, (u00.a) objN, z2, rVar, false, g0Var, 3072, 16);
                                g0Var2.r(false);
                                break;
                        }
                    } else {
                        g0Var2.c0(-1027069416);
                        String strU = z3.U(g0Var, 2131886929);
                        boolean zG7 = g0Var2.g(kVar) | g0Var2.g(fVar);
                        Object objN7 = g0Var2.N();
                        if (zG7 || objN7 == obj3) {
                            objN7 = new l6.c(kVar, fVar, 5);
                            g0Var2.n0(objN7);
                        }
                        d.j(strU, (u00.a) objN7, z1.c, null, g0Var, 384, 8);
                        g0Var2.r(false);
                    }
                } else {
                    g0Var2.c0(-1027273613);
                    m.b(fVar, g0Var, 48);
                    g0Var2.r(false);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                np.a.b((String) this.E, this.B, (b2.r) this.F, (u00.a) this.G, this.C, this.D, (g2.t) this.H, (l1.j) obj, l1.q.K(12582961));
                break;
        }
        return b0.a;
    }
}
