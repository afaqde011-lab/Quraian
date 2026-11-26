package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class d1 extends i.a {

    public final int f697a;

    public d1(int i10) {
        this.f697a = i10;
    }

    @Override
    public final Intent a(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f697a) {
            case 0:
                h.k kVar = (h.k) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = kVar.B;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = kVar.A;
                        kotlin.jvm.internal.m.e(intentSender, "intentSender");
                        kVar = new h.k(intentSender, null, kVar.C, kVar.D);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", kVar);
                if (i1.K(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                String[] strArr = (String[]) obj;
                kotlin.jvm.internal.m.e(strArr, "input");
                Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                kotlin.jvm.internal.m.d(intentPutExtra, "putExtra(...)");
                return intentPutExtra;
            case 2:
                String str = (String) obj;
                kotlin.jvm.internal.m.e(str, "input");
                Intent intentPutExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                kotlin.jvm.internal.m.d(intentPutExtra2, "putExtra(...)");
                return intentPutExtra2;
            case 3:
                Intent intent3 = (Intent) obj;
                kotlin.jvm.internal.m.e(intent3, "input");
                return intent3;
            default:
                h.k kVar2 = (h.k) obj;
                kotlin.jvm.internal.m.e(kVar2, "input");
                Intent intentPutExtra3 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", kVar2);
                kotlin.jvm.internal.m.d(intentPutExtra3, "putExtra(...)");
                return intentPutExtra3;
        }
    }

    @Override
    public hf.c b(Context context, Object obj) {
        switch (this.f697a) {
            case 1:
                String[] strArr = (String[]) obj;
                kotlin.jvm.internal.m.e(strArr, "input");
                if (strArr.length == 0) {
                    return new hf.c(h00.y.A, 1);
                }
                for (String str : strArr) {
                    if (n4.b.a(context, str) != 0) {
                        return null;
                    }
                }
                int iP = h00.d0.P(strArr.length);
                if (iP < 16) {
                    iP = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new hf.c(linkedHashMap, 1);
            case 2:
                String str3 = (String) obj;
                kotlin.jvm.internal.m.e(str3, "input");
                if (n4.b.a(context, str3) == 0) {
                    return new hf.c(Boolean.TRUE, 1);
                }
                return null;
            default:
                return super.b(context, obj);
        }
    }

    @Override
    public final Object c(Intent intent, int i10) {
        switch (this.f697a) {
            case 0:
                return new h.a(intent, i10);
            case 1:
                if (i10 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i11 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i11 == 0));
                        }
                        return h00.d0.Y(h00.q.t1(h00.n.C0(stringArrayExtra), arrayList));
                    }
                }
                return h00.y.A;
            case 2:
                if (intent == null || i10 != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z10 = false;
                if (intArrayExtra2 != null) {
                    for (int i12 : intArrayExtra2) {
                        if (i12 == 0) {
                            z10 = true;
                        }
                    }
                }
                return Boolean.valueOf(z10);
            case 3:
                return new h.a(intent, i10);
            default:
                return new h.a(intent, i10);
        }
    }
}
