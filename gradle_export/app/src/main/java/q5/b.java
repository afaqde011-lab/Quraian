package q5;

import a10.w;
import a40.z;
import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.core.okio.OkioStorage;
import b3.k0;
import java.util.List;
import k50.o;
import kotlin.jvm.internal.m;
import u00.k;

public final class b {

    public final String f12764a;

    public final o10.b f12765b;

    public final ReplaceFileCorruptionHandler f12766c;

    public final k f12767d;

    public final z f12768e;

    public final Object f12769f = new Object();

    public volatile DataStore f12770g;

    public b(String str, o10.b bVar, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, k kVar, z zVar) {
        this.f12764a = str;
        this.f12765b = bVar;
        this.f12766c = replaceFileCorruptionHandler;
        this.f12767d = kVar;
        this.f12768e = zVar;
    }

    public final Object a(w wVar, Object obj) {
        DataStore dataStore;
        Context context = (Context) obj;
        m.e(wVar, "property");
        DataStore dataStore2 = this.f12770g;
        if (dataStore2 != null) {
            return dataStore2;
        }
        synchronized (this.f12769f) {
            try {
                if (this.f12770g == null) {
                    Context applicationContext = context.getApplicationContext();
                    DataStoreFactory dataStoreFactory = DataStoreFactory.INSTANCE;
                    OkioStorage okioStorage = new OkioStorage(o.a, this.f12765b, null, new k0(applicationContext, this, 20), 4, null);
                    ReplaceFileCorruptionHandler replaceFileCorruptionHandler = this.f12766c;
                    k kVar = this.f12767d;
                    m.d(applicationContext, "applicationContext");
                    this.f12770g = dataStoreFactory.create(okioStorage, replaceFileCorruptionHandler, (List) kVar.invoke(applicationContext), this.f12768e);
                }
                dataStore = this.f12770g;
                m.b(dataStore);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dataStore;
    }
}
