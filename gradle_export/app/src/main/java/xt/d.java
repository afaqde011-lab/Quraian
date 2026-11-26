package xt;

import a10.w;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.s;

public abstract class d {
    public static final w[] a = {a0.a.h(new s(d.class, "localSurahDataStore", "getLocalSurahDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    public static final y50.a b;
    public static final q5.b c;

    static {
        xn.a aVar = new xn.a(12);
        y50.a aVar2 = new y50.a();
        aVar.invoke(aVar2);
        b = aVar2;
        c = a.a.t("DownloadedSurah.pb", vt.a.A, (ReplaceFileCorruptionHandler) null, 28);
    }
}
