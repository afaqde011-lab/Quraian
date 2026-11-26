package si;

import android.util.Base64;
import android.util.JsonReader;
import dj.d;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.i;
import ri.a0;
import ri.a1;
import ri.a2;
import ri.b;
import ri.b0;
import ri.b1;
import ri.b2;
import ri.c;
import ri.c0;
import ri.c1;
import ri.c2;
import ri.d0;
import ri.d1;
import ri.d2;
import ri.e;
import ri.e0;
import ri.e1;
import ri.e2;
import ri.f;
import ri.f0;
import ri.f1;
import ri.f2;
import ri.g;
import ri.g0;
import ri.g1;
import ri.g2;
import ri.h;
import ri.h0;
import ri.h1;
import ri.h2;
import ri.i0;
import ri.i1;
import ri.i2;
import ri.j;
import ri.j0;
import ri.j1;
import ri.j2;
import ri.k;
import ri.k0;
import ri.k2;
import ri.l;
import ri.l0;
import ri.l2;
import ri.m;
import ri.m0;
import ri.m2;
import ri.n;
import ri.n0;
import ri.n2;
import ri.o;
import ri.o0;
import ri.o1;
import ri.p;
import ri.p0;
import ri.p1;
import ri.q;
import ri.q0;
import ri.q1;
import ri.r;
import ri.r0;
import ri.r1;
import ri.s;
import ri.s0;
import ri.s1;
import ri.t;
import ri.t0;
import ri.t1;
import ri.u;
import ri.u0;
import ri.u1;
import ri.v;
import ri.v0;
import ri.v1;
import ri.w;
import ri.w0;
import ri.w1;
import ri.x;
import ri.x0;
import ri.x1;
import ri.y;
import ri.y0;
import ri.y1;
import ri.z;
import ri.z0;
import ri.z1;

public final class a {

    public static final i f14241a;

    static {
        d dVar = new d();
        ri.d dVar2 = ri.d.f13297a;
        dVar.a(n2.class, dVar2);
        dVar.a(b0.class, dVar2);
        j jVar = j.f13383a;
        dVar.a(m2.class, jVar);
        dVar.a(j0.class, jVar);
        g gVar = g.f13339a;
        dVar.a(u1.class, gVar);
        dVar.a(k0.class, gVar);
        h hVar = h.f13350a;
        dVar.a(t1.class, hVar);
        dVar.a(l0.class, hVar);
        z zVar = z.f13579a;
        dVar.a(l2.class, zVar);
        dVar.a(j1.class, zVar);
        y yVar = y.f13569a;
        dVar.a(k2.class, yVar);
        dVar.a(i1.class, yVar);
        ri.i iVar = ri.i.f13358a;
        dVar.a(v1.class, iVar);
        dVar.a(n0.class, iVar);
        t tVar = t.f13528a;
        dVar.a(j2.class, tVar);
        dVar.a(p0.class, tVar);
        k kVar = k.f13406a;
        dVar.a(d2.class, kVar);
        dVar.a(q0.class, kVar);
        m mVar = m.f13434a;
        dVar.a(b2.class, mVar);
        dVar.a(r0.class, mVar);
        p pVar = p.f13484a;
        dVar.a(a2.class, pVar);
        dVar.a(v0.class, pVar);
        q qVar = q.f13494a;
        dVar.a(z1.class, qVar);
        dVar.a(x0.class, qVar);
        n nVar = n.f13456a;
        dVar.a(x1.class, nVar);
        dVar.a(t0.class, nVar);
        b bVar = b.f13257a;
        dVar.a(p1.class, bVar);
        dVar.a(d0.class, bVar);
        ri.a aVar = ri.a.f13235a;
        dVar.a(o1.class, aVar);
        dVar.a(e0.class, aVar);
        o oVar = o.f13473a;
        dVar.a(y1.class, oVar);
        dVar.a(u0.class, oVar);
        l lVar = l.f13423a;
        dVar.a(w1.class, lVar);
        dVar.a(s0.class, lVar);
        c cVar = c.f13283a;
        dVar.a(q1.class, cVar);
        dVar.a(f0.class, cVar);
        r rVar = r.f13507a;
        dVar.a(c2.class, rVar);
        dVar.a(z0.class, rVar);
        s sVar = s.f13517a;
        dVar.a(e2.class, sVar);
        dVar.a(b1.class, sVar);
        u uVar = u.f13540a;
        dVar.a(f2.class, uVar);
        dVar.a(c1.class, uVar);
        x xVar = x.f13562a;
        dVar.a(i2.class, xVar);
        dVar.a(g1.class, xVar);
        v vVar = v.f13545a;
        dVar.a(h2.class, vVar);
        dVar.a(e1.class, vVar);
        w wVar = w.f13553a;
        dVar.a(g2.class, wVar);
        dVar.a(f1.class, wVar);
        e eVar = e.f13322a;
        dVar.a(s1.class, eVar);
        dVar.a(g0.class, eVar);
        f fVar = f.f13332a;
        dVar.a(r1.class, fVar);
        dVar.a(h0.class, fVar);
        dVar.f4908d = true;
        f14241a = new i(dVar, 19);
    }

