package bw;

import a1.s0;
import a10.w;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.s;

public abstract class f {
    public static final w[] a = {a0.a.h(new s(f.class, "playlistsDataStore", "getPlaylistsDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1))};
    public static final y50.a b;
    public static final b c;
    public static final q5.b d;

    static {
        s0 s0Var = new s0(28);
        y50.a aVar = new y50.a();
        s0Var.invoke(aVar);
        b = aVar;
        c = new b(1);
        d = a.a.t("Playlist.pb", zv.a.A, new ReplaceFileCorruptionHandler(new b(2)), 24);
    }
}
