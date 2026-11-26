package p10;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.lifecycle.a1;
import androidx.lifecycle.c1;
import androidx.lifecycle.e1;
import androidx.lifecycle.u0;
import androidx.lifecycle.x0;
import androidx.media3.common.q0;
import bt.y1;
import com.google.android.gms.internal.measurement.f4;
import com.google.android.gms.internal.measurement.m8;
import com.mchutov.core.compose.widgets.lce.ResourceText;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import java.io.InterruptedIOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ri.t1;
import s10.n0;
import s10.s0;
import tf.h1;
import tf.w0;
import x.v1;

public final class a implements s0, yj.b, v1 {
    public Object A;
    public Object B;
    public Object C;
    public Object D;

    public a(int i) {
        switch (i) {
            case 3:
                this.A = new ArrayList();
                this.B = new ArrayList();
                this.C = new ArrayList(0);
                u10.l.a.getClass();
                List listA = u10.k.a();
                ArrayList arrayList = new ArrayList(h00.r.q0(listA, 10));
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    ((w10.d) ((u10.l) it.next())).getClass();
                    arrayList.add(new w10.e());
                }
                this.D = arrayList;
                break;
            case 9:
                this.A = new u.e(0);
                this.B = new SparseArray();
                this.C = new u.q((Object) null);
                this.D = new u.e(0);
                break;
            case 11:
                this.A = new HashMap();
                this.B = new HashMap();
                this.C = new HashMap();
                this.D = new HashMap();
                break;
            case 20:
                this.B = new ArrayDeque();
                this.C = new ArrayDeque();
                this.D = new ArrayDeque();
                break;
            default:
                this.A = new ReentrantReadWriteLock(true);
                this.B = new qc.b((String) null, (String) null, 7);
                this.C = new Object();
                this.D = new LinkedHashSet();
                break;
        }
    }

    public a(Typeface typeface, w5.b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        this.D = typeface;
        this.A = bVar;
        this.C = new v5.o(1024);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i5 = iA + bVar.A;
            i = ((ByteBuffer) bVar.D).getInt(((ByteBuffer) bVar.D).getInt(i5) + i5);
        } else {
            i = 0;
        }
        this.B = new char[i * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i6 = iA2 + bVar.A;
            i2 = ((ByteBuffer) bVar.D).getInt(((ByteBuffer) bVar.D).getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        for (int i7 = 0; i7 < i2; i7++) {
            v5.r rVar = new v5.r(this, i7);
            w5.a aVarB = rVar.b();
            int iA3 = aVarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarB.D).getInt(iA3 + aVarB.A) : 0, (char[]) this.B, i7 * 2);
            w5.a aVarB2 = rVar.b();
            int iA4 = aVarB2.a(16);
            if (iA4 != 0) {
                int i8 = iA4 + aVarB2.A;
                i3 = ((ByteBuffer) aVarB2.D).getInt(((ByteBuffer) aVarB2.D).getInt(i8) + i8);
            } else {
                i3 = 0;
            }
            rd.a.g("invalid metadata codepoint length", i3 > 0);
            v5.o oVar = (v5.o) this.C;
            w5.a aVarB3 = rVar.b();
            int iA5 = aVarB3.a(16);
            if (iA5 != 0) {
                int i9 = iA5 + aVarB3.A;
                i4 = ((ByteBuffer) aVarB3.D).getInt(((ByteBuffer) aVarB3.D).getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            oVar.a(rVar, 0, i4 - 1);
        }
    }

    public a(e1 store, c1 factory, t6.b defaultExtras) {
        kotlin.jvm.internal.m.e(store, "store");
        kotlin.jvm.internal.m.e(factory, "factory");
        kotlin.jvm.internal.m.e(defaultExtras, "defaultExtras");
        this.A = store;
        this.B = factory;
        this.C = defaultExtras;
        this.D = new tf.y(14);
    }

    public a(Object obj, Object obj2, Object obj3, Object obj4) {
        this.A = obj;
        this.B = obj2;
        this.C = obj3;
        this.D = obj4;
    }

    public a(kotlin.jvm.internal.p pVar, k20.d protoSet, n00.a entries, ArrayList arrayList) {
        kotlin.jvm.internal.m.e(protoSet, "protoSet");
        kotlin.jvm.internal.m.e(entries, "entries");
        this.A = pVar;
        this.B = protoSet;
        this.C = entries;
        this.D = arrayList;
    }

    public a(w0 w0Var, String str) {
        this.D = w0Var;
        com.google.android.gms.common.internal.d0.e(str);
        this.A = str;
        this.B = new Bundle();
    }

    public a(th.s sVar) {
        this.A = new HashMap(sVar.a);
        this.B = new HashMap(sVar.b);
        this.C = new HashMap(sVar.c);
        this.D = new HashMap(sVar.d);
    }

    public a(x.p pVar) {
        this.A = pVar;
    }

    public a(x.z zVar) {
        this((x.p) new wi.b(zVar, 4));
    }

    public void A(n0 n0Var, a10.w property, Enum value) {
        kotlin.jvm.internal.m.e(property, "property");
        kotlin.jvm.internal.m.e(value, "value");
        kotlin.jvm.internal.p pVar = (kotlin.jvm.internal.p) this.A;
        t10.h hVar = (t10.h) ((ArrayList) this.D).get(value.ordinal());
        int iIntValue = ((Number) pVar.get(n0Var)).intValue();
        int i = (1 << hVar.b) - 1;
        int i2 = hVar.a;
        pVar.p(n0Var, Integer.valueOf((iIntValue & (~(i << i2))) + (hVar.c << i2)));
    }

    public Serializable B(m00.c cVar) {
        sv.s sVar;
        String strJ;
        int i;
        b00.c cVar2 = (b00.c) this.C;
        dh.o oVar = (dh.o) this.B;
        if (cVar instanceof sv.s) {
            sVar = (sv.s) cVar;
            int i2 = sVar.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sVar.C = i2 - Integer.MIN_VALUE;
            } else {
                sVar = new sv.s(this, cVar);
            }
        } else {
            sVar = new sv.s(this, cVar);
        }
        Object obj = sVar.A;
        l00.a aVar = l00.a.A;
        int i3 = sVar.C;
        if (i3 == 0) {
            t1.O(obj);
            sVar.C = 1;
            if (cVar2.a(sVar) == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
        }
        String strK = oVar.k(2131886227);
        zz.a aVar2 = (zz.a) cVar2.h.getValue();
        String str = aVar2 != null ? aVar2.a : null;
        u30.b<zz.a> bVar = (u30.b) cVar2.d.getValue();
        String strK2 = oVar.k(2131887280);
        if (str == null) {
            strK2 = strK2.concat("\u2003✔");
        }
        String str2 = strK2;
        String strB = oVar.b((String) null, 2131231346, (String) null);
        qv.a aVar3 = qv.a.A;
        q0 q0VarJ = dh.o.j(oVar, "fx_off", str2, "", strB, strK);
        ArrayList arrayList = new ArrayList(h00.r.q0(bVar, 10));
        for (zz.a aVar4 : bVar) {
            String str3 = aVar4.a;
            String strO = a1.b.o("fx/", str3);
            ResourceText resourceText = aVar4.d;
            if (resourceText != null) {
                Resources resources = oVar.A.getResources();
                kotlin.jvm.internal.m.d(resources, "getResources(...)");
                strJ = com.mchutov.core.compose.widgets.lce.a.a(resourceText, resources);
            } else {
                strJ = null;
            }
            if (strJ == null) {
                strJ = str3;
            } else {
                if (r30.k.L0(strJ)) {
                    strJ = null;
                }
                if (strJ == null) {
                    strJ = str3;
                }
            }
            if (kotlin.jvm.internal.m.a(str, str3)) {
                strJ = w.c.j(strJ, "\u2003✔");
            }
            String str4 = aVar4.e;
            switch (str3.hashCode()) {
                case -1062863507:
                    if (str3.equals("bird_singing")) {
                        i = 2131231080;
                    } else {
                        i = 2131231421;
                    }
                    break;
                case -1017500300:
                    if (str3.equals("calm_rain")) {
                        i = 2131231107;
                    } else {
                        i = 2131231421;
                    }
                    break;
                case -1017343512:
                    if (str3.equals("calm_wind")) {
                        i = 2131231430;
                    } else {
                        i = 2131231421;
                    }
                    break;
                case 617872791:
                    if (str3.equals("calm_bonfire")) {
                        i = 2131231132;
                    } else {
                        i = 2131231421;
                    }
                    break;
                case 1830521239:
                    str3.equals("wave_effect");
                    i = 2131231421;
                    break;
                default:
                    i = 2131231421;
                    break;
            }
            String strB2 = oVar.b(str3, i, str4);
            qv.a aVar5 = qv.a.A;
            arrayList.add(dh.o.j(oVar, strO, strJ, "", strB2, strK));
        }
        i00.b bVarS = va.a.s();
        bVarS.add(q0VarJ);
        bVarS.addAll(arrayList);
        return va.a.k(bVarS);
    }

    public void C(v2.k kVar) {
        if (((v2.w) this.B) == v2.w.B) {
            z2.a0 a0Var = (z2.a0) this.A;
            if (a0Var == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            v2.r.i(kVar, a0Var.d0(0L), new v2.x((v2.y) this.D, 1), true);
        }
        this.B = v2.w.C;
    }

    public Serializable D(m00.c cVar) {
        sv.o oVar;
        String string;
        if (cVar instanceof sv.o) {
            oVar = (sv.o) cVar;
            int i = oVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                oVar.C = i - Integer.MIN_VALUE;
            } else {
                oVar = new sv.o(this, cVar);
            }
        } else {
            oVar = new sv.o(this, cVar);
        }
        Object objD = oVar.A;
        l00.a aVar = l00.a.A;
        int i2 = oVar.C;
        if (i2 == 0) {
            t1.O(objD);
            rv.i iVar = (rv.i) this.B;
            oVar.C = 1;
            objD = iVar.d(oVar);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objD);
        }
        Iterable<PlayerItem> iterable = (Iterable) objD;
        ArrayList arrayList = new ArrayList(h00.r.q0(iterable, 10));
        for (PlayerItem playerItem : iterable) {
            if (playerItem.getCollectionId() == null) {
                string = kh.o.Q(playerItem.getReciterId(), playerItem.getSurahNumber());
            } else {
                int iIntValue = playerItem.getCollectionId().intValue();
                int reciterId = playerItem.getReciterId();
                int surahNumber = playerItem.getSurahNumber();
                StringBuilder sbP = oi.k.p(iIntValue, reciterId, "pltt/", "/", "/");
                sbP.append(surahNumber);
                string = sbP.toString();
            }
            arrayList.add(dh.o.m((dh.o) this.D, string, playerItem.getSurahTranscription(), playerItem.getReciterName()));
        }
        return arrayList;
    }

    public java.io.Serializable E(m00.c r18) {
        throw new UnsupportedOperationException("Method not decompiled: p10.a.E(m00.c):java.io.Serializable");
    }

    public Bundle F() {
        w0 w0Var = (w0) this.D;
        if (((Bundle) this.C) == null) {
            String str = (String) this.A;
            SharedPreferences sharedPreferencesZ0 = w0Var.Z0();
            h1 h1Var = (h1) ((f5.c) w0Var).B;
            String string = sharedPreferencesZ0.getString(str, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                m8.a();
                                                if (h1Var.D.f1((String) null, tf.b0.Q0)) {
                                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                    int length = jSONArray2.length();
                                                    long[] jArr = new long[length];
                                                    for (int i2 = 0; i2 < length; i2++) {
                                                        jArr[i2] = jSONArray2.optLong(i2);
                                                    }
                                                    bundle.putLongArray(string2, jArr);
                                                }
                                            } else {
                                                tf.q0 q0Var = h1Var.F;
                                                h1.g(q0Var);
                                                q0Var.G.c(string3, "Unrecognized persisted bundle type. Type");
                                            }
                                        } else if (string3.equals("ia")) {
                                            m8.a();
                                            if (h1Var.D.f1((String) null, tf.b0.Q0)) {
                                                JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                                int length2 = jSONArray3.length();
                                                int[] iArr = new int[length2];
                                                for (int i3 = 0; i3 < length2; i3++) {
                                                    iArr[i3] = jSONArray3.optInt(i3);
                                                }
                                                bundle.putIntArray(string2, iArr);
                                            }
                                        } else {
                                            tf.q0 q0Var2 = h1Var.F;
                                            h1.g(q0Var2);
                                            q0Var2.G.c(string3, "Unrecognized persisted bundle type. Type");
                                        }
                                    } else if (string3.equals("s")) {
                                        bundle.putString(string2, jSONObject.getString("v"));
                                    } else {
                                        tf.q0 q0Var3 = h1Var.F;
                                        h1.g(q0Var3);
                                        q0Var3.G.c(string3, "Unrecognized persisted bundle type. Type");
                                    }
                                } else if (string3.equals("l")) {
                                    bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                } else {
                                    tf.q0 q0Var4 = h1Var.F;
                                    h1.g(q0Var4);
                                    q0Var4.G.c(string3, "Unrecognized persisted bundle type. Type");
                                }
                            } else if (string3.equals("d")) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else {
                                tf.q0 q0Var5 = h1Var.F;
                                h1.g(q0Var5);
                                q0Var5.G.c(string3, "Unrecognized persisted bundle type. Type");
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            tf.q0 q0Var6 = h1Var.F;
                            h1.g(q0Var6);
                            q0Var6.G.b("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.C = bundle;
                } catch (JSONException unused2) {
                    tf.q0 q0Var7 = h1Var.F;
                    h1.g(q0Var7);
                    q0Var7.G.b("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.C) == null) {
                this.C = (Bundle) this.B;
            }
        }
        Bundle bundle2 = (Bundle) this.C;
        com.google.android.gms.common.internal.d0.h(bundle2);
        return new Bundle(bundle2);
    }

    public void G(Bundle bundle) {
        String str = (String) this.A;
        w0 w0Var = (w0) this.D;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences sharedPreferencesZ0 = w0Var.Z0();
        h1 h1Var = (h1) ((f5.c) w0Var).B;
        SharedPreferences.Editor editorEdit = sharedPreferencesZ0.edit();
        if (bundle2.size() == 0) {
            editorEdit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        m8.a();
                        if (h1Var.D.f1((String) null, tf.b0.Q0)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                tf.q0 q0Var = h1Var.F;
                                h1.g(q0Var);
                                q0Var.G.c(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                tf.q0 q0Var2 = h1Var.F;
                                h1.g(q0Var2);
                                q0Var2.G.c(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e) {
                        tf.q0 q0Var3 = h1Var.F;
                        h1.g(q0Var3);
                        q0Var3.G.c(e, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.C = bundle2;
    }

    public long b(x.o oVar, x.o oVar2, x.o oVar3) {
        int iB = oVar.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = Math.max(jMax, ((x.p) this.A).get(i).b(oVar.a(i), oVar2.a(i), oVar3.a(i)));
        }
        return jMax;
    }

    public x.o c(long j, x.o oVar, x.o oVar2, x.o oVar3) {
        if (((x.o) this.C) == null) {
            this.C = oVar3.c();
        }
        x.o oVar4 = (x.o) this.C;
        if (oVar4 == null) {
            kotlin.jvm.internal.m.k("velocityVector");
            throw null;
        }
        int iB = oVar4.b();
        for (int i = 0; i < iB; i++) {
            x.o oVar5 = (x.o) this.C;
            if (oVar5 == null) {
                kotlin.jvm.internal.m.k("velocityVector");
                throw null;
            }
            oVar5.e(((x.p) this.A).get(i).c(oVar.a(i), oVar2.a(i), oVar3.a(i), j), i);
        }
        x.o oVar6 = (x.o) this.C;
        if (oVar6 != null) {
            return oVar6;
        }
        kotlin.jvm.internal.m.k("velocityVector");
        throw null;
    }

    @Override
    public ArrayList d() {
        return (ArrayList) this.B;
    }

    @Override
    public ArrayList e() {
        return (ArrayList) this.A;
    }

    @Override
    public ArrayList f() {
        return (ArrayList) this.C;
    }

    public java.lang.Object g(java.lang.String r9, m00.c r10) {
        throw new UnsupportedOperationException("Method not decompiled: p10.a.g(java.lang.String, m00.c):java.lang.Object");
    }

    public Object get() {
        return new wj.o((bi.g) ((nf.c) this.A).A, (zj.j) ((f00.a) this.B).get(), (k00.i) ((f00.a) this.C).get(), (wj.s0) ((yj.c) this.D).get());
    }

    public uh.j h() throws GeneralSecurityException {
        Integer num = (Integer) this.A;
        if (num == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (((Integer) this.B) == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (((uh.c) this.C) == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (((uh.c) this.D) == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        if (num.intValue() < 16) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", (Integer) this.A));
        }
        Integer num2 = (Integer) this.B;
        int iIntValue = num2.intValue();
        uh.c cVar = (uh.c) this.C;
        if (iIntValue < 10) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", num2));
        }
        if (cVar == uh.c.g) {
            if (iIntValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num2));
            }
        } else if (cVar == uh.c.h) {
            if (iIntValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num2));
            }
        } else if (cVar == uh.c.i) {
            if (iIntValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num2));
            }
        } else if (cVar == uh.c.j) {
            if (iIntValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num2));
            }
        } else {
            if (cVar != uh.c.k) {
                throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
            }
            if (iIntValue > 64) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", num2));
            }
        }
        return new uh.j(((Integer) this.A).intValue(), ((Integer) this.B).intValue(), (uh.c) this.D, (uh.c) this.C);
    }

    public Object i(String str, m00.c cVar) {
        sv.q qVar;
        g00.k kVarH;
        int i;
        Object next;
        dh.o oVar = (dh.o) this.B;
        if (cVar instanceof sv.q) {
            qVar = (sv.q) cVar;
            int i2 = qVar.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qVar.E = i2 - Integer.MIN_VALUE;
            } else {
                qVar = new sv.q(this, cVar);
            }
        } else {
            qVar = new sv.q(this, cVar);
        }
        Object obj = qVar.C;
        l00.a aVar = l00.a.A;
        int i3 = qVar.E;
        if (i3 == 0) {
            t1.O(obj);
            if (str != null) {
                if (!r30.r.x0(str, "surah/", false)) {
                    str = null;
                }
                if (str != null && (kVarH = kh.o.H(str, "surah/")) != null) {
                    int iIntValue = ((Number) kVarH.A).intValue();
                    int iIntValue2 = ((Number) kVarH.B).intValue();
                    rv.p pVar = (rv.p) this.A;
                    qVar.A = str;
                    qVar.B = iIntValue2;
                    qVar.E = 1;
                    Serializable serializableC = pVar.c(iIntValue, qVar);
                    if (serializableC == aVar) {
                        return aVar;
                    }
                    obj = serializableC;
                    i = iIntValue2;
                }
            }
            return null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = qVar.B;
        str = qVar.A;
        t1.O(obj);
        String mediaId = str;
        Iterator it = ((Iterable) obj).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((PlayerItem) next).getSurahNumber() != i);
        PlayerItem playerItem = (PlayerItem) next;
        if (playerItem != null) {
            String title = playerItem.getSurahTranscription();
            String subtitle = playerItem.getReciterName();
            String strK = oVar.k(2131886226);
            kotlin.jvm.internal.m.e(mediaId, "mediaId");
            kotlin.jvm.internal.m.e(title, "title");
            kotlin.jvm.internal.m.e(subtitle, "subtitle");
            qv.a aVar2 = qv.a.A;
            return dh.o.j(oVar, mediaId, title, subtitle, (String) null, strK);
        }
        return null;
    }

    public void j(v2.k kVar, boolean z) {
        v2.y yVar = (v2.y) this.D;
        ?? r1 = kVar.a;
        int size = r1.size();
        for (int i = 0; i < size; i++) {
            if (((v2.s) r1.get(i)).b()) {
                C(kVar);
                return;
            }
        }
        z2.a0 a0Var = (z2.a0) this.A;
        if (a0Var == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        v2.r.i(kVar, a0Var.d0(0L), new b2.v(this, yVar, 12), false);
        if (((v2.w) this.B) == v2.w.B) {
            if (z) {
                int size2 = r1.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((v2.s) r1.get(i2)).a();
                }
            }
            f4 f4Var = kVar.b;
            if (f4Var != null) {
                f4Var.B = !yVar.C;
            }
        }
    }

    public void k(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        s();
    }

    public void l(b50.g gVar) {
        gVar.B.decrementAndGet();
        k((ArrayDeque) this.C, gVar);
    }

    public x.o m(x.o oVar, x.o oVar2, x.o oVar3) {
        if (((x.o) this.D) == null) {
            this.D = oVar3.c();
        }
        x.o oVar4 = (x.o) this.D;
        if (oVar4 == null) {
            kotlin.jvm.internal.m.k("endVelocityVector");
            throw null;
        }
        int iB = oVar4.b();
        for (int i = 0; i < iB; i++) {
            x.o oVar5 = (x.o) this.D;
            if (oVar5 == null) {
                kotlin.jvm.internal.m.k("endVelocityVector");
                throw null;
            }
            oVar5.e(((x.p) this.A).get(i).d(oVar.a(i), oVar2.a(i), oVar3.a(i)), i);
        }
        x.o oVar6 = (x.o) this.D;
        if (oVar6 != null) {
            return oVar6;
        }
        kotlin.jvm.internal.m.k("endVelocityVector");
        throw null;
    }

    public Enum n(n0 n0Var, a10.w property) {
        kotlin.jvm.internal.m.e(property, "property");
        return (Enum) ((n00.b) ((n00.a) this.C)).get(((o20.p) ((k20.d) this.B).e(((Number) ((kotlin.jvm.internal.p) this.A).get(n0Var)).intValue())).getNumber());
    }

    public a1 o(a10.d modelClass, String key) {
        a1 viewModel;
        a1 a1VarA;
        kotlin.jvm.internal.m.e(modelClass, "modelClass");
        kotlin.jvm.internal.m.e(key, "key");
        synchronized (((tf.y) this.D)) {
            try {
                e1 e1Var = (e1) this.A;
                e1Var.getClass();
                viewModel = (a1) e1Var.a.get(key);
                if (modelClass.u(viewModel)) {
                    x0 x0Var = (c1) this.B;
                    if (x0Var instanceof x0) {
                        x0 x0Var2 = x0Var;
                        kotlin.jvm.internal.m.b(viewModel);
                        x0Var2.getClass();
                        androidx.lifecycle.q qVar = x0Var2.d;
                        if (qVar != null) {
                            ia.e eVar = x0Var2.e;
                            kotlin.jvm.internal.m.b(eVar);
                            u0.a(viewModel, eVar, qVar);
                        }
                    }
                    kotlin.jvm.internal.m.c(viewModel, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.internal.ViewModelProviderImpl.getViewModel");
                } else {
                    t6.d dVar = new t6.d((t6.b) this.C);
                    ((t6.b) dVar).a.put(u0.e, key);
                    c1 factory = (c1) this.B;
                    kotlin.jvm.internal.m.e(factory, "factory");
                    try {
                        try {
                            a1VarA = factory.b(modelClass, dVar);
                        } catch (AbstractMethodError unused) {
                            a1VarA = factory.c(k00.f.D(modelClass), dVar);
                        }
                    } catch (AbstractMethodError unused2) {
                        a1VarA = factory.a(k00.f.D(modelClass));
                    }
                    viewModel = a1VarA;
                    e1 e1Var2 = (e1) this.A;
                    e1Var2.getClass();
                    kotlin.jvm.internal.m.e(viewModel, "viewModel");
                    a1 a1Var = (a1) e1Var2.a.put(key, viewModel);
                    if (a1Var != null) {
                        a1Var.e();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return viewModel;
    }

    public Serializable p(String str, q0 q0Var, m00.c cVar) {
        sv.r rVar;
        List listS;
        int i;
        q0 q0Var2;
        List list;
        Object obj;
        int i2;
        List list2;
        List list3;
        List list4;
        if (cVar instanceof sv.r) {
            rVar = (sv.r) cVar;
            int i3 = rVar.H;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rVar.H = i3 - Integer.MIN_VALUE;
            } else {
                rVar = new sv.r(this, cVar);
            }
        } else {
            rVar = new sv.r(this, cVar);
        }
        Object objE = rVar.F;
        l00.a aVar = l00.a.A;
        int i4 = rVar.H;
        if (i4 == 0) {
            t1.O(objE);
            listS = va.a.s();
            rVar.A = q0Var;
            rVar.B = listS;
            rVar.C = listS;
            rVar.E = 0;
            rVar.H = 1;
            Object objI = i(str, rVar);
            if (objI != aVar) {
                objE = objI;
                i = 0;
                q0Var2 = q0Var;
                list = listS;
            }
            return aVar;
        }
        if (i4 == 1) {
            i = rVar.E;
            list = rVar.C;
            listS = rVar.B;
            q0Var2 = rVar.A;
            t1.O(objE);
        } else {
            if (i4 == 2) {
                int i5 = rVar.E;
                List list5 = rVar.D;
                List list6 = rVar.C;
                List list7 = rVar.B;
                t1.O(objE);
                i2 = i5;
                list2 = list7;
                obj = objE;
                list3 = list5;
                list = list6;
                list3.addAll((Collection) obj);
                rVar.A = null;
                rVar.B = list2;
                rVar.C = null;
                rVar.D = list;
                rVar.E = i2;
                rVar.H = 3;
                objE = E(rVar);
                if (objE != aVar) {
                    list4 = list;
                }
                return aVar;
            }
            if (i4 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list4 = rVar.D;
            list2 = rVar.B;
            t1.O(objE);
        }
        list4.addAll((Collection) objE);
        return va.a.k(list2);
        q0 q0Var3 = (q0) objE;
        if (q0Var3 != null) {
            list.add(q0Var3);
        }
        if (q0Var2 != null) {
            list.add(q0Var2);
        }
        rVar.A = null;
        rVar.B = listS;
        rVar.C = list;
        rVar.D = list;
        rVar.E = i;
        rVar.H = 2;
        Object objB = B(rVar);
        if (objB != aVar) {
            obj = objB;
            i2 = i;
            list2 = listS;
            list3 = list;
            list3.addAll((Collection) obj);
            rVar.A = null;
            rVar.B = list2;
            rVar.C = null;
            rVar.D = list;
            rVar.E = i2;
            rVar.H = 3;
            objE = E(rVar);
            if (objE != aVar) {
                list4 = list;
                list4.addAll((Collection) objE);
                return va.a.k(list2);
            }
        }
        return aVar;
    }

    public x.o r(long j, x.o oVar, x.o oVar2, x.o oVar3) {
        if (((x.o) this.B) == null) {
            this.B = oVar.c();
        }
        x.o oVar4 = (x.o) this.B;
        if (oVar4 == null) {
            kotlin.jvm.internal.m.k("valueVector");
            throw null;
        }
        int iB = oVar4.b();
        for (int i = 0; i < iB; i++) {
            x.o oVar5 = (x.o) this.B;
            if (oVar5 == null) {
                kotlin.jvm.internal.m.k("valueVector");
                throw null;
            }
            oVar5.e(((x.p) this.A).get(i).e(oVar.a(i), oVar2.a(i), oVar3.a(i), j), i);
        }
        x.o oVar6 = (x.o) this.B;
        if (oVar6 != null) {
            return oVar6;
        }
        kotlin.jvm.internal.m.k("valueVector");
        throw null;
    }

    public void s() {
        int size;
        int i;
        b50.g gVar;
        byte[] bArr = y40.b.a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.B).iterator();
                kotlin.jvm.internal.m.d(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    b50.g gVar2 = (b50.g) it.next();
                    if (((ArrayDeque) this.C).size() >= 64) {
                        break;
                    }
                    if (gVar2.B.get() < 5) {
                        it.remove();
                        gVar2.B.incrementAndGet();
                        arrayList.add(gVar2);
                        ((ArrayDeque) this.C).add(gVar2);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.C).size();
                    ((ArrayDeque) this.D).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    gVar = (b50.g) arrayList.get(i);
                    synchronized (this) {
                        try {
                            if (((ThreadPoolExecutor) this.A) == null) {
                                TimeUnit timeUnit = TimeUnit.SECONDS;
                                SynchronousQueue synchronousQueue = new SynchronousQueue();
                                String name = y40.b.g + " Dispatcher";
                                kotlin.jvm.internal.m.e(name, "name");
                                this.A = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new y40.a(name, false));
                            }
                            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.A;
                            kotlin.jvm.internal.m.b(threadPoolExecutor);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    gVar.getClass();
                    b50.j jVar = gVar.C;
                    byte[] bArr2 = y40.b.a;
                    try {
                        try {
                            threadPoolExecutor.execute(gVar);
                        } catch (RejectedExecutionException e) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e);
                            jVar.k(interruptedIOException);
                            gVar.A.h(jVar, interruptedIOException);
                            jVar.A.A.l(gVar);
                        }
                    } catch (Throwable th2) {
                        jVar.A.A.l(gVar);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        size = arrayList.size();
        while (i < size) {
            gVar = (b50.g) arrayList.get(i);
            synchronized (this) {
                if (((ThreadPoolExecutor) this.A) == null) {
                    TimeUnit timeUnit2 = TimeUnit.SECONDS;
                    SynchronousQueue synchronousQueue2 = new SynchronousQueue();
                    String name2 = y40.b.g + " Dispatcher";
                    kotlin.jvm.internal.m.e(name2, "name");
                    this.A = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit2, synchronousQueue2, new y40.a(name2, false));
                }
                ThreadPoolExecutor threadPoolExecutor2 = (ThreadPoolExecutor) this.A;
                kotlin.jvm.internal.m.b(threadPoolExecutor2);
                gVar.getClass();
                b50.j jVar2 = gVar.C;
                byte[] bArr3 = y40.b.a;
                threadPoolExecutor2.execute(gVar);
            }
        }
    }

    public Serializable t(m00.c cVar) {
        sv.n nVar;
        Set set;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        if (cVar instanceof sv.n) {
            nVar = (sv.n) cVar;
            int i = nVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                nVar.D = i - Integer.MIN_VALUE;
            } else {
                nVar = new sv.n(this, cVar);
            }
        } else {
            nVar = new sv.n(this, cVar);
        }
        Object objU = nVar.B;
        l00.a aVar = l00.a.A;
        int i2 = nVar.D;
        if (i2 == 0) {
            t1.O(objU);
            y1 y1Var = ((tq.k) this.A).c;
            nVar.D = 1;
            objU = d40.o.u(y1Var, nVar);
            if (objU != aVar) {
            }
            return aVar;
        }
        if (i2 == 1) {
            t1.O(objU);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = nVar.A;
            t1.O(objU);
        }
        arrayList = new ArrayList();
        for (Object obj : (Iterable) objU) {
            if (set.contains(new Integer(((bx.c) obj).a))) {
                arrayList.add(obj);
            }
        }
        arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
        it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(kh.n.W((dh.o) this.D, (bx.c) it.next(), (String) null, (qv.a) null));
        }
        return arrayList2;
        List list = (List) objU;
        h00.x xVar = h00.x.A;
        if (list == null) {
            list = xVar;
        }
        if (list.isEmpty()) {
            return xVar;
        }
        Set setR1 = h00.q.r1(list);
        rv.p pVar = (rv.p) this.C;
        nVar.A = setR1;
        nVar.D = 2;
        Object objF = pVar.f(nVar);
        if (objF != aVar) {
            set = setR1;
            objU = objF;
            arrayList = new ArrayList();
            while (r7.hasNext()) {
                if (set.contains(new Integer(((bx.c) obj).a))) {
                    arrayList.add(obj);
                }
            }
            arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
            it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(kh.n.W((dh.o) this.D, (bx.c) it.next(), (String) null, (qv.a) null));
            }
            return arrayList2;
        }
        return aVar;
    }

    public void u(th.a aVar) throws GeneralSecurityException {
        aVar.getClass();
        th.q qVar = new th.q(th.o.class, aVar.a);
        HashMap map = (HashMap) this.B;
        if (!map.containsKey(qVar)) {
            map.put(qVar, aVar);
            return;
        }
        th.a aVar2 = (th.a) map.get(qVar);
        if (aVar2.equals(aVar) && aVar.equals(aVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + qVar);
    }

    public void w(th.c cVar) throws GeneralSecurityException {
        th.r rVar = new th.r(cVar.a, th.o.class);
        HashMap map = (HashMap) this.A;
        if (!map.containsKey(rVar)) {
            map.put(rVar, cVar);
            return;
        }
        th.c cVar2 = (th.c) map.get(rVar);
        if (cVar2.equals(cVar) && cVar.equals(cVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + rVar);
    }

    public void x(th.j jVar) throws GeneralSecurityException {
        jVar.getClass();
        th.q qVar = new th.q(th.p.class, jVar.a);
        HashMap map = (HashMap) this.D;
        if (!map.containsKey(qVar)) {
            map.put(qVar, jVar);
            return;
        }
        th.j jVar2 = (th.j) map.get(qVar);
        if (jVar2.equals(jVar) && jVar.equals(jVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + qVar);
    }

    public void y(th.k kVar) throws GeneralSecurityException {
        th.r rVar = new th.r(kVar.a, th.p.class);
        HashMap map = (HashMap) this.C;
        if (!map.containsKey(rVar)) {
            map.put(rVar, kVar);
            return;
        }
        th.k kVar2 = (th.k) map.get(rVar);
        if (kVar2.equals(kVar) && kVar.equals(kVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + rVar);
    }

    public void z(qc.b bVar) {
        Set setR1;
        ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) this.A).readLock();
        lock.lock();
        try {
            qc.b bVar2 = (qc.b) this.B;
            lock.unlock();
            ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) this.A;
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                this.B = bVar;
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                if (bVar.equals(bVar2)) {
                    return;
                }
                synchronized (this.C) {
                    setR1 = h00.q.r1((LinkedHashSet) this.D);
                }
                Iterator it = setR1.iterator();
                while (it.hasNext()) {
                    ((u00.k) it.next()).invoke(bVar);
                }
            } catch (Throwable th) {
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }
}
