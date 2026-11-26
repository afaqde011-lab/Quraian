package ir;

import a10.w;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import hx.t;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.s;

public abstract class e {
    public static final w[] a = {a0.a.h(new s(e.class, "listeningTimerDataStore", "getListeningTimerDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    public static final y50.a b;
    public static final q5.b c;
    public static final t d;

    static {
        t tVar = new t(2);
        y50.a aVar = new y50.a();
        tVar.invoke(aVar);
        b = aVar;
        c = a.a.t("ListeningTimer.pb", fr.a.A, (ReplaceFileCorruptionHandler) null, 28);
        d = new t(4);
    }
}
