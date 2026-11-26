package l9;

import android.os.Bundle;
import k9.m1;

public final class p extends n {

    public final m1 f10175e;

    public final m1 f10176f;

    public p(m1 m1Var) {
        super(m1Var);
        this.f10176f = m1Var;
        this.f10175e = m1Var;
    }

    @Override
    public final void b(String str, Bundle bundle) {
        if (bundle == null) {
            super.b(str, bundle);
            return;
        }
        o oVar = (o) this.f10172b;
        oVar.getClass();
        oVar.notifyChildrenChanged(str, bundle);
    }
}
