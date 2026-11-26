package n4;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

public final class f {

    public final Bundle f11057a;

    public IconCompat f11058b;

    public final u[] f11059c;

    public final boolean f11060d;

    public final boolean f11061e;

    public final int f11062f;

    public final CharSequence f11063g;

    public final PendingIntent f11064h;

    public f(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, true);
    }

    public f(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, u[] uVarArr, boolean z10, boolean z11) {
        this.f11061e = true;
        this.f11058b = iconCompat;
        if (iconCompat != null) {
            int i10 = iconCompat.f568a;
            if ((i10 == -1 ? ((Icon) iconCompat.f569b).getType() : i10) == 2) {
                this.f11062f = iconCompat.b();
            }
        }
        this.f11063g = j.c(charSequence);
        this.f11064h = pendingIntent;
        this.f11057a = bundle == null ? new Bundle() : bundle;
        this.f11059c = uVarArr;
        this.f11060d = z10;
        this.f11061e = z11;
    }
}
