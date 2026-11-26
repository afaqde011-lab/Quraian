package pe;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.google.android.gms.common.internal.d0;

public class f {

    public static final int f12492a;

    public static final f f12493b;

    static {
        int i10 = g.f12498e;
        f12492a = 12451000;
        f12493b = new f();
    }

    public Intent a(int i10, Context context, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && ve.c.f(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder("gcore_");
        sb2.append(f12492a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                sb2.append(xe.b.a(context).b(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb2.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public int b(Context context, int i10) {
        boolean z10;
        PackageInfo packageInfo;
        int i11;
        int i12;
        ApplicationInfo applicationInfo;
        int i13 = g.f12498e;
        try {
            context.getResources().getString(2131886350);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        boolean zB = true;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !g.f12497d.get()) {
            synchronized (d0.f3260a) {
                try {
                    if (!d0.f3261b) {
                        d0.f3261b = true;
                        try {
                            Bundle bundle = xe.b.a(context).a(Cast.MAX_NAMESPACE_LENGTH, context.getPackageName()).metaData;
                            if (bundle != null) {
                                bundle.getString("com.google.app.id");
                                d0.f3262c = bundle.getInt("com.google.android.gms.version");
                            }
                        } catch (PackageManager.NameNotFoundException e3) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e3);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int i14 = d0.f3262c;
            if (i14 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i14 != 12451000) {
                int i15 = f12492a;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i15).length() + MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED + String.valueOf(i14).length() + 194);
                w.c.v(sb2, "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ", i15, " but found ", i14);
                sb2.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new GooglePlayServicesIncorrectManifestValueException(sb2.toString());
            }
        }
        if (ve.c.f(context)) {
            z10 = false;
        } else {
            if (ve.c.f15624e == null) {
                ve.c.f15624e = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (ve.c.f15624e.booleanValue()) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        d0.b(i10 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        int i16 = 9;
        if (z10) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 134225984);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 134217792);
            h.a(context);
            if (!h.c(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else if (z10) {
                d0.h(packageInfo);
                if (!h.c(packageInfo, true)) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                } else if (z10 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    i11 = packageInfo2.versionCode;
                    if (i11 == -1) {
                        i12 = -1;
                    } else {
                        i12 = i11 / 1000;
                    }
                    if (i12 < (i10 != -1 ? i10 / 1000 : -1)) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i10).length() + 11 + String.valueOf(i11).length());
                        sb3.append("Google Play services out of date for ");
                        sb3.append(packageName);
                        sb3.append(".  Requires ");
                        sb3.append(i10);
                        sb3.append(" but found ");
                        sb3.append(i11);
                        Log.w("GooglePlayServicesUtil", sb3.toString());
                        i16 = 2;
                    } else {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException e10) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e10);
                                i16 = 1;
                            }
                        }
                        if (applicationInfo.enabled) {
                            i16 = 0;
                        } else {
                            i16 = 3;
                        }
                    }
                } else {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                }
            } else if (z10) {
                i11 = packageInfo2.versionCode;
                if (i11 == -1) {
                    i12 = -1;
                } else {
                    i12 = i11 / 1000;
                }
                if (i12 < (i10 != -1 ? i10 / 1000 : -1)) {
                    StringBuilder sb4 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i10).length() + 11 + String.valueOf(i11).length());
                    sb4.append("Google Play services out of date for ");
                    sb4.append(packageName);
                    sb4.append(".  Requires ");
                    sb4.append(i10);
                    sb4.append(" but found ");
                    sb4.append(i11);
                    Log.w("GooglePlayServicesUtil", sb4.toString());
                    i16 = 2;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i16 = 3;
                    } else {
                        i16 = 0;
                    }
                }
            } else {
                i11 = packageInfo2.versionCode;
                if (i11 == -1) {
                    i12 = -1;
                } else {
                    i12 = i11 / 1000;
                }
                if (i12 < (i10 != -1 ? i10 / 1000 : -1)) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i10).length() + 11 + String.valueOf(i11).length());
                    sb5.append("Google Play services out of date for ");
                    sb5.append(packageName);
                    sb5.append(".  Requires ");
                    sb5.append(i10);
                    sb5.append(" but found ");
                    sb5.append(i11);
                    Log.w("GooglePlayServicesUtil", sb5.toString());
                    i16 = 2;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i16 = 3;
                    } else {
                        i16 = 0;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
        }
        if (i16 != 18) {
            zB = i16 == 1 ? g.b(context) : false;
        }
        if (zB) {
            return 18;
        }
        return i16;
    }
}
