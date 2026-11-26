package av;

import a40.z;
import bv.o1;
import g00.b0;
import k9.u;
import l1.e1;
import l1.y0;
import l1.z0;
import ri.t1;
import uu.w;

public final class d extends m00.i implements u00.n {
    public final int A = 0;
    public boolean B;
    public final Object C;
    public Object D;

    public d(i iVar, boolean z, z0 z0Var, k00.c cVar) {
        super(2, cVar);
        this.D = iVar;
        this.B = z;
        this.C = z0Var;
    }

    public d(tm.e eVar, e1 e1Var, k00.c cVar) {
        super(2, cVar);
        this.D = eVar;
        this.C = e1Var;
    }

    public d(w wVar, boolean z, k00.c cVar) {
        super(2, cVar);
        this.C = wVar;
        this.B = z;
    }

    public d(boolean z, h0.t tVar, z0 z0Var, k00.c cVar) {
        super(2, cVar);
        this.B = z;
        this.D = tVar;
        this.C = z0Var;
    }

    public d(boolean z, z0 z0Var, y0 y0Var, k00.c cVar) {
        super(2, cVar);
        this.B = z;
        this.C = z0Var;
        this.D = y0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new d((i) this.D, this.B, (z0) this.C, cVar);
            case 1:
                return new d(this.B, (z0) this.C, (y0) this.D, cVar);
            case 2:
                return new d(this.B, (h0.t) this.D, (z0) this.C, cVar);
            case 3:
                d dVar = new d((tm.e) this.D, (e1) this.C, cVar);
                dVar.B = ((Boolean) obj).booleanValue();
                return dVar;
            default:
                d dVar2 = new d((w) this.C, this.B, cVar);
                dVar2.D = obj;
                return dVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                d dVar = (d) create((z) obj, (k00.c) obj2);
                b0 b0Var = b0.a;
                dVar.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                d dVar2 = (d) create((z) obj, (k00.c) obj2);
                b0 b0Var2 = b0.a;
                dVar2.invokeSuspend(b0Var2);
                return b0Var2;
            case 2:
                d dVar3 = (d) create((z) obj, (k00.c) obj2);
                b0 b0Var3 = b0.a;
                dVar3.invokeSuspend(b0Var3);
                return b0Var3;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                d dVar4 = (d) create(bool, (k00.c) obj2);
                b0 b0Var4 = b0.a;
                dVar4.invokeSuspend(b0Var4);
                return b0Var4;
            default:
                d dVar5 = (d) create((u) obj, (k00.c) obj2);
                b0 b0Var5 = b0.a;
                dVar5.invokeSuspend(b0Var5);
                return b0Var5;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        b0 b0Var = b0.a;
        Object obj2 = this.C;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                i iVar = (i) this.D;
                l lVarD = iVar.getChildFragmentManager().D("LyricsSettingsBottomSheetComposeFragment");
                l lVar = lVarD instanceof l ? lVarD : null;
                if (!this.B) {
                    if (lVar != null) {
                        lVar.E = true;
                        lVar.dismissAllowingStateLoss();
                    }
                } else if (((o1) ((z0) obj2).getValue()).R && lVar == null) {
                    new l().show(iVar.getChildFragmentManager(), "LyricsSettingsBottomSheetComposeFragment");
                }
                break;
            case 1:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                if (this.B) {
                    v30.a aVar3 = hv.t.a;
                    ((z0) obj2).setValue(Boolean.FALSE);
                    ((y0) this.D).i(-1);
                }
                break;
            case 2:
                h0.t tVar = (h0.t) this.D;
                l00.a aVar4 = l00.a.A;
                t1.O(obj);
                if (!this.B && y3.f.a(tVar.b(), 0) > 0) {
                    z0 z0Var = (z0) obj2;
                    z0Var.setValue(p30.f.i0((Comparable) z0Var.getValue(), new y3.f(tVar.b())));
                }
                break;
            case 3:
                e1 e1Var = (e1) obj2;
                boolean z = this.B;
                l00.a aVar5 = l00.a.A;
                t1.O(obj);
                float f = z ? 1.0f : 0.0f;
                if (f != e1Var.h()) {
                    e1Var.i(f);
                    ((tm.e) this.D).a(f);
                }
                break;
            default:
                u uVar = (u) this.D;
                l00.a aVar6 = l00.a.A;
                t1.O(obj);
                w.d((w) obj2, uVar, this.B);
                break;
        }
        return b0Var;
    }
}
