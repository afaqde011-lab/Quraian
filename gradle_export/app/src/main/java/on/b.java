package on;

import a40.z;
import com.mchutov.quranify.appwidget.domain.model.RecentPlayEntry;
import g00.b0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import m00.i;
import u00.n;

public final class b extends i implements n {
    public Object A;
    public Map B;
    public String C;
    public Map D;
    public d E;
    public Collection F;
    public Iterator G;
    public RecentPlayEntry H;
    public String I;
    public String J;
    public Integer K;
    public String L;
    public Long M;
    public Collection N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public final d U;

    public b(d dVar, k00.c cVar) {
        super(2, cVar);
        this.U = dVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        return new b(this.U, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        throw new UnsupportedOperationException("Method not decompiled: on.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
