package ad;

import a10.h0;
import a40.v;
import a40.z;
import ab.a0;
import android.content.SharedPreferences;
import g00.b0;
import g1.b5;
import h00.n;
import h00.r;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.m;
import ld.h;
import ld.l;
import oj.q;
import org.json.JSONException;
import org.json.JSONObject;
import ri.t1;

public final class f implements fd.d {

    public final cd.b f444a;

    public final SharedPreferences f445b;

    public final h f446c;

    public final LinkedHashMap f447d;

    public f(String str, cd.b bVar, SharedPreferences sharedPreferences, File file, h7.b bVar2) {
        m.e(str, "storageKey");
        m.e(bVar, "logger");
        m.e(bVar2, "diagnostics");
        this.f444a = bVar;
        this.f445b = sharedPreferences;
        this.f446c = new h(file, str, new bd.d(sharedPreferences), bVar, bVar2);
        this.f447d = new LinkedHashMap();
    }

    @Override
    public final l a(b5 b5Var, rc.g gVar, z zVar, v vVar) {
        m.e(zVar, "scope");
        return new l(this, b5Var, gVar, zVar, vVar, this.f444a);
    }

    @Override
    public final List b() {
        h hVar = this.f446c;
        File[] fileArrListFiles = hVar.f10266a.listFiles(new ld.b(hVar, 0));
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        List listS0 = n.S0(fileArrListFiles, new ay.b(hVar, 5));
        ArrayList arrayList = new ArrayList(r.q0(listS0, 10));
        Iterator it = listS0.iterator();
        while (it.hasNext()) {
            arrayList.add(((File) it.next()).getAbsolutePath());
        }
        return arrayList;
    }

    @Override
    public final Object c(m00.c cVar) {
        Object objH = this.f446c.h(cVar);
        return objH == l00.a.A ? objH : b0.a;
    }

    @Override
    public final Object d(Object obj, k00.c cVar) {
        m.c(obj, "null cannot be cast to non-null type kotlin.String");
        return this.f446c.d((String) obj, (m00.c) cVar);
    }

    @Override
    public final String e(fd.c cVar) {
        m.e(cVar, "key");
        return this.f445b.getString(cVar.A, null);
    }

    @Override
    public final void f(fd.c cVar, String str) {
        SharedPreferences.Editor editorEdit = this.f445b.edit();
        editorEdit.putString(cVar.A, str);
        editorEdit.apply();
    }

