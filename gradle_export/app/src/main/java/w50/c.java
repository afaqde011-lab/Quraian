package w50;

import a1.y1;
import a40.c0;
import a40.e1;
import a40.f1;
import a40.u1;
import a40.z;
import ab.a0;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.LongSparseArray;
import android.view.Display;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import androidx.datastore.preferences.protobuf.g;
import as.n0;
import b6.p;
import bt.x0;
import c3.o0;
import c3.o1;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.z3;
import com.google.crypto.tink.shaded.protobuf.i;
import d40.p1;
import e30.p0;
import e30.w;
import g1.z6;
import g10.o;
import h0.c1;
import h0.t1;
import h0.u;
import h0.v;
import h0.v1;
import h0.x1;
import h0.z1;
import h00.d0;
import h00.q;
import h10.j;
import h10.l;
import h9.f;
import i2.b0;
import i2.t;
import i2.t0;
import i20.j0;
import i20.u0;
import i20.w0;
import i20.z0;
import j10.h;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import jp.e0;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.m1;
import l1.p2;
import l1.r1;
import l6.y;
import m3.r0;
import oi.k;
import p30.n;
import r30.r;
import s20.x;
import w50.c;
import x.b1;
import x40.s;
import z.s0;
import z.v0;

public abstract class c {
    public static Bitmap a;

