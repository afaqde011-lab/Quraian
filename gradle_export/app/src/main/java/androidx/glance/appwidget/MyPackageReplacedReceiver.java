package androidx.glance.appwidget;

import a1.a0;
import a40.m0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bw.b;
import d6.w;
import k00.c;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/glance/appwidget/MyPackageReplacedReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "glance-appwidget"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class MyPackageReplacedReceiver extends BroadcastReceiver {

    public static final int f866a = 0;

    @Override
    public final void onReceive(Context context, Intent intent) {
        if (context == null) {
            throw new IllegalStateException("onReceive context is null");
        }
        if (intent == null) {
            throw new IllegalStateException("onReceive intent is null");
        }
        if (w.o(context, new b(20))) {
            return;
        }
        w.k(this, m0.a, new a0(context, (c) null, 14));
    }
}
