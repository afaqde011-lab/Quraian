package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import a30.k;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import c3.l;
import de.d;
import he.a;
import java.util.concurrent.Executor;
import sd.p1;
import xd.i;
import xd.p;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    public static final int f3169a = 0;

    @Override
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        p.b(context);
        p1 p1VarA = i.a();
        p1VarA.G(queryParameter);
        p1VarA.D = a.b(iIntValue);
        if (queryParameter2 != null) {
            p1VarA.C = Base64.decode(queryParameter2, 0);
        }
        k kVar = p.a().f16561d;
        ((Executor) kVar.e).execute(new d(kVar, p1VarA.i(), i10, new l(1)));
    }
}
