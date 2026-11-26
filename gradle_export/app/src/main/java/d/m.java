package d;

import android.app.ActivityOptions;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.x5;
import java.util.Arrays;
import java.util.HashSet;

public final class m extends h.i {

    public final n f4392h;

    public m(n nVar) {
        this.f4392h = nVar;
    }

    @Override
    public final void b(int i10, i.a aVar, Object obj, hf.c cVar) {
        Bundle bundle;
        int i11;
        kotlin.jvm.internal.m.e(aVar, "contract");
        n nVar = this.f4392h;
        hf.c cVarB = aVar.b(nVar, obj);
        if (cVarB != null) {
            new Handler(Looper.getMainLooper()).post(new l(this, i10, cVarB, 0));
            return;
        }
        Intent intentA = aVar.a(nVar, obj);
        if (intentA.getExtras() != null) {
            Bundle extras = intentA.getExtras();
            kotlin.jvm.internal.m.b(extras);
            if (extras.getClassLoader() == null) {
                intentA.setExtrasClassLoader(nVar.getClassLoader());
            }
        }
        if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = cVar != null ? ((ActivityOptions) cVar.B).toBundle() : null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
            String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (String str : stringArrayExtra) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException(x5.n(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i12 = 0;
                for (int i13 = 0; i13 < stringArrayExtra.length; i13++) {
                    if (!hashSet.contains(Integer.valueOf(i13))) {
                        strArr[i12] = stringArrayExtra[i13];
                        i12++;
                    }
                }
            }
            if (nVar instanceof n4.a) {
                ((n4.a) nVar).validateRequestPermissionsRequestCode(i10);
            }
            nVar.requestPermissions(stringArrayExtra, i10);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
            nVar.startActivityForResult(intentA, i10, bundle2);
            return;
        }
        h.k kVar = (h.k) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            kotlin.jvm.internal.m.b(kVar);
            i11 = i10;
            try {
                nVar.startIntentSenderForResult(kVar.A, i11, kVar.B, kVar.C, kVar.D, 0, bundle2);
            } catch (IntentSender.SendIntentException e3) {
                e = e3;
                new Handler(Looper.getMainLooper()).post(new l(this, i11, e, 1));
            }
        } catch (IntentSender.SendIntentException e10) {
            e = e10;
            i11 = i10;
        }
    }
}
