package dd;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import bd.f;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import kotlin.jvm.internal.m;
import pe.g;

public final class a {

    public final String f4855a;

    public final String f4856b;

    public final String f4857c;

    public final String f4858d;

    public final String f4859e;

    public final String f4860f;

    public final String f4861g;

    public final String f4862h;

    public final String f4863i;

    public final String f4864j;

    public final f f4865k;

    public a(f fVar) {
        String string;
        String str;
        String networkOperatorName;
        String country;
        String networkCountryIso;
        Context context = (Context) fVar.C;
        this.f4865k = fVar;
        String str2 = Build.VERSION.RELEASE;
        m.d(str2, "RELEASE");
        this.f4858d = str2;
        String str3 = Build.BRAND;
        m.d(str3, "BRAND");
        this.f4859e = str3;
        String str4 = Build.MANUFACTURER;
        m.d(str4, "MANUFACTURER");
        this.f4860f = str4;
        String str5 = Build.MODEL;
        m.d(str5, "MODEL");
        this.f4861g = str5;
        String language = a().getLanguage();
        m.d(language, "getLanguage(...)");
        this.f4863i = language;
        String str6 = null;
        if (!fVar.A) {
            string = null;
        } else if ("Amazon".equals(str4)) {
            ContentResolver contentResolver = context.getContentResolver();
            Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 0);
            string = Settings.Secure.getString(contentResolver, "advertising_id");
        } else {
            try {
                Object objInvoke = ie.b.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
                Object objInvoke2 = objInvoke.getClass().getMethod("isLimitAdTrackingEnabled", null).invoke(objInvoke, null);
                Boolean bool = objInvoke2 instanceof Boolean ? (Boolean) objInvoke2 : null;
                if (bool != null) {
                    bool.booleanValue();
                }
                Object objInvoke3 = objInvoke.getClass().getMethod("getId", null).invoke(objInvoke, null);
                m.c(objInvoke3, "null cannot be cast to non-null type kotlin.String");
                string = (String) objInvoke3;
            } catch (ClassNotFoundException unused) {
                b.f4866c.c("Google Play Services SDK not found for advertising id!");
                string = null;
            } catch (InvocationTargetException unused2) {
                b.f4866c.c("Google Play Services not available for advertising id");
                string = null;
            } catch (Exception unused3) {
                b.f4866c.a("Encountered an error connecting to Google Play Services for advertising id");
                string = null;
            }
        }
        this.f4855a = string;
        Context context2 = (Context) this.f4865k.C;
        try {
            PackageInfo packageInfo = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0);
            m.d(packageInfo, "getPackageInfo(...)");
            str = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException | Exception unused4) {
            str = null;
        }
        this.f4857c = str;
        try {
            Object systemService = ((Context) this.f4865k.C).getSystemService("phone");
            m.c(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
        } catch (Exception unused5) {
            networkOperatorName = null;
        }
        this.f4862h = networkOperatorName;
        try {
            Object systemService2 = ((Context) this.f4865k.C).getSystemService("phone");
            m.c(systemService2, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            TelephonyManager telephonyManager = (TelephonyManager) systemService2;
            if (telephonyManager.getPhoneType() == 2 || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null) {
                country = null;
            } else {
                Locale locale = Locale.US;
                m.d(locale, "US");
                country = networkCountryIso.toUpperCase(locale);
                m.d(country, "toUpperCase(...)");
            }
        } catch (Exception unused6) {
        }
        if (country == null || country.length() == 0) {
            country = a().getCountry();
            m.d(country, "getCountry(...)");
        }
        this.f4856b = country;
        try {
            int i10 = g.f12498e;
            Object objInvoke4 = g.class.getMethod("isGooglePlayServicesAvailable", Context.class).invoke(null, (Context) this.f4865k.C);
            Integer num = objInvoke4 instanceof Integer ? (Integer) objInvoke4 : null;
            if (num != null) {
                num.intValue();
            }
        } catch (ClassNotFoundException unused7) {
            b.f4866c.c("Google Play Services Util not found!");
        } catch (IllegalAccessException unused8) {
            b.f4866c.c("Google Play Services not available");
        } catch (Exception e3) {
            b.f4866c.c("Error when checking for Google Play Services: " + e3);
        } catch (NoClassDefFoundError unused9) {
            b.f4866c.c("Google Play Services Util not found!");
        } catch (NoSuchMethodException unused10) {
            b.f4866c.c("Google Play Services not available");
        } catch (InvocationTargetException unused11) {
            b.f4866c.c("Google Play Services not available");
        }
        if (this.f4865k.B) {
            try {
                Object objInvoke5 = Class.forName("com.google.android.gms.appset.AppSet").getMethod("getClient", Context.class).invoke(null, (Context) this.f4865k.C);
                Object objInvoke6 = Tasks.class.getMethod("await", Task.class).invoke(null, objInvoke5.getClass().getMethod("getAppSetIdInfo", null).invoke(objInvoke5, null));
                Object objInvoke7 = objInvoke6.getClass().getMethod("getId", null).invoke(objInvoke6, null);
                m.c(objInvoke7, "null cannot be cast to non-null type kotlin.String");
                str6 = (String) objInvoke7;
            } catch (ClassNotFoundException unused12) {
                b.f4866c.c("Google Play Services SDK not found for app set id!");
            } catch (InvocationTargetException unused13) {
                b.f4866c.c("Google Play Services not available for app set id");
            } catch (Exception unused14) {
                b.f4866c.a("Encountered an error connecting to Google Play Services for app set id");
            }
        }
        this.f4864j = str6;
    }

    public static Locale a() {
        LocaleList locales = Resources.getSystem().getConfiguration().getLocales();
        m.d(locales, "getLocales(...)");
        Locale locale = locales.isEmpty() ? Locale.getDefault() : locales.get(0);
        m.b(locale);
        return locale;
    }
}
