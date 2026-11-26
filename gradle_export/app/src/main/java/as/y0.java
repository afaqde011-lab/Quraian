package as;

import android.content.Context;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import d0.y1;
import d6.f1;
import g1.b5;
import is.c1;

public final class y0 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public int C;
    public Object D;
    public final Object E;

    public y0(int i, x.b bVar, l1.z0 z0Var, k00.c cVar) {
        super(2, cVar);
        this.A = 6;
        this.C = i;
        this.D = bVar;
        this.E = z0Var;
    }

    public y0(Object obj, int i, k00.c cVar, int i2) {
        super(2, cVar);
        this.A = i2;
        this.E = obj;
        this.C = i;
    }

    public y0(Object obj, Object obj2, int i, k00.c cVar, int i2) {
        super(2, cVar);
        this.A = i2;
        this.D = obj;
        this.E = obj2;
        this.C = i;
    }

    public y0(Object obj, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.E = obj;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new y0((b1) this.E, cVar, 0);
            case 1:
                return new y0((f1) this.D, (Context) this.E, this.C, cVar, 1);
            case 2:
                return new y0((b5) this.E, cVar, 2);
            case 3:
                y0 y0Var = new y0((c1) this.E, this.C, cVar, 3);
                y0Var.D = obj;
                return y0Var;
            case 4:
                y0 y0Var2 = new y0((j0.v) this.E, this.C, cVar, 4);
                y0Var2.D = obj;
                return y0Var2;
            case 5:
                y0 y0Var3 = new y0((os.x) this.E, cVar, 5);
                y0Var3.D = obj;
                return y0Var3;
            case 6:
                return new y0(this.C, (x.b) this.D, (l1.z0) this.E, cVar);
            case 7:
                return new y0((ho.g) this.D, (qo.y) this.E, this.C, cVar, 7);
            default:
                return new y0((uu.w) this.D, (PlayerItem) this.E, this.C, cVar, 8);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return ((y0) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 1:
                return ((y0) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 2:
                return ((y0) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 3:
                return ((y0) create((d40.j) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 4:
                return ((y0) create((y1) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 5:
                return ((y0) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 6:
                return ((y0) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 7:
                return ((y0) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            default:
                return ((y0) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        throw new UnsupportedOperationException("Method not decompiled: as.y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
