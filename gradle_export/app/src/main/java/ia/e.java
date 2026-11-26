package ia;

import android.os.Bundle;
import androidx.lifecycle.k;
import androidx.media3.common.h0;
import ca.v;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.m;

public final class e {

    public final h0 f7563a;

    public a f7564b;

    public e(h0 h0Var) {
        this.f7563a = h0Var;
    }

    public final Bundle a(String str) {
        m.e(str, "key");
        h0 h0Var = this.f7563a;
        if (!h0Var.f1220b) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = (Bundle) h0Var.f1226h;
        if (bundle == null) {
            return null;
        }
        Bundle bundleZ = bundle.containsKey(str) ? v.z(str, bundle) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            h0Var.f1226h = null;
        }
        return bundleZ;
    }

    public final d b(String str) {
        d dVar;
        h0 h0Var = this.f7563a;
        synchronized (((gj.e) h0Var.f1224f)) {
            Iterator it = ((LinkedHashMap) h0Var.f1225g).entrySet().iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                d dVar2 = (d) entry.getValue();
                if (m.a(str2, str)) {
                    dVar = dVar2;
                }
            } while (dVar == null);
        }
        return dVar;
    }

    public final void c(String str, d dVar) {
        m.e(dVar, "provider");
        h0 h0Var = this.f7563a;
        synchronized (((gj.e) h0Var.f1224f)) {
            if (((LinkedHashMap) h0Var.f1225g).containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            ((LinkedHashMap) h0Var.f1225g).put(str, dVar);
        }
    }

    public final void d() {
        if (!this.f7563a.f1221c) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        a aVar = this.f7564b;
        if (aVar == null) {
            aVar = new a(this);
        }
        this.f7564b = aVar;
        try {
            k.class.getDeclaredConstructor(null);
            a aVar2 = this.f7564b;
            if (aVar2 != null) {
                ((LinkedHashSet) aVar2.f7562b).add(k.class.getName());
            }
        } catch (NoSuchMethodException e3) {
            throw new IllegalArgumentException("Class " + k.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
        }
    }
}
