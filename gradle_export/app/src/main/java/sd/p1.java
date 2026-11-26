package sd;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import com.google.android.gms.internal.measurement.x5;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.quranify.player.presentation.service.auto.art.AutoArtContentProvider;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.HttpsURLConnection;
import kotlin.NoWhenBranchMatchedException;
import l1.p2;
import tf.a4;
import tf.c3;
import tf.i2;
import tf.k2;
import tf.o2;
import tf.q3;
import tf.y3;

public final class p1 implements k2, tf.r0, vb.e, yj.b, zd.b, y1.e, xh.a {
    public static p1 E;
    public final int A;
    public Object B;
    public Object C;
    public Object D;

    public p1(int i10) {
        this(new long[10], new long[10], new long[10], 27);
        this.A = i10;
        switch (i10) {
            case 10:
                this.B = new WeakHashMap();
                this.C = new WeakHashMap();
                this.D = new WeakHashMap();
                break;
            case 14:
                this.B = new AtomicReference(v1.d.f15333c);
                this.C = new Object();
                break;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                String string = UUID.randomUUID().toString();
                kotlin.jvm.internal.m.d(string, "randomUUID().toString()");
                k50.l lVar = k50.l.D;
                this.B = sg.f.I(string);
                this.C = x40.u.e;
                this.D = new ArrayList();
                break;
            case 27:
                break;
            default:
                this.D = new tf.y(12);
                break;
        }
    }

    public p1(int i10, boolean z10) {
        this.A = i10;
    }

    public p1(ad.f fVar, ad.f fVar2, cd.b bVar) {
        this.A = 24;
        kotlin.jvm.internal.m.e(fVar, "source");
        kotlin.jvm.internal.m.e(bVar, "logger");
        this.B = fVar;
        this.C = fVar2;
        this.D = bVar;
    }

    public p1(Context context, dh.o oVar, jo.d dVar, ko.c cVar) {
        this.A = 1;
        this.B = context;
        this.C = oVar;
        this.D = dVar;
    }

    public p1(Context context, tf.h1 h1Var) {
        this.A = 4;
        this.D = new AtomicLong(-1L);
        this.C = new se.b(context, null, se.b.f14140a, new com.google.android.gms.common.internal.t("measurement:api"), com.google.android.gms.common.api.m.f3251c);
        this.B = h1Var;
    }

