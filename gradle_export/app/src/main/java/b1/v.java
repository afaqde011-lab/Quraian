package b1;

import android.view.View;
import q0.r0;

public final class v extends m00.h implements u00.n {
    public final int B;
    public int C;
    public Object D;
    public final Object E;

    public v(Object obj, k00.c cVar, int i10) {
        super(2, cVar);
        this.B = i10;
        this.E = obj;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.B) {
            case 0:
                v vVar = new v((e0) this.E, cVar, 0);
                vVar.D = obj;
                return vVar;
            case 1:
                v vVar2 = new v((r0) this.E, cVar, 1);
                vVar2.D = obj;
                return vVar2;
            case 2:
                v vVar3 = new v((v2.l) this.E, cVar, 2);
                vVar3.D = obj;
                return vVar3;
            case 3:
                v vVar4 = new v((z.j) this.E, cVar, 3);
                vVar4.D = obj;
                return vVar4;
            default:
                v vVar5 = new v((View) this.E, cVar, 4);
                vVar5.D = obj;
                return vVar5;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.B) {
            case 0:
                create((v2.i0) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
                return l00.a.A;
            case 1:
                create((v2.i0) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
                return l00.a.A;
            case 2:
                return create((v2.i0) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 3:
                return create((v2.i0) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            default:
                return create((q30.k) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: b1.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
