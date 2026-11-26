package as;

import com.google.android.gms.internal.measurement.g4;
import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class h0 implements u00.n {
    public final int A;
    public final boolean B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;

    public h0(PlayerItem playerItem, u0 u0Var, gm.a aVar, boolean z, PlayerItem playerItem2, u00.k kVar, int i) {
        this.A = 0;
        this.D = playerItem;
        this.F = u0Var;
        this.G = aVar;
        this.B = z;
        this.E = playerItem2;
        this.C = kVar;
    }

    public h0(fx.b bVar, boolean z, u30.b bVar2, u00.a aVar, b2.r rVar, String str, int i) {
        this.A = 3;
        this.D = bVar;
        this.B = z;
        this.E = bVar2;
        this.F = aVar;
        this.G = rVar;
        this.C = str;
    }

    public h0(Object obj, Object obj2, Object obj3, boolean z, u00.k kVar, Object obj4, int i, int i2) {
        this.A = i2;
        this.D = obj;
        this.E = obj2;
        this.F = obj3;
        this.B = z;
        this.C = kVar;
        this.G = obj4;
    }

    public h0(ru.d dVar, boolean z, u00.a aVar, u00.a aVar2, u00.k kVar, b2.r rVar, int i) {
        this.A = 6;
        this.D = dVar;
        this.B = z;
        this.E = aVar;
        this.F = aVar2;
        this.C = kVar;
        this.G = rVar;
    }

    public h0(u30.b bVar, boolean z, String str, u00.k kVar, k0.y yVar, b2.r rVar, int i) {
        this.A = 1;
        this.D = bVar;
        this.B = z;
        this.E = str;
        this.C = kVar;
        this.F = yVar;
        this.G = rVar;
    }

    public h0(boolean z, u00.a aVar, u00.a aVar2, u00.a aVar3, u00.a aVar4, u00.a aVar5, int i) {
        this.A = 2;
        this.B = z;
        this.D = aVar;
        this.E = aVar2;
        this.F = aVar3;
        this.G = aVar4;
        this.C = aVar5;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = l1.q.K(1);
                a.d((PlayerItem) this.D, (u0) this.F, (gm.a) this.G, this.B, (PlayerItem) this.E, (u00.k) this.C, (l1.j) obj, iK);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iK2 = l1.q.K(9);
                iw.a.f((u30.b) this.D, this.B, (String) this.E, (u00.k) this.C, (k0.y) this.F, (b2.r) this.G, (l1.j) obj, iK2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iK3 = l1.q.K(1);
                iz.d.h(this.B, (u00.a) this.D, (u00.a) this.E, (u00.a) this.F, (u00.a) this.G, (u00.a) this.C, (l1.j) obj, iK3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iK4 = l1.q.K(1);
                kx.a.e((fx.b) this.D, this.B, (u30.b) this.E, (u00.a) this.F, (b2.r) this.G, (String) this.C, (l1.j) obj, iK4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iK5 = l1.q.K(196609);
                mu.m.d((ju.f) this.D, (lu.a0) this.E, (jk.a) this.F, this.B, (u00.k) this.C, (b2.r) this.G, (l1.j) obj, iK5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iK6 = l1.q.K(1);
                g4.i((String) this.D, (String) this.E, (String) this.F, this.B, (u00.k) this.C, (u00.a) this.G, (l1.j) obj, iK6);
                break;
            default:
                ((Integer) obj2).getClass();
                int iK7 = l1.q.K(200065);
                c7.i.i((ru.d) this.D, this.B, (u00.a) this.E, (u00.a) this.F, (u00.k) this.C, (b2.r) this.G, (l1.j) obj, iK7);
                break;
        }
        return g00.b0.a;
    }
}
