package uh;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import k9.x0;

public final class h implements mh.l {

    public static final h f15278a = new h();

    @Override
    public final Class a() {
        return f.class;
    }

    @Override
    public final Class b() {
        return f.class;
    }

    @Override
    public final Object c(x0 x0Var) throws GeneralSecurityException {
        if (((mh.j) x0Var.C) == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = ((ConcurrentMap) x0Var.B).values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new g();
    }
}
