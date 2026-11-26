package cb;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import za.i;
import za.v;

public final class c {

    public static final String f3102d = v.f("SystemJobInfoConverter");

    public final ComponentName f3103a;

    public final i f3104b;

    public final boolean f3105c;

    public c(Context context, i iVar, boolean z10) {
        this.f3104b = iVar;
        this.f3103a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.f3105c = z10;
    }
}
