package a8;

import android.net.Uri;
import android.os.Bundle;
import androidx.media3.cast.CastPlayer;
import androidx.media3.common.d1;
import androidx.media3.common.e2;
import androidx.media3.common.f1;
import androidx.media3.common.h2;
import androidx.media3.common.j2;
import androidx.media3.common.l2;
import androidx.media3.common.p0;
import androidx.media3.common.q0;
import androidx.media3.common.r2;
import androidx.media3.common.x0;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.protobuf.RuntimeVersion;
import com.revenuecat.purchases.PurchasesOrchestrator;
import fh.d2;
import fh.t0;
import java.lang.reflect.Constructor;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import sd.y1;

public final class n implements CastPlayer.TransferCallback, eh.k, e7.m, t, qd.u, ii.e, dk.o {
    public final int A;

    public n(int i10) {
        this.A = i10;
    }

    @Override
    public Object apply(Object obj) {
        androidx.media3.common.c cVar;
        androidx.media3.common.a[] aVarArr;
        int i10;
        q0[] q0VarArr;
        long[] jArr;
        String[] strArr;
        androidx.media3.common.b[] bVarArr;
        int i11;
        Bundle bundle;
        androidx.media3.common.b bVar;
        d2 d2VarG;
        int i12 = 0;
        switch (this.A) {
            case 3:
                androidx.media3.common.b0 b0Var = (androidx.media3.common.b0) obj;
                return b0Var.f1099a + ": " + b0Var.f1100b;
            case 4:
                e2 e2Var = (e2) obj;
                e2Var.getClass();
                Bundle bundle2 = new Bundle();
                int i13 = e2Var.A;
                if (i13 != 0) {
                    bundle2.putInt(e2.D, i13);
                }
                int i14 = e2Var.B;
                if (i14 != 0) {
                    bundle2.putInt(e2.E, i14);
                }
                int i15 = e2Var.C;
                if (i15 != 0) {
                    bundle2.putInt(e2.F, i15);
                }
                return bundle2;
            case 5:
                p0 p0Var = (p0) obj;
                p0Var.getClass();
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable(p0.f1372h, p0Var.f1377a);
                String str = p0Var.f1378b;
                if (str != null) {
                    bundle3.putString(p0.f1373i, str);
                }
                String str2 = p0Var.f1379c;
                if (str2 != null) {
                    bundle3.putString(p0.f1374j, str2);
                }
                int i16 = p0Var.f1380d;
                if (i16 != 0) {
                    bundle3.putInt(p0.f1375k, i16);
                }
                int i17 = p0Var.f1381e;
                if (i17 != 0) {
                    bundle3.putInt(p0.l, i17);
                }
                String str3 = p0Var.f1382f;
                if (str3 != null) {
                    bundle3.putString(p0.m, str3);
                }
                String str4 = p0Var.f1383g;
                if (str4 != null) {
                    bundle3.putString(p0.f1376n, str4);
                }
                return bundle3;
            case 6:
                Bundle bundle4 = (Bundle) obj;
                Uri uri = (Uri) bundle4.getParcelable(p0.f1372h);
                uri.getClass();
                String string = bundle4.getString(p0.f1373i);
                String string2 = bundle4.getString(p0.f1374j);
                int i18 = bundle4.getInt(p0.f1375k, 0);
                int i19 = bundle4.getInt(p0.l, 0);
                String string3 = bundle4.getString(p0.m);
                String string4 = bundle4.getString(p0.f1376n);
                androidx.media3.common.o0 o0Var = new androidx.media3.common.o0();
                o0Var.f1361d = uri;
                o0Var.f1358a = x0.n(string);
                o0Var.f1362e = string2;
                o0Var.f1359b = i18;
                o0Var.f1360c = i19;
                o0Var.f1363f = string3;
                o0Var.f1364g = string4;
                return new p0(o0Var);
            case 7:
            default:
                return Integer.valueOf(((d7.b) obj).f4762r);
            case 8:
                Bundle bundle5 = (Bundle) obj;
                Bundle bundle6 = bundle5.getBundle(j2.f1276t);
                q0 q0VarA = bundle6 != null ? q0.a(bundle6) : q0.f1408g;
                long j9 = bundle5.getLong(j2.f1277u, -9223372036854775807L);
                long j10 = bundle5.getLong(j2.f1278v, -9223372036854775807L);
                long j11 = bundle5.getLong(j2.f1279w, -9223372036854775807L);
                boolean z10 = bundle5.getBoolean(j2.f1280x, false);
                boolean z11 = bundle5.getBoolean(j2.f1281y, false);
                Bundle bundle7 = bundle5.getBundle(j2.f1282z);
                androidx.media3.common.k0 k0VarB = bundle7 != null ? androidx.media3.common.k0.b(bundle7) : null;
                boolean z12 = bundle5.getBoolean(j2.A, false);
                long j12 = bundle5.getLong(j2.B, 0L);
                long j13 = bundle5.getLong(j2.C, -9223372036854775807L);
                int i20 = bundle5.getInt(j2.D, 0);
                int i21 = bundle5.getInt(j2.E, 0);
                long j14 = bundle5.getLong(j2.F, 0L);
                j2 j2Var = new j2();
                j2Var.b(j2.f1274r, q0VarA, null, j9, j10, j11, z10, z11, k0VarB, j12, j13, i20, i21, j14);
                j2Var.f1293k = z12;
                return j2Var;
            case 9:
                Bundle bundle8 = (Bundle) obj;
                int i22 = bundle8.getInt(h2.f1227h, 0);
                long j15 = bundle8.getLong(h2.f1228i, -9223372036854775807L);
                long j16 = bundle8.getLong(h2.f1229j, 0L);
                boolean z13 = bundle8.getBoolean(h2.f1230k, false);
                Bundle bundle9 = bundle8.getBundle(h2.l);
                if (bundle9 != null) {
                    ArrayList parcelableArrayList = bundle9.getParcelableArrayList(androidx.media3.common.c.f1130h);
                    if (parcelableArrayList == null) {
                        aVarArr = new androidx.media3.common.a[0];
                    } else {
                        androidx.media3.common.a[] aVarArr2 = new androidx.media3.common.a[parcelableArrayList.size()];
                        for (int i23 = 0; i23 < parcelableArrayList.size(); i23++) {
                            Bundle bundle10 = (Bundle) parcelableArrayList.get(i23);
                            long j17 = bundle10.getLong(androidx.media3.common.a.m);
                            int i24 = bundle10.getInt(androidx.media3.common.a.f1039n);
                            int i25 = bundle10.getInt(androidx.media3.common.a.f1045t);
                            ArrayList parcelableArrayList2 = bundle10.getParcelableArrayList(androidx.media3.common.a.f1040o);
                            ArrayList parcelableArrayList3 = bundle10.getParcelableArrayList(androidx.media3.common.a.f1046u);
                            int[] intArray = bundle10.getIntArray(androidx.media3.common.a.f1041p);
                            long[] longArray = bundle10.getLongArray(androidx.media3.common.a.f1042q);
                            long j18 = bundle10.getLong(androidx.media3.common.a.f1043r);
                            boolean z14 = bundle10.getBoolean(androidx.media3.common.a.f1044s);
                            ArrayList<String> stringArrayList = bundle10.getStringArrayList(androidx.media3.common.a.f1047v);
                            ArrayList parcelableArrayList4 = bundle10.getParcelableArrayList(androidx.media3.common.a.f1049x);
                            boolean z15 = bundle10.getBoolean(androidx.media3.common.a.f1048w);
                            if (intArray == null) {
                                intArray = new int[0];
                            }
                            int[] iArr = intArray;
                            if (parcelableArrayList3 != null) {
                                q0[] q0VarArr2 = new q0[parcelableArrayList3.size()];
                                for (int i26 = 0; i26 < parcelableArrayList3.size(); i26++) {
                                    Bundle bundle11 = (Bundle) parcelableArrayList3.get(i26);
                                    q0VarArr2[i26] = bundle11 == null ? null : q0.a(bundle11);
                                }
                                q0VarArr = q0VarArr2;
                            } else {
                                if (parcelableArrayList2 != null) {
                                    q0[] q0VarArr3 = new q0[parcelableArrayList2.size()];
                                    for (int i27 = 0; i27 < parcelableArrayList2.size(); i27++) {
                                        Uri uri2 = (Uri) parcelableArrayList2.get(i27);
                                        q0VarArr3[i27] = uri2 == null ? null : q0.b(uri2);
                                    }
                                    q0VarArr = q0VarArr3;
                                } else {
                                    i10 = 0;
                                    q0VarArr = new q0[0];
                                }
                                if (longArray == null) {
                                    jArr = new long[i10];
                                } else {
                                    jArr = longArray;
                                }
                                strArr = new String[i10];
                                if (stringArrayList != null) {
                                    strArr = (String[]) stringArrayList.toArray(strArr);
                                }
                                String[] strArr2 = strArr;
                                if (parcelableArrayList4 == null) {
                                    bVarArr = new androidx.media3.common.b[i10];
                                } else {
                                    bVarArr = new androidx.media3.common.b[parcelableArrayList4.size()];
                                    for (i11 = 0; i11 < parcelableArrayList4.size(); i11++) {
                                        bundle = (Bundle) parcelableArrayList4.get(i11);
                                        if (bundle == null) {
                                            bVar = null;
                                        } else {
                                            bVar = new androidx.media3.common.b(bundle.getLong(androidx.media3.common.b.f1091d), bundle.getLong(androidx.media3.common.b.f1092e), bundle.getString(androidx.media3.common.b.f1093f));
                                        }
                                        bVarArr[i11] = bVar;
                                    }
                                }
                                aVarArr2[i23] = new androidx.media3.common.a(j17, i24, i25, iArr, q0VarArr, jArr, j18, z14, strArr2, bVarArr, z15);
                            }
                            i10 = 0;
                            if (longArray == null) {
                                jArr = new long[i10];
                            } else {
                                jArr = longArray;
                            }
                            strArr = new String[i10];
                            if (stringArrayList != null) {
                                strArr = (String[]) stringArrayList.toArray(strArr);
                            }
                            String[] strArr3 = strArr;
                            if (parcelableArrayList4 == null) {
                                bVarArr = new androidx.media3.common.b[i10];
                            } else {
                                bVarArr = new androidx.media3.common.b[parcelableArrayList4.size()];
                                while (i11 < parcelableArrayList4.size()) {
                                    bundle = (Bundle) parcelableArrayList4.get(i11);
                                    if (bundle == null) {
                                        bVar = null;
                                    } else {
                                        bVar = new androidx.media3.common.b(bundle.getLong(androidx.media3.common.b.f1091d), bundle.getLong(androidx.media3.common.b.f1092e), bundle.getString(androidx.media3.common.b.f1093f));
                                    }
                                    bVarArr[i11] = bVar;
                                }
                            }
                            aVarArr2[i23] = new androidx.media3.common.a(j17, i24, i25, iArr, q0VarArr, jArr, j18, z14, strArr3, bVarArr, z15);
                        }
                        aVarArr = aVarArr2;
                    }
                    cVar = new androidx.media3.common.c(aVarArr, bundle9.getLong(androidx.media3.common.c.f1131i, 0L), bundle9.getLong(androidx.media3.common.c.f1132j, -9223372036854775807L), bundle9.getInt(androidx.media3.common.c.f1133k, 0));
                } else {
                    cVar = androidx.media3.common.c.f1128f;
                }
                androidx.media3.common.c cVar2 = cVar;
                h2 h2Var = new h2();
                h2Var.j(null, null, i22, j15, j16, cVar2, z13);
                return h2Var;
            case 10:
                Bundle bundle12 = (Bundle) obj;
                androidx.media3.common.t tVar = androidx.media3.common.t.Q;
                androidx.media3.common.s sVar = new androidx.media3.common.s();
                if (bundle12 != null) {
                    ClassLoader classLoader = e7.d.class.getClassLoader();
                    String str5 = e7.i0.f5136a;
                    bundle12.setClassLoader(classLoader);
                }
                String string5 = bundle12.getString(androidx.media3.common.t.R);
                String str6 = tVar.f1583a;
                if (string5 == null) {
                    string5 = str6;
                }
                sVar.f1491a = string5;
                String string6 = bundle12.getString(androidx.media3.common.t.S);
                String str7 = tVar.f1584b;
                if (string6 == null) {
                    string6 = str7;
                }
                sVar.f1492b = string6;
                ArrayList parcelableArrayList5 = bundle12.getParcelableArrayList(androidx.media3.common.t.f1579w0);
                if (parcelableArrayList5 == null) {
                    d2VarG = d2.E;
                } else {
                    fh.q0 q0VarM = t0.m();
                    for (int i28 = 0; i28 < parcelableArrayList5.size(); i28++) {
                        Bundle bundle13 = (Bundle) parcelableArrayList5.get(i28);
                        bundle13.getClass();
                        String string7 = bundle13.getString(androidx.media3.common.b0.f1097c);
                        String string8 = bundle13.getString(androidx.media3.common.b0.f1098d);
                        string8.getClass();
                        q0VarM.c(new androidx.media3.common.b0(string7, string8));
                    }
                    d2VarG = q0VarM.g();
                }
                sVar.f1493c = t0.o(d2VarG);
                String string9 = bundle12.getString(androidx.media3.common.t.T);
                String str8 = tVar.f1586d;
                if (string9 == null) {
                    string9 = str8;
                }
                sVar.f1494d = string9;
                sVar.f1495e = bundle12.getInt(androidx.media3.common.t.U, tVar.f1587e);
                sVar.f1496f = bundle12.getInt(androidx.media3.common.t.V, tVar.f1588f);
                sVar.f1497g = bundle12.getInt(androidx.media3.common.t.f1580x0, tVar.f1589g);
                sVar.f1498h = bundle12.getInt(androidx.media3.common.t.W, tVar.f1590h);
                sVar.f1499i = bundle12.getInt(androidx.media3.common.t.X, tVar.f1591i);
                String string10 = bundle12.getString(androidx.media3.common.t.Y);
                String str9 = tVar.f1593k;
                if (string10 == null) {
                    string10 = str9;
                }
                sVar.f1500j = string10;
                String string11 = bundle12.getString(androidx.media3.common.t.Z);
                String str10 = tVar.m;
                if (string11 == null) {
                    string11 = str10;
                }
                sVar.l = x0.n(string11);
                String string12 = bundle12.getString(androidx.media3.common.t.f1557a0);
                String str11 = tVar.f1594n;
                if (string12 == null) {
                    string12 = str11;
                }
                sVar.m = x0.n(string12);
                sVar.f1502n = bundle12.getInt(androidx.media3.common.t.f1558b0, tVar.f1595o);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle12.getByteArray(androidx.media3.common.t.f1559c0 + "_" + Integer.toString(i12, 36));
                    if (byteArray == null) {
                        sVar.f1504p = arrayList;
                        sVar.f1505q = (androidx.media3.common.o) bundle12.getParcelable(androidx.media3.common.t.f1560d0);
                        sVar.f1506r = bundle12.getLong(androidx.media3.common.t.f1561e0, tVar.f1599s);
                        sVar.f1508t = bundle12.getInt(androidx.media3.common.t.f1562f0, tVar.f1601u);
                        sVar.f1509u = bundle12.getInt(androidx.media3.common.t.f1563g0, tVar.f1602v);
                        sVar.f1510v = bundle12.getInt(androidx.media3.common.t.f1582z0, tVar.f1603w);
                        sVar.f1511w = bundle12.getInt(androidx.media3.common.t.A0, tVar.f1604x);
                        sVar.f1512x = bundle12.getFloat(androidx.media3.common.t.f1564h0, tVar.f1605y);
                        sVar.f1513y = bundle12.getInt(androidx.media3.common.t.f1565i0, tVar.f1606z);
                        sVar.f1514z = bundle12.getFloat(androidx.media3.common.t.f1566j0, tVar.A);
                        sVar.A = bundle12.getByteArray(androidx.media3.common.t.f1567k0);
                        sVar.B = bundle12.getInt(androidx.media3.common.t.f1568l0, tVar.C);
                        sVar.D = bundle12.getInt(androidx.media3.common.t.f1581y0, tVar.E);
                        Bundle bundle14 = bundle12.getBundle(androidx.media3.common.t.f1569m0);
                        if (bundle14 != null) {
                            sVar.C = new androidx.media3.common.i(bundle14.getInt(androidx.media3.common.i.f1239i, -1), bundle14.getInt(androidx.media3.common.i.f1240j, -1), bundle14.getInt(androidx.media3.common.i.f1241k, -1), bundle14.getInt(androidx.media3.common.i.m, -1), bundle14.getInt(androidx.media3.common.i.f1242n, -1), bundle14.getByteArray(androidx.media3.common.i.l));
                        }
                        sVar.E = bundle12.getInt(androidx.media3.common.t.f1570n0, tVar.F);
                        sVar.F = bundle12.getInt(androidx.media3.common.t.f1571o0, tVar.G);
                        sVar.G = bundle12.getInt(androidx.media3.common.t.f1572p0, tVar.H);
                        sVar.H = bundle12.getInt(androidx.media3.common.t.f1573q0, tVar.I);
                        sVar.I = bundle12.getInt(androidx.media3.common.t.f1574r0, tVar.J);
                        sVar.J = bundle12.getInt(androidx.media3.common.t.f1575s0, tVar.K);
                        sVar.L = bundle12.getInt(androidx.media3.common.t.f1577u0, tVar.M);
                        sVar.M = bundle12.getInt(androidx.media3.common.t.f1578v0, tVar.N);
                        sVar.N = bundle12.getInt(androidx.media3.common.t.f1576t0, tVar.O);
                        return new androidx.media3.common.t(sVar);
                    }
                    arrayList.add(byteArray);
                    i12++;
                }
                break;
            case 11:
                r2 r2Var = (r2) obj;
                r2Var.getClass();
                Bundle bundle15 = new Bundle();
                bundle15.putBundle(r2.f1482f, r2Var.f1487b.c());
                bundle15.putIntArray(r2.f1483g, r2Var.f1489d);
                bundle15.putBooleanArray(r2.f1484h, r2Var.f1490e);
                bundle15.putBoolean(r2.f1485i, r2Var.f1488c);
                return bundle15;
            case 12:
                Bundle bundle16 = (Bundle) obj;
                Bundle bundle17 = bundle16.getBundle(r2.f1482f);
                bundle17.getClass();
                l2 l2VarA = l2.a(bundle17);
                int[] intArray2 = bundle16.getIntArray(r2.f1483g);
                int i29 = l2VarA.f1338a;
                int[] iArr2 = new int[i29];
                if (intArray2 == null) {
                    intArray2 = iArr2;
                }
                boolean[] booleanArray = bundle16.getBooleanArray(r2.f1484h);
                boolean[] zArr = new boolean[i29];
                if (booleanArray == null) {
                    booleanArray = zArr;
                }
                return new r2(l2VarA, bundle16.getBoolean(r2.f1485i, false), intArray2, booleanArray);
        }
    }

    public Constructor b() {
        switch (this.A) {
            case 0:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(q.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(q.class).getConstructor(null);
        }
    }

    @Override
    public q[] e() {
        return new q[]{new b8.a()};
    }

    @Override
    public void invoke(Object obj) {
        ((d1) obj).I();
    }

    @Override
    public Object j() {
        switch (this.A) {
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                return new LinkedHashMap();
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                return new TreeMap();
            case 23:
                return new ConcurrentHashMap();
            case 24:
                return new ConcurrentSkipListMap();
            case 25:
                return new ArrayList();
            case RuntimeVersion.MINOR:
                return new LinkedHashSet();
            case 27:
                return new TreeSet();
            case 28:
                return new ArrayDeque();
            default:
                return new dk.n(true);
        }
    }

    @Override
    public Object m(y1 y1Var) {
        return AbtRegistrar.lambda$getComponents$0(y1Var);
    }

    @Override
    public void onPurchasesUpdated(qd.h hVar, List list) {
        PurchasesOrchestrator.Companion.a(hVar, list);
    }

    @Override
    public void transferState(f1 f1Var, f1 f1Var2) {
        CastPlayer.TransferCallback.lambda$static$0(f1Var, f1Var2);
    }
}
