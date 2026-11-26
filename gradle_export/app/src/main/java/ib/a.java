package ib;

import ab.y;
import androidx.work.impl.WorkDatabase;
import hb.u;
import hb.x;
import java.util.Iterator;
import java.util.List;

public final class a implements Runnable {
    public final int A;
    public final WorkDatabase B;
    public final String C;
    public final y D;

    public a(WorkDatabase workDatabase, String str, y yVar, int i10) {
        this.A = i10;
        this.B = workDatabase;
        this.C = str;
        this.D = yVar;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                x xVarW = this.B.w();
                xVarW.getClass();
                String str = this.C;
                kotlin.jvm.internal.m.e(str, "name");
                Iterator it = ((List) rd.a.M(xVarW.f7028a, true, false, new b6.o(str, 27))).iterator();
                while (it.hasNext()) {
                    g.a(this.D, (String) it.next());
                }
                break;
            default:
                x xVarW2 = this.B.w();
                xVarW2.getClass();
                String str2 = this.C;
                kotlin.jvm.internal.m.e(str2, "tag");
                Iterator it2 = ((List) rd.a.M(xVarW2.f7028a, true, false, new u(str2, 2))).iterator();
                while (it2.hasNext()) {
                    g.a(this.D, (String) it2.next());
                }
                break;
        }
    }
}
