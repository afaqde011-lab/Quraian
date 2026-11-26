package tf;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

public final class e4 extends o1 {
    public static final String[] J = {"firebase_", "google_", "ga_"};
    public static final String[] K = {"_err"};
    public SecureRandom D;
    public final AtomicLong E;
    public int F;
    public x9.a G;
    public Boolean H;
    public Integer I;

    public e4(h1 h1Var) {
        super(h1Var);
        this.I = null;
        this.E = new AtomicLong(0L);
    }

    public static ArrayList K1(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", eVar.A);
            bundle.putString("origin", eVar.B);
            bundle.putLong("creation_timestamp", eVar.D);
            bundle.putString("name", eVar.C.B);
            Object objA = eVar.C.a();
            com.google.android.gms.common.internal.d0.h(objA);
            u1.c(bundle, objA);
            bundle.putBoolean("active", eVar.E);
            String str = eVar.F;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            s sVar = eVar.G;
            if (sVar != null) {
                bundle.putString("timed_out_event_name", sVar.A);
                r rVar = sVar.B;
                if (rVar != null) {
                    bundle.putBundle("timed_out_event_params", rVar.e());
                }
            }
            bundle.putLong("trigger_timeout", eVar.H);
            s sVar2 = eVar.I;
            if (sVar2 != null) {
                bundle.putString("triggered_event_name", sVar2.A);
                r rVar2 = sVar2.B;
                if (rVar2 != null) {
                    bundle.putBundle("triggered_event_params", rVar2.e());
                }
            }
            bundle.putLong("triggered_timestamp", eVar.C.C);
            bundle.putLong("time_to_live", eVar.J);
            s sVar3 = eVar.K;
            if (sVar3 != null) {
                bundle.putString("expired_event_name", sVar3.A);
                r rVar3 = sVar3.B;
                if (rVar3 != null) {
                    bundle.putBundle("expired_event_params", rVar3.e());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean L1(Context context) {
        ActivityInfo receiverInfo;
        com.google.android.gms.common.internal.d0.h(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static void M1(q2 q2Var, Bundle bundle, boolean z10) {
        if (bundle != null && q2Var != null) {
            if (!bundle.containsKey("_sc") || z10) {
                String str = q2Var.f14694a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = q2Var.f14695b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", q2Var.f14696c);
                return;
            }
            z10 = false;
        }
        if (bundle != null && q2Var == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static final boolean O1(int i10, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i10);
        return true;
    }

    public static boolean T1(String str) {
        com.google.android.gms.common.internal.d0.e(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static String a1(String str, int i10, boolean z10) {
        if (str != null) {
            if (str.codePointCount(0, str.length()) <= i10) {
                return str;
            }
            if (z10) {
                return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat("...");
            }
        }
        return null;
    }

    public static boolean d2(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static void l1(d4 d4Var, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        O1(i10, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        d4Var.b(str, "_err", bundle);
    }

    public static MessageDigest m1() {
        for (int i10 = 0; i10 < 2; i10++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static long n1(byte[] bArr) {
        com.google.android.gms.common.internal.d0.h(bArr);
        int length = bArr.length;
        if (length <= 0) {
            throw new IllegalStateException();
        }
        int i10 = 0;
        long j9 = 0;
        for (int i11 = length - 1; i11 >= 0 && i11 >= bArr.length - 8; i11--) {
            j9 += (((long) bArr[i11]) & 255) << i10;
            i10 += 8;
        }
        return j9;
    }

    public static boolean o1(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) == null || !serviceInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean r1(String str) {
        String str2 = (String) b0.f14589r0.a(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    public static boolean t1(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean u1(String str, String[] strArr) {
        com.google.android.gms.common.internal.d0.h(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] z1(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public final boolean A1(int i10) {
        Boolean bool = ((h1) this.B).j().F;
        if (B1() < i10 / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int B1() {
        if (this.I == null) {
            h1 h1Var = (h1) this.B;
            pe.f fVar = pe.f.f12493b;
            Context context = h1Var.A;
            fVar.getClass();
            int i10 = pe.g.f12498e;
            int i11 = 0;
            try {
                i11 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.I = Integer.valueOf(i11 / 1000);
        }
        return this.I.intValue();
    }

    public final void C1(Bundle bundle, long j9) {
        long j10 = bundle.getLong("_et");
        if (j10 != 0) {
            q0 q0Var = ((h1) this.B).F;
            h1.g(q0Var);
            q0Var.J.c(Long.valueOf(j10), "Params already contained engagement");
        } else {
            j10 = 0;
        }
        bundle.putLong("_et", j9 + j10);
    }

    public final void D1(String str, com.google.android.gms.internal.measurement.l0 l0Var) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            l0Var.q1(bundle);
        } catch (RemoteException e3) {
            q0 q0Var = ((h1) this.B).F;
            h1.g(q0Var);
            q0Var.J.c(e3, "Error returning string value to wrapper");
        }
    }

    public final void E1(com.google.android.gms.internal.measurement.l0 l0Var, long j9) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j9);
        try {
            l0Var.q1(bundle);
        } catch (RemoteException e3) {
            q0 q0Var = ((h1) this.B).F;
            h1.g(q0Var);
            q0Var.J.c(e3, "Error returning long value to wrapper");
        }
    }

    public final void F1(com.google.android.gms.internal.measurement.l0 l0Var, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            l0Var.q1(bundle);
        } catch (RemoteException e3) {
            q0 q0Var = ((h1) this.B).F;
            h1.g(q0Var);
            q0Var.J.c(e3, "Error returning int value to wrapper");
        }
    }

    public final void G1(com.google.android.gms.internal.measurement.l0 l0Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            l0Var.q1(bundle);
        } catch (RemoteException e3) {
            q0 q0Var = ((h1) this.B).F;
            h1.g(q0Var);
            q0Var.J.c(e3, "Error returning byte array to wrapper");
        }
    }

    public final void H1(com.google.android.gms.internal.measurement.l0 l0Var, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            l0Var.q1(bundle);
        } catch (RemoteException e3) {
            q0 q0Var = ((h1) this.B).F;
            h1.g(q0Var);
            q0Var.J.c(e3, "Error returning boolean value to wrapper");
        }
    }

    public final void I1(com.google.android.gms.internal.measurement.l0 l0Var, Bundle bundle) {
        try {
            l0Var.q1(bundle);
        } catch (RemoteException e3) {
            q0 q0Var = ((h1) this.B).F;
            h1.g(q0Var);
            q0Var.J.c(e3, "Error returning bundle value to wrapper");
        }
    }

    public final void J1(com.google.android.gms.internal.measurement.l0 l0Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            l0Var.q1(bundle);
        } catch (RemoteException e3) {
            q0 q0Var = ((h1) this.B).F;
            h1.g(q0Var);
            q0Var.J.c(e3, "Error returning bundle list to wrapper");
        }
    }

    public final String N1() {
        byte[] bArr = new byte[16];
        S1().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final Object P1(int i10, Object obj, boolean z10, boolean z11) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return a1(obj.toString(), i10, z10);
        }
        if (!z11) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleW1 = w1((Bundle) parcelable);
                if (!bundleW1.isEmpty()) {
                    arrayList.add(bundleW1);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int Q1(String str) {
        h1 h1Var = (h1) this.B;
        if ("_ldl".equals(str)) {
            h1Var.getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            h1Var.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            h1Var.getClass();
            return 100;
        }
        h1Var.getClass();
        return 36;
    }

    public final long R1() {
        long andIncrement;
        long j9;
        AtomicLong atomicLong = this.E;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.E;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNanoTime = System.nanoTime();
            ((h1) this.B).K.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i10 = this.F + 1;
            this.F = i10;
            j9 = jNextLong + ((long) i10);
        }
        return j9;
    }

    public final SecureRandom S1() {
        V0();
        if (this.D == null) {
            this.D = new SecureRandom();
        }
        return this.D;
    }

    public final Bundle U1(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    queryParameter = uri.getQueryParameter("utm_campaign");
                    queryParameter2 = uri.getQueryParameter("utm_source");
                    queryParameter3 = uri.getQueryParameter("utm_medium");
                    queryParameter4 = uri.getQueryParameter("gclid");
                    queryParameter5 = uri.getQueryParameter("gbraid");
                    queryParameter6 = uri.getQueryParameter("utm_id");
                    queryParameter7 = uri.getQueryParameter("dclid");
                    queryParameter8 = uri.getQueryParameter("srsltid");
                    queryParameter9 = uri.getQueryParameter("sfmc_id");
                } else {
                    queryParameter = null;
                    queryParameter2 = null;
                    queryParameter3 = null;
                    queryParameter4 = null;
                    queryParameter5 = null;
                    queryParameter6 = null;
                    queryParameter7 = null;
                    queryParameter8 = null;
                    queryParameter9 = null;
                }
                if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9)) {
                    return null;
                }
                Bundle bundle = new Bundle();
                if (!TextUtils.isEmpty(queryParameter)) {
                    bundle.putString("campaign", queryParameter);
                }
                if (!TextUtils.isEmpty(queryParameter2)) {
                    bundle.putString("source", queryParameter2);
                }
                if (!TextUtils.isEmpty(queryParameter3)) {
                    bundle.putString("medium", queryParameter3);
                }
                if (!TextUtils.isEmpty(queryParameter4)) {
                    bundle.putString("gclid", queryParameter4);
                }
                if (!TextUtils.isEmpty(queryParameter5)) {
                    bundle.putString("gbraid", queryParameter5);
                }
                String queryParameter10 = uri.getQueryParameter("gad_source");
                if (!TextUtils.isEmpty(queryParameter10)) {
                    bundle.putString("gad_source", queryParameter10);
                }
                String queryParameter11 = uri.getQueryParameter("utm_term");
                if (!TextUtils.isEmpty(queryParameter11)) {
                    bundle.putString("term", queryParameter11);
                }
                String queryParameter12 = uri.getQueryParameter("utm_content");
                if (!TextUtils.isEmpty(queryParameter12)) {
                    bundle.putString("content", queryParameter12);
                }
                String queryParameter13 = uri.getQueryParameter("aclid");
                if (!TextUtils.isEmpty(queryParameter13)) {
                    bundle.putString("aclid", queryParameter13);
                }
                String queryParameter14 = uri.getQueryParameter("cp1");
                if (!TextUtils.isEmpty(queryParameter14)) {
                    bundle.putString("cp1", queryParameter14);
                }
                String queryParameter15 = uri.getQueryParameter("anid");
                if (!TextUtils.isEmpty(queryParameter15)) {
                    bundle.putString("anid", queryParameter15);
                }
                if (!TextUtils.isEmpty(queryParameter6)) {
                    bundle.putString("campaign_id", queryParameter6);
                }
                if (!TextUtils.isEmpty(queryParameter7)) {
                    bundle.putString("dclid", queryParameter7);
                }
                String queryParameter16 = uri.getQueryParameter("utm_source_platform");
                if (!TextUtils.isEmpty(queryParameter16)) {
                    bundle.putString("source_platform", queryParameter16);
                }
                String queryParameter17 = uri.getQueryParameter("utm_creative_format");
                if (!TextUtils.isEmpty(queryParameter17)) {
                    bundle.putString("creative_format", queryParameter17);
                }
                String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
                if (!TextUtils.isEmpty(queryParameter18)) {
                    bundle.putString("marketing_tactic", queryParameter18);
                }
                if (!TextUtils.isEmpty(queryParameter8)) {
                    bundle.putString("srsltid", queryParameter8);
                }
                if (!TextUtils.isEmpty(queryParameter9)) {
                    bundle.putString("sfmc_id", queryParameter9);
                }
                for (String str : uri.getQueryParameterNames()) {
                    if (str.startsWith("gad_")) {
                        String queryParameter19 = uri.getQueryParameter(str);
                        if (!TextUtils.isEmpty(queryParameter19)) {
                            bundle.putString(str, queryParameter19);
                        }
                    }
                }
                return bundle;
            } catch (UnsupportedOperationException e3) {
                q0 q0Var = ((h1) this.B).F;
                h1.g(q0Var);
                q0Var.J.c(e3, "Install referrer url isn't a hierarchical URI");
            }
        }
        return null;
    }

    public final boolean V1(String str, String str2) {
        h1 h1Var = (h1) this.B;
        if (str2 == null) {
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.I.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            q0 q0Var2 = h1Var.F;
            h1.g(q0Var2);
            q0Var2.I.c(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            q0 q0Var3 = h1Var.F;
            h1.g(q0Var3);
            q0Var3.I.d("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                q0 q0Var4 = h1Var.F;
                h1.g(q0Var4);
                q0Var4.I.d("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    @Override
    public final boolean W0() {
        return true;
    }

    public final boolean W1(String str, String str2) {
        h1 h1Var = (h1) this.B;
        if (str2 == null) {
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.I.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            q0 q0Var2 = h1Var.F;
            h1.g(q0Var2);
            q0Var2.I.c(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                q0 q0Var3 = h1Var.F;
                h1.g(q0Var3);
                q0Var3.I.d("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                q0 q0Var4 = h1Var.F;
                h1.g(q0Var4);
                q0Var4.I.d("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean X1(String str, String[] strArr, String[] strArr2, String str2) {
        h1 h1Var = (h1) this.B;
        if (str2 == null) {
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.I.c(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(J[i10])) {
                q0 q0Var2 = h1Var.F;
                h1.g(q0Var2);
                q0Var2.I.d("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !u1(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && u1(str2, strArr2)) {
            return true;
        }
        q0 q0Var3 = h1Var.F;
        h1.g(q0Var3);
        q0Var3.I.d("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean Y1(String str, int i10, String str2) {
        h1 h1Var = (h1) this.B;
        if (str2 == null) {
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.I.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        }
        q0 q0Var2 = h1Var.F;
        h1.g(q0Var2);
        q0Var2.I.e("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
        return false;
    }

    public final boolean Z0(String str) {
        h1 h1Var = (h1) this.B;
        if (TextUtils.isEmpty(str)) {
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.I.b("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        com.google.android.gms.common.internal.d0.h(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        q0 q0Var2 = h1Var.F;
        h1.g(q0Var2);
        q0Var2.I.c(q0.d1(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    public final int Z1(String str) {
        if (!W1("event", str)) {
            return 2;
        }
        if (!X1("event", u1.f14727a, u1.f14728b, str)) {
            return 13;
        }
        ((h1) this.B).getClass();
        return !Y1("event", 40, str) ? 2 : 0;
    }

    public final int a2(String str) {
        if (!W1("user property", str)) {
            return 6;
        }
        if (!X1("user property", u1.f14735i, null, str)) {
            return 15;
        }
        ((h1) this.B).getClass();
        return !Y1("user property", 24, str) ? 6 : 0;
    }

    public final int b1(String str, String str2, Object obj, Bundle bundle, List list, boolean z10, boolean z11) {
        int i10;
        int size;
        h1 h1Var = (h1) this.B;
        V0();
        int i11 = 0;
        if (!d2(obj)) {
            i10 = 0;
        } else {
            if (!z11) {
                return 21;
            }
            if (!u1(str2, u1.f14733g)) {
                return 20;
            }
            c3 c3VarJ = h1Var.j();
            c3VarJ.V0();
            c3VarJ.W0();
            if (c3VarJ.c1()) {
                e4 e4Var = ((h1) c3VarJ.B).I;
                h1.e(e4Var);
                if (e4Var.B1() < 200900) {
                    return 25;
                }
            }
            boolean z12 = obj instanceof Parcelable[];
            if (z12) {
                size = ((Parcelable[]) obj).length;
            } else if (obj instanceof ArrayList) {
                size = ((ArrayList) obj).size();
            } else {
                i10 = 0;
            }
            if (size > 200) {
                q0 q0Var = h1Var.F;
                h1.g(q0Var);
                q0Var.L.e("Parameter array is too long; discarded. Value kind, name, array length", "param", str2, Integer.valueOf(size));
                i10 = 17;
                if (z12) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    if (parcelableArr.length > 200) {
                        bundle.putParcelableArray(str2, (Parcelable[]) Arrays.copyOf(parcelableArr, MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN));
                    }
                } else if (obj instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) obj;
                    if (arrayList.size() > 200) {
                        bundle.putParcelableArrayList(str2, new ArrayList<>(arrayList.subList(0, MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN)));
                    }
                }
            } else {
                i10 = 0;
            }
        }
        boolean zT1 = t1(str);
        int iMax = MediaError.DetailedErrorCode.SEGMENT_UNKNOWN;
        if (zT1 || t1(str2)) {
            h1Var.D.getClass();
            iMax = Math.max(MediaError.DetailedErrorCode.SEGMENT_UNKNOWN, 256);
        } else {
            h1Var.D.getClass();
        }
        if (!e2("param", str2, iMax, obj)) {
            if (!z11) {
                return 4;
            }
            if (obj instanceof Bundle) {
                f2(str, str2, (Bundle) obj, list, z10);
                return i10;
            }
            if (obj instanceof Parcelable[]) {
                Parcelable[] parcelableArr2 = (Parcelable[]) obj;
                int length = parcelableArr2.length;
                while (i11 < length) {
                    Parcelable parcelable = parcelableArr2[i11];
                    if (!(parcelable instanceof Bundle)) {
                        q0 q0Var2 = h1Var.F;
                        h1.g(q0Var2);
                        q0Var2.L.d("All Parcelable[] elements must be of type Bundle. Value type, name", parcelable.getClass(), str2);
                        return 4;
                    }
                    f2(str, str2, (Bundle) parcelable, list, z10);
                    i11++;
                }
            } else {
                if (!(obj instanceof ArrayList)) {
                    return 4;
                }
                ArrayList arrayList2 = (ArrayList) obj;
                int size2 = arrayList2.size();
                while (i11 < size2) {
                    Object obj2 = arrayList2.get(i11);
                    if (!(obj2 instanceof Bundle)) {
                        q0 q0Var3 = h1Var.F;
                        h1.g(q0Var3);
                        q0Var3.L.d("All ArrayList elements must be of type Bundle. Value type, name", obj2 != null ? obj2.getClass() : "null", str2);
                        return 4;
                    }
                    f2(str, str2, (Bundle) obj2, list, z10);
                    i11++;
                }
            }
        }
        return i10;
    }

    public final int b2(String str) {
        if (!V1("event param", str)) {
            return 3;
        }
        if (!X1("event param", null, null, str)) {
            return 14;
        }
        ((h1) this.B).getClass();
        return !Y1("event param", 40, str) ? 3 : 0;
    }

    public final Object c1(Object obj, String str) {
        h1 h1Var = (h1) this.B;
        boolean zEquals = "_ev".equals(str);
        int iMax = MediaError.DetailedErrorCode.SEGMENT_UNKNOWN;
        if (zEquals) {
            h1Var.D.getClass();
            return P1(Math.max(MediaError.DetailedErrorCode.SEGMENT_UNKNOWN, 256), obj, true, true);
        }
        if (t1(str)) {
            h1Var.D.getClass();
            iMax = Math.max(MediaError.DetailedErrorCode.SEGMENT_UNKNOWN, 256);
        } else {
            h1Var.D.getClass();
        }
        return P1(iMax, obj, false, true);
    }

    public final int c2(String str) {
        if (!W1("event param", str)) {
            return 3;
        }
        if (!X1("event param", null, null, str)) {
            return 14;
        }
        ((h1) this.B).getClass();
        return !Y1("event param", 40, str) ? 3 : 0;
    }

    public final Bundle d1(String str, Bundle bundle, List list, boolean z10) {
        int iB2;
        list = list;
        boolean zU1 = u1(str, u1.f14730d);
        String str2 = null;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        h1 h1Var = (h1) this.B;
        g gVar = h1Var.D;
        m0 m0Var = h1Var.J;
        e4 e4Var = ((h1) gVar.B).I;
        h1.e(e4Var);
        int i10 = e4Var.A1(201500000) ? 100 : 25;
        int i11 = 0;
        boolean z11 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iB2 = !z10 ? b2(str3) : 0;
                if (iB2 == 0) {
                    iB2 = c2(str3);
                }
            } else {
                iB2 = 0;
            }
            if (iB2 != 0) {
                h1(bundle2, iB2, str3, iB2 == 3 ? str3 : str2);
                bundle2.remove(str3);
            } else {
                int iB1 = b1(str, str3, bundle.get(str3), bundle2, list, z10, zU1);
                if (iB1 == 17) {
                    h1(bundle2, 17, str3, Boolean.FALSE);
                } else if (iB1 != 0 && !"_ev".equals(str3)) {
                    h1(bundle2, iB1, iB1 == 21 ? str : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (T1(str3)) {
                    i11++;
                    if (i11 > i10) {
                        if (!h1Var.D.f1(str2, b0.f14559e1) || !z11) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 37);
                            sb2.append("Event can't contain more than ");
                            sb2.append(i10);
                            sb2.append(" params");
                            String string = sb2.toString();
                            q0 q0Var = h1Var.F;
                            h1.g(q0Var);
                            q0Var.I.d(string, m0Var.a(str), m0Var.e(bundle));
                        }
                        O1(5, bundle2);
                        bundle2.remove(str3);
                        z11 = true;
                        str2 = str2;
                    }
                }
            }
            str2 = str2;
            str2 = str2;
        }
        return bundle2;
    }

    public final void e1(b50.n nVar, int i10) {
        Bundle bundle = (Bundle) nVar.e;
        int i11 = 0;
        boolean z10 = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (T1(str) && (i11 = i11 + 1) > i10) {
                h1 h1Var = (h1) this.B;
                g gVar = h1Var.D;
                m0 m0Var = h1Var.J;
                if (!gVar.f1(null, b0.f14559e1) || !z10) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 37);
                    sb2.append("Event can't contain more than ");
                    sb2.append(i10);
                    sb2.append(" params");
                    String string = sb2.toString();
                    q0 q0Var = h1Var.F;
                    h1.g(q0Var);
                    q0Var.I.d(string, m0Var.a((String) nVar.c), m0Var.e(bundle));
                    O1(5, bundle);
                }
                bundle.remove(str);
                z10 = true;
            }
        }
    }

    public final boolean e2(String str, String str2, int i10, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String string = obj.toString();
        if (string.codePointCount(0, string.length()) > i10) {
            q0 q0Var = ((h1) this.B).F;
            h1.g(q0Var);
            q0Var.L.e("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
            return false;
        }
        return true;
    }

    public final void f1(Parcelable[] parcelableArr, int i10) {
        com.google.android.gms.common.internal.d0.h(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i11 = 0;
            boolean z10 = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (T1(str) && !u1(str, u1.f14734h) && (i11 = i11 + 1) > i10) {
                    h1 h1Var = (h1) this.B;
                    g gVar = h1Var.D;
                    m0 m0Var = h1Var.J;
                    if (!gVar.f1(null, b0.f14559e1) || !z10) {
                        q0 q0Var = h1Var.F;
                        h1.g(q0Var);
                        b50.b bVar = q0Var.I;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 60);
                        sb2.append("Param can't contain more than ");
                        sb2.append(i10);
                        sb2.append(" item-scoped custom parameters");
                        bVar.d(sb2.toString(), m0Var.b(str), m0Var.e(bundle));
                    }
                    O1(28, bundle);
                    bundle.remove(str);
                    z10 = true;
                }
            }
        }
    }

    public final void f2(String str, String str2, Bundle bundle, List list, boolean z10) {
        int iB2;
        int iB1;
        list = list;
        if (bundle == null) {
            return;
        }
        h1 h1Var = (h1) this.B;
        g gVar = h1Var.D;
        q0 q0Var = h1Var.F;
        m0 m0Var = h1Var.J;
        e4 e4Var = ((h1) gVar.B).I;
        h1.e(e4Var);
        int i10 = true != e4Var.A1(231100000) ? 0 : 35;
        int i11 = 0;
        boolean z11 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iB2 = !z10 ? b2(str3) : 0;
                if (iB2 == 0) {
                    iB2 = c2(str3);
                }
            } else {
                iB2 = 0;
            }
            if (iB2 != 0) {
                h1(bundle, iB2, str3, iB2 == 3 ? str3 : null);
                bundle.remove(str3);
            } else {
                if (d2(bundle.get(str3))) {
                    h1.g(q0Var);
                    q0Var.L.e("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str3);
                    iB1 = 22;
                } else {
                    iB1 = b1(str, str3, bundle.get(str3), bundle, list, z10, false);
                }
                if (iB1 != 0 && !"_ev".equals(str3)) {
                    h1(bundle, iB1, str3, bundle.get(str3));
                    bundle.remove(str3);
                } else if (T1(str3) && !u1(str3, u1.f14734h)) {
                    int i12 = i11 + 1;
                    if (!A1(231100000)) {
                        h1.g(q0Var);
                        q0Var.I.d("Item array not supported on client's version of Google Play Services (Android Only)", m0Var.a(str), m0Var.e(bundle));
                        O1(23, bundle);
                        bundle.remove(str3);
                    } else if (i12 > i10) {
                        if (!h1Var.D.f1(null, b0.f14559e1) || !z11) {
                            h1.g(q0Var);
                            b50.b bVar = q0Var.I;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 55);
                            sb2.append("Item can't contain more than ");
                            sb2.append(i10);
                            sb2.append(" item-scoped custom params");
                            bVar.d(sb2.toString(), m0Var.a(str), m0Var.e(bundle));
                        }
                        O1(28, bundle);
                        bundle.remove(str3);
                        list = list;
                        i11 = i12;
                        z11 = true;
                    }
                    i11 = i12;
                }
            }
        }
    }

    public final void g1(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                e4 e4Var = ((h1) this.B).I;
                h1.e(e4Var);
                e4Var.k1(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void h1(Bundle bundle, int i10, String str, Object obj) {
        if (O1(i10, bundle)) {
            ((h1) this.B).getClass();
            bundle.putString("_ev", a1(str, 40, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int i1(Object obj, String str) {
        return "_ldl".equals(str) ? e2("user property referrer", str, Q1(str), obj) : e2("user property", str, Q1(str), obj) ? 0 : 7;
    }

    public final Object j1(Object obj, String str) {
        return "_ldl".equals(str) ? P1(Q1(str), obj, true, false) : P1(Q1(str), obj, false, false);
    }

    public final void k1(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            h1 h1Var = (h1) this.B;
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.L.d("Not putting event parameter. Invalid value type. name, type", h1Var.J.b(str), simpleName);
        }
    }

    public final x9.a p1() {
        y9.b bVar;
        if (this.G == null) {
            Context context = ((h1) this.B).A;
            kotlin.jvm.internal.m.e(context, "context");
            StringBuilder sb2 = new StringBuilder("AdServicesInfo.version=");
            v9.a aVar = v9.a.f15570a;
            sb2.append(aVar.a());
            Log.d("MeasurementManager", sb2.toString());
            if (aVar.a() >= 5) {
                Object systemService = context.getSystemService((Class<Object>) qd.r.d());
                kotlin.jvm.internal.m.d(systemService, "context.getSystemService…ementManager::class.java)");
                bVar = new y9.b(qd.r.b(systemService));
            } else {
                bVar = null;
            }
            this.G = bVar != null ? new x9.a(bVar) : null;
        }
        return this.G;
    }

    public final long q1() {
        long j9;
        Object e3;
        Integer num;
        V0();
        h1 h1Var = (h1) this.B;
        j0 j0VarL = h1Var.l();
        q0 q0Var = h1Var.F;
        if (!r1(j0VarL.b1())) {
            return 0L;
        }
        boolean zBooleanValue = false;
        Integer num2 = null;
        if (SdkExtensions.getExtensionVersion(30) < 4) {
            j9 = 8;
        } else {
            j9 = (SdkExtensions.getExtensionVersion(30) > 3 ? SdkExtensions.getExtensionVersion(1000000) : 0) < ((Integer) b0.f14578l0.a(null)).intValue() ? 16L : 0L;
        }
        if (!s1("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j9 |= 2;
        }
        if (j9 == 0) {
            if (this.H != null) {
                zBooleanValue = this.H.booleanValue();
            } else {
                x9.a aVarP1 = p1();
                if (aVarP1 != null) {
                    try {
                        num = (Integer) aVarP1.b().get(NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS, TimeUnit.MILLISECONDS);
                        if (num != null) {
                            try {
                                if (num.intValue() == 1) {
                                    zBooleanValue = true;
                                }
                            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e10) {
                                e3 = e10;
                                num2 = num;
                                h1.g(q0Var);
                                q0Var.J.c(e3, "Measurement manager api exception");
                                this.H = Boolean.FALSE;
                                num = num2;
                            }
                        }
                        this.H = Boolean.valueOf(zBooleanValue);
                    } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e11) {
                        e3 = e11;
                    }
                    h1.g(q0Var);
                    q0Var.O.c(num, "Measurement manager api status result");
                    zBooleanValue = this.H.booleanValue();
                }
            }
            if (!zBooleanValue) {
                j9 = 64;
            }
        }
        if (j9 == 0) {
            return 1L;
        }
        return j9;
    }

    public final boolean s1(String str) {
        V0();
        h1 h1Var = (h1) this.B;
        if (xe.b.a(h1Var.A).f14783a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        q0 q0Var = h1Var.F;
        h1.g(q0Var);
        q0Var.N.c(str, "Permission not granted");
        return false;
    }

    public final boolean v1(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((h1) this.B).D.Z0("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle w1(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objC1 = c1(bundle.get(str), str);
                if (objC1 == null) {
                    h1 h1Var = (h1) this.B;
                    q0 q0Var = h1Var.F;
                    h1.g(q0Var);
                    q0Var.L.c(h1Var.J.b(str), "Param value can't be null");
                } else {
                    k1(bundle2, str, objC1);
                }
            }
        }
        return bundle2;
    }

    public final s x1(String str, Bundle bundle, String str2, long j9, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (Z1(str) != 0) {
            h1 h1Var = (h1) this.B;
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.G.c(h1Var.J.c(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleD1 = d1(str, bundle2, Collections.singletonList("_o"), true);
        if (z10) {
            bundleD1 = w1(bundleD1);
        }
        com.google.android.gms.common.internal.d0.h(bundleD1);
        return new s(str, new r(bundleD1), str2, j9);
    }

    public final boolean y1(Context context, String str) {
        Signature[] signatureArr;
        h1 h1Var = (h1) this.B;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoB = xe.b.a(context).b(64, str);
            if (packageInfoB == null || (signatureArr = packageInfoB.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e3) {
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.G.c(e3, "Package name not found");
            return true;
        } catch (CertificateException e10) {
            q0 q0Var2 = h1Var.F;
            h1.g(q0Var2);
            q0Var2.G.c(e10, "Error obtaining certificate");
            return true;
        }
    }
}
