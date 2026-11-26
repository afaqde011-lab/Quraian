package tf;

import android.content.Context;
import android.os.Bundle;

public final class w1 {

    public final Context f14749a;

    public final Boolean f14750b;

    public final long f14751c;

    public final com.google.android.gms.internal.measurement.s0 f14752d;

    public final boolean f14753e;

    public final Long f14754f;

    public final String f14755g;

    public w1(Context context, com.google.android.gms.internal.measurement.s0 s0Var, Long l) {
        this.f14753e = true;
        com.google.android.gms.common.internal.d0.h(context);
        Context applicationContext = context.getApplicationContext();
        com.google.android.gms.common.internal.d0.h(applicationContext);
        this.f14749a = applicationContext;
        this.f14754f = l;
        if (s0Var != null) {
            this.f14752d = s0Var;
            this.f14753e = s0Var.C;
            this.f14751c = s0Var.B;
            this.f14755g = s0Var.E;
            Bundle bundle = s0Var.D;
            if (bundle != null) {
                this.f14750b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
