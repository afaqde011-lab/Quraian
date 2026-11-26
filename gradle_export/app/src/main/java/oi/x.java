package oi;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.tasks.Tasks;
import com.google.protobuf.RuntimeVersion;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class x {

    public static final Pattern f12060g = Pattern.compile("[^\\p{Alnum}]");

    public static final String f12061h = Pattern.quote("/");

    public final eh.l f12062a;

    public final Context f12063b;

    public final String f12064c;

    public final jj.d f12065d;

    public final a2.o f12066e;

    public c f12067f;

    public x(Context context, String str, jj.d dVar, a2.o oVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f12063b = context;
        this.f12064c = str;
        this.f12065d = dVar;
        this.f12066e = oVar;
        this.f12062a = new eh.l(5);
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = f12060g.matcher(UUID.randomUUID().toString()).replaceAll(RuntimeVersion.SUFFIX).toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final w b(boolean z10) {
        String str;
        String str2 = null;
        if (!((Boolean) new pi.c(0, pi.e.f12528d, pi.d.class, "isNotMainThread", "isNotMainThread()Z", 0, 2).invoke()).booleanValue()) {
            String str3 = "Must not be called on a main thread, was called on " + Thread.currentThread().getName() + '.';
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str3, null);
            }
        }
        jj.d dVar = this.f12065d;
        if (z10) {
            try {
                str = ((jj.a) Tasks.a(((jj.c) dVar).d(), NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS, TimeUnit.MILLISECONDS)).f8290a;
            } catch (Exception e3) {
                Log.w("FirebaseCrashlytics", "Error getting Firebase authentication token.", e3);
                str = null;
            }
        } else {
            str = null;
        }
        try {
            str2 = (String) Tasks.a(((jj.c) dVar).c(), NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS, TimeUnit.MILLISECONDS);
        } catch (Exception e10) {
            Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", e10);
        }
        return new w(str2, str);
    }

    public final synchronized c c() {
        String str;
        c cVar = this.f12067f;
        if (cVar != null && (cVar.f11991b != null || !this.f12066e.c())) {
            return this.f12067f;
        }
        li.c cVar2 = li.c.f10296a;
        cVar2.e("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f12063b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        cVar2.e("Cached Firebase Installation ID: " + string);
        if (this.f12066e.c()) {
            w wVarB = b(false);
            cVar2.e("Fetched Firebase Installation ID: " + wVarB.f12058a);
            if (wVarB.f12058a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                wVarB = new w(str, null);
            }
            if (Objects.equals(wVarB.f12058a, string)) {
                this.f12067f = new c(sharedPreferences.getString("crashlytics.installation.id", null), wVarB.f12058a, wVarB.f12059b);
            } else {
                this.f12067f = new c(a(sharedPreferences, wVarB.f12058a), wVarB.f12058a, wVarB.f12059b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f12067f = new c(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f12067f = new c(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        cVar2.e("Install IDs: " + this.f12067f);
        return this.f12067f;
    }

    public final String d() {
        String str;
        eh.l lVar = this.f12062a;
        Context context = this.f12063b;
        synchronized (lVar) {
            try {
                if (lVar.B == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = RuntimeVersion.SUFFIX;
                    }
                    lVar.B = installerPackageName;
                }
                str = RuntimeVersion.SUFFIX.equals(lVar.B) ? null : lVar.B;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
