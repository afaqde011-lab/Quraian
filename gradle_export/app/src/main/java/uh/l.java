package uh;

import java.security.GeneralSecurityException;
import th.t;
import yh.o0;
import yh.q1;

public abstract class l {

    public static final th.k f15285a;

    public static final th.j f15286b;

    public static final th.c f15287c;

    public static final th.a f15288d;

    static {
        ai.a aVarB = t.b("type.googleapis.com/google.crypto.tink.HmacKey");
        f15285a = new th.k(j.class);
        f15286b = new th.j(aVarB);
        f15287c = new th.c(i.class);
        f15288d = new th.a(aVarB, new k(0));
    }

    public static c a(o0 o0Var) throws GeneralSecurityException {
        int iOrdinal = o0Var.ordinal();
        if (iOrdinal == 1) {
            return c.f15262g;
        }
        if (iOrdinal == 2) {
            return c.f15265j;
        }
        if (iOrdinal == 3) {
            return c.f15264i;
        }
        if (iOrdinal == 4) {
            return c.f15266k;
        }
        if (iOrdinal == 5) {
            return c.f15263h;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + o0Var.getNumber());
    }

    public static c b(q1 q1Var) throws GeneralSecurityException {
        int iOrdinal = q1Var.ordinal();
        if (iOrdinal == 1) {
            return c.l;
        }
        if (iOrdinal == 2) {
            return c.f15267n;
        }
        if (iOrdinal == 3) {
            return c.f15268o;
        }
        if (iOrdinal == 4) {
            return c.m;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + q1Var.getNumber());
    }
}
