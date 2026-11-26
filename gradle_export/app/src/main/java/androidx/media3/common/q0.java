package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public final class q0 {

    public static final q0 f1408g;

    public static final String f1409h;

    public static final String f1410i;

    public static final String f1411j;

    public static final String f1412k;
    public static final String l;
    public static final String m;

    public final String f1413a;

    public final l0 f1414b;

    public final k0 f1415c;

    public final t0 f1416d;

    public final g0 f1417e;

    public final m0 f1418f;

    static {
        e0 e0Var = new e0();
        fh.r0 r0Var = fh.t0.B;
        fh.d2 d2Var = fh.d2.E;
        List list = Collections.EMPTY_LIST;
        fh.d2 d2Var2 = fh.d2.E;
        j0 j0Var = new j0();
        f1408g = new q0(RuntimeVersion.SUFFIX, new g0(e0Var), null, new k0(j0Var), t0.K, m0.f1344d);
        f1409h = Integer.toString(0, 36);
        f1410i = Integer.toString(1, 36);
        f1411j = Integer.toString(2, 36);
        f1412k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = Integer.toString(5, 36);
    }

    public q0(String str, g0 g0Var, l0 l0Var, k0 k0Var, t0 t0Var, m0 m0Var) {
        this.f1413a = str;
        this.f1414b = l0Var;
        this.f1415c = k0Var;
        this.f1416d = t0Var;
        this.f1417e = g0Var;
        this.f1418f = m0Var;
    }

    public static q0 a(Bundle bundle) {
        g0 g0Var;
        m0 m0Var;
        Map mapA;
        i0 i0Var;
        c0 c0Var;
        fh.d2 d2VarG;
        fh.d2 d2VarE;
        l0 l0Var;
        String string = bundle.getString(f1409h, RuntimeVersion.SUFFIX);
        string.getClass();
        Bundle bundle2 = bundle.getBundle(f1410i);
        k0 k0VarB = bundle2 == null ? k0.f1302f : k0.b(bundle2);
        Bundle bundle3 = bundle.getBundle(f1411j);
        t0 t0VarB = bundle3 == null ? t0.K : t0.b(bundle3);
        Bundle bundle4 = bundle.getBundle(f1412k);
        boolean z10 = false;
        if (bundle4 == null) {
            g0Var = g0.f1212r;
        } else {
            e0 e0Var = new e0();
            String str = f0.f1192j;
            f0 f0Var = f0.f1191i;
            long j9 = f0Var.f1198a;
            long j10 = f0Var.f1201d;
            long j11 = f0Var.f1199b;
            long jH = e7.i0.H(bundle4.getLong(str, j9));
            boolean z11 = true;
            ta.c0.s(jH >= 0);
            e0Var.f1171a = jH;
            long jH2 = e7.i0.H(bundle4.getLong(f0.f1193k, f0Var.f1200c));
            ta.c0.s(jH2 == Long.MIN_VALUE || jH2 >= 0);
            e0Var.f1172b = jH2;
            e0Var.f1173c = bundle4.getBoolean(f0.l, f0Var.f1202e);
            e0Var.f1174d = bundle4.getBoolean(f0.m, f0Var.f1203f);
            e0Var.f1175e = bundle4.getBoolean(f0.f1194n, f0Var.f1204g);
            e0Var.f1176f = bundle4.getBoolean(f0.f1197q, f0Var.f1205h);
            long j12 = bundle4.getLong(f0.f1195o, j11);
            if (j12 != j11) {
                ta.c0.s(j12 >= 0);
                e0Var.f1171a = j12;
            }
            long j13 = bundle4.getLong(f0.f1196p, j10);
            if (j13 != j10) {
                if (j13 != Long.MIN_VALUE && j13 < 0) {
                    z11 = false;
                }
                ta.c0.s(z11);
                e0Var.f1172b = j13;
            }
            g0Var = new g0(e0Var);
        }
        g0 g0Var2 = g0Var;
        Bundle bundle5 = bundle.getBundle(l);
        if (bundle5 == null) {
            m0Var = m0.f1344d;
        } else {
            a1.i iVar = new a1.i(2, z10);
            iVar.B = (Uri) bundle5.getParcelable(m0.f1345e);
            iVar.C = bundle5.getString(m0.f1346f);
            iVar.D = bundle5.getBundle(m0.f1347g);
            m0Var = new m0(iVar);
        }
        m0 m0Var2 = m0Var;
        Bundle bundle6 = bundle.getBundle(m);
        if (bundle6 == null) {
            l0Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(l0.f1324k);
            if (bundle7 == null) {
                i0Var = null;
            } else {
                String string2 = bundle7.getString(i0.f1250i);
                string2.getClass();
                UUID uuidFromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle7.getParcelable(i0.f1251j);
                String str2 = i0.f1252k;
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle7.getBundle(str2);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                if (bundle9 == bundle8) {
                    mapA = fh.i2.G;
                } else {
                    HashMap map = new HashMap();
                    if (bundle9 != bundle8) {
                        for (String str3 : bundle9.keySet()) {
                            String string3 = bundle9.getString(str3);
                            if (string3 != null) {
                                map.put(str3, string3);
                            }
                        }
                    }
                    mapA = fh.w0.a(map);
                }
                boolean z12 = bundle7.getBoolean(i0.l, false);
                boolean z13 = bundle7.getBoolean(i0.m, false);
                boolean z14 = bundle7.getBoolean(i0.f1253n, false);
                String str4 = i0.f1254o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle7.getIntegerArrayList(str4);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                fh.t0 t0VarO = fh.t0.o(arrayList);
                byte[] byteArray = bundle7.getByteArray(i0.f1255p);
                h0 h0Var = new h0(uuidFromString);
                h0Var.f1223e = uri;
                h0Var.f1224f = fh.w0.a(mapA);
                h0Var.f1219a = z12;
                h0Var.f1221c = z14;
                h0Var.f1220b = z13;
                h0Var.f1225g = fh.t0.o(t0VarO);
                h0Var.f1226h = byteArray != null ? Arrays.copyOf(byteArray, byteArray.length) : 0;
                i0Var = new i0(h0Var);
            }
            Bundle bundle10 = bundle6.getBundle(l0.l);
            if (bundle10 == null) {
                c0Var = null;
            } else {
                Uri uri2 = (Uri) bundle10.getParcelable(c0.f1139b);
                uri2.getClass();
                a1 a1Var = new a1();
                a1Var.f1066a = uri2;
                c0Var = new c0(a1Var);
            }
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(l0.m);
            if (parcelableArrayList == null) {
                fh.r0 r0Var = fh.t0.B;
                d2VarG = fh.d2.E;
            } else {
                fh.q0 q0VarM = fh.t0.m();
                int i10 = 0;
                while (i10 < parcelableArrayList.size()) {
                    Bundle bundle11 = (Bundle) parcelableArrayList.get(i10);
                    bundle11.getClass();
                    q0VarM.c(new e2(bundle11.getInt(e2.D, 0), bundle11.getInt(e2.E, 0), bundle11.getInt(e2.F, 0)));
                    i10++;
                    parcelableArrayList = parcelableArrayList;
                }
                d2VarG = q0VarM.g();
            }
            fh.d2 d2Var = d2VarG;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(l0.f1326o);
            if (parcelableArrayList2 == null) {
                fh.r0 r0Var2 = fh.t0.B;
                d2VarE = fh.d2.E;
            } else {
                d2VarE = e7.d.e(new a8.n(6), parcelableArrayList2);
            }
            fh.d2 d2Var2 = d2VarE;
            long j14 = bundle6.getLong(l0.f1327p, -9223372036854775807L);
            Uri uri3 = (Uri) bundle6.getParcelable(l0.f1322i);
            uri3.getClass();
            l0Var = new l0(uri3, bundle6.getString(l0.f1323j), i0Var, c0Var, d2Var, bundle6.getString(l0.f1325n), d2Var2, j14);
        }
        return new q0(string, g0Var2, l0Var, k0VarB, t0VarB, m0Var2);
    }

    public static q0 b(Uri uri) {
        l0 l0Var;
        e0 e0Var = new e0();
        h0 h0Var = new h0();
        List list = Collections.EMPTY_LIST;
        fh.d2 d2Var = fh.d2.E;
        j0 j0Var = new j0();
        m0 m0Var = m0.f1344d;
        ta.c0.A(((Uri) h0Var.f1223e) == null || ((UUID) h0Var.f1222d) != null);
        i0 i0Var = null;
        if (uri != null) {
            if (((UUID) h0Var.f1222d) != null) {
                i0Var = new i0(h0Var);
            }
            l0Var = new l0(uri, null, i0Var, null, list, null, d2Var, -9223372036854775807L);
        } else {
            l0Var = null;
        }
        return new q0(RuntimeVersion.SUFFIX, new g0(e0Var), l0Var, new k0(j0Var), t0.K, m0Var);
    }

    public final Bundle c(boolean z10) {
        l0 l0Var;
        Bundle bundle = new Bundle();
        String str = this.f1413a;
        if (!str.equals(RuntimeVersion.SUFFIX)) {
            bundle.putString(f1409h, str);
        }
        k0 k0Var = k0.f1302f;
        k0 k0Var2 = this.f1415c;
        if (!k0Var2.equals(k0Var)) {
            bundle.putBundle(f1410i, k0Var2.c());
        }
        t0 t0Var = t0.K;
        t0 t0Var2 = this.f1416d;
        if (!t0Var2.equals(t0Var)) {
            bundle.putBundle(f1411j, t0Var2.c());
        }
        f0 f0Var = f0.f1191i;
        g0 g0Var = this.f1417e;
        if (!g0Var.equals(f0Var)) {
            Bundle bundle2 = new Bundle();
            long j9 = g0Var.f1198a;
            if (j9 != f0Var.f1198a) {
                bundle2.putLong(f0.f1192j, j9);
            }
            long j10 = g0Var.f1200c;
            if (j10 != f0Var.f1200c) {
                bundle2.putLong(f0.f1193k, j10);
            }
            long j11 = g0Var.f1199b;
            if (j11 != f0Var.f1199b) {
                bundle2.putLong(f0.f1195o, j11);
            }
            long j12 = g0Var.f1201d;
            if (j12 != f0Var.f1201d) {
                bundle2.putLong(f0.f1196p, j12);
            }
            boolean z11 = g0Var.f1202e;
            if (z11 != f0Var.f1202e) {
                bundle2.putBoolean(f0.l, z11);
            }
            boolean z12 = g0Var.f1203f;
            if (z12 != f0Var.f1203f) {
                bundle2.putBoolean(f0.m, z12);
            }
            boolean z13 = g0Var.f1204g;
            if (z13 != f0Var.f1204g) {
                bundle2.putBoolean(f0.f1194n, z13);
            }
            boolean z14 = g0Var.f1205h;
            if (z14 != f0Var.f1205h) {
                bundle2.putBoolean(f0.f1197q, z14);
            }
            bundle.putBundle(f1412k, bundle2);
        }
        m0 m0Var = m0.f1344d;
        m0 m0Var2 = this.f1418f;
        if (!m0Var2.equals(m0Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = m0Var2.f1348a;
            if (uri != null) {
                bundle3.putParcelable(m0.f1345e, uri);
            }
            String str2 = m0Var2.f1349b;
            if (str2 != null) {
                bundle3.putString(m0.f1346f, str2);
            }
            Bundle bundle4 = m0Var2.f1350c;
            if (bundle4 != null) {
                bundle3.putBundle(m0.f1347g, bundle4);
            }
            bundle.putBundle(l, bundle3);
        }
        if (z10 && (l0Var = this.f1414b) != null) {
            fh.t0 t0Var3 = l0Var.f1334g;
            List list = l0Var.f1332e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(l0.f1322i, l0Var.f1328a);
            String str3 = l0Var.f1329b;
            if (str3 != null) {
                bundle5.putString(l0.f1323j, str3);
            }
            i0 i0Var = l0Var.f1330c;
            if (i0Var != null) {
                String str4 = l0.f1324k;
                fh.t0 t0Var4 = i0Var.f1262g;
                fh.w0 w0Var = i0Var.f1258c;
                Bundle bundle6 = new Bundle();
                bundle6.putString(i0.f1250i, i0Var.f1256a.toString());
                Uri uri2 = i0Var.f1257b;
                if (uri2 != null) {
                    bundle6.putParcelable(i0.f1251j, uri2);
                }
                if (!w0Var.isEmpty()) {
                    String str5 = i0.f1252k;
                    Bundle bundle7 = new Bundle();
                    for (Map.Entry entry : w0Var.entrySet()) {
                        bundle7.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle6.putBundle(str5, bundle7);
                }
                boolean z15 = i0Var.f1259d;
                if (z15) {
                    bundle6.putBoolean(i0.l, z15);
                }
                boolean z16 = i0Var.f1260e;
                if (z16) {
                    bundle6.putBoolean(i0.m, z16);
                }
                boolean z17 = i0Var.f1261f;
                if (z17) {
                    bundle6.putBoolean(i0.f1253n, z17);
                }
                if (!t0Var4.isEmpty()) {
                    bundle6.putIntegerArrayList(i0.f1254o, new ArrayList<>(t0Var4));
                }
                byte[] bArr = i0Var.f1263h;
                if (bArr != null) {
                    bundle6.putByteArray(i0.f1255p, bArr);
                }
                bundle5.putBundle(str4, bundle6);
            }
            c0 c0Var = l0Var.f1331d;
            if (c0Var != null) {
                String str6 = l0.l;
                Bundle bundle8 = new Bundle();
                bundle8.putParcelable(c0.f1139b, c0Var.f1140a);
                bundle5.putBundle(str6, bundle8);
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(l0.m, e7.d.k(list, new a8.n(4)));
            }
            String str7 = l0Var.f1333f;
            if (str7 != null) {
                bundle5.putString(l0.f1325n, str7);
            }
            if (!t0Var3.isEmpty()) {
                bundle5.putParcelableArrayList(l0.f1326o, e7.d.k(t0Var3, new a8.n(5)));
            }
            long j13 = l0Var.f1335h;
            if (j13 != -9223372036854775807L) {
                bundle5.putLong(l0.f1327p, j13);
            }
            bundle.putBundle(m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Objects.equals(this.f1413a, q0Var.f1413a) && this.f1417e.equals(q0Var.f1417e) && Objects.equals(this.f1414b, q0Var.f1414b) && Objects.equals(this.f1415c, q0Var.f1415c) && Objects.equals(this.f1416d, q0Var.f1416d) && Objects.equals(this.f1418f, q0Var.f1418f);
    }

    public final int hashCode() {
        int iHashCode = this.f1413a.hashCode() * 31;
        l0 l0Var = this.f1414b;
        return this.f1418f.hashCode() + ((this.f1416d.hashCode() + ((this.f1417e.hashCode() + ((this.f1415c.hashCode() + ((iHashCode + (l0Var != null ? l0Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
