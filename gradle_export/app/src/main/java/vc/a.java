package vc;

import a10.h0;
import androidx.fragment.app.i1;
import androidx.fragment.app.j0;
import androidx.fragment.app.o0;
import av.o;
import com.google.android.gms.internal.measurement.y3;
import g00.k;
import g00.n;
import h00.d0;
import kotlin.jvm.internal.m;
import ri.t1;

public final class a extends h0 {

    public final o f15603f;

    public final cd.b f15604g;

    public a(o oVar, cd.b bVar) {
        this.f15603f = oVar;
        this.f15604g = bVar;
    }

    public final void K(i1 i1Var, j0 j0Var) {
        String strS;
        m.e(j0Var, "f");
        String canonicalName = j0Var.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = j0Var.getClass().getSimpleName();
        }
        try {
            strS = j0Var.getResources().getResourceEntryName(j0Var.getId());
        } catch (Throwable th2) {
            strS = t1.s(th2);
        }
        Throwable thA = n.a(strS);
        if (thA != null) {
            this.f15604g.a("Failed to get resource entry name: " + thA);
        }
        if (strS instanceof g00.m) {
            strS = null;
        }
        String str = strS;
        o0 activity = j0Var.getActivity();
        this.f15603f.invoke("[Amplitude] Fragment Viewed", d0.R(new k[]{new k("[Amplitude] Fragment Class", canonicalName), new k("[Amplitude] Fragment Identifier", str), new k("[Amplitude] Screen Name", activity != null ? y3.I(activity) : null), new k("[Amplitude] Fragment Tag", j0Var.getTag())}));
    }
}
