package l9;

import android.os.IBinder;
import java.util.HashMap;
import k9.m1;

public final class l implements IBinder.DeathRecipient {

    public final String f10160a;

    public final int f10161b;

    public final int f10162c;

    public final g0 f10163d;

    public final h f10164e;

    public final HashMap f10165f = new HashMap();

    public final m1 f10166g;

    public l(m1 m1Var, String str, int i10, int i11, h hVar) {
        this.f10166g = m1Var;
        this.f10160a = str;
        this.f10161b = i10;
        this.f10162c = i11;
        this.f10163d = new g0(str, i10, i11);
        this.f10164e = hVar;
    }

    @Override
    public final void binderDied() {
        this.f10166g.G.post(new k(this));
    }
}
