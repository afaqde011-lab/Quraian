package se;

import c3.x1;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.internal.cast.v;
import com.google.android.gms.tasks.Task;
import o9.q;
import pe.d;

public final class b extends n {

    public static final i f14140a = new i("ClientTelemetry.API", new v(9), new h());

    public final Task c(s sVar) {
        x1 x1VarA = t.a();
        x1VarA.f2772e = new d[]{kf.c.f9657a};
        x1VarA.f2769b = false;
        x1VarA.f2771d = new q(sVar, 13);
        return doBestEffortWrite(x1VarA.a());
    }
}
