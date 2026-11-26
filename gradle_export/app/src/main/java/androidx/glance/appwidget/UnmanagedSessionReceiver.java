package androidx.glance.appwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import d6.a0;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/glance/appwidget/UnmanagedSessionReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "d6/a0", "glance-appwidget"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class UnmanagedSessionReceiver extends BroadcastReceiver {

    public static final a0 f867a = new a0();

    public static final LinkedHashMap f868b = new LinkedHashMap();

    @Override
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !m.a(intent.getAction(), "ACTION_TRIGGER_LAMBDA")) {
            return;
        }
        if (intent.getStringExtra("EXTRA_ACTION_KEY") == null) {
            throw new IllegalStateException("Intent is missing ActionKey extra");
        }
        int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
        if (intExtra == -1) {
            throw new IllegalStateException("Intent is missing AppWidgetId extra");
        }
        a0.b(intExtra);
        Log.e("GlanceAppWidget", "A lambda created by an unmanaged glance session cannot be servicedbecause that session is no longer running.");
    }
}
