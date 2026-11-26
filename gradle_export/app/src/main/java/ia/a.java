package ia;

import android.os.Bundle;
import h00.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import k.k;

public final class a implements d {

    public final int f7561a;

    public final Object f7562b;

    public a(e eVar) {
        this.f7561a = 0;
        this.f7562b = new LinkedHashSet();
        eVar.c("androidx.savedstate.Restarter", this);
    }

    public a(k kVar) {
        this.f7561a = 1;
        this.f7562b = kVar;
    }

    @Override
    public final Bundle a() {
        switch (this.f7561a) {
            case 0:
                Bundle bundleN = f50.c.n((g00.k[]) Arrays.copyOf(new g00.k[0], 0));
                List listN1 = q.n1((LinkedHashSet) this.f7562b);
                bundleN.putStringArrayList("classes_to_restore", listN1 instanceof ArrayList ? (ArrayList) listN1 : new ArrayList<>(listN1));
                return bundleN;
            default:
                Bundle bundle = new Bundle();
                ((k) this.f7562b).getDelegate().getClass();
                return bundle;
        }
    }
}