    public static boolean A(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static String B(g gVar) {
        StringBuilder sb = new StringBuilder(gVar.size());
        for (int i = 0; i < gVar.size(); i++) {
            byte bA = gVar.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String C(i iVar) {
        StringBuilder sb = new StringBuilder(iVar.size());
        for (int i = 0; i < iVar.size(); i++) {
            byte bA = iVar.a(i);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static int D(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float f3 = ((i2 >> 24) & 255) / 255.0f;
        float fB = b(((i >> 16) & 255) / 255.0f);
        float fB2 = b(((i >> 8) & 255) / 255.0f);
        float fB3 = b((i & 255) / 255.0f);
        float fB4 = b(((i2 >> 16) & 255) / 255.0f);
        float fB5 = b(((i2 >> 8) & 255) / 255.0f);
        float fB6 = b((i2 & 255) / 255.0f);
        float fB7 = w.c.b(f3, f2, f, f2);
        float fB8 = w.c.b(fB4, fB, f, fB);
        float fB9 = w.c.b(fB5, fB2, f, fB2);
        float fB10 = w.c.b(fB6, fB3, f, fB3);
        float fG = g(fB8) * 255.0f;
        float fG2 = g(fB9) * 255.0f;
        return Math.round(g(fB10) * 255.0f) | (Math.round(fG) << 16) | (Math.round(fB7 * 255.0f) << 24) | (Math.round(fG2) << 8);
    }

    public static final u0 E(w0 w0Var, f typeTable) {
        m.e(typeTable, "typeTable");
        int i = w0Var.C;
        if ((i & 16) == 16) {
            u0 u0Var = w0Var.I;
            m.d(u0Var, "getExpandedType(...)");
            return u0Var;
        }
        if ((i & 32) == 32) {
            return typeTable.a(w0Var.J);
        }
        throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
    }

    public static final n20.e F(w wVar) {
        String str;
        k10.b bVarF = wVar.getAnnotations().f(o.r);
        if (bVarF != null) {
            Object objE1 = q.e1(bVarF.b().values());
            x xVar = objE1 instanceof x ? (x) objE1 : null;
            if (xVar != null && (str = (String) xVar.a) != null) {
                if (!n20.e.f(str)) {
                    str = null;
                }
                if (str != null) {
                    return n20.e.e(str);
                }
            }
        }
        return null;
    }

    public static final u0 G(u0 u0Var, f typeTable) {
        m.e(u0Var, "<this>");
        m.e(typeTable, "typeTable");
        int i = u0Var.C;
        if ((i & 4) == 4) {
            return u0Var.G;
        }
        if ((i & 8) == 8) {
            return typeTable.a(u0Var.H);
        }
        return null;
    }

    public static s H(String str) {
        m.e(str, "<this>");
        Matcher matcher = s.d.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(k.g('\"', "No subtype found for: \"", str).toString());
        }
        String strGroup = matcher.group(1);
        m.d(strGroup, "typeSubtype.group(1)");
        Locale US = Locale.US;
        m.d(US, "US");
        String lowerCase = strGroup.toLowerCase(US);
        m.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        String strGroup2 = matcher.group(2);
        m.d(strGroup2, "typeSubtype.group(2)");
        m.d(strGroup2.toLowerCase(US), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = s.e.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(iEnd);
                m.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                sb.append("\" for: \"");
                throw new IllegalArgumentException(g4.c.k(sb, str, '\"').toString());
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (r.x0(strGroup4, "'", false) && r.p0(strGroup4, "'", false) && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                    m.d(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(strGroup3);
                arrayList.add(strGroup4);
                iEnd = matcher2.end();
            }
        }
        return new s(str, lowerCase, (String[]) arrayList.toArray(new String[0]));
    }

    public static final int I(ma.c stmt, String str) throws IOException {
        m.e(stmt, "stmt");
        int iP = p(stmt, str);
        if (iP >= 0) {
            return iP;
        }
        int columnCount = stmt.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(stmt.getColumnName(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + q.R0(arrayList, null, null, null, null, 63) + ']');
    }

    public static final List J(w wVar) {
        m.e(wVar, "<this>");
        S(wVar);
        int iS = s(wVar);
        if (iS == 0) {
            return h00.x.A;
        }
        List listSubList = wVar.e0().subList(0, iS);
        ArrayList arrayList = new ArrayList(h00.r.q0(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(((p0) it.next()).b());
        }
        return arrayList;
    }

    public static Set K() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final h10.k L(n20.d dVar) {
        if (!dVar.d() || dVar.c()) {
            return null;
        }
        h10.m mVar = h10.m.c;
        n20.c cVarB = dVar.i().b();
        String strB = dVar.g().b();
        m.d(strB, "asString(...)");
        mVar.getClass();
        l lVarA = mVar.a(strB, cVarB);
        if (lVarA != null) {
            return lVarA.a;
        }
        return null;
    }

    public static final e60.a M(ComponentCallbacks componentCallbacks) {
        m.e(componentCallbacks, "<this>");
        if (componentCallbacks instanceof e0) {
            return ((e0) componentCallbacks).g;
        }
        if (componentCallbacks instanceof t50.a) {
            return t50.a.c().c.d;
        }
        s50.a aVar = u50.a.b;
        if (aVar != null) {
            return aVar.c.d;
        }
        throw new IllegalStateException("KoinApplication has not been started");
    }

    public static final p30.m N(a10.d readonlyKClass, n20.c mutableFqName) {
        m.e(mutableFqName, "mutableFqName");
        m.e(readonlyKClass, "readonlyKClass");
        return new p30.m(readonlyKClass, mutableFqName.a.a, new n(readonlyKClass, mutableFqName), new n(mutableFqName, readonlyKClass));
    }

    public static final Bitmap O(Context context) {
        m.e(context, "<this>");
        Bitmap bitmap = a;
        if (bitmap != null && !bitmap.isRecycled()) {
            return bitmap;
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), 2131231069);
        a = bitmapDecodeResource;
        m.d(bitmapDecodeResource, "also(...)");
        return bitmapDecodeResource;
    }

    public static final w P(w wVar) {
        m.e(wVar, "<this>");
        S(wVar);
        if (wVar.getAnnotations().f(o.p) == null) {
            return null;
        }
        return ((p0) wVar.e0().get(s(wVar))).b();
    }

    public static final List Q(w wVar) {
        m.e(wVar, "<this>");
        S(wVar);
        List listE0 = wVar.e0();
        return listE0.subList(((!S(wVar) || wVar.getAnnotations().f(o.p) == null) ? 0 : 1) + s(wVar), listE0.size() - 1);
    }

    public static final u0 R(i20.k kVar, f typeTable) {
        m.e(kVar, "<this>");
        m.e(typeTable, "typeTable");
        int i = kVar.C;
        if ((i & 16) == 16) {
            return kVar.X;
        }
        if ((i & 32) == 32) {
            return typeTable.a(kVar.Y);
        }
        return null;
    }

    public static final boolean S(w wVar) {
        m.e(wVar, "<this>");
        h hVarG = wVar.m0().g();
        if (hVarG == null) {
            return false;
        }
        h10.k kVarL = ((hVarG instanceof j10.e) && g10.i.J(hVarG)) ? L(u20.d.h(hVarG)) : null;
        return m.a(kVarL, h10.g.c) || m.a(kVarL, j.c);
    }

    public static final boolean T(b6.i iVar) {
        String str = null;
        k6.b bVar = (k6.b) iVar.a.a((Object) null, b6.s.A);
        k6.a aVar = bVar != null ? bVar.a : null;
        if (aVar != null) {
            Object obj = aVar.a.get(k6.c.a);
            if (obj == null) {
                obj = null;
            }
            List list = (List) obj;
            if (list != null) {
                str = (String) list.get(0);
            }
        }
        return str == null || str.length() == 0;
    }

    public static final boolean U(w wVar) {
        m.e(wVar, "<this>");
        h hVarG = wVar.m0().g();
        h10.k kVarL = null;
        if (hVarG != null && (hVarG instanceof j10.e) && g10.i.J(hVarG)) {
            kVarL = L(u20.d.h(hVarG));
        }
        return m.a(kVarL, j.c);
    }

    public static final n30.f V(ArrayList arrayList) {
        n30.f fVar = new n30.f();
        for (Object obj : arrayList) {
            x20.n nVar = (x20.n) obj;
            if (nVar != null && nVar != x20.m.b) {
                fVar.add(obj);
            }
        }
        return fVar;
    }

    public static MappedByteBuffer W(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    public static final u0 X(u0 u0Var, f typeTable) {
        m.e(u0Var, "<this>");
        m.e(typeTable, "typeTable");
        int i = u0Var.C;
        if ((i & 256) == 256) {
            return u0Var.M;
        }
        if ((i & 512) == 512) {
            return typeTable.a(u0Var.N);
        }
        return null;
    }

    public static final b6.m Y(b6.m mVar) {
        j6.n nVarI0 = i0(dn.m.b);
        return mVar.d(new j6.o(nVarI0, nVarI0, nVarI0, nVarI0));
    }

    public static final boolean Z(String method) {
        m.e(method, "method");
        return (method.equals("GET") || method.equals("HEAD")) ? false : true;
    }

    public static final void a(boolean z, float f, b2.g gVar, b2.r rVar, b1 b1Var, b2.d dVar, v1.c cVar, l1.j jVar, int i) {
        v1.c cVar2;
        b2.r rVar2;
        b2.d dVar2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(-1105973570);
        int i2 = i | (g0Var.h(z) ? 4 : 2) | (g0Var.d(f) ? 32 : 16) | 3072 | (g0Var.i(b1Var) ? 16384 : 8192) | 196608;
        if (g0Var.S(i2 & 1, (599187 & i2) != 599186)) {
            dVar2 = b2.b.H;
            int i3 = (i2 >> 3) & 14;
            int i4 = (i2 >> 9) & 112;
            p2 p2VarA = x.d.a(f, b1Var, (String) null, g0Var, i3 | i4, 12);
            p2 p2VarA2 = x.d.a(z ? f : 0, b1Var, (String) null, g0Var, i4, 12);
            float f2 = a0.v(new y3.f(((y3.f) p2VarA.getValue()).A - ((y3.f) p2VarA2.getValue()).A), new y3.f(0)).A;
            boolean z2 = gVar.a(0, 1, (y3.m) g0Var.k(o1.n)) == 0;
            rVar2 = b2.o.A;
            b2.r rVarD = f2.h.d(z1.c(z1.q(rVar2, f2), 1.0f));
            z2.w0 w0VarD = h0.o.d(b2.b.A, false);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarD, g0Var);
            b3.i.c.getClass();
            b3.g gVar2 = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(w0VarD, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC, g0Var, fVar4);
            boolean zG = g0Var.g(p2VarA2) | g0Var.h(z2);
            Object objN = g0Var.N();
            if (zG || objN == l1.i.a) {
                objN = new e.c(z2, p2VarA2);
                g0Var.n0(objN);
            }
            b2.r rVarC2 = z1.c(z1.q(z1.w(b0.p(rVar2, (u00.k) objN), gVar, true), ((y3.f) p2VarA.getValue()).A), 1.0f);
            z2.w0 w0VarD2 = h0.o.d(dVar2, false);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC3 = b2.a.c(rVarC2, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar2);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD2, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC3, g0Var, fVar4);
            cVar2 = cVar;
            cVar2.invoke(h0.s.a, g0Var, 54);
            g0Var.r(true);
            g0Var.r(true);
        } else {
            cVar2 = cVar;
            g0Var.V();
            rVar2 = rVar;
            dVar2 = dVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new n0(z, f, gVar, rVar2, b1Var, dVar2, cVar2, i);
        }
    }

    public static final byte[] a0(InputStream inputStream) throws IOException {
        m.e(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        w(inputStream, byteArrayOutputStream, 8192);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        m.d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static float b(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static final u0 b0(i20.b0 b0Var, f typeTable) {
        m.e(b0Var, "<this>");
        m.e(typeTable, "typeTable");
        int i = b0Var.C;
        if ((i & 32) == 32) {
            return b0Var.J;
        }
        if ((i & 64) == 64) {
            return typeTable.a(b0Var.K);
        }
        return null;
    }

    public static final void c(gm.a aVar, l1.j jVar, int i) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(582659178);
        int i2 = (g0Var.e(aVar.ordinal()) ? 4 : 2) | i;
        if (g0Var.S(i2 & 1, (i2 & 3) != 2)) {
            b2.r rVarD = h0.c.D(z1.d(b2.o.A, 1.0f), 16, aVar == gm.a.B ? 24 : 18);
            v vVarA = u.a(h0.i.c, b2.b.N, g0Var, 48);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarD, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC, g0Var, b3.h.d);
            z6.b(z3.U(g0Var, 2131886915), (b2.r) null, t.b(0.7f, dl.a.k), kh.o.z(19), q3.u.C, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(19), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 1597440, 48, 260010);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new y1(aVar, i, 22);
        }
    }

    public static final u0 c0(j0 j0Var, f typeTable) {
        m.e(j0Var, "<this>");
        m.e(typeTable, "typeTable");
        int i = j0Var.C;
        if ((i & 32) == 32) {
            return j0Var.J;
        }
        if ((i & 64) == 64) {
            return typeTable.a(j0Var.K);
        }
        return null;
    }

    public static final void d(b6.t tVar, String str, b6.m mVar, int i, b6.e eVar, l1.j jVar, int i2, int i3) {
        int i4;
        b6.t tVar2;
        String str2;
        b6.m mVar2;
        int i5;
        b6.e eVar2;
        g0 g0Var = (g0) jVar;
        g0Var.e0(491792371);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? g0Var.g(tVar) : g0Var.i(tVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= g0Var.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= g0Var.g(mVar) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= g0Var.e(i) ? 2048 : 1024;
        }
        int i7 = i3 & 16;
        if (i7 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= (32768 & i2) == 0 ? g0Var.g(eVar) : g0Var.i(eVar) ? 16384 : 8192;
        }
        if ((i4 & 9363) == 9362 && g0Var.C()) {
            g0Var.V();
            eVar2 = eVar;
            i5 = i;
            mVar2 = mVar;
            str2 = str;
            tVar2 = tVar;
        } else {
            if (i6 != 0) {
                i = 1;
            }
            int i8 = i;
            if (i7 != 0) {
                eVar = null;
            }
            b6.e eVar3 = eVar;
            e(tVar, str, mVar, i8, eVar3, g0Var, (i4 & 14) | 196608 | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i4));
            tVar2 = tVar;
            str2 = str;
            mVar2 = mVar;
            i5 = i8;
            eVar2 = eVar3;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new b6.q(tVar2, str2, mVar2, i5, eVar2, i2, i3);
        }
    }

    public static final rm.a d0(l1.j jVar) {
        g0 g0Var = (g0) jVar;
        Context context = (Context) g0Var.k(o0.b);
        Object objN = g0Var.N();
        if (objN == l1.i.a) {
            objN = new rm.a(context);
            g0Var.n0(objN);
        }
        return (rm.a) objN;
    }

    public static final void e(b6.t tVar, String str, b6.m mVar, int i, b6.e eVar, l1.j jVar, int i2) {
        int i3;
        b6.m mVarD;
        g0 g0Var = (g0) jVar;
        g0Var.e0(2075067909);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? g0Var.g(tVar) : g0Var.i(tVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g0Var.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g0Var.g(mVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g0Var.e(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? g0Var.g(eVar) : g0Var.i(eVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= g0Var.g((Object) null) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && g0Var.C()) {
            g0Var.V();
        } else {
            l1.c cVar = l1.i.a;
            if (str != null) {
                g0Var.d0(884096034);
                g0Var.d0(5004770);
                boolean z = (i3 & 112) == 32;
                Object objN = g0Var.N();
                if (z || objN == cVar) {
                    objN = new b6.o(str, 0);
                    g0Var.n0(objN);
                }
                g0Var.r(false);
                k6.a aVar = new k6.a();
                ((u00.k) objN).invoke(aVar);
                mVarD = mVar.d(new k6.b(aVar));
                g0Var.r(false);
            } else {
                g0Var.d0(884190429);
                g0Var.r(false);
                mVarD = mVar;
            }
            g0Var.d0(1849434622);
            Object objN2 = g0Var.N();
            if (objN2 == cVar) {
                objN2 = b6.r.A;
                g0Var.n0(objN2);
            }
            g0Var.r(false);
            u00.a aVar2 = (u00.a) ((a10.g) objN2);
            g0Var.d0(-1115894518);
            g0Var.d0(1886828752);
            if (!(g0Var.a instanceof b6.b)) {
                l1.q.w();
                throw null;
            }
            g0Var.a0();
            if (g0Var.S) {
                g0Var.l(new b6.n(0, aVar2));
            } else {
                g0Var.q0();
            }
            l1.q.I(tVar, g0Var, new ax.c(12));
            l1.q.I(mVarD, g0Var, new ax.c(13));
            l1.q.I(new j6.h(i), g0Var, new ax.c(14));
            l1.q.I(eVar, g0Var, new ax.c(15));
            l1.q.I((Object) null, g0Var, new ax.c(16));
            g0Var.r(true);
            g0Var.r(false);
            g0Var.r(false);
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new p(tVar, str, mVar, i, eVar, i2);
        }
    }

    public static final u0 e0(i20.b0 b0Var, f typeTable) {
        m.e(b0Var, "<this>");
        m.e(typeTable, "typeTable");
        int i = b0Var.C;
        if ((i & 8) == 8) {
            u0 u0Var = b0Var.G;
            m.d(u0Var, "getReturnType(...)");
            return u0Var;
        }
        if ((i & 16) == 16) {
            return typeTable.a(b0Var.H);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function");
    }

    public static final void f(final u00.a onClick, final jk.a backdrop, b2.r rVar, boolean z, boolean z2, float f, y3.f fVar, long j, final long j2, float f2, t0 t0Var, float f3, u00.o oVar, l1.j jVar, final int i, final int i2, final int i3) {
        int i4;
        b2.r rVar2;
        int i5;
        int i6;
        float f4;
        int i7;
        int i8;
        y3.f fVar2;
        int i9;
        int i11;
        long j3;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z3;
        final boolean z4;
        final boolean z5;
        final float f5;
        final float f6;
        final b2.r rVar3;
        final y3.f fVar3;
        final long j4;
        final t0 t0Var2;
        final float f7;
        r1 r1VarT;
        int i18;
        b2.r rVar4;
        v0 v0Var;
        long j5;
        float f8;
        t0 t0VarA;
        b2.r rVar5;
        y3.f fVar4;
        float f9;
        boolean z6;
        boolean z7;
        boolean z8;
        Object objN;
        boolean z9;
        l1.c cVar;
        Object obj;
        z zVar;
        boolean zG;
        Object obj2;
        tm.i iVar;
        y3.f fVar5;
        boolean z11;
        Object obj3;
        boolean z12;
        Object obj4;
        u00.k kVar;
        u00.k kVar2;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objN2;
        long j6;
        b2.r rVarV;
        int i19;
        b2.r rVarG;
        b3.g gVar;
        boolean zI;
        boolean z16;
        Object obj5;
        int i21;
        final u00.o content = oVar;
        m.e(onClick, "onClick");
        m.e(backdrop, "backdrop");
        m.e(content, "content");
        g0 g0Var = (g0) jVar;
        g0Var.e0(1570343048);
        if ((i & 6) == 0) {
            i4 = (g0Var.i(onClick) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= g0Var.i(backdrop) ? 32 : 16;
        }
        int i22 = i3 & 4;
        if (i22 == 0) {
            if ((i & 384) == 0) {
                rVar2 = rVar;
                i4 |= g0Var.g(rVar2) ? 256 : 128;
            }
            i5 = i4 | 27648;
            i6 = i3 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    f4 = f;
                    if (g0Var.d(f4)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i5 |= i7;
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i5 |= 1572864;
                    fVar2 = fVar;
                } else {
                    fVar2 = fVar;
                    if ((i & 1572864) == 0) {
                        if (g0Var.g(fVar2)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i5 |= i9;
                    }
                }
                i11 = i5 | 12582912;
                if ((i & 100663296) == 0) {
                    j3 = j2;
                    if (g0Var.f(j3)) {
                        i21 = 67108864;
                    } else {
                        i21 = 33554432;
                    }
                    i11 |= i21;
                } else {
                    j3 = j2;
                }
                i12 = i3 & 512;
                if (i12 != 0) {
                    i11 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (g0Var.d(f2)) {
                        i13 = 536870912;
                    } else {
                        i13 = 268435456;
                    }
                    i11 |= i13;
                }
                i14 = i2 | (((i3 & 1024) == 0 || !g0Var.g(t0Var)) ? 2 : 4);
                i15 = i3 & 2048;
                if (i15 != 0) {
                    i14 |= 48;
                } else if ((i2 & 48) != 0) {
                    if (g0Var.d(f3)) {
                        i16 = 32;
                    } else {
                        i16 = 16;
                    }
                    i14 |= i16;
                }
                i17 = i14;
                if ((i11 & 306783379) == 306783378 || (i17 & 147) != 146) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (g0Var.S(i11 & 1, z3)) {
                    g0Var.X();
                    i18 = i & 1;
                    rVar4 = b2.o.A;
                    v0Var = null;
                    if (i18 != 0 || g0Var.A()) {
                        if (i22 != 0) {
                            rVar2 = rVar4;
                        }
                        if (i6 != 0) {
                            f4 = 48.0f;
                        }
                        if (i8 != 0) {
                            fVar2 = null;
                        }
                        j5 = t.g;
                        if (i12 != 0) {
                            f8 = 2.0f;
                        } else {
                            f8 = f2;
                        }
                        if ((i3 & 1024) != 0) {
                            t0VarA = p0.f.a(32);
                            i17 &= -15;
                        } else {
                            t0VarA = t0Var;
                        }
                        if (i15 != 0) {
                            rVar5 = rVar2;
                            fVar4 = fVar2;
                            f9 = 16;
                            z6 = true;
                        } else {
                            rVar5 = rVar2;
                            fVar4 = fVar2;
                            f9 = f3;
                            z6 = true;
                        }
                        z7 = true;
                    } else {
                        g0Var.V();
                        if ((i3 & 1024) != 0) {
                            i17 &= -15;
                        }
                        y3.f fVar6 = fVar2;
                        f4 = f4;
                        fVar4 = fVar6;
                        z7 = z2;
                        j5 = j;
                        f8 = f2;
                        f9 = f3;
                        i17 = i17;
                        rVar5 = rVar2;
                        z6 = z;
                        t0VarA = t0Var;
                    }
                    g0Var.s();
                    z8 = z6;
                    objN = g0Var.N();
                    z9 = z7;
                    cVar = l1.i.a;
                    obj = objN;
                    if (objN == cVar) {
                        z zVarO = l1.q.o(g0Var);
                        g0Var.n0(zVarO);
                        obj = zVarO;
                    }
                    zVar = (z) obj;
                    zG = g0Var.g(zVar);
                    b2.r rVar6 = rVar5;
                    Object objN3 = g0Var.N();
                    obj2 = objN3;
                    if (zG || objN3 == cVar) {
                        tm.i iVar2 = new tm.i(zVar);
                        g0Var.n0(iVar2);
                        obj2 = iVar2;
                    }
                    iVar = (tm.i) obj2;
                    fVar5 = fVar4;
                    z11 = (((i17 & 14) ^ 6) <= 4 && g0Var.g(t0VarA)) || (i17 & 6) == 4;
                    Object objN4 = g0Var.N();
                    obj3 = objN4;
                    if (z11 || objN4 == cVar) {
                        sm.l lVar = new sm.l(t0VarA, 0);
                        g0Var.n0(lVar);
                        obj3 = lVar;
                    }
                    u00.a aVar = (u00.a) obj3;
                    if ((1879048192 & i11) == 536870912) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    Object objN5 = g0Var.N();
                    obj4 = objN5;
                    if (z12 || objN5 == cVar) {
                        cs.i iVar3 = new cs.i(f8, 4);
                        g0Var.n0(iVar3);
                        obj4 = iVar3;
                    }
                    kVar = (u00.k) obj4;
                    if (z8) {
                        g0Var.c0(1307007109);
                        zI = g0Var.i(iVar);
                        Object objN6 = g0Var.N();
                        if (!zI || objN6 == cVar) {
                            z16 = false;
                            sm.p pVar = new sm.p(iVar, false ? 1 : 0);
                            g0Var.n0(pVar);
                            obj5 = pVar;
                        } else {
                            z16 = false;
                            obj5 = objN6;
                        }
                        kVar2 = (u00.k) obj5;
                        g0Var.r(z16);
                    } else {
                        kVar = kVar;
                        g0Var.c0(1308295438);
                        g0Var.r(false);
                        kVar2 = null;
                    }
                    u00.k kVar3 = kVar2;
                    if ((i11 & 29360128) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((234881024 & i11) == 67108864) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z13 | z14;
                    objN2 = g0Var.N();
                    if (!z15 || objN2 == cVar) {
                        final int i23 = 0;
                        final long j7 = j3;
                        final long j8 = j5;
                        objN2 = new u00.k() {
                            @Override
                            public final Object invoke(Object obj6) {
                                switch (i23) {
                                    case 0:
                                        k2.d drawBackdrop = (k2.d) obj6;
                                        kotlin.jvm.internal.m.e(drawBackdrop, "$this$drawBackdrop");
                                        long j9 = j8;
                                        if (j9 != 16) {
                                            k2.d.R(drawBackdrop, j9, 0L, 0L, 0.0f, (k2.h) null, 25, 62);
                                            k2.d.R(drawBackdrop, i2.t.b(0.75f, j9), 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                                        }
                                        long j11 = j7;
                                        if (j11 != 16) {
                                            k2.d.R(drawBackdrop, j11, 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                                        }
                                        break;
                                    default:
                                        k2.d drawBackdrop2 = (k2.d) obj6;
                                        kotlin.jvm.internal.m.e(drawBackdrop2, "$this$drawBackdrop");
                                        long j12 = j8;
                                        if (j12 != 16) {
                                            k2.d.R(drawBackdrop2, j12, 0L, 0L, 0.0f, (k2.h) null, 25, 62);
                                            k2.d.R(drawBackdrop2, i2.t.b(0.75f, j12), 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                                        }
                                        long j13 = j7;
                                        if (j13 != 16) {
                                            k2.d.R(drawBackdrop2, j13, 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                                        }
                                        break;
                                }
                                return g00.b0.a;
                            }
                        };
                        j6 = j8;
                        g0Var.n0(objN2);
                    } else {
                        j6 = j5;
                    }
                    u00.k kVar4 = (u00.k) objN2;
                    float f11 = f8;
                    t0 t0Var3 = t0VarA;
                    b2.r rVarB = jk.d.b(rVar6, backdrop, aVar, kVar, (u00.a) null, (u00.a) null, (u00.a) null, kVar3, kVar4, 3000);
                    if (z8) {
                        g0Var.c0(1308827893);
                    } else {
                        g0Var.c0(1566241743);
                        v0Var = (v0) g0Var.k(s0.a);
                    }
                    g0Var.r(false);
                    b2.r rVarB2 = androidx.compose.foundation.b.b(rVarB, (f0.i) null, v0Var, false, new j3.k(0), onClick, 12);
                    if (z8) {
                        rVarV = iVar.i.V(iVar.j);
                    } else {
                        rVarV = rVar4;
                    }
                    b2.r rVarV2 = rVarB2.V(rVarV);
                    if (fVar5 != null) {
                        rVarG = z1.m(rVar4, fVar5.A);
                    } else {
                        if (z9) {
                            rVarG = z1.e(rVar4, f4);
                        } else {
                            i19 = 2;
                            rVarG = z1.g(rVar4, 48.0f, 0.0f, 2);
                        }
                        float f12 = f9;
                        b2.r rVarE = h0.c.E(rVarV2.V(rVarG), f12, 0.0f, i19);
                        h0.b bVar = h0.i.a;
                        v1 v1VarA = t1.a(h0.i.h(8.0f, b2.b.N), b2.b.K, g0Var, 54);
                        int iHashCode = Long.hashCode(g0Var.T);
                        m1 m1VarM = g0Var.m();
                        b2.r rVarC = b2.a.c(rVarE, g0Var);
                        b3.i.c.getClass();
                        gVar = b3.h.b;
                        g0Var.g0();
                        if (g0Var.S) {
                            g0Var.l(gVar);
                        } else {
                            g0Var.q0();
                        }
                        l1.q.I(v1VarA, g0Var, b3.h.f);
                        l1.q.I(m1VarM, g0Var, b3.h.e);
                        l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                        l1.q.E(g0Var, b3.h.h);
                        l1.q.I(rVarC, g0Var, b3.h.d);
                        content = oVar;
                        content.invoke(x1.a, g0Var, 54);
                        g0Var.r(true);
                        float f13 = f4;
                        f7 = f12;
                        f6 = f13;
                        z4 = z8;
                        z5 = z9;
                        rVar3 = rVar6;
                        fVar3 = fVar5;
                        t0Var2 = t0Var3;
                        f5 = f11;
                        j4 = j6;
                    }
                    i19 = 2;
                    float f14 = f9;
                    b2.r rVarE2 = h0.c.E(rVarV2.V(rVarG), f14, 0.0f, i19);
                    h0.b bVar2 = h0.i.a;
                    v1 v1VarA2 = t1.a(h0.i.h(8.0f, b2.b.N), b2.b.K, g0Var, 54);
                    int iHashCode2 = Long.hashCode(g0Var.T);
                    m1 m1VarM2 = g0Var.m();
                    b2.r rVarC2 = b2.a.c(rVarE2, g0Var);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(v1VarA2, g0Var, b3.h.f);
                    l1.q.I(m1VarM2, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode2), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC2, g0Var, b3.h.d);
                    content = oVar;
                    content.invoke(x1.a, g0Var, 54);
                    g0Var.r(true);
                    float f15 = f4;
                    f7 = f14;
                    f6 = f15;
                    z4 = z8;
                    z5 = z9;
                    rVar3 = rVar6;
                    fVar3 = fVar5;
                    t0Var2 = t0Var3;
                    f5 = f11;
                    j4 = j6;
                } else {
                    g0Var.V();
                    z4 = z;
                    z5 = z2;
                    f5 = f2;
                    f6 = f4;
                    rVar3 = rVar2;
                    fVar3 = fVar2;
                    j4 = j;
                    t0Var2 = t0Var;
                    f7 = f3;
                }
                r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.d = new u00.n() {
                        @Override
                        public final Object invoke(Object obj6, Object obj7) {
                            ((Integer) obj7).getClass();
                            int iK = l1.q.K(i | 1);
                            int iK2 = l1.q.K(i2);
                            w50.c.f(onClick, backdrop, rVar3, z4, z5, f6, fVar3, j4, j2, f5, t0Var2, f7, content, (l1.j) obj6, iK, iK2, i3);
                            return g00.b0.a;
                        }
                    };
                }
            }
            i5 = 224256 | i4;
            f4 = f;
            i8 = i3 & 64;
            if (i8 != 0) {
                i5 |= 1572864;
                fVar2 = fVar;
            } else {
                fVar2 = fVar;
                if ((i & 1572864) == 0) {
                    if (g0Var.g(fVar2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i5 |= i9;
                }
            }
            i11 = i5 | 12582912;
            if ((i & 100663296) == 0) {
                j3 = j2;
                if (g0Var.f(j3)) {
                    i21 = 67108864;
                } else {
                    i21 = 33554432;
                }
                i11 |= i21;
            } else {
                j3 = j2;
            }
            i12 = i3 & 512;
            if (i12 != 0) {
                i11 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (g0Var.d(f2)) {
                    i13 = 536870912;
                } else {
                    i13 = 268435456;
                }
                i11 |= i13;
            }
            i14 = i2 | (((i3 & 1024) == 0 || !g0Var.g(t0Var)) ? 2 : 4);
            i15 = i3 & 2048;
            if (i15 != 0) {
                i14 |= 48;
            } else if ((i2 & 48) != 0) {
                if (g0Var.d(f3)) {
                    i16 = 32;
                } else {
                    i16 = 16;
                }
                i14 |= i16;
            }
            i17 = i14;
            if ((i11 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (g0Var.S(i11 & 1, z3)) {
                g0Var.X();
                i18 = i & 1;
                rVar4 = b2.o.A;
                v0Var = null;
                if (i18 != 0) {
                    if (i22 != 0) {
                        rVar2 = rVar4;
                    }
                    if (i6 != 0) {
                        f4 = 48.0f;
                    }
                    if (i8 != 0) {
                        fVar2 = null;
                    }
                    j5 = t.g;
                    if (i12 != 0) {
                        f8 = 2.0f;
                    } else {
                        f8 = f2;
                    }
                    if ((i3 & 1024) != 0) {
                        t0VarA = p0.f.a(32);
                        i17 &= -15;
                    } else {
                        t0VarA = t0Var;
                    }
                    if (i15 != 0) {
                        rVar5 = rVar2;
                        fVar4 = fVar2;
                        f9 = 16;
                        z6 = true;
                    } else {
                        rVar5 = rVar2;
                        fVar4 = fVar2;
                        f9 = f3;
                        z6 = true;
                    }
                    z7 = true;
                } else {
                    if (i22 != 0) {
                        rVar2 = rVar4;
                    }
                    if (i6 != 0) {
                        f4 = 48.0f;
                    }
                    if (i8 != 0) {
                        fVar2 = null;
                    }
                    j5 = t.g;
                    if (i12 != 0) {
                        f8 = 2.0f;
                    } else {
                        f8 = f2;
                    }
                    if ((i3 & 1024) != 0) {
                        t0VarA = p0.f.a(32);
                        i17 &= -15;
                    } else {
                        t0VarA = t0Var;
                    }
                    if (i15 != 0) {
                        rVar5 = rVar2;
                        fVar4 = fVar2;
                        f9 = 16;
                        z6 = true;
                    } else {
                        rVar5 = rVar2;
                        fVar4 = fVar2;
                        f9 = f3;
                        z6 = true;
                    }
                    z7 = true;
                }
                g0Var.s();
                z8 = z6;
                objN = g0Var.N();
                z9 = z7;
                cVar = l1.i.a;
                obj = objN;
                if (objN == cVar) {
                    z zVarO2 = l1.q.o(g0Var);
                    g0Var.n0(zVarO2);
                    obj = zVarO2;
                }
                zVar = (z) obj;
                zG = g0Var.g(zVar);
                b2.r rVar7 = rVar5;
                Object objN7 = g0Var.N();
                obj2 = objN7;
                if (zG) {
                    tm.i iVar4 = new tm.i(zVar);
                    g0Var.n0(iVar4);
                    obj2 = iVar4;
                } else {
                    tm.i iVar5 = new tm.i(zVar);
                    g0Var.n0(iVar5);
                    obj2 = iVar5;
                }
                iVar = (tm.i) obj2;
                fVar5 = fVar4;
                if (((i17 & 14) ^ 6) <= 4) {
                }
                Object objN8 = g0Var.N();
                obj3 = objN8;
                if (z11) {
                    sm.l lVar2 = new sm.l(t0VarA, 0);
                    g0Var.n0(lVar2);
                    obj3 = lVar2;
                } else {
                    sm.l lVar3 = new sm.l(t0VarA, 0);
                    g0Var.n0(lVar3);
                    obj3 = lVar3;
                }
                u00.a aVar2 = (u00.a) obj3;
                if ((1879048192 & i11) == 536870912) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Object objN9 = g0Var.N();
                obj4 = objN9;
                if (z12) {
                    cs.i iVar6 = new cs.i(f8, 4);
                    g0Var.n0(iVar6);
                    obj4 = iVar6;
                } else {
                    cs.i iVar7 = new cs.i(f8, 4);
                    g0Var.n0(iVar7);
                    obj4 = iVar7;
                }
                kVar = (u00.k) obj4;
                if (z8) {
                    g0Var.c0(1307007109);
                    zI = g0Var.i(iVar);
                    Object objN10 = g0Var.N();
                    if (zI) {
                        z16 = false;
                        sm.p pVar2 = new sm.p(iVar, false ? 1 : 0);
                        g0Var.n0(pVar2);
                        obj5 = pVar2;
                    } else {
                        z16 = false;
                        sm.p pVar3 = new sm.p(iVar, false ? 1 : 0);
                        g0Var.n0(pVar3);
                        obj5 = pVar3;
                    }
                    kVar2 = (u00.k) obj5;
                    g0Var.r(z16);
                } else {
                    kVar = kVar;
                    g0Var.c0(1308295438);
                    g0Var.r(false);
                    kVar2 = null;
                }
                u00.k kVar5 = kVar2;
                if ((i11 & 29360128) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((234881024 & i11) == 67108864) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z13 | z14;
                objN2 = g0Var.N();
                if (z15) {
                    final int i24 = 0;
                    final long j9 = j3;
                    final long j11 = j5;
                    objN2 = new u00.k() {
                        @Override
                        public final Object invoke(Object obj6) {
                            switch (i24) {
                                case 0:
                                    k2.d drawBackdrop = (k2.d) obj6;
                                    kotlin.jvm.internal.m.e(drawBackdrop, "$this$drawBackdrop");
                                    long j12 = j11;
                                    if (j12 != 16) {
                                        k2.d.R(drawBackdrop, j12, 0L, 0L, 0.0f, (k2.h) null, 25, 62);
                                        k2.d.R(drawBackdrop, i2.t.b(0.75f, j12), 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                                    }
                                    long j13 = j9;
                                    if (j13 != 16) {
                                        k2.d.R(drawBackdrop, j13, 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                                    }
                                    break;
                                default:
                                    k2.d drawBackdrop2 = (k2.d) obj6;
                                    kotlin.jvm.internal.m.e(drawBackdrop2, "$this$drawBackdrop");
                                    long j14 = j11;
                                    if (j14 != 16) {
                                        k2.d.R(drawBackdrop2, j14, 0L, 0L, 0.0f, (k2.h) null, 25, 62);
                                        k2.d.R(drawBackdrop2, i2.t.b(0.75f, j14), 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                                    }
                                    long j15 = j9;
                                    if (j15 != 16) {
                                        k2.d.R(drawBackdrop2, j15, 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                                    }
                                    break;
                            }
                            return g00.b0.a;
                        }
                    };
                    j6 = j11;
                    g0Var.n0(objN2);
                } else {
                    final int i25 = 0;
                    final long j12 = j3;
                    final long j13 = j5;
                    objN2 = new u00.k() {
                        @Override
                        public final Object invoke(Object obj6) {
                            switch (i25) {
                                case 0:
                                    k2.d drawBackdrop = (k2.d) obj6;
                                    kotlin.jvm.internal.m.e(drawBackdrop, "$this$drawBackdrop");
                                    long j14 = j13;
                                    if (j14 != 16) {
                                        k2.d.R(drawBackdrop, j14, 0L, 0L, 0.0f, (k2.h) null, 25, 62);
                                        k2.d.R(drawBackdrop, i2.t.b(0.75f, j14), 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                                    }
                                    long j15 = j12;
                                    if (j15 != 16) {
                                        k2.d.R(drawBackdrop, j15, 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                                    }
                                    break;
                                default:
                                    k2.d drawBackdrop2 = (k2.d) obj6;
                                    kotlin.jvm.internal.m.e(drawBackdrop2, "$this$drawBackdrop");
                                    long j16 = j13;
                                    if (j16 != 16) {
                                        k2.d.R(drawBackdrop2, j16, 0L, 0L, 0.0f, (k2.h) null, 25, 62);
                                        k2.d.R(drawBackdrop2, i2.t.b(0.75f, j16), 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                                    }
                                    long j17 = j12;
                                    if (j17 != 16) {
                                        k2.d.R(drawBackdrop2, j17, 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                                    }
                                    break;
                            }
                            return g00.b0.a;
                        }
                    };
                    j6 = j13;
                    g0Var.n0(objN2);
                }
                u00.k kVar6 = (u00.k) objN2;
                float f16 = f8;
                t0 t0Var4 = t0VarA;
                b2.r rVarB3 = jk.d.b(rVar7, backdrop, aVar2, kVar, (u00.a) null, (u00.a) null, (u00.a) null, kVar5, kVar6, 3000);
                if (z8) {
                    g0Var.c0(1308827893);
                } else {
                    g0Var.c0(1566241743);
                    v0Var = (v0) g0Var.k(s0.a);
                }
                g0Var.r(false);
                b2.r rVarB4 = androidx.compose.foundation.b.b(rVarB3, (f0.i) null, v0Var, false, new j3.k(0), onClick, 12);
                if (z8) {
                    rVarV = iVar.i.V(iVar.j);
                } else {
                    rVarV = rVar4;
                }
                b2.r rVarV3 = rVarB4.V(rVarV);
                if (fVar5 != null) {
                    rVarG = z1.m(rVar4, fVar5.A);
                } else {
                    if (z9) {
                        rVarG = z1.e(rVar4, f4);
                    } else {
                        i19 = 2;
                        rVarG = z1.g(rVar4, 48.0f, 0.0f, 2);
                    }
                    float f17 = f9;
                    b2.r rVarE3 = h0.c.E(rVarV3.V(rVarG), f17, 0.0f, i19);
                    h0.b bVar3 = h0.i.a;
                    v1 v1VarA3 = t1.a(h0.i.h(8.0f, b2.b.N), b2.b.K, g0Var, 54);
                    int iHashCode3 = Long.hashCode(g0Var.T);
                    m1 m1VarM3 = g0Var.m();
                    b2.r rVarC3 = b2.a.c(rVarE3, g0Var);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(v1VarA3, g0Var, b3.h.f);
                    l1.q.I(m1VarM3, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode3), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC3, g0Var, b3.h.d);
                    content = oVar;
                    content.invoke(x1.a, g0Var, 54);
                    g0Var.r(true);
                    float f18 = f4;
                    f7 = f17;
                    f6 = f18;
                    z4 = z8;
                    z5 = z9;
                    rVar3 = rVar7;
                    fVar3 = fVar5;
                    t0Var2 = t0Var4;
                    f5 = f16;
                    j4 = j6;
                }
                i19 = 2;
                float f19 = f9;
                b2.r rVarE4 = h0.c.E(rVarV3.V(rVarG), f19, 0.0f, i19);
                h0.b bVar4 = h0.i.a;
                v1 v1VarA4 = t1.a(h0.i.h(8.0f, b2.b.N), b2.b.K, g0Var, 54);
                int iHashCode4 = Long.hashCode(g0Var.T);
                m1 m1VarM4 = g0Var.m();
                b2.r rVarC4 = b2.a.c(rVarE4, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(v1VarA4, g0Var, b3.h.f);
                l1.q.I(m1VarM4, g0Var, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode4), g0Var, b3.h.g);
                l1.q.E(g0Var, b3.h.h);
                l1.q.I(rVarC4, g0Var, b3.h.d);
                content = oVar;
                content.invoke(x1.a, g0Var, 54);
                g0Var.r(true);
                float f110 = f4;
                f7 = f19;
                f6 = f110;
                z4 = z8;
                z5 = z9;
                rVar3 = rVar7;
                fVar3 = fVar5;
                t0Var2 = t0Var4;
                f5 = f16;
                j4 = j6;
            } else {
                g0Var.V();
                z4 = z;
                z5 = z2;
                f5 = f2;
                f6 = f4;
                rVar3 = rVar2;
                fVar3 = fVar2;
                j4 = j;
                t0Var2 = t0Var;
                f7 = f3;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        ((Integer) obj7).getClass();
                        int iK = l1.q.K(i | 1);
                        int iK2 = l1.q.K(i2);
                        w50.c.f(onClick, backdrop, rVar3, z4, z5, f6, fVar3, j4, j2, f5, t0Var2, f7, content, (l1.j) obj6, iK, iK2, i3);
                        return g00.b0.a;
                    }
                };
            }
        }
        i4 |= 384;
        rVar2 = rVar;
        i5 = i4 | 27648;
        i6 = i3 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                f4 = f;
                if (g0Var.d(f4)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i5 |= i7;
            }
            i8 = i3 & 64;
            if (i8 != 0) {
                i5 |= 1572864;
                fVar2 = fVar;
            } else {
                fVar2 = fVar;
                if ((i & 1572864) == 0) {
                    if (g0Var.g(fVar2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i5 |= i9;
                }
            }
            i11 = i5 | 12582912;
            if ((i & 100663296) == 0) {
                j3 = j2;
                if (g0Var.f(j3)) {
                    i21 = 67108864;
                } else {
                    i21 = 33554432;
                }
                i11 |= i21;
            } else {
                j3 = j2;
            }
            i12 = i3 & 512;
            if (i12 != 0) {
                i11 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (g0Var.d(f2)) {
                    i13 = 536870912;
                } else {
                    i13 = 268435456;
                }
                i11 |= i13;
            }
            i14 = i2 | (((i3 & 1024) == 0 || !g0Var.g(t0Var)) ? 2 : 4);
            i15 = i3 & 2048;
            if (i15 != 0) {
                i14 |= 48;
            } else if ((i2 & 48) != 0) {
                if (g0Var.d(f3)) {
                    i16 = 32;
                } else {
                    i16 = 16;
                }
                i14 |= i16;
            }
            i17 = i14;
            if ((i11 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (g0Var.S(i11 & 1, z3)) {
                g0Var.X();
                i18 = i & 1;
                rVar4 = b2.o.A;
                v0Var = null;
                if (i18 != 0) {
                    if (i22 != 0) {
                        rVar2 = rVar4;
                    }
                    if (i6 != 0) {
                        f4 = 48.0f;
                    }
                    if (i8 != 0) {
                        fVar2 = null;
                    }
                    j5 = t.g;
                    if (i12 != 0) {
                        f8 = 2.0f;
                    } else {
                        f8 = f2;
                    }
                    if ((i3 & 1024) != 0) {
                        t0VarA = p0.f.a(32);
                        i17 &= -15;
                    } else {
                        t0VarA = t0Var;
                    }
                    if (i15 != 0) {
                        rVar5 = rVar2;
                        fVar4 = fVar2;
                        f9 = 16;
                        z6 = true;
                    } else {
                        rVar5 = rVar2;
                        fVar4 = fVar2;
                        f9 = f3;
                        z6 = true;
                    }
                    z7 = true;
                } else {
                    if (i22 != 0) {
                        rVar2 = rVar4;
                    }
                    if (i6 != 0) {
                        f4 = 48.0f;
                    }
                    if (i8 != 0) {
                        fVar2 = null;
                    }
                    j5 = t.g;
                    if (i12 != 0) {
                        f8 = 2.0f;
                    } else {
                        f8 = f2;
                    }
                    if ((i3 & 1024) != 0) {
                        t0VarA = p0.f.a(32);
                        i17 &= -15;
                    } else {
                        t0VarA = t0Var;
                    }
                    if (i15 != 0) {
                        rVar5 = rVar2;
                        fVar4 = fVar2;
                        f9 = 16;
                        z6 = true;
                    } else {
                        rVar5 = rVar2;
                        fVar4 = fVar2;
                        f9 = f3;
                        z6 = true;
                    }
                    z7 = true;
                }
                g0Var.s();
                z8 = z6;
                objN = g0Var.N();
                z9 = z7;
                cVar = l1.i.a;
                obj = objN;
                if (objN == cVar) {
                    z zVarO3 = l1.q.o(g0Var);
                    g0Var.n0(zVarO3);
                    obj = zVarO3;
                }
                zVar = (z) obj;
                zG = g0Var.g(zVar);
                b2.r rVar8 = rVar5;
                Object objN11 = g0Var.N();
                obj2 = objN11;
                if (zG) {
                    tm.i iVar8 = new tm.i(zVar);
                    g0Var.n0(iVar8);
                    obj2 = iVar8;
                } else {
                    tm.i iVar9 = new tm.i(zVar);
                    g0Var.n0(iVar9);
                    obj2 = iVar9;
                }
                iVar = (tm.i) obj2;
                fVar5 = fVar4;
                if (((i17 & 14) ^ 6) <= 4) {
                }
                Object objN12 = g0Var.N();
                obj3 = objN12;
                if (z11) {
                    sm.l lVar4 = new sm.l(t0VarA, 0);
                    g0Var.n0(lVar4);
                    obj3 = lVar4;
                } else {
                    sm.l lVar5 = new sm.l(t0VarA, 0);
                    g0Var.n0(lVar5);
                    obj3 = lVar5;
                }
                u00.a aVar3 = (u00.a) obj3;
                if ((1879048192 & i11) == 536870912) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Object objN13 = g0Var.N();
                obj4 = objN13;
                if (z12) {
                    cs.i iVar10 = new cs.i(f8, 4);
                    g0Var.n0(iVar10);
                    obj4 = iVar10;
                } else {
                    cs.i iVar11 = new cs.i(f8, 4);
                    g0Var.n0(iVar11);
                    obj4 = iVar11;
                }
                kVar = (u00.k) obj4;
                if (z8) {
                    g0Var.c0(1307007109);
                    zI = g0Var.i(iVar);
                    Object objN14 = g0Var.N();
                    if (zI) {
                        z16 = false;
                        sm.p pVar4 = new sm.p(iVar, false ? 1 : 0);
                        g0Var.n0(pVar4);
                        obj5 = pVar4;
                    } else {
                        z16 = false;
                        sm.p pVar5 = new sm.p(iVar, false ? 1 : 0);
                        g0Var.n0(pVar5);
                        obj5 = pVar5;
                    }
                    kVar2 = (u00.k) obj5;
                    g0Var.r(z16);
                } else {
                    kVar = kVar;
                    g0Var.c0(1308295438);
                    g0Var.r(false);
                    kVar2 = null;
                }
                u00.k kVar7 = kVar2;
                if ((i11 & 29360128) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if ((234881024 & i11) == 67108864) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z13 | z14;
                objN2 = g0Var.N();
                if (z15) {
                    final int i26 = 0;
                    final long j14 = j3;
                    final long j15 = j5;
                    objN2 = new u00.k() {
                        @Override
                        public final Object invoke(Object obj6) {
                            switch (i26) {
                                case 0:
                                    k2.d drawBackdrop = (k2.d) obj6;
                                    kotlin.jvm.internal.m.e(drawBackdrop, "$this$drawBackdrop");
                                    long j16 = j15;
                                    if (j16 != 16) {
                                        k2.d.R(drawBackdrop, j16, 0L, 0L, 0.0f, (k2.h) null, 25, 62);
                                        k2.d.R(drawBackdrop, i2.t.b(0.75f, j16), 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                                    }
                                    long j17 = j14;
                                    if (j17 != 16) {
                                        k2.d.R(drawBackdrop, j17, 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                                    }
                                    break;
                                default:
                                    k2.d drawBackdrop2 = (k2.d) obj6;
                                    kotlin.jvm.internal.m.e(drawBackdrop2, "$this$drawBackdrop");
                                    long j18 = j15;
                                    if (j18 != 16) {
                                        k2.d.R(drawBackdrop2, j18, 0L, 0L, 0.0f, (k2.h) null, 25, 62);
                                        k2.d.R(drawBackdrop2, i2.t.b(0.75f, j18), 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                                    }
                                    long j19 = j14;
                                    if (j19 != 16) {
                                        k2.d.R(drawBackdrop2, j19, 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                                    }
                                    break;
                            }
                            return g00.b0.a;
                        }
                    };
                    j6 = j15;
                    g0Var.n0(objN2);
                } else {
                    final int i27 = 0;
                    final long j16 = j3;
                    final long j17 = j5;
                    objN2 = new u00.k() {
                        @Override
                        public final Object invoke(Object obj6) {
                            switch (i27) {
                                case 0:
                                    k2.d drawBackdrop = (k2.d) obj6;
                                    kotlin.jvm.internal.m.e(drawBackdrop, "$this$drawBackdrop");
                                    long j18 = j17;
                                    if (j18 != 16) {
                                        k2.d.R(drawBackdrop, j18, 0L, 0L, 0.0f, (k2.h) null, 25, 62);
                                        k2.d.R(drawBackdrop, i2.t.b(0.75f, j18), 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                                    }
                                    long j19 = j16;
                                    if (j19 != 16) {
                                        k2.d.R(drawBackdrop, j19, 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                                    }
                                    break;
                                default:
                                    k2.d drawBackdrop2 = (k2.d) obj6;
                                    kotlin.jvm.internal.m.e(drawBackdrop2, "$this$drawBackdrop");
                                    long j110 = j17;
                                    if (j110 != 16) {
                                        k2.d.R(drawBackdrop2, j110, 0L, 0L, 0.0f, (k2.h) null, 25, 62);
                                        k2.d.R(drawBackdrop2, i2.t.b(0.75f, j110), 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                                    }
                                    long j111 = j16;
                                    if (j111 != 16) {
                                        k2.d.R(drawBackdrop2, j111, 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                                    }
                                    break;
                            }
                            return g00.b0.a;
                        }
                    };
                    j6 = j17;
                    g0Var.n0(objN2);
                }
                u00.k kVar8 = (u00.k) objN2;
                float f111 = f8;
                t0 t0Var5 = t0VarA;
                b2.r rVarB5 = jk.d.b(rVar8, backdrop, aVar3, kVar, (u00.a) null, (u00.a) null, (u00.a) null, kVar7, kVar8, 3000);
                if (z8) {
                    g0Var.c0(1308827893);
                } else {
                    g0Var.c0(1566241743);
                    v0Var = (v0) g0Var.k(s0.a);
                }
                g0Var.r(false);
                b2.r rVarB6 = androidx.compose.foundation.b.b(rVarB5, (f0.i) null, v0Var, false, new j3.k(0), onClick, 12);
                if (z8) {
                    rVarV = iVar.i.V(iVar.j);
                } else {
                    rVarV = rVar4;
                }
                b2.r rVarV4 = rVarB6.V(rVarV);
                if (fVar5 != null) {
                    rVarG = z1.m(rVar4, fVar5.A);
                } else {
                    if (z9) {
                        rVarG = z1.e(rVar4, f4);
                    } else {
                        i19 = 2;
                        rVarG = z1.g(rVar4, 48.0f, 0.0f, 2);
                    }
                    float f112 = f9;
                    b2.r rVarE5 = h0.c.E(rVarV4.V(rVarG), f112, 0.0f, i19);
                    h0.b bVar5 = h0.i.a;
                    v1 v1VarA5 = t1.a(h0.i.h(8.0f, b2.b.N), b2.b.K, g0Var, 54);
                    int iHashCode5 = Long.hashCode(g0Var.T);
                    m1 m1VarM5 = g0Var.m();
                    b2.r rVarC5 = b2.a.c(rVarE5, g0Var);
                    b3.i.c.getClass();
                    gVar = b3.h.b;
                    g0Var.g0();
                    if (g0Var.S) {
                        g0Var.l(gVar);
                    } else {
                        g0Var.q0();
                    }
                    l1.q.I(v1VarA5, g0Var, b3.h.f);
                    l1.q.I(m1VarM5, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode5), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC5, g0Var, b3.h.d);
                    content = oVar;
                    content.invoke(x1.a, g0Var, 54);
                    g0Var.r(true);
                    float f113 = f4;
                    f7 = f112;
                    f6 = f113;
                    z4 = z8;
                    z5 = z9;
                    rVar3 = rVar8;
                    fVar3 = fVar5;
                    t0Var2 = t0Var5;
                    f5 = f111;
                    j4 = j6;
                }
                i19 = 2;
                float f114 = f9;
                b2.r rVarE6 = h0.c.E(rVarV4.V(rVarG), f114, 0.0f, i19);
                h0.b bVar6 = h0.i.a;
                v1 v1VarA6 = t1.a(h0.i.h(8.0f, b2.b.N), b2.b.K, g0Var, 54);
                int iHashCode6 = Long.hashCode(g0Var.T);
                m1 m1VarM6 = g0Var.m();
                b2.r rVarC6 = b2.a.c(rVarE6, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(v1VarA6, g0Var, b3.h.f);
                l1.q.I(m1VarM6, g0Var, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode6), g0Var, b3.h.g);
                l1.q.E(g0Var, b3.h.h);
                l1.q.I(rVarC6, g0Var, b3.h.d);
                content = oVar;
                content.invoke(x1.a, g0Var, 54);
                g0Var.r(true);
                float f115 = f4;
                f7 = f114;
                f6 = f115;
                z4 = z8;
                z5 = z9;
                rVar3 = rVar8;
                fVar3 = fVar5;
                t0Var2 = t0Var5;
                f5 = f111;
                j4 = j6;
            } else {
                g0Var.V();
                z4 = z;
                z5 = z2;
                f5 = f2;
                f6 = f4;
                rVar3 = rVar2;
                fVar3 = fVar2;
                j4 = j;
                t0Var2 = t0Var;
                f7 = f3;
            }
            r1VarT = g0Var.t();
            if (r1VarT != null) {
                r1VarT.d = new u00.n() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7) {
                        ((Integer) obj7).getClass();
                        int iK = l1.q.K(i | 1);
                        int iK2 = l1.q.K(i2);
                        w50.c.f(onClick, backdrop, rVar3, z4, z5, f6, fVar3, j4, j2, f5, t0Var2, f7, content, (l1.j) obj6, iK, iK2, i3);
                        return g00.b0.a;
                    }
                };
            }
        }
        i5 = 224256 | i4;
        f4 = f;
        i8 = i3 & 64;
        if (i8 != 0) {
            i5 |= 1572864;
            fVar2 = fVar;
        } else {
            fVar2 = fVar;
            if ((i & 1572864) == 0) {
                if (g0Var.g(fVar2)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i5 |= i9;
            }
        }
        i11 = i5 | 12582912;
        if ((i & 100663296) == 0) {
            j3 = j2;
            if (g0Var.f(j3)) {
                i21 = 67108864;
            } else {
                i21 = 33554432;
            }
            i11 |= i21;
        } else {
            j3 = j2;
        }
        i12 = i3 & 512;
        if (i12 != 0) {
            i11 |= 805306368;
        } else if ((i & 805306368) == 0) {
            if (g0Var.d(f2)) {
                i13 = 536870912;
            } else {
                i13 = 268435456;
            }
            i11 |= i13;
        }
        i14 = i2 | (((i3 & 1024) == 0 || !g0Var.g(t0Var)) ? 2 : 4);
        i15 = i3 & 2048;
        if (i15 != 0) {
            i14 |= 48;
        } else if ((i2 & 48) != 0) {
            if (g0Var.d(f3)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i14 |= i16;
        }
        i17 = i14;
        if ((i11 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (g0Var.S(i11 & 1, z3)) {
            g0Var.X();
            i18 = i & 1;
            rVar4 = b2.o.A;
            v0Var = null;
            if (i18 != 0) {
                if (i22 != 0) {
                    rVar2 = rVar4;
                }
                if (i6 != 0) {
                    f4 = 48.0f;
                }
                if (i8 != 0) {
                    fVar2 = null;
                }
                j5 = t.g;
                if (i12 != 0) {
                    f8 = 2.0f;
                } else {
                    f8 = f2;
                }
                if ((i3 & 1024) != 0) {
                    t0VarA = p0.f.a(32);
                    i17 &= -15;
                } else {
                    t0VarA = t0Var;
                }
                if (i15 != 0) {
                    rVar5 = rVar2;
                    fVar4 = fVar2;
                    f9 = 16;
                    z6 = true;
                } else {
                    rVar5 = rVar2;
                    fVar4 = fVar2;
                    f9 = f3;
                    z6 = true;
                }
                z7 = true;
            } else {
                if (i22 != 0) {
                    rVar2 = rVar4;
                }
                if (i6 != 0) {
                    f4 = 48.0f;
                }
                if (i8 != 0) {
                    fVar2 = null;
                }
                j5 = t.g;
                if (i12 != 0) {
                    f8 = 2.0f;
                } else {
                    f8 = f2;
                }
                if ((i3 & 1024) != 0) {
                    t0VarA = p0.f.a(32);
                    i17 &= -15;
                } else {
                    t0VarA = t0Var;
                }
                if (i15 != 0) {
                    rVar5 = rVar2;
                    fVar4 = fVar2;
                    f9 = 16;
                    z6 = true;
                } else {
                    rVar5 = rVar2;
                    fVar4 = fVar2;
                    f9 = f3;
                    z6 = true;
                }
                z7 = true;
            }
            g0Var.s();
            z8 = z6;
            objN = g0Var.N();
            z9 = z7;
            cVar = l1.i.a;
            obj = objN;
            if (objN == cVar) {
                z zVarO4 = l1.q.o(g0Var);
                g0Var.n0(zVarO4);
                obj = zVarO4;
            }
            zVar = (z) obj;
            zG = g0Var.g(zVar);
            b2.r rVar9 = rVar5;
            Object objN15 = g0Var.N();
            obj2 = objN15;
            if (zG) {
                tm.i iVar12 = new tm.i(zVar);
                g0Var.n0(iVar12);
                obj2 = iVar12;
            } else {
                tm.i iVar13 = new tm.i(zVar);
                g0Var.n0(iVar13);
                obj2 = iVar13;
            }
            iVar = (tm.i) obj2;
            fVar5 = fVar4;
            if (((i17 & 14) ^ 6) <= 4) {
            }
            Object objN16 = g0Var.N();
            obj3 = objN16;
            if (z11) {
                sm.l lVar6 = new sm.l(t0VarA, 0);
                g0Var.n0(lVar6);
                obj3 = lVar6;
            } else {
                sm.l lVar7 = new sm.l(t0VarA, 0);
                g0Var.n0(lVar7);
                obj3 = lVar7;
            }
            u00.a aVar4 = (u00.a) obj3;
            if ((1879048192 & i11) == 536870912) {
                z12 = true;
            } else {
                z12 = false;
            }
            Object objN17 = g0Var.N();
            obj4 = objN17;
            if (z12) {
                cs.i iVar14 = new cs.i(f8, 4);
                g0Var.n0(iVar14);
                obj4 = iVar14;
            } else {
                cs.i iVar15 = new cs.i(f8, 4);
                g0Var.n0(iVar15);
                obj4 = iVar15;
            }
            kVar = (u00.k) obj4;
            if (z8) {
                g0Var.c0(1307007109);
                zI = g0Var.i(iVar);
                Object objN18 = g0Var.N();
                if (zI) {
                    z16 = false;
                    sm.p pVar6 = new sm.p(iVar, false ? 1 : 0);
                    g0Var.n0(pVar6);
                    obj5 = pVar6;
                } else {
                    z16 = false;
                    sm.p pVar7 = new sm.p(iVar, false ? 1 : 0);
                    g0Var.n0(pVar7);
                    obj5 = pVar7;
                }
                kVar2 = (u00.k) obj5;
                g0Var.r(z16);
            } else {
                kVar = kVar;
                g0Var.c0(1308295438);
                g0Var.r(false);
                kVar2 = null;
            }
            u00.k kVar9 = kVar2;
            if ((i11 & 29360128) == 8388608) {
                z13 = true;
            } else {
                z13 = false;
            }
            if ((234881024 & i11) == 67108864) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z13 | z14;
            objN2 = g0Var.N();
            if (z15) {
                final int i28 = 0;
                final long j18 = j3;
                final long j19 = j5;
                objN2 = new u00.k() {
                    @Override
                    public final Object invoke(Object obj6) {
                        switch (i28) {
                            case 0:
                                k2.d drawBackdrop = (k2.d) obj6;
                                kotlin.jvm.internal.m.e(drawBackdrop, "$this$drawBackdrop");
                                long j110 = j19;
                                if (j110 != 16) {
                                    k2.d.R(drawBackdrop, j110, 0L, 0L, 0.0f, (k2.h) null, 25, 62);
                                    k2.d.R(drawBackdrop, i2.t.b(0.75f, j110), 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                                }
                                long j111 = j18;
                                if (j111 != 16) {
                                    k2.d.R(drawBackdrop, j111, 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                                }
                                break;
                            default:
                                k2.d drawBackdrop2 = (k2.d) obj6;
                                kotlin.jvm.internal.m.e(drawBackdrop2, "$this$drawBackdrop");
                                long j112 = j19;
                                if (j112 != 16) {
                                    k2.d.R(drawBackdrop2, j112, 0L, 0L, 0.0f, (k2.h) null, 25, 62);
                                    k2.d.R(drawBackdrop2, i2.t.b(0.75f, j112), 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                                }
                                long j113 = j18;
                                if (j113 != 16) {
                                    k2.d.R(drawBackdrop2, j113, 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                                }
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                j6 = j19;
                g0Var.n0(objN2);
            } else {
                final int i29 = 0;
                final long j110 = j3;
                final long j111 = j5;
                objN2 = new u00.k() {
                    @Override
                    public final Object invoke(Object obj6) {
                        switch (i29) {
                            case 0:
                                k2.d drawBackdrop = (k2.d) obj6;
                                kotlin.jvm.internal.m.e(drawBackdrop, "$this$drawBackdrop");
                                long j112 = j111;
                                if (j112 != 16) {
                                    k2.d.R(drawBackdrop, j112, 0L, 0L, 0.0f, (k2.h) null, 25, 62);
                                    k2.d.R(drawBackdrop, i2.t.b(0.75f, j112), 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                                }
                                long j113 = j110;
                                if (j113 != 16) {
                                    k2.d.R(drawBackdrop, j113, 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                                }
                                break;
                            default:
                                k2.d drawBackdrop2 = (k2.d) obj6;
                                kotlin.jvm.internal.m.e(drawBackdrop2, "$this$drawBackdrop");
                                long j114 = j111;
                                if (j114 != 16) {
                                    k2.d.R(drawBackdrop2, j114, 0L, 0L, 0.0f, (k2.h) null, 25, 62);
                                    k2.d.R(drawBackdrop2, i2.t.b(0.75f, j114), 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                                }
                                long j115 = j110;
                                if (j115 != 16) {
                                    k2.d.R(drawBackdrop2, j115, 0L, 0L, 0.0f, (k2.h) null, 0, 126);
                                }
                                break;
                        }
                        return g00.b0.a;
                    }
                };
                j6 = j111;
                g0Var.n0(objN2);
            }
            u00.k kVar10 = (u00.k) objN2;
            float f116 = f8;
            t0 t0Var6 = t0VarA;
            b2.r rVarB7 = jk.d.b(rVar9, backdrop, aVar4, kVar, (u00.a) null, (u00.a) null, (u00.a) null, kVar9, kVar10, 3000);
            if (z8) {
                g0Var.c0(1308827893);
            } else {
                g0Var.c0(1566241743);
                v0Var = (v0) g0Var.k(s0.a);
            }
            g0Var.r(false);
            b2.r rVarB8 = androidx.compose.foundation.b.b(rVarB7, (f0.i) null, v0Var, false, new j3.k(0), onClick, 12);
            if (z8) {
                rVarV = iVar.i.V(iVar.j);
            } else {
                rVarV = rVar4;
            }
            b2.r rVarV5 = rVarB8.V(rVarV);
            if (fVar5 != null) {
                rVarG = z1.m(rVar4, fVar5.A);
            } else {
                if (z9) {
                    rVarG = z1.e(rVar4, f4);
                } else {
                    i19 = 2;
                    rVarG = z1.g(rVar4, 48.0f, 0.0f, 2);
                }
                float f117 = f9;
                b2.r rVarE7 = h0.c.E(rVarV5.V(rVarG), f117, 0.0f, i19);
                h0.b bVar7 = h0.i.a;
                v1 v1VarA7 = t1.a(h0.i.h(8.0f, b2.b.N), b2.b.K, g0Var, 54);
                int iHashCode7 = Long.hashCode(g0Var.T);
                m1 m1VarM7 = g0Var.m();
                b2.r rVarC7 = b2.a.c(rVarE7, g0Var);
                b3.i.c.getClass();
                gVar = b3.h.b;
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(v1VarA7, g0Var, b3.h.f);
                l1.q.I(m1VarM7, g0Var, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode7), g0Var, b3.h.g);
                l1.q.E(g0Var, b3.h.h);
                l1.q.I(rVarC7, g0Var, b3.h.d);
                content = oVar;
                content.invoke(x1.a, g0Var, 54);
                g0Var.r(true);
                float f118 = f4;
                f7 = f117;
                f6 = f118;
                z4 = z8;
                z5 = z9;
                rVar3 = rVar9;
                fVar3 = fVar5;
                t0Var2 = t0Var6;
                f5 = f116;
                j4 = j6;
            }
            i19 = 2;
            float f119 = f9;
            b2.r rVarE8 = h0.c.E(rVarV5.V(rVarG), f119, 0.0f, i19);
            h0.b bVar8 = h0.i.a;
            v1 v1VarA8 = t1.a(h0.i.h(8.0f, b2.b.N), b2.b.K, g0Var, 54);
            int iHashCode8 = Long.hashCode(g0Var.T);
            m1 m1VarM8 = g0Var.m();
            b2.r rVarC8 = b2.a.c(rVarE8, g0Var);
            b3.i.c.getClass();
            gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA8, g0Var, b3.h.f);
            l1.q.I(m1VarM8, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode8), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC8, g0Var, b3.h.d);
            content = oVar;
            content.invoke(x1.a, g0Var, 54);
            g0Var.r(true);
            float f1110 = f4;
            f7 = f119;
            f6 = f1110;
            z4 = z8;
            z5 = z9;
            rVar3 = rVar9;
            fVar3 = fVar5;
            t0Var2 = t0Var6;
            f5 = f116;
            j4 = j6;
        } else {
            g0Var.V();
            z4 = z;
            z5 = z2;
            f5 = f2;
            f6 = f4;
            rVar3 = rVar2;
            fVar3 = fVar2;
            j4 = j;
            t0Var2 = t0Var;
            f7 = f3;
        }
        r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    int iK = l1.q.K(i | 1);
                    int iK2 = l1.q.K(i2);
                    w50.c.f(onClick, backdrop, rVar3, z4, z5, f6, fVar3, j4, j2, f5, t0Var2, f7, content, (l1.j) obj6, iK, iK2, i3);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final u0 f0(j0 j0Var, f typeTable) {
        m.e(j0Var, "<this>");
        m.e(typeTable, "typeTable");
        int i = j0Var.C;
        if ((i & 8) == 8) {
            u0 u0Var = j0Var.G;
            m.d(u0Var, "getReturnType(...)");
            return u0Var;
        }
        if ((i & 16) == 16) {
            return typeTable.a(j0Var.H);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property");
    }

    public static float g(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static Set g0(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        m.d(setSingleton, "singleton(...)");
        return setSingleton;
    }

    public static final void h(final qr.s sVar, final u00.a aVar, final float f, final long j, final long j2, final long j3, final long j4, final long j5, l1.j jVar, final int i) {
        String strT;
        g0 g0Var = (g0) jVar;
        g0Var.e0(195814042);
        int i2 = i | (g0Var.g(sVar) ? 4 : 2) | (g0Var.i(aVar) ? 32 : 16) | (g0Var.d(f) ? 256 : 128) | (g0Var.f(j) ? 2048 : 1024) | (g0Var.f(j2) ? 16384 : 8192) | (g0Var.f(j3) ? 131072 : 65536) | (g0Var.f(j4) ? 1048576 : 524288) | (g0Var.f(j5) ? 8388608 : 4194304);
        if (g0Var.S(i2 & 1, (4793491 & i2) != 4793490)) {
            y3.m mVar = (y3.m) g0Var.k(o1.n);
            long j6 = sVar.d;
            int i3 = sVar.c;
            boolean zF = g0Var.f(j6);
            Object objN = g0Var.N();
            Object obj = l1.i.a;
            if (zF || objN == obj) {
                objN = f50.c.w(sVar.d);
                g0Var.n0(objN);
            }
            String str = (String) objN;
            boolean zE = g0Var.e(i3);
            Object objN2 = g0Var.N();
            if (zE || objN2 == obj) {
                objN2 = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1));
                g0Var.n0(objN2);
            }
            String str2 = (String) objN2;
            b2.o oVar = b2.o.A;
            b2.r rVarC = h0.c.C(z1.d(oVar, 1.0f), 16);
            float f2 = 12;
            v1 v1VarA = t1.a(h0.i.g(f2), b2.b.K, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarC, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f;
            l1.q.I(v1VarA, g0Var, fVar);
            b3.f fVar2 = b3.h.e;
            l1.q.I(m1VarM, g0Var, fVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b3.f fVar3 = b3.h.g;
            l1.q.I(numValueOf, g0Var, fVar3);
            b3.e eVar = b3.h.h;
            l1.q.E(g0Var, eVar);
            b3.f fVar4 = b3.h.d;
            l1.q.I(rVarC2, g0Var, fVar4);
            wb.h hVar = new wb.h((Context) g0Var.k(o0.b));
            hVar.c = sVar.e;
            mb.j jVarI = mb.l.i(w.c.q(hVar, 600), (z2.p) null, g0Var, 0, 62);
            z.n.c(jVarI, (String) null, rd.a.g0(20, 0, dl.a.s, f2.h.c(z1.m(oVar, f), p0.f.a), !(jVarI.j() instanceof mb.g)), (b2.d) null, z2.o.a, 0.0f, g0Var, 24624, 104);
            if (1.0f <= 0.0d) {
                i0.a.a("invalid weight; must be greater than zero");
            }
            c1 c1Var = new c1(1.0f, true);
            v vVarA = u.a(h0.i.g(2), b2.b.M, g0Var, 6);
            int iHashCode2 = Long.hashCode(g0Var.T);
            m1 m1VarM2 = g0Var.m();
            b2.r rVarC3 = b2.a.c(c1Var, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA, g0Var, fVar);
            l1.q.I(m1VarM2, g0Var, fVar2);
            a1.b.v(iHashCode2, g0Var, fVar3, g0Var, eVar);
            l1.q.I(rVarC3, g0Var, fVar4);
            String str3 = sVar.b;
            long j7 = dl.a.i;
            int i4 = ((i2 << 3) & 57344) | 1572864;
            int i5 = i2 >> 9;
            z6.b(str3, (b2.r) null, j7, j, q3.u.D, (q3.i) null, 0L, (x3.l) null, (x3.k) null, j2, 2, false, 1, 0, (u00.k) null, (r0) null, g0Var, i4, (i5 & 112) | 24960, 239530);
            int iOrdinal = mVar.ordinal();
            if (iOrdinal == 0) {
                g0Var.c0(-1998687605);
                strT = z3.T(2131887324, new Object[]{Integer.valueOf(i3), str}, g0Var);
                g0Var.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw k.r(g0Var, -1998696515, false);
                }
                g0Var.c0(-1998694641);
                strT = z3.T(2131887325, new Object[]{str2, str}, g0Var);
                g0Var.r(false);
            }
            z6.b(strT, (b2.r) null, t.b(0.7f, dl.a.k), j3, q3.u.B, (q3.i) null, 0L, (x3.l) null, (x3.k) null, j4, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, ((i2 >> 3) & 57344) | 1572864, (i2 >> 15) & 112, 260010);
            g0Var.r(true);
            z6.b(z3.U(g0Var, 2131886415), h0.c.D(o(z.n.f(f2.h.c(oVar, p0.f.a(32)), t.b(0.15f, j7), b0.b), false, null, aVar, 7), f2, 9), j7, j5, q3.u.C, (q3.i) null, 0L, (x3.l) null, (x3.k) null, j5, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, (i5 & 57344) | 1572864, (i2 >> 18) & 112, 260008);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new u00.n(aVar, f, j, j2, j3, j4, j5, i) {
                public final u00.a B;
                public final float C;
                public final long D;
                public final long E;
                public final long F;
                public final long G;
                public final long H;

                @Override
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iK = l1.q.K(1);
                    c.h(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, (l1.j) obj2, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final List h0(i20.k kVar, f typeTable) {
        m.e(kVar, "<this>");
        m.e(typeTable, "typeTable");
        List arrayList = kVar.H;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            List<Integer> list = kVar.I;
            m.d(list, "getSupertypeIdList(...)");
            arrayList = new ArrayList(h00.r.q0(list, 10));
            for (Integer num : list) {
                m.b(num);
                arrayList.add(typeTable.a(num.intValue()));
            }
        }
        return arrayList;
    }

    public static final void i(final u30.b reciterDownloads, final u00.k onDeleteDownloads, final b2.r rVar, l1.j jVar, final int i) {
        g0 g0Var;
        b2.g gVar = b2.b.M;
        m.e(reciterDownloads, "reciterDownloads");
        m.e(onDeleteDownloads, "onDeleteDownloads");
        g0 g0Var2 = (g0) jVar;
        g0Var2.e0(-82803250);
        int i2 = i | (g0Var2.g(reciterDownloads) ? 4 : 2) | (g0Var2.i(onDeleteDownloads) ? 32 : 16) | (g0Var2.g(rVar) ? 256 : 128);
        if (g0Var2.S(i2 & 1, (i2 & 147) != 146)) {
            gm.a aVar = (gm.a) g0Var2.k(dl.e.a);
            gm.a aVar2 = gm.a.B;
            float f = aVar == aVar2 ? 48 : 44;
            long jZ = aVar == aVar2 ? kh.o.z(18) : kh.o.z(16);
            long jZ2 = kh.o.z(aVar == aVar2 ? 15 : 13);
            long jZ3 = kh.o.z(aVar != aVar2 ? 14 : 16);
            boolean zIsEmpty = ((h00.b) reciterDownloads).isEmpty();
            i2.o0 o0Var = b0.b;
            if (zIsEmpty) {
                g0Var2.c0(-1479682231);
                b2.r rVarF = z.n.f(f2.h.c(z1.d(rVar, 1.0f), p0.f.a(24)), t.b(0.08f, dl.a.i), o0Var);
                v vVarA = u.a(h0.i.g(0), gVar, g0Var2, 6);
                int iHashCode = Long.hashCode(g0Var2.T);
                m1 m1VarM = g0Var2.m();
                b2.r rVarC = b2.a.c(rVarF, g0Var2);
                b3.i.c.getClass();
                b3.g gVar2 = b3.h.b;
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar2);
                } else {
                    g0Var2.q0();
                }
                l1.q.I(vVarA, g0Var2, b3.h.f);
                l1.q.I(m1VarM, g0Var2, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode), g0Var2, b3.h.g);
                l1.q.E(g0Var2, b3.h.h);
                l1.q.I(rVarC, g0Var2, b3.h.d);
                c(aVar, g0Var2, 0);
                g0Var2.r(true);
                g0Var2.r(false);
                g0Var = g0Var2;
            } else {
                boolean z = false;
                g0Var2.c0(-1479332582);
                b2.r rVarF2 = z.n.f(f2.h.c(z1.d(rVar, 1.0f), p0.f.a(24)), t.b(0.08f, dl.a.i), o0Var);
                v vVarA2 = u.a(h0.i.g(0), gVar, g0Var2, 6);
                int iHashCode2 = Long.hashCode(g0Var2.T);
                m1 m1VarM2 = g0Var2.m();
                b2.r rVarC2 = b2.a.c(rVarF2, g0Var2);
                b3.i.c.getClass();
                b3.g gVar3 = b3.h.b;
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar3);
                } else {
                    g0Var2.q0();
                }
                l1.q.I(vVarA2, g0Var2, b3.h.f);
                l1.q.I(m1VarM2, g0Var2, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode2), g0Var2, b3.h.g);
                l1.q.E(g0Var2, b3.h.h);
                l1.q.I(rVarC2, g0Var2, b3.h.d);
                g0Var2.c0(1067012687);
                Iterator it = reciterDownloads.iterator();
                while (it.hasNext()) {
                    qr.s sVar = (qr.s) it.next();
                    boolean zG = ((i2 & 112) == 32 ? true : z) | g0Var2.g(sVar);
                    Object objN = g0Var2.N();
                    if (zG || objN == l1.i.a) {
                        objN = new a1.o1(onDeleteDownloads, sVar, 16);
                        g0Var2.n0(objN);
                    }
                    long j = jZ;
                    long j2 = jZ2;
                    float f2 = f;
                    g0 g0Var3 = g0Var2;
                    h(sVar, (u00.a) objN, f2, j, jZ, j2, j2, jZ3, g0Var3, 0);
                    it = it;
                    z = z;
                    i2 = i2;
                    g0Var2 = g0Var3;
                    jZ2 = j2;
                    f = f2;
                    jZ = j;
                }
                g0Var = g0Var2;
                boolean z2 = z;
                x5.z(g0Var, z2, true, z2);
            }
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            final int i3 = 0;
            r1VarT.d = new u00.n(reciterDownloads, onDeleteDownloads, rVar, i, i3) {
                public final int A;
                public final u30.b B;
                public final u00.k C;
                public final b2.r D;

                {
                    this.A = i3;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
                    int i4 = this.A;
                    l1.j jVar2 = (l1.j) obj;
                    ((Integer) obj2).getClass();
                    switch (i4) {
                        case 0:
                            c.i(this.B, this.C, this.D, jVar2, l1.q.K(1));
                            break;
                        case 1:
                            kh.n.d(this.B, this.C, this.D, jVar2, l1.q.K(1));
                            break;
                        default:
                            bi.b.a(this.B, this.C, this.D, jVar2, l1.q.K(1));
                            break;
                    }
                    return g00.b0.a;
                }
            };
        }
    }

    public static final j6.n i0(float f) {
        return new j6.n(f, 2);
    }

    public static final u0 j(u0 u0Var, f typeTable) {
        m.e(u0Var, "<this>");
        m.e(typeTable, "typeTable");
        int i = u0Var.C;
        if ((i & 1024) == 1024) {
            return u0Var.O;
        }
        if ((i & 2048) == 2048) {
            return typeTable.a(u0Var.P);
        }
        return null;
    }

    public static final u0 j0(i20.s0 s0Var, f typeTable) {
        m.e(typeTable, "typeTable");
        int i = s0Var.B;
        if ((i & 2) == 2) {
            return s0Var.D;
        }
        if ((i & 4) == 4) {
            return typeTable.a(s0Var.E);
        }
        return null;
    }

    public static final Object k(y yVar, Context context, d6.r rVar, l6.x xVar, h.e eVar, m00.c cVar) throws Throwable {
        l6.t tVar;
        ?? r4;
        u1 u1Var;
        l6.f fVar;
        Context context2;
        d6.r rVar2;
        l6.x xVar2;
        d6.r rVar3;
        y yVar2;
        d6.r rVar4;
        e1 e1Var;
        l6.f fVar2;
        ?? r1;
        b1.l lVar;
        l1.p pVar;
        d6.r rVar5;
        int i;
        ?? r3 = context;
        d6.r rVar6 = rVar;
        if (cVar instanceof l6.t) {
            tVar = (l6.t) cVar;
            i = tVar.J;
            if ((i & Integer.MIN_VALUE) != 0) {
                int i2 = i - Integer.MIN_VALUE;
                tVar.J = i2;
                r4 = i2;
            } else {
                tVar = new l6.t(cVar);
                r4 = i;
            }
        } else {
            tVar = new l6.t(cVar);
            r4 = i;
        }
        l6.t tVar2 = tVar;
        Object obj = tVar2.I;
        l00.a aVar = l00.a.A;
        ?? r2 = tVar2.J;
        int i3 = 2;
        k00.c cVar2 = null;
        if (r2 != 0) {
            try {
                if (r2 == 1) {
                    l1.p pVar2 = tVar2.H;
                    d6.r rVar7 = tVar2.G;
                    u1 u1Var2 = tVar2.F;
                    l6.f fVar3 = tVar2.E;
                    l6.x xVar3 = (l6.x) tVar2.D;
                    d6.r rVar8 = (d6.r) tVar2.C;
                    Context context3 = (Context) tVar2.B;
                    y yVar3 = (y) tVar2.A;
                    ri.t1.O(obj);
                    u1Var = u1Var2;
                    fVar = fVar3;
                    context2 = context3;
                    rVar2 = rVar7;
                    xVar2 = xVar3;
                    rVar3 = rVar8;
                    yVar2 = yVar3;
                    r2 = pVar2;
                    try {
                        lVar = new b1.l(yVar2, xVar2, rVar3, fVar);
                        tVar2.A = fVar;
                        tVar2.B = u1Var;
                        tVar2.C = rVar2;
                        tVar2.D = r2;
                        tVar2.E = null;
                        tVar2.F = null;
                        tVar2.G = null;
                        tVar2.H = null;
                        tVar2.J = 2;
                        if (rVar3.d(context2, lVar, tVar2) != aVar) {
                            rVar4 = rVar2;
                            e1Var = u1Var;
                            fVar2 = fVar;
                            r1 = r2;
                        }
                        return aVar;
                    } catch (Throwable th) {
                        th = th;
                        rVar6 = rVar2;
                        r3 = u1Var;
                        r4 = fVar;
                        r2.dispose();
                        r4.b();
                        r3.i(null);
                        rVar6.A();
                        throw th;
                    }
                }
                if (r2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l1.m mVar = (l1.m) tVar2.D;
                rVar4 = (l1.x1) tVar2.C;
                e1Var = (e1) tVar2.B;
                fVar2 = (l6.f) tVar2.A;
                ri.t1.O(obj);
                r1 = mVar;
                r1.dispose();
                fVar2.b();
                e1Var.i(null);
                rVar4.A();
                return g00.b0.a;
            } catch (Throwable th2) {
                th = th2;
                r2.dispose();
                r4.b();
                r3.i(null);
                rVar6.A();
                throw th;
            }
        }
        ri.t1.O(obj);
        fVar = new l6.f(yVar);
        u1 u1VarY = c0.y(yVar, null, null, new d40.n0(i3, cVar2, 1), 3);
        z zVar = yVar.A;
        rVar6.getClass();
        d6.x1 x1Var = new d6.x1(50);
        p1 p1VarC = d40.o.c(Boolean.FALSE);
        l6.s sVar = new l6.s(yVar, rVar6, (Context) r3);
        eVar.getClass();
        f1 f1VarD = c0.d();
        e1 e1Var2 = (e1) zVar.A().get(a40.w.B);
        if (e1Var2 != null) {
            e1Var2.f0(new h00.a(f1VarD, 19));
        }
        d6.r x1Var2 = new l1.x1(zVar.A().plus(f1VarD).plus(sVar));
        l1.p pVar3 = new l1.p(x1Var2, new b6.b(x1Var));
        try {
            androidx.lifecycle.n0 n0Var = new androidx.lifecycle.n0(pVar3, rVar6, (Object) r3, x1Var2, yVar, (k00.c) null, 4);
            pVar = pVar3;
            rVar5 = x1Var2;
            try {
                c0.y(yVar, fVar, null, n0Var, 2);
                u1Var = u1VarY;
                rVar3 = rVar;
                try {
                    context2 = context;
                    yVar2 = yVar;
                    c0.y(yVar2, null, null, new x0((l1.x1) rVar5, rVar3, p1VarC, context, x1Var, yVar, xVar, (k00.c) null), 3);
                    l6.u uVar = new l6.u(2, (k00.c) null, 0);
                    tVar2.A = yVar2;
                    tVar2.B = context2;
                    tVar2.C = rVar3;
                    xVar2 = xVar;
                    tVar2.D = xVar2;
                    tVar2.E = fVar;
                    tVar2.F = u1Var;
                    tVar2.G = rVar5;
                    tVar2.H = pVar;
                    tVar2.J = 1;
                    if (d40.o.t(p1VarC, uVar, tVar2) != aVar) {
                        rVar2 = rVar5;
                        r2 = pVar;
                        lVar = new b1.l(yVar2, xVar2, rVar3, fVar);
                        tVar2.A = fVar;
                        tVar2.B = u1Var;
                        tVar2.C = rVar2;
                        tVar2.D = r2;
                        tVar2.E = null;
                        tVar2.F = null;
                        tVar2.G = null;
                        tVar2.H = null;
                        tVar2.J = 2;
                        if (rVar3.d(context2, lVar, tVar2) != aVar) {
                            rVar4 = rVar2;
                            e1Var = u1Var;
                            fVar2 = fVar;
                            r1 = r2;
                            r1.dispose();
                            fVar2.b();
                            e1Var.i(null);
                            rVar4.A();
                            return g00.b0.a;
                        }
                    }
                    return aVar;
                } catch (Throwable th3) {
                    th = th3;
                    rVar6 = rVar5;
                    r3 = u1Var;
                    r4 = fVar;
                    r2 = pVar;
                    r2.dispose();
                    r4.b();
                    r3.i(null);
                    rVar6.A();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                u1Var = u1VarY;
                rVar6 = rVar5;
                r3 = u1Var;
                r4 = fVar;
                r2 = pVar;
                r2.dispose();
                r4.b();
                r3.i(null);
                rVar6.A();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            pVar = pVar3;
            rVar5 = x1Var2;
        }
    }

    public static final u0 k0(i20.c1 c1Var, f typeTable) {
        m.e(c1Var, "<this>");
        m.e(typeTable, "typeTable");
        int i = c1Var.C;
        if ((i & 4) == 4) {
            u0 u0Var = c1Var.F;
            m.d(u0Var, "getType(...)");
            return u0Var;
        }
        if ((i & 8) == 8) {
            return typeTable.a(c1Var.G);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter");
    }

    public static final float l(List list, Resources resources) {
        float dimension = 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dimension += resources.getDimension(((Number) it.next()).intValue()) / resources.getDisplayMetrics().density;
        }
        return dimension;
    }

    public static final u0 l0(w0 w0Var, f typeTable) {
        m.e(typeTable, "typeTable");
        int i = w0Var.C;
        if ((i & 4) == 4) {
            u0 u0Var = w0Var.G;
            m.d(u0Var, "getUnderlyingType(...)");
            return u0Var;
        }
        if ((i & 8) == 8) {
            return typeTable.a(w0Var.H);
        }
        throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
    }

    public static i00.i m(i00.i iVar) {
        i00.f fVar = iVar.A;
        fVar.c();
        return fVar.I > 0 ? iVar : i00.i.B;
    }

    public static final List m0(z0 z0Var, f typeTable) {
        m.e(z0Var, "<this>");
        m.e(typeTable, "typeTable");
        List arrayList = z0Var.H;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            List<Integer> list = z0Var.I;
            m.d(list, "getUpperBoundIdList(...)");
            arrayList = new ArrayList(h00.r.q0(list, 10));
            for (Integer num : list) {
                m.b(num);
                arrayList.add(typeTable.a(num.intValue()));
            }
        }
        return arrayList;
    }

    public static final b2.r n(b2.r rVar, boolean z, u00.a onClick) {
        m.e(rVar, "<this>");
        m.e(onClick, "onClick");
        return b2.a.a(rVar, new e1.f(z, onClick, 5));
    }

    public static final u0 n0(i20.c1 c1Var, f typeTable) {
        m.e(c1Var, "<this>");
        m.e(typeTable, "typeTable");
        int i = c1Var.C;
        if ((i & 16) == 16) {
            return c1Var.H;
        }
        if ((i & 32) == 32) {
            return typeTable.a(c1Var.I);
        }
        return null;
    }

    public static b2.r o(b2.r clickableWithoutRipple, boolean z, j3.k kVar, u00.a onClick, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            kVar = null;
        }
        m.e(clickableWithoutRipple, "$this$clickableWithoutRipple");
        m.e(onClick, "onClick");
        return b2.a.a(clickableWithoutRipple, new cz.m(z, kVar, onClick));
    }

    public static final int p(ma.c cVar, String str) {
        m.e(cVar, "<this>");
        int iQ = q(cVar, str);
        if (iQ >= 0) {
            return iQ;
        }
        int iQ2 = q(cVar, "`" + str + '`');
        if (iQ2 >= 0) {
            return iQ2;
        }
        return -1;
    }

    public static final int q(ma.c cVar, String name) {
        m.e(cVar, "<this>");
        m.e(name, "name");
        int columnCount = cVar.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            if (name.equals(cVar.getColumnName(i))) {
                return i;
            }
        }
        return -1;
    }

    public static final Collection r(Collection collection, Collection collection2) {
        m.e(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final int s(w wVar) {
        m.e(wVar, "<this>");
        k10.b bVarF = wVar.getAnnotations().f(o.q);
        if (bVarF == null) {
            return 0;
        }
        s20.g gVar = (s20.g) d0.O(bVarF.b(), g10.p.e);
        m.c(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((s20.k) gVar).a).intValue();
    }

    public static final List t(i20.k kVar, f typeTable) {
        m.e(kVar, "<this>");
        m.e(typeTable, "typeTable");
        List arrayList = kVar.M;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            List<Integer> list = kVar.N;
            m.d(list, "getContextReceiverTypeIdList(...)");
            arrayList = new ArrayList(h00.r.q0(list, 10));
            for (Integer num : list) {
                m.b(num);
                arrayList.add(typeTable.a(num.intValue()));
            }
        }
        return arrayList;
    }

    public static final List u(i20.b0 b0Var, f typeTable) {
        m.e(b0Var, "<this>");
        m.e(typeTable, "typeTable");
        List arrayList = b0Var.L;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            List<Integer> list = b0Var.M;
            m.d(list, "getContextReceiverTypeIdList(...)");
            arrayList = new ArrayList(h00.r.q0(list, 10));
            for (Integer num : list) {
                m.b(num);
                arrayList.add(typeTable.a(num.intValue()));
            }
        }
        return arrayList;
    }

    public static final List v(j0 j0Var, f typeTable) {
        m.e(j0Var, "<this>");
        m.e(typeTable, "typeTable");
        List arrayList = j0Var.L;
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList == null) {
            List<Integer> list = j0Var.M;
            m.d(list, "getContextReceiverTypeIdList(...)");
            arrayList = new ArrayList(h00.r.q0(list, 10));
            for (Integer num : list) {
                m.b(num);
                arrayList.add(typeTable.a(num.intValue()));
            }
        }
        return arrayList;
    }

    public static final long w(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        m.e(inputStream, "<this>");
        byte[] bArr = new byte[i];
        int i2 = inputStream.read(bArr);
        long j = 0;
        while (i2 >= 0) {
            outputStream.write(bArr, 0, i2);
            j += (long) i2;
            i2 = inputStream.read(bArr);
        }
        return j;
    }

    public static final e30.a0 x(g10.i iVar, k10.h hVar, w wVar, List list, ArrayList arrayList, w wVar2, boolean z) {
        j10.e eVarK;
        int i = 0;
        ArrayList arrayList2 = new ArrayList(list.size() + arrayList.size() + (wVar != null ? 1 : 0) + 1);
        ArrayList arrayList3 = new ArrayList(h00.r.q0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(a0.p((w) it.next()));
        }
        arrayList2.addAll(arrayList3);
        n30.l.a(arrayList2, wVar != null ? a0.p(wVar) : null);
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                va.a.k0();
                throw null;
            }
            arrayList2.add(a0.p((w) obj));
            i2 = i3;
        }
        arrayList2.add(a0.p(wVar2));
        int size = list.size() + arrayList.size() + (wVar == null ? 0 : 1);
        if (z) {
            eVarK = iVar.w(size);
        } else {
            n20.e eVar = g10.p.a;
            eVarK = iVar.k("Function" + size);
        }
        k10.h iVar2 = k10.g.a;
        if (wVar != null) {
            n20.c cVar = o.p;
            if (!hVar.d(cVar)) {
                ArrayList arrayListX0 = q.X0(hVar, new k10.j(iVar, cVar, h00.y.A));
                hVar = arrayListX0.isEmpty() ? iVar2 : new k10.i(i, arrayListX0);
            }
        }
        if (!list.isEmpty()) {
            int size2 = list.size();
            n20.c cVar2 = o.q;
            if (!hVar.d(cVar2)) {
                ArrayList arrayListX1 = q.X0(hVar, new k10.j(iVar, cVar2, d0.Q(new g00.k(g10.p.e, new s20.k(size2)))));
                if (!arrayListX1.isEmpty()) {
                    iVar2 = new k10.i(i, arrayListX1);
                }
                hVar = iVar2;
            }
        }
        return e30.c.t(e30.c.E(hVar), eVarK, arrayList2);
    }

    public static void y(d2.d dVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        j3.t tVar;
        j3.s sVar;
        u00.k kVar;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(jKeyAt);
            if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (tVar = (j3.t) dVar.e().b((int) jKeyAt)) != null && (sVar = tVar.a) != null) {
                Object objG = sVar.d.A.g(j3.n.l);
                if (objG == null) {
                    objG = null;
                }
                j3.a aVar = (j3.a) objG;
                if (aVar != null && (kVar = (u00.k) aVar.b) != null) {
                }
            }
        }
    }

    public static boolean z(Context context) {
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null || !display.isHdr() || (hdrCapabilities = display.getHdrCapabilities()) == null) {
            return false;
        }
        for (int i : hdrCapabilities.getSupportedHdrTypes()) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }
}
