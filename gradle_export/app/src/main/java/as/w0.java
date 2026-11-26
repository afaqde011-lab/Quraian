package as;

import com.mchutov.quranify.player.domain.model.PlayerItem;
import d40.p1;
import java.util.ArrayList;
import ri.t1;

public final class w0 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final b1 C;

    public w0(b1 b1Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = b1Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new w0(this.C, cVar, 0);
            case 1:
                return new w0(this.C, cVar, 1);
            case 2:
                return new w0(this.C, cVar, 2);
            case 3:
                return new w0(this.C, cVar, 3);
            default:
                return new w0(this.C, cVar, 4);
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
        return ((w0) create(zVar, cVar)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objJ;
        aq.a aVar;
        switch (this.A) {
            case 0:
                l00.a aVar2 = l00.a.A;
                int i = this.B;
                g00.b0 b0Var = g00.b0.a;
                if (i == 0) {
                    t1.O(obj);
                    b1 b1Var = this.C;
                    if (((u0) b1Var.c.d.getValue()).n) {
                        zt.a aVar3 = b1Var.i;
                        u30.b<PlayerItem> bVar = ((u0) b1Var.c.d.getValue()).e;
                        tt.b bVar2 = b1Var.j;
                        ArrayList arrayList = new ArrayList(h00.r.q0(bVar, 10));
                        for (PlayerItem playerItem : bVar) {
                            bVar2.getClass();
                            arrayList.add(tt.b.X(playerItem));
                        }
                        this.B = 1;
                        ((ut.p) aVar3).h(arrayList);
                        if (b0Var == aVar2) {
                            return aVar2;
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
                l00.a aVar4 = l00.a.A;
                int i2 = this.B;
                b1 b1Var2 = this.C;
                if (i2 != 0) {
                    if (i2 == 1) {
                        t1.O(obj);
                        objJ = obj;
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                    }
                    return g00.b0.a;
                }
                t1.O(obj);
                this.B = 1;
                objJ = b1.j(b1Var2);
                if (objJ == aVar4) {
                    return aVar4;
                }
                if (((Boolean) objJ).booleanValue()) {
                    this.B = 2;
                    if (b1.k(b1Var2, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    b1Var2.i(u0.a((u0) b1Var2.c.d.getValue(), null, null, null, null, 0, false, null, false, null, false, false, null, false, null, null, true, false, null, false, false, 1769471));
                }
                return g00.b0.a;
            case 2:
                l00.a aVar5 = l00.a.A;
                int i3 = this.B;
                if (i3 == 0) {
                    t1.O(obj);
                    b1 b1Var3 = this.C;
                    d40.i iVarV = d40.o.v(b1Var3.q, a40.m0.a);
                    a1.c0 c0Var = new a1.c0(b1Var3, (k00.c) null, 3);
                    this.B = 1;
                    if (d40.o.i(iVarV, c0Var, this) == aVar5) {
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
                l00.a aVar6 = l00.a.A;
                int i4 = this.B;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return g00.b0.a;
                }
                t1.O(obj);
                b1 b1Var4 = this.C;
                p1 p1Var = ((ut.p) b1Var4.i).j;
                a1.c cVar = new a1.c(b1Var4, 4);
                this.B = 1;
                p1Var.collect(cVar, this);
                return aVar6;
            default:
                l00.a aVar7 = l00.a.A;
                int i5 = this.B;
                g00.b0 b0Var2 = g00.b0.a;
                b1 b1Var5 = this.C;
                if (i5 == 0) {
                    t1.O(obj);
                    if (!((h00.b) ((u0) b1Var5.c.d.getValue()).c).isEmpty()) {
                        uu.a aVar8 = b1Var5.f;
                        u30.b bVar3 = ((u0) b1Var5.c.d.getValue()).c;
                        this.B = 1;
                        if (((uu.w) aVar8).E(bVar3, this) == aVar7) {
                            return aVar7;
                        }
                        aVar = b1Var5.h;
                        this.B = 2;
                        if (aq.a.b(aVar, true, this) == aVar7) {
                            return aVar7;
                        }
                    }
                } else if (i5 == 1) {
                    t1.O(obj);
                    aVar = b1Var5.h;
                    this.B = 2;
                    if (aq.a.b(aVar, true, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0Var2;
        }
    }
}
