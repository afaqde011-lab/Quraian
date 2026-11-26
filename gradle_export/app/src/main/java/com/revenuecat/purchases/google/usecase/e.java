package com.revenuecat.purchases.google.usecase;

import androidx.lifecycle.f0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import d4.i;
import g00.b0;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import qd.h;
import qd.t;
import sj.f;
import sj.g;

public final class e implements t, xf.a, i {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;

    public e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
        this.A = obj4;
        this.E = obj5;
    }

    @Override
    public Object M(Task task) {
        g gVar = (g) this.B;
        Task task2 = (Task) this.C;
        Task task3 = (Task) this.D;
        Date date = (Date) this.A;
        HashMap map = (HashMap) this.E;
        if (!task2.o()) {
            return Tasks.c(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task2.j()));
        }
        if (!task3.o()) {
            return Tasks.c(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task3.j()));
        }
        try {
            f fVarA = gVar.a((String) task2.k(), ((jj.a) task3.k()).f11351a, date, map);
            return fVarA.f19548a != 0 ? Tasks.d(fVarA) : gVar.f19557e.d(fVarA.f19549b).p(gVar.f19555c, new k7.t(fVarA, 21));
        } catch (FirebaseRemoteConfigException e3) {
            return Tasks.c(e3);
        }
    }

    @Override
    public void a(h hVar, List list) {
        QueryPurchasesByTypeUseCase.queryPurchasesAsyncWithTrackingEnsuringOneResponse$lambda$2((AtomicBoolean) this.B, (QueryPurchasesByTypeUseCase) this.C, (String) this.D, (Date) this.A, (t) this.E, hVar, list);
    }

    @Override
    public Object h(d4.h hVar) {
        ((Executor) this.B).execute(new com.revenuecat.purchases.d((za.i) this.C, (String) this.D, (u00.a) this.A, (f0) this.E, hVar, 8));
        return b0.f7770a;
    }
}
