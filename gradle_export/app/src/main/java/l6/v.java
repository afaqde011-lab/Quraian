package l6;

import android.content.Context;
import android.view.View;
import c3.g1;
import d40.l1;
import java.util.List;
import k9.b3;
import l1.p2;
import l1.z0;
import x.g0;
import x.n1;
import x.y0;

public final class v extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final Object C;
    public Object D;
    public Object E;
    public final Object F;

    public v(View view, cd.b bVar, g00.k kVar, List list, k00.c cVar) {
        super(2, cVar);
        this.A = 7;
        tc.b[] bVarArr = tc.b.A;
        this.D = view;
        this.E = bVar;
        this.F = kVar;
        this.C = list;
    }

    public v(g1 g1Var, String str, ol.b bVar, Context context, k00.c cVar) {
        super(2, cVar);
        this.A = 12;
        this.D = g1Var;
        this.F = str;
        this.C = bVar;
        this.E = context;
    }

    public v(Object obj, Object obj2, Object obj3, Object obj4, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.D = obj;
        this.E = obj2;
        this.F = obj3;
        this.C = obj4;
    }

    public v(Object obj, Object obj2, Object obj3, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.E = obj;
        this.F = obj2;
        this.C = obj3;
    }

    public v(z0 z0Var, g0 g0Var, k00.c cVar) {
        super(2, cVar);
        this.A = 11;
        this.F = z0Var;
        this.C = g0Var;
    }

    public v(y yVar, b3 b3Var, a40.z zVar, u00.n nVar, k00.c cVar) {
        super(2, cVar);
        this.A = 1;
        this.C = yVar;
        this.D = b3Var;
        this.E = zVar;
        this.F = nVar;
    }

    public v(ld.l lVar, String str, gd.a aVar, int i10, String str2, k00.c cVar) {
        super(2, cVar);
        this.A = 2;
        this.D = lVar;
        this.E = str;
        this.F = aVar;
        this.B = i10;
        this.C = str2;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        int i10 = this.A;
        Object obj2 = this.C;
        Object obj3 = this.F;
        switch (i10) {
            case 0:
                return new v((d6.r) this.D, (Context) this.E, (Throwable) obj3, (y) obj2, cVar, 0);
            case 1:
                return new v((y) obj2, (b3) this.D, (a40.z) this.E, (u00.n) obj3, cVar);
            case 2:
                return new v((ld.l) this.D, (String) this.E, (gd.a) obj3, this.B, (String) obj2, cVar);
            case 3:
                return new v((j0.v) this.D, (po.p) this.E, (z0) obj3, (l1.g1) obj2, cVar, 3);
            case 4:
                return new v((j0.v) this.D, (z0) this.E, (z0) obj3, (p2) obj2, cVar, 4);
            case 5:
                v vVar = new v((pz.j) this.E, (g2.l) obj3, (g2.t) obj2, cVar, 5);
                vVar.D = obj;
                return vVar;
            case 6:
                v vVar2 = new v((y0) this.E, (q9.c) obj3, (n1) obj2, cVar, 6);
                vVar2.D = obj;
                return vVar2;
            case 7:
                tc.b[] bVarArr = tc.b.A;
                return new v((View) this.D, (cd.b) this.E, (g00.k) obj3, (List) obj2, cVar);
            case 8:
                return new v((bx.c) this.E, (uu.w) obj3, (List) obj2, cVar, 8);
            case 9:
                return new v((wy.p) this.D, (wy.m) this.E, (u00.a) obj3, (ol.b) obj2, cVar, 9);
            case 10:
                return new v(this.D, (x.b) this.E, (z0) obj3, (z0) obj2, cVar, 10);
            case 11:
                v vVar3 = new v((z0) obj3, (g0) obj2, cVar);
                vVar3.E = obj;
                return vVar3;
            case 12:
                return new v((g1) this.D, (String) obj3, (ol.b) obj2, (Context) this.E, cVar);
            default:
                return new v((zj.d) this.D, this.E, (z.b) obj3, (l1) obj2, cVar, 13);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                return create(zVar, cVar).invokeSuspend(g00.b0.a);
            case 1:
                return create(zVar, cVar).invokeSuspend(g00.b0.a);
            case 2:
                v vVarCreate = create(zVar, cVar);
                g00.b0 b0Var = g00.b0.a;
                vVarCreate.invokeSuspend(b0Var);
                return b0Var;
            case 3:
                return create(zVar, cVar).invokeSuspend(g00.b0.a);
            case 4:
                return create(zVar, cVar).invokeSuspend(g00.b0.a);
            case 5:
                return create(zVar, cVar).invokeSuspend(g00.b0.a);
            case 6:
                return create(zVar, cVar).invokeSuspend(g00.b0.a);
            case 7:
                return create(zVar, cVar).invokeSuspend(g00.b0.a);
            case 8:
                return create(zVar, cVar).invokeSuspend(g00.b0.a);
            case 9:
                return create(zVar, cVar).invokeSuspend(g00.b0.a);
            case 10:
                return create(zVar, cVar).invokeSuspend(g00.b0.a);
            case 11:
                create(zVar, cVar).invokeSuspend(g00.b0.a);
                return l00.a.A;
            case 12:
                return create(zVar, cVar).invokeSuspend(g00.b0.a);
            default:
                return create(zVar, cVar).invokeSuspend(g00.b0.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        throw new UnsupportedOperationException("Method not decompiled: l6.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
