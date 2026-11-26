package androidx.glance.appwidget.action;

import android.app.Activity;
import android.os.Bundle;
import e6.f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/glance/appwidget/action/ActionTrampolineActivity;", "Landroid/app/Activity;", "<init>", "()V", "glance-appwidget"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ActionTrampolineActivity extends Activity {
    @Override
    public final void onCreate(Bundle bundle) throws NoWhenBranchMatchedException {
        super.onCreate(bundle);
        f.i(this, getIntent());
        finish();
    }
}
