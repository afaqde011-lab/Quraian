package jx;

import a40.m0;
import a40.z;
import androidx.lifecycle.u0;
import bt.y1;
import com.mchutov.quranify.reciters.presentation.screen.collection.topreciters.TopRecitersEffect$CloseScreen;
import g00.b0;
import ri.t1;
import ta.c0;

public final class u extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final x C;

    public u(x xVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = xVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new u(this.C, cVar, 0);
            case 1:
                return new u(this.C, cVar, 1);
            case 2:
                return new u(this.C, cVar, 2);
            case 3:
                return new u(this.C, cVar, 3);
            case 4:
                return new u(this.C, cVar, 4);
            default:
                return new u(this.C, cVar, 5);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
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
        return ((u) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        TopRecitersEffect$CloseScreen topRecitersEffect$CloseScreen;
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                b0 b0Var = b0.a;
                x xVar = this.C;
                if (i == 0) {
                    t1.O(obj);
                    s sVar = (s) xVar.c.d.getValue();
                    if (!r30.k.L0(sVar.f) || sVar.g || sVar.h) {
                        c0.M(u0.i(xVar), (k00.i) null, (u00.n) null, (u00.k) null, new t(xVar, null, 0), 31);
                    } else {
                        aq.a aVar2 = xVar.f;
                        this.B = 1;
                        ((bq.a) aVar2).d(true, this);
                        if (b0Var == aVar) {
                            return aVar;
                        }
                        topRecitersEffect$CloseScreen = TopRecitersEffect$CloseScreen.INSTANCE;
                        this.B = 2;
                        if (xVar.c.a(topRecitersEffect$CloseScreen, this) == aVar) {
                            return aVar;
                        }
                    }
                } else if (i == 1) {
                    t1.O(obj);
                    topRecitersEffect$CloseScreen = TopRecitersEffect$CloseScreen.INSTANCE;
                    this.B = 2;
                    if (xVar.c.a(topRecitersEffect$CloseScreen, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0Var;
            case 1:
                l00.a aVar3 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    x xVar2 = this.C;
                    d40.i iVarV = d40.o.v(new d40.u0(xVar2.g.c, ((ut.p) xVar2.h).k(), new ev.z(3, null, 2)), m0.a);
                    v vVar = new v(xVar2, null, 0);
                    this.B = 1;
                    if (d40.o.i(iVarV, vVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            case 2:
                l00.a aVar4 = l00.a.A;
                int i3 = this.B;
                if (i3 == 0) {
                    t1.O(obj);
                    x xVar3 = this.C;
                    d40.i iVarV2 = d40.o.v(new y1(xVar3.e.f(), xVar3, 13), m0.a);
                    v vVar2 = new v(xVar3, null, 1);
                    this.B = 1;
                    if (d40.o.i(iVarV2, vVar2, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            case 3:
                l00.a aVar5 = l00.a.A;
                int i4 = this.B;
                b0 b0Var2 = b0.a;
                if (i4 == 0) {
                    t1.O(obj);
                    aq.a aVar6 = this.C.f;
                    this.B = 1;
                    ((bq.a) aVar6).d(true, this);
                    if (b0Var2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0Var2;
            case 4:
                l00.a aVar7 = l00.a.A;
                int i5 = this.B;
                b0 b0Var3 = b0.a;
                if (i5 == 0) {
                    t1.O(obj);
                    aq.a aVar8 = this.C.f;
                    this.B = 1;
                    ((bq.a) aVar8).d(true, this);
                    if (b0Var3 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0Var3;
            default:
                l00.a aVar9 = l00.a.A;
                int i6 = this.B;
                b0 b0Var4 = b0.a;
                if (i6 == 0) {
                    t1.O(obj);
                    x xVar4 = this.C;
                    aq.a aVar10 = xVar4.f;
                    s sVar2 = (s) xVar4.c.d.getValue();
                    boolean z = sVar2.b() && (sVar2.g || sVar2.h);
                    this.B = 1;
                    ((bq.a) aVar10).d(!z, this);
                    if (b0Var4 == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0Var4;
        }
    }
}
