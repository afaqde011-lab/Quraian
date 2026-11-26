package e50;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class d {
    public static final a[] a;
    public static final Map b;

    static {
        a aVar = new a(a.i, "");
        k50.l lVar = a.f;
        a aVar2 = new a(lVar, "GET");
        a aVar3 = new a(lVar, "POST");
        k50.l lVar2 = a.g;
        a aVar4 = new a(lVar2, "/");
        a aVar5 = new a(lVar2, "/index.html");
        k50.l lVar3 = a.h;
        a aVar6 = new a(lVar3, "http");
        a aVar7 = new a(lVar3, "https");
        k50.l lVar4 = a.e;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, new a(lVar4, "200"), new a(lVar4, "204"), new a(lVar4, "206"), new a(lVar4, "304"), new a(lVar4, "400"), new a(lVar4, "404"), new a(lVar4, "500"), new a("accept-charset", ""), new a("accept-encoding", "gzip, deflate"), new a("accept-language", ""), new a("accept-ranges", ""), new a("accept", ""), new a("access-control-allow-origin", ""), new a("age", ""), new a("allow", ""), new a("authorization", ""), new a("cache-control", ""), new a("content-disposition", ""), new a("content-encoding", ""), new a("content-language", ""), new a("content-length", ""), new a("content-location", ""), new a("content-range", ""), new a("content-type", ""), new a("cookie", ""), new a("date", ""), new a("etag", ""), new a("expect", ""), new a("expires", ""), new a("from", ""), new a(DiagnosticsTracker.HOST_KEY, ""), new a("if-match", ""), new a("if-modified-since", ""), new a("if-none-match", ""), new a("if-range", ""), new a("if-unmodified-since", ""), new a("last-modified", ""), new a("link", ""), new a("location", ""), new a("max-forwards", ""), new a("proxy-authenticate", ""), new a("proxy-authorization", ""), new a("range", ""), new a("referer", ""), new a("refresh", ""), new a("retry-after", ""), new a("server", ""), new a("set-cookie", ""), new a("strict-transport-security", ""), new a("transfer-encoding", ""), new a("user-agent", ""), new a("vary", ""), new a("via", ""), new a("www-authenticate", "")};
        a = aVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(aVarArr[i].a)) {
                linkedHashMap.put(aVarArr[i].a, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.m.d(mapUnmodifiableMap, "unmodifiableMap(result)");
        b = mapUnmodifiableMap;
    }

    public static void a(k50.l name) throws IOException {
        kotlin.jvm.internal.m.e(name, "name");
        int iD = name.d();
        for (int i = 0; i < iD; i++) {
            byte bI = name.i(i);
            if (65 <= bI && bI < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.q()));
            }
        }
    }
}
