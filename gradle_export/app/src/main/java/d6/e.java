package d6;

import android.content.Context;
import android.util.Log;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class e extends m00.i implements u00.n {
    public final int A;
    public int B;
    public Object C;
    public Object D;
    public int E;
    public Object F;

    public e(PlayerItem playerItem, dq.u uVar, k00.c cVar) {
        super(2, cVar);
        this.A = 2;
        this.D = playerItem;
        this.F = uVar;
    }

    public e(p0 p0Var, Context context, int i10, d40.d1 d1Var, k00.c cVar) {
        super(2, cVar);
        this.A = 0;
        this.C = p0Var;
        this.D = context;
        this.E = i10;
        this.F = d1Var;
    }

    public e(p0 p0Var, Context context, int i10, k00.c cVar) {
        super(2, cVar);
        this.A = 1;
        this.C = p0Var;
        this.D = context;
        this.E = i10;
    }

    public e(Object obj, int i10, Object obj2, Object obj3, k00.c cVar, int i11) {
        super(2, cVar);
        this.A = i11;
        this.C = obj;
        this.E = i10;
        this.D = obj2;
        this.F = obj3;
    }

    public e(Object obj, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.F = obj;
    }

    public e(uu.w wVar, PlayerItem playerItem, List list, int i10, k00.c cVar) {
        super(2, cVar);
        this.A = 7;
        this.C = wVar;
        this.D = playerItem;
        this.F = list;
        this.E = i10;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new e((p0) this.C, (Context) this.D, this.E, (d40.d1) this.F, cVar);
            case 1:
                e eVar = new e((p0) this.C, (Context) this.D, this.E, cVar);
                eVar.F = obj;
                return eVar;
            case 2:
                return new e((PlayerItem) this.D, (dq.u) this.F, cVar);
            case 3:
                return new e((d40.i[]) this.C, this.E, (AtomicInteger) this.D, (c40.h) this.F, cVar, 3);
            case 4:
                return new e((j0.v) this.C, this.E, (z00.e) this.D, (h1.w) this.F, cVar, 4);
            case 5:
                return new e((is.y) this.F, cVar, 5);
            case 6:
                return new e((ns.c) this.F, cVar, 6);
            case 7:
                return new e((uu.w) this.C, (PlayerItem) this.D, (List) this.F, this.E, cVar);
            default:
                return new e((vn.s) this.F, cVar, 8);
        }
    }

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
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return create(zVar, cVar).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        h00.x xVar;
        tq.k kVar;
        int i10;
        j40.a aVar;
        int i11;
        is.y yVar;
        Throwable th2;
        j40.a aVar2;
        j40.a aVar3;
        int i12;
        ns.c cVar;
        Throwable th3;
        j40.a aVar4;
        j40.a aVar5;
        int i13;
        vn.s sVar;
        Throwable th4;
        j40.a aVar6;
        switch (this.A) {
            case 0:
                d40.d1 d1Var = (d40.d1) this.F;
                p0 p0Var = (p0) this.C;
                l00.a aVar7 = l00.a.A;
                int i14 = this.B;
                if (i14 == 0) {
                    ri.t1.O(obj);
                    Context context = (Context) this.D;
                    int i15 = this.E;
                    this.B = 1;
                    p0Var.e(context, i15, this);
                    return aVar7;
                }
                if (i14 == 1) {
                    ri.t1.O(obj);
                    synchronized (d1Var) {
                        int iO = (int) ((d1Var.o() + ((long) d1Var.K)) - d1Var.I);
                        if (iO == 0) {
                            xVar = h00.x.A;
                        } else {
                            h00.x arrayList = new ArrayList(iO);
                            Object[] objArr = d1Var.H;
                            kotlin.jvm.internal.m.b(objArr);
                            for (int i16 = 0; i16 < iO; i16++) {
                                arrayList.add(objArr[((int) (d1Var.I + ((long) i16))) & (objArr.length - 1)]);
                            }
                            xVar = arrayList;
                        }
                    }
                    if (xVar.isEmpty()) {
                        Log.w("GlanceAppWidget", kotlin.jvm.internal.a0.a.b(p0Var.getClass()) + " did not call provideContent in providePreview");
                        v1.c cVar2 = w.f4709a;
                        this.B = 2;
                        if (d1Var.emit(cVar2, this) == aVar7) {
                            return aVar7;
                        }
                    }
                } else {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 1:
                l00.a aVar8 = l00.a.A;
                int i17 = this.B;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                    return obj;
                }
                ri.t1.O(obj);
                a40.z zVar = (a40.z) this.F;
                d40.d1 d1VarB = d40.o.b(0, 6, (c40.a) null);
                a40.c0.y(zVar, new g(d1VarB), (a40.a0) null, new e((p0) this.C, (Context) this.D, this.E, d1VarB, (k00.c) null), 2);
                this.B = 1;
                Object objS = d40.o.s(d1VarB, this);
                return objS == aVar8 ? aVar8 : objS;
            case 2:
                l00.a aVar9 = l00.a.A;
                int i18 = this.E;
                if (i18 == 0) {
                    ri.t1.O(obj);
                    PlayerItem playerItem = (PlayerItem) this.D;
                    if (playerItem != null) {
                        dq.u uVar = (dq.u) this.F;
                        tq.k kVar2 = uVar.e;
                        this.C = kVar2;
                        this.B = 0;
                        this.E = 1;
                        obj = dq.u.j(uVar, playerItem, this);
                        if (obj == aVar9) {
                            return aVar9;
                        }
                        kVar = kVar2;
                        i10 = 0;
                        this.C = null;
                        this.B = i10;
                        this.E = 2;
                        if (kVar.e((zq.a) obj, this) == aVar9) {
                            return aVar9;
                        }
                    }
                } else if (i18 == 1) {
                    i10 = this.B;
                    kVar = (tq.k) this.C;
                    ri.t1.O(obj);
                    this.C = null;
                    this.B = i10;
                    this.E = 2;
                    if (kVar.e((zq.a) obj, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i18 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 3:
                AtomicInteger atomicInteger = (AtomicInteger) this.D;
                c40.h hVar = (c40.h) this.F;
                l00.a aVar10 = l00.a.A;
                int i19 = this.B;
                try {
                    if (i19 == 0) {
                        ri.t1.O(obj);
                        d40.i[] iVarArr = (d40.i[]) this.C;
                        int i20 = this.E;
                        d40.i iVar = iVarArr[i20];
                        bt.p1 p1Var = new bt.p1(hVar, i20, 3);
                        this.B = 1;
                        if (iVar.collect(p1Var, this) == aVar10) {
                            return aVar10;
                        }
                    } else {
                        if (i19 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ri.t1.O(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        hVar.f((Throwable) null);
                    }
                    return g00.b0.a;
                } catch (Throwable th5) {
                    if (atomicInteger.decrementAndGet() != 0) {
                        throw th5;
                    }
                    hVar.f((Throwable) null);
                    throw th5;
                }
            case 4:
                l00.a aVar11 = l00.a.A;
                int i21 = this.B;
                if (i21 == 0) {
                    ri.t1.O(obj);
                    j0.v vVar = (j0.v) this.C;
                    int i22 = (((this.E - ((z00.c) ((z00.e) this.D)).A) * 12) + ((h1.w) this.F).f6535b) - 1;
                    this.B = 1;
                    if (j0.v.j(vVar, i22, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return g00.b0.a;
            case 5:
                l00.a aVar12 = l00.a.A;
                int i23 = this.E;
                if (i23 == 0) {
                    ri.t1.O(obj);
                    this.E = 1;
                    if (a40.c0.l(60000L, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i23 != 1) {
                        if (i23 != 2) {
                            if (i23 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = (j40.a) this.C;
                            try {
                                ri.t1.O(obj);
                                aVar2.i((Object) null);
                                return g00.b0.a;
                            } catch (Throwable th6) {
                                th2 = th6;
                                aVar2.i((Object) null);
                                throw th2;
                            }
                        }
                        int i24 = this.B;
                        yVar = (is.y) this.D;
                        j40.a aVar13 = (j40.a) this.C;
                        ri.t1.O(obj);
                        i11 = i24;
                        aVar = aVar13;
                        try {
                            this.C = aVar;
                            this.D = null;
                            this.B = i11;
                            this.E = 3;
                            if (is.y.b(yVar, this) == aVar12) {
                                return aVar12;
                            }
                            aVar2 = aVar;
                            aVar2.i((Object) null);
                            return g00.b0.a;
                        } catch (Throwable th7) {
                            th2 = th7;
                            aVar2 = aVar;
                            aVar2.i((Object) null);
                            throw th2;
                        }
                    }
                    ri.t1.O(obj);
                }
                is.y yVar2 = (is.y) this.F;
                aVar = yVar2.r;
                this.C = aVar;
                this.D = yVar2;
                i11 = 0;
                this.B = 0;
                this.E = 2;
                if (aVar.l(this) == aVar12) {
                    return aVar12;
                }
                yVar = yVar2;
                this.C = aVar;
                this.D = null;
                this.B = i11;
                this.E = 3;
                if (is.y.b(yVar, this) == aVar12) {
                    return aVar12;
                }
                aVar2 = aVar;
                aVar2.i((Object) null);
                return g00.b0.a;
            case 6:
                Boolean bool = l00.a.A;
                int i25 = this.E;
                try {
                    if (i25 == 0) {
                        ri.t1.O(obj);
                        ns.c cVar3 = (ns.c) this.F;
                        aVar3 = cVar3.h;
                        this.C = aVar3;
                        this.D = cVar3;
                        i12 = 0;
                        this.B = 0;
                        this.E = 1;
                        if (aVar3.l(this) != bool) {
                            cVar = cVar3;
                        }
                        return bool;
                    }
                    if (i25 != 1) {
                        if (i25 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar4 = (j40.a) this.C;
                        try {
                            ri.t1.O(obj);
                            bool = (Boolean) obj;
                            bool.getClass();
                            aVar4.i((Object) null);
                            return bool;
                        } catch (Throwable th8) {
                            th3 = th8;
                            aVar4.i((Object) null);
                            throw th3;
                        }
                    }
                    int i26 = this.B;
                    cVar = (ns.c) this.D;
                    j40.a aVar14 = (j40.a) this.C;
                    ri.t1.O(obj);
                    i12 = i26;
                    aVar3 = aVar14;
                    this.C = aVar3;
                    this.D = null;
                    this.B = i12;
                    this.E = 2;
                    obj = ns.c.a(cVar, this);
                    if (obj != bool) {
                        aVar4 = aVar3;
                        bool = (Boolean) obj;
                        bool.getClass();
                        aVar4.i((Object) null);
                    }
                    return bool;
                } catch (Throwable th9) {
                    th3 = th9;
                    aVar4 = aVar3;
                    aVar4.i((Object) null);
                    throw th3;
                }
            case 7:
                g00.b0 b0Var = g00.b0.a;
                uu.w wVar = (uu.w) this.C;
                l00.a aVar15 = l00.a.A;
                int i27 = this.B;
                if (i27 == 0) {
                    ri.t1.O(obj);
                    wVar.f();
                    this.B = 1;
                    obj = wVar.g(true, this);
                    if (obj == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i27 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                k9.u uVar2 = (k9.u) obj;
                if (uVar2 == null) {
                    return b0Var;
                }
                wVar.n.h(new Integer(((PlayerItem) this.D).getSurahNumber()));
                uVar2.setMediaItems((List) this.F);
                uVar2.prepare();
                uVar2.seekToDefaultPosition(this.E);
                uVar2.play();
                return b0Var;
            default:
                Boolean bool2 = l00.a.A;
                int i28 = this.E;
                try {
                    if (i28 == 0) {
                        ri.t1.O(obj);
                        vn.s sVar2 = (vn.s) this.F;
                        aVar5 = sVar2.i;
                        this.C = aVar5;
                        this.D = sVar2;
                        i13 = 0;
                        this.B = 0;
                        this.E = 1;
                        if (aVar5.l(this) != bool2) {
                            sVar = sVar2;
                        }
                        return bool2;
                    }
                    if (i28 != 1) {
                        if (i28 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar6 = (j40.a) this.C;
                        try {
                            ri.t1.O(obj);
                            bool2 = (Boolean) obj;
                            bool2.getClass();
                            aVar6.i((Object) null);
                            return bool2;
                        } catch (Throwable th10) {
                            th4 = th10;
                            aVar6.i((Object) null);
                            throw th4;
                        }
                    }
                    int i29 = this.B;
                    sVar = (vn.s) this.D;
                    j40.a aVar16 = (j40.a) this.C;
                    ri.t1.O(obj);
                    i13 = i29;
                    aVar5 = aVar16;
                    this.C = aVar5;
                    this.D = null;
                    this.B = i13;
                    this.E = 2;
                    obj = vn.s.a(sVar, this);
                    if (obj != bool2) {
                        aVar6 = aVar5;
                        bool2 = (Boolean) obj;
                        bool2.getClass();
                        aVar6.i((Object) null);
                    }
                    return bool2;
                } catch (Throwable th11) {
                    th4 = th11;
                    aVar6 = aVar5;
                    aVar6.i((Object) null);
                    throw th4;
                }
        }
    }
}
