package e6;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.StrictMode;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import com.google.protobuf.RuntimeVersion;
import d6.i2;
import g00.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import y3.h;

public abstract class f {

    public static final c6.c f5109a = new c6.c("android.widget.extra.CHECKED");

    public static e a(Intent intent) {
        return new e(intent, a.a.U((c6.d[]) Arrays.copyOf(new c6.d[0], 0)));
    }

    public static Intent b(Intent intent, i2 i2Var, int i10) {
        b bVar = b.A;
        Intent intent2 = new Intent();
        b bVar2 = b.A;
        intent2.setComponent((ComponentName) i2Var.f4652o.B);
        intent2.setData(d(i2Var, i10, bVar, RuntimeVersion.SUFFIX));
        intent2.putExtra("ACTION_TYPE", "BROADCAST");
        intent2.putExtra("ACTION_INTENT", intent);
        return intent2;
    }

    public static Intent c(i2 i2Var, Class cls, c6.f fVar) {
        Intent intentPutExtra = new Intent().setComponent((ComponentName) i2Var.f4652o.C).putExtra("ActionCallbackBroadcastReceiver:callbackClass", cls.getCanonicalName()).putExtra("ActionCallbackBroadcastReceiver:appWidgetId", i2Var.f4641b);
        Map mapUnmodifiableMap = Collections.unmodifiableMap(fVar.f2891a);
        ArrayList arrayList = new ArrayList(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            c6.c cVar = (c6.c) entry.getKey();
            arrayList.add(new k(cVar.f2888a, entry.getValue()));
        }
        k[] kVarArr = (k[]) arrayList.toArray(new k[0]);
        intentPutExtra.putExtra("ActionCallbackBroadcastReceiver:parameters", f50.c.n((k[]) Arrays.copyOf(kVarArr, kVarArr.length)));
        return intentPutExtra;
    }

