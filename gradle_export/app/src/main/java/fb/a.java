package fb;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import h00.q;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.m;
import za.v;

public final class a {

    public final jb.b f5580a;

    public final Context f5581b;

    public final Object f5582c;

    public final LinkedHashSet f5583d;

    public Object f5584e;

    public final androidx.mediarouter.app.g f5585f;

    public final int f5586g;

    public a(Context context, jb.b bVar, int i10) {
        this.f5586g = i10;
        this.f5580a = bVar;
        Context applicationContext = context.getApplicationContext();
        m.d(applicationContext, "getApplicationContext(...)");
        this.f5581b = applicationContext;
        this.f5582c = new Object();
        this.f5583d = new LinkedHashSet();
        this.f5585f = new androidx.mediarouter.app.g(this, 4);
    }

    public final IntentFilter a() {
        switch (this.f5586g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }

    public final Object b() {
        switch (this.f5586g) {
            case 0:
                Intent intentRegisterReceiver = this.f5581b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver == null) {
                    v.d().b(b.f5587a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                return Boolean.valueOf(intExtra == 2 || intExtra == 5);
            case 1:
                Intent intentRegisterReceiver2 = this.f5581b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver2 == null) {
                    v.d().b(c.f5588a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra2 = intentRegisterReceiver2.getIntExtra("status", -1);
                float intExtra3 = intentRegisterReceiver2.getIntExtra("level", -1) / intentRegisterReceiver2.getIntExtra("scale", -1);
                boolean z10 = true;
                if (intExtra2 != 1 && intExtra3 <= 0.15f) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                Intent intentRegisterReceiver3 = this.f5581b.registerReceiver(null, a());
                boolean z11 = true;
                if (intentRegisterReceiver3 != null && intentRegisterReceiver3.getAction() != null) {
                    String action = intentRegisterReceiver3.getAction();
                    if (action == null) {
                        z11 = false;
                    } else {
                        int iHashCode = action.hashCode();
                        if (iHashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        }
                        z11 = false;
                    }
                }
                return Boolean.valueOf(z11);
        }
    }

    public final void c(Object obj) {
        synchronized (this.f5582c) {
            Object obj2 = this.f5584e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.f5584e = obj;
                this.f5580a.f8261d.execute(new ab.f(q.n1(this.f5583d), this, 15));
            }
        }
    }
}
