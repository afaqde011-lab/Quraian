package xa;

import android.os.Build;
import com.google.android.gms.cast.Cast;

public final class d implements c {

    public final ya.a f16509b;

    public d() {
        this.f16509b = Build.VERSION.SDK_INT >= 34 ? ya.b.f16847a : ya.b.f16848b;
        va.a.i(1, 2, 4, 8, 16, 32, 64, Integer.valueOf(Cast.MAX_NAMESPACE_LENGTH));
    }
}
