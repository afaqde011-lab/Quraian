package ia;

import android.os.Bundle;
import androidx.lifecycle.p;
import androidx.media3.common.h0;
import ca.v;
import g00.k;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.m;

public final class f {

    public final h0 f7565a;

    public final e f7566b;

    public f(h0 h0Var) {
        this.f7565a = h0Var;
        this.f7566b = new e(h0Var);
    }

    public final void a(Bundle bundle) {
        h0 h0Var = this.f7565a;
        g gVar = (g) h0Var.f1222d;
        if (!h0Var.f1219a) {
            h0Var.a();
        }
        if (gVar.getLifecycle().b().compareTo(p.D) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + gVar.getLifecycle().b()).toString());
        }
        if (h0Var.f1220b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleZ = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleZ = v.z("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        h0Var.f1226h = bundleZ;
        h0Var.f1220b = true;
    }

    public final void b(Bundle bundle) {
        h0 h0Var = this.f7565a;
        Bundle bundleN = f50.c.n((k[]) Arrays.copyOf(new k[0], 0));
        Bundle bundle2 = (Bundle) h0Var.f1226h;
        if (bundle2 != null) {
            bundleN.putAll(bundle2);
        }
        synchronized (((gj.e) h0Var.f1224f)) {
            for (Map.Entry entry : ((LinkedHashMap) h0Var.f1225g).entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleA = ((d) entry.getValue()).a();
                m.e(str, "key");
                bundleN.putBundle(str, bundleA);
            }
        }
        if (bundleN.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleN);
    }
}
