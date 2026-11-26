package yr;

import android.content.Context;
import b2.r;
import g00.b0;
import l1.j;
import l1.q;
import u00.k;
import u00.n;
import zy.l;

public final class c implements n {
    public final int A;
    public final Object B;
    public final Object C;

    public c(Object obj, Object obj2, int i, int i2) {
        this.A = i2;
        this.B = obj;
        this.C = obj2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                a.f((u30.b) this.B, (Context) this.C, (j) obj, q.K(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                a.j((bx.c) this.B, (r) this.C, (j) obj, q.K(57));
                break;
            default:
                ((Integer) obj2).getClass();
                ze.d.a((l) this.B, (k) this.C, (j) obj, q.K(1));
                break;
        }
        return b0.a;
    }
}