    public p1(ConnectivityManager connectivityManager, bc.g gVar) {
        this.A = 16;
        this.B = connectivityManager;
        this.C = gVar;
        com.google.android.gms.internal.cast.h2 h2Var = new com.google.android.gms.internal.cast.h2(this, 1);
        this.D = h2Var;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), h2Var);
    }

    public p1(h1.l lVar, h1.l lVar2, cd.b bVar) {
        this.A = 25;
        kotlin.jvm.internal.m.e(lVar, "source");
        kotlin.jvm.internal.m.e(bVar, "logger");
        this.B = lVar;
        this.C = lVar2;
        this.D = bVar;
    }

    public p1(Object obj, Object obj2, Object obj3, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
    }

    public p1(String str, HashMap map) {
        this.A = 8;
        this.B = str;
        this.D = map;
        this.C = new HashMap();
    }

    public p1(p10.a aVar, tf.w wVar, v5.b bVar, Set set) {
        this.A = 15;
        this.B = wVar;
        this.C = aVar;
        this.D = bVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            C(str, 0, str.length(), 1, true, new bh.f(str, false));
        }
    }

    public p1(q3.h0 h0Var, p1 p1Var) {
        this.A = 9;
        this.B = h0Var;
        this.C = p1Var;
        this.D = h0Var.getValue();
    }

    public p1(p1 p1Var) {
        this.A = 27;
        this.B = Arrays.copyOf((long[]) p1Var.B, 10);
        this.C = Arrays.copyOf((long[]) p1Var.C, 10);
        this.D = Arrays.copyOf((long[]) p1Var.D, 10);
    }

    public p1(y3 y3Var, String str, Object obj, int i10) {
        this.A = i10;
        this.B = str;
        this.C = obj;
        this.D = y3Var;
    }

    public p1(byte[] bArr) throws GeneralSecurityException {
        this.A = 28;
        zh.u.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.B = secretKeySpec;
        if (!oi.k.a(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) zh.o.f17495b.f17498a.d("AES/ECB/NoPadding");
        cipher.init(1, secretKeySpec);
        byte[] bArrY = bi.b.y(cipher.doFinal(new byte[16]));
        this.C = bArrY;
        this.D = bi.b.y(bArrY);
    }

    public static final void d(p1 p1Var, Network network, boolean z10) {
        g00.b0 b0Var;
        boolean z11;
        boolean z12 = false;
        for (Network network2 : ((ConnectivityManager) p1Var.B).getAllNetworks()) {
            if (kotlin.jvm.internal.m.a(network2, network)) {
                z11 = z10;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) p1Var.B).getNetworkCapabilities(network2);
                z11 = networkCapabilities != null && networkCapabilities.hasCapability(12);
            }
            if (z11) {
                z12 = true;
                break;
            }
        }
        bc.g gVar = (bc.g) p1Var.C;
        synchronized (gVar) {
            try {
                if (((lb.j) gVar.A.get()) != null) {
                    gVar.E = z12;
                    b0Var = g00.b0.a;
                } else {
                    b0Var = null;
                }
                if (b0Var == null) {
                    gVar.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String k(String str, HashMap map) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append("=");
        sb2.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : RuntimeVersion.SUFFIX);
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append("&");
            sb2.append((String) entry2.getKey());
            sb2.append("=");
            sb2.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : RuntimeVersion.SUFFIX);
        }
        String string = sb2.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return x5.m(str, "?", string);
        }
        if (!str.endsWith("&")) {
            string = "&".concat(string);
        }
        return w.c.j(str, string);
    }

    public static boolean l(Editable editable, KeyEvent keyEvent, boolean z10) {
        v5.s[] sVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (sVarArr = (v5.s[]) editable.getSpans(selectionStart, selectionEnd, v5.s.class)) != null && sVarArr.length > 0) {
                for (v5.s sVar : sVarArr) {
                    int spanStart = editable.getSpanStart(sVar);
                    int spanEnd = editable.getSpanEnd(sVar);
                    if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static w0 t(u0 u0Var, String str) {
        w0 w0VarT;
        w0 w0Var = (w0) u0Var;
        if (str.equals(w0Var.f14103c)) {
            return w0Var;
        }
        for (Object obj : u0Var.a()) {
            if (obj instanceof w0) {
                w0 w0Var2 = (w0) obj;
                if (str.equals(w0Var2.f14103c)) {
                    return w0Var2;
                }
                if ((obj instanceof u0) && (w0VarT = t((u0) obj, str)) != null) {
                    return w0VarT;
                }
            }
        }
        return null;
    }

    public static p1 u(InputStream inputStream) {
        h2 h2Var = new h2();
        h2Var.f13989a = null;
        h2Var.f13990b = null;
        h2Var.f13991c = false;
        h2Var.f13993e = false;
        h2Var.f13994f = null;
        h2Var.f13995g = null;
        h2Var.f13996h = false;
        h2Var.f13997i = null;
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i10 = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i10 == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            h2Var.B(inputStream);
            return h2Var.f13989a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    public java.lang.Object A(fd.c r12, m00.c r13) {
        throw new UnsupportedOperationException("Method not decompiled: sd.p1.A(fd.c, m00.c):java.lang.Object");
    }

    public java.lang.Object B(m00.c r5) {
        throw new UnsupportedOperationException("Method not decompiled: sd.p1.B(m00.c):java.lang.Object");
    }

    public Object C(CharSequence charSequence, int i10, int i11, int i12, boolean z10, v5.k kVar) {
        int i13;
        char c10;
        o9.d dVar = new o9.d((v5.o) ((p10.a) this.C).C);
        int iCodePointAt = Character.codePointAt(charSequence, i10);
        int i14 = 0;
        boolean zC = true;
        int iCharCount = i10;
        loop0: while (true) {
            i13 = iCharCount;
            while (true) {
                if (iCharCount < i11 && i14 < i12 && zC) {
                    SparseArray sparseArray = ((v5.o) dVar.f11764e).f15475a;
                    v5.o oVar = sparseArray == null ? null : (v5.o) sparseArray.get(iCodePointAt);
                    if (dVar.f11760a == 2) {
                        if (oVar != null) {
                            dVar.f11764e = oVar;
                            dVar.f11762c++;
                        } else {
                            if (iCodePointAt == 65038) {
                                dVar.b();
                            } else if (iCodePointAt != 65039) {
                                v5.o oVar2 = (v5.o) dVar.f11764e;
                                if (oVar2.f15476b != null) {
                                    if (dVar.f11762c != 1) {
                                        dVar.f11765f = oVar2;
                                        dVar.b();
                                    } else if (dVar.c()) {
                                        dVar.f11765f = (v5.o) dVar.f11764e;
                                        dVar.b();
                                    } else {
                                        dVar.b();
                                    }
                                    c10 = 3;
                                } else {
                                    dVar.b();
                                }
                            }
                            c10 = 1;
                        }
                        c10 = 2;
                    } else if (oVar == null) {
                        dVar.b();
                        c10 = 1;
                    } else {
                        dVar.f11760a = 2;
                        dVar.f11764e = oVar;
                        dVar.f11762c = 1;
                        c10 = 2;
                    }
                    dVar.f11761b = iCodePointAt;
                    if (c10 == 1) {
                        iCharCount = Character.charCount(Character.codePointAt(charSequence, i13)) + i13;
                        if (iCharCount >= i11) {
                            break;
                        }
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                        break;
                    }
                    if (c10 == 2) {
                        int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                        if (iCharCount2 < i11) {
                            iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                        }
                        iCharCount = iCharCount2;
                    } else if (c10 == 3) {
                        if (!z10 && v(charSequence, i13, iCharCount, ((v5.o) dVar.f11765f).f15476b)) {
                            break;
                        }
                        zC = kVar.c(charSequence, i13, iCharCount, ((v5.o) dVar.f11765f).f15476b);
                        i14++;
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        if (dVar.f11760a == 2 && ((v5.o) dVar.f11764e).f15476b != null && ((dVar.f11762c > 1 || dVar.c()) && i14 < i12 && zC && (z10 || !v(charSequence, i13, iCharCount, ((v5.o) dVar.f11764e).f15476b)))) {
            kVar.c(charSequence, i13, iCharCount, ((v5.o) dVar.f11764e).f15476b);
        }
        return kVar.a();
    }

    public Serializable D(String str, m00.c cVar) {
        sv.c cVar2;
        int iIntValue;
        int i10;
        Object next;
        Object next2;
        if (cVar instanceof sv.c) {
            cVar2 = (sv.c) cVar;
            int i11 = cVar2.E;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar2.E = i11 - Integer.MIN_VALUE;
            } else {
                cVar2 = new sv.c(this, cVar);
            }
        } else {
            cVar2 = new sv.c(this, cVar);
        }
        Object obj = cVar2.C;
        l00.a aVar = l00.a.A;
        int i12 = cVar2.E;
        if (i12 == 0) {
            ri.t1.O(obj);
            List listW0 = r30.k.W0(r30.k.R0(str, "story_ep/"), new String[]{"/"}, 6);
            ArrayList arrayList = new ArrayList();
            Iterator it = listW0.iterator();
            while (it.hasNext()) {
                Integer numY0 = r30.r.y0((String) it.next());
                if (numY0 != null) {
                    arrayList.add(numY0);
                }
            }
            if (arrayList.size() != 2) {
                arrayList = null;
            }
            if (arrayList != null) {
                iIntValue = ((Number) arrayList.get(0)).intValue();
                int iIntValue2 = ((Number) arrayList.get(1)).intValue();
                cVar2.A = iIntValue;
                cVar2.B = iIntValue2;
                cVar2.E = 1;
                Object objS = d40.o.s(((jo.d) this.D).a(), cVar2);
                if (objS == aVar) {
                    return aVar;
                }
                obj = objS;
                i10 = iIntValue2;
            }
            return null;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i10 = cVar2.B;
        iIntValue = cVar2.A;
        ri.t1.O(obj);
        Iterator it2 = ((Iterable) obj).iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (((ho.a) next).a != iIntValue);
        ho.a aVar2 = (ho.a) next;
        if (aVar2 != null) {
            Iterator it3 = aVar2.g.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (((ho.g) next2).a != i10);
            ho.g gVar = (ho.g) next2;
            if (gVar != null) {
                return new g00.k(aVar2, gVar);
            }
        }
        return null;
    }

    public w0 E(String str) {
        if (str != null) {
            if (str.startsWith("\"") && str.endsWith("\"")) {
                str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
            } else if (str.startsWith("'") && str.endsWith("'")) {
                str = str.substring(1, str.length() - 1).replace("\\'", "'");
            }
            String strReplace = str.replace("\\\n", RuntimeVersion.SUFFIX).replace("\\A", "\n");
            if (strReplace.length() > 1 && strReplace.startsWith("#")) {
                String strSubstring = strReplace.substring(1);
                HashMap map = (HashMap) this.D;
                if (strSubstring != null && strSubstring.length() != 0) {
                    if (strSubstring.equals(((r0) this.B).f14103c)) {
                        return (r0) this.B;
                    }
                    if (map.containsKey(strSubstring)) {
                        return (w0) map.get(strSubstring);
                    }
                    w0 w0VarT = t((r0) this.B, strSubstring);
                    map.put(strSubstring, w0VarT);
                    return w0VarT;
                }
            }
        }
        return null;
    }

    public void F(Object obj) {
        long jB = v1.d.b();
        if (jB == v1.k.f15349a) {
            this.D = obj;
            return;
        }
        synchronized (this.C) {
            v1.j jVar = (v1.j) ((AtomicReference) this.B).get();
            int iA = jVar.a(jB);
            if (iA < 0) {
                ((AtomicReference) this.B).set(jVar.b(obj, jB));
            } else {
                jVar.f15348c[iA] = obj;
            }
        }
    }

    public void G(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.B = str;
    }

    public void H(int i10) throws InvalidAlgorithmParameterException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i10 * 8)));
        }
        this.B = Integer.valueOf(i10);
    }

    public Object I(String str, m00.c cVar) {
        sv.d dVar;
        ho.a aVar;
        if (cVar instanceof sv.d) {
            dVar = (sv.d) cVar;
            int i10 = dVar.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.D = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new sv.d(this, cVar);
            }
        } else {
            dVar = new sv.d(this, cVar);
        }
        Object objK = dVar.B;
        l00.a aVar2 = l00.a.A;
        int i11 = dVar.D;
        if (i11 == 0) {
            ri.t1.O(objK);
            dVar.D = 1;
            objK = K(str, dVar);
            if (objK != aVar2) {
            }
            return aVar2;
        }
        if (i11 == 1) {
            ri.t1.O(objK);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = dVar.A;
            ri.t1.O(objK);
        }
        for (Object obj : (Iterable) objK) {
            if (kotlin.jvm.internal.m.a(((androidx.media3.common.q0) obj).f1413a, "story/" + aVar.a)) {
                return obj;
            }
        }
        return null;
        ho.a aVar3 = (ho.a) objK;
        if (aVar3 == null) {
            return null;
        }
        dVar.A = aVar3;
        dVar.D = 2;
        objK = J(dVar);
        if (objK != aVar2) {
            aVar = aVar3;
            while (r6.hasNext()) {
                if (kotlin.jvm.internal.m.a(((androidx.media3.common.q0) obj).f1413a, "story/" + aVar.a)) {
                    return obj;
                }
            }
            return null;
        }
        return aVar2;
    }

    public Serializable J(m00.c cVar) {
        sv.e eVar;
        if (cVar instanceof sv.e) {
            eVar = (sv.e) cVar;
            int i10 = eVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.C = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new sv.e(this, cVar);
            }
        } else {
            eVar = new sv.e(this, cVar);
        }
        Object objS = eVar.A;
        l00.a aVar = l00.a.A;
        int i11 = eVar.C;
        if (i11 == 0) {
            ri.t1.O(objS);
            eVar.C = 1;
            objS = d40.o.s(((jo.d) this.D).a(), eVar);
            if (objS == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(objS);
        }
        Iterable<ho.a> iterable = (Iterable) objS;
        ArrayList arrayList = new ArrayList(h00.r.q0(iterable, 10));
        for (ho.a aVar2 : iterable) {
            dh.o oVar = (dh.o) this.C;
            String strF = g4.c.f(aVar2.a, "story/");
            String str = aVar2.c;
            ho.b bVar = aVar2.f;
            arrayList.add(dh.o.d(oVar, strF, str, bVar != null ? bVar.b : null, j(aVar2), null, null, qv.a.B, qv.a.A, 304));
        }
        return arrayList;
    }

    public Object K(String str, m00.c cVar) {
        sv.f fVar;
        int i10;
        if (cVar instanceof sv.f) {
            fVar = (sv.f) cVar;
            int i11 = fVar.D;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.D = i11 - Integer.MIN_VALUE;
            } else {
                fVar = new sv.f(this, cVar);
            }
        } else {
            fVar = new sv.f(this, cVar);
        }
        Object objS = fVar.B;
        l00.a aVar = l00.a.A;
        int i12 = fVar.D;
        if (i12 == 0) {
            ri.t1.O(objS);
            Integer numY0 = r30.r.y0(r30.k.R0(str, "story/"));
            if (numY0 == null) {
                return null;
            }
            int iIntValue = numY0.intValue();
            fVar.A = iIntValue;
            fVar.D = 1;
            objS = d40.o.s(((jo.d) this.D).a(), fVar);
            if (objS == aVar) {
                return aVar;
            }
            i10 = iIntValue;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = fVar.A;
            ri.t1.O(objS);
        }
        for (Object obj : (Iterable) objS) {
            if (((ho.a) obj).a == i10) {
                return obj;
            }
        }
        return null;
    }

    public void L() {
        u.i0 i0Var = (u.i0) this.B;
        String str = (String) this.C;
        List list = (List) i0Var.k(str);
        if (list != null) {
            list.remove((u00.a) this.D);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        i0Var.m(str, list);
    }

    public synchronized void M(long j9, int i10, int i11, long j10) {
        ((tf.h1) this.B).K.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        AtomicLong atomicLong = (AtomicLong) this.D;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        ((se.b) this.C).c(new com.google.android.gms.common.internal.s(0, Arrays.asList(new com.google.android.gms.common.internal.p(36301, i10, 0, j9, j10, null, null, 0, i11)))).e(new a8.i0(this, jElapsedRealtime, 8));
    }

    @Override
    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.B;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void b(int i10, Throwable th2, byte[] bArr) {
        o2 o2Var;
        i2 i2Var = (i2) this.B;
        i2Var.V0();
        q3 q3Var = (q3) this.D;
        if (i10 == 200 || i10 == 204) {
            if (th2 == null) {
                tf.q0 q0Var = ((tf.h1) i2Var.B).F;
                tf.h1.g(q0Var);
                q0Var.O.c(Long.valueOf(q3Var.A), "[sgtm] Upload succeeded for row_id");
                o2Var = o2.SUCCESS;
            } else {
                tf.q0 q0Var2 = ((tf.h1) i2Var.B).F;
                tf.h1.g(q0Var2);
                q0Var2.J.e("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(q3Var.A), Integer.valueOf(i10), th2);
                if (Arrays.asList(((String) tf.b0.f14594u.a(null)).split(",")).contains(String.valueOf(i10))) {
                    o2Var = o2.BACKOFF;
                } else {
                    o2Var = o2.FAILURE;
                }
            }
        } else if (i10 == 304) {
            i10 = 304;
            if (th2 == null) {
                tf.q0 q0Var3 = ((tf.h1) i2Var.B).F;
                tf.h1.g(q0Var3);
                q0Var3.O.c(Long.valueOf(q3Var.A), "[sgtm] Upload succeeded for row_id");
                o2Var = o2.SUCCESS;
            } else {
                tf.q0 q0Var4 = ((tf.h1) i2Var.B).F;
                tf.h1.g(q0Var4);
                q0Var4.J.e("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(q3Var.A), Integer.valueOf(i10), th2);
                if (Arrays.asList(((String) tf.b0.f14594u.a(null)).split(",")).contains(String.valueOf(i10))) {
                    o2Var = o2.BACKOFF;
                } else {
                    o2Var = o2.FAILURE;
                }
            }
        } else {
            tf.q0 q0Var5 = ((tf.h1) i2Var.B).F;
            tf.h1.g(q0Var5);
            q0Var5.J.e("[sgtm] Upload failed for row_id. response, exception", Long.valueOf(q3Var.A), Integer.valueOf(i10), th2);
            if (Arrays.asList(((String) tf.b0.f14594u.a(null)).split(",")).contains(String.valueOf(i10))) {
                o2Var = o2.BACKOFF;
            } else {
                o2Var = o2.FAILURE;
            }
        }
        AtomicReference atomicReference = (AtomicReference) this.C;
        c3 c3VarJ = ((tf.h1) i2Var.B).j();
        long j9 = q3Var.A;
        tf.d dVar = new tf.d(o2Var.A, j9, q3Var.F);
        c3VarJ.V0();
        c3VarJ.W0();
        c3VarJ.j1(new ca.u(c3VarJ, c3VarJ.l1(true), dVar, 14));
        tf.q0 q0Var6 = ((tf.h1) i2Var.B).F;
        tf.h1.g(q0Var6);
        q0Var6.O.d("[sgtm] Updated status for row_id", Long.valueOf(j9), o2Var);
        synchronized (atomicReference) {
            atomicReference.set(o2Var);
            atomicReference.notifyAll();
        }
    }

    @Override
    public byte[] c(int i10, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrT;
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!oi.k.a(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) zh.o.f17495b.f17498a.d("AES/ECB/NoPadding");
        cipher.init(1, (SecretKeySpec) this.B);
        int iMax = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
        if (iMax * 16 == bArr.length) {
            bArrT = zh.i.s(bArr, (iMax - 1) * 16, (byte[]) this.C, 0, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length);
            if (bArrCopyOfRange.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[bArrCopyOfRange.length] = -128;
            bArrT = zh.i.t(bArrCopyOf, (byte[]) this.D);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i11 = 0; i11 < iMax - 1; i11++) {
            bArrDoFinal = cipher.doFinal(zh.i.s(bArrDoFinal, 0, bArr, i11 * 16, 16));
        }
        return Arrays.copyOf(cipher.doFinal(zh.i.t(bArrT, bArrDoFinal)), i10);
    }

    public Uri e() {
        String strEncode = Uri.encode("com.mchutov.Quranify.web");
        String strEncode2 = Uri.encode("https://quranify.pro/auth/apple/callback");
        String strEncode3 = Uri.encode((String) this.B);
        String strEncode4 = Uri.encode((String) this.C);
        StringBuilder sbS = a1.b.s("https://appleid.apple.com/auth/authorize?client_id=", strEncode, "&redirect_uri=", strEncode2, "&response_type=code%20id_token&response_mode=fragment&state=");
        sbS.append(strEncode3);
        sbS.append("&nonce=");
        sbS.append(strEncode4);
        Uri uri = Uri.parse(sbS.toString());
        kotlin.jvm.internal.m.d(uri, "parse(...)");
        return uri;
    }

    public uh.a f() throws GeneralSecurityException {
        me.i iVar;
        ai.a aVarA;
        uh.d dVar = (uh.d) this.B;
        if (dVar == null || (iVar = (me.i) this.C) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (dVar.f15271b != ((ai.a) iVar.B).f486a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        uh.c cVar = dVar.f15273d;
        uh.c cVar2 = uh.c.f15261f;
        if (cVar != cVar2 && ((Integer) this.D) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (cVar == cVar2 && ((Integer) this.D) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (cVar == cVar2) {
            aVarA = ai.a.a(new byte[0]);
        } else if (cVar == uh.c.f15260e || cVar == uh.c.f15259d) {
            aVarA = ai.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.D).intValue()).array());
        } else {
            if (cVar != uh.c.f15258c) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + ((uh.d) this.B).f15273d);
            }
            aVarA = ai.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.D).intValue()).array());
        }
        return new uh.a((uh.d) this.B, aVarA);
    }

    public uh.d g() throws GeneralSecurityException {
        Integer num = (Integer) this.B;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (((Integer) this.C) == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (((uh.c) this.D) != null) {
            return new uh.d(num.intValue(), ((Integer) this.C).intValue(), (uh.c) this.D);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public Object get() {
        switch (this.A) {
            case 14:
                long jB = v1.d.b();
                if (jB == v1.k.f15349a) {
                    return this.D;
                }
                v1.j jVar = (v1.j) ((AtomicReference) this.B).get();
                int iA = jVar.a(jB);
                if (iA >= 0) {
                    return jVar.f15348c[iA];
                }
                return null;
            case TYPE_SINT64_VALUE:
                Context context = (Context) ((nf.c) this.B).A;
                k00.i iVar = (k00.i) ((f00.a) this.C).get();
                wj.g0 g0Var = (wj.g0) ((yj.c) this.D).get();
                kotlin.jvm.internal.m.e(context, "appContext");
                kotlin.jvm.internal.m.e(iVar, "blockingDispatcher");
                kotlin.jvm.internal.m.e(g0Var, "sessionDataSerializer");
                DataStore dataStoreB = wj.p.b(g0Var, new ReplaceFileCorruptionHandler(new q0.a(g0Var, 19)), a40.c0.c(iVar), new dm.b(context, 3));
                if (dataStoreB != null) {
                    return dataStoreB;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                return new xd.p(new sg.f(), new hb.f(), (ce.d) ((ce.c) this.B).get(), (a30.k) ((ui.b) this.C).get(), (oj.q) ((oj.q) this.D).get());
            default:
                return new zj.m((k00.i) ((f00.a) this.B).get(), (wj.b1) ((f00.a) this.C).get(), (DataStore) ((yj.c) this.D).get());
        }
    }

    public uh.i h() throws GeneralSecurityException {
        me.i iVar;
        ai.a aVarA;
        uh.j jVar = (uh.j) this.B;
        if (jVar == null || (iVar = (me.i) this.C) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (jVar.f15281b != ((ai.a) iVar.B).f486a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        uh.c cVar = jVar.f15283d;
        uh.c cVar2 = uh.c.f15268o;
        if (cVar != cVar2 && ((Integer) this.D) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (cVar == cVar2 && ((Integer) this.D) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        if (cVar == cVar2) {
            aVarA = ai.a.a(new byte[0]);
        } else if (cVar == uh.c.f15267n || cVar == uh.c.m) {
            aVarA = ai.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.D).intValue()).array());
        } else {
            if (cVar != uh.c.l) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: " + ((uh.j) this.B).f15283d);
            }
            aVarA = ai.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.D).intValue()).array());
        }
        return new uh.i((uh.j) this.B, aVarA);
    }

    public xd.i i() {
        String strConcat = ((String) this.B) == null ? " backendName" : RuntimeVersion.SUFFIX;
        if (((ud.d) this.D) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new xd.i((String) this.B, (byte[]) this.C, (ud.d) this.D);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    public String j(ho.a aVar) throws NoWhenBranchMatchedException {
        Uri uriO;
        Context context = (Context) this.B;
        lo.c cVarX = ko.c.X(aVar);
        if (cVarX instanceof lo.c) {
            int i10 = AutoArtContentProvider.A;
            uriO = gj.e.g(context, "res", new g00.k("res", String.valueOf(cVarX.a)), new g00.k("photo", "1"));
        } else {
            if (!(cVarX instanceof lo.d)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((lo.d) cVarX).a;
            if (str != null) {
                int i11 = AutoArtContentProvider.A;
                uriO = gj.e.l(context, str);
            } else {
                int i12 = AutoArtContentProvider.A;
                uriO = gj.e.o(context, 2131230842);
            }
        }
        String string = uriO.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public Serializable m(String str, m00.c cVar) {
        sv.a aVar;
        if (cVar instanceof sv.a) {
            aVar = (sv.a) cVar;
            int i10 = aVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.C = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new sv.a(this, cVar);
            }
        } else {
            aVar = new sv.a(this, cVar);
        }
        Object objK = aVar.A;
        l00.a aVar2 = l00.a.A;
        int i11 = aVar.C;
        int i12 = 1;
        if (i11 == 0) {
            ri.t1.O(objK);
            aVar.C = 1;
            objK = K(str, aVar);
            if (objK == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(objK);
        }
        ho.a aVar3 = (ho.a) objK;
        if (aVar3 == null) {
            return h00.x.A;
        }
        List<ho.g> list = aVar3.g;
        ArrayList arrayList = new ArrayList(h00.r.q0(list, 10));
        for (ho.g gVar : list) {
            Context context = (Context) this.B;
            int i13 = gVar.b;
            long j9 = gVar.k;
            long j10 = gVar.f;
            String string = context.getString(2131886133, Integer.valueOf(i13));
            kotlin.jvm.internal.m.d(string, "getString(...)");
            Bundle bundle = new Bundle();
            bundle.putInt("android.media.extra.PLAYBACK_STATUS", gVar.l ? 2 : gVar.c() ? i12 : 0);
            if (gVar.c() && j10 > 0) {
                bundle.putDouble("androidx.media.MediaItem.Extras.COMPLETION_PERCENTAGE", j9 / j10);
            }
            if (gVar.c()) {
                j10 -= j9;
                if (j10 < r15) {
                    j10 = 0;
                }
            }
            Locale locale = context.getResources().getConfiguration().getLocales().get(0);
            kotlin.jvm.internal.m.d(locale, "get(...)");
            String strZ = c7.i.z(j10, locale);
            androidx.media3.common.s0 s0Var = new androidx.media3.common.s0();
            s0Var.f1515a = string;
            s0Var.f1520f = aVar3.c;
            s0Var.f1516b = strZ;
            s0Var.f1529q = Boolean.FALSE;
            s0Var.f1530r = Boolean.TRUE;
            s0Var.G = 3;
            s0Var.m = Uri.parse(j(aVar3));
            s0Var.H = bundle;
            androidx.media3.common.t0 t0Var = new androidx.media3.common.t0(s0Var);
            androidx.media3.common.e0 e0Var = new androidx.media3.common.e0();
            fh.r0 r0Var = fh.t0.B;
            fh.d2 d2Var = fh.d2.E;
            List list2 = Collections.EMPTY_LIST;
            androidx.media3.common.j0 j0Var = new androidx.media3.common.j0();
            androidx.media3.common.m0 m0Var = androidx.media3.common.m0.f1344d;
            String str2 = "story_ep/" + aVar3.a + "/" + gVar.a;
            str2.getClass();
            arrayList.add(new androidx.media3.common.q0(str2, new androidx.media3.common.g0(e0Var), null, new androidx.media3.common.k0(j0Var), t0Var, m0Var));
            i12 = 1;
        }
        return arrayList;
    }

    public a2.n n() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        pi.e.b();
        InputStream inputStream = null;
        String string = null;
        inputStream = null;
        try {
            String strK = k((String) this.B, (HashMap) this.D);
            String str = "GET Request URL: " + strK;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str, null);
            }
            httpsURLConnection = (HttpsURLConnection) new URL(strK).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry entry : ((HashMap) this.C).entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[8192];
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            int i10 = bufferedReader.read(cArr);
                            if (i10 == -1) {
                                break;
                            }
                            sb2.append(cArr, 0, i10);
                        }
                        string = sb2.toString();
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                a2.n nVar = new a2.n();
                nVar.f167b = responseCode;
                nVar.f166a = string;
                return nVar;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection = null;
        }
    }

    public java.lang.Object o(m00.c r6) {
        throw new UnsupportedOperationException("Method not decompiled: sd.p1.o(m00.c):java.lang.Object");
    }

    public void p() {
        h1.l lVar = (h1.l) this.C;
        cd.b bVar = (cd.b) this.D;
        try {
            od.a aVarT0 = ((h1.l) this.B).T0();
            bVar.b("Loaded old identity: " + aVarT0);
            String str = aVarT0.f11927a;
            if (str != null) {
                lVar.Y0(str);
            }
            String str2 = aVarT0.f11928b;
            if (str2 != null) {
                lVar.X0(str2);
            }
        } catch (Exception e3) {
            bVar.a("Unable to migrate file identity storage: " + e3.getMessage());
        }
    }

    public t3.b q() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((tf.y) this.D)) {
            try {
                t3.b bVar = (t3.b) this.C;
                if (bVar != null && localeList == ((LocaleList) this.B)) {
                    return bVar;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(new t3.a(localeList.get(i10)));
                }
                t3.b bVar2 = new t3.b(arrayList);
                this.B = localeList;
                this.C = bVar2;
                return bVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void r(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        tf.t0 t0Var;
        tf.m mVar;
        String strSubstring;
        Object obj;
        switch (this.A) {
            case 6:
                ((y3) this.D).u(true, i10, th2, bArr, (String) this.B, (ArrayList) this.C);
                return;
            default:
                long j9 = ((a4) this.C).f14527a;
                y3 y3Var = (y3) this.D;
                String str2 = (String) this.B;
                y3Var.C().V0();
                y3Var.j0();
                if (bArr == null) {
                    try {
                        bArr = new byte[0];
                    } finally {
                        y3Var.U = false;
                        y3Var.L();
                    }
                }
                if (i10 == 200) {
                    if (th2 == null) {
                        tf.m mVar2 = y3Var.C;
                        y3.R(mVar2);
                        mVar2.c1(Long.valueOf(j9));
                        y3Var.t().O.d("Successfully uploaded batch from upload queue. appId, status", str2, Integer.valueOf(i10));
                        t0Var = y3Var.B;
                        y3.R(t0Var);
                        if (t0Var.p1()) {
                            mVar = y3Var.C;
                            y3.R(mVar);
                            if (mVar.b1(str2)) {
                                y3Var.o(str2);
                            } else {
                                y3Var.K();
                            }
                        } else {
                            y3Var.K();
                        }
                    } else {
                        String str3 = new String(bArr, StandardCharsets.UTF_8);
                        strSubstring = str3.substring(0, Math.min(32, str3.length()));
                        b50.b bVar = y3Var.t().L;
                        Integer numValueOf = Integer.valueOf(i10);
                        obj = th2;
                        if (th2 == null) {
                            obj = strSubstring;
                        }
                        bVar.e("Network upload failed. Will retry later. appId, status, error", str2, numValueOf, obj);
                        tf.m mVar3 = y3Var.C;
                        y3.R(mVar3);
                        mVar3.h1(Long.valueOf(j9));
                        y3Var.K();
                    }
                } else if (i10 == 204) {
                    i10 = 204;
                    if (th2 == null) {
                        tf.m mVar4 = y3Var.C;
                        y3.R(mVar4);
                        mVar4.c1(Long.valueOf(j9));
                        y3Var.t().O.d("Successfully uploaded batch from upload queue. appId, status", str2, Integer.valueOf(i10));
                        t0Var = y3Var.B;
                        y3.R(t0Var);
                        if (t0Var.p1()) {
                            mVar = y3Var.C;
                            y3.R(mVar);
                            if (mVar.b1(str2)) {
                                y3Var.o(str2);
                            } else {
                                y3Var.K();
                            }
                        } else {
                            y3Var.K();
                        }
                    } else {
                        String str4 = new String(bArr, StandardCharsets.UTF_8);
                        strSubstring = str4.substring(0, Math.min(32, str4.length()));
                        b50.b bVar2 = y3Var.t().L;
                        Integer numValueOf2 = Integer.valueOf(i10);
                        obj = th2;
                        if (th2 == null) {
                            obj = strSubstring;
                        }
                        bVar2.e("Network upload failed. Will retry later. appId, status, error", str2, numValueOf2, obj);
                        tf.m mVar5 = y3Var.C;
                        y3.R(mVar5);
                        mVar5.h1(Long.valueOf(j9));
                        y3Var.K();
                    }
                } else {
                    String str5 = new String(bArr, StandardCharsets.UTF_8);
                    strSubstring = str5.substring(0, Math.min(32, str5.length()));
                    b50.b bVar3 = y3Var.t().L;
                    Integer numValueOf3 = Integer.valueOf(i10);
                    obj = th2;
                    if (th2 == null) {
                        obj = strSubstring;
                    }
                    bVar3.e("Network upload failed. Will retry later. appId, status, error", str2, numValueOf3, obj);
                    tf.m mVar6 = y3Var.C;
                    y3.R(mVar6);
                    mVar6.h1(Long.valueOf(j9));
                    y3Var.K();
                }
                return;
        }
    }

    public h2.a s() {
        int i10;
        float fC;
        int i11;
        r0 r0Var = (r0) this.B;
        c0 c0Var = r0Var.f14074r;
        c0 c0Var2 = r0Var.f14075s;
        if (c0Var == null || c0Var.g() || (i10 = c0Var.B) == 9 || i10 == 2 || i10 == 3) {
            return new h2.a(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fC2 = c0Var.c();
        if (c0Var2 == null) {
            h2.a aVar = ((r0) this.B).f13962o;
            fC = aVar != null ? (aVar.f6543e * fC2) / aVar.f6542d : fC2;
        } else {
            if (c0Var2.g() || (i11 = c0Var2.B) == 9 || i11 == 2 || i11 == 3) {
                return new h2.a(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fC = c0Var2.c();
        }
        return new h2.a(0.0f, 0.0f, fC2, fC);
    }

    @Override
    public void shutdown() {
        ((ConnectivityManager) this.B).unregisterNetworkCallback((com.google.android.gms.internal.cast.h2) this.D);
    }

    public boolean v(CharSequence charSequence, int i10, int i11, v5.r rVar) {
        if ((rVar.f15480c & 3) == 0) {
            v5.d dVar = (v5.d) this.D;
            w5.a aVarB = rVar.b();
            int iA = aVarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) ((i00.e) aVarB).D).getShort(iA + ((i00.e) aVarB).A);
            }
            v5.b bVar = (v5.b) dVar;
            bVar.getClass();
            ThreadLocal threadLocal = v5.b.f15458b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i10 < i11) {
                sb2.append(charSequence.charAt(i10));
                i10++;
            }
            boolean zHasGlyph = bVar.f15459a.hasGlyph(sb2.toString());
            int i12 = rVar.f15480c & 4;
            rVar.f15480c = zHasGlyph ? i12 | 2 : i12 | 1;
        }
        return (rVar.f15480c & 3) == 2;
    }

    public void w(String str, String str2) {
        ((HashMap) this.C).put(str, str2);
    }

    public Object x(m00.c cVar) {
        sv.b bVar;
        dh.o oVar = (dh.o) this.C;
        if (cVar instanceof sv.b) {
            bVar = (sv.b) cVar;
            int i10 = bVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.C = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new sv.b(this, cVar);
            }
        } else {
            bVar = new sv.b(this, cVar);
        }
        Object objS = bVar.A;
        l00.a aVar = l00.a.A;
        int i11 = bVar.C;
        if (i11 == 0) {
            ri.t1.O(objS);
            bVar.C = 1;
            objS = d40.o.s(((jo.d) this.D).a(), bVar);
            if (objS == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(objS);
        }
        if (((List) objS).isEmpty()) {
            return null;
        }
        return dh.o.d(oVar, "stories", oVar.k(2131886148), null, null, new Integer(2131231360), oVar.k(2131886154), qv.a.A, qv.a.B, 12);
    }

    public boolean y() {
        if (((p2) this.B).getValue() != this.D) {
            return true;
        }
        p1 p1Var = (p1) this.C;
        return p1Var != null && p1Var.y();
    }

    public java.lang.Object z(m00.c r18) {
        throw new UnsupportedOperationException("Method not decompiled: sd.p1.z(m00.c):java.lang.Object");
    }
}
