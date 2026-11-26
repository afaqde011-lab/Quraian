package a30;

import android.util.Log;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.x5;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import sd.p1;
import wd.g0;
import wd.h0;
import wd.j0;

public final class k {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public k(i iVar, k20.g nameResolver, j10.k containingDeclaration, h9.f fVar, k20.j versionRequirementTable, k20.a metadataVersion, c30.k kVar, ui.b bVar, List typeParameters) {
        String strA;
        kotlin.jvm.internal.m.e(nameResolver, "nameResolver");
        kotlin.jvm.internal.m.e(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.m.e(versionRequirementTable, "versionRequirementTable");
        kotlin.jvm.internal.m.e(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.m.e(typeParameters, "typeParameters");
        this.a = iVar;
        this.b = nameResolver;
        this.c = containingDeclaration;
        this.d = fVar;
        this.e = versionRequirementTable;
        this.f = metadataVersion;
        this.g = kVar;
        this.h = new ui.b(this, bVar, typeParameters, "Deserializer for \"" + containingDeclaration.getName() + '\"', (kVar == null || (strA = kVar.a()) == null) ? "[container not found]" : strA);
        this.i = new u(this);
    }

    public static void f(JSONObject jSONObject, String str) {
        StringBuilder sbQ = x5.q(str);
        sbQ.append(jSONObject.toString());
        String string = sbQ.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", string, null);
        }
    }

    public k a(j10.k kVar, List typeParameterProtos, k20.g nameResolver, h9.f fVar, k20.j versionRequirementTable, k20.a metadataVersion) {
        kotlin.jvm.internal.m.e(typeParameterProtos, "typeParameterProtos");
        kotlin.jvm.internal.m.e(nameResolver, "nameResolver");
        kotlin.jvm.internal.m.e(versionRequirementTable, "versionRequirementTable");
        kotlin.jvm.internal.m.e(metadataVersion, "metadataVersion");
        i iVar = (i) this.a;
        int i = metadataVersion.b;
        return new k(iVar, nameResolver, kVar, fVar, ((i != 1 || metadataVersion.c < 4) && i <= 1) ? (k20.j) this.e : versionRequirementTable, metadataVersion, (c30.k) this.g, (ui.b) this.h, typeParameterProtos);
    }