    @Override
    public final Object g(gd.a aVar, m00.c cVar) throws JSONException {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i10 = eVar.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.E = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object obj = eVar.C;
        l00.a aVar2 = l00.a.A;
        int i11 = eVar.E;
        if (i11 == 0) {
            t1.O(obj);
            m.e(aVar, "event");
            m.e(aVar, "event");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event_type", aVar.a());
            String str = aVar.f6289a;
            if (str != null) {
                jSONObject.put("user_id", str);
            }
            String str2 = aVar.f6290b;
            if (str2 != null) {
                jSONObject.put("device_id", str2);
            }
            Long l = aVar.f6291c;
            if (l != null) {
                jSONObject.put("time", l);
            }
            jSONObject.put("event_properties", a0.G0(h0.S(aVar.N)));
            jSONObject.put("user_properties", a0.G0(h0.S(aVar.O)));
            jSONObject.put("groups", a0.G0(h0.S(aVar.P)));
            jSONObject.put("group_properties", a0.G0(h0.S(aVar.Q)));
            String str3 = aVar.f6297i;
            if (str3 != null) {
                jSONObject.put("app_version", str3);
            }
            String str4 = aVar.f6299k;
            if (str4 != null) {
                jSONObject.put("platform", str4);
            }
            String str5 = aVar.l;
            if (str5 != null) {
                jSONObject.put("os_name", str5);
            }
            String str6 = aVar.m;
            if (str6 != null) {
                jSONObject.put("os_version", str6);
            }
            String str7 = aVar.f6300n;
            if (str7 != null) {
                jSONObject.put("device_brand", str7);
            }
            String str8 = aVar.f6301o;
            if (str8 != null) {
                jSONObject.put("device_manufacturer", str8);
            }
            String str9 = aVar.f6302p;
            if (str9 != null) {
                jSONObject.put("device_model", str9);
            }
            String str10 = aVar.f6303q;
            if (str10 != null) {
                jSONObject.put("carrier", str10);
            }
            String str11 = aVar.f6304r;
            if (str11 != null) {
                jSONObject.put("country", str11);
            }
            String str12 = aVar.f6305s;
            if (str12 != null) {
                jSONObject.put("region", str12);
            }
            String str13 = aVar.f6306t;
            if (str13 != null) {
                jSONObject.put("city", str13);
            }
            String str14 = aVar.f6307u;
            if (str14 != null) {
                jSONObject.put("dma", str14);
            }
            String str15 = aVar.A;
            if (str15 != null) {
                jSONObject.put("language", str15);
            }
            Double d3 = aVar.G;
            if (d3 != null) {
                jSONObject.put("price", d3);
            }
            Integer num = aVar.H;
            if (num != null) {
                jSONObject.put("quantity", num);
            }
            Double d5 = aVar.F;
            if (d5 != null) {
                jSONObject.put("revenue", d5);
            }
            String str16 = aVar.I;
            if (str16 != null) {
                jSONObject.put("productId", str16);
            }
            String str17 = aVar.J;
            if (str17 != null) {
                jSONObject.put("revenueType", str17);
            }
            Double d10 = aVar.f6295g;
            if (d10 != null) {
                jSONObject.put("location_lat", d10);
            }
            Double d11 = aVar.f6296h;
            if (d11 != null) {
                jSONObject.put("location_lng", d11);
            }
            String str18 = aVar.C;
            if (str18 != null) {
                jSONObject.put("ip", str18);
            }
            String str19 = aVar.f6298j;
            if (str19 != null) {
                jSONObject.put("version_name", str19);
            }
            String str20 = aVar.f6308v;
            if (str20 != null) {
                jSONObject.put("idfa", str20);
            }
            String str21 = aVar.f6309w;
            if (str21 != null) {
                jSONObject.put("idfv", str21);
            }
            String str22 = aVar.f6310x;
            if (str22 != null) {
                jSONObject.put("adid", str22);
            }
            String str23 = aVar.f6312z;
            if (str23 != null) {
                jSONObject.put("android_id", str23);
            }
            Long l10 = aVar.f6292d;
            if (l10 != null) {
                jSONObject.put("event_id", l10);
            }
            Long l11 = aVar.f6293e;
            if (l11 != null) {
                jSONObject.put("session_id", l11);
            }
            String str24 = aVar.f6294f;
            if (str24 != null) {
                jSONObject.put("insert_id", str24);
            }
            String str25 = aVar.B;
            if (str25 != null) {
                jSONObject.put("library", str25);
            }
            String str26 = aVar.K;
            if (str26 != null) {
                jSONObject.put("partner_id", str26);
            }
            String str27 = aVar.f6311y;
            if (str27 != null) {
                jSONObject.put("android_app_set_id", str27);
            }
            q qVar = aVar.D;
            if (qVar != null) {
                String str28 = (String) qVar.E;
                String str29 = (String) qVar.D;
                String str30 = (String) qVar.C;
                String str31 = (String) qVar.B;
                JSONObject jSONObject2 = new JSONObject();
                if (str31 != null) {
                    try {
                        if (str31.length() != 0) {
                            jSONObject2.put("branch", str31);
                        }
                        if (str30 != null && str30.length() != 0) {
                            jSONObject2.put("source", str30);
                        }
                        if (str29 != null && str29.length() != 0) {
                            jSONObject2.put("version", str29);
                        }
                        if (str28 != null && str28.length() != 0) {
                            jSONObject2.put("versionId", str28);
                        }
                    } catch (JSONException unused) {
                        ed.a.f5355b.a("JSON Serialization of tacking plan object failed");
                    }
                } else {
                    if (str30 != null) {
                        jSONObject2.put("source", str30);
                    }
                    if (str29 != null) {
                        jSONObject2.put("version", str29);
                    }
                    if (str28 != null) {
                        jSONObject2.put("versionId", str28);
                    }
                }
                jSONObject.put("plan", jSONObject2);
            }
            gd.d dVar = aVar.E;
            if (dVar != null) {
                String str32 = dVar.f6315c;
                String str33 = dVar.f6314b;
                JSONObject jSONObject3 = new JSONObject();
                if (str33 != null) {
                    try {
                        if (str33.length() != 0) {
                            jSONObject3.put("source_name", str33);
                        }
                        if (str32 != null && str32.length() != 0) {
                            jSONObject3.put("source_version", str32);
                        }
                    } catch (JSONException unused2) {
                        ed.a.f5355b.a("JSON Serialization of ingestion metadata object failed");
                    }
                } else if (str32 != null) {
                    jSONObject3.put("source_version", str32);
                }
                jSONObject.put("ingestion_metadata", jSONObject3);
            }
            String string = jSONObject.toString();
            m.d(string, "toString(...)");
            eVar.A = this;
            eVar.B = aVar;
            eVar.E = 1;
            if (this.f446c.i(string, eVar) == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = eVar.B;
            t1.O(obj);
        }
        aVar.getClass();
        return b0.a;
    }

    public final void h(String str) {
        m.e(str, "filePath");
        h hVar = this.f446c;
        hVar.getClass();
        hVar.f10273h.remove(str);
    }

    public final void i(String str) {
        m.e(str, "filePath");
        this.f446c.f(str);
    }
}
