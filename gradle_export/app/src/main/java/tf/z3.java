package tf;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;

public final class z3 {

    public final Context f14783a;

    public z3(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f14783a = context;
                break;
            default:
                com.google.android.gms.common.internal.d0.h(context);
                Context applicationContext = context.getApplicationContext();
                com.google.android.gms.common.internal.d0.h(applicationContext);
                this.f14783a = applicationContext;
                break;
        }
    }

    public ApplicationInfo a(int i10, String str) {
        return this.f14783a.getPackageManager().getApplicationInfo(str, i10);
    }

    public PackageInfo b(int i10, String str) {
        return this.f14783a.getPackageManager().getPackageInfo(str, i10);
    }

    public boolean c() {
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.f14783a;
        if (callingUid == iMyUid) {
            return ta.c0.J(context);
        }
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return context.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }
}
