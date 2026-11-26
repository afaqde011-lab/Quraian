package w6;

import androidx.lifecycle.e1;
import androidx.lifecycle.f1;
import androidx.lifecycle.j;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import androidx.lifecycle.u0;
import hb.f;
import ia.e;
import ia.g;
import java.util.LinkedHashMap;
import t6.d;

public final class b implements f1, g, j {
    public final g A;
    public final e1 B;

    public b(g gVar, e1 e1Var) {
        this.B = e1Var;
        this.A = gVar;
        if (gVar.getLifecycle().b() != p.B) {
            throw new IllegalArgumentException("The Lifecycle state is already beyond INITIALIZED. The ViewModelStoreNavEntryDecorator requires adding the SavedStateNavEntryDecorator to ensure support for SavedStateHandles.");
        }
        u0.d(this);
    }

    @Override
    public final t6.b getDefaultViewModelCreationExtras() {
        d dVar = new d(0);
        f fVar = u0.f1003a;
        LinkedHashMap linkedHashMap = dVar.f14360a;
        linkedHashMap.put(fVar, this);
        linkedHashMap.put(u0.f1004b, this);
        return dVar;
    }

    @Override
    public final q getLifecycle() {
        return this.A.getLifecycle();
    }

    @Override
    public final e getSavedStateRegistry() {
        return this.A.getSavedStateRegistry();
    }

    @Override
    public final e1 getViewModelStore() {
        return this.B;
    }
}
