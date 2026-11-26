package tf;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.c6;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.j5;
import com.google.android.gms.internal.measurement.k5;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.q5;
import com.google.android.gms.internal.measurement.x4;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.zzmr;
import com.google.protobuf.RuntimeVersion;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

public final class t0 extends t3 {
    public final int E;

    public t0(y3 y3Var, int i10) {
        super(y3Var);
        this.E = i10;
    }

    public static boolean B1(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean C1(j5 j5Var, int i10) {
        if (i10 < ((q5) j5Var).C * 64) {
            return ((1 << (i10 % 64)) & ((Long) ((q5) j5Var).get(i10 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList D1(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j9 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 * 64) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j9 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j9));
        }
        return arrayList;
    }

    public static d5 I1(d5 d5Var, byte[] bArr) throws zzmr {
        x4 x4VarT;
        x4 x4Var = x4.f3916a;
        if (x4Var == null) {
            synchronized (x4.class) {
                try {
                    x4VarT = x4.f3916a;
                    if (x4VarT == null) {
                        c6 c6Var = c6.f3738c;
                        x4VarT = b5.T();
                        x4.f3916a = x4VarT;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            x4Var = x4VarT;
        }
        if (x4Var != null) {
            d5Var.getClass();
            d5Var.g(bArr, bArr.length, x4Var);
            return d5Var;
        }
        d5Var.getClass();
        int length = bArr.length;
        x4 x4Var2 = x4.f3916a;
        c6 c6Var2 = c6.f3738c;
        d5Var.g(bArr, length, x4.f3917b);
        return d5Var;
    }

    public static int J1(com.google.android.gms.internal.measurement.h3 h3Var, String str) {
        for (int i10 = 0; i10 < ((com.google.android.gms.internal.measurement.i3) h3Var.B).V1(); i10++) {
            if (str.equals(((com.google.android.gms.internal.measurement.i3) h3Var.B).W1(i10).r())) {
                return i10;
            }
        }
        return -1;
    }

    public static Bundle[] K1(k5 k5Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = k5Var.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.d3 d3Var = (com.google.android.gms.internal.measurement.d3) it.next();
            if (d3Var != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.d3 d3Var2 : d3Var.z()) {
                    if (d3Var2.r()) {
                        bundle.putString(d3Var2.q(), d3Var2.s());
                    } else if (d3Var2.t()) {
                        bundle.putLong(d3Var2.q(), d3Var2.u());
                    } else if (d3Var2.x()) {
                        bundle.putDouble(d3Var2.q(), d3Var2.y());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static HashMap L1(Bundle bundle, boolean z10) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z11 = obj instanceof Parcelable[];
            if (z11 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    if (z11) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(L1((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            Object obj2 = arrayList2.get(i10);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(L1((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(L1((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public static s Z0(com.google.android.gms.internal.measurement.b bVar) {
        Object obj;
        Bundle bundleA1 = a1(bVar.f3672c, true);
        String string = (!bundleA1.containsKey("_o") || (obj = bundleA1.get("_o")) == null) ? "app" : obj.toString();
        String strG = u1.g(bVar.f3670a, u1.f14727a, u1.f14729c);
        if (strG == null) {
            strG = bVar.f3670a;
        }
        return new s(strG, new r(bundleA1), string, bVar.f3671b);
    }

    public static Bundle a1(Map map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList2.add(a1((Map) arrayList.get(i10), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static final void b1(com.google.android.gms.internal.measurement.z2 z2Var, String str, Long l) {
        List listH = z2Var.h();
        int i10 = 0;
        while (true) {
            if (i10 >= listH.size()) {
                i10 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.d3) listH.get(i10)).q())) {
                break;
            } else {
                i10++;
            }
        }
        com.google.android.gms.internal.measurement.c3 c3VarB = com.google.android.gms.internal.measurement.d3.B();
        c3VarB.h(str);
        c3VarB.k(l.longValue());
        if (i10 < 0) {
            z2Var.n(c3VarB);
        } else {
            z2Var.b();
            ((com.google.android.gms.internal.measurement.a3) z2Var.B).A(i10, (com.google.android.gms.internal.measurement.d3) c3VarB.e());
        }
    }

    public static final Bundle c1(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.d3 d3Var = (com.google.android.gms.internal.measurement.d3) it.next();
            String strQ = d3Var.q();
            if (d3Var.x()) {
                bundle.putDouble(strQ, d3Var.y());
            } else if (d3Var.v()) {
                bundle.putFloat(strQ, d3Var.w());
            } else if (d3Var.r()) {
                bundle.putString(strQ, d3Var.s());
            } else if (d3Var.t()) {
                bundle.putLong(strQ, d3Var.u());
            }
        }
        return bundle;
    }

    public static final com.google.android.gms.internal.measurement.d3 d1(com.google.android.gms.internal.measurement.a3 a3Var, String str) {
        for (com.google.android.gms.internal.measurement.d3 d3Var : a3Var.p()) {
            if (d3Var.q().equals(str)) {
                return d3Var;
            }
        }
        return null;
    }

    public static final Serializable e1(com.google.android.gms.internal.measurement.a3 a3Var, String str) {
        com.google.android.gms.internal.measurement.d3 d3VarD1 = d1(a3Var, str);
        if (d3VarD1 == null) {
            return null;
        }
        return k1(d3VarD1);
    }

    public static final void h1(int i10, StringBuilder sb2) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    public static final void i1(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String j1(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    public static final Serializable k1(com.google.android.gms.internal.measurement.d3 d3Var) {
        if (d3Var.r()) {
            return d3Var.s();
        }
        if (d3Var.t()) {
            return Long.valueOf(d3Var.u());
        }
        if (d3Var.x()) {
            return Double.valueOf(d3Var.y());
        }
        if (d3Var.A() > 0) {
            return K1((k5) d3Var.z());
        }
        return null;
    }

    public static final void l1(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                i1(builder, str3, string, set);
            }
        }
    }

    public static final void m1(StringBuilder sb2, String str, com.google.android.gms.internal.measurement.l3 l3Var) {
        if (l3Var == null) {
            return;
        }
        h1(3, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (l3Var.s() != 0) {
            h1(4, sb2);
            sb2.append("results: ");
            int i10 = 0;
            for (Long l : l3Var.r()) {
                int i11 = i10 + 1;
                if (i10 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l);
                i10 = i11;
            }
            sb2.append('\n');
        }
        if (l3Var.q() != 0) {
            h1(4, sb2);
            sb2.append("status: ");
            int i12 = 0;
            for (Long l10 : l3Var.p()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l10);
                i12 = i13;
            }
            sb2.append('\n');
        }
        if (l3Var.u() != 0) {
            h1(4, sb2);
            sb2.append("dynamic_filter_timestamps: {");
            int i14 = 0;
            for (com.google.android.gms.internal.measurement.y2 y2Var : l3Var.t()) {
                int i15 = i14 + 1;
                if (i14 != 0) {
                    sb2.append(", ");
                }
                sb2.append(y2Var.p() ? Integer.valueOf(y2Var.q()) : null);
                sb2.append(":");
                sb2.append(y2Var.r() ? Long.valueOf(y2Var.s()) : null);
                i14 = i15;
            }
            sb2.append("}\n");
        }
        if (l3Var.w() != 0) {
            h1(4, sb2);
            sb2.append("sequence_filter_timestamps: {");
            int i16 = 0;
            for (com.google.android.gms.internal.measurement.n3 n3Var : l3Var.v()) {
                int i17 = i16 + 1;
                if (i16 != 0) {
                    sb2.append(", ");
                }
                sb2.append(n3Var.p() ? Integer.valueOf(n3Var.q()) : null);
                sb2.append(": [");
                Iterator it = n3Var.r().iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i19 = i18 + 1;
                    if (i18 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(jLongValue);
                    i18 = i19;
                }
                sb2.append("]");
                i16 = i17;
            }
            sb2.append("}\n");
        }
        h1(3, sb2);
        sb2.append("}\n");
    }

    public static final void n1(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj == null) {
            return;
        }
        h1(i10 + 1, sb2);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    public static final void o1(StringBuilder sb2, int i10, String str, com.google.android.gms.internal.measurement.s1 s1Var) {
        String str2;
        if (s1Var == null) {
            return;
        }
        h1(i10, sb2);
        sb2.append(str);
        sb2.append(" {\n");
        if (s1Var.p()) {
            int iZ = s1Var.z();
            if (iZ == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iZ == 2) {
                str2 = "LESS_THAN";
            } else if (iZ != 3) {
                str2 = iZ != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            n1(sb2, i10, "comparison_type", str2);
        }
        if (s1Var.q()) {
            n1(sb2, i10, "match_as_float", Boolean.valueOf(s1Var.r()));
        }
        if (s1Var.s()) {
            n1(sb2, i10, "comparison_value", s1Var.t());
        }
        if (s1Var.u()) {
            n1(sb2, i10, "min_comparison_value", s1Var.v());
        }
        if (s1Var.w()) {
            n1(sb2, i10, "max_comparison_value", s1Var.x());
        }
        h1(i10, sb2);
        sb2.append("}\n");
    }

    private final void q1() {
    }

    private final void r1() {
    }

    private final void s1() {
    }

    public Parcelable A1(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (SafeParcelReader$ParseException unused) {
            q0 q0Var = ((h1) this.B).F;
            h1.g(q0Var);
            q0Var.G.b("Failed to load parcelable from buffer");
        } finally {
            parcelObtain.recycle();
        }
        return parcelable;
    }

    public List E1(j5 j5Var, List list) {
        int i10;
        h1 h1Var = (h1) this.B;
        ArrayList arrayList = new ArrayList(j5Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                q0 q0Var = h1Var.F;
                h1.g(q0Var);
                q0Var.J.c(num, "Ignoring negative bit index to be cleared");
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    q0 q0Var2 = h1Var.F;
                    h1.g(q0Var2);
                    q0Var2.J.d("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i10);
    }

    public boolean F1(long j9, long j10) {
        if (j9 == 0 || j10 <= 0) {
            return true;
        }
        ((h1) this.B).K.getClass();
        return Math.abs(System.currentTimeMillis() - j9) > j10;
    }

    public long G1(byte[] bArr) {
        com.google.android.gms.common.internal.d0.h(bArr);
        h1 h1Var = (h1) this.B;
        e4 e4Var = h1Var.I;
        h1.e(e4Var);
        e4Var.V0();
        MessageDigest messageDigestM1 = e4.m1();
        if (messageDigestM1 != null) {
            return e4.n1(messageDigestM1.digest(bArr));
        }
        q0 q0Var = h1Var.F;
        h1.g(q0Var);
        q0Var.G.b("Failed to get MD5");
        return 0L;
    }

    public byte[] H1(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e3) {
            q0 q0Var = ((h1) this.B).F;
            h1.g(q0Var);
            q0Var.G.c(e3, "Failed to gzip content");
            throw e3;
        }
    }

    @Override
    public final void Y0() {
        int i10 = this.E;
    }

    public void f1(StringBuilder sb2, int i10, k5 k5Var) {
        if (k5Var == null) {
            return;
        }
        int i11 = i10 + 1;
        Iterator it = k5Var.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.d3 d3Var = (com.google.android.gms.internal.measurement.d3) it.next();
            if (d3Var != null) {
                h1(i11, sb2);
                sb2.append("param {\n");
                n1(sb2, i11, "name", d3Var.p() ? ((h1) this.B).J.b(d3Var.q()) : null);
                n1(sb2, i11, "string_value", d3Var.r() ? d3Var.s() : null);
                n1(sb2, i11, "int_value", d3Var.t() ? Long.valueOf(d3Var.u()) : null);
                n1(sb2, i11, "double_value", d3Var.x() ? Double.valueOf(d3Var.y()) : null);
                if (d3Var.A() > 0) {
                    f1(sb2, i11, (k5) d3Var.z());
                }
                h1(i11, sb2);
                sb2.append("}\n");
            }
        }
    }

    public void g1(StringBuilder sb2, int i10, com.google.android.gms.internal.measurement.p1 p1Var) {
        String str;
        if (p1Var == null) {
            return;
        }
        h1(i10, sb2);
        sb2.append("filter {\n");
        if (p1Var.t()) {
            n1(sb2, i10, "complement", Boolean.valueOf(p1Var.u()));
        }
        if (p1Var.v()) {
            n1(sb2, i10, "param_name", ((h1) this.B).J.b(p1Var.w()));
        }
        if (p1Var.p()) {
            int i11 = i10 + 1;
            com.google.android.gms.internal.measurement.v1 v1VarQ = p1Var.q();
            if (v1VarQ != null) {
                h1(i11, sb2);
                sb2.append("string_filter {\n");
                if (v1VarQ.p()) {
                    switch (v1VarQ.x()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    n1(sb2, i11, "match_type", str);
                }
                if (v1VarQ.q()) {
                    n1(sb2, i11, "expression", v1VarQ.r());
                }
                if (v1VarQ.s()) {
                    n1(sb2, i11, "case_sensitive", Boolean.valueOf(v1VarQ.t()));
                }
                if (v1VarQ.v() > 0) {
                    h1(i10 + 2, sb2);
                    sb2.append("expression_list {\n");
                    for (String str2 : v1VarQ.u()) {
                        h1(i10 + 3, sb2);
                        sb2.append(str2);
                        sb2.append("\n");
                    }
                    sb2.append("}\n");
                }
                h1(i11, sb2);
                sb2.append("}\n");
            }
        }
        if (p1Var.r()) {
            o1(sb2, i10 + 1, "number_filter", p1Var.s());
        }
        h1(i10, sb2);
        sb2.append("}\n");
    }

    public boolean p1() {
        W0();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((h1) this.B).A.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void t1(com.google.android.gms.internal.measurement.q3 q3Var, Object obj) {
        com.google.android.gms.common.internal.d0.h(obj);
        q3Var.b();
        ((com.google.android.gms.internal.measurement.r3) q3Var.B).E();
        q3Var.b();
        ((com.google.android.gms.internal.measurement.r3) q3Var.B).G();
        q3Var.b();
        ((com.google.android.gms.internal.measurement.r3) q3Var.B).I();
        if (obj instanceof String) {
            q3Var.b();
            ((com.google.android.gms.internal.measurement.r3) q3Var.B).D((String) obj);
        } else if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            q3Var.b();
            ((com.google.android.gms.internal.measurement.r3) q3Var.B).F(jLongValue);
        } else if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            q3Var.b();
            ((com.google.android.gms.internal.measurement.r3) q3Var.B).H(dDoubleValue);
        } else {
            q0 q0Var = ((h1) this.B).F;
            h1.g(q0Var);
            q0Var.G.c(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public void u1(String str, u3 u3Var, com.google.android.gms.internal.measurement.g3 g3Var, r0 r0Var) {
        String str2;
        String str3 = u3Var.f14738a;
        h1 h1Var = (h1) this.B;
        V0();
        W0();
        try {
            URL url = new URI(str3).toURL();
            this.C.h0();
            byte[] bArrA = g3Var.a();
            e1 e1Var = h1Var.G;
            h1.g(e1Var);
            Map map = u3Var.f14739b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
            try {
                e1Var.h1(new s0(this, str2, url, bArrA, map, r0Var));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                q0 q0Var = h1Var.F;
                h1.g(q0Var);
                q0Var.G.d("Failed to parse URL. Not uploading MeasurementBatch. appId", q0.d1(str2), str3);
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            str2 = str;
        }
    }

    public void v1(com.google.android.gms.internal.measurement.c3 c3Var, Object obj) {
        c3Var.b();
        ((com.google.android.gms.internal.measurement.d3) c3Var.B).E();
        c3Var.b();
        ((com.google.android.gms.internal.measurement.d3) c3Var.B).G();
        c3Var.b();
        ((com.google.android.gms.internal.measurement.d3) c3Var.B).I();
        c3Var.b();
        ((com.google.android.gms.internal.measurement.d3) c3Var.B).L();
        if (obj instanceof String) {
            c3Var.j((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c3Var.k(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            c3Var.b();
            ((com.google.android.gms.internal.measurement.d3) c3Var.B).H(dDoubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            q0 q0Var = ((h1) this.B).F;
            h1.g(q0Var);
            q0Var.G.c(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.c3 c3VarB = com.google.android.gms.internal.measurement.d3.B();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.c3 c3VarB2 = com.google.android.gms.internal.measurement.d3.B();
                    c3VarB2.h(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        c3VarB2.k(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        c3VarB2.j((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double dDoubleValue2 = ((Double) obj2).doubleValue();
                        c3VarB2.b();
                        ((com.google.android.gms.internal.measurement.d3) c3VarB2.B).H(dDoubleValue2);
                    }
                    c3VarB.b();
                    ((com.google.android.gms.internal.measurement.d3) c3VarB.B).J((com.google.android.gms.internal.measurement.d3) c3VarB2.e());
                }
                if (((com.google.android.gms.internal.measurement.d3) c3VarB.B).A() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.d3) c3VarB.e());
                }
            }
        }
        c3Var.b();
        ((com.google.android.gms.internal.measurement.d3) c3Var.B).K(arrayList);
    }

    public n3 w1(String str, com.google.android.gms.internal.measurement.h3 h3Var, com.google.android.gms.internal.measurement.z2 z2Var, String str2) {
        int iIndexOf;
        m8.a();
        h1 h1Var = (h1) this.B;
        g gVar = h1Var.D;
        if (!gVar.f1(str, b0.P0)) {
            return null;
        }
        h1Var.K.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Set setOf = Set.of((Object[]) gVar.b1(str, b0.f14595u0).split(","));
        y3 y3Var = this.C;
        v3 v3Var = y3Var.J;
        a1 a1Var = y3Var.A;
        a1 a1Var2 = v3Var.C.A;
        y3.R(a1Var2);
        String strI1 = a1Var2.i1(str);
        Uri.Builder builder = new Uri.Builder();
        g gVar2 = ((h1) v3Var.B).D;
        builder.scheme(gVar2.b1(str, b0.f14581n0));
        if (TextUtils.isEmpty(strI1)) {
            builder.authority(gVar2.b1(str, b0.f14583o0));
        } else {
            String strB1 = gVar2.b1(str, b0.f14583o0);
            StringBuilder sb2 = new StringBuilder(String.valueOf(strI1).length() + 1 + String.valueOf(strB1).length());
            sb2.append(strI1);
            sb2.append(".");
            sb2.append(strB1);
            builder.authority(sb2.toString());
        }
        builder.path(gVar2.b1(str, b0.f14585p0));
        i1(builder, "gmp_app_id", ((com.google.android.gms.internal.measurement.i3) h3Var.B).E(), setOf);
        gVar.a1();
        i1(builder, "gmp_version", String.valueOf(133005L), setOf);
        String strY = ((com.google.android.gms.internal.measurement.i3) h3Var.B).y();
        a0 a0Var = b0.S0;
        if (gVar.f1(str, a0Var)) {
            y3.R(a1Var);
            if (a1Var.o1(str)) {
                strY = RuntimeVersion.SUFFIX;
            }
        }
        i1(builder, "app_instance_id", strY, setOf);
        i1(builder, "rdid", ((com.google.android.gms.internal.measurement.i3) h3Var.B).v(), setOf);
        i1(builder, "bundle_id", h3Var.q(), setOf);
        String strP = z2Var.p();
        String strG = u1.g(strP, u1.f14729c, u1.f14727a);
        if (true != TextUtils.isEmpty(strG)) {
            strP = strG;
        }
        i1(builder, "app_event_name", strP, setOf);
        i1(builder, "app_version", String.valueOf(((com.google.android.gms.internal.measurement.i3) h3Var.B).K()), setOf);
        String strI2 = ((com.google.android.gms.internal.measurement.i3) h3Var.B).i2();
        if (gVar.f1(str, a0Var)) {
            y3.R(a1Var);
            if (a1Var.n1(str) && !TextUtils.isEmpty(strI2) && (iIndexOf = strI2.indexOf(".")) != -1) {
                strI2 = strI2.substring(0, iIndexOf);
            }
        }
        i1(builder, "os_version", strI2, setOf);
        i1(builder, "timestamp", String.valueOf(z2Var.q()), setOf);
        if (((com.google.android.gms.internal.measurement.i3) h3Var.B).x()) {
            i1(builder, "lat", "1", setOf);
        }
        i1(builder, "privacy_sandbox_version", String.valueOf(((com.google.android.gms.internal.measurement.i3) h3Var.B).G0()), setOf);
        i1(builder, "trigger_uri_source", "1", setOf);
        i1(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), setOf);
        i1(builder, "request_uuid", str2, setOf);
        List<com.google.android.gms.internal.measurement.d3> listH = z2Var.h();
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.d3 d3Var : listH) {
            String strQ = d3Var.q();
            if (d3Var.x()) {
                bundle.putString(strQ, String.valueOf(d3Var.y()));
            } else if (d3Var.v()) {
                bundle.putString(strQ, String.valueOf(d3Var.w()));
            } else if (d3Var.r()) {
                bundle.putString(strQ, d3Var.s());
            } else if (d3Var.t()) {
                bundle.putString(strQ, String.valueOf(d3Var.u()));
            }
        }
        l1(builder, gVar.b1(str, b0.f14593t0).split("\\|"), bundle, setOf);
        List<com.google.android.gms.internal.measurement.r3> listUnmodifiableList = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.i3) h3Var.B).U1());
        Bundle bundle2 = new Bundle();
        for (com.google.android.gms.internal.measurement.r3 r3Var : listUnmodifiableList) {
            String strR = r3Var.r();
            if (r3Var.y()) {
                bundle2.putString(strR, String.valueOf(r3Var.z()));
            } else if (r3Var.w()) {
                bundle2.putString(strR, String.valueOf(r3Var.x()));
            } else if (r3Var.s()) {
                bundle2.putString(strR, r3Var.t());
            } else if (r3Var.u()) {
                bundle2.putString(strR, String.valueOf(r3Var.v()));
            }
        }
        l1(builder, gVar.b1(str, b0.f14591s0).split("\\|"), bundle2, setOf);
        i1(builder, "dma", true != ((com.google.android.gms.internal.measurement.i3) h3Var.B).D0() ? "0" : "1", setOf);
        if (!((com.google.android.gms.internal.measurement.i3) h3Var.B).F0().isEmpty()) {
            i1(builder, "dma_cps", ((com.google.android.gms.internal.measurement.i3) h3Var.B).F0(), setOf);
        }
        if (((com.google.android.gms.internal.measurement.i3) h3Var.B).L0()) {
            com.google.android.gms.internal.measurement.n2 n2VarM0 = ((com.google.android.gms.internal.measurement.i3) h3Var.B).M0();
            if (!n2VarM0.z().isEmpty()) {
                i1(builder, "dl_gclid", n2VarM0.z(), setOf);
            }
            if (!n2VarM0.B().isEmpty()) {
                i1(builder, "dl_gbraid", n2VarM0.B(), setOf);
            }
            if (!n2VarM0.D().isEmpty()) {
                i1(builder, "dl_gs", n2VarM0.D(), setOf);
            }
            if (n2VarM0.F() > 0) {
                i1(builder, "dl_ss_ts", String.valueOf(n2VarM0.F()), setOf);
            }
            if (!n2VarM0.H().isEmpty()) {
                i1(builder, "mr_gclid", n2VarM0.H(), setOf);
            }
            if (!n2VarM0.J().isEmpty()) {
                i1(builder, "mr_gbraid", n2VarM0.J(), setOf);
            }
            if (!n2VarM0.L().isEmpty()) {
                i1(builder, "mr_gs", n2VarM0.L(), setOf);
            }
            if (n2VarM0.N() > 0) {
                i1(builder, "mr_click_ts", String.valueOf(n2VarM0.N()), setOf);
            }
        }
        return new n3(builder.build().toString(), jCurrentTimeMillis, 1);
    }

    public com.google.android.gms.internal.measurement.a3 x1(l7.k kVar) {
        com.google.android.gms.internal.measurement.z2 z2VarZ = com.google.android.gms.internal.measurement.a3.z();
        long j9 = kVar.f10089c;
        z2VarZ.b();
        ((com.google.android.gms.internal.measurement.a3) z2VarZ.B).H(j9);
        r rVar = (r) kVar.f10093g;
        Objects.requireNonNull(rVar);
        Bundle bundle = rVar.A;
        for (String str : bundle.keySet()) {
            com.google.android.gms.internal.measurement.c3 c3VarB = com.google.android.gms.internal.measurement.d3.B();
            c3VarB.h(str);
            Object obj = bundle.get(str);
            com.google.android.gms.common.internal.d0.h(obj);
            v1(c3VarB, obj);
            z2VarZ.n(c3VarB);
        }
        String str2 = (String) kVar.f10092f;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            com.google.android.gms.internal.measurement.c3 c3VarB2 = com.google.android.gms.internal.measurement.d3.B();
            c3VarB2.h("_o");
            c3VarB2.j(str2);
            z2VarZ.m((com.google.android.gms.internal.measurement.d3) c3VarB2.e());
        }
        return (com.google.android.gms.internal.measurement.a3) z2VarZ.e();
    }

    public String y1(com.google.android.gms.internal.measurement.g3 g3Var) {
        String str;
        String str2;
        String str3;
        com.google.android.gms.internal.measurement.q2 q2VarI0;
        StringBuilder sbQ = x5.q("\nbatch {\n");
        if (g3Var.u()) {
            n1(sbQ, 0, "upload_subdomain", g3Var.v());
        }
        if (g3Var.s()) {
            n1(sbQ, 0, "sgtm_join_id", g3Var.t());
        }
        for (com.google.android.gms.internal.measurement.i3 i3Var : g3Var.p()) {
            if (i3Var != null) {
                h1(1, sbQ);
                sbQ.append("bundle {\n");
                if (i3Var.P()) {
                    n1(sbQ, 1, "protocol_version", Integer.valueOf(i3Var.P0()));
                }
                h1 h1Var = (h1) this.B;
                g gVar = h1Var.D;
                m0 m0Var = h1Var.J;
                if (gVar.f1(i3Var.p(), b0.M0) && i3Var.v0()) {
                    n1(sbQ, 1, "session_stitching_token", i3Var.w0());
                }
                n1(sbQ, 1, "platform", i3Var.h2());
                if (i3Var.r()) {
                    n1(sbQ, 1, "gmp_version", Long.valueOf(i3Var.s()));
                }
                if (i3Var.t()) {
                    n1(sbQ, 1, "uploading_gmp_version", Long.valueOf(i3Var.u()));
                }
                if (i3Var.r0()) {
                    n1(sbQ, 1, "dynamite_version", Long.valueOf(i3Var.s0()));
                }
                if (i3Var.L()) {
                    n1(sbQ, 1, "config_version", Long.valueOf(i3Var.M()));
                }
                n1(sbQ, 1, "gmp_app_id", i3Var.E());
                n1(sbQ, 1, "app_id", i3Var.p());
                n1(sbQ, 1, "app_version", i3Var.q());
                if (i3Var.J()) {
                    n1(sbQ, 1, "app_version_major", Integer.valueOf(i3Var.K()));
                }
                n1(sbQ, 1, "firebase_instance_id", i3Var.I());
                if (i3Var.z()) {
                    n1(sbQ, 1, "dev_cert_hash", Long.valueOf(i3Var.A()));
                }
                n1(sbQ, 1, "app_store", i3Var.n2());
                if (i3Var.X1()) {
                    n1(sbQ, 1, "upload_timestamp_millis", Long.valueOf(i3Var.Y1()));
                }
                if (i3Var.Z1()) {
                    n1(sbQ, 1, "start_timestamp_millis", Long.valueOf(i3Var.a2()));
                }
                if (i3Var.b2()) {
                    n1(sbQ, 1, "end_timestamp_millis", Long.valueOf(i3Var.c2()));
                }
                if (i3Var.d2()) {
                    n1(sbQ, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(i3Var.e2()));
                }
                if (i3Var.f2()) {
                    n1(sbQ, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(i3Var.g2()));
                }
                n1(sbQ, 1, "app_instance_id", i3Var.y());
                n1(sbQ, 1, "resettable_device_id", i3Var.v());
                n1(sbQ, 1, "ds_id", i3Var.O());
                if (i3Var.w()) {
                    n1(sbQ, 1, "limited_ad_tracking", Boolean.valueOf(i3Var.x()));
                }
                n1(sbQ, 1, "os_version", i3Var.i2());
                n1(sbQ, 1, "device_model", i3Var.j2());
                n1(sbQ, 1, "user_default_language", i3Var.k2());
                if (i3Var.l2()) {
                    n1(sbQ, 1, "time_zone_offset_minutes", Integer.valueOf(i3Var.m2()));
                }
                if (i3Var.B()) {
                    n1(sbQ, 1, "bundle_sequential_index", Integer.valueOf(i3Var.C()));
                }
                if (i3Var.J0()) {
                    n1(sbQ, 1, "delivery_index", Integer.valueOf(i3Var.K0()));
                }
                if (i3Var.F()) {
                    n1(sbQ, 1, "service_upload", Boolean.valueOf(i3Var.G()));
                }
                n1(sbQ, 1, "health_monitor", i3Var.D());
                if (i3Var.p0()) {
                    n1(sbQ, 1, "retry_counter", Integer.valueOf(i3Var.q0()));
                }
                if (i3Var.t0()) {
                    n1(sbQ, 1, "consent_signals", i3Var.u0());
                }
                if (i3Var.C0()) {
                    n1(sbQ, 1, "is_dma_region", Boolean.valueOf(i3Var.D0()));
                }
                if (i3Var.E0()) {
                    n1(sbQ, 1, "core_platform_services", i3Var.F0());
                }
                if (i3Var.A0()) {
                    n1(sbQ, 1, "consent_diagnostics", i3Var.B0());
                }
                if (i3Var.x0()) {
                    n1(sbQ, 1, "target_os_version", Long.valueOf(i3Var.y0()));
                }
                m8.a();
                if (h1Var.D.f1(i3Var.p(), b0.P0)) {
                    n1(sbQ, 1, "ad_services_version", Integer.valueOf(i3Var.G0()));
                    if (i3Var.H0() && (q2VarI0 = i3Var.I0()) != null) {
                        h1(2, sbQ);
                        sbQ.append("attribution_eligibility_status {\n");
                        n1(sbQ, 2, "eligible", Boolean.valueOf(q2VarI0.p()));
                        n1(sbQ, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(q2VarI0.q()));
                        n1(sbQ, 2, "pre_r", Boolean.valueOf(q2VarI0.r()));
                        n1(sbQ, 2, "r_extensions_too_old", Boolean.valueOf(q2VarI0.s()));
                        n1(sbQ, 2, "adservices_extension_too_old", Boolean.valueOf(q2VarI0.t()));
                        n1(sbQ, 2, "ad_storage_not_allowed", Boolean.valueOf(q2VarI0.u()));
                        n1(sbQ, 2, "measurement_manager_disabled", Boolean.valueOf(q2VarI0.v()));
                        h1(2, sbQ);
                        sbQ.append("}\n");
                    }
                }
                if (i3Var.L0()) {
                    com.google.android.gms.internal.measurement.n2 n2VarM0 = i3Var.M0();
                    h1(2, sbQ);
                    sbQ.append("ad_campaign_info {\n");
                    if (n2VarM0.y()) {
                        n1(sbQ, 2, "deep_link_gclid", n2VarM0.z());
                    }
                    if (n2VarM0.A()) {
                        n1(sbQ, 2, "deep_link_gbraid", n2VarM0.B());
                    }
                    if (n2VarM0.C()) {
                        n1(sbQ, 2, "deep_link_gad_source", n2VarM0.D());
                    }
                    if (n2VarM0.E()) {
                        n1(sbQ, 2, "deep_link_session_millis", Long.valueOf(n2VarM0.F()));
                    }
                    if (n2VarM0.G()) {
                        n1(sbQ, 2, "market_referrer_gclid", n2VarM0.H());
                    }
                    if (n2VarM0.I()) {
                        n1(sbQ, 2, "market_referrer_gbraid", n2VarM0.J());
                    }
                    if (n2VarM0.K()) {
                        n1(sbQ, 2, "market_referrer_gad_source", n2VarM0.L());
                    }
                    if (n2VarM0.M()) {
                        n1(sbQ, 2, "market_referrer_click_millis", Long.valueOf(n2VarM0.N()));
                    }
                    h1(2, sbQ);
                    sbQ.append("}\n");
                }
                if (i3Var.Q()) {
                    n1(sbQ, 1, "batching_timestamp_millis", Long.valueOf(i3Var.R()));
                }
                if (i3Var.N0()) {
                    com.google.android.gms.internal.measurement.p3 p3VarO0 = i3Var.O0();
                    h1(2, sbQ);
                    sbQ.append("sgtm_diagnostics {\n");
                    int iT = p3VarO0.t();
                    if (iT == 1) {
                        str2 = "UPLOAD_TYPE_UNKNOWN";
                    } else if (iT == 2) {
                        str2 = "GA_UPLOAD";
                    } else if (iT != 3) {
                        str2 = iT != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD";
                    } else {
                        str2 = "SDK_CLIENT_UPLOAD";
                    }
                    n1(sbQ, 2, "upload_type", str2);
                    n1(sbQ, 2, "client_upload_eligibility", a1.b.C(p3VarO0.p()));
                    int iU = p3VarO0.u();
                    if (iU == 1) {
                        str3 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    } else if (iU == 2) {
                        str3 = "SERVICE_UPLOAD_ELIGIBLE";
                    } else if (iU == 3) {
                        str3 = "NOT_IN_ROLLOUT";
                    } else if (iU != 4) {
                        str3 = iU != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO";
                    } else {
                        str3 = "MISSING_SGTM_SETTINGS";
                    }
                    n1(sbQ, 2, "service_upload_eligibility", str3);
                    h1(2, sbQ);
                    sbQ.append("}\n");
                }
                if (i3Var.S()) {
                    com.google.android.gms.internal.measurement.w2 w2VarT = i3Var.T();
                    h1(2, sbQ);
                    sbQ.append("consent_info_extra {\n");
                    for (com.google.android.gms.internal.measurement.v2 v2Var : w2VarT.p()) {
                        h1(3, sbQ);
                        sbQ.append("limited_data_modes {\n");
                        int iQ = v2Var.q();
                        if (iQ == 1) {
                            str = "CONSENT_TYPE_UNSPECIFIED";
                        } else if (iQ == 2) {
                            str = "AD_STORAGE";
                        } else if (iQ != 3) {
                            str = iQ != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA";
                        } else {
                            str = "ANALYTICS_STORAGE";
                        }
                        n1(sbQ, 3, "type", str);
                        int iR = v2Var.r();
                        n1(sbQ, 3, "mode", iR != 1 ? iR != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        h1(3, sbQ);
                        sbQ.append("}\n");
                    }
                    h1(2, sbQ);
                    sbQ.append("}\n");
                }
                k5<com.google.android.gms.internal.measurement.r3> k5VarU1 = i3Var.U1();
                if (k5VarU1 != null) {
                    for (com.google.android.gms.internal.measurement.r3 r3Var : k5VarU1) {
                        if (r3Var != null) {
                            h1(2, sbQ);
                            sbQ.append("user_property {\n");
                            n1(sbQ, 2, "set_timestamp_millis", r3Var.p() ? Long.valueOf(r3Var.q()) : null);
                            n1(sbQ, 2, "name", m0Var.c(r3Var.r()));
                            n1(sbQ, 2, "string_value", r3Var.t());
                            n1(sbQ, 2, "int_value", r3Var.u() ? Long.valueOf(r3Var.v()) : null);
                            n1(sbQ, 2, "double_value", r3Var.y() ? Double.valueOf(r3Var.z()) : null);
                            h1(2, sbQ);
                            sbQ.append("}\n");
                        }
                    }
                }
                k5<com.google.android.gms.internal.measurement.s2> k5VarH = i3Var.H();
                if (k5VarH != null) {
                    for (com.google.android.gms.internal.measurement.s2 s2Var : k5VarH) {
                        if (s2Var != null) {
                            h1(2, sbQ);
                            sbQ.append("audience_membership {\n");
                            if (s2Var.p()) {
                                n1(sbQ, 2, "audience_id", Integer.valueOf(s2Var.q()));
                            }
                            if (s2Var.u()) {
                                n1(sbQ, 2, "new_audience", Boolean.valueOf(s2Var.v()));
                            }
                            m1(sbQ, "current_data", s2Var.r());
                            if (s2Var.s()) {
                                m1(sbQ, "previous_data", s2Var.t());
                            }
                            h1(2, sbQ);
                            sbQ.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.a3> listP1 = i3Var.P1();
                if (listP1 != null) {
                    for (com.google.android.gms.internal.measurement.a3 a3Var : listP1) {
                        if (a3Var != null) {
                            h1(2, sbQ);
                            sbQ.append("event {\n");
                            n1(sbQ, 2, "name", m0Var.a(a3Var.s()));
                            if (a3Var.t()) {
                                n1(sbQ, 2, "timestamp_millis", Long.valueOf(a3Var.u()));
                            }
                            if (a3Var.v()) {
                                n1(sbQ, 2, "previous_timestamp_millis", Long.valueOf(a3Var.w()));
                            }
                            if (a3Var.x()) {
                                n1(sbQ, 2, "count", Integer.valueOf(a3Var.y()));
                            }
                            if (a3Var.q() != 0) {
                                f1(sbQ, 2, (k5) a3Var.p());
                            }
                            h1(2, sbQ);
                            sbQ.append("}\n");
                        }
                    }
                }
                h1(1, sbQ);
                sbQ.append("}\n");
            }
        }
        sbQ.append("} // End-of-batch\n");
        return sbQ.toString();
    }

    public String z1(com.google.android.gms.internal.measurement.u1 u1Var) {
        StringBuilder sbQ = x5.q("\nproperty_filter {\n");
        if (u1Var.p()) {
            n1(sbQ, 0, "filter_id", Integer.valueOf(u1Var.q()));
        }
        n1(sbQ, 0, "property_name", ((h1) this.B).J.c(u1Var.r()));
        String strJ1 = j1(u1Var.t(), u1Var.u(), u1Var.w());
        if (!strJ1.isEmpty()) {
            n1(sbQ, 0, "filter_type", strJ1);
        }
        g1(sbQ, 1, u1Var.s());
        sbQ.append("}\n");
        return sbQ.toString();
    }
}
