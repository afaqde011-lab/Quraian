package m7;

import androidx.media3.common.t;
import e7.i0;
import fh.t0;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;
import ta.c0;

public abstract class m {
    public final t A;
    public final t0 B;
    public final long C;
    public final List D;
    public final List E;
    public final List F;
    public final j G;

    public m(t tVar, List list, s sVar, List list2, List list3, List list4) {
        c0.s(!list.isEmpty());
        this.A = tVar;
        this.B = t0.o(list);
        this.D = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.E = list3;
        this.F = list4;
        this.G = sVar.a(this);
        long j9 = sVar.f10634c;
        long j10 = sVar.f10633b;
        String str = i0.f5136a;
        this.C = i0.Q(j9, 1000000L, j10, RoundingMode.DOWN);
    }

    public abstract String a();

    public abstract l7.j b();

    public abstract j d();
}
