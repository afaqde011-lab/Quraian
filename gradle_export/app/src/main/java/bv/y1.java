package bv;

import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import java.util.List;
import kotlin.KotlinNothingValueException;

public final class y1 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final e3 C;

    public y1(e3 e3Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = e3Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new y1(this.C, cVar, 0);
            case 1:
                return new y1(this.C, cVar, 1);
            case 2:
                return new y1(this.C, cVar, 2);
            case 3:
                return new y1(this.C, cVar, 3);
            case 4:
                return new y1(this.C, cVar, 4);
            case 5:
                return new y1(this.C, cVar, 5);
            case 6:
                return new y1(this.C, cVar, 6);
            case 7:
                return new y1(this.C, cVar, 7);
            case 8:
                return new y1(this.C, cVar, 8);
            case 9:
                return new y1(this.C, cVar, 9);
            case 10:
                return new y1(this.C, cVar, 10);
            case 11:
                return new y1(this.C, cVar, 11);
            case 12:
                return new y1(this.C, cVar, 12);
            case 13:
                return new y1(this.C, cVar, 13);
            case 14:
                return new y1(this.C, cVar, 14);
            case 15:
                return new y1(this.C, cVar, 15);
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                return new y1(this.C, cVar, 16);
            case 17:
                return new y1(this.C, cVar, 17);
            case 18:
                return new y1(this.C, cVar, 18);
            case 19:
                return new y1(this.C, cVar, 19);
            case 20:
                return new y1(this.C, cVar, 20);
            case 21:
                return new y1(this.C, cVar, 21);
            case 22:
                return new y1(this.C, cVar, 22);
            default:
                return new y1(this.C, cVar, 23);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                return ((y1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 1:
                return ((y1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 2:
                return ((y1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 3:
                return ((y1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 4:
                ((y1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
                return l00.a.A;
            case 5:
                return ((y1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 6:
                return ((y1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 7:
                return ((y1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 8:
                return ((y1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 9:
                return ((y1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 10:
                return ((y1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 11:
                return ((y1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 12:
                return ((y1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 13:
                return ((y1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 14:
                return ((y1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 15:
                return ((y1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                return ((y1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 17:
                return ((y1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 18:
                return ((y1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 19:
                return ((y1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 20:
                return ((y1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 21:
                return ((y1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            case 22:
                return ((y1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            default:
                return ((y1) create(zVar, cVar)).invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objC;
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    ri.t1.O(obj);
                    d40.p1 p1Var = ((uu.w) this.C.d).D;
                    x1 x1Var = new x1(2, null);
                    this.B = 1;
                    if (d40.o.t(p1Var, x1Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return Boolean.TRUE;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                e3 e3Var = this.C;
                try {
                    if (i2 == 0) {
                        ri.t1.O(obj);
                        ht.k kVar = e3Var.h;
                        this.B = 1;
                        objC = kVar.c(this);
                        if (objC == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ri.t1.O(obj);
                        objC = obj;
                    }
                    List list = (List) objC;
                    e3Var.C = list;
                    e3.m(e3Var, list);
                    e3Var.L();
                    break;
                } catch (Exception unused) {
                }
                return g00.b0.a;
            case 2:
                l00.a aVar3 = l00.a.A;
                int i3 = this.B;
                if (i3 == 0) {
                    ri.t1.O(obj);
                    e3 e3Var2 = this.C;
                    d40.u0 u0Var = new d40.u0(((hq.b) e3Var2.t).c, e3Var2.s.k, new a2(3, null, 0));
                    b2 b2Var = new b2(e3Var2, null, 0);
                    this.B = 1;
                    if (d40.o.i(u0Var, b2Var, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 3:
                l00.a aVar4 = l00.a.A;
                int i4 = this.B;
                g00.b0 b0Var = g00.b0.a;
                if (i4 == 0) {
                    ri.t1.O(obj);
                    e3 e3Var3 = this.C;
                    ce.c cVar = e3Var3.D;
                    d40.i iVarO = d40.o.o(new bt.y1(e3Var3.c.d, e3Var3, 1));
                    this.B = 1;
                    Object objI = d40.o.i(d40.o.l(iVarO, (d40.p1) cVar.C, (d40.p1) cVar.D, new cv.b(4, null)), new a1.d(cVar, (k00.c) null, 26), this);
                    if (objI != aVar4) {
                        objI = b0Var;
                    }
                    if (objI == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return b0Var;
            case 4:
                l00.a aVar5 = l00.a.A;
                int i5 = this.B;
                if (i5 == 0) {
                    ri.t1.O(obj);
                    e3 e3Var4 = this.C;
                    d40.z0 z0Var = (d40.z0) e3Var4.D.F;
                    d2 d2Var = new d2(e3Var4, 0);
                    this.B = 1;
                    if (z0Var.A.collect(d2Var, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                throw new KotlinNothingValueException();
            case 5:
                l00.a aVar6 = l00.a.A;
                int i6 = this.B;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return g00.b0.a;
                }
                ri.t1.O(obj);
                e3 e3Var5 = this.C;
                d40.p1 p1Var2 = e3Var5.g.h;
                d2 d2Var2 = new d2(e3Var5, 1);
                this.B = 1;
                p1Var2.collect(d2Var2, this);
                return aVar6;
            case 6:
                l00.a aVar7 = l00.a.A;
                int i7 = this.B;
                if (i7 == 0) {
                    ri.t1.O(obj);
                    e3 e3Var6 = this.C;
                    ht.b bVar = e3Var6.g;
                    d40.t0 t0VarL = d40.o.l(new d40.z0(bVar.b), new d40.z0(bVar.c), new d40.z0(bVar.d), new r2(4, null, 2));
                    b2 b2Var2 = new b2(e3Var6, null, 1);
                    this.B = 1;
                    if (d40.o.i(t0VarL, b2Var2, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 7:
                l00.a aVar8 = l00.a.A;
                int i8 = this.B;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return g00.b0.a;
                }
                ri.t1.O(obj);
                e3 e3Var7 = this.C;
                d40.p1 p1Var3 = e3Var7.g.g;
                d2 d2Var3 = new d2(e3Var7, 2);
                this.B = 1;
                p1Var3.collect(d2Var3, this);
                return aVar8;
            case 8:
                l00.a aVar9 = l00.a.A;
                int i9 = this.B;
                if (i9 == 0) {
                    ri.t1.O(obj);
                    e3 e3Var8 = this.C;
                    d40.i iVarO2 = d40.o.o(new bt.t1(((uu.w) e3Var8.d).C, 5));
                    e2 e2Var = new e2(e3Var8, null, 0);
                    this.B = 1;
                    if (d40.o.i(iVarO2, e2Var, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 9:
                e3 e3Var9 = this.C;
                xu.f fVar = e3Var9.x;
                l00.a aVar10 = l00.a.A;
                int i11 = this.B;
                if (i11 == 0) {
                    ri.t1.O(obj);
                    kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
                    vVar.A = fVar.f.getValue() != null;
                    d40.z0 z0Var2 = new d40.z0(fVar.f);
                    a1.f2 f2Var = new a1.f2(vVar, e3Var9, (k00.c) null, 2);
                    this.B = 1;
                    if (d40.o.i(z0Var2, f2Var, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 10:
                l00.a aVar11 = l00.a.A;
                int i12 = this.B;
                if (i12 == 0) {
                    ri.t1.O(obj);
                    e3 e3Var10 = this.C;
                    d40.i iVarO3 = d40.o.o(new bt.t1(e3Var10.c.d, 6));
                    b2 b2Var3 = new b2(e3Var10, null, 2);
                    this.B = 1;
                    if (d40.o.i(iVarO3, b2Var3, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 11:
                l00.a aVar12 = l00.a.A;
                int i13 = this.B;
                if (i13 == 0) {
                    ri.t1.O(obj);
                    e3 e3Var11 = this.C;
                    d40.y0 y0Var = new d40.y0(e3Var11.x.g);
                    bt.y0 y0Var2 = new bt.y0(e3Var11, null, 1);
                    this.B = 1;
                    if (d40.o.i(y0Var, y0Var2, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 12:
                l00.a aVar13 = l00.a.A;
                int i14 = this.B;
                if (i14 == 0) {
                    ri.t1.O(obj);
                    e3 e3Var12 = this.C;
                    d40.p1 p1Var4 = ((uu.w) e3Var12.d).H;
                    h2 h2Var = new h2(e3Var12, (k00.c) null, 0);
                    this.B = 1;
                    if (d40.o.i(p1Var4, h2Var, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 13:
                l00.a aVar14 = l00.a.A;
                int i15 = this.B;
                if (i15 == 0) {
                    ri.t1.O(obj);
                    e3 e3Var13 = this.C;
                    d40.z0 z0Var3 = new d40.z0(e3Var13.u.c);
                    b2 b2Var4 = new b2(e3Var13, null, 3);
                    this.B = 1;
                    if (d40.o.i(z0Var3, b2Var4, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 14:
                l00.a aVar15 = l00.a.A;
                int i16 = this.B;
                if (i16 == 0) {
                    ri.t1.O(obj);
                    e3 e3Var14 = this.C;
                    d40.t0 t0Var = e3Var14.E;
                    b2 b2Var5 = new b2(e3Var14, null, 4);
                    this.B = 1;
                    if (d40.o.i(t0Var, b2Var5, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 15:
                l00.a aVar16 = l00.a.A;
                int i17 = this.B;
                if (i17 == 0) {
                    ri.t1.O(obj);
                    e3 e3Var15 = this.C;
                    d40.z0 z0Var4 = e3Var15.s.k;
                    ab.o oVar = new ab.o(e3Var15, (k00.c) null, 4);
                    this.B = 1;
                    if (d40.o.i(z0Var4, oVar, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                e3 e3Var16 = this.C;
                no.g gVar = e3Var16.y;
                l00.a aVar17 = l00.a.A;
                int i18 = this.B;
                if (i18 == 0) {
                    ri.t1.O(obj);
                    kotlin.jvm.internal.v vVar2 = new kotlin.jvm.internal.v();
                    vVar2.A = ((Boolean) gVar.a.getValue()).booleanValue();
                    d40.z0 z0Var5 = new d40.z0(gVar.a);
                    i2 i2Var = new i2(vVar2, e3Var16, null);
                    this.B = 1;
                    if (d40.o.i(z0Var5, i2Var, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 17:
                l00.a aVar18 = l00.a.A;
                int i19 = this.B;
                if (i19 == 0) {
                    ri.t1.O(obj);
                    e3 e3Var17 = this.C;
                    ht.b bVar2 = e3Var17.g;
                    d40.i iVarO4 = d40.o.o(d40.o.k(new d40.z0(bVar2.c), new d40.z0(bVar2.d), new bt.t1(((uu.w) e3Var17.d).C, 7), d40.o.o(new bt.t1(e3Var17.c.d, 8)), new j2(5, null)));
                    e2 e2Var2 = new e2(e3Var17, null, 1);
                    this.B = 1;
                    if (d40.o.i(iVarO4, e2Var2, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i19 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 18:
                l00.a aVar19 = l00.a.A;
                int i21 = this.B;
                if (i21 == 0) {
                    ri.t1.O(obj);
                    e3 e3Var18 = this.C;
                    rt.f fVar2 = e3Var18.j;
                    bt.t1 t1Var = new bt.t1(((uu.w) e3Var18.d).C, 9);
                    d40.i iVarO5 = d40.o.o(new bt.t1(e3Var18.c.d, 10));
                    fVar2.getClass();
                    ht.b bVar3 = fVar2.a;
                    e40.i iVarY = d40.o.y(d40.o.o(d40.o.j(new d40.z0(bVar3.f), new d40.z0(bVar3.b), new d40.z0(bVar3.e), t1Var, iVarO5, new rt.d(null))), new rt.e(fVar2, null));
                    b2 b2Var6 = new b2(e3Var18, null, 5);
                    this.B = 1;
                    if (d40.o.i(iVarY, b2Var6, this) == aVar19) {
                        return aVar19;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 19:
                l00.a aVar20 = l00.a.A;
                int i22 = this.B;
                if (i22 == 0) {
                    ri.t1.O(obj);
                    aq.a aVar21 = this.C.m;
                    this.B = 1;
                    if (((bq.a) aVar21).c(true, this) == aVar20) {
                        return aVar20;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 20:
                l00.a aVar22 = l00.a.A;
                int i23 = this.B;
                g00.b0 b0Var2 = g00.b0.a;
                if (i23 == 0) {
                    ri.t1.O(obj);
                    e3 e3Var19 = this.C;
                    if (e3Var19.s.k()) {
                        this.B = 1;
                        if (e3Var19.c.a(i1.a, this) == aVar22) {
                            return aVar22;
                        }
                    } else {
                        ((bq.a) e3Var19.m).f(true, zp.b.AIRPLAY);
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return b0Var2;
            case 21:
                l00.a aVar23 = l00.a.A;
                int i24 = this.B;
                e3 e3Var20 = this.C;
                if (i24 == 0) {
                    ri.t1.O(obj);
                    e3Var20.i(o1.a((o1) e3Var20.c.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, true, -1, 8388607));
                    this.B = 1;
                    if (a40.c0.l(4000L, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                e3Var20.i(o1.a((o1) e3Var20.c.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -1, 8388607));
                return g00.b0.a;
            case 22:
                l00.a aVar24 = l00.a.A;
                int i25 = this.B;
                if (i25 == 0) {
                    ri.t1.O(obj);
                    aq.a aVar25 = this.C.m;
                    this.B = 1;
                    if (aq.a.b(aVar25, false, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i25 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            default:
                l00.a aVar26 = l00.a.A;
                int i26 = this.B;
                if (i26 == 0) {
                    ri.t1.O(obj);
                    aq.a aVar27 = this.C.m;
                    this.B = 1;
                    if (((bq.a) aVar27).e(true, this) == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i26 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
        }
    }
}
