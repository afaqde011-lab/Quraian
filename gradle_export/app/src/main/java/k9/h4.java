package k9;

import android.content.ComponentName;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.protobuf.RuntimeVersion;
import java.util.Objects;

public final class h4 implements e4 {

    public static final String f9330f;

    public static final String f9331g;

    public static final String f9332h;

    public static final String f9333i;

    public static final String f9334j;

    public static final String f9335k;

    public final int f9336a;

    public final int f9337b;

    public final ComponentName f9338c;

    public final String f9339d;

    public final Bundle f9340e;

    static {
        String str = e7.i0.f5136a;
        f9330f = Integer.toString(0, 36);
        f9331g = Integer.toString(1, 36);
        f9332h = Integer.toString(2, 36);
        f9333i = Integer.toString(3, 36);
        f9334j = Integer.toString(4, 36);
        f9335k = Integer.toString(5, 36);
    }

    public h4(ComponentName componentName, int i10) {
        String packageName = componentName.getPackageName();
        Bundle bundle = Bundle.EMPTY;
        ta.c0.s((Build.MANUFACTURER.equals("samsung") && Build.VERSION.SDK_INT == 36) || !TextUtils.isEmpty(packageName));
        this.f9336a = i10;
        this.f9337b = 101;
        this.f9338c = componentName;
        this.f9339d = packageName;
        this.f9340e = bundle;
    }

    @Override
    public final int a() {
        return this.f9336a;
    }

    @Override
    public final ComponentName b() {
        return this.f9338c;
    }

    @Override
    public final Object c() {
        return null;
    }

    @Override
    public final String d() {
        ComponentName componentName = this.f9338c;
        return componentName == null ? RuntimeVersion.SUFFIX : componentName.getClassName();
    }

    @Override
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h4)) {
            return false;
        }
        h4 h4Var = (h4) obj;
        int i10 = h4Var.f9337b;
        int i11 = this.f9337b;
        if (i11 != i10) {
            return false;
        }
        if (i11 == 100) {
            return true;
        }
        if (i11 != 101) {
            return false;
        }
        return Objects.equals(this.f9338c, h4Var.f9338c);
    }

    @Override
    public final int f() {
        return 0;
    }

    @Override
    public final Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f9330f, null);
        bundle.putInt(f9331g, this.f9336a);
        bundle.putInt(f9332h, this.f9337b);
        bundle.putParcelable(f9333i, this.f9338c);
        bundle.putString(f9334j, this.f9339d);
        bundle.putBundle(f9335k, this.f9340e);
        return bundle;
    }

    @Override
    public final Bundle getExtras() {
        return new Bundle(this.f9340e);
    }

    @Override
    public final int getType() {
        return this.f9337b != 101 ? 0 : 2;
    }

    @Override
    public final MediaSession.Token h() {
        return null;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f9337b), this.f9338c, null);
    }

    @Override
    public final String j() {
        return this.f9339d;
    }

    public final String toString() {
        return g4.c.g(this.f9336a, "}", new StringBuilder("SessionToken {legacy, uid="));
    }
}
