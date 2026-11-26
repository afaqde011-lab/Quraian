package me;

import android.content.Context;
import com.google.android.gms.common.api.q;
import com.google.android.gms.internal.cast.a3;
import java.util.Iterator;
import java.util.Set;

public abstract class h {

    public static final c50.h f10895a = new c50.h("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        i.K(context).L();
        Set set = q.f3254a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((q) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        synchronized (com.google.android.gms.common.api.internal.h.R) {
            try {
                com.google.android.gms.common.api.internal.h hVar = com.google.android.gms.common.api.internal.h.S;
                if (hVar != null) {
                    hVar.I.incrementAndGet();
                    a3 a3Var = hVar.N;
                    a3Var.sendMessageAtFrontOfQueue(a3Var.obtainMessage(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
