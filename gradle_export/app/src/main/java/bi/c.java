package bi;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.cast.Cast;
import ii.j;
import ii.p;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import sd.y1;

public final class c implements ij.b {

    public final int f2523a;

    public final Object f2524b;

    public final Object f2525c;

    public c(Context context, String str) {
        this.f2523a = 1;
        this.f2524b = context;
        this.f2525c = str;
    }

    public c(Object obj, Object obj2, int i10) {
        this.f2523a = i10;
        this.f2525c = obj;
        this.f2524b = obj2;
    }

    @Override
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f2523a) {
            case 0:
                g gVar = (g) this.f2525c;
                Context context = (Context) this.f2524b;
                String strD = gVar.d();
                nj.a aVar = new nj.a();
                Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:" + strD, 0);
                boolean z10 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z10 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextCreateDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextCreateDeviceProtectedStorageContext.getPackageName(), Cast.MAX_NAMESPACE_LENGTH)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z10 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                aVar.f11368a = z10;
                return aVar;
            case 1:
                return new gj.i((Context) this.f2524b, (String) this.f2525c);
            default:
                ii.g gVar2 = (ii.g) this.f2525c;
                ii.b bVar = (ii.b) this.f2524b;
                ii.e eVar = bVar.f7681f;
                y1 y1Var = new y1();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<j> set = bVar.f7678c;
                Set set2 = bVar.f7682g;
                for (j jVar : set) {
                    int i10 = jVar.f7701c;
                    int i11 = jVar.f7700b;
                    boolean z11 = i10 == 0;
                    p pVar = jVar.f7699a;
                    if (z11) {
                        if (i11 == 2) {
                            hashSet4.add(pVar);
                        } else {
                            hashSet.add(pVar);
                        }
                    } else if (i10 == 2) {
                        hashSet3.add(pVar);
                    } else if (i11 == 2) {
                        hashSet5.add(pVar);
                    } else {
                        hashSet2.add(pVar);
                    }
                }
                if (!set2.isEmpty()) {
                    hashSet.add(p.a(fj.b.class));
                }
                y1Var.f14132a = Collections.unmodifiableSet(hashSet);
                y1Var.f14133b = Collections.unmodifiableSet(hashSet2);
                y1Var.f14134c = Collections.unmodifiableSet(hashSet3);
                y1Var.f14135d = Collections.unmodifiableSet(hashSet4);
                y1Var.f14136e = Collections.unmodifiableSet(hashSet5);
                y1Var.f14137f = gVar2;
                return eVar.m(y1Var);
        }
    }
}
