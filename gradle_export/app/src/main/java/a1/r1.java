package a1;

import android.content.BroadcastReceiver;
import com.mchutov.quranify.auth.presentation.screen.root.AuthRootLauncher;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import java.time.LocalDate;

public final class r1 extends m00.i implements u00.k {
    public final int A;
    public final Object B;

    public r1(Object obj, k00.c cVar, int i10) {
        super(1, cVar);
        this.A = i10;
        this.B = obj;
    }

    public final k00.c create(k00.c cVar) {
        switch (this.A) {
            case 0:
                return new r1((t1) this.B, cVar, 0);
            case 1:
                return new r1((bz.s) this.B, cVar, 1);
            case 2:
                return new r1((dq.u) this.B, cVar, 2);
            case 3:
                return new r1((ds.n) this.B, cVar, 3);
            case 4:
                return new r1((du.t0) this.B, cVar, 4);
            case 5:
                return new r1((ez.u) this.B, cVar, 5);
            case 6:
                return new r1((hw.j) this.B, cVar, 6);
            case 7:
                return new r1((hx.e0) this.B, cVar, 7);
            case 8:
                return new r1((oo.g1) this.B, cVar, 8);
            case 9:
                return new r1((BroadcastReceiver.PendingResult) this.B, cVar, 9);
            case 10:
                return new r1((ur.r1) this.B, cVar, 10);
            case 11:
                return new r1((wy.p) this.B, cVar, 11);
            default:
                return new r1((x.b) this.B, cVar, 12);
        }
    }