    public static final Uri d(i2 i2Var, int i10, b bVar, String str) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("glance-action");
        builder.path(bVar.name());
        builder.appendQueryParameter("appWidgetId", String.valueOf(i2Var.f4641b));
        builder.appendQueryParameter("viewId", String.valueOf(i10));
        builder.appendQueryParameter("viewSize", h.c(i2Var.f4649j));
        builder.appendQueryParameter("extraData", str);
        if (i2Var.f4645f) {
            builder.appendQueryParameter("lazyCollection", String.valueOf(i2Var.f4650k));
            builder.appendQueryParameter("lazeViewItem", String.valueOf(-1));
        }
        return builder.build();
    }

    public static final Intent e(c6.a aVar, i2 i2Var, int i10, c cVar) {
        if (aVar instanceof e) {
            e eVar = (e) aVar;
            Intent intentH = h(eVar, eVar.f5108b);
            if (intentH.getData() == null) {
                intentH.setData(d(i2Var, i10, b.B, String.valueOf(intentH.getFlags())));
            }
            return intentH;
        }
        if (aVar instanceof d) {
            int i11 = ActionCallbackBroadcastReceiver.f869a;
            d dVar = (d) aVar;
            Intent intentC = c(i2Var, dVar.f5105a, dVar.f5106b);
            b bVar = b.A;
            return b(intentC, i2Var, i10);
        }
        if (!(aVar instanceof c6.e)) {
            throw new IllegalStateException(("Cannot create fill-in Intent for action type: " + aVar).toString());
        }
        ComponentName componentName = i2Var.f4651n;
        if (componentName == null) {
            throw new IllegalArgumentException("In order to use LambdaAction, actionBroadcastReceiver must be provided");
        }
        Intent intentPutExtra = new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", i2Var.f4641b);
        b bVar2 = b.A;
        return b(intentPutExtra, i2Var, i10);
    }

    public static c6.f f(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("ActionCallbackBroadcastReceiver:parameters");
        if (bundle2 == null) {
            throw new IllegalArgumentException("The intent must contain a parameters bundle using extra: ActionCallbackBroadcastReceiver:parameters");
        }
        c6.f fVarU = a.a.U(new c6.d[0]);
        LinkedHashMap linkedHashMap = fVarU.f2891a;
        for (String str : bundle2.keySet()) {
            c6.c cVar = new c6.c(str);
            Object obj = bundle2.get(str);
            linkedHashMap.get(cVar);
            if (obj == null) {
                linkedHashMap.remove(cVar);
            } else {
                linkedHashMap.put(cVar, obj);
            }
        }
        if (bundle.containsKey("android.widget.extra.CHECKED")) {
            Boolean boolValueOf = Boolean.valueOf(bundle.getBoolean("android.widget.extra.CHECKED"));
            c6.c cVar2 = f5109a;
            linkedHashMap.get(cVar2);
            linkedHashMap.put(cVar2, boolValueOf);
        }
        return fVarU;
    }

    public static final PendingIntent g(c6.a aVar, i2 i2Var, int i10, c cVar) {
        Context context = i2Var.f4640a;
        if (aVar instanceof e) {
            e eVar = (e) aVar;
            Intent intentH = h(eVar, eVar.f5108b);
            if (intentH.getData() == null) {
                intentH.setData(d(i2Var, i10, b.B, String.valueOf(intentH.getFlags())));
            }
            return PendingIntent.getActivity(context, 0, intentH, 201326592, null);
        }
        if (aVar instanceof d) {
            int i11 = ActionCallbackBroadcastReceiver.f869a;
            d dVar = (d) aVar;
            Intent intentC = c(i2Var, dVar.f5105a, dVar.f5106b);
            intentC.setData(d(i2Var, i10, b.B, RuntimeVersion.SUFFIX));
            return PendingIntent.getBroadcast(context, 0, intentC, 201326592);
        }
        if (!(aVar instanceof c6.e)) {
            throw new IllegalStateException(("Cannot create PendingIntent for action type: " + aVar).toString());
        }
        ComponentName componentName = i2Var.f4651n;
        if (componentName == null) {
            throw new IllegalArgumentException("In order to use LambdaAction, actionBroadcastReceiver must be provided");
        }
        Intent intentPutExtra = new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", i2Var.f4641b);
        intentPutExtra.setData(d(i2Var, i10, b.B, null));
        return PendingIntent.getBroadcast(context, 0, intentPutExtra, 201326592);
    }

    public static final Intent h(e eVar, c6.f fVar) {
        if (!(eVar instanceof e)) {
            throw new IllegalStateException(("Action type not defined in app widget package: " + eVar).toString());
        }
        Intent intent = eVar.f5107a;
        Map mapUnmodifiableMap = Collections.unmodifiableMap(fVar.f2891a);
        ArrayList arrayList = new ArrayList(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            arrayList.add(new k(((c6.c) entry.getKey()).f2888a, entry.getValue()));
        }
        k[] kVarArr = (k[]) arrayList.toArray(new k[0]);
        intent.putExtras(f50.c.n((k[]) Arrays.copyOf(kVarArr, kVarArr.length)));
        return intent;
    }

    public static final void i(Activity activity, Intent intent) throws NoWhenBranchMatchedException {
        Parcelable parcelableExtra = intent.getParcelableExtra("ACTION_INTENT");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("List adapter activity trampoline invoked without specifying target intent.");
        }
        Intent intent2 = (Intent) parcelableExtra;
        if (intent.hasExtra("android.widget.extra.CHECKED")) {
            intent2.putExtra("android.widget.extra.CHECKED", intent.getBooleanExtra("android.widget.extra.CHECKED", false));
        }
        String stringExtra = intent.getStringExtra("ACTION_TYPE");
        if (stringExtra == null) {
            throw new IllegalArgumentException("List adapter activity trampoline invoked without trampoline type");
        }
        Bundle bundleExtra = intent.getBundleExtra("ACTIVITY_OPTIONS");
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        int iOrdinal = b.valueOf(stringExtra).ordinal();
        if (iOrdinal == 0) {
            activity.startActivity(intent2, bundleExtra);
        } else if (iOrdinal == 1) {
            activity.sendBroadcast(intent2);
        } else if (iOrdinal == 2) {
            activity.startService(intent2);
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            activity.sendBroadcast(intent2);
        } else {
            activity.startForegroundService(intent2);
        }
        StrictMode.setVmPolicy(vmPolicy);
        activity.finish();
    }
}
