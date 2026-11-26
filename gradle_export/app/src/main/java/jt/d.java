package jt;

import android.content.Context;
import android.content.SharedPreferences;
import bk.m;
import h00.y;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ot.e;
import r30.k;
import ri.t1;
import ta.c0;
import x40.b0;
import x40.d0;
import x40.w;

public final class d {
    public final Context a;
    public final w b;
    public final SharedPreferences c;
    public final m d;
    public final e e;
    public final ConcurrentHashMap f = new ConcurrentHashMap();

    public d(Context context, w wVar, SharedPreferences sharedPreferences, m mVar, e eVar) {
        this.a = context;
        this.b = wVar;
        this.c = sharedPreferences;
        this.d = mVar;
        this.e = eVar;
    }

    public static final void a(d dVar, String str, File file) {
        ce.c cVar = new ce.c(18);
        cVar.H(str);
        b0 b0VarF = dVar.b.a(cVar.r()).f();
        try {
            if (!b0VarF.i()) {
                throw new IllegalStateException(("Download failed: " + b0VarF.D).toString());
            }
            d0 d0Var = b0VarF.G;
            if (d0Var == null) {
                throw new IllegalStateException("Empty body");
            }
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                w50.c.w(d0Var.v().l0(), fileOutputStream, 8192);
                fileOutputStream.close();
                b0VarF.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    c0.C(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                c0.C(b0VarF, th3);
                throw th4;
            }
        }
    }

    public final File b(String translationId, String str) {
        kotlin.jvm.internal.m.e(translationId, "translationId");
        String string = str != null ? k.j1(str).toString() : null;
        if (string == null) {
            string = "";
        }
        if (string.length() == 0) {
            return null;
        }
        String strD1 = k.d1(string, '?');
        String lowerCase = k.b1('.', k.b1('/', strD1, strD1), "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        if (lowerCase.length() == 0) {
            lowerCase = "dat";
        }
        File file = new File(this.a.getFilesDir(), this.e.A);
        file.mkdirs();
        return new File(file, translationId + "." + lowerCase);
    }

    public final Map c() {
        Object objS;
        String string = this.c.getString(this.e.B, null);
        y yVar = y.A;
        if (string == null) {
            return yVar;
        }
        try {
            objS = (Map) this.d.e(string, new c().getType());
        } catch (Throwable th) {
            objS = t1.s(th);
        }
        Map map = (Map) (objS instanceof g00.m ? null : objS);
        return map == null ? yVar : map;
    }
}
