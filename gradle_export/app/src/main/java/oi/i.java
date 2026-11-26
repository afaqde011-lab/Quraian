package oi;

import android.util.Log;
import b3.c0;
import java.io.IOException;

public final class i {

    public static final h f12001d = new h(0);

    public static final c0 f12002e = new c0(10);

    public final ui.b f12003a;

    public String f12004b = null;

    public String f12005c = null;

    public i(ui.b bVar) {
        this.f12003a = bVar;
    }

    public static void a(ui.b bVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            bVar.p(str, "aqs.".concat(str2)).createNewFile();
        } catch (IOException e3) {
            Log.w("FirebaseCrashlytics", "Failed to persist App Quality Sessions session id.", e3);
        }
    }
}
