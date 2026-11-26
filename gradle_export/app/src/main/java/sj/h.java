package sj;

import android.util.Log;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

public final class h {

    public static final Pattern f14274e;

    public static final Pattern f14275f;

    public final HashSet f14276a = new HashSet();

    public final Executor f14277b;

    public final c f14278c;

    public final c f14279d;

    static {
        Charset.forName("UTF-8");
        f14274e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f14275f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public h(Executor executor, c cVar, c cVar2) {
        this.f14277b = executor;
        this.f14278c = cVar;
        this.f14279d = cVar2;
    }

    public static String b(c cVar, String str) {
        e eVarC = cVar.c();
        if (eVarC == null) {
            return null;
        }
        try {
            return eVarC.f14255b.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void c(String str, String str2) {
        Log.w("FirebaseRemoteConfig", a1.b.q("No value of type '", str2, "' exists for parameter key '", str, "'."));
    }

    public final void a(String str, e eVar) {
        if (eVar == null) {
            return;
        }
        synchronized (this.f14276a) {
            try {
                Iterator it = this.f14276a.iterator();
                while (it.hasNext()) {
                    this.f14277b.execute(new ab.e((rj.c) it.next(), str, eVar, 24));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
