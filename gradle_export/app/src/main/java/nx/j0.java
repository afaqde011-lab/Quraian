package nx;

import bt.y1;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import java.util.ArrayList;
import java.util.List;
import ri.t1;

public final class j0 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final p0 C;

    public j0(p0 p0Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = p0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new j0(this.C, cVar, 0);
            case 1:
                return new j0(this.C, cVar, 1);
            case 2:
                return new j0(this.C, cVar, 2);
            case 3:
                return new j0(this.C, cVar, 3);
            case 4:
                return new j0(this.C, cVar, 4);
            default:
                return new j0(this.C, cVar, 5);
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
            case 4:
                break;
        }
        return ((j0) create(zVar, cVar)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                g00.b0 b0Var = g00.b0.a;
                if (i == 0) {
                    t1.O(obj);
                    p0 p0Var = this.C;
                    if (((i0) p0Var.c.d.getValue()).j) {
                        zt.a aVar2 = p0Var.i;
                        u30.b<PlayerItem> bVar = ((i0) p0Var.c.d.getValue()).c;
                        tt.b bVar2 = p0Var.j;
                        ArrayList arrayList = new ArrayList(h00.r.q0(bVar, 10));
                        for (PlayerItem playerItem : bVar) {
                            bVar2.getClass();
                            arrayList.add(tt.b.X(playerItem));
                        }
                        this.B = 1;
                        ((ut.p) aVar2).h(arrayList);
                        if (b0Var == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0Var;
            case 1:
                l00.a aVar3 = l00.a.A;
                int i2 = this.B;
                g00.b0 b0Var2 = g00.b0.a;
                Object[] objArr = 0;
                p0 p0Var2 = this.C;
                if (i2 == 0) {
                    t1.O(obj);
                    List list = (List) ((ut.p) p0Var2.i).j.getValue();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (p0Var2.d.getReciterType() != ((yt.a) obj2).b) {
                            arrayList2.add(obj2);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        p0Var2.i(i0.a((i0) p0Var2.c.d.getValue(), null, null, null, null, null, null, false, null, false, true, false, null, false, false, 60415));
                    } else {
                        yt.a aVar4 = (yt.a) h00.q.N0(arrayList2);
                        if (aVar4 != null) {
                            int i3 = aVar4.b;
                            h40.e eVar = a40.m0.a;
                            l0 l0Var = new l0(p0Var2, i3, objArr == true ? 1 : 0, 1);
                            this.B = 1;
                            objJ = a40.c0.J(l0Var, eVar, this);
                            if (objJ == aVar3) {
                                return aVar3;
                            }
                        }
                    }
                    return b0Var2;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
                objJ = obj;
                bx.c cVar = (bx.c) objJ;
                p0Var2.i(i0.a((i0) p0Var2.c.d.getValue(), null, null, null, null, null, null, false, null, false, false, true, cVar != null ? cVar.b : null, false, false, 59391));
                return b0Var2;
            case 2:
                l00.a aVar5 = l00.a.A;
                int i4 = this.B;
                if (i4 == 0) {
                    t1.O(obj);
                    p0 p0Var3 = this.C;
                    d40.i iVarV = d40.o.v(d40.o.l(p0Var3.p, p0Var3.q, p0Var3.s, new hx.d0(4, null, 1)), a40.m0.a);
                    lu.w wVar = new lu.w(p0Var3, null, 8);
                    this.B = 1;
                    if (d40.o.i(iVarV, wVar, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 3:
                l00.a aVar6 = l00.a.A;
                int i5 = this.B;
                if (i5 == 0) {
                    t1.O(obj);
                    p0 p0Var4 = this.C;
                    d40.i iVarV2 = d40.o.v(new y1(((ut.p) p0Var4.i).j, p0Var4, 14), a40.m0.a);
                    a1.c cVar2 = new a1.c(p0Var4, 16);
                    this.B = 1;
                    if (iVarV2.collect(cVar2, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 4:
                l00.a aVar7 = l00.a.A;
                int i6 = this.B;
                p0 p0Var5 = this.C;
                if (i6 != 0) {
                    if (i6 == 1) {
                        t1.O(obj);
                    } else {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                    }
                    return g00.b0.a;
                }
                t1.O(obj);
                aq.a aVar8 = p0Var5.h;
                this.B = 1;
                if (aq.a.b(aVar8, true, this) == aVar7) {
                    return aVar7;
                }
                PlayerItem playerItem2 = (PlayerItem) h00.q.N0(((i0) p0Var5.c.d.getValue()).c);
                if (playerItem2 != null) {
                    uu.a aVar9 = p0Var5.f;
                    this.B = 2;
                    if (((uu.w) aVar9).s(playerItem2, this) == aVar7) {
                        return aVar7;
                    }
                }
                return g00.b0.a;
            default:
                l00.a aVar10 = l00.a.A;
                int i7 = this.B;
                p0 p0Var6 = this.C;
                if (i7 != 0) {
                    if (i7 == 1) {
                        t1.O(obj);
                    } else {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                    }
                    return g00.b0.a;
                }
                t1.O(obj);
                uu.a aVar11 = p0Var6.f;
                u30.b bVar3 = ((i0) p0Var6.c.d.getValue()).c;
                this.B = 1;
                if (((uu.w) aVar11).E(bVar3, this) == aVar10) {
                    return aVar10;
                }
                aq.a aVar12 = p0Var6.h;
                this.B = 2;
                if (aq.a.b(aVar12, true, this) == aVar10) {
                    return aVar10;
                }
                return g00.b0.a;
        }
    }
}
