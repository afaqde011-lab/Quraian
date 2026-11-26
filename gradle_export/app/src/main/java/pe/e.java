package pe;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.i1;
import androidx.fragment.app.o0;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.v;

public final class e extends f {

    public static final Object f12490c = new Object();

    public static final e f12491d = new e();

    public static AlertDialog d(Activity activity, int i10, v vVar, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(u.b(activity, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i10 == 1) {
            string = resources.getString(2131886345);
        } else if (i10 != 2) {
            string = i10 != 3 ? resources.getString(R.string.ok) : resources.getString(2131886342);
        } else {
            string = resources.getString(2131886352);
        }
        if (string != null) {
            builder.setPositiveButton(string, vVar);
        }
        String strA = u.a(activity, i10);
        if (strA != null) {
            builder.setTitle(strA);
        }
        Log.w("GoogleApiAvailability", g4.c.f(i10, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void g(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof o0) {
                i1 supportFragmentManager = ((o0) activity).getSupportFragmentManager();
                i iVar = new i();
                d0.i(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                iVar.A = alertDialog;
                if (onCancelListener != null) {
                    iVar.B = onCancelListener;
                }
                iVar.show(supportFragmentManager, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        d0.i(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.A = alertDialog;
        if (onCancelListener != null) {
            cVar.B = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i10, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogD = d(googleApiActivity, i10, new v(super.a(i10, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (alertDialogD == null) {
            return;
        }
        g(googleApiActivity, alertDialogD, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void e(Activity activity, com.google.android.gms.common.api.internal.k kVar, int i10, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogD = d(activity, i10, new v(super.a(i10, activity, "d"), kVar, 1), onCancelListener);
        if (alertDialogD == null) {
            return;
        }
        g(activity, alertDialogD, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void f(Context context, int i10, PendingIntent pendingIntent) {
        int i11;
        Log.w("GoogleApiAvailability", g4.c.i("GMS core API Availability. ConnectionResult=", i10, ", tag=null"), new IllegalArgumentException());
        if (i10 == 18) {
            new j(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i10 == 6 ? u.e(context, "common_google_play_services_resolution_required_title") : u.a(context, i10);
        if (strE == null) {
            strE = context.getResources().getString(2131886349);
        }
        String strD = (i10 == 6 || i10 == 19) ? u.d(context, "common_google_play_services_resolution_required_text", u.c(context)) : u.b(context, i10);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        d0.h(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        n4.j jVar = new n4.j(context, null);
        jVar.f11080r = true;
        jVar.d(16, true);
        jVar.f11069e = n4.j.c(strE);
        n4.i iVar = new n4.i(8, false);
        iVar.C = n4.j.c(strD);
        jVar.e(iVar);
        PackageManager packageManager = context.getPackageManager();
        if (ve.c.f15622c == null) {
            ve.c.f15622c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        boolean zBooleanValue = ve.c.f15622c.booleanValue();
        int i12 = R.drawable.stat_sys_warning;
        if (zBooleanValue) {
            int i13 = context.getApplicationInfo().icon;
            if (i13 != 0) {
                i12 = i13;
            }
            jVar.f11088z.icon = i12;
            jVar.f11074j = 2;
            if (ve.c.f(context)) {
                jVar.a(2131230922, pendingIntent, resources.getString(2131886357));
            } else {
                jVar.f11071g = pendingIntent;
            }
        } else {
            jVar.f11088z.icon = R.drawable.stat_sys_warning;
            jVar.f11088z.tickerText = n4.j.c(resources.getString(2131886349));
            jVar.f11088z.when = System.currentTimeMillis();
            jVar.f11071g = pendingIntent;
            jVar.f11070f = n4.j.c(strD);
        }
        synchronized (f12490c) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(2131886348);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else if (!string.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        jVar.f11084v = "com.google.android.gms.availability";
        Notification notificationB = jVar.b();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            g.f12494a.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationB);
    }
}
