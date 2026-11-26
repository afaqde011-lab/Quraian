package l6;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.JsonException;

public final class b extends BroadcastReceiver {

    public static final List f10033b;

    public static final IntentFilter f10034c;

    public final c f10035a;

    static {
        List listS = va.a.S("android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED", "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED");
        f10033b = listS;
        IntentFilter intentFilter = new IntentFilter();
        Iterator it = listS.iterator();
        while (it.hasNext()) {
            intentFilter.addAction((String) it.next());
        }
        f10034c = intentFilter;
    }

    public b(c cVar) {
        this.f10035a = cVar;
    }

    public final void a(Context context) throws JsonException, PendingIntent.CanceledException {
        Object systemService = context.getSystemService("power");
        kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        PowerManager powerManager = (PowerManager) systemService;
        if (powerManager.isDeviceIdleMode() || powerManager.isLowPowerStandbyEnabled() || powerManager.isDeviceLightIdleMode()) {
            this.f10035a.invoke();
        }
    }

    @Override
    public final void onReceive(Context context, Intent intent) throws JsonException, PendingIntent.CanceledException {
        if (h00.q.F0(f10033b, intent.getAction())) {
            a(context);
        }
    }
}
