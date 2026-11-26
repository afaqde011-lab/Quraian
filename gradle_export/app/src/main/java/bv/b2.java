package bv;

import com.google.android.gms.internal.measurement.b5;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import java.util.Iterator;
import java.util.List;

public final class b2 extends m00.i implements u00.n {
    public final int A;
    public Object B;
    public final e3 C;

    public b2(e3 e3Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = e3Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                b2 b2Var = new b2(this.C, cVar, 0);
                b2Var.B = obj;
                return b2Var;
            case 1:
                b2 b2Var2 = new b2(this.C, cVar, 1);
                b2Var2.B = obj;
                return b2Var2;
            case 2:
                b2 b2Var3 = new b2(this.C, cVar, 2);
                b2Var3.B = obj;
                return b2Var3;
            case 3:
                b2 b2Var4 = new b2(this.C, cVar, 3);
                b2Var4.B = obj;
                return b2Var4;
            case 4:
                b2 b2Var5 = new b2(this.C, cVar, 4);
                b2Var5.B = obj;
                return b2Var5;
            default:
                b2 b2Var6 = new b2(this.C, cVar, 5);
                b2Var6.B = obj;
                return b2Var6;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                b2 b2Var = (b2) create((g00.k) obj, (k00.c) obj2);
                g00.b0 b0Var = g00.b0.a;
                b2Var.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                b2 b2Var2 = (b2) create((g00.k) obj, (k00.c) obj2);
                g00.b0 b0Var2 = g00.b0.a;
                b2Var2.invokeSuspend(b0Var2);
                return b0Var2;
            case 2:
                b2 b2Var3 = (b2) create((u30.b) obj, (k00.c) obj2);
                g00.b0 b0Var3 = g00.b0.a;
                b2Var3.invokeSuspend(b0Var3);
                return b0Var3;
            case 3:
                b2 b2Var4 = (b2) create((cy.g) obj, (k00.c) obj2);
                g00.b0 b0Var4 = g00.b0.a;
                b2Var4.invokeSuspend(b0Var4);
                return b0Var4;
            case 4:
                b2 b2Var5 = (b2) create((dv.e) obj, (k00.c) obj2);
                g00.b0 b0Var5 = g00.b0.a;
                b2Var5.invokeSuspend(b0Var5);
                return b0Var5;
            default:
                b2 b2Var6 = (b2) create((rt.g) obj, (k00.c) obj2);
                g00.b0 b0Var6 = g00.b0.a;
                b2Var6.invokeSuspend(b0Var6);
                return b0Var6;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        o1 o1Var;
        boolean z;
        int i = this.A;
        g00.b0 b0Var = g00.b0.a;
        e3 e3Var = this.C;
        switch (i) {
            case 0:
                gq.a aVar = e3Var.t;
                g00.k kVar = (g00.k) this.B;
                l00.a aVar2 = l00.a.A;
                ri.t1.O(obj);
                boolean zBooleanValue = ((Boolean) kVar.A).booleanValue();
                boolean zBooleanValue2 = ((Boolean) kVar.B).booleanValue();
                if (zBooleanValue2) {
                    ((hq.b) aVar).c();
                } else if (zBooleanValue) {
                    ((hq.b) aVar).b();
                }
                e3Var.i(o1.a((o1) e3Var.c.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, zBooleanValue && zBooleanValue2, zBooleanValue2, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -3073, 16777215));
                break;
            case 1:
                g00.k kVar2 = (g00.k) this.B;
                l00.a aVar3 = l00.a.A;
                ri.t1.O(obj);
                ot.b bVar = (ot.b) kVar2.A;
                String str = (String) kVar2.B;
                e3Var.i(o1.a((o1) e3Var.c.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, bVar, str, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -1, 16777209));
                e3Var.L();
                if (e3Var.C.isEmpty() && str.length() > 0) {
                    e3Var.z();
                }
                break;
            case 2:
                u30.b bVar2 = (u30.b) this.B;
                l00.a aVar4 = l00.a.A;
                ri.t1.O(obj);
                e3Var.i(o1.a((o1) e3Var.c.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, b5.D(bVar2) != null, null, false, false, false, -1, 16515071));
                break;
            case 3:
                cy.g gVar = (cy.g) this.B;
                l00.a aVar5 = l00.a.A;
                ri.t1.O(obj);
                a40.u1 u1Var = e3Var.B;
                if (u1Var != null) {
                    u1Var.i(null);
                }
                if (gVar != null) {
                    e3Var.B = ta.c0.M(androidx.lifecycle.u0.i(e3Var), (k00.i) null, (u00.n) null, (u00.k) null, new a1.d(e3Var, gVar, (k00.c) null, 16), 31);
                }
                break;
            case 4:
                dv.e eVar = (dv.e) this.B;
                l00.a aVar6 = l00.a.A;
                ri.t1.O(obj);
                o1 o1Var2 = (o1) e3Var.c.d.getValue();
                dv.a aVar7 = eVar.a;
                dv.d dVar = eVar.b;
                dv.c cVar = eVar.c;
                dv.f fVar = eVar.d;
                dv.b bVar3 = eVar.e;
                o1 o1VarA = o1.a(o1Var2, aVar7.a, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -2, 16777215);
                u30.b bVar4 = o1VarA.E;
                Integer numT = (!o1VarA.D || ((h00.b) bVar4).isEmpty()) ? null : c7.i.T(o1VarA.a, bVar4);
                long j = aVar7.a;
                long j2 = aVar7.b;
                float f = aVar7.c;
                float f2 = aVar7.d;
                PlayerItem playerItem = dVar.a;
                boolean z2 = dVar.b;
                boolean z3 = dVar.c;
                boolean z4 = bVar3.a;
                int i2 = cVar.a;
                List list = cVar.b;
                if (playerItem != null && (list == null || !list.isEmpty())) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        o1Var = o1Var2;
                        long j3 = j;
                        if (((zq.a) it.next()).a == playerItem.getSurahId()) {
                            j = j3;
                            z = true;
                        } else {
                            it = it2;
                            o1Var2 = o1Var;
                            j = j3;
                        }
                    }
                    o1Var = o1Var2;
                    z = false;
                } else {
                    o1Var = o1Var2;
                    z = false;
                }
                e3Var.i(o1.a(o1Var, j, j2, f, f2, bVar3.b, playerItem, z2, z3, i2, z, false, false, cVar.c, cVar.d, cVar.e, fVar.a, fVar.b, fVar.c, fVar.d, null, z4, false, false, false, false, false, false, null, false, false, null, numT, null, null, null, null, false, null, null, null, null, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, 2145913856, 16777215));
                break;
            default:
                rt.g gVar2 = (rt.g) this.B;
                l00.a aVar8 = l00.a.A;
                ri.t1.O(obj);
                e3Var.i(o1.a((o1) e3Var.c.d.getValue(), 0L, 0L, 0.0f, 0.0f, 0.0f, null, false, false, 0, false, false, false, null, null, null, null, null, null, false, null, false, false, false, false, false, false, false, null, false, false, null, null, null, null, null, null, false, null, null, null, gVar2, 0, false, false, false, false, null, false, null, null, false, null, false, false, false, -1, 16776959));
                break;
        }
        return b0Var;
    }
}
