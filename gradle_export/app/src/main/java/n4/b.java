package n4;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

public abstract class b {

    public static final Object f11055a = new Object();

    public static int a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static ColorStateList b(Context context, int i10) {
        ColorStateList colorStateListA;
        ColorStateList colorStateList;
        p4.g gVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        p4.h hVar = new p4.h(resources, theme);
        synchronized (p4.i.f12337c) {
            try {
                SparseArray sparseArray = (SparseArray) p4.i.f12336b.get(hVar);
                colorStateListA = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (gVar = (p4.g) sparseArray.get(i10)) == null) {
                    colorStateList = null;
                } else {
                    if (gVar.f12331b.equals(resources.getConfiguration())) {
                        if (theme != null || gVar.f12332c != 0) {
                            if (theme == null || gVar.f12332c != theme.hashCode()) {
                            }
                        }
                        colorStateList = gVar.f12330a;
                    }
                    sparseArray.remove(i10);
                    colorStateList = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = p4.i.f12335a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.type;
        if (i11 < 28 || i11 > 31) {
            try {
                colorStateListA = p4.b.a(resources, resources.getXml(i10), theme);
            } catch (Exception e3) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e3);
            }
        }
        if (colorStateListA == null) {
            return resources.getColorStateList(i10, theme);
        }
        synchronized (p4.i.f12337c) {
            try {
                WeakHashMap weakHashMap = p4.i.f12336b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(hVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(hVar, sparseArray2);
                }
                sparseArray2.append(i10, new p4.g(colorStateListA, hVar.f12333a.getConfiguration(), theme));
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return colorStateListA;
    }

    public static Intent c(Context context, ComponentName componentName) {
        String strE = e(context, componentName);
        if (strE == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strE);
        return e(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static Intent d(k.k kVar) {
        Intent parentActivityIntent = kVar.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strE = e(kVar, kVar.getComponentName());
            if (strE == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(kVar, strE);
            try {
                return e(kVar, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strE + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public static String e(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 269222528);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static Intent f(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str) {
        return context.registerReceiver(broadcastReceiver, intentFilter, str, null, 2);
    }
}
