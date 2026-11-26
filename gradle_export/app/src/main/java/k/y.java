package k;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.internal.cast.c7;
import java.util.Calendar;

public final class y extends c3.b {

    public final int f8452c = 1;

    public final b0 f8453d;

    public final Object f8454e;

    public y(b0 b0Var, a1.i iVar) {
        super(b0Var);
        this.f8453d = b0Var;
        this.f8454e = iVar;
    }

    public y(b0 b0Var, Context context) {
        super(b0Var);
        this.f8453d = b0Var;
        this.f8454e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override
    public final IntentFilter d() {
        switch (this.f8452c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override
    public final int h() {
        Location location;
        boolean z10;
        long j9;
        Location lastKnownLocation;
        switch (this.f8452c) {
            case 0:
                return u.a((PowerManager) this.f8454e) ? 2 : 1;
            default:
                a1.i iVar = (a1.i) this.f8454e;
                l0 l0Var = (l0) iVar.D;
                LocationManager locationManager = (LocationManager) iVar.C;
                if (l0Var.f8423b <= System.currentTimeMillis()) {
                    Context context = (Context) iVar.B;
                    Location lastKnownLocation2 = null;
                    if (kh.o.q(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                            lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        } catch (Exception e3) {
                            Log.d("TwilightManager", "Failed to get last known location", e3);
                        }
                        location = lastKnownLocation;
                    } else {
                        location = null;
                    }
                    if (kh.o.q(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e10) {
                            Log.d("TwilightManager", "Failed to get last known location", e10);
                        }
                    }
                    if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                        location = lastKnownLocation2;
                    }
                    z10 = false;
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (c7.f3371d == null) {
                            c7.f3371d = new c7();
                        }
                        c7 c7Var = c7.f3371d;
                        c7Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        c7Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z10 = c7Var.f3374c == 1;
                        long j10 = c7Var.f3373b;
                        long j11 = c7Var.f3372a;
                        c7Var.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j12 = c7Var.f3373b;
                        if (j10 == -1 || j11 == -1) {
                            j9 = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j11) {
                                j10 = j12;
                            } else if (jCurrentTimeMillis > j10) {
                                j10 = j11;
                            }
                            j9 = j10 + 60000;
                        }
                        l0Var.f8422a = z10;
                        l0Var.f8423b = j9;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i10 = Calendar.getInstance().get(11);
                        if (i10 < 6 || i10 >= 22) {
                            z10 = true;
                        }
                    }
                    break;
                } else {
                    z10 = l0Var.f8422a;
                }
                return z10 ? 2 : 1;
        }
    }

    @Override
    public final void n() {
        switch (this.f8452c) {
            case 0:
                this.f8453d.m(true);
                break;
            default:
                this.f8453d.m(true);
                break;
        }
    }
}
