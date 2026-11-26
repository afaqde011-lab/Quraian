package no;

import android.content.Context;
import androidx.media3.common.d1;
import androidx.media3.exoplayer.ExoPlayer;
import i7.l1;
import i7.z;
import java.util.ArrayList;
import java.util.Iterator;
import ta.c0;

public final class e {
    public final Context a;
    public z b;
    public final ArrayList c = new ArrayList();

    public e(Context context) {
        this.a = context;
    }

    public final ExoPlayer a() {
        z zVarA = this.b;
        if (zVarA == null) {
            i7.l lVar = new i7.l(this.a);
            c0.A(!lVar.A);
            lVar.p = 10000L;
            c0.A(!lVar.A);
            lVar.q = 10000L;
            lVar.b(kh.o.C());
            zVarA = lVar.a();
            kh.o.t(zVarA);
            l1 l1Var = l1.c;
            zVarA.A();
            if (l1Var == null) {
                l1Var = l1.e;
            }
            if (!zVarA.P.equals(l1Var)) {
                zVarA.P = l1Var;
                zVarA.l.H.b(5, l1Var).b();
            }
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                zVarA.addListener((d1) it.next());
            }
            this.b = zVarA;
        }
        return zVarA;
    }
}
