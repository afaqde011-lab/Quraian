package d6;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.widget.RemoteViews;

public final class s0 {

    public static final s0 f4694a = new s0();

    public final boolean a(AppWidgetManager appWidgetManager, ComponentName componentName, int i10, RemoteViews remoteViews) {
        return appWidgetManager.setWidgetPreview(componentName, i10, remoteViews);
    }
}
