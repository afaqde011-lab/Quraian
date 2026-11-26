package k9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.cast.Cast;
import com.google.protobuf.RuntimeVersion;
import java.util.List;

public final class f4 {

    public static final String f9291b;

    public static final String f9292c;

    public final e4 f9293a;

    static {
        androidx.media3.common.r0.a("media3.session");
        String str = e7.i0.f5136a;
        f9291b = Integer.toString(0, 36);
        f9292c = Integer.toString(1, 36);
    }

    public f4(int i10, int i11, int i12, String str, m mVar, Bundle bundle, MediaSession.Token token) {
        str.getClass();
        IBinder iBinderAsBinder = mVar.asBinder();
        bundle.getClass();
        this.f9293a = new g4(i10, 0, i11, i12, str, RuntimeVersion.SUFFIX, null, iBinderAsBinder, bundle, token);
    }

    public f4(Context context, ComponentName componentName) {
        int i10;
        int i11;
        int i12;
        ta.c0.w(context, "context must not be null");
        PackageManager packageManager = context.getPackageManager();
        try {
            i10 = packageManager.getApplicationInfo(componentName.getPackageName(), 0).uid;
        } catch (PackageManager.NameNotFoundException unused) {
            i10 = -1;
        }
        int i13 = i10;
        if (!a(packageManager, "androidx.media3.session.MediaLibraryService", componentName)) {
            if (a(packageManager, "androidx.media3.session.MediaSessionService", componentName)) {
                i12 = 1;
            } else {
                if (!a(packageManager, "android.media.browse.MediaBrowserService", componentName)) {
                    throw new IllegalArgumentException("Failed to resolve SessionToken for " + componentName + ". Manifest doesn't declare one of either MediaSessionService, MediaLibraryService, MediaBrowserService or MediaBrowserServiceCompat. Use service's full name.");
                }
                i11 = 101;
            }
            if (i11 != 101) {
                this.f9293a = new g4(i13, i11, 1000000, 0, componentName.getPackageName(), componentName.getClassName(), componentName, null, Bundle.EMPTY, null);
            } else {
                this.f9293a = new h4(componentName, i13);
            }
        }
        i12 = 2;
        i11 = i12;
        if (i11 != 101) {
            this.f9293a = new g4(i13, i11, 1000000, 0, componentName.getPackageName(), componentName.getClassName(), componentName, null, Bundle.EMPTY, null);
        } else {
            this.f9293a = new h4(componentName, i13);
        }
    }

    public static boolean a(PackageManager packageManager, String str, ComponentName componentName) {
        ServiceInfo serviceInfo;
        Intent intent = new Intent(str);
        intent.setPackage(componentName.getPackageName());
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, Cast.MAX_NAMESPACE_LENGTH);
        if (listQueryIntentServices != null) {
            for (int i10 = 0; i10 < listQueryIntentServices.size(); i10++) {
                ResolveInfo resolveInfo = listQueryIntentServices.get(i10);
                if (resolveInfo != null && (serviceInfo = resolveInfo.serviceInfo) != null && TextUtils.equals(serviceInfo.name, componentName.getClassName())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        e4 e4Var = this.f9293a;
        boolean z10 = e4Var instanceof g4;
        String str = f9291b;
        if (z10) {
            bundle.putInt(str, 0);
        } else {
            bundle.putInt(str, 1);
        }
        bundle.putBundle(f9292c, e4Var.g());
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f4) {
            return this.f9293a.equals(((f4) obj).f9293a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9293a.hashCode();
    }

    public final String toString() {
        return this.f9293a.toString();
    }
}
