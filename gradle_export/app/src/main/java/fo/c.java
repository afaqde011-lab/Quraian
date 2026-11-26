package fo;

import a10.w;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.s;

public abstract class c {
    public static final w[] a = {a0.a.h(new s(c.class, "audioStoryCatalogsDataStore", "getAudioStoryCatalogsDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    public static final y50.a b;
    public static final q5.b c;

    static {
        e6.c cVar = new e6.c(12);
        y50.a aVar = new y50.a();
        cVar.invoke(aVar);
        b = aVar;
        c = a.a.t("AudioStoryCatalog.pb", yn.a.A, new ReplaceFileCorruptionHandler(new e6.c(13)), 24);
    }
}
