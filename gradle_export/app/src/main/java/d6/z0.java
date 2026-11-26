package d6;

import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;

public final class z0 extends m00.c {
    public p0 A;
    public ComponentName B;
    public AppWidgetProviderInfo C;
    public int[] D;
    public long[] E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public long K;
    public Object L;
    public final a1 M;
    public int N;

    public z0(a1 a1Var, m00.c cVar) {
        super(cVar);
        this.M = a1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.L = obj;
        this.N |= Integer.MIN_VALUE;
        return this.M.d(null, null, this);
    }
}
