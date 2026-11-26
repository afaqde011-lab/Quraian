package a1;

import android.content.BroadcastReceiver;
import android.content.Context;
import bv.e3;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.quranify.player.domain.model.PlayerItem;

public final class e2 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public Object C;
    public Object D;
    public final Object E;

    public e2(a40.e1 e1Var, u00.n nVar, k00.c cVar) {
        super(2, cVar);
        this.A = 19;
        this.D = e1Var;
        this.E = (m00.i) nVar;
    }

    public e2(a40.q qVar, u00.n nVar, k00.c cVar) {
        super(2, cVar);
        this.A = 29;
        this.D = qVar;
        this.E = (m00.i) nVar;
    }

    public e2(f40.c cVar, BroadcastReceiver.PendingResult pendingResult, u00.n nVar, k00.c cVar2) {
        super(2, cVar2);
        this.A = 21;
        this.C = cVar;
        this.D = pendingResult;
        this.E = (m00.i) nVar;
    }

    public e2(Object obj, Object obj2, Object obj3, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = obj;
        this.D = obj2;
        this.E = obj3;
    }

    public e2(Object obj, Object obj2, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.D = obj;
        this.E = obj2;
    }

    public e2(Object obj, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.E = obj;
    }

    public e2(u00.o oVar, d0.t1 t1Var, v2.s sVar, k00.c cVar) {
        super(2, cVar);
        this.A = 18;
        this.C = (m00.i) oVar;
        this.D = t1Var;
        this.E = sVar;
    }

    private final Object i(Object obj) {
        l00.a aVar = l00.a.A;
        int i10 = this.B;
        g00.b0 b0Var = g00.b0.a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(obj);
            return b0Var;
        }
        ri.t1.O(obj);
        a40.z zVar = (a40.z) this.C;
        d40.j jVar = (d40.j) this.D;
        c40.v vVarH = ((e40.d) this.E).h(zVar);
        this.B = 1;
        Object objR = d40.o.r(jVar, vVarH, true, this);
        if (objR != aVar) {
            objR = b0Var;
        }
        return objR == aVar ? aVar : b0Var;
    }

    private final Object j(Object obj) {
        l00.a aVar = l00.a.A;
        int i10 = this.B;
        if (i10 == 0) {
            ri.t1.O(obj);
            a40.z zVar = (a40.z) this.C;
            d40.n nVar = (d40.n) this.D;
            d40.j jVar = (d40.j) this.E;
            this.B = 1;
            if (nVar.invoke(zVar, jVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(obj);
        }
        return g00.b0.a;
    }

    private final Object k(Object obj) {
        kotlin.jvm.internal.z zVar;
        l00.a aVar = l00.a.A;
        int i10 = this.B;
        if (i10 == 0) {
            ri.t1.O(obj);
            kotlin.jvm.internal.z zVar2 = (kotlin.jvm.internal.z) this.D;
            ea.w wVar = (ea.w) this.E;
            this.C = zVar2;
            this.B = 1;
            Object objA = wVar.a(this);
            if (objA == aVar) {
                return aVar;
            }
            obj = objA;
            zVar = zVar2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zVar = (kotlin.jvm.internal.z) this.C;
            ri.t1.O(obj);
        }
        zVar.A = obj;
        return g00.b0.a;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new e2((b1.e0) this.C, (v2.v) this.D, (o1) this.E, cVar, 0);
            case 1:
                return new e2((ab.l0) this.C, (za.u) this.D, (ib.n) this.E, cVar, 1);
            case 2:
                return new e2((as.b1) this.C, (u00.a) this.D, (Context) this.E, cVar, 2);
            case 3:
                return new e2((az.r) this.C, (String) this.D, (String) this.E, cVar, 3);
            case 4:
                return new e2((bp.b) this.D, (String) this.E, cVar, 4);
            case 5:
                return new e2((bt.j2) this.D, (ep.a) this.E, cVar, 5);
            case 6:
                return new e2((bt.j2) this.D, (ep.m) this.E, cVar, 6);
            case 7:
                e2 e2Var = new e2((e3) this.D, (cy.g) this.E, cVar, 7);
                e2Var.C = obj;
                return e2Var;
            case 8:
                return new e2((e3) this.C, (yu.e) this.D, (su.d) this.E, cVar, 8);
            case 9:
                return new e2((e3) this.D, (PlayerItem) this.E, cVar, 9);
            case 10:
                return new e2((c40.h) this.E, cVar, 10);
            case 11:
                e2 e2Var2 = new e2((ca.l0) this.E, cVar, 11);
                e2Var2.D = obj;
                return e2Var2;
            case 12:
                e2 e2Var3 = new e2((d0.n) this.D, (u00.n) this.E, cVar, 12);
                e2Var3.C = obj;
                return e2Var3;
            case 13:
                return new e2((d0.n) this.C, (z.b1) this.D, (u00.n) this.E, cVar, 13);
            case 14:
                e2 e2Var4 = new e2((d0.n0) this.D, (d0.s0) this.E, cVar, 14);
                e2Var4.C = obj;
                return e2Var4;
            case 15:
                e2 e2Var5 = new e2((d0.s0) this.D, (d0.w) this.E, cVar, 15);
                e2Var5.C = obj;
                return e2Var5;
            case 16:
                e2 e2Var6 = new e2((d0.n0) this.D, (d0.u2) this.E, cVar, 16);
                e2Var6.C = obj;
                return e2Var6;
            case 17:
                e2 e2Var7 = new e2((d0.u2) this.D, (u00.n) this.E, cVar, 17);
                e2Var7.C = obj;
                return e2Var7;
            case TYPE_SINT64_VALUE:
                return new e2((u00.o) this.C, (d0.t1) this.D, (v2.s) this.E, cVar);
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                e2 e2Var8 = new e2((a40.e1) this.D, (u00.n) this.E, cVar);
                e2Var8.C = obj;
                return e2Var8;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                return new e2((d6.p0) this.C, (Context) this.D, (d6.h) this.E, cVar, 20);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                return new e2((f40.c) this.C, (BroadcastReceiver.PendingResult) this.D, (u00.n) this.E, cVar);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                e2 e2Var9 = new e2((za.e) this.D, (db.d) this.E, cVar, 22);
                e2Var9.C = obj;
                return e2Var9;
            case 23:
                return new e2((db.g) this.C, (hb.p) this.D, (db.e) this.E, cVar, 23);
            case 24:
                return new e2((am.c) this.C, (ol.b) this.D, (Context) this.E, cVar, 24);
            case 25:
                e2 e2Var10 = new e2((l1.p2) this.D, (x.b) this.E, cVar, 25);
                e2Var10.C = obj;
                return e2Var10;
            case RuntimeVersion.MINOR:
                e2 e2Var11 = new e2((d40.j) this.D, (e40.d) this.E, cVar, 26);
                e2Var11.C = obj;
                return e2Var11;
            case 27:
                e2 e2Var12 = new e2((d40.n) this.D, (d40.j) this.E, cVar, 27);
                e2Var12.C = obj;
                return e2Var12;
            case 28:
                return new e2((kotlin.jvm.internal.z) this.D, (ea.w) this.E, cVar, 28);
            default:
                e2 e2Var13 = new e2((a40.q) this.D, (u00.n) this.E, cVar);
                e2Var13.C = obj;
                return e2Var13;
        }
    }

    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.A) {
            case 0:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 1:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 2:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 3:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 4:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 5:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 6:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 7:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 8:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 9:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 10:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 11:
                return create((ca.b0) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 12:
                return create((d0.y1) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 13:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 14:
                return create((h1.k) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 15:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 16:
                return create((d0.s2) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 17:
                return create((d0.y1) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case TYPE_SINT64_VALUE:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                return create((c40.t) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 23:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 24:
                create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
                return l00.a.A;
            case 25:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case RuntimeVersion.MINOR:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 27:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 28:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            default:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: a1.e2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
