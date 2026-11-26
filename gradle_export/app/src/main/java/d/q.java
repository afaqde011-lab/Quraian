package d;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

public final class q extends View {
    public final com.revenuecat.purchases.d A;

    public q(com.revenuecat.purchases.d dVar, Context context) {
        super(context);
        this.A = dVar;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        kotlin.jvm.internal.m.e(configuration, "newConfig");
        this.A.run();
    }
}