    public static x0 a(JsonReader jsonReader) throws IOException {
        w0 w0Var = new w0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    w0Var.f13559d = jsonReader.nextLong();
                    w0Var.f13561f = (byte) (w0Var.f13561f | 2);
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null symbol");
                    }
                    w0Var.f13557b = strNextString;
                    break;
                    break;
                case "pc":
                    w0Var.f13556a = jsonReader.nextLong();
                    w0Var.f13561f = (byte) (w0Var.f13561f | 1);
                    break;
                case "file":
                    w0Var.f13558c = jsonReader.nextString();
                    break;
                case "importance":
                    w0Var.f13560e = jsonReader.nextInt();
                    w0Var.f13561f = (byte) (w0Var.f13561f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return w0Var.a();
    }

    public static f0 b(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    throw new NullPointerException("Null key");
                }
            } else if (strNextName.equals("value")) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    throw new NullPointerException("Null value");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (strNextString != null && strNextString2 != null) {
            return new f0(strNextString, strNextString2);
        }
        StringBuilder sb2 = new StringBuilder();
        if (strNextString == null) {
            sb2.append(" key");
        }
        if (strNextString2 == null) {
            sb2.append(" value");
        }
        throw new IllegalStateException(oi.k.j("Missing required properties:", sb2));
    }

    public static d0 c(JsonReader jsonReader) throws IOException {
        c0 c0Var = new c0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    c0Var.f13294i = d(jsonReader, new oj.l(9));
                    break;
                case "pid":
                    c0Var.f13286a = jsonReader.nextInt();
                    c0Var.f13295j = (byte) (c0Var.f13295j | 1);
                    break;
                case "pss":
                    c0Var.f13290e = jsonReader.nextLong();
                    c0Var.f13295j = (byte) (c0Var.f13295j | 8);
                    break;
                case "rss":
                    c0Var.f13291f = jsonReader.nextLong();
                    c0Var.f13295j = (byte) (c0Var.f13295j | 16);
                    break;
                case "timestamp":
                    c0Var.f13292g = jsonReader.nextLong();
                    c0Var.f13295j = (byte) (c0Var.f13295j | 32);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    c0Var.f13287b = strNextString;
                    break;
                    break;
                case "reasonCode":
                    c0Var.f13288c = jsonReader.nextInt();
                    c0Var.f13295j = (byte) (c0Var.f13295j | 2);
                    break;
                case "traceFile":
                    c0Var.f13293h = jsonReader.nextString();
                    break;
                case "importance":
                    c0Var.f13289d = jsonReader.nextInt();
                    c0Var.f13295j = (byte) (c0Var.f13295j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c0Var.a();
    }

    public static List d(JsonReader jsonReader, oj.l lVar) throws IOException {
        Object e0Var;
        Object h0Var;
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            String strNextString = null;
            switch (lVar.A) {
                case 9:
                    jsonReader.beginObject();
                    String strNextString2 = null;
                    String strNextString3 = null;
                    while (jsonReader.hasNext()) {
                        String strNextName = jsonReader.nextName();
                        strNextName.getClass();
                        switch (strNextName) {
                            case "libraryName":
                                strNextString2 = jsonReader.nextString();
                                if (strNextString2 == null) {
                                    throw new NullPointerException("Null libraryName");
                                }
                                break;
                                break;
                            case "arch":
                                String strNextString4 = jsonReader.nextString();
                                if (strNextString4 == null) {
                                    throw new NullPointerException("Null arch");
                                }
                                strNextString = strNextString4;
                                break;
                                break;
                            case "buildId":
                                strNextString3 = jsonReader.nextString();
                                if (strNextString3 == null) {
                                    throw new NullPointerException("Null buildId");
                                }
                                break;
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (strNextString == null || strNextString2 == null || strNextString3 == null) {
                        StringBuilder sb2 = new StringBuilder();
                        if (strNextString == null) {
                            sb2.append(" arch");
                        }
                        if (strNextString2 == null) {
                            sb2.append(" libraryName");
                        }
                        if (strNextString3 == null) {
                            sb2.append(" buildId");
                        }
                        throw new IllegalStateException(oi.k.j("Missing required properties:", sb2));
                    }
                    e0Var = new e0(strNextString, strNextString2, strNextString3);
                    continue;
                    arrayList.add(e0Var);
                    break;
                case 10:
                    jsonReader.beginObject();
                    byte[] bArrDecode = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("filename")) {
                            String strNextString5 = jsonReader.nextString();
                            if (strNextString5 == null) {
                                throw new NullPointerException("Null filename");
                            }
                            strNextString = strNextString5;
                        } else if (strNextName2.equals("contents")) {
                            bArrDecode = Base64.decode(jsonReader.nextString(), 2);
                            if (bArrDecode == null) {
                                throw new NullPointerException("Null contents");
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (strNextString == null || bArrDecode == null) {
                        StringBuilder sb3 = new StringBuilder();
                        if (strNextString == null) {
                            sb3.append(" filename");
                        }
                        if (bArrDecode == null) {
                            sb3.append(" contents");
                        }
                        throw new IllegalStateException(oi.k.j("Missing required properties:", sb3));
                    }
                    h0Var = new h0(strNextString, bArrDecode);
                    break;
                case 11:
                    d1 d1Var = new d1();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3) {
                            case "parameterKey":
                                String strNextString6 = jsonReader.nextString();
                                if (strNextString6 == null) {
                                    throw new NullPointerException("Null parameterKey");
                                }
                                d1Var.f13318b = strNextString6;
                                break;
                                break;
                            case "templateVersion":
                                d1Var.f13320d = jsonReader.nextLong();
                                d1Var.f13321e = (byte) (d1Var.f13321e | 1);
                                break;
                            case "rolloutVariant":
                                jsonReader.beginObject();
                                String strNextString7 = null;
                                String strNextString8 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    if (strNextName4.equals("variantId")) {
                                        strNextString8 = jsonReader.nextString();
                                        if (strNextString8 == null) {
                                            throw new NullPointerException("Null variantId");
                                        }
                                    } else if (strNextName4.equals("rolloutId")) {
                                        strNextString7 = jsonReader.nextString();
                                        if (strNextString7 == null) {
                                            throw new NullPointerException("Null rolloutId");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (strNextString7 != null && strNextString8 != null) {
                                    d1Var.f13317a = new f1(strNextString7, strNextString8);
                                    break;
                                } else {
                                    StringBuilder sb4 = new StringBuilder();
                                    if (strNextString7 == null) {
                                        sb4.append(" rolloutId");
                                    }
                                    if (strNextString8 == null) {
                                        sb4.append(" variantId");
                                    }
                                    throw new IllegalStateException(oi.k.j("Missing required properties:", sb4));
                                }
                                break;
                            case "parameterValue":
                                String strNextString9 = jsonReader.nextString();
                                if (strNextString9 == null) {
                                    throw new NullPointerException("Null parameterValue");
                                }
                                d1Var.f13319c = strNextString9;
                                break;
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    e0Var = d1Var.a();
                    continue;
                    arrayList.add(e0Var);
                    break;
                case 12:
                    jsonReader.beginObject();
                    List listD = null;
                    byte b7 = 0;
                    int iNextInt = 0;
                    while (jsonReader.hasNext()) {
                        String strNextName5 = jsonReader.nextName();
                        strNextName5.getClass();
                        switch (strNextName5) {
                            case "frames":
                                listD = d(jsonReader, new oj.l(14));
                                if (listD == null) {
                                    throw new NullPointerException("Null frames");
                                }
                                break;
                                break;
                            case "name":
                                strNextString = jsonReader.nextString();
                                if (strNextString == null) {
                                    throw new NullPointerException("Null name");
                                }
                                break;
                            case "importance":
                                iNextInt = jsonReader.nextInt();
                                b7 = (byte) (b7 | 1);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (b7 != 1 || strNextString == null || listD == null) {
                        StringBuilder sb5 = new StringBuilder();
                        if (strNextString == null) {
                            sb5.append(" name");
                        }
                        if ((b7 & 1) == 0) {
                            sb5.append(" importance");
                        }
                        if (listD == null) {
                            sb5.append(" frames");
                        }
                        throw new IllegalStateException(oi.k.j("Missing required properties:", sb5));
                    }
                    h0Var = new v0(strNextString, iNextInt, listD);
                    break;
                case 13:
                    jsonReader.beginObject();
                    String str = null;
                    String str2 = null;
                    byte b10 = 0;
                    long jNextLong = 0;
                    long jNextLong2 = 0;
                    while (jsonReader.hasNext()) {
                        String strNextName6 = jsonReader.nextName();
                        strNextName6.getClass();
                        switch (strNextName6) {
                            case "name":
                                String strNextString10 = jsonReader.nextString();
                                if (strNextString10 == null) {
                                    throw new NullPointerException("Null name");
                                }
                                str = strNextString10;
                                break;
                                break;
                            case "size":
                                b10 = (byte) (b10 | 2);
                                jNextLong2 = jsonReader.nextLong();
                                break;
                            case "uuid":
                                str2 = new String(Base64.decode(jsonReader.nextString(), 2), n2.f13472a);
                                break;
                            case "baseAddress":
                                b10 = (byte) (b10 | 1);
                                jNextLong = jsonReader.nextLong();
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (b10 != 3 || str == null) {
                        StringBuilder sb6 = new StringBuilder();
                        if ((b10 & 1) == 0) {
                            sb6.append(" baseAddress");
                        }
                        if ((b10 & 2) == 0) {
                            sb6.append(" size");
                        }
                        if (str == null) {
                            sb6.append(" name");
                        }
                        throw new IllegalStateException(oi.k.j("Missing required properties:", sb6));
                    }
                    e0Var = new s0(jNextLong, jNextLong2, str, str2);
                    continue;
                    arrayList.add(e0Var);
                    break;
                default:
                    e0Var = a(jsonReader);
                    continue;
                    arrayList.add(e0Var);
                    break;
            }
            e0Var = h0Var;
            arrayList.add(e0Var);
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    public static p0 e(JsonReader jsonReader) throws IOException {
        o0 o0Var = new o0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "device":
                    a1 a1Var = new a1();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        switch (strNextName2) {
                            case "batteryLevel":
                                a1Var.f13250a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case "batteryVelocity":
                                a1Var.f13251b = jsonReader.nextInt();
                                a1Var.f13256g = (byte) (a1Var.f13256g | 1);
                                break;
                            case "orientation":
                                a1Var.f13253d = jsonReader.nextInt();
                                a1Var.f13256g = (byte) (a1Var.f13256g | 4);
                                break;
                            case "diskUsed":
                                a1Var.f13255f = jsonReader.nextLong();
                                a1Var.f13256g = (byte) (a1Var.f13256g | 16);
                                break;
                            case "ramUsed":
                                a1Var.f13254e = jsonReader.nextLong();
                                a1Var.f13256g = (byte) (a1Var.f13256g | 8);
                                break;
                            case "proximityOn":
                                a1Var.f13252c = jsonReader.nextBoolean();
                                a1Var.f13256g = (byte) (a1Var.f13256g | 2);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    o0Var.f13480d = a1Var.a();
                    break;
                case "rollouts":
                    jsonReader.beginObject();
                    List list = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        if (strNextName3.equals("assignments")) {
                            List listD = d(jsonReader, new oj.l(11));
                            if (listD == null) {
                                throw new NullPointerException("Null rolloutAssignments");
                            }
                            list = listD;
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (list == null) {
                        throw new IllegalStateException("Missing required properties: rolloutAssignments");
                    }
                    o0Var.f13482f = new g1(list);
                    break;
                    break;
                case "app":
                    jsonReader.beginObject();
                    byte b7 = 0;
                    int iNextInt = 0;
                    r0 r0Var = null;
                    List listUnmodifiableList = null;
                    List listUnmodifiableList2 = null;
                    Boolean boolValueOf = null;
                    z0 z0VarG = null;
                    List listUnmodifiableList3 = null;
                    while (jsonReader.hasNext()) {
                        String strNextName4 = jsonReader.nextName();
                        strNextName4.getClass();
                        switch (strNextName4) {
                            case "appProcessDetails":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(g(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList3 = Collections.unmodifiableList(arrayList);
                                break;
                            case "background":
                                boolValueOf = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            case "execution":
                                jsonReader.beginObject();
                                List listD2 = null;
                                t0 t0VarF = null;
                                d0 d0VarC = null;
                                u0 u0Var = null;
                                List listD3 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "appExitInfo":
                                            d0VarC = c(jsonReader);
                                            break;
                                        case "threads":
                                            listD2 = d(jsonReader, new oj.l(12));
                                            break;
                                        case "signal":
                                            jsonReader.beginObject();
                                            long jNextLong = 0;
                                            byte b10 = 0;
                                            String strNextString = null;
                                            String strNextString2 = null;
                                            while (jsonReader.hasNext()) {
                                                String strNextName6 = jsonReader.nextName();
                                                strNextName6.getClass();
                                                switch (strNextName6) {
                                                    case "address":
                                                        b10 = (byte) (b10 | 1);
                                                        jNextLong = jsonReader.nextLong();
                                                        break;
                                                    case "code":
                                                        strNextString2 = jsonReader.nextString();
                                                        if (strNextString2 == null) {
                                                            throw new NullPointerException("Null code");
                                                        }
                                                        break;
                                                        break;
                                                    case "name":
                                                        strNextString = jsonReader.nextString();
                                                        if (strNextString == null) {
                                                            throw new NullPointerException("Null name");
                                                        }
                                                        break;
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            if (b10 == 1 && strNextString != null && strNextString2 != null) {
                                                u0Var = new u0(strNextString, jNextLong, strNextString2);
                                                break;
                                            } else {
                                                StringBuilder sb2 = new StringBuilder();
                                                if (strNextString == null) {
                                                    sb2.append(" name");
                                                }
                                                if (strNextString2 == null) {
                                                    sb2.append(" code");
                                                }
                                                if ((b10 & 1) == 0) {
                                                    sb2.append(" address");
                                                }
                                                throw new IllegalStateException(oi.k.j("Missing required properties:", sb2));
                                            }
                                            break;
                                        case "binaries":
                                            listD3 = d(jsonReader, new oj.l(13));
                                            if (listD3 == null) {
                                                throw new NullPointerException("Null binaries");
                                            }
                                            break;
                                        case "exception":
                                            t0VarF = f(jsonReader);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (u0Var != null && listD3 != null) {
                                    r0Var = new r0(listD2, t0VarF, d0VarC, u0Var, listD3);
                                    break;
                                } else {
                                    StringBuilder sb3 = new StringBuilder();
                                    if (u0Var == null) {
                                        sb3.append(" signal");
                                    }
                                    if (listD3 == null) {
                                        sb3.append(" binaries");
                                    }
                                    throw new IllegalStateException(oi.k.j("Missing required properties:", sb3));
                                }
                                break;
                            case "internalKeys":
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
                                break;
                            case "customAttributes":
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(b(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList = Collections.unmodifiableList(arrayList3);
                                break;
                            case "uiOrientation":
                                iNextInt = jsonReader.nextInt();
                                b7 = (byte) 1;
                                break;
                            case "currentProcessDetails":
                                z0VarG = g(jsonReader);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    if (b7 == 1 && r0Var != null) {
                        o0Var.f13479c = new q0(r0Var, listUnmodifiableList, listUnmodifiableList2, boolValueOf, z0VarG, listUnmodifiableList3, iNextInt);
                        break;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        if (r0Var == null) {
                            sb4.append(" execution");
                        }
                        if (b7 == 0) {
                            sb4.append(" uiOrientation");
                        }
                        throw new IllegalStateException(oi.k.j("Missing required properties:", sb4));
                    }
                    break;
                case "log":
                    jsonReader.beginObject();
                    String str = null;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("content")) {
                            String strNextString3 = jsonReader.nextString();
                            if (strNextString3 == null) {
                                throw new NullPointerException("Null content");
                            }
                            str = strNextString3;
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (str == null) {
                        throw new IllegalStateException("Missing required properties: content");
                    }
                    o0Var.f13481e = new c1(str);
                    break;
                    break;
                case "type":
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        throw new NullPointerException("Null type");
                    }
                    o0Var.f13478b = strNextString4;
                    break;
                    break;
                case "timestamp":
                    o0Var.f13477a = jsonReader.nextLong();
                    o0Var.f13483g = (byte) (o0Var.f13483g | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return o0Var.a();
    }

    public static t0 f(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        int iNextInt = 0;
        String str = null;
        String strNextString = null;
        List list = null;
        t0 t0VarF = null;
        byte b7 = 0;
        while (true) {
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (b7 == 1 && str != null && list != null) {
                    return new t0(str, strNextString, list, t0VarF, iNextInt);
                }
                StringBuilder sb2 = new StringBuilder();
                if (str == null) {
                    sb2.append(" type");
                }
                if (list == null) {
                    sb2.append(" frames");
                }
                if ((b7 & 1) == 0) {
                    sb2.append(" overflowCount");
                }
                throw new IllegalStateException(oi.k.j("Missing required properties:", sb2));
            }
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    List listD = d(jsonReader, new oj.l(14));
                    if (listD == null) {
                        throw new NullPointerException("Null frames");
                    }
                    list = listD;
                    break;
                    break;
                case "reason":
                    strNextString = jsonReader.nextString();
                    break;
                case "type":
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null type");
                    }
                    str = strNextString2;
                    break;
                    break;
                case "causedBy":
                    t0VarF = f(jsonReader);
                    break;
                case "overflowCount":
                    iNextInt = jsonReader.nextInt();
                    b7 = (byte) (b7 | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }

    public static z0 g(JsonReader jsonReader) throws IOException {
        y0 y0Var = new y0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    y0Var.f13575b = jsonReader.nextInt();
                    y0Var.f13578e = (byte) (y0Var.f13578e | 1);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null processName");
                    }
                    y0Var.f13574a = strNextString;
                    break;
                    break;
                case "defaultProcess":
                    y0Var.f13577d = jsonReader.nextBoolean();
                    y0Var.f13578e = (byte) (y0Var.f13578e | 4);
                    break;
                case "importance":
                    y0Var.f13576c = jsonReader.nextInt();
                    y0Var.f13578e = (byte) (y0Var.f13578e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return y0Var.a();
    }

    public static b0 h(JsonReader jsonReader) throws IOException {
        Charset charset = n2.f13472a;
        a0 a0Var = new a0();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            int i10 = 10;
            switch (strNextName) {
                case "ndkPayload":
                    jsonReader.beginObject();
                    List listD = null;
                    String strNextString = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("files")) {
                            listD = d(jsonReader, new oj.l(i10));
                            if (listD == null) {
                                throw new NullPointerException("Null files");
                            }
                        } else if (strNextName2.equals("orgId")) {
                            strNextString = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (listD == null) {
                        throw new IllegalStateException("Missing required properties: files");
                    }
                    a0Var.f13249k = new g0(listD, strNextString);
                    continue;
                    break;
                    break;
                case "sdkVersion":
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null sdkVersion");
                    }
                    a0Var.f13239a = strNextString2;
                    break;
                    break;
                case "appQualitySessionId":
                    a0Var.f13245g = jsonReader.nextString();
                    break;
                case "appExitInfo":
                    a0Var.l = c(jsonReader);
                    break;
                case "buildVersion":
                    String strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        throw new NullPointerException("Null buildVersion");
                    }
                    a0Var.f13246h = strNextString3;
                    break;
                    break;
                case "firebaseAuthenticationToken":
                    a0Var.f13244f = jsonReader.nextString();
                    break;
                case "gmpAppId":
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        throw new NullPointerException("Null gmpAppId");
                    }
                    a0Var.f13240b = strNextString4;
                    break;
                    break;
                case "installationUuid":
                    String strNextString5 = jsonReader.nextString();
                    if (strNextString5 == null) {
                        throw new NullPointerException("Null installationUuid");
                    }
                    a0Var.f13242d = strNextString5;
                    break;
                    break;
                case "firebaseInstallationId":
                    a0Var.f13243e = jsonReader.nextString();
                    break;
                case "platform":
                    a0Var.f13241c = jsonReader.nextInt();
                    a0Var.m = (byte) (a0Var.m | 1);
                    break;
                case "displayVersion":
                    String strNextString6 = jsonReader.nextString();
                    if (strNextString6 == null) {
                        throw new NullPointerException("Null displayVersion");
                    }
                    a0Var.f13247i = strNextString6;
                    break;
                    break;
                case "session":
                    i0 i0Var = new i0();
                    i0Var.f13373f = false;
                    i0Var.m = (byte) (i0Var.m | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3) {
                            case "startedAt":
                                i0Var.f13371d = jsonReader.nextLong();
                                i0Var.m = (byte) (i0Var.m | 1);
                                break;
                            case "appQualitySessionId":
                                i0Var.f13370c = jsonReader.nextString();
                                break;
                            case "identifier":
                                i0Var.f13369b = new String(Base64.decode(jsonReader.nextString(), 2), n2.f13472a);
                                break;
                            case "endedAt":
                                i0Var.f13372e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "device":
                                m0 m0Var = new m0();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4) {
                                        case "simulator":
                                            m0Var.f13445f = jsonReader.nextBoolean();
                                            m0Var.f13449j = (byte) (m0Var.f13449j | 16);
                                            break;
                                        case "manufacturer":
                                            String strNextString7 = jsonReader.nextString();
                                            if (strNextString7 == null) {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                            m0Var.f13447h = strNextString7;
                                            break;
                                            break;
                                        case "ram":
                                            m0Var.f13443d = jsonReader.nextLong();
                                            m0Var.f13449j = (byte) (m0Var.f13449j | 4);
                                            break;
                                        case "arch":
                                            m0Var.f13440a = jsonReader.nextInt();
                                            m0Var.f13449j = (byte) (m0Var.f13449j | 1);
                                            break;
                                        case "diskSpace":
                                            m0Var.f13444e = jsonReader.nextLong();
                                            m0Var.f13449j = (byte) (m0Var.f13449j | 8);
                                            break;
                                        case "cores":
                                            m0Var.f13442c = jsonReader.nextInt();
                                            m0Var.f13449j = (byte) (m0Var.f13449j | 2);
                                            break;
                                        case "model":
                                            String strNextString8 = jsonReader.nextString();
                                            if (strNextString8 == null) {
                                                throw new NullPointerException("Null model");
                                            }
                                            m0Var.f13441b = strNextString8;
                                            break;
                                            break;
                                        case "state":
                                            m0Var.f13446g = jsonReader.nextInt();
                                            m0Var.f13449j = (byte) (m0Var.f13449j | 32);
                                            break;
                                        case "modelClass":
                                            String strNextString9 = jsonReader.nextString();
                                            if (strNextString9 == null) {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                            m0Var.f13448i = strNextString9;
                                            break;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                i0Var.f13377j = m0Var.a();
                                break;
                            case "events":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                i0Var.f13378k = Collections.unmodifiableList(arrayList);
                                break;
                            case "os":
                                h1 h1Var = new h1();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "buildVersion":
                                            String strNextString10 = jsonReader.nextString();
                                            if (strNextString10 == null) {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                            h1Var.f13355c = strNextString10;
                                            break;
                                            break;
                                        case "jailbroken":
                                            h1Var.f13356d = jsonReader.nextBoolean();
                                            h1Var.f13357e = (byte) (h1Var.f13357e | 2);
                                            break;
                                        case "version":
                                            String strNextString11 = jsonReader.nextString();
                                            if (strNextString11 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            h1Var.f13354b = strNextString11;
                                            break;
                                            break;
                                        case "platform":
                                            h1Var.f13353a = jsonReader.nextInt();
                                            h1Var.f13357e = (byte) (h1Var.f13357e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                i0Var.f13376i = h1Var.a();
                                break;
                            case "app":
                                jsonReader.beginObject();
                                String strNextString12 = null;
                                String strNextString13 = null;
                                String strNextString14 = null;
                                String strNextString15 = null;
                                String strNextString16 = null;
                                String strNextString17 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName6 = jsonReader.nextName();
                                    strNextName6.getClass();
                                    switch (strNextName6) {
                                        case "identifier":
                                            strNextString12 = jsonReader.nextString();
                                            if (strNextString12 == null) {
                                                throw new NullPointerException("Null identifier");
                                            }
                                            break;
                                            break;
                                        case "developmentPlatform":
                                            strNextString16 = jsonReader.nextString();
                                            break;
                                        case "developmentPlatformVersion":
                                            strNextString17 = jsonReader.nextString();
                                            break;
                                        case "version":
                                            strNextString13 = jsonReader.nextString();
                                            if (strNextString13 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            break;
                                            break;
                                        case "installationUuid":
                                            strNextString15 = jsonReader.nextString();
                                            break;
                                        case "displayVersion":
                                            strNextString14 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (strNextString12 != null && strNextString13 != null) {
                                    i0Var.f13374g = new k0(strNextString12, strNextString13, strNextString14, strNextString15, strNextString16, strNextString17);
                                    break;
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    if (strNextString12 == null) {
                                        sb2.append(" identifier");
                                    }
                                    if (strNextString13 == null) {
                                        sb2.append(" version");
                                    }
                                    throw new IllegalStateException(oi.k.j("Missing required properties:", sb2));
                                }
                                break;
                            case "user":
                                jsonReader.beginObject();
                                String strNextString18 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        strNextString18 = jsonReader.nextString();
                                        if (strNextString18 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (strNextString18 == null) {
                                    throw new IllegalStateException("Missing required properties: identifier");
                                }
                                i0Var.f13375h = new j1(strNextString18);
                                break;
                                break;
                            case "generator":
                                String strNextString19 = jsonReader.nextString();
                                if (strNextString19 == null) {
                                    throw new NullPointerException("Null generator");
                                }
                                i0Var.f13368a = strNextString19;
                                break;
                                break;
                            case "crashed":
                                i0Var.f13373f = jsonReader.nextBoolean();
                                i0Var.m = (byte) (i0Var.m | 2);
                                break;
                            case "generatorType":
                                i0Var.l = jsonReader.nextInt();
                                i0Var.m = (byte) (i0Var.m | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    a0Var.f13248j = i0Var.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a0Var.a();
    }

    public static b0 i(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                b0 b0VarH = h(jsonReader);
                jsonReader.close();
                return b0VarH;
            } catch (Throwable th2) {
                try {
                    jsonReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IllegalStateException e3) {
            throw new IOException(e3);
        }
    }
}
