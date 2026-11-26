package db;

import a1.e2;
import a40.a0;
import a40.c0;
import a40.u1;
import hb.p;
import k00.i;
import kotlin.jvm.internal.m;
import za.v;

public abstract class h {

    public static final String f4853a;

    static {
        String strF = v.f("WorkConstraintsTracker");
        m.d(strF, "tagWithPrefix(...)");
        f4853a = strF;
    }

    public static final u1 a(g gVar, p pVar, a40.v vVar, e eVar) {
        m.e(gVar, "<this>");
        m.e(vVar, "dispatcher");
        m.e(eVar, "listener");
        return c0.y(c0.c(vVar), (i) null, (a0) null, new e2(gVar, pVar, eVar, null, 23), 3);
    }
}
