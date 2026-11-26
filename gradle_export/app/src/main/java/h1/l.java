package h1;

import a40.u1;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextPaint;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.common.e2;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.protobuf.RuntimeVersion;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.WeakHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CancellationException;
import k9.b2;
import k9.b4;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;
import org.json.JSONObject;
import x.r1;
import z4.j1;

public class l implements a8.j, n.a, e7.c, kh.q, l1.d, l60.g, z4.r, o3.b, xf.a, p1.k0, f30.b, w7.n {
    public Object A;
    public Object B;

    public l(int i10) {
        switch (i10) {
            case 3:
                this.A = new HashMap();
                this.B = i7.b.f7221b;
                break;
            case 9:
                r1 r1Var = x.c.f16258k;
                Float fValueOf = Float.valueOf(0.0f);
                this.B = new x.j(r1Var, fValueOf, (x.o) r1Var.f16363a.invoke(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
                break;
            case 12:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.A = byteArrayOutputStream;
                this.B = new DataOutputStream(byteArrayOutputStream);
                break;
            case 17:
                this.A = new Object();
                this.B = new LinkedHashMap();
                break;
            case 27:
                this.A = new Object();
                this.B = new ArrayBlockingQueue(512);
                break;
            default:
                this.A = h00.d0.R(new g00.k[]{new g00.k(hd.b.A, new hd.a()), new g00.k(hd.b.B, new hd.a()), new g00.k(hd.b.C, new hd.a()), new g00.k(hd.b.D, new hd.a())});
                break;
        }
    }

    public l(Object obj) {
        this.A = obj;
    }

    public l(Object obj, Object obj2) {
        this.B = obj;
        this.A = obj2;
    }

    public l(Object obj, Object obj2, boolean z10) {
        this.A = obj;
        this.B = obj2;
    }

    public l(String str, Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
        }
        this.A = str;
        this.B = bundle;
    }

    public l(HashMap map, f30.c cVar) {
        kotlin.jvm.internal.m.e(cVar, "equalityAxioms");
        this.A = map;
        this.B = cVar;
    }

    public l(od.b bVar) throws IOException {
        String property;
        this.A = bVar;
        File file = bVar.f11932d;
        c7.i.y(file);
        k9.x0 x0Var = new k9.x0(file, bVar.f11933e, bVar.f11934f);
        this.B = x0Var;
        File file2 = (File) x0Var.D;
        if (file2.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file2);
                try {
                    ((Properties) x0Var.C).load(fileInputStream);
                    fileInputStream.close();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ta.c0.C(fileInputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                file2.delete();
                cd.b bVar2 = (cd.b) x0Var.B;
                if (bVar2 != null) {
                    bVar2.a("Failed to load property file with path " + file2.getAbsolutePath() + ", error stacktrace: " + qd.s0.s0(th4));
                }
                file2.getParentFile().mkdirs();
                file2.createNewFile();
            }
        } else {
            file2.getParentFile().mkdirs();
            file2.createNewFile();
        }
        k9.x0 x0Var2 = (k9.x0) this.B;
        String str = ((od.b) this.A).f11930b;
        if (!((str == null || (property = ((Properties) x0Var2.C).getProperty("api_key", null)) == null) ? true : property.equals(str))) {
            List listS = va.a.S("user_id", "device_id", "api_key", "experiment_api_key");
            x0Var2.getClass();
            Iterator it = listS.iterator();
            while (it.hasNext()) {
                ((Properties) x0Var2.C).remove((String) it.next());
            }
            x0Var2.Q();
        }
        if (str != null) {
            x0Var2.M("api_key", str);
        }
    }

    public static void I0(l lVar, i7.b bVar) {
        lVar.getClass();
        for (Map.Entry entry : new HashMap((HashMap) lVar.A).entrySet()) {
            if (entry.getKey() != null) {
                throw new ClassCastException();
            }
            List list = (List) entry.getValue();
            if (!N0(bVar, list).equals(N0((i7.b) lVar.B, list))) {
                throw null;
            }
        }
        lVar.B = bVar;
    }

    public static i7.b N0(i7.b bVar, List list) {
        bVar.getClass();
        Map map = bVar.f7222a;
        HashMap map2 = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                map2.remove(str);
            }
        }
        return new i7.b(map2);
    }

    public int A(h30.g gVar) {
        return f30.g.c(gVar);
    }

    public boolean A0(e30.z0 z0Var) {
        kotlin.jvm.internal.m.e(z0Var, "<this>");
        return f30.g.J(y0(z0Var)) != f30.g.J(v0(z0Var));
    }

    @Override
    public j1 B(View view, j1 j1Var) {
        boolean z10;
        androidx.media3.common.q qVar = (androidx.media3.common.q) this.A;
        a8.d dVar = (a8.d) this.B;
        int i10 = dVar.f238a;
        int i11 = dVar.f239b;
        int i12 = dVar.f240c;
        z4.g1 g1Var = j1Var.f17202a;
        q4.b bVarI = g1Var.i(519);
        q4.b bVarI2 = g1Var.i(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) qVar.C;
        int i13 = bVarI.f12756b;
        int i14 = bVarI.f12757c;
        int i15 = bVarI.f12755a;
        bottomSheetBehavior.f4133w = i13;
        boolean z11 = true;
        boolean z12 = view.getLayoutDirection() == 1;
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z13 = bottomSheetBehavior.f4125o;
        if (z13) {
            int iA = j1Var.a();
            bottomSheetBehavior.f4132v = iA;
            paddingBottom = iA + i12;
        }
        if (bottomSheetBehavior.f4126p) {
            paddingLeft = (z12 ? i11 : i10) + i15;
        }
        if (bottomSheetBehavior.f4127q) {
            if (!z12) {
                i10 = i11;
            }
            paddingRight = i10 + i14;
        }
        int i16 = paddingRight;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!bottomSheetBehavior.f4129s || marginLayoutParams.leftMargin == i15) {
            z10 = false;
        } else {
            marginLayoutParams.leftMargin = i15;
            z10 = true;
        }
        if (bottomSheetBehavior.f4130t && marginLayoutParams.rightMargin != i14) {
            marginLayoutParams.rightMargin = i14;
            z10 = true;
        }
        if (bottomSheetBehavior.f4131u) {
            int i17 = marginLayoutParams.topMargin;
            int i18 = bVarI.f12756b;
            if (i17 != i18) {
                marginLayoutParams.topMargin = i18;
            } else {
                z11 = z10;
            }
        } else {
            z11 = z10;
        }
        if (z11) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), i16, paddingBottom);
        boolean z14 = qVar.B;
        if (z14) {
            bottomSheetBehavior.m = bVarI2.f12758d;
        }
        if (!z13 && !z14) {
            return j1Var;
        }
        bottomSheetBehavior.R();
        return j1Var;
    }

    public h30.j B0(h30.h hVar) {
        return f30.g.d(hVar);
    }

    public boolean C(h30.l lVar) {
        return f30.g.H(lVar);
    }

    public h30.p C0(h30.k kVar) {
        return f30.g.w(kVar);
    }

    public h30.p D(h30.m mVar) {
        return f30.g.x(mVar);
    }

    public h30.k D0(h30.g gVar) {
        return f30.g.i(gVar);
    }

    public int E(h30.j jVar) {
        kotlin.jvm.internal.m.e(jVar, "<this>");
        if (jVar instanceof h30.h) {
            return f30.g.c((h30.g) jVar);
        }
        if (jVar instanceof h30.a) {
            return ((h30.a) jVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + jVar + ", " + kotlin.jvm.internal.a0.a.b(jVar.getClass())).toString());
    }

    public h30.g E0(h30.k kVar) {
        return f30.g.u(this, kVar);
    }

    public void F(h30.h hVar) {
        f30.g.P(hVar);
    }

    public h30.h F0(h30.h hVar) {
        h30.b bVar = h30.b.A;
        return f30.g.j(hVar);
    }

    public Collection G(h30.h hVar) {
        return f30.g.V(this, hVar);
    }

    public e30.a0 G0(e30.w wVar) {
        return f30.g.h(wVar);
    }

    public boolean H(h30.h hVar) {
        kotlin.jvm.internal.m.e(hVar, "<this>");
        return f30.g.f(hVar) != null;
    }

    @Override
    public a8.i H0(a8.r rVar, long j9) {
        int iA;
        long position = rVar.getPosition();
        int iMin = (int) Math.min(20000L, rVar.getLength() - position);
        e7.u uVar = (e7.u) this.B;
        uVar.K(iMin);
        rVar.a(0, iMin, uVar.f5182a);
        int i10 = -1;
        int i11 = -1;
        long j10 = -9223372036854775807L;
        while (uVar.a() >= 4) {
            if (f8.b.a(uVar.f5183b, uVar.f5182a) != 442) {
                uVar.O(1);
            } else {
                uVar.O(4);
                long jC = h9.y.c(uVar);
                if (jC != -9223372036854775807L) {
                    long jB = ((e7.e0) this.A).b(jC);
                    if (jB > j9) {
                        return j10 == -9223372036854775807L ? new a8.i(-1, jB, position) : new a8.i(0, -9223372036854775807L, position + ((long) i11));
                    }
                    j10 = jB;
                    if (100000 + j10 > j9) {
                        return new a8.i(0, -9223372036854775807L, position + ((long) uVar.f5183b));
                    }
                    i11 = uVar.f5183b;
                }
                int i12 = uVar.f5184c;
                if (uVar.a() >= 10) {
                    uVar.O(9);
                    int iA2 = uVar.A() & 7;
                    if (uVar.a() >= iA2) {
                        uVar.O(iA2);
                        if (uVar.a() >= 4) {
                            if (f8.b.a(uVar.f5183b, uVar.f5182a) != 443) {
                                while (uVar.a() >= 4) {
                                    iA = f8.b.a(uVar.f5183b, uVar.f5182a);
                                    if (iA == 442) {
                                        break;
                                    }
                                    break;
                                }
                            }
                            uVar.O(4);
                            int iH = uVar.H();
                            if (uVar.a() < iH) {
                                uVar.N(i12);
                            } else {
                                uVar.O(iH);
                                while (uVar.a() >= 4) {
                                    iA = f8.b.a(uVar.f5183b, uVar.f5182a);
                                    if (iA == 442 || iA == 441 || (iA >>> 8) != 1) {
                                        break;
                                    }
                                    uVar.O(4);
                                    if (uVar.a() < 2) {
                                        uVar.N(i12);
                                        break;
                                    }
                                    uVar.N(Math.min(uVar.f5184c, uVar.f5183b + uVar.H()));
                                }
                            }
                        } else {
                            uVar.N(i12);
                        }
                    } else {
                        uVar.N(i12);
                    }
                } else {
                    uVar.N(i12);
                }
                i10 = uVar.f5183b;
            }
        }
        return j10 != -9223372036854775807L ? new a8.i(-2, j10, position + ((long) i10)) : a8.i.f276d;
    }

    public h30.f I(h30.g gVar) {
        return f30.g.g(gVar);
    }

    public boolean J(h30.l lVar) {
        return f30.g.B(lVar);
    }

    public void J0(hd.c cVar) {
        cVar.a(P0());
        hd.a aVar = (hd.a) this.A.get(cVar.getType());
        if (aVar != null) {
            aVar.f7039a.add(cVar);
        }
    }

    public h30.l K(h30.g gVar) {
        kotlin.jvm.internal.m.e(gVar, "<this>");
        h30.h hVarH = f30.g.h(gVar);
        if (hVarH == null) {
            hVarH = y0(gVar);
        }
        return f30.g.a0(hVarH);
    }

    public gd.a K0(hd.b bVar, gd.a aVar) {
        hd.a aVar2 = (hd.a) this.A.get(bVar);
        if (aVar == null) {
            return aVar;
        }
        if (aVar2 == null) {
            return null;
        }
        for (hd.c cVar : aVar2.f7039a) {
            if (aVar != null) {
                if (cVar instanceof jd.a) {
                    try {
                        jd.a aVar3 = (jd.a) cVar;
                        l lVar = aVar3.B;
                        if (aVar3.D) {
                            gd.a aVarK0 = lVar.K0(hd.b.B, lVar.K0(hd.b.A, aVar));
                            if (aVarK0 != null) {
                                if (aVarK0 instanceof gd.b) {
                                    aVar3.c((gd.b) aVarK0);
                                } else {
                                    aVar3.c(aVarK0);
                                }
                            }
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                } else {
                    aVar = cVar instanceof jd.a ? null : cVar.b(aVar);
                }
            }
        }
        return aVar;
    }

    @Override
    public boolean L(n.b bVar, Menu menu) {
        ViewGroup viewGroup = ((k.b0) this.B).Y;
        WeakHashMap weakHashMap = z4.j0.f17198a;
        viewGroup.requestApplyInsets();
        return ((n.a) this.A).L(bVar, menu);
    }

    public void L0(j3.a0 a0Var) {
    }

    @Override
    public Object M(Task task) {
        Bundle bundle;
        oe.b bVar = (oe.b) this.A;
        Bundle bundle2 = (Bundle) this.B;
        bVar.getClass();
        return (task.o() && (bundle = (Bundle) task.k()) != null && bundle.containsKey("google.messenger")) ? bVar.a(bundle2).p(oe.h.C, oe.d.D) : task;
    }

    public void M0() {
        String str = (String) this.A;
        try {
            ui.b bVar = (ui.b) this.B;
            bVar.getClass();
            new File((File) bVar.D, str).createNewFile();
        } catch (IOException e3) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e3);
        }
    }

    @Override
    public int N(int i10) {
        TextPaint textPaint = (TextPaint) this.B;
        CharSequence charSequence = (CharSequence) this.A;
        int textRunCursor = textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 0);
        if (textRunCursor == -1 || ((TextPaint) this.B).getTextRunCursor(charSequence, 0, charSequence.length(), false, textRunCursor, 0) == -1) {
            return -1;
        }
        return textRunCursor;
    }

    @Override
    public kh.v O(Uri uri) {
        Uri uri2;
        a1.i iVar = (a1.i) this.B;
        if (iVar == null || (uri2 = (Uri) iVar.C) == null || !uri2.equals(uri)) {
            kh.v vVarO = ((g7.g) this.A).O(uri);
            this.B = new a1.i(uri, vVarO);
            return vVarO;
        }
        kh.v vVar = (kh.v) ((a1.i) this.B).D;
        vVar.getClass();
        return vVar;
    }

    public byte[] O0(l8.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.B;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.A;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f10115a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.f10116b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f10117c);
            dataOutputStream.writeLong(aVar.f10118d);
            dataOutputStream.write(aVar.f10119e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override
    public int P(int i10) {
        TextPaint textPaint = (TextPaint) this.B;
        CharSequence charSequence = (CharSequence) this.A;
        int textRunCursor = textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 2);
        if (textRunCursor == -1 || ((TextPaint) this.B).getTextRunCursor(charSequence, 0, charSequence.length(), false, textRunCursor, 2) == -1) {
            return -1;
        }
        return textRunCursor;
    }

    public rc.c P0() {
        rc.c cVar = (rc.c) this.B;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.m.k("amplitude");
        throw null;
    }

    public h30.k Q(h30.g gVar, int i10) {
        return f30.g.p(gVar, i10);
    }

    public File Q0() {
        if (((File) this.A) == null) {
            synchronized (this) {
                try {
                    if (((File) this.A) == null) {
                        bi.g gVar = (bi.g) this.B;
                        gVar.a();
                        this.A = new File(gVar.f2531a.getFilesDir(), "PersistedInstallation." + ((bi.g) this.B).d() + ".json");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return (File) this.A;
    }

    public h30.m R(h30.l lVar, int i10) {
        return f30.g.r(lVar, i10);
    }

    public void R0(kj.b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f9692a);
            jSONObject.put("Status", e4.f.b(bVar.f9693b));
            jSONObject.put("AuthToken", bVar.f9694c);
            jSONObject.put("RefreshToken", bVar.f9695d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f9697f);
            jSONObject.put("ExpiresInSecs", bVar.f9696e);
            jSONObject.put("FisError", bVar.f9698g);
            bi.g gVar = (bi.g) this.B;
            gVar.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f2531a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(Q0())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public h30.h S(h30.g gVar) {
        return f30.g.h(gVar);
    }

    public boolean S0(l9.h0 h0Var, String str) {
        Context context = (Context) this.A;
        int i10 = h0Var.f10151b;
        if (i10 < 0) {
            return context.getPackageManager().checkPermission(str, h0Var.f10150a) == 0;
        }
        return context.checkPermission(str, i10, h0Var.f10152c) == 0;
    }

    public boolean T(h30.h hVar) {
        return f30.g.H(f30.g.a0(hVar));
    }

    public od.a T0() {
        k9.x0 x0Var = (k9.x0) this.B;
        return new od.a(((Properties) x0Var.C).getProperty("user_id", null), ((Properties) x0Var.C).getProperty("device_id", null));
    }

    @Override
    public boolean U(n.b bVar, MenuItem menuItem) {
        return ((n.a) this.A).U(bVar, menuItem);
    }

    public e30.l0 U0() {
        return new e30.l0(true, true, this, f30.e.a, f30.f.a);
    }

    public h30.k V(h30.j jVar, int i10) {
        kotlin.jvm.internal.m.e(jVar, "<this>");
        if (jVar instanceof h30.i) {
            return f30.g.p((h30.g) jVar, i10);
        }
        if (jVar instanceof h30.a) {
            Object obj = ((h30.a) jVar).get(i10);
            kotlin.jvm.internal.m.d(obj, "get(...)");
            return (h30.k) obj;
        }
        throw new IllegalStateException(("unknown type argument list type: " + jVar + ", " + kotlin.jvm.internal.a0.a.b(jVar.getClass())).toString());
    }

    public h30.i V0(h30.h hVar) {
        e30.a0 a0Var;
        e30.l lVarF = f30.g.f(hVar);
        return (lVarF == null || (a0Var = lVarF.B) == null) ? (h30.i) hVar : a0Var;
    }

    public boolean W(h30.g gVar) {
        kotlin.jvm.internal.m.e(gVar, "<this>");
        return !kotlin.jvm.internal.m.a(f30.g.a0(y0(gVar)), f30.g.a0(v0(gVar)));
    }

    public kj.b W0() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(Q0());
            while (true) {
                try {
                    int i10 = fileInputStream.read(bArr, 0, 16384);
                    if (i10 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i11 = kj.b.f9691h;
        byte b7 = (byte) (((byte) (0 | 2)) | 1);
        int i12 = e4.f.c(5)[iOptInt];
        if (i12 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        byte b10 = (byte) (((byte) (b7 | 2)) | 1);
        if (b10 == 3 && i12 != 0) {
            return new kj.b(strOptString, i12, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        StringBuilder sb2 = new StringBuilder();
        if (i12 == 0) {
            sb2.append(" registrationStatus");
        }
        if ((b10 & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((b10 & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(oi.k.j("Missing required properties:", sb2));
    }

    public h30.l X(h30.h hVar) {
        return f30.g.a0(hVar);
    }

    public void X0(String str) {
        k9.x0 x0Var = (k9.x0) this.B;
        if (str == null) {
            str = RuntimeVersion.SUFFIX;
        }
        x0Var.M("device_id", str);
    }

    public boolean Y(h30.h hVar, h30.h hVar2) {
        return f30.g.A(hVar, hVar2);
    }

    public void Y0(String str) {
        k9.x0 x0Var = (k9.x0) this.B;
        if (str == null) {
            str = RuntimeVersion.SUFFIX;
        }
        x0Var.M("user_id", str);
    }

    public h30.g Z(ArrayList arrayList) throws NoWhenBranchMatchedException {
        e30.a0 a0Var;
        int size = arrayList.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (e30.z0) h00.q.c1(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            e30.a0 a0Var2 = (e30.z0) it.next();
            z10 = z10 || e30.c.k(a0Var2);
            if (a0Var2 instanceof e30.a0) {
                a0Var = a0Var2;
            } else {
                if (!(a0Var2 instanceof e30.q)) {
                    throw new NoWhenBranchMatchedException();
                }
                a0Var = ((e30.q) a0Var2).B;
                z11 = true;
            }
            arrayList2.add(a0Var);
        }
        if (z10) {
            return g30.l.c(g30.k.X, new String[]{arrayList.toString()});
        }
        f30.t tVar = f30.t.a;
        if (!z11) {
            return tVar.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(h00.r.q0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(e30.c.G((e30.z0) it2.next()));
        }
        return e30.c.f(tVar.b(arrayList2), tVar.b(arrayList3));
    }

    public void Z0(int i10) {
        ((l1.f1) this.B).i(i10);
    }

    public e30.a0 a(h30.f fVar) {
        return f30.g.c0(fVar);
    }

    public h30.h m25a(h30.f fVar) {
        return f30.g.c0(fVar);
    }

    @Override
    public List a0(Integer num) {
        List listA0 = ((p1.k0) this.A).a0(null);
        o1.k kVar = (o1.k) this.B;
        int i10 = kVar.f11509v;
        return i10 < 0 ? listA0 : h00.q.Y0(listA0, a10.h0.l(kVar, num, i10, Integer.valueOf(kVar.G(kVar.f11491b, i10))));
    }

    public void a1() {
        u1 u1Var = (u1) this.A;
        if (u1Var != null) {
            u1Var.i((CancellationException) null);
        }
        this.B = new x.j(x.c.f16258k, Float.valueOf(0.0f), null, 60);
    }

    public e30.a0 b(h30.h hVar) {
        return f30.g.d0(hVar, true);
    }

    public h30.h m26b(h30.h hVar) {
        return f30.g.d0(hVar, false);
    }

    public boolean b0(h30.l lVar, h30.l lVar2) {
        kotlin.jvm.internal.m.e(lVar, "c1");
        kotlin.jvm.internal.m.e(lVar2, "c2");
        if (!(lVar instanceof e30.m0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!(lVar2 instanceof e30.m0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (f30.g.b(lVar, lVar2)) {
            return true;
        }
        e30.m0 m0Var = (e30.m0) lVar;
        e30.m0 m0Var2 = (e30.m0) lVar2;
        Map map = (Map) this.A;
        if (((f30.c) this.B).c(m0Var, m0Var2)) {
            return true;
        }
        if (map == null) {
            return false;
        }
        e30.m0 m0Var3 = (e30.m0) map.get(m0Var);
        e30.m0 m0Var4 = (e30.m0) map.get(m0Var2);
        if (m0Var3 == null || !m0Var3.equals(m0Var2)) {
            return m0Var4 != null && m0Var4.equals(m0Var);
        }
        return true;
    }

    public void b1(float f3, y3.c cVar, a40.z zVar) {
        if (f3 <= cVar.A0(l0.x0.f9805a)) {
            return;
        }
        z1.f fVarF = z1.q.f();
        k00.c cVar2 = null;
        u00.k kVarE = fVarF != null ? fVarF.e() : null;
        z1.f fVarK = z1.q.k(fVarF);
        try {
            float fFloatValue = ((Number) ((x.j) this.B).B.getValue()).floatValue();
            u1 u1Var = (u1) this.A;
            if (u1Var != null) {
                u1Var.i((CancellationException) null);
            }
            x.j jVar = (x.j) this.B;
            if (jVar.F) {
                this.B = x.c.l(jVar, fFloatValue - f3, 0.0f, 30);
            } else {
                this.B = new x.j(x.c.f16258k, Float.valueOf(-f3), null, 60);
            }
            this.A = a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new a1.a0(this, cVar2, 29), 3);
        } finally {
            z1.q.n(fVarF, fVarK, kVarE);
        }
    }

    public e30.a0 c(h30.f fVar) {
        return f30.g.R(fVar);
    }

    public h30.h m27c(h30.f fVar) {
        return f30.g.R(fVar);
    }

    @Override
    public int c0(int i10) {
        TextPaint textPaint = (TextPaint) this.B;
        CharSequence charSequence = (CharSequence) this.A;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 2);
    }

    @Override
    public void cancel() {
        if (((v1.a) this.B).compareAndSet(1, 1)) {
            return;
        }
        ((d0.g) this.A).invoke();
    }

    public g10.i d() {
        throw new UnsupportedOperationException("Not supported");
    }

    public boolean d0(h30.h hVar) {
        kotlin.jvm.internal.m.e(hVar, "<this>");
        return f30.g.K(K(hVar)) && !f30.g.L(hVar);
    }

    public boolean e(h30.g gVar) {
        return f30.g.J(gVar);
    }

    public int e0(h30.l lVar) {
        return f30.g.U(lVar);
    }

    public boolean f(h30.g gVar) {
        kotlin.jvm.internal.m.e(gVar, "$receiver");
        return gVar instanceof f20.g;
    }

    @Override
    public int f0(int i10) {
        TextPaint textPaint = (TextPaint) this.B;
        CharSequence charSequence = (CharSequence) this.A;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i10, 0);
    }

    @Override
    public boolean g(n.b bVar, Menu menu) {
        return ((n.a) this.A).g(bVar, menu);
    }

    public boolean g0(h30.k kVar) {
        return f30.g.O(kVar);
    }

    public h30.g h(h30.d dVar) {
        return f30.g.S(dVar);
    }

    @Override
    public void h0(Throwable th2) {
        ((kh.b0) this.A).l(new k9.q(-1, SystemClock.elapsedRealtime(), (k9.e1) this.B, new b4("no error message provided", -1, Bundle.EMPTY), null, 4));
        e7.a.e("MediaSessionImpl", "Failed fetching recent media item at boot time: " + th2.getMessage(), th2);
    }

    public void i(h30.h hVar) {
        f30.g.Q(hVar);
    }

    public boolean i0(h30.g gVar) {
        kotlin.jvm.internal.m.e(gVar, "<this>");
        e30.a0 a0VarH = f30.g.h(gVar);
        return (a0VarH != null ? f30.g.f(a0VarH) : null) != null;
    }

    public h30.b j(h30.d dVar) {
        return f30.g.k(dVar);
    }

    public boolean j0(h30.l lVar) {
        return f30.g.K(lVar);
    }

    public h30.k k(h30.c cVar) {
        return f30.g.W(cVar);
    }

    public boolean k0(h30.d dVar) {
        return f30.g.N(dVar);
    }

    public void l(l60.d dVar, l60.o0 o0Var) {
        ((l60.n) this.B).A.execute(new ab.e(this, (l60.g) this.A, o0Var, 18));
    }

    public h30.k l0(h30.h hVar, int i10) {
        if (i10 < 0 || i10 >= f30.g.c(hVar)) {
            return null;
        }
        return f30.g.p(hVar, i10);
    }

    public e30.c m(h30.h hVar) {
        return f30.g.Y(this, hVar);
    }

    public h30.d m0(h30.i iVar) {
        return f30.g.e(this, iVar);
    }

    public e30.z0 n(h30.i iVar, h30.i iVar2) {
        return f30.g.m(this, iVar, iVar2);
    }

    @Override
    public void n0(n.b bVar) {
        ((n.a) this.A).n0(bVar);
        k.b0 b0Var = (k.b0) this.B;
        if (b0Var.U != null) {
            b0Var.J.getDecorView().removeCallbacks(b0Var.V);
        }
        if (b0Var.T != null) {
            z4.n0 n0Var = b0Var.W;
            if (n0Var != null) {
                n0Var.b();
            }
            z4.n0 n0VarB = z4.j0.b(b0Var.T);
            n0VarB.a(0.0f);
            b0Var.W = n0VarB;
            n0VarB.d(new k.t(this, 2));
        }
        b0Var.L.onSupportActionModeFinished(b0Var.S);
        b0Var.S = null;
        ViewGroup viewGroup = b0Var.Y;
        WeakHashMap weakHashMap = z4.j0.f17198a;
        viewGroup.requestApplyInsets();
        b0Var.I();
    }

    public boolean o(h30.l lVar) {
        return f30.g.C(lVar);
    }

    @Override
    public kh.v o0(byte[] bArr) {
        byte[] bArr2;
        a1.i iVar = (a1.i) this.B;
        if (iVar == null || (bArr2 = (byte[]) iVar.B) == null || !Arrays.equals(bArr2, bArr)) {
            kh.v vVarO0 = ((g7.g) this.A).o0(bArr);
            this.B = new a1.i(bArr, vVarO0);
            return vVarO0;
        }
        kh.v vVar = (kh.v) ((a1.i) this.B).D;
        vVar.getClass();
        return vVar;
    }

    @Override
    public void onSuccess(Object obj) {
        b2 b2Var = (b2) obj;
        k9.e1 e1Var = (k9.e1) this.B;
        kh.b0 b0Var = (kh.b0) this.A;
        fh.t0 t0Var = b2Var.f9232a;
        if (t0Var.isEmpty()) {
            b0Var.l(new k9.q(-2, SystemClock.elapsedRealtime(), e1Var, new b4("no error message provided", -2, Bundle.EMPTY), null, 4));
        } else {
            b0Var.l(k9.q.c(fh.t0.s((androidx.media3.common.q0) t0Var.get(Math.max(0, Math.min(b2Var.f9233b, t0Var.size() - 1)))), e1Var));
        }
    }

    @Override
    public Object p(Uri uri, g7.h hVar) {
        long j9;
        m7.c cVar = (m7.c) ((m7.e) this.A).p(uri, hVar);
        List list = (List) this.B;
        if (list == null || list.isEmpty()) {
            return cVar;
        }
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new e2(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= cVar.m.size()) {
                break;
            }
            if (((e2) linkedList.peek()).A != i10) {
                long jB = cVar.b(i10);
                if (jB != -9223372036854775807L) {
                    j10 += jB;
                }
            } else {
                m7.h hVarA = cVar.a(i10);
                List list2 = hVarA.f10608c;
                e2 e2Var = (e2) linkedList.poll();
                int i11 = e2Var.A;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = e2Var.B;
                    m7.a aVar = (m7.a) list2.get(i12);
                    List list3 = aVar.f10572c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((m7.m) list3.get(e2Var.C));
                        e2Var = (e2) linkedList.poll();
                        if (e2Var.A != i11) {
                            break;
                        }
                    } while (e2Var.B == i12);
                    j9 = j10;
                    arrayList2.add(new m7.a(aVar.f10570a, aVar.f10571b, arrayList3, aVar.f10573d, aVar.f10574e, aVar.f10575f));
                    if (e2Var.A != i11) {
                        break;
                    }
                    j10 = j9;
                }
                linkedList.addFirst(e2Var);
                arrayList.add(new m7.h(hVarA.f10606a, hVarA.f10607b - j9, arrayList2, hVarA.f10609d));
                j10 = j9;
            }
            i10++;
        }
        long j11 = j10;
        long j12 = cVar.f10581b;
        return new m7.c(cVar.f10580a, j12 != -9223372036854775807L ? j12 - j11 : -9223372036854775807L, cVar.f10582c, cVar.f10583d, cVar.f10584e, cVar.f10585f, cVar.f10586g, cVar.f10587h, cVar.l, cVar.f10588i, cVar.f10589j, cVar.f10590k, arrayList);
    }

    public boolean p0(h30.l lVar) {
        return f30.g.E(lVar);
    }

    public boolean q(h30.l lVar) {
        return f30.g.D(lVar);
    }

    public void q0(h30.g gVar) {
        kotlin.jvm.internal.m.e(gVar, "<this>");
        f30.g.g(gVar);
    }

    public boolean r(h30.g gVar) {
        kotlin.jvm.internal.m.e(gVar, "<this>");
        e30.a0 a0VarH = f30.g.h(gVar);
        return (a0VarH != null ? f30.g.e(this, V0(a0VarH)) : null) != null;
    }

    public boolean r0(h30.d dVar) {
        return dVar instanceof r20.a;
    }

    public h30.g s(h30.g gVar) {
        return f30.g.T(gVar);
    }

    public void s0(h30.h hVar, h30.l lVar) {
    }

    public boolean t(h30.g gVar) {
        return f30.g.F(gVar);
    }

    public Collection t0(h30.l lVar) {
        return f30.g.Z(lVar);
    }

    public h30.d u(h30.h hVar) {
        return f30.g.e(this, V0(hVar));
    }

    @Override
    public boolean u0() {
        return ((p1.k0) this.A).u0();
    }

    public boolean v(h30.l lVar) {
        return f30.g.I(lVar);
    }

    public h30.h v0(h30.g gVar) {
        e30.a0 a0VarC0;
        kotlin.jvm.internal.m.e(gVar, "<this>");
        e30.q qVarG = f30.g.g(gVar);
        if (qVarG != null && (a0VarC0 = f30.g.c0(qVarG)) != null) {
            return a0VarC0;
        }
        e30.a0 a0VarH = f30.g.h(gVar);
        kotlin.jvm.internal.m.b(a0VarH);
        return a0VarH;
    }

    public h30.c w(h30.d dVar) {
        return f30.g.b0(dVar);
    }

    public void w0(l60.d dVar, Throwable th2) {
        ((l60.n) this.B).A.execute(new ab.e(this, (l60.g) this.A, th2, 19));
    }

    public h30.g x(h30.g gVar) {
        return f30.g.e0(this, gVar);
    }

    @Override
    public kh.v x0(androidx.media3.common.t0 t0Var) {
        Uri uri;
        byte[] bArr;
        a1.i iVar = (a1.i) this.B;
        if (iVar != null && (((uri = (Uri) iVar.C) != null && uri.equals(t0Var.m)) || ((bArr = (byte[]) iVar.B) != null && Arrays.equals(bArr, t0Var.f1637k)))) {
            kh.v vVar = (kh.v) ((a1.i) this.B).D;
            vVar.getClass();
            return vVar;
        }
        kh.v vVarX0 = ((g7.g) this.A).x0(t0Var);
        if (vVarX0 == null) {
            return null;
        }
        this.B = new a1.i(t0Var, vVarX0);
        return vVarX0;
    }

    public boolean y(h30.h hVar) {
        kotlin.jvm.internal.m.e(hVar, "<this>");
        return f30.g.C(f30.g.a0(hVar));
    }

    public h30.h y0(h30.g gVar) {
        e30.a0 a0VarR;
        kotlin.jvm.internal.m.e(gVar, "<this>");
        e30.q qVarG = f30.g.g(gVar);
        if (qVarG != null && (a0VarR = f30.g.R(qVarG)) != null) {
            return a0VarR;
        }
        e30.a0 a0VarH = f30.g.h(gVar);
        kotlin.jvm.internal.m.b(a0VarH);
        return a0VarH;
    }

    public boolean z(h30.m mVar, h30.l lVar) {
        return f30.g.z(mVar, lVar);
    }

    @Override
    public void z0() {
        e7.u uVar = (e7.u) this.B;
        byte[] bArr = e7.i0.f5137b;
        uVar.getClass();
        uVar.L(bArr.length, bArr);
    }
}
