package androidx.glance.appwidget.action;

import a1.g;
import a40.m0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import b1.l;
import c6.f;
import d6.h;
import d6.w;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/glance/appwidget/action/ActionCallbackBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "e6/f", "glance-appwidget"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ActionCallbackBroadcastReceiver extends BroadcastReceiver {

    public static final int f869a = 0;

    @Override
    public final void onReceive(Context context, Intent intent) {
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context is null");
            }
            if (intent == null) {
                throw new IllegalArgumentException("Intent is null");
            }
            Bundle extras = intent.getExtras();
            if (extras == null) {
                throw new IllegalArgumentException("The intent must have action parameters extras.");
            }
            f fVarF = e6.f.f(extras);
            String string = extras.getString("ActionCallbackBroadcastReceiver:callbackClass");
            if (string == null) {
                throw new IllegalArgumentException("The intent must contain a work class name string using extra: ActionCallbackBroadcastReceiver:callbackClass");
            }
            if (!intent.hasExtra("ActionCallbackBroadcastReceiver:appWidgetId")) {
                throw new IllegalArgumentException("To update the widget, the intent must contain the AppWidgetId integer using extra: ActionCallbackBroadcastReceiver:appWidgetId");
            }
            h hVar = new h(extras.getInt("ActionCallbackBroadcastReceiver:appWidgetId"));
            if (w.o(context, new l(string, hVar, fVarF, 9))) {
                return;
            }
            w.k(this, m0.a, new g(context, string, hVar, fVarF, null, 24));
        } catch (CancellationException e3) {
            throw e3;
        } catch (Throwable th2) {
            Log.e("GlanceAppWidget", "Error in Glance App Widget", th2);
        }
    }
}