    public wi.a c(int i) {
        wi.a aVar = null;
        try {
            if (!e4.f.a(2, i)) {
                JSONObject jSONObjectR = ((o9.q) this.e).R();
                if (jSONObjectR != null) {
                    wi.a aVarB = ((wi.b) this.c).b(jSONObjectR);
                    f(jSONObjectR, "Loaded cached settings: ");
                    ((hb.f) this.d).getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (e4.f.a(3, i) || aVarB.c >= jCurrentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return aVarB;
                        } catch (Exception e) {
                            e = e;
                            aVar = aVarB;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return aVar;
                        }
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public wi.a d() {
        return (wi.a) ((AtomicReference) this.h).get();
    }

    public void e(xd.i iVar, int i) {
        byte[] bArr;
        long j;
        yd.a aVar;
        String str;
        int i2;
        com.google.crypto.tink.shaded.protobuf.d dVarI;
        String str2;
        Integer numValueOf;
        Iterator it;
        k kVar;
        long jMax;
        k kVar2 = this;
        xd.i iVar2 = iVar;
        byte[] bArr2 = iVar2.b;
        ee.h hVar = (fe.b) kVar2.f;
        vd.b bVarA = ((yd.d) kVar2.b).a(iVar2.a);
        long j2 = 0;
        while (true) {
            ee.h hVar2 = hVar;
            if (!((Boolean) hVar2.x(new de.e(kVar2, iVar2, 0))).booleanValue()) {
                hVar2.x(new de.g(kVar2, iVar2, j2));
                return;
            }
            Iterable iterable = (Iterable) hVar2.x(new de.e(kVar2, iVar2, 1));
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (bVarA == null) {
                g4.y(iVar2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                aVar = new yd.a(3, -1L);
                bArr = bArr2;
                j = j2;
            } else {
                ArrayList<xd.h> arrayList = new ArrayList();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((ee.b) it2.next()).c);
                }
                if (bArr2 != null) {
                    ee.c cVar = (ee.c) kVar2.i;
                    Objects.requireNonNull(cVar);
                    ae.a aVar2 = (ae.a) hVar2.x(new ab.r(cVar, 4));
                    a1.n nVar = new a1.n();
                    nVar.G = new HashMap();
                    nVar.E = Long.valueOf(((ge.a) kVar2.g).h());
                    nVar.F = Long.valueOf(((ge.a) kVar2.h).h());
                    nVar.B = "GDT_CLIENT_METRICS";
                    ud.c cVar2 = new ud.c("proto");
                    aVar2.getClass();
                    a1.i iVar3 = xd.n.a;
                    iVar3.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        iVar3.m(aVar2, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    nVar.D = new xd.l(cVar2, byteArrayOutputStream.toByteArray());
                    arrayList.add(bVarA.a(nVar.f()));
                }
                vd.b bVar = bVarA;
                HashMap map = new HashMap();
                for (xd.h hVar3 : arrayList) {
                    String str3 = hVar3.a;
                    if (map.containsKey(str3)) {
                        ((List) map.get(str3)).add(hVar3);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(hVar3);
                        map.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = map.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    xd.h hVar4 = (xd.h) ((List) entry.getValue()).get(0);
                    j0 j0Var = j0.A;
                    long jH = bVar.f.h();
                    long jH2 = bVar.e.h();
                    wd.n nVar2 = new wd.n(new wd.l(Integer.valueOf(hVar4.b("sdk-version")), hVar4.a("model"), hVar4.a("hardware"), hVar4.a("device"), hVar4.a("product"), hVar4.a("os-uild"), hVar4.a("manufacturer"), hVar4.a("fingerprint"), hVar4.a("locale"), hVar4.a("country"), hVar4.a("mcc_mnc"), hVar4.a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (xd.h hVar5 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        xd.l lVar = hVar5.c;
                        long j3 = j2;
                        byte[] bArr4 = hVar5.j;
                        ud.c cVar3 = lVar.a;
                        byte[] bArr5 = lVar.b;
                        if (cVar3.equals(new ud.c("proto"))) {
                            kVar = new k();
                            kVar.e = bArr5;
                            it = it3;
                        } else {
                            it = it3;
                            if (cVar3.equals(new ud.c("json"))) {
                                String str4 = new String(bArr5, Charset.forName("UTF-8"));
                                k kVar3 = new k();
                                kVar3.f = str4;
                                kVar = kVar3;
                            } else {
                                String strConcat = "TRuntime.".concat("CctTransportBackend");
                                if (Log.isLoggable(strConcat, 5)) {
                                    Log.w(strConcat, "Received event of unsupported encoding " + cVar3 + ". Skipping...");
                                }
                            }
                            bArr2 = bArr3;
                            j2 = j3;
                            it3 = it;
                        }
                        kVar.a = Long.valueOf(hVar5.d);
                        kVar.d = Long.valueOf(hVar5.e);
                        String str5 = (String) hVar5.f.get("tz-offset");
                        kVar.g = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        kVar.h = new wd.v((h0) h0.A.get(hVar5.b("net-type")), (g0) g0.A.get(hVar5.b("mobile-subtype")));
                        Integer num = hVar5.b;
                        if (num != null) {
                            kVar.b = num;
                        }
                        Integer num2 = hVar5.g;
                        if (num2 != null) {
                            wd.r rVar = new wd.r(new wd.q(num2));
                            wd.z zVar = wd.z.A;
                            kVar.c = new wd.o(rVar);
                        }
                        byte[] bArr6 = hVar5.i;
                        if (bArr6 != null || bArr4 != null) {
                            if (bArr6 == null) {
                                bArr6 = null;
                            }
                            kVar.i = new wd.p(bArr6, bArr4 != null ? bArr4 : null);
                        }
                        String strJ = ((Long) kVar.a) == null ? " eventTimeMs" : "";
                        if (((Long) kVar.d) == null) {
                            strJ = strJ.concat(" eventUptimeMs");
                        }
                        if (((Long) kVar.g) == null) {
                            strJ = w.c.j(strJ, " timezoneOffsetSeconds");
                        }
                        if (!strJ.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strJ));
                        }
                        arrayList4.add(new wd.s(((Long) kVar.a).longValue(), (Integer) kVar.b, (wd.o) kVar.c, ((Long) kVar.d).longValue(), (byte[]) kVar.e, (String) kVar.f, ((Long) kVar.g).longValue(), (wd.v) kVar.h, (wd.p) kVar.i));
                        bArr2 = bArr3;
                        j2 = j3;
                        it3 = it;
                    }
                    arrayList3.add(new wd.t(jH, jH2, nVar2, numValueOf, str2, arrayList4));
                    bArr2 = bArr2;
                }
                bArr = bArr2;
                j = j2;
                wd.m mVar = new wd.m(arrayList3);
                URL urlB = bVar.d;
                if (bArr != null) {
                    try {
                        vd.a aVarA = vd.a.a(bArr);
                        str = aVarA.b;
                        if (str == null) {
                            str = null;
                        }
                        String str6 = aVarA.a;
                        if (str6 != null) {
                            urlB = vd.b.b(str6);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new yd.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    p1 p1Var = new p1(urlB, mVar, str, 17);
                    k7.t tVar = new k7.t(bVar, 25);
                    int i3 = 5;
                    do {
                        dVarI = tVar.i(p1Var);
                        URL url = (URL) dVarI.c;
                        if (url != null) {
                            g4.y(url, "CctTransportBackend", "Following redirect to: %s");
                            p1Var = new p1(url, (wd.m) p1Var.C, (String) p1Var.D, 17);
                        } else {
                            p1Var = null;
                        }
                        if (p1Var == null) {
                            break;
                        } else {
                            i3--;
                        }
                    } while (i3 >= 1);
                    int i4 = dVarI.a;
                    if (i4 == 200) {
                        aVar = new yd.a(1, dVarI.b);
                    } else if (i4 >= 500 || i4 == 404) {
                        aVar = new yd.a(2, -1L);
                    } else if (i4 == 400) {
                        try {
                            aVar = new yd.a(4, -1L);
                        } catch (IOException e) {
                            e = e;
                            g4.E("CctTransportBackend", "Could not make request to the backend", e);
                            i2 = 2;
                            aVar = new yd.a(2, -1L);
                        }
                    } else {
                        aVar = new yd.a(3, -1L);
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
            i2 = 2;
            int i5 = aVar.a;
            if (i5 == i2) {
                hVar2.x(new de.f(this, iterable, iVar, j));
                ((a1.i) this.d).x(iVar, i + 1, true);
                return;
            }
            long j4 = j;
            hVar2.x(new ak.a(this, iterable, i2));
            if (i5 == 1) {
                jMax = Math.max(j4, aVar.b);
                if (bArr != null) {
                    hVar2.x(new ab.r(this, 6));
                }
            } else {
                if (i5 == 4) {
                    HashMap map2 = new HashMap();
                    Iterator it4 = iterable.iterator();
                    while (it4.hasNext()) {
                        String str7 = ((ee.b) it4.next()).c.a;
                        if (map2.containsKey(str7)) {
                            map2.put(str7, Integer.valueOf(((Integer) map2.get(str7)).intValue() + 1));
                        } else {
                            map2.put(str7, 1);
                        }
                    }
                    hVar2.x(new ak.a(this, map2, 3));
                }
                jMax = j4;
            }
            kVar2 = this;
            iVar2 = iVar;
            j2 = jMax;
            bArr2 = bArr;
        }
    }
}
