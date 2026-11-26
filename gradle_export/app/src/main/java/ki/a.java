package ki;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import k9.x0;
import oi.q;
import sg.f;

public final class a implements ni.a, mi.a, ij.a {
    public final b A;

    public a(b bVar) {
        this.A = bVar;
    }

    @Override
    public void A(Bundle bundle) {
        ((mi.a) this.A.f9679a).A(bundle);
    }

    @Override
    public void e(q qVar) {
        b bVar = this.A;
        synchronized (bVar) {
            try {
                if (((ni.a) bVar.f9681c) instanceof ni.b) {
                    ((ArrayList) bVar.f9680b).add(qVar);
                }
                ((ni.a) bVar.f9681c).e(qVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void j(ij.b bVar) {
        b bVar2 = this.A;
        li.c cVar = li.c.f10296a;
        cVar.b("AnalyticsConnector now available.");
        fi.b bVar3 = (fi.b) bVar.get();
        hf.c cVar2 = new hf.c(bVar3, 22);
        h7.b bVar4 = new h7.b();
        fi.c cVar3 = (fi.c) bVar3;
        f fVarB = cVar3.b("clx", bVar4);
        if (fVarB == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            fVarB = cVar3.b("crash", bVar4);
            if (fVarB != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
        }
        if (fVarB == null) {
            cVar.f("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        cVar.b("Registered Firebase Analytics listener.");
        gi.c cVar4 = new gi.c(24, false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        x0 x0Var = new x0(cVar2);
        synchronized (bVar2) {
            try {
                Iterator it = ((ArrayList) bVar2.f9680b).iterator();
                while (it.hasNext()) {
                    cVar4.e((q) it.next());
                }
                bVar4.B = cVar4;
                bVar4.A = x0Var;
                bVar2.f9681c = cVar4;
                bVar2.f9679a = x0Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
