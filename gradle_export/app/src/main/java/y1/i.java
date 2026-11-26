package y1;

import android.os.Bundle;
import androidx.lifecycle.q;
import androidx.lifecycle.y;
import androidx.media3.common.h0;
import g1.l0;
import java.util.Map;
import q0.f2;

public final class i implements f, ia.g {
    public final g A;
    public y B;
    public ia.f C;

    public i(g gVar) {
        this.A = gVar;
        Object objC = gVar.c("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objC instanceof Bundle ? (Bundle) objC : null;
        if (bundle != null && this.C == null) {
            ia.f fVar = new ia.f(new h0(this, new l0(this, 10)));
            this.C = fVar;
            fVar.a(bundle);
        }
        gVar.d("androidx.savedstate.SavedStateRegistry", new f2(this, 22));
    }

    @Override
    public final boolean a(Object obj) {
        return this.A.a(obj);
    }

    @Override
    public final Map b() {
        return this.A.b();
    }

    @Override
    public final Object c(String str) {
        return this.A.c(str);
    }

    @Override
    public final e d(String str, u00.a aVar) {
        return this.A.d(str, aVar);
    }

    @Override
    public final q getLifecycle() {
        y yVar = this.B;
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(this, false);
        this.B = yVar2;
        return yVar2;
    }

    @Override
    public final ia.e getSavedStateRegistry() {
        ia.f fVar = this.C;
        if (fVar == null) {
            ia.f fVar2 = new ia.f(new h0(this, new l0(this, 10)));
            this.C = fVar2;
            fVar2.a(null);
            fVar = fVar2;
        }
        return fVar.f7566b;
    }
}
