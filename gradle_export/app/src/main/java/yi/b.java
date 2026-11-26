package yi;

import a10.w;
import android.content.Context;
import android.os.Process;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import bt.g2;
import d6.w0;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.t;
import r5.c;
import r5.d;
import s5.i;
import u00.k;

public final class b {

    public static final w[] f16889d = {a0.a.i(new t(b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"))};

    public final String f16890a;

    public final ThreadLocal f16891b;

    public final DataStore f16892c;

    public b(Context context, String str) {
        m.e(context, "context");
        m.e(str, "name");
        this.f16890a = str;
        this.f16891b = new ThreadLocal();
        final int i10 = 0;
        ReplaceFileCorruptionHandler replaceFileCorruptionHandler = new ReplaceFileCorruptionHandler(new k(this) {
            public final b B;

            {
                this.B = this;
            }

            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        CorruptionException corruptionException = (CorruptionException) obj;
                        m.e(corruptionException, "ex");
                        Log.w(a0.a.b(b.class).n(), "CorruptionException in " + this.B.f16890a + " DataStore running in process " + Process.myPid(), corruptionException);
                        return new t5.b(true);
                    default:
                        Context context2 = (Context) obj;
                        m.e(context2, "it");
                        String str2 = this.B.f16890a;
                        LinkedHashSet linkedHashSet = i.f13636a;
                        m.e(str2, "sharedPreferencesName");
                        m.e(linkedHashSet, "keysToMigrate");
                        return va.a.R(new c(context2, str2, d.f13122a, new w0(linkedHashSet, null, 1), new g2(3, (k00.c) null, 3)));
                }
            }
        });
        final int i11 = 1;
        this.f16892c = (DataStore) f50.k.z(str, replaceFileCorruptionHandler, (a) new k(this) {
            public final b B;

            {
                this.B = this;
            }

            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        CorruptionException corruptionException = (CorruptionException) obj;
                        m.e(corruptionException, "ex");
                        Log.w(a0.a.b(b.class).n(), "CorruptionException in " + this.B.f16890a + " DataStore running in process " + Process.myPid(), corruptionException);
                        return new t5.b(true);
                    default:
                        Context context2 = (Context) obj;
                        m.e(context2, "it");
                        String str2 = this.B.f16890a;
                        LinkedHashSet linkedHashSet = i.f13636a;
                        m.e(str2, "sharedPreferencesName");
                        m.e(linkedHashSet, "keysToMigrate");
                        return va.a.R(new c(context2, str2, d.f13122a, new w0(linkedHashSet, null, 1), new g2(3, (k00.c) null, 3)));
                }
            }
        }, 8).b(f16889d[0], context);
    }

    public final void a(k kVar) {
    }
}
