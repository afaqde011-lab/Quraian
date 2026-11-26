package bv;

import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class d3 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final boolean C;
    public Object D;
    public final Object E;
    public final Object F;

    public d3(e3 e3Var, PlayerItem playerItem, boolean z, k00.c cVar) {
        super(2, cVar);
        this.A = 0;
        this.E = e3Var;
        this.F = playerItem;
        this.C = z;
    }

    public d3(l1.z0 z0Var, boolean z, f0.i iVar, k00.c cVar) {
        super(2, cVar);
        this.A = 3;
        this.E = z0Var;
        this.C = z;
        this.F = iVar;
    }

    public d3(boolean z, Object obj, Object obj2, Object obj3, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = z;
        this.D = obj;
        this.E = obj2;
        this.F = obj3;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new d3((e3) this.E, (PlayerItem) this.F, this.C, cVar);
            case 1:
                return new d3(this.C, (l0.z) this.D, (x.y) this.E, (l2.b) this.F, cVar, 1);
            case 2:
                return new d3(this.C, (no.e) this.D, (d40.n1) this.E, (l1.g1) this.F, cVar, 2);
            default:
                return new d3((l1.z0) this.E, this.C, (f0.i) this.F, cVar);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                return ((d3) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 1:
                return ((d3) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 2:
                ((d3) create(zVar, cVar)).invokeSuspend(g00.b0.a);
                return l00.a.A;
            default:
                return ((d3) create(zVar, cVar)).invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: bv.d3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
