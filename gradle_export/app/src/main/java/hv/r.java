package hv;

import a40.z;
import com.google.android.gms.internal.measurement.y3;
import g00.b0;
import java.util.Iterator;
import l1.f1;
import l1.y0;
import l1.z0;
import ri.t1;

public final class r extends m00.i implements u00.n {
    public int A;
    public int B;
    public int C;
    public final boolean D;
    public final Integer E;
    public final boolean F;
    public final u30.b G;
    public final j0.v H;
    public final z0 I;
    public final y0 J;

    public r(boolean z, Integer num, boolean z2, u30.b bVar, j0.v vVar, z0 z0Var, y0 y0Var, k00.c cVar) {
        super(2, cVar);
        this.D = z;
        this.E = num;
        this.F = z2;
        this.G = bVar;
        this.H = vVar;
        this.I = z0Var;
        this.J = y0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        return new r(this.D, this.E, this.F, this.G, this.H, this.I, this.J, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Integer num;
        int iIntValue;
        int i;
        int i2;
        l00.a aVar = l00.a.A;
        int i3 = this.C;
        j0.v vVar = this.H;
        z0 z0Var = this.I;
        f1 f1Var = this.J;
        b0 b0Var = b0.a;
        if (i3 != 0) {
            if (i3 == 1) {
                i = this.B;
                int i4 = this.A;
                t1.O(obj);
                iIntValue = i4;
            } else {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                i2 = this.A;
                t1.O(obj);
            }
            v30.a aVar2 = t.a;
            z0Var.setValue(Boolean.TRUE);
            f1Var.i(i2);
            return b0Var;
        }
        t1.O(obj);
        if (this.D && (num = this.E) != null) {
            iIntValue = num.intValue();
            if (this.F) {
                Iterator it = this.G.iterator();
                int i5 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (((ot.a) it.next()).a == iIntValue) {
                        i = i5;
                        break;
                    }
                    i5++;
                }
                if (i >= 0) {
                    v30.a aVar3 = t.a;
                    if (((Boolean) z0Var.getValue()).booleanValue()) {
                        f1 f1Var2 = f1Var;
                        if (iIntValue != f1Var2.h()) {
                            f1Var2.i(iIntValue);
                            this.A = iIntValue;
                            this.B = i;
                            this.C = 3;
                            if (y3.W(vVar, i, true, this) == aVar) {
                            }
                        }
                    } else {
                        this.A = iIntValue;
                        this.B = i;
                        this.C = 1;
                        if (b40.e.c(this) != aVar) {
                        }
                    }
                    return aVar;
                }
            }
        }
        return b0Var;
        this.A = iIntValue;
        this.B = i;
        this.C = 2;
        if (y3.W(vVar, i, false, this) != aVar) {
            i2 = iIntValue;
            v30.a aVar4 = t.a;
            z0Var.setValue(Boolean.TRUE);
            f1Var.i(i2);
            return b0Var;
        }
        return aVar;
    }
}
