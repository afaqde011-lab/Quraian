package g1;

import com.mchutov.quranify.player.domain.model.PlayerItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class a implements u00.n {
    public final int A;
    public final Object B;
    public final int C;
    public final Object D;
    public final Object E;
    public final Object F;

    public a(int i10, int i11, b2.r rVar, String str, String str2, u00.a aVar) {
        this.A = 5;
        this.E = str;
        this.D = aVar;
        this.B = rVar;
        this.F = str2;
        this.C = i11;
    }

    public a(bv.o1 o1Var, jk.a aVar, b2.r rVar, v1.c cVar, int i10) {
        this.A = 2;
        this.D = o1Var;
        this.E = aVar;
        this.B = rVar;
        this.F = cVar;
        this.C = i10;
    }

    public a(bv.o1 o1Var, u00.k kVar, jk.a aVar, b2.r rVar, int i10, int i11) {
        this.A = i11;
        this.D = o1Var;
        this.E = kVar;
        this.F = aVar;
        this.B = rVar;
        this.C = i10;
    }

    public a(bx.c cVar, PlayerItem playerItem, int i10, u00.a aVar, b2.r rVar, int i11) {
        this.A = 10;
        this.E = cVar;
        this.F = playerItem;
        this.C = i10;
        this.D = aVar;
        this.B = rVar;
    }

    public a(c4.b0 b0Var, v1.c cVar, k8 k8Var, v1.c cVar2, int i10) {
        this.A = 4;
        this.D = b0Var;
        this.F = cVar;
        this.B = k8Var;
        this.E = cVar2;
        this.C = i10;
    }

    public a(Object obj, Object obj2, Object obj3, Object obj4, int i10, int i11) {
        this.A = i11;
        this.D = obj;
        this.B = obj2;
        this.E = obj3;
        this.F = obj4;
        this.C = i10;
    }

    public a(lo.l lVar, u00.a aVar, ro.d dVar, b2.r rVar, int i10) {
        this.A = 8;
        this.E = lVar;
        this.D = aVar;
        this.F = dVar;
        this.B = rVar;
        this.C = i10;
    }

    public a(v1.c cVar, Object obj, Object obj2, Object obj3, int i10) {
        this.A = 9;
        this.F = cVar;
        this.D = obj;
        this.B = obj2;
        this.E = obj3;
        this.C = i10;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                e.b((u00.a) this.D, (b2.r) this.B, (c4.v) this.E, (v1.c) this.F, (l1.j) obj, l1.q.K(this.C | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                gv.s.b((bv.o1) this.D, (u00.k) this.E, (jk.a) this.F, (b2.r) this.B, (l1.j) obj, l1.q.K(this.C | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                gv.s.a((bv.o1) this.D, (jk.a) this.E, (b2.r) this.B, (v1.c) this.F, (l1.j) obj, l1.q.K(this.C | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                gv.s.c((bv.o1) this.D, (u00.k) this.E, (kk.c) this.F, (b2.r) this.B, (l1.j) obj, l1.q.K(this.C | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                h1.f.a((c4.b0) this.D, (v1.c) this.F, (k8) this.B, (v1.c) this.E, (l1.j) obj, l1.q.K(this.C | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                mu.d.j((String) this.E, (u00.a) this.D, (b2.r) this.B, (String) this.F, (l1.j) obj, l1.q.K(385), this.C);
                break;
            case 6:
                ((Integer) obj2).getClass();
                ab.a0.f((ArrayList) this.D, (List) this.B, (Set) this.E, (Set) this.F, (l1.j) obj, l1.q.K(this.C | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                kh.n.j((Boolean) this.D, this.B, (androidx.lifecycle.w) this.E, (u00.k) this.F, (l1.j) obj, l1.q.K(this.C | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ro.f.o((lo.l) this.E, (u00.a) this.D, (ro.d) this.F, (b2.r) this.B, (l1.j) obj, l1.q.K(this.C | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                ((v1.c) this.F).f(this.D, this.B, this.E, (l1.j) obj, l1.q.K(this.C) | 1);
                break;
            default:
                ((Integer) obj2).getClass();
                int iK = l1.q.K(24585);
                wr.k.J((bx.c) this.E, (PlayerItem) this.F, this.C, (u00.a) this.D, (b2.r) this.B, (l1.j) obj, iK);
                break;
        }
        return g00.b0.a;
    }
}
