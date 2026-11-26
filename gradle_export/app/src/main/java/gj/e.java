package gj;

import a8.d0;
import a8.l0;
import a8.p;
import a8.s;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.play_billing.e4;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.mchutov.quranify.player.presentation.service.auto.art.AutoArtContentProvider;
import e7.i0;
import g00.k;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import k50.l;
import k50.z;
import kotlin.jvm.internal.m;
import m3.h0;
import m3.q0;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import sd.y1;
import w7.n;
import y1.j;

public final class e implements k00.h, s, fd.e, j, r, fj.a, ii.e, k.b, n, xf.f, ud.e {
    public static final e B = new e(12);
    public static final e C = new e(13);
    public static e D;
    public final int A;

    public e(int i10) {
        this.A = i10;
    }

    public static final String d(byte[] bArr, byte[][] bArr2, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        byte[] bArr3 = PublicSuffixDatabase.e;
        int length = bArr.length;
        int i14 = 0;
        while (i14 < length) {
            int i15 = (i14 + length) / 2;
            while (i15 > -1 && bArr[i15] != 10) {
                i15--;
            }
            int i16 = i15 + 1;
            int i17 = 1;
            while (true) {
                i11 = i16 + i17;
                if (bArr[i11] == 10) {
                    break;
                }
                i17++;
            }
            int i18 = i11 - i16;
            int i19 = i10;
            boolean z11 = false;
            int i20 = 0;
            int i21 = 0;
            while (true) {
                if (z11) {
                    i12 = 46;
                    z10 = false;
                } else {
                    byte b7 = bArr2[i19][i20];
                    byte[] bArr4 = y40.b.a;
                    int i22 = b7 & 255;
                    z10 = z11;
                    i12 = i22;
                }
                byte b10 = bArr[i16 + i21];
                byte[] bArr5 = y40.b.a;
                i13 = i12 - (b10 & 255);
                if (i13 != 0) {
                    break;
                }
                i21++;
                i20++;
                if (i21 == i18) {
                    break;
                }
                if (bArr2[i19].length != i20) {
                    z11 = z10;
                } else {
                    if (i19 == bArr2.length - 1) {
                        break;
                    }
                    i19++;
                    i20 = -1;
                    z11 = true;
                }
            }
            if (i13 >= 0) {
                if (i13 <= 0) {
                    int i23 = i18 - i21;
                    int length2 = bArr2[i19].length - i20;
                    int length3 = bArr2.length;
                    for (int i24 = i19 + 1; i24 < length3; i24++) {
                        length2 += bArr2[i24].length;
                    }
                    if (length2 >= i23) {
                        if (length2 <= i23) {
                            Charset charset = StandardCharsets.UTF_8;
                            m.d(charset, "UTF_8");
                            return new String(bArr, i16, i18, charset);
                        }
                    }
                }
                i14 = i11 + 1;
            }
            length = i15;
        }
        return null;
    }

    public static File e(Context context, String str) {
        int i10 = AutoArtContentProvider.A;
        File file = new File(context.getCacheDir(), "auto_art");
        file.mkdirs();
        return new File(file, x5.m(str, "_v1", ".png"));
    }

    public static Uri g(Context context, String str, k... kVarArr) {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("content").authority(context.getPackageName() + ".autoart").appendPath(str);
        for (k kVar : kVarArr) {
            builderAppendPath.appendQueryParameter((String) kVar.A, (String) kVar.B);
        }
        Uri uriBuild = builderAppendPath.build();
        m.d(uriBuild, "build(...)");
        return uriBuild;
    }

    public static ep.k h(java.lang.String r1) {
        throw new UnsupportedOperationException("Method not decompiled: gj.e.h(java.lang.String):ep.k");
    }

    public static z i(String str, boolean z10) {
        m.e(str, "<this>");
        l lVar = l50.c.a;
        k50.i iVar = new k50.i();
        iVar.w0(str);
        return l50.c.d(iVar, z10);
    }

