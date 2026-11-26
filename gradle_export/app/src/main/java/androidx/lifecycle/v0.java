package androidx.lifecycle;

import android.os.Bundle;
import c3.s1;
import java.util.Arrays;
import java.util.Map;

public final class v0 implements ia.d {

    public final ia.e f1008a;

    public boolean f1009b;

    public Bundle f1010c;

    public final g00.p f1011d;

    public v0(ia.e eVar, f1 f1Var) {
        kotlin.jvm.internal.m.e(eVar, "savedStateRegistry");
        this.f1008a = eVar;
        this.f1011d = rd.a.J(new a1.z(f1Var, 4));
    }

    @Override
    public final Bundle a() {
        Bundle bundleN = f50.c.n((g00.k[]) Arrays.copyOf(new g00.k[0], 0));
        Bundle bundle = this.f1010c;
        if (bundle != null) {
            bundleN.putAll(bundle);
        }
        for (Map.Entry entry : ((w0) this.f1011d.getValue()).f1012c.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((s1) ((r0) entry.getValue()).f1001a.F).a();
            if (!bundleA.isEmpty()) {
                kotlin.jvm.internal.m.e(str, "key");
                bundleN.putBundle(str, bundleA);
            }
        }
        this.f1009b = false;
        return bundleN;
    }

    public final void b() {
        if (this.f1009b) {
            return;
        }
        Bundle bundleA = this.f1008a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleN = f50.c.n((g00.k[]) Arrays.copyOf(new g00.k[0], 0));
        Bundle bundle = this.f1010c;
        if (bundle != null) {
            bundleN.putAll(bundle);
        }
        if (bundleA != null) {
            bundleN.putAll(bundleA);
        }
        this.f1010c = bundleN;
        this.f1009b = true;
    }
}
