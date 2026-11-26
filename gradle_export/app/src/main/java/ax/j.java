package ax;

import a1.s0;
import a10.w;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.s;

public abstract class j {
    public static final w[] a;
    public static final y50.a b;
    public static final s0 c;
    public static final q5.b d;
    public static final q5.b e;

    static {
        s sVar = new s(j.class, "recentSearchedRecitersDataStore", "getRecentSearchedRecitersDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1);
        b0 b0Var = a0.a;
        a = new w[]{b0Var.h(sVar), a1.b.h(j.class, "recitersDataStore", "getRecitersDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1, b0Var)};
        s0 s0Var = new s0(11);
        y50.a aVar = new y50.a();
        s0Var.invoke(aVar);
        b = aVar;
        c = new s0(14);
        d = a.a.t("RecentSearchedReciter.pb", yw.b.A, new ReplaceFileCorruptionHandler(new s0(16)), 24);
        yw.c cVar = yw.c.A;
        yw.c cVar2 = yw.c.A;
        a5.f fVar = new a5.f();
        fVar.A = yw.c.B;
        e = a.a.t("Reciter.pb", fVar, new ReplaceFileCorruptionHandler(new s0(17)), 24);
    }
}