    public static z j(File file) {
        String str = z.B;
        String string = file.toString();
        m.d(string, "toString(...)");
        return i(string, false);
    }

    public static Uri l(Context context, String str) {
        m.e(str, "photoUrl");
        return g(context, "art", new k("url", str));
    }

    public static Uri n(Context context, String str) {
        m.e(str, "source");
        return r30.r.x0(str, "http", false) ? g(context, "icon", new k("url", str), new k("icon", "1")) : g(context, "file", new k("file", str));
    }

    public static Uri o(Context context, int i10) {
        return g(context, "res", new k("res", String.valueOf(i10)));
    }

    @Override
    public fd.d a(rc.c cVar) {
        rc.g gVar = cVar.f13151a;
        SharedPreferences sharedPreferences = gVar.f13173b.getSharedPreferences("amplitude-events-" + gVar.f13176e, 0);
        String str = gVar.f13176e;
        cd.b bVarM = gVar.f13178g.M(cVar);
        m.b(sharedPreferences);
        return new ad.f(str, bVarM, sharedPreferences, new File(gVar.a(), "events"), cVar.f13162n);
    }

    @Override
    public Object apply(Object obj) {
        return ((e4) obj).b();
    }

    @Override
    public void b(d0 d0Var) {
    }

    @Override
    public Object c(y1.b bVar, Object obj) {
        c1.d dVar = (c1.d) obj;
        Integer numValueOf = Integer.valueOf(dVar.f2599a);
        String str = dVar.f2600b;
        String str2 = dVar.f2601c;
        long j9 = dVar.f2602d;
        int i10 = q0.f10519c;
        Integer numValueOf2 = Integer.valueOf((int) (j9 >> 32));
        Integer numValueOf3 = Integer.valueOf((int) (j9 & 4294967295L));
        long j10 = dVar.f2603e;
        return va.a.S(numValueOf, str, str2, numValueOf2, numValueOf3, Integer.valueOf((int) (j10 >> 32)), Integer.valueOf((int) (4294967295L & j10)), Long.valueOf(dVar.f2604f));
    }

    @Override
    public Object f(Object obj) {
        m.c(obj, "null cannot be cast to non-null type kotlin.collections.List<*>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        m.c(obj2, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj2).intValue();
        Object obj3 = list.get(1);
        m.c(obj3, "null cannot be cast to non-null type kotlin.String");
        Object obj4 = list.get(2);
        m.c(obj4, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj4;
        Object obj5 = list.get(3);
        m.c(obj5, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue2 = ((Integer) obj5).intValue();
        Object obj6 = list.get(4);
        m.c(obj6, "null cannot be cast to non-null type kotlin.Int");
        long jB = h0.b(iIntValue2, ((Integer) obj6).intValue());
        Object obj7 = list.get(5);
        m.c(obj7, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue3 = ((Integer) obj7).intValue();
        Object obj8 = list.get(6);
        m.c(obj8, "null cannot be cast to non-null type kotlin.Int");
        long jB2 = h0.b(iIntValue3, ((Integer) obj8).intValue());
        Object obj9 = list.get(7);
        m.c(obj9, "null cannot be cast to non-null type kotlin.Long");
        return new c1.d(iIntValue, (String) obj3, str, jB, jB2, ((Long) obj9).longValue(), false, 64);
    }

    @Override
    public Task k(Object obj) {
        return Tasks.d(Boolean.TRUE);
    }

    @Override
    public Object m(y1 y1Var) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(y1Var);
    }

    @Override
    public Object p(Uri uri, g7.h hVar) {
        return Long.valueOf(i0.K(new BufferedReader(new InputStreamReader(hVar)).readLine()));
    }

    @Override
    public void q() {
    }

    public String toString() {
        switch (this.A) {
            case 1:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    @Override
    public l0 w(int i10, int i11) {
        return new p();
    }
}
