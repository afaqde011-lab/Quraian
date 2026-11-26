package e5;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.util.Base64;
import android.util.Log;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.core.widget.RemoteViewsCompatService;
import c3.x1;
import kotlin.jvm.internal.m;

public final class h implements RemoteViewsService.RemoteViewsFactory {

    public static final x1 f5100e = new x1(new long[0], new RemoteViews[0]);

    public final RemoteViewsCompatService f5101a;

    public final int f5102b;

    public final int f5103c;

    public x1 f5104d = f5100e;

    public h(RemoteViewsCompatService remoteViewsCompatService, int i10, int i11) {
        this.f5101a = remoteViewsCompatService;
        this.f5102b = i10;
        this.f5103c = i11;
    }

    public final void a() {
        Long lValueOf;
        RemoteViewsCompatService remoteViewsCompatService = this.f5101a;
        SharedPreferences sharedPreferences = remoteViewsCompatService.getSharedPreferences("androidx.core.widget.prefs.RemoteViewsCompat", 0);
        m.d(sharedPreferences, "context.getSharedPrefere…S_FILENAME, MODE_PRIVATE)");
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f5102b;
        sb2.append(i10);
        sb2.append(':');
        sb2.append(this.f5103c);
        x1 x1Var = null;
        String string = sharedPreferences.getString(sb2.toString(), null);
        if (string == null) {
            Log.w("RemoteViewsCompatServic", "No collection items were stored for widget " + i10);
        } else {
            byte[] bArrDecode = Base64.decode(string, 0);
            m.d(bArrDecode, "decode(hexString, Base64.DEFAULT)");
            Parcel parcelObtain = Parcel.obtain();
            m.d(parcelObtain, "obtain()");
            try {
                parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
                parcelObtain.setDataPosition(0);
                g gVar = new g(parcelObtain);
                parcelObtain.recycle();
                if (m.a(Build.VERSION.INCREMENTAL, (String) gVar.f5097a)) {
                    try {
                        lValueOf = Long.valueOf(remoteViewsCompatService.getPackageManager().getPackageInfo(remoteViewsCompatService.getPackageName(), 0).getLongVersionCode());
                    } catch (PackageManager.NameNotFoundException e3) {
                        Log.e("RemoteViewsCompatServic", "Couldn't retrieve version code for " + remoteViewsCompatService.getPackageManager(), e3);
                        lValueOf = null;
                    }
                    if (lValueOf == null) {
                        Log.w("RemoteViewsCompatServic", "Couldn't get version code, not using stored collection items for widget " + i10);
                    } else {
                        if (lValueOf.longValue() != gVar.f5098b) {
                            Log.w("RemoteViewsCompatServic", "App version code has changed, not using stored collection items for widget " + i10);
                        } else {
                            try {
                                byte[] bArr = (byte[]) gVar.f5099c;
                                m.e(bArr, "bytes");
                                Parcel parcelObtain2 = Parcel.obtain();
                                m.d(parcelObtain2, "obtain()");
                                try {
                                    parcelObtain2.unmarshall(bArr, 0, bArr.length);
                                    parcelObtain2.setDataPosition(0);
                                    x1 x1Var2 = new x1(parcelObtain2);
                                    parcelObtain2.recycle();
                                    x1Var = x1Var2;
                                } catch (Throwable th2) {
                                    parcelObtain2.recycle();
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                Log.e("RemoteViewsCompatServic", "Unable to deserialize stored collection items for widget " + i10, th3);
                            }
                        }
                    }
                } else {
                    Log.w("RemoteViewsCompatServic", "Android version code has changed, not using stored collection items for widget " + i10);
                }
            } catch (Throwable th4) {
                parcelObtain.recycle();
                throw th4;
            }
        }
        if (x1Var == null) {
            x1Var = f5100e;
        }
        this.f5104d = x1Var;
    }

    @Override
    public final int getCount() {
        return ((long[]) this.f5104d.f2771d).length;
    }

    @Override
    public final long getItemId(int i10) {
        try {
            return ((long[]) this.f5104d.f2771d)[i10];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override
    public final RemoteViews getLoadingView() {
        return null;
    }

    @Override
    public final RemoteViews getViewAt(int i10) {
        try {
            return ((RemoteViews[]) this.f5104d.f2772e)[i10];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.f5101a.getPackageName(), 2131559057);
        }
    }

    @Override
    public final int getViewTypeCount() {
        return this.f5104d.f2770c;
    }

    @Override
    public final boolean hasStableIds() {
        return this.f5104d.f2769b;
    }

    @Override
    public final void onCreate() {
        a();
    }

    @Override
    public final void onDataSetChanged() {
        a();
    }

    @Override
    public final void onDestroy() {
    }
}
