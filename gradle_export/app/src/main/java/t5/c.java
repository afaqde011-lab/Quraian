package t5;

import androidx.datastore.core.DataStore;
import androidx.lifecycle.l0;
import d40.i;
import kotlin.jvm.internal.m;
import u00.n;

public final class c implements DataStore {

    public final DataStore f14356a;

    public c(DataStore dataStore) {
        m.e(dataStore, "delegate");
        this.f14356a = dataStore;
    }

    @Override
    public final i getData() {
        return this.f14356a.getData();
    }

    @Override
    public final Object updateData(n nVar, k00.c cVar) {
        return this.f14356a.updateData(new l0(nVar, null, 1), cVar);
    }
}
