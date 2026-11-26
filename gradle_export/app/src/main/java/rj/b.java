package rj;

import com.google.protobuf.RuntimeVersion;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s10.w0;
import sj.g;
import sj.h;
import sj.j;
import sj.l;

public final class b {

    public final ci.b f13585a;

    public final Executor f13586b;

    public final sj.c f13587c;

    public final sj.c f13588d;

    public final sj.c f13589e;

    public final g f13590f;

    public final h f13591g;

    public final l f13592h;

    public final w0 f13593i;

    public final p10.a f13594j;

    public b(ci.b bVar, Executor executor, sj.c cVar, sj.c cVar2, sj.c cVar3, g gVar, h hVar, l lVar, w0 w0Var, p10.a aVar) {
        this.f13585a = bVar;
        this.f13586b = executor;
        this.f13587c = cVar;
        this.f13588d = cVar2;
        this.f13589e = cVar3;
        this.f13590f = gVar;
        this.f13591g = hVar;
        this.f13592h = lVar;
        this.f13593i = w0Var;
        this.f13594j = aVar;
    }

    public static ArrayList d(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public final boolean a(String str) {
        Pattern pattern = h.f14275f;
        Pattern pattern2 = h.f14274e;
        h hVar = this.f13591g;
        sj.c cVar = hVar.f14278c;
        String strB = h.b(cVar, str);
        if (strB != null) {
            if (pattern2.matcher(strB).matches()) {
                hVar.a(str, cVar.c());
                return true;
            }
            if (pattern.matcher(strB).matches()) {
                hVar.a(str, cVar.c());
                return false;
            }
        }
        String strB2 = h.b(hVar.f14279d, str);
        if (strB2 != null) {
            if (pattern2.matcher(strB2).matches()) {
                return true;
            }
            if (pattern.matcher(strB2).matches()) {
                return false;
            }
        }
        h.c(str, "Boolean");
        return false;
    }

    public final String b() {
        h hVar = this.f13591g;
        sj.c cVar = hVar.f14278c;
        String strB = h.b(cVar, "force_update_min_app_version");
        if (strB != null) {
            hVar.a("force_update_min_app_version", cVar.c());
            return strB;
        }
        String strB2 = h.b(hVar.f14279d, "force_update_min_app_version");
        if (strB2 != null) {
            return strB2;
        }
        h.c("force_update_min_app_version", "String");
        return RuntimeVersion.SUFFIX;
    }

    public final void c(boolean z10) {
        HttpURLConnection httpURLConnection;
        w0 w0Var = this.f13593i;
        synchronized (w0Var) {
            j jVar = (j) w0Var.C;
            synchronized (jVar.f14298r) {
                try {
                    jVar.f14287e = z10;
                    k7.e eVar = jVar.f14289g;
                    if (eVar != null) {
                        eVar.f9023a = z10;
                    }
                    if (z10 && (httpURLConnection = jVar.f14288f) != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!z10) {
                synchronized (w0Var) {
                    if (!((LinkedHashSet) w0Var.B).isEmpty()) {
                        ((j) w0Var.C).e(0L);
                    }
                }
            }
        }
    }
}
