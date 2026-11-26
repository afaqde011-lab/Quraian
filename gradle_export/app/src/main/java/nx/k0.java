package nx;

import com.mchutov.quranify.player.domain.model.PlayerItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ri.t1;

public final class k0 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final p0 C;
    public final PlayerItem D;

    public k0(p0 p0Var, PlayerItem playerItem, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = p0Var;
        this.D = playerItem;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new k0(this.C, this.D, cVar, 0);
            case 1:
                return new k0(this.C, this.D, cVar, 1);
            case 2:
                return new k0(this.C, this.D, cVar, 2);
            default:
                return new k0(this.C, this.D, cVar, 3);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((k0) create(zVar, cVar)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        uu.a aVar;
        u30.b bVar;
        switch (this.A) {
            case 0:
                l00.a aVar2 = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    t1.O(obj);
                    zt.a aVar3 = this.C.i;
                    this.B = 1;
                    if (((ut.p) aVar3).f(this.D, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 1:
                l00.a aVar4 = l00.a.A;
                int i2 = this.B;
                g00.b0 b0Var = g00.b0.a;
                Object[] objArr = 0;
                p0 p0Var = this.C;
                if (i2 == 0) {
                    t1.O(obj);
                    vp.x xVar = p0Var.l;
                    zt.a aVar5 = p0Var.i;
                    if (xVar.k()) {
                        List list = (List) ((ut.p) aVar5).j.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (p0Var.d.getReciterType() != ((yt.a) obj2).b) {
                                arrayList.add(obj2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            yt.a aVar6 = (yt.a) h00.q.N0(arrayList);
                            if (aVar6 != null) {
                                int i3 = aVar6.b;
                                h40.e eVar = a40.m0.a;
                                l0 l0Var = new l0(p0Var, i3, objArr == true ? 1 : 0, 0);
                                this.B = 1;
                                objJ = a40.c0.J(l0Var, eVar, this);
                                if (objJ == aVar4) {
                                    return aVar4;
                                }
                                bx.c cVar = (bx.c) objJ;
                                p0Var.i(i0.a((i0) p0Var.c.d.getValue(), null, null, null, null, null, null, false, null, false, false, true, cVar != null ? cVar.b : null, false, false, 59391));
                            }
                        } else if (((i0) p0Var.c.d.getValue()).j) {
                            p0Var.j.getClass();
                            yt.c cVarX = tt.b.X(this.D);
                            this.B = 2;
                            if (((ut.p) aVar5).g(cVarX, this) == aVar4) {
                                return aVar4;
                            }
                        }
                    } else {
                        ((bq.a) p0Var.h).f(true, zp.b.DOWNLOADS);
                    }
                } else if (i2 == 1) {
                    t1.O(obj);
                    objJ = obj;
                    bx.c cVar2 = (bx.c) objJ;
                    p0Var.i(i0.a((i0) p0Var.c.d.getValue(), null, null, null, null, null, null, false, null, false, false, true, cVar2 != null ? cVar2.b : null, false, false, 59391));
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0Var;
            case 2:
                l00.a aVar7 = l00.a.A;
                int i4 = this.B;
                if (i4 == 0) {
                    t1.O(obj);
                    p0 p0Var2 = this.C;
                    boolean z = ((i0) p0Var2.c.d.getValue()).j;
                    PlayerItem playerItem = this.D;
                    if (z || ((bVar = ((i0) p0Var2.c.d.getValue()).f) != null && bVar.isEmpty())) {
                        aVar = p0Var2.f;
                        this.B = 1;
                        if (((uu.w) aVar).s(playerItem, this) == aVar7) {
                            return aVar7;
                        }
                    } else {
                        Iterator<E> it = bVar.iterator();
                        while (it.hasNext()) {
                            if (playerItem.getSurahId() == ((Number) it.next()).longValue()) {
                                if (p0Var2.l.k()) {
                                    aVar = p0Var2.f;
                                    this.B = 1;
                                    if (((uu.w) aVar).s(playerItem, this) == aVar7) {
                                        return aVar7;
                                    }
                                } else {
                                    ((bq.a) p0Var2.h).f(true, zp.b.DOWNLOADS);
                                }
                            }
                        }
                        aVar = p0Var2.f;
                        this.B = 1;
                        if (((uu.w) aVar).s(playerItem, this) == aVar7) {
                            return aVar7;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            default:
                l00.a aVar8 = l00.a.A;
                int i5 = this.B;
                if (i5 == 0) {
                    t1.O(obj);
                    tq.k kVar = this.C.g;
                    PlayerItem playerItem2 = this.D;
                    zq.a aVar9 = new zq.a(playerItem2.getSurahId(), playerItem2.getReciterId());
                    this.B = 1;
                    if (kVar.e(aVar9, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
        }
    }
}
