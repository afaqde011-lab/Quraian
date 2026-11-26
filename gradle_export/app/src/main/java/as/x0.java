package as;

import com.mchutov.quranify.player.domain.model.PlayerItem;
import java.util.Iterator;
import ri.t1;

public final class x0 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final b1 C;
    public final PlayerItem D;

    public x0(b1 b1Var, PlayerItem playerItem, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = b1Var;
        this.D = playerItem;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new x0(this.C, this.D, cVar, 0);
            case 1:
                return new x0(this.C, this.D, cVar, 1);
            case 2:
                return new x0(this.C, this.D, cVar, 2);
            case 3:
                return new x0(this.C, this.D, cVar, 3);
            default:
                return new x0(this.C, this.D, cVar, 4);
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
            case 3:
                break;
        }
        return ((x0) create(zVar, cVar)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        zt.a aVar;
        yt.c cVarX;
        boolean z;
        bx.b bVarA;
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
                b1 b1Var = this.C;
                if (i2 == 0) {
                    t1.O(obj);
                    if (b1Var.k.k()) {
                        this.B = 1;
                        obj = b1.j(b1Var);
                        if (obj == aVar4) {
                            return aVar4;
                        }
                        if (((Boolean) obj).booleanValue()) {
                            this.B = 2;
                            if (b1.k(b1Var, this) == aVar4) {
                                return aVar4;
                            }
                        } else if (((u0) b1Var.c.d.getValue()).n) {
                            aVar = b1Var.i;
                            b1Var.j.getClass();
                            cVarX = tt.b.X(this.D);
                            this.B = 3;
                            if (((ut.p) aVar).g(cVarX, this) == aVar4) {
                                return aVar4;
                            }
                        }
                    } else {
                        ((bq.a) b1Var.h).f(true, zp.b.DOWNLOADS);
                    }
                } else if (i2 == 1) {
                    t1.O(obj);
                    if (((Boolean) obj).booleanValue()) {
                        this.B = 2;
                        if (b1.k(b1Var, this) == aVar4) {
                            return aVar4;
                        }
                    } else if (((u0) b1Var.c.d.getValue()).n) {
                        aVar = b1Var.i;
                        b1Var.j.getClass();
                        cVarX = tt.b.X(this.D);
                        this.B = 3;
                        if (((ut.p) aVar).g(cVarX, this) == aVar4) {
                            return aVar4;
                        }
                    }
                } else {
                    if (i2 != 2 && i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 2:
                l00.a aVar5 = l00.a.A;
                int i3 = this.B;
                if (i3 == 0) {
                    t1.O(obj);
                    b1 b1Var2 = this.C;
                    pm.b bVar2 = b1Var2.c;
                    pm.b bVar3 = b1Var2.c;
                    u30.b bVar4 = ((u0) bVar2.d.getValue()).i ? ((u0) bVar3.d.getValue()).c : ((u0) bVar3.d.getValue()).d;
                    uu.a aVar6 = b1Var2.f;
                    dw.a aVar7 = ((u0) bVar3.d.getValue()).b;
                    boolean zC = aVar7 != null ? aVar7.c() : false;
                    this.B = 1;
                    if (((uu.w) aVar6).r(this.D, bVar4, zC, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 3:
                l00.a aVar8 = l00.a.A;
                int i4 = this.B;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return obj;
                }
                t1.O(obj);
                xw.k kVar = this.C.e;
                int reciterId = this.D.getReciterId();
                this.B = 1;
                Object objD = kVar.d(reciterId, this);
                return objD == aVar8 ? aVar8 : objD;
            default:
                l00.a aVar9 = l00.a.A;
                int i5 = this.B;
                b1 b1Var3 = this.C;
                Object[] objArr = 0;
                PlayerItem playerItem = this.D;
                if (i5 != 0) {
                    if (i5 == 1) {
                        t1.O(obj);
                    } else {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                    }
                    return g00.b0.a;
                }
                t1.O(obj);
                h40.e eVar = a40.m0.a;
                x0 x0Var = new x0(b1Var3, playerItem, objArr == true ? 1 : 0, 3);
                this.B = 1;
                obj = a40.c0.J(x0Var, eVar, this);
                if (obj == aVar9) {
                    return aVar9;
                }
                bx.c cVar = (bx.c) obj;
                if (cVar == null || (bVarA = cVar.a()) == null || (bVar = bVarA.e) == null || bVar.isEmpty()) {
                    z = false;
                } else {
                    Iterator<E> it = bVar.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                        } else if (((bx.f) it.next()).a == playerItem.getSurahId()) {
                            z = true;
                        }
                    }
                }
                tq.k kVar2 = b1Var3.g;
                zq.a aVar10 = new zq.a(playerItem.getSurahId(), playerItem.getReciterId(), z, z ? null : playerItem.getCollectionId());
                this.B = 2;
                if (kVar2.e(aVar10, this) == aVar9) {
                    return aVar9;
                }
                return g00.b0.a;
        }
    }
}