    public final Object invoke(Object obj) {
        k00.c cVar = (k00.c) obj;
        switch (this.A) {
            case 0:
                r1 r1VarCreate = create(cVar);
                g00.b0 b0Var = g00.b0.a;
                r1VarCreate.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                r1 r1VarCreate2 = create(cVar);
                g00.b0 b0Var2 = g00.b0.a;
                r1VarCreate2.invokeSuspend(b0Var2);
                return b0Var2;
            case 2:
                r1 r1VarCreate3 = create(cVar);
                g00.b0 b0Var3 = g00.b0.a;
                r1VarCreate3.invokeSuspend(b0Var3);
                return b0Var3;
            case 3:
                r1 r1VarCreate4 = create(cVar);
                g00.b0 b0Var4 = g00.b0.a;
                r1VarCreate4.invokeSuspend(b0Var4);
                return b0Var4;
            case 4:
                r1 r1VarCreate5 = create(cVar);
                g00.b0 b0Var5 = g00.b0.a;
                r1VarCreate5.invokeSuspend(b0Var5);
                return b0Var5;
            case 5:
                r1 r1VarCreate6 = create(cVar);
                g00.b0 b0Var6 = g00.b0.a;
                r1VarCreate6.invokeSuspend(b0Var6);
                return b0Var6;
            case 6:
                r1 r1VarCreate7 = create(cVar);
                g00.b0 b0Var7 = g00.b0.a;
                r1VarCreate7.invokeSuspend(b0Var7);
                return b0Var7;
            case 7:
                r1 r1VarCreate8 = create(cVar);
                g00.b0 b0Var8 = g00.b0.a;
                r1VarCreate8.invokeSuspend(b0Var8);
                return b0Var8;
            case 8:
                r1 r1VarCreate9 = create(cVar);
                g00.b0 b0Var9 = g00.b0.a;
                r1VarCreate9.invokeSuspend(b0Var9);
                return b0Var9;
            case 9:
                r1 r1VarCreate10 = create(cVar);
                g00.b0 b0Var10 = g00.b0.a;
                r1VarCreate10.invokeSuspend(b0Var10);
                return b0Var10;
            case 10:
                r1 r1VarCreate11 = create(cVar);
                g00.b0 b0Var11 = g00.b0.a;
                r1VarCreate11.invokeSuspend(b0Var11);
                return b0Var11;
            case 11:
                r1 r1VarCreate12 = create(cVar);
                g00.b0 b0Var12 = g00.b0.a;
                r1VarCreate12.invokeSuspend(b0Var12);
                return b0Var12;
            default:
                r1 r1VarCreate13 = create(cVar);
                g00.b0 b0Var13 = g00.b0.a;
                r1VarCreate13.invokeSuspend(b0Var13);
                return b0Var13;
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i10 = this.A;
        g00.b0 b0Var = g00.b0.a;
        Object obj2 = this.B;
        switch (i10) {
            case 0:
                l00.a aVar = l00.a.A;
                ri.t1.O(obj);
                ((t1) obj2).U.f1958u.setValue(Boolean.FALSE);
                break;
            case 1:
                l00.a aVar2 = l00.a.A;
                ri.t1.O(obj);
                bz.s sVar = (bz.s) obj2;
                sVar.i(bz.p.a((bz.p) ((vm.a) sVar).c.d.getValue(), false, (u30.b) null, (String) null, (String) null, false, false, false, 253));
                break;
            case 2:
                l00.a aVar3 = l00.a.A;
                ri.t1.O(obj);
                ((dq.u) obj2).k = null;
                break;
            case 3:
                l00.a aVar4 = l00.a.A;
                ri.t1.O(obj);
                ds.n nVar = (ds.n) obj2;
                nVar.i(ds.m.a((ds.m) ((vm.a) nVar).c.d.getValue(), (mr.g) null, 0, false, false, 7));
                break;
            case 4:
                l00.a aVar5 = l00.a.A;
                ri.t1.O(obj);
                du.t0 t0Var = (du.t0) obj2;
                t0Var.i(du.n0.a((du.n0) ((vm.a) t0Var).c.d.getValue(), false, (String) null, false, false, false, false, false, false, false, false, (ep.k) null, false, (bu.b) null, (bu.b) null, (bu.b) null, 130559));
                break;
            case 5:
                l00.a aVar6 = l00.a.A;
                ri.t1.O(obj);
                ez.u uVar = (ez.u) obj2;
                uVar.i(ez.t.a((ez.t) ((vm.a) uVar).c.d.getValue(), (String) null, (String) null, (String) null, 0, (ep.f) null, (LocalDate) null, false, false, 447));
                break;
            case 6:
                l00.a aVar7 = l00.a.A;
                ri.t1.O(obj);
                hw.j jVar = (hw.j) obj2;
                jVar.i(hw.f.a((hw.f) ((vm.a) jVar).c.d.getValue(), (u30.b) null, false, false, false, 27));
                break;
            case 7:
                l00.a aVar8 = l00.a.A;
                ri.t1.O(obj);
                hx.e0 e0Var = (hx.e0) obj2;
                e0Var.i(hx.x.a((hx.x) ((vm.a) e0Var).c.d.getValue(), false, false, false, (u30.b) null, false, false, (String) null, (u30.b) null, (u30.b) null, false, (u30.b) null, (u30.b) null, 16382));
                break;
            case 8:
                l00.a aVar9 = l00.a.A;
                ri.t1.O(obj);
                oo.g1 g1Var = (oo.g1) obj2;
                g1Var.i(oo.z0.a((oo.z0) ((vm.a) g1Var).c.d.getValue(), (lo.e) null, 0, (String) null, false, (Long) null, 0.0f, (ru.d) null, (u30.b) null, false, false, false, false, (u30.b) null, false, false, (String) null, false, false, false, (lo.z) null, false, false, false, (lo.i) null, false, 66994175));
                break;
            case 9:
                l00.a aVar10 = l00.a.A;
                ri.t1.O(obj);
                ((BroadcastReceiver.PendingResult) obj2).finish();
                break;
            case 10:
                l00.a aVar11 = l00.a.A;
                ri.t1.O(obj);
                ur.r1 r1Var = (ur.r1) obj2;
                r1Var.i(ur.h1.a((ur.h1) ((vm.a) r1Var).c.d.getValue(), (u30.b) null, (qr.q) null, false, (bx.c) null, false, (u30.b) null, false, (u30.b) null, (u30.b) null, (PlayerItem) null, false, (u30.b) null, (u30.b) null, false, false, false, 0, false, (u30.b) null, (u30.b) null, (mr.g) null, (u30.b) null, 0, 0, 0, false, false, false, (AuthRootLauncher) null, (u30.b) null, (String) null, (String) null, (String) null, (String) null, false, false, (String) null, (String) null, (u30.b) null, (u30.b) null, -49153, 255));
                break;
            case 11:
                l00.a aVar12 = l00.a.A;
                ri.t1.O(obj);
                wy.p pVar = (wy.p) obj2;
                pVar.i(wy.o.a((wy.o) ((vm.a) pVar).c.d.getValue(), (String) null, (String) null, (String) null, (String) null, false, (String) null, 0, 111));
                break;
            default:
                l00.a aVar13 = l00.a.A;
                ri.t1.O(obj);
                x.b.b((x.b) obj2);
                break;
        }
        return b0Var;
    }
}
