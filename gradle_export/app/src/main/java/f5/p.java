package f5;

import android.os.Bundle;
import java.util.Set;

public abstract class p {

    public final Bundle f5486a;

    public final Bundle f5487b;

    public final Set f5488c;

    public p(Bundle bundle, Bundle bundle2, boolean z10, Set set, int i10) {
        kotlin.jvm.internal.m.e(set, "allowedProviders");
        kotlin.jvm.internal.m.e(set, "allowedProviders");
        this.f5486a = bundle;
        this.f5487b = bundle2;
        this.f5488c = set;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z10);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z10);
        bundle.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", i10);
        bundle2.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", i10);
        if (i10 == 100) {
            throw new IllegalArgumentException("Custom types should not have passkey level priority.");
        }
    }
}
