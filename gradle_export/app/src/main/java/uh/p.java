package uh;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
import k9.x0;

public final class p implements mh.l {

    public static final Logger f15292a = Logger.getLogger(p.class.getName());

    public static final byte[] f15293b = {0};

    public static final p f15294c = new p();

    @Override
    public final Class a() {
        return mh.i.class;
    }

    @Override
    public final Class b() {
        return mh.i.class;
    }

    @Override
    public final Object c(x0 x0Var) throws GeneralSecurityException {
        Iterator it = ((ConcurrentMap) x0Var.B).values().iterator();
        while (it.hasNext()) {
            for (mh.j jVar : (List) it.next()) {
                mh.b bVar = jVar.f10921h;
                if (bVar instanceof n) {
                    n nVar = (n) bVar;
                    byte[] bArr = jVar.f10916c;
                    ai.a aVarA = ai.a.a(bArr == null ? null : Arrays.copyOf(bArr, bArr.length));
                    if (!aVarA.equals(nVar.a())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + nVar.b() + " has wrong output prefix (" + nVar.a() + ") instead of (" + aVarA + ")");
                    }
                }
            }
        }
        return new o(x0Var);
    }
}
