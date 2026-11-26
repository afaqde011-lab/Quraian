package tf;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.o4;
import com.google.android.gms.internal.measurement.p4;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class i2 extends d0 {
    public bd.c D;
    public q3.e0 E;
    public final CopyOnWriteArraySet F;
    public boolean G;
    public final AtomicReference H;
    public final Object I;
    public boolean J;
    public int K;
    public y1 L;
    public y1 M;
    public PriorityQueue N;
    public boolean O;
    public t1 P;
    public final AtomicLong Q;
    public long R;
    public final g1 S;
    public boolean T;
    public y1 U;
    public h2 V;
    public y1 W;
    public final o9.q X;

    public i2(h1 h1Var) {
        super(h1Var);
        this.F = new CopyOnWriteArraySet();
        this.I = new Object();
        this.J = false;
        this.K = 1;
        this.T = true;
        this.X = new o9.q(this, 19);
        this.H = new AtomicReference();
        this.P = t1.f14700c;
        this.R = -1L;
        this.Q = new AtomicLong(0L);
        this.S = new g1(h1Var);
    }

    @Override
    public final boolean Y0() {
        return false;
    }

    public final void Z0(t1 t1Var) {
        V0();
        boolean z10 = (t1Var.i(s1.ANALYTICS_STORAGE) && t1Var.i(s1.AD_STORAGE)) || ((h1) this.B).j().e1();
        h1 h1Var = (h1) this.B;
        e1 e1Var = h1Var.G;
        h1.g(e1Var);
        e1Var.V0();
        if (z10 != h1Var.Z) {
            e1 e1Var2 = h1Var.G;
            h1.g(e1Var2);
            e1Var2.V0();
            h1Var.Z = z10;
            w0 w0Var = ((h1) this.B).E;
            h1.e(w0Var);
            w0Var.V0();
            Boolean boolValueOf = w0Var.Z0().contains("measurement_enabled_from_api") ? Boolean.valueOf(w0Var.Z0().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z10 || boolValueOf == null || boolValueOf.booleanValue()) {
                m1(Boolean.valueOf(z10), false);
            }
        }
    }

    public final void a1(java.lang.String r13, java.lang.String r14, android.os.Bundle r15, boolean r16, boolean r17, long r18) {
        throw new UnsupportedOperationException("Method not decompiled: tf.i2.a1(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    public final void b1() {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        k3 k3Var;
        k3 k3Var2;
        i2 i2Var;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        String strA;
        c50.h hVar;
        fh.s2 s2VarK;
        p4 p4Var;
        Map mapE;
        p4 p4Var2;
        V0();
        h1 h1Var = (h1) this.B;
        q0 q0Var = h1Var.F;
        ve.b bVar = h1Var.K;
        h1.g(q0Var);
        q0Var.N.b("Handle tcf update.");
        w0 w0Var = h1Var.E;
        h1.e(w0Var);
        SharedPreferences sharedPreferencesA1 = w0Var.a1();
        HashMap map = new HashMap();
        a0 a0Var = b0.Z0;
        int i19 = 2;
        if (((Boolean) a0Var.a(null)).booleanValue()) {
            fh.d2 d2Var = m3.f14668a;
            o4 o4Var = o4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            l3 l3Var = l3.A;
            Map.Entry entry = Map.entry(o4Var, l3Var);
            o4 o4Var2 = o4.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            l3 l3Var2 = l3.B;
            Map.Entry entry2 = Map.entry(o4Var2, l3Var2);
            o4 o4Var3 = o4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
            Map.Entry entry3 = Map.entry(o4Var3, l3Var);
            o4 o4Var4 = o4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
            Map.Entry entry4 = Map.entry(o4Var4, l3Var);
            o4 o4Var5 = o4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
            List listAsList = Arrays.asList(entry, entry2, entry3, entry4, Map.entry(o4Var5, l3Var2), Map.entry(o4.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, l3Var2), Map.entry(o4.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, l3Var2));
            c50.h hVar2 = new c50.h(listAsList != null ? listAsList.size() : 4, 7);
            hVar2.A(listAsList);
            fh.i2 i2VarC = hVar2.c(true);
            int i20 = fh.e1.C;
            fh.q2 q2Var = new fh.q2("CH");
            char[] cArr = new char[5];
            boolean zContains = sharedPreferencesA1.contains("IABTCF_TCString");
            try {
                i14 = sharedPreferencesA1.getInt("IABTCF_CmpSdkID", -1);
            } catch (ClassCastException unused) {
                i14 = -1;
            }
            try {
                try {
                    try {
                        try {
                            i15 = sharedPreferencesA1.getInt("IABTCF_PolicyVersion", -1);
                            while (true) {
                                boolean zHasNext = s2VarK.hasNext();
                                p4Var = p4.PURPOSE_RESTRICTION_UNDEFINED;
                                fh.s2 s2Var = s2VarK;
                                if (!zHasNext) {
                                    break;
                                }
                                o4 o4Var6 = (o4) s2Var.next();
                                int iZza = o4Var6.zza();
                                char[] cArr2 = cArr;
                                String str2 = strA;
                                StringBuilder sb2 = new StringBuilder(String.valueOf(iZza).length() + 28);
                                sb2.append("IABTCF_PublisherRestrictions");
                                sb2.append(iZza);
                                String strA2 = m3.a(sharedPreferencesA1, sb2.toString());
                                if (TextUtils.isEmpty(strA2) || strA2.length() < 755) {
                                    p4Var2 = p4Var;
                                } else {
                                    int iDigit = Character.digit(strA2.charAt(754), 10);
                                    p4Var2 = p4.PURPOSE_RESTRICTION_NOT_ALLOWED;
                                    if (iDigit >= 0 && iDigit <= p4.values().length && iDigit != 0) {
                                        if (iDigit == 1) {
                                            p4Var = p4.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                                        } else if (iDigit == i19) {
                                            p4Var = p4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                                        }
                                        p4Var2 = p4Var;
                                    }
                                }
                                hVar.z(o4Var6, p4Var2);
                                s2VarK = s2Var;
                                cArr = cArr2;
                                strA = str2;
                                i19 = 2;
                            }
                        } catch (ClassCastException unused2) {
                            i15 = -1;
                        }
                        i18 = sharedPreferencesA1.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
                    } catch (ClassCastException unused3) {
                        i18 = -1;
                    }
                    i16 = sharedPreferencesA1.getInt("IABTCF_gdprApplies", -1);
                } catch (ClassCastException unused4) {
                    i16 = -1;
                }
                i17 = sharedPreferencesA1.getInt("IABTCF_PurposeOneTreatment", -1);
            } catch (ClassCastException unused5) {
                i17 = -1;
            }
            int i21 = i15;
            strA = m3.a(sharedPreferencesA1, "IABTCF_PublisherCC");
            int i22 = i14;
            hVar = new c50.h(4, 7);
            s2VarK = i2VarC.keySet().iterator();
            char[] cArr3 = cArr;
            String str3 = strA;
            fh.i2 i2VarC2 = hVar.c(true);
            String strA3 = m3.a(sharedPreferencesA1, "IABTCF_PurposeConsents");
            String strA4 = m3.a(sharedPreferencesA1, "IABTCF_VendorConsents");
            boolean z10 = !TextUtils.isEmpty(strA4) && strA4.length() >= 755 && strA4.charAt(754) == '1';
            String strA5 = m3.a(sharedPreferencesA1, "IABTCF_PurposeLegitimateInterests");
            String strA6 = m3.a(sharedPreferencesA1, "IABTCF_VendorLegitimateInterests");
            boolean z11 = !TextUtils.isEmpty(strA6) && strA6.length() >= 755 && strA6.charAt(754) == '1';
            cArr3[0] = '2';
            if (zContains) {
                p4 p4Var3 = (p4) i2VarC2.get(o4Var);
                p4 p4Var4 = (p4) i2VarC2.get(o4Var3);
                p4 p4Var5 = (p4) i2VarC2.get(o4Var4);
                p4 p4Var6 = (p4) i2VarC2.get(o4Var5);
                c50.h hVar3 = new c50.h(4, 7);
                hVar3.z("Version", "2");
                boolean z12 = z10;
                hVar3.z("VendorConsent", true != z10 ? "0" : "1");
                hVar3.z("VendorLegitimateInterest", true != z11 ? "0" : "1");
                hVar3.z("gdprApplies", i16 != 1 ? "0" : "1");
                hVar3.z("EnableAdvertiserConsentMode", i18 != 1 ? "0" : "1");
                hVar3.z("PolicyVersion", String.valueOf(i21));
                hVar3.z("CmpSdkID", String.valueOf(i22));
                hVar3.z("PurposeOneTreatment", i17 != 1 ? "0" : "1");
                hVar3.z("PublisherCC", str3);
                hVar3.z("PublisherRestrictions1", String.valueOf(p4Var3 != null ? p4Var3.zza() : p4Var.zza()));
                hVar3.z("PublisherRestrictions3", String.valueOf(p4Var4 != null ? p4Var4.zza() : p4Var.zza()));
                hVar3.z("PublisherRestrictions4", String.valueOf(p4Var5 != null ? p4Var5.zza() : p4Var.zza()));
                hVar3.z("PublisherRestrictions7", String.valueOf(p4Var6 != null ? p4Var6.zza() : p4Var.zza()));
                String strD = m3.d(o4Var, strA3, strA5);
                String strD2 = m3.d(o4Var3, strA3, strA5);
                int i23 = i17;
                String strD3 = m3.d(o4Var4, strA3, strA5);
                String strD4 = m3.d(o4Var5, strA3, strA5);
                fh.w.f("Purpose1", strD);
                fh.w.f("Purpose3", strD2);
                fh.w.f("Purpose4", strD3);
                fh.w.f("Purpose7", strD4);
                hVar3.A(fh.i2.h(4, new Object[]{"Purpose1", strD, "Purpose3", strD2, "Purpose4", strD3, "Purpose7", strD4}, null).entrySet());
                boolean z13 = z11;
                int i24 = i18;
                int i25 = i16;
                mapE = hVar3.B(fh.i2.h(5, new Object[]{"AuthorizePurpose1", true != m3.b(o4Var, i2VarC, i2VarC2, q2Var, cArr3, i24, i25, i23, str3, strA3, strA5, z12, z13) ? "0" : "1", "AuthorizePurpose3", true != m3.b(o4Var3, i2VarC, i2VarC2, q2Var, cArr3, i24, i25, i23, str3, strA3, strA5, z12, z13) ? "0" : "1", "AuthorizePurpose4", true != m3.b(o4Var4, i2VarC, i2VarC2, q2Var, cArr3, i24, i25, i23, str3, strA3, strA5, z12, z13) ? "0" : "1", "AuthorizePurpose7", true != m3.b(o4Var5, i2VarC, i2VarC2, q2Var, cArr3, i24, i25, i23, str3, strA3, strA5, z12, z13) ? "0" : "1", "PurposeDiagnostics", new String(cArr3)}, null)).e();
            } else {
                mapE = fh.i2.G;
            }
            k3Var = new k3(mapE);
            str = RuntimeVersion.SUFFIX;
        } else {
            String strA7 = m3.a(sharedPreferencesA1, "IABTCF_VendorConsents");
            str = RuntimeVersion.SUFFIX;
            if (!str.equals(strA7) && strA7.length() > 754) {
                map.put("GoogleConsent", String.valueOf(strA7.charAt(754)));
            }
            try {
                i10 = sharedPreferencesA1.getInt("IABTCF_gdprApplies", -1);
            } catch (ClassCastException unused6) {
                i10 = -1;
            }
            if (i10 != -1) {
                map.put("gdprApplies", String.valueOf(i10));
            }
            try {
                i11 = sharedPreferencesA1.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
            } catch (ClassCastException unused7) {
                i11 = -1;
            }
            if (i11 != -1) {
                map.put("EnableAdvertiserConsentMode", String.valueOf(i11));
            }
            try {
                i12 = sharedPreferencesA1.getInt("IABTCF_PolicyVersion", -1);
            } catch (ClassCastException unused8) {
                i12 = -1;
            }
            if (i12 != -1) {
                map.put("PolicyVersion", String.valueOf(i12));
            }
            String strA8 = m3.a(sharedPreferencesA1, "IABTCF_PurposeConsents");
            if (!str.equals(strA8)) {
                map.put("PurposeConsents", strA8);
            }
            try {
                i13 = sharedPreferencesA1.getInt("IABTCF_CmpSdkID", -1);
            } catch (ClassCastException unused9) {
                i13 = -1;
            }
            if (i13 != -1) {
                map.put("CmpSdkID", String.valueOf(i13));
            }
            k3Var = new k3(map);
        }
        h1.g(q0Var);
        b50.b bVar2 = q0Var.O;
        bVar2.c(k3Var, "Tcf preferences read");
        if (!h1Var.D.f1(null, a0Var)) {
            if (w0Var.d1(k3Var)) {
                Bundle bundleB = k3Var.b();
                h1.g(q0Var);
                bVar2.c(bundleB, "Consent generated from Tcf");
                if (bundleB != Bundle.EMPTY) {
                    bVar.getClass();
                    p1(bundleB, -30, System.currentTimeMillis());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", k3Var.c());
                c1("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        w0Var.V0();
        String string = w0Var.Z0().getString("stored_tcf_param", str);
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            k3Var2 = new k3(map2);
        } else {
            for (String str4 : string.split(";")) {
                String[] strArrSplit = str4.split("=");
                if (strArrSplit.length >= 2 && m3.f14668a.contains(strArrSplit[0])) {
                    map2.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            k3Var2 = new k3(map2);
        }
        if (w0Var.d1(k3Var)) {
            Bundle bundleB2 = k3Var.b();
            h1.g(q0Var);
            bVar2.c(bundleB2, "Consent generated from Tcf");
            if (bundleB2 != Bundle.EMPTY) {
                bVar.getClass();
                i2Var = this;
                i2Var.p1(bundleB2, -30, System.currentTimeMillis());
            } else {
                i2Var = this;
            }
            Bundle bundle2 = new Bundle();
            HashMap map3 = k3Var2.f14654a;
            String str5 = (map3.isEmpty() || ((String) map3.get("Version")) != null) ? "0" : "1";
            Bundle bundleB3 = k3Var.b();
            Bundle bundleB4 = k3Var2.b();
            bundle2.putString("_tcfm", str5.concat((bundleB3.size() == bundleB4.size() && Objects.equals(bundleB3.getString("ad_storage"), bundleB4.getString("ad_storage")) && Objects.equals(bundleB3.getString("ad_personalization"), bundleB4.getString("ad_personalization")) && Objects.equals(bundleB3.getString("ad_user_data"), bundleB4.getString("ad_user_data"))) ? "0" : "1"));
            String str6 = (String) k3Var.f14654a.get("PurposeDiagnostics");
            if (TextUtils.isEmpty(str6)) {
                str6 = "200000";
            }
            bundle2.putString("_tcfd2", str6);
            bundle2.putString("_tcfd", k3Var.c());
            i2Var.c1("auto", "_tcf", bundle2);
        }
    }

    public final void c1(String str, String str2, Bundle bundle) {
        V0();
        ((h1) this.B).K.getClass();
        d1(System.currentTimeMillis(), bundle, str, str2);
    }

    public final void d1(long j9, Bundle bundle, String str, String str2) {
        V0();
        boolean z10 = true;
        if (this.E != null && !e4.t1(str2)) {
            z10 = false;
        }
        e1(str, str2, j9, bundle, true, z10, true);
    }

    public final void e1(String str, String str2, long j9, Bundle bundle, boolean z10, boolean z11, boolean z12) {
        w0 w0Var;
        w0 w0Var2;
        o9.q qVar;
        boolean z13;
        h1 h1Var;
        int iZ1;
        Bundle bundleD1;
        String str3;
        long j10;
        String strP;
        ArrayList arrayList;
        boolean zA;
        i2 i2Var;
        long j11;
        int i10;
        long j12;
        ArrayList arrayList2;
        int size;
        int i11;
        int i12;
        Bundle bundleW1;
        String str4;
        Bundle bundle2;
        l0 l0VarI;
        byte[] bArrMarshall;
        boolean zC1;
        Iterator it;
        String str5;
        Object obj;
        Bundle[] bundleArr;
        int length;
        String str6 = str;
        com.google.android.gms.common.internal.d0.e(str6);
        com.google.android.gms.common.internal.d0.h(bundle);
        V0();
        W0();
        h1 h1Var2 = (h1) this.B;
        boolean zA2 = h1Var2.a();
        j3 j3Var = h1Var2.H;
        g gVar = h1Var2.D;
        Context context = h1Var2.A;
        e4 e4Var = h1Var2.I;
        q0 q0Var = h1Var2.F;
        if (!zA2) {
            h1.g(q0Var);
            q0Var.N.b("Event not sent since app measurement is disabled");
            return;
        }
        List list = h1Var2.l().L;
        if (list != null && !list.contains(str2)) {
            h1.g(q0Var);
            q0Var.N.d("Dropping non-safelisted event. event name, origin", str2, str6);
            return;
        }
        if (!this.G) {
            this.G = true;
            try {
                try {
                    (!h1Var2.B ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e3) {
                    h1.g(q0Var);
                    q0Var.J.c(e3, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                h1.g(q0Var);
                q0Var.M.b("Tag Manager is not found and thus will not be used");
            }
        }
        m0 m0Var = h1Var2.J;
        w0 w0Var3 = h1Var2.E;
        ve.b bVar = h1Var2.K;
        if (!gVar.f1(null, b0.f14562f1) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            bVar.getClass();
            w0Var = w0Var3;
            g1(System.currentTimeMillis(), string, "auto", "_lgclid");
        } else {
            w0Var = w0Var3;
        }
        if (!z10 || e4.K[0].equals(str2)) {
            w0Var2 = w0Var;
        } else {
            h1.e(e4Var);
            h1.e(w0Var);
            w0Var2 = w0Var;
            e4Var.g1(bundle, w0Var2.Z.F());
        }
        o9.q qVar2 = this.X;
        if (!z12 && !"_iap".equals(str2)) {
            h1.e(e4Var);
            int i13 = 2;
            if (e4Var.V1("event", str2)) {
                if (e4Var.X1("event", u1.f14727a, u1.f14728b, str2)) {
                    ((h1) e4Var.B).getClass();
                    if (e4Var.Y1("event", 40, str2)) {
                        i13 = 0;
                    }
                } else {
                    i13 = 13;
                }
            }
            if (i13 != 0) {
                h1.g(q0Var);
                q0Var.I.c(m0Var.a(str2), "Invalid public event name. Event will not be logged (FE)");
                h1.e(e4Var);
                e4.l1(qVar2, null, i13, "_ev", e4.a1(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
        }
        t2 t2Var = h1Var2.L;
        h1.f(t2Var);
        q2 q2VarB1 = t2Var.b1(false);
        if (q2VarB1 != null && !bundle.containsKey("_sc")) {
            q2VarB1.f14697d = true;
        }
        e4.M1(q2VarB1, bundle, z10 && !z12);
        boolean zEquals = "am".equals(str6);
        boolean zT1 = e4.t1(str2);
        if (z10) {
            qVar = qVar2;
            if (this.E != null && !zT1) {
                if (!zEquals) {
                    h1.g(q0Var);
                    q0Var.N.d("Passing event to registered event handler (FE)", m0Var.a(str2), m0Var.e(bundle));
                    com.google.android.gms.common.internal.d0.h(this.E);
                    q3.e0 e0Var = this.E;
                    e0Var.getClass();
                    try {
                        ((com.google.android.gms.internal.measurement.p0) e0Var.B).K(j9, bundle, str6, str2);
                        return;
                    } catch (RemoteException e10) {
                        h1 h1Var3 = ((AppMeasurementDynamiteService) e0Var.C).f4066e;
                        if (h1Var3 != null) {
                            q0 q0Var2 = h1Var3.F;
                            h1.g(q0Var2);
                            q0Var2.J.c(e10, "Event interceptor threw exception");
                            return;
                        }
                        return;
                    }
                }
                z13 = true;
            }
            if (h1Var2.c()) {
                h1.e(e4Var);
                h1Var = (h1) e4Var.B;
                iZ1 = e4Var.Z1(str2);
                if (iZ1 != 0) {
                    h1.g(q0Var);
                    q0Var.I.c(m0Var.a(str2), "Invalid event name. Event will not be logged (FE)");
                    String strA1 = e4.a1(str2, 40, true);
                    if (str2 != null) {
                        length = str2.length();
                    } else {
                        length = 0;
                    }
                    h1.e(e4Var);
                    e4.l1(qVar, null, iZ1, "_ev", strA1, length);
                    return;
                }
                bundleD1 = e4Var.d1(str2, bundle, Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z12);
                com.google.android.gms.common.internal.d0.h(bundleD1);
                h1.f(t2Var);
                if (t2Var.b1(false) == null && "_ae".equals(str2)) {
                    h1.f(j3Var);
                    s7.w0 w0Var4 = j3Var.G;
                    ((h1) ((j3) w0Var4.D).B).K.getClass();
                    j10 = 0;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    str3 = "_o";
                    long j13 = jElapsedRealtime - w0Var4.B;
                    w0Var4.B = jElapsedRealtime;
                    if (j13 > 0) {
                        e4Var.C1(bundleD1, j13);
                    }
                } else {
                    str3 = "_o";
                    j10 = 0;
                }
                if ("auto".equals(str6) && "_ssr".equals(str2)) {
                    String string2 = bundleD1.getString("_ffr");
                    int i14 = ve.e.f15628a;
                    if (string2 == null || string2.trim().isEmpty()) {
                        string2 = null;
                    } else if (string2 != null) {
                        string2 = string2.trim();
                    }
                    w0 w0Var5 = r34.E;
                    h1.e(w0Var5);
                    if (Objects.equals(string2, w0Var5.W.p())) {
                        q0 q0Var3 = r34.F;
                        h1.g(q0Var3);
                        q0Var3.N.b("Not logging duplicate session_start_with_rollout event");
                        return;
                    } else {
                        w0 w0Var6 = h1Var.E;
                        h1.e(w0Var6);
                        w0Var6.W.r(string2);
                    }
                } else if ("_ae".equals(str2)) {
                    w0 w0Var7 = h1Var.E;
                    h1.e(w0Var7);
                    strP = w0Var7.W.p();
                    if (!TextUtils.isEmpty(strP)) {
                        bundleD1.putString("_ffr", strP);
                    }
                }
                arrayList = new ArrayList();
                arrayList.add(bundleD1);
                if (gVar.f1(null, b0.U0)) {
                    h1.f(j3Var);
                    j3Var.V0();
                    zA = j3Var.E;
                } else {
                    h1.e(w0Var2);
                    zA = w0Var2.T.a();
                }
                h1.e(w0Var2);
                if (w0Var2.Q.e() <= j10 && w0Var2.f1(j9) && zA) {
                    h1.g(q0Var);
                    q0Var.O.b("Current session is expired, remove the session number, ID, and engagement time");
                    bVar.getClass();
                    i10 = 0;
                    j11 = j10;
                    g1(System.currentTimeMillis(), null, "auto", "_sid");
                    bVar.getClass();
                    g1(System.currentTimeMillis(), null, "auto", "_sno");
                    bVar.getClass();
                    g1(System.currentTimeMillis(), null, "auto", "_se");
                    i2Var = this;
                    w0Var2.R.f(j11);
                } else {
                    i2Var = this;
                    j11 = j10;
                    i10 = 0;
                }
                if (bundleD1.getLong("extend_session", j11) == 1) {
                    h1.g(q0Var);
                    q0Var.O.b("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                    h1.f(j3Var);
                    j12 = j9;
                    j3Var.F.a0(j12);
                } else {
                    j12 = j9;
                }
                arrayList2 = new ArrayList(bundleD1.keySet());
                Collections.sort(arrayList2);
                size = arrayList2.size();
                for (i11 = i10; i11 < size; i11++) {
                    str5 = (String) arrayList2.get(i11);
                    if (str5 != null) {
                        h1.e(e4Var);
                        obj = bundleD1.get(str5);
                        if (obj instanceof Bundle) {
                            Bundle[] bundleArr2 = new Bundle[1];
                            bundleArr2[i10] = (Bundle) obj;
                            bundleArr = bundleArr2;
                        } else if (obj instanceof Parcelable[]) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                        } else if (obj instanceof ArrayList) {
                            ArrayList arrayList3 = (ArrayList) obj;
                            bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                        } else {
                            bundleArr = null;
                        }
                        if (bundleArr != null) {
                            bundleD1.putParcelableArray(str5, bundleArr);
                        }
                    }
                }
                i12 = i10;
                while (i12 < arrayList.size()) {
                    bundleW1 = (Bundle) arrayList.get(i12);
                    if (i12 != 0) {
                        str4 = "_ep";
                    } else {
                        str4 = str2;
                    }
                    String str7 = str3;
                    bundleW1.putString(str7, str6);
                    if (z11) {
                        bundleW1 = e4Var.w1(bundleW1);
                    }
                    bundle2 = bundleW1;
                    s sVar = new s(str4, new r(bundle2), str6, j12);
                    c3 c3VarJ = h1Var2.j();
                    c3VarJ.getClass();
                    c3VarJ.V0();
                    c3VarJ.W0();
                    c3VarJ.h1();
                    l0VarI = ((h1) c3VarJ.B).i();
                    l0VarI.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    le.b.a(sVar, parcelObtain, i10);
                    bArrMarshall = parcelObtain.marshall();
                    parcelObtain.recycle();
                    if (bArrMarshall.length > 131072) {
                        q0 q0Var4 = ((h1) l0VarI.B).F;
                        h1.g(q0Var4);
                        q0Var4.H.b("Event is too long for local database. Sending event directly to service");
                        zC1 = false;
                    } else {
                        zC1 = l0VarI.c1(0, bArrMarshall);
                    }
                    c3VarJ.j1(new oe.j(c3VarJ, c3VarJ.l1(true), zC1, sVar, 2));
                    if (!z13) {
                        it = i2Var.F.iterator();
                        while (it.hasNext()) {
                            ((v1) it.next()).a(j9, new Bundle(bundle2), str, str2);
                        }
                    }
                    i12++;
                    str6 = str;
                    j12 = j9;
                    str3 = str7;
                    i10 = 0;
                }
                h1.f(t2Var);
                if (t2Var.b1(false) == null && "_ae".equals(str2)) {
                    h1.f(j3Var);
                    bVar.getClass();
                    j3Var.G.h(SystemClock.elapsedRealtime(), true, true);
                    return;
                }
            }
            return;
        }
        qVar = qVar2;
        z13 = zEquals;
        if (h1Var2.c()) {
            return;
        }
        h1.e(e4Var);
        h1Var = (h1) e4Var.B;
        iZ1 = e4Var.Z1(str2);
        if (iZ1 != 0) {
            h1.g(q0Var);
            q0Var.I.c(m0Var.a(str2), "Invalid event name. Event will not be logged (FE)");
            String strA2 = e4.a1(str2, 40, true);
            if (str2 != null) {
                length = str2.length();
            } else {
                length = 0;
            }
            h1.e(e4Var);
            e4.l1(qVar, null, iZ1, "_ev", strA2, length);
            return;
        }
        bundleD1 = e4Var.d1(str2, bundle, Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z12);
        com.google.android.gms.common.internal.d0.h(bundleD1);
        h1.f(t2Var);
        if (t2Var.b1(false) == null) {
            str3 = "_o";
            j10 = 0;
        } else {
            str3 = "_o";
            j10 = 0;
        }
        if ("auto".equals(str6)) {
            if ("_ae".equals(str2)) {
                w0 w0Var8 = h1Var.E;
                h1.e(w0Var8);
                strP = w0Var8.W.p();
                if (!TextUtils.isEmpty(strP)) {
                    bundleD1.putString("_ffr", strP);
                }
            }
        } else if ("_ae".equals(str2)) {
            w0 w0Var9 = h1Var.E;
            h1.e(w0Var9);
            strP = w0Var9.W.p();
            if (!TextUtils.isEmpty(strP)) {
                bundleD1.putString("_ffr", strP);
            }
        }
        arrayList = new ArrayList();
        arrayList.add(bundleD1);
        if (gVar.f1(null, b0.U0)) {
            h1.f(j3Var);
            j3Var.V0();
            zA = j3Var.E;
        } else {
            h1.e(w0Var2);
            zA = w0Var2.T.a();
        }
        h1.e(w0Var2);
        if (w0Var2.Q.e() <= j10) {
            i2Var = this;
            j11 = j10;
            i10 = 0;
        } else {
            i2Var = this;
            j11 = j10;
            i10 = 0;
        }
        if (bundleD1.getLong("extend_session", j11) == 1) {
            h1.g(q0Var);
            q0Var.O.b("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
            h1.f(j3Var);
            j12 = j9;
            j3Var.F.a0(j12);
        } else {
            j12 = j9;
        }
        arrayList2 = new ArrayList(bundleD1.keySet());
        Collections.sort(arrayList2);
        size = arrayList2.size();
        while (i11 < size) {
            str5 = (String) arrayList2.get(i11);
            if (str5 != null) {
                h1.e(e4Var);
                obj = bundleD1.get(str5);
                if (obj instanceof Bundle) {
                    Bundle[] bundleArr3 = new Bundle[1];
                    bundleArr3[i10] = (Bundle) obj;
                    bundleArr = bundleArr3;
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                    bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr2, parcelableArr2.length, Bundle[].class);
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList4 = (ArrayList) obj;
                    bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                } else {
                    bundleArr = null;
                }
                if (bundleArr != null) {
                    bundleD1.putParcelableArray(str5, bundleArr);
                }
            }
        }
        i12 = i10;
        while (i12 < arrayList.size()) {
            bundleW1 = (Bundle) arrayList.get(i12);
            if (i12 != 0) {
                str4 = "_ep";
            } else {
                str4 = str2;
            }
            String str8 = str3;
            bundleW1.putString(str8, str6);
            if (z11) {
                bundleW1 = e4Var.w1(bundleW1);
            }
            bundle2 = bundleW1;
            s sVar2 = new s(str4, new r(bundle2), str6, j12);
            c3 c3VarJ2 = h1Var2.j();
            c3VarJ2.getClass();
            c3VarJ2.V0();
            c3VarJ2.W0();
            c3VarJ2.h1();
            l0VarI = ((h1) c3VarJ2.B).i();
            l0VarI.getClass();
            Parcel parcelObtain2 = Parcel.obtain();
            le.b.a(sVar2, parcelObtain2, i10);
            bArrMarshall = parcelObtain2.marshall();
            parcelObtain2.recycle();
            if (bArrMarshall.length > 131072) {
                q0 q0Var5 = ((h1) l0VarI.B).F;
                h1.g(q0Var5);
                q0Var5.H.b("Event is too long for local database. Sending event directly to service");
                zC1 = false;
            } else {
                zC1 = l0VarI.c1(0, bArrMarshall);
            }
            c3VarJ2.j1(new oe.j(c3VarJ2, c3VarJ2.l1(true), zC1, sVar2, 2));
            if (!z13) {
                it = i2Var.F.iterator();
                while (it.hasNext()) {
                    ((v1) it.next()).a(j9, new Bundle(bundle2), str, str2);
                }
            }
            i12++;
            str6 = str;
            j12 = j9;
            str3 = str8;
            i10 = 0;
        }
        h1.f(t2Var);
        if (t2Var.b1(false) == null) {
        }
    }

    public final void f1(String str, String str2, Object obj, boolean z10, long j9) {
        int iA2;
        int length;
        h1 h1Var = (h1) this.B;
        if (z10) {
            e4 e4Var = h1Var.I;
            h1.e(e4Var);
            iA2 = e4Var.a2(str2);
        } else {
            e4 e4Var2 = h1Var.I;
            h1.e(e4Var2);
            if (!e4Var2.V1("user property", str2)) {
                iA2 = 6;
            } else if (e4Var2.X1("user property", u1.f14735i, null, str2)) {
                ((h1) e4Var2.B).getClass();
                if (e4Var2.Y1("user property", 24, str2)) {
                    iA2 = 0;
                } else {
                    iA2 = 6;
                }
            } else {
                iA2 = 15;
            }
        }
        o9.q qVar = this.X;
        if (iA2 != 0) {
            h1.e(h1Var.I);
            String strA1 = e4.a1(str2, 24, true);
            length = str2 != null ? str2.length() : 0;
            h1.e(h1Var.I);
            e4.l1(qVar, null, iA2, "_ev", strA1, length);
            return;
        }
        String str3 = str == null ? "app" : str;
        if (obj == null) {
            e1 e1Var = h1Var.G;
            h1.g(e1Var);
            e1Var.e1(new k1(this, str3, str2, null, j9, 1));
            return;
        }
        e4 e4Var3 = h1Var.I;
        h1.e(e4Var3);
        int iI1 = e4Var3.i1(obj, str2);
        if (iI1 != 0) {
            h1.e(e4Var3);
            String strA2 = e4.a1(str2, 24, true);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            h1.e(h1Var.I);
            e4.l1(qVar, null, iI1, "_ev", strA2, length);
            return;
        }
        h1.e(e4Var3);
        Object objJ1 = e4Var3.j1(obj, str2);
        if (objJ1 != null) {
            e1 e1Var2 = h1Var.G;
            h1.g(e1Var2);
            e1Var2.e1(new k1(this, str3, str2, objJ1, j9, 1));
        }
    }

    public final void g1(long j9, Object obj, String str, String str2) {
        String str3;
        boolean zC1;
        Object objValueOf = obj;
        h1 h1Var = (h1) this.B;
        com.google.android.gms.common.internal.d0.e(str);
        com.google.android.gms.common.internal.d0.e(str2);
        V0();
        W0();
        if ("allow_personalized_ads".equals(str2)) {
            String str4 = "_npa";
            if (objValueOf instanceof String) {
                String str5 = (String) objValueOf;
                if (!TextUtils.isEmpty(str5)) {
                    long j10 = true != "false".equals(str5.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    objValueOf = Long.valueOf(j10);
                    w0 w0Var = h1Var.E;
                    h1.e(w0Var);
                    w0Var.N.r(j10 == 1 ? "true" : "false");
                } else if (objValueOf == null) {
                    w0 w0Var2 = h1Var.E;
                    h1.e(w0Var2);
                    w0Var2.N.r("unset");
                } else {
                    str4 = str2;
                }
            } else if (objValueOf == null) {
                w0 w0Var3 = h1Var.E;
                h1.e(w0Var3);
                w0Var3.N.r("unset");
            } else {
                str4 = str2;
            }
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.O.d("Setting user property(FE)", "non_personalized_ads(_npa)", objValueOf);
            str3 = str4;
        } else {
            str3 = str2;
        }
        Object obj2 = objValueOf;
        if (!h1Var.a()) {
            q0 q0Var2 = h1Var.F;
            h1.g(q0Var2);
            q0Var2.O.b("User property not set since app measurement is disabled");
            return;
        }
        if (h1Var.c()) {
            b4 b4Var = new b4(j9, obj2, str3, str);
            c3 c3VarJ = h1Var.j();
            c3VarJ.V0();
            c3VarJ.W0();
            c3VarJ.h1();
            l0 l0VarI = ((h1) c3VarJ.B).i();
            l0VarI.getClass();
            Parcel parcelObtain = Parcel.obtain();
            le.b.b(b4Var, parcelObtain);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            if (bArrMarshall.length > 131072) {
                q0 q0Var3 = ((h1) l0VarI.B).F;
                h1.g(q0Var3);
                q0Var3.H.b("User property too long for local database. Sending directly to service");
                zC1 = false;
            } else {
                zC1 = l0VarI.c1(1, bArrMarshall);
            }
            c3VarJ.j1(new oe.j(c3VarJ, c3VarJ.l1(true), zC1, b4Var, 1));
        }
    }

    public final void h1() {
        V0();
        W0();
        h1 h1Var = (h1) this.B;
        if (h1Var.c()) {
            g gVar = h1Var.D;
            ((h1) gVar.B).getClass();
            Boolean boolH1 = gVar.h1("google_analytics_deferred_deep_link_enabled");
            if (boolH1 != null && boolH1.booleanValue()) {
                q0 q0Var = h1Var.F;
                h1.g(q0Var);
                q0Var.N.b("Deferred Deep Link feature enabled.");
                e1 e1Var = h1Var.G;
                h1.g(e1Var);
                e1Var.e1(new x1(this, 2));
            }
            c3 c3VarJ = h1Var.j();
            c3VarJ.V0();
            c3VarJ.W0();
            g4 g4VarL1 = c3VarJ.l1(true);
            c3VarJ.h1();
            h1 h1Var2 = (h1) c3VarJ.B;
            h1Var2.D.f1(null, b0.f14550b1);
            h1Var2.i().c1(3, new byte[0]);
            c3VarJ.j1(new y2(c3VarJ, g4VarL1, 0));
            this.T = false;
            w0 w0Var = h1Var.E;
            h1.e(w0Var);
            w0Var.V0();
            String string = w0Var.Z0().getString("previous_os_version", null);
            ((h1) w0Var.B).k().X0();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = w0Var.Z0().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            h1Var.k().X0();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            c1("auto", "_ou", bundle);
        }
    }

    public final void i1(Bundle bundle, long j9) {
        h1 h1Var = (h1) this.B;
        com.google.android.gms.common.internal.d0.h(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.J.b("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        u1.e(bundle2, "app_id", String.class, null);
        u1.e(bundle2, "origin", String.class, null);
        u1.e(bundle2, "name", String.class, null);
        u1.e(bundle2, "value", Object.class, null);
        u1.e(bundle2, "trigger_event_name", String.class, null);
        u1.e(bundle2, "trigger_timeout", Long.class, 0L);
        u1.e(bundle2, "timed_out_event_name", String.class, null);
        u1.e(bundle2, "timed_out_event_params", Bundle.class, null);
        u1.e(bundle2, "triggered_event_name", String.class, null);
        u1.e(bundle2, "triggered_event_params", Bundle.class, null);
        u1.e(bundle2, "time_to_live", Long.class, 0L);
        u1.e(bundle2, "expired_event_name", String.class, null);
        u1.e(bundle2, "expired_event_params", Bundle.class, null);
        com.google.android.gms.common.internal.d0.e(bundle2.getString("name"));
        com.google.android.gms.common.internal.d0.e(bundle2.getString("origin"));
        com.google.android.gms.common.internal.d0.h(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j9);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        e4 e4Var = h1Var.I;
        m0 m0Var = h1Var.J;
        q0 q0Var2 = h1Var.F;
        h1.e(e4Var);
        if (e4Var.a2(string) != 0) {
            h1.g(q0Var2);
            q0Var2.G.c(m0Var.c(string), "Invalid conditional user property name");
            return;
        }
        h1.e(e4Var);
        if (e4Var.i1(obj, string) != 0) {
            h1.g(q0Var2);
            q0Var2.G.d("Invalid conditional user property value", m0Var.c(string), obj);
            return;
        }
        Object objJ1 = e4Var.j1(obj, string);
        if (objJ1 == null) {
            h1.g(q0Var2);
            q0Var2.G.d("Unable to normalize conditional user property value", m0Var.c(string), obj);
            return;
        }
        u1.c(bundle2, objJ1);
        long j10 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j10 > 15552000000L || j10 < 1)) {
            h1.g(q0Var2);
            q0Var2.G.d("Invalid conditional user property timeout", m0Var.c(string), Long.valueOf(j10));
            return;
        }
        long j11 = bundle2.getLong("time_to_live");
        if (j11 > 15552000000L || j11 < 1) {
            h1.g(q0Var2);
            q0Var2.G.d("Invalid conditional user property time to live", m0Var.c(string), Long.valueOf(j11));
        } else {
            e1 e1Var = h1Var.G;
            h1.g(e1Var);
            e1Var.e1(new d2(this, bundle2, 0));
        }
    }

    public final void j1(String str, String str2, Bundle bundle) {
        h1 h1Var = (h1) this.B;
        h1Var.K.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.google.android.gms.common.internal.d0.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        e1 e1Var = h1Var.G;
        h1.g(e1Var);
        e1Var.e1(new com.google.android.gms.internal.play_billing.r0(15, this, bundle2, false));
    }

    public final String k1() {
        h1 h1Var = (h1) this.B;
        try {
            return u1.b(h1Var.A, h1Var.P);
        } catch (IllegalStateException e3) {
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.G.c(e3, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void l1(t1 t1Var, long j9, boolean z10) {
        int i10 = t1Var.f14702b;
        V0();
        W0();
        h1 h1Var = (h1) this.B;
        w0 w0Var = h1Var.E;
        q0 q0Var = h1Var.F;
        h1.e(w0Var);
        t1 t1VarC1 = w0Var.c1();
        if (j9 <= this.R && t1.l(t1VarC1.f14702b, i10)) {
            h1.g(q0Var);
            q0Var.M.c(t1Var, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        w0 w0Var2 = h1Var.E;
        h1.e(w0Var2);
        w0Var2.V0();
        if (!t1.l(i10, w0Var2.Z0().getInt("consent_source", 100))) {
            h1.g(q0Var);
            q0Var.M.c(Integer.valueOf(i10), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = w0Var2.Z0().edit();
        editorEdit.putString("consent_settings", t1Var.g());
        editorEdit.putInt("consent_source", i10);
        editorEdit.apply();
        h1.g(q0Var);
        q0Var.O.c(t1Var, "Setting storage consent(FE)");
        this.R = j9;
        if (h1Var.j().f1()) {
            c3 c3VarJ = h1Var.j();
            c3VarJ.V0();
            c3VarJ.W0();
            c3VarJ.j1(new a3(c3VarJ, 2));
        } else {
            c3 c3VarJ2 = h1Var.j();
            c3VarJ2.V0();
            c3VarJ2.W0();
            if (c3VarJ2.e1()) {
                c3VarJ2.j1(new y2(c3VarJ2, c3VarJ2.l1(false), 1));
            }
        }
        if (z10) {
            h1Var.j().Z0(new AtomicReference());
        }
    }

    public final void m1(Boolean bool, boolean z10) {
        V0();
        W0();
        h1 h1Var = (h1) this.B;
        q0 q0Var = h1Var.F;
        h1.g(q0Var);
        q0Var.N.c(bool, "Setting app measurement enabled (FE)");
        w0 w0Var = h1Var.E;
        h1.e(w0Var);
        w0Var.V0();
        SharedPreferences.Editor editorEdit = w0Var.Z0().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z10) {
            w0Var.V0();
            SharedPreferences.Editor editorEdit2 = w0Var.Z0().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        e1 e1Var = h1Var.G;
        h1.g(e1Var);
        e1Var.V0();
        if (h1Var.Z || !(bool == null || bool.booleanValue())) {
            n1();
        }
    }

    public final void n1() {
        V0();
        h1 h1Var = (h1) this.B;
        w0 w0Var = h1Var.E;
        q0 q0Var = h1Var.F;
        ve.b bVar = h1Var.K;
        h1.e(w0Var);
        String strP = w0Var.N.p();
        if (strP != null) {
            if ("unset".equals(strP)) {
                bVar.getClass();
                g1(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf(true != "true".equals(strP) ? 0L : 1L);
                bVar.getClass();
                g1(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        if (!h1Var.a() || !this.T) {
            h1.g(q0Var);
            q0Var.N.b("Updating Scion state (FE)");
            c3 c3VarJ = h1Var.j();
            c3VarJ.V0();
            c3VarJ.W0();
            c3VarJ.j1(new x2(c3VarJ, c3VarJ.l1(true), 2));
            return;
        }
        h1.g(q0Var);
        q0Var.N.b("Recording app launch after enabling measurement for the first time (FE)");
        h1();
        j3 j3Var = h1Var.H;
        h1.f(j3Var);
        j3Var.F.Z();
        e1 e1Var = h1Var.G;
        h1.g(e1Var);
        e1Var.e1(new x1(this, 1));
    }

    public final void o1() {
        h1 h1Var = (h1) this.B;
        if (!(h1Var.A.getApplicationContext() instanceof Application) || this.D == null) {
            return;
        }
        ((Application) h1Var.A.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.D);
    }

    public final void p1(Bundle bundle, int i10, long j9) {
        Boolean bool;
        String string;
        q1 q1Var;
        Boolean bool2;
        h1 h1Var = (h1) this.B;
        W0();
        t1 t1Var = t1.f14700c;
        s1[] s1VarArr = r1.STORAGE.A;
        int length = s1VarArr.length;
        int i11 = 0;
        while (true) {
            bool = null;
            if (i11 >= length) {
                string = null;
                break;
            }
            String str = s1VarArr[i11].A;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    bool2 = Boolean.TRUE;
                } else {
                    bool2 = string.equals("denied") ? Boolean.FALSE : null;
                }
                if (bool2 == null) {
                    break;
                }
            }
            i11++;
        }
        if (string != null) {
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.L.c(string, "Ignoring invalid consent setting");
            q0 q0Var2 = h1Var.F;
            h1.g(q0Var2);
            q0Var2.L.b("Valid consent values are 'granted', 'denied'");
        }
        e1 e1Var = h1Var.G;
        h1.g(e1Var);
        boolean zB1 = e1Var.b1();
        t1 t1VarB = t1.b(i10, bundle);
        Iterator it = t1VarB.f14701a.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            q1Var = q1.UNINITIALIZED;
            if (!zHasNext) {
                break;
            } else if (((q1) it.next()) != q1Var) {
                r1(t1VarB, zB1);
                break;
            }
        }
        o oVarC = o.c(i10, bundle);
        Iterator it2 = oVarC.f14681e.values().iterator();
        while (it2.hasNext()) {
            if (((q1) it2.next()) != q1Var) {
                q1(oVarC, zB1);
                break;
            }
        }
        if (bundle != null) {
            int iOrdinal = t1.d(bundle.getString("ad_personalization")).ordinal();
            if (iOrdinal == 2) {
                bool = Boolean.FALSE;
            } else if (iOrdinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String str2 = i10 == -30 ? "tcf" : "app";
            if (zB1) {
                g1(j9, bool.toString(), str2, "allow_personalized_ads");
            } else {
                f1(str2, "allow_personalized_ads", bool.toString(), false, j9);
            }
        }
    }

    public final void q1(o oVar, boolean z10) {
        kh.r rVar = new kh.r(18, this, oVar, false);
        if (z10) {
            V0();
            rVar.run();
        } else {
            e1 e1Var = ((h1) this.B).G;
            h1.g(e1Var);
            e1Var.e1(rVar);
        }
    }

    public final void r1(t1 t1Var, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        t1 t1Var2;
        W0();
        int i10 = t1Var.f14702b;
        if (i10 != -10) {
            q1 q1Var = (q1) t1Var.f14701a.get(s1.AD_STORAGE);
            if (q1Var == null) {
                q1Var = q1.UNINITIALIZED;
            }
            q1 q1Var2 = q1.UNINITIALIZED;
            if (q1Var == q1Var2) {
                q1 q1Var3 = (q1) t1Var.f14701a.get(s1.ANALYTICS_STORAGE);
                if (q1Var3 == null) {
                    q1Var3 = q1Var2;
                }
                if (q1Var3 == q1Var2) {
                    q0 q0Var = ((h1) this.B).F;
                    h1.g(q0Var);
                    q0Var.L.b("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.I) {
            try {
                z11 = false;
                if (t1.l(i10, this.P.f14702b)) {
                    t1 t1Var3 = this.P;
                    EnumMap enumMap = t1Var.f14701a;
                    s1[] s1VarArr = (s1[]) enumMap.keySet().toArray(new s1[0]);
                    int length = s1VarArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            z12 = false;
                            break;
                        }
                        s1 s1Var = s1VarArr[i11];
                        q1 q1Var4 = (q1) enumMap.get(s1Var);
                        q1 q1Var5 = (q1) t1Var3.f14701a.get(s1Var);
                        q1 q1Var6 = q1.DENIED;
                        if (q1Var4 == q1Var6 && q1Var5 != q1Var6) {
                            z12 = true;
                            break;
                        }
                        i11++;
                    }
                    s1 s1Var2 = s1.ANALYTICS_STORAGE;
                    if (t1Var.i(s1Var2) && !this.P.i(s1Var2)) {
                        z11 = true;
                    }
                    t1Var = t1Var.k(this.P);
                    this.P = t1Var;
                    z13 = z11;
                    z11 = true;
                } else {
                    z12 = false;
                    z13 = false;
                }
                t1Var2 = t1Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z11) {
            q0 q0Var2 = ((h1) this.B).F;
            h1.g(q0Var2);
            q0Var2.M.c(t1Var2, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.Q.getAndIncrement();
        if (z12) {
            this.H.set(null);
            f2 f2Var = new f2(this, t1Var2, andIncrement, z13, 0);
            if (z10) {
                V0();
                f2Var.run();
                return;
            } else {
                e1 e1Var = ((h1) this.B).G;
                h1.g(e1Var);
                e1Var.g1(f2Var);
                return;
            }
        }
        f2 f2Var2 = new f2(this, t1Var2, andIncrement, z13, 1);
        if (z10) {
            V0();
            f2Var2.run();
        } else if (i10 == 30 || i10 == -10) {
            e1 e1Var2 = ((h1) this.B).G;
            h1.g(e1Var2);
            e1Var2.g1(f2Var2);
        } else {
            e1 e1Var3 = ((h1) this.B).G;
            h1.g(e1Var3);
            e1Var3.e1(f2Var2);
        }
    }

    public final void s1() {
        m8.a();
        h1 h1Var = (h1) this.B;
        g gVar = h1Var.D;
        e1 e1Var = h1Var.G;
        q0 q0Var = h1Var.F;
        if (gVar.f1(null, b0.Q0)) {
            h1.g(e1Var);
            if (e1Var.b1()) {
                h1.g(q0Var);
                q0Var.G.b("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (ru.c.a()) {
                h1.g(q0Var);
                q0Var.G.b("Cannot get trigger URIs from main thread");
                return;
            }
            W0();
            h1.g(q0Var);
            q0Var.O.b("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            h1.g(e1Var);
            e1Var.f1(atomicReference, NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS, "get trigger URIs", new e2(this, atomicReference, 2, false));
            List list = (List) atomicReference.get();
            if (list == null) {
                h1.g(q0Var);
                q0Var.I.b("Timed out waiting for get trigger URIs");
            } else {
                h1.g(e1Var);
                e1Var.e1(new com.google.android.gms.internal.play_billing.r0(this, list, 18));
            }
        }
    }

    public final PriorityQueue t1() {
        if (this.N == null) {
            this.N = new PriorityQueue(Comparator.comparing(g2.f14618a, ba.m.C));
        }
        return this.N;
    }

    public final void u1() {
        n3 n3Var;
        V0();
        this.O = false;
        if (t1().isEmpty() || this.J || (n3Var = (n3) t1().poll()) == null) {
            return;
        }
        h1 h1Var = (h1) this.B;
        e4 e4Var = h1Var.I;
        h1.e(e4Var);
        x9.a aVarP1 = e4Var.p1();
        if (aVarP1 != null) {
            this.J = true;
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            b50.b bVar = q0Var.O;
            String str = n3Var.A;
            bVar.c(str, "Registering trigger URI");
            kh.v vVarE = aVarP1.e(Uri.parse(str));
            if (vVarE != null) {
                vVarE.a(new kh.r(vVarE, new q3.e0(9, this, n3Var, false), 0), new jb.a(this, 1));
            } else {
                this.J = false;
                t1().add(n3Var);
            }
        }
    }
}
