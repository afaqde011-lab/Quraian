package og;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.google.android.gms.cast.MediaError;

public abstract class a {

    public final PathInterpolator f11956a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);

    public final View f11957b;

    public final int f11958c;

    public final int f11959d;

    public final int f11960e;

    public d.b f11961f;

    public a(View view) {
        this.f11957b = view;
        Context context = view.getContext();
        this.f11958c = ze.d.P(context, 2130969582, MediaError.DetailedErrorCode.NETWORK_UNKNOWN);
        this.f11959d = ze.d.P(context, 2130969587, 150);
        this.f11960e = ze.d.P(context, 2130969586, 100);
    }
}
