package dh;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.media3.common.e0;
import androidx.media3.common.g0;
import androidx.media3.common.j0;
import androidx.media3.common.k0;
import androidx.media3.common.m0;
import androidx.media3.common.q0;
import androidx.media3.common.s0;
import androidx.media3.common.t0;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.internal.measurement.z3;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.quranify.player.presentation.service.auto.art.AutoArtContentProvider;
import e7.f0;
import fh.d2;
import fh.r0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import q3.a0;
import q3.c0;
import sd.p1;

public final class o implements n, v5.f {
    public Context A;

    public o(Context context, char c10) {
        this.A = context;
    }

    public o(Context context, int i10) {
        switch (i10) {
            case 3:
                this.A = context.getApplicationContext();
                break;
            case 4:
            default:
                context.getClass();
                this.A = context;
                break;
            case 5:
                this.A = context.getApplicationContext();
                break;
        }
    }

    public static q0 d(o oVar, String str, String str2, String str3, String str4, Integer num, String str5, qv.a aVar, qv.a aVar2, int i10) {
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        if ((i10 & 8) != 0) {
            str4 = null;
        }
        if ((i10 & 16) != 0) {
            num = null;
        }
        if ((i10 & 32) != 0) {
            str5 = null;
        }
        if ((i10 & 64) != 0) {
            aVar = null;
        }
        if ((i10 & Cast.MAX_NAMESPACE_LENGTH) != 0) {
            aVar2 = aVar;
        }
        boolean z10 = (i10 & 256) == 0;
        oVar.getClass();
        kotlin.jvm.internal.m.e(str, "mediaId");
        kotlin.jvm.internal.m.e(str2, "title");
        s0 s0Var = new s0();
        s0Var.f1515a = str2;
        if (str3 != null) {
            s0Var.f1520f = str3;
        }
        s0Var.f1529q = Boolean.TRUE;
        s0Var.f1530r = Boolean.FALSE;
        s0Var.G = 20;
        Uri uriC = oVar.c(str4, num, z10);
        if (uriC != null) {
            s0Var.m = uriC;
        }
        s0Var.H = g(str5, aVar, aVar2);
        return i(str, new t0(s0Var));
    }

    public static Bundle g(String str, qv.a aVar, qv.a aVar2) throws NoWhenBranchMatchedException {
        int i10;
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("android.media.browse.CONTENT_STYLE_GROUP_TITLE_HINT", str);
        }
        int i11 = 2;
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal == 0) {
                i10 = 1;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                i10 = 2;
            }
            bundle.putInt("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", i10);
        }
        if (aVar2 != null) {
            int iOrdinal2 = aVar2.ordinal();
            if (iOrdinal2 == 0) {
                i11 = 1;
            } else if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            bundle.putInt("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", i11);
        }
        return bundle;
    }

    public static q0 i(String str, t0 t0Var) {
        e0 e0Var = new e0();
        r0 r0Var = fh.t0.B;
        d2 d2Var = d2.E;
        List list = Collections.EMPTY_LIST;
        d2 d2Var2 = d2.E;
        j0 j0Var = new j0();
        m0 m0Var = m0.f1344d;
        str.getClass();
        return new q0(str, new g0(e0Var), null, new k0(j0Var), t0Var, m0Var);
    }

    public static q0 j(o oVar, String str, String str2, String str3, String str4, String str5) {
        qv.a aVar = qv.a.A;
        kotlin.jvm.internal.m.e(str, "mediaId");
        kotlin.jvm.internal.m.e(str2, "title");
        kotlin.jvm.internal.m.e(str3, MediaTrack.ROLE_SUBTITLE);
        s0 s0Var = new s0();
        s0Var.f1515a = str2;
        s0Var.f1516b = str3;
        s0Var.f1520f = str3;
        s0Var.f1529q = Boolean.FALSE;
        s0Var.f1530r = Boolean.TRUE;
        s0Var.G = 1;
        Uri uriC = oVar.c(str4, null, false);
        if (uriC != null) {
            s0Var.m = uriC;
        }
        s0Var.H = g(str5, null, aVar);
        return i(str, new t0(s0Var));
    }

    public static int l(androidx.media3.common.t r5) {
        throw new UnsupportedOperationException("Method not decompiled: dh.o.l(androidx.media3.common.t):int");
    }

    public static q0 m(o oVar, String str, String str2, String str3) {
        oVar.getClass();
        kotlin.jvm.internal.m.e(str, "mediaId");
        kotlin.jvm.internal.m.e(str2, "title");
        kotlin.jvm.internal.m.e(str3, MediaTrack.ROLE_SUBTITLE);
        qv.a aVar = qv.a.A;
        return j(oVar, str, str2, str3, null, null);
    }

    @Override
    public void a(w00.a aVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new f0("EmojiCompatInitializer", 1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new ab.e(this, aVar, threadPoolExecutor, 26));
    }

    public String b(String str, int i10, String str2) {
        Uri uriO;
        Context context = this.A;
        File file = str != null ? new File(context.getFilesDir(), a1.b.p("Downloads/SoundEffectIcons/", str, ".png")) : null;
        if (file != null && file.exists() && file.length() > 0) {
            int i11 = AutoArtContentProvider.A;
            String absolutePath = file.getAbsolutePath();
            kotlin.jvm.internal.m.d(absolutePath, "getAbsolutePath(...)");
            uriO = gj.e.n(context, absolutePath);
        } else if (str2 == null || r30.k.L0(str2)) {
            int i12 = AutoArtContentProvider.A;
            uriO = gj.e.o(context, i10);
        } else {
            int i13 = AutoArtContentProvider.A;
            uriO = gj.e.n(context, str2);
        }
        String string = uriO.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public Uri c(String str, Integer num, boolean z10) {
        Context context = this.A;
        if (str != null && !r30.k.L0(str)) {
            if (!r30.r.x0(str, "http", false)) {
                return Uri.parse(str);
            }
            int i10 = AutoArtContentProvider.A;
            return gj.e.l(context, str);
        }
        if (num == null || !z10) {
            if (num == null) {
                return null;
            }
            int i11 = AutoArtContentProvider.A;
            return gj.e.o(context, num.intValue());
        }
        Uri uriBuild = new Uri.Builder().scheme("android.resource").authority(context.getPackageName()).appendPath(String.valueOf(num.intValue())).build();
        kotlin.jvm.internal.m.d(uriBuild, "build(...)");
        return uriBuild;
    }

    @Override
    public Object e() {
        return this.A;
    }

    public xd.j f() {
        Context context = this.A;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        xd.j jVar = new xd.j();
        jVar.A = zd.a.a(xd.m.f16552a);
        a5.f fVar = new a5.f(context);
        jVar.B = fVar;
        jVar.C = zd.a.a(new q3.e0(fVar, new wb.o(fVar), 20));
        a5.f fVar2 = jVar.B;
        jVar.D = new ee.k(fVar2, 0);
        f00.a aVarA = zd.a.a(new l9.f0(jVar.D, zd.a.a(new qj.c(fVar2, 21)), 23));
        jVar.E = aVarA;
        hb.f fVar3 = new hb.f();
        a5.f fVar4 = jVar.B;
        a1.i iVar = new a1.i(fVar4, aVarA, fVar3, 6);
        f00.a aVar = jVar.A;
        f00.a aVar2 = jVar.C;
        jVar.F = zd.a.a(new p1(new ce.c(aVar, aVar2, iVar, aVarA, aVarA), new ui.b(fVar4, aVar2, aVarA, iVar, aVar, aVarA, aVarA, 4), new oj.q(aVar, aVarA, iVar, aVarA, 10), 21));
        return jVar;
    }

    public Typeface h(a0 a0Var) {
        String strA;
        boolean z10;
        float fA;
        Context context = this.A;
        if (!(a0Var instanceof a0)) {
            return null;
        }
        Typeface typefaceA = p4.i.a(context, a0Var.f12723a);
        kotlin.jvm.internal.m.b(typefaceA);
        List list = a0Var.f12726d.f12750a;
        ThreadLocal threadLocal = c0.f12727a;
        if (typefaceA == null) {
            return null;
        }
        if (list.isEmpty()) {
            return typefaceA;
        }
        ThreadLocal threadLocal2 = c0.f12727a;
        Paint paint = (Paint) threadLocal2.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal2.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typefaceA);
        y3.e eVarD = z3.d(context);
        int i10 = 0;
        int i11 = context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE ? 0 : context.getResources().getConfiguration().fontWeightAdjustment;
        if (i11 == 0) {
            strA = a4.a.a(list, null, new pp.d(eVarD), 31);
        } else {
            int size = list.size();
            String str = RuntimeVersion.SUFFIX;
            boolean z11 = false;
            while (i10 < size) {
                q3.q qVar = (q3.q) list.get(i10);
                if (kotlin.jvm.internal.m.a(qVar.b(), "wght")) {
                    fA = ab.a0.x(qVar.a() + i11, 1.0f, 1000.0f);
                    z10 = true;
                } else {
                    z10 = z11;
                    fA = qVar.a();
                }
                if (i10 != 0) {
                    str = str + ',';
                }
                str = str + '\'' + qVar.b() + "' " + fA;
                i10++;
                z11 = z10;
            }
            if (z11) {
                strA = str;
            } else {
                float fX = ab.a0.x(i11 + 400.0f, 1.0f, 1000.0f);
                if (!list.isEmpty()) {
                    str = str + ',';
                }
                strA = str + "'wght' " + fX;
            }
        }
        paint.setFontVariationSettings(strA);
        return paint.getTypeface();
    }

    public String k(int i10) {
        String string = this.A.getString(i10);
        kotlin.jvm.internal.m.d(string, "getString(...)");
        return string;
    }

    public q0 n(String str, int i10, int i11, qv.a aVar) {
        kotlin.jvm.internal.m.e(str, "mediaId");
        String string = this.A.getString(i10);
        kotlin.jvm.internal.m.d(string, "getString(...)");
        return d(this, str, string, null, null, Integer.valueOf(i11), null, aVar, null, 172);
    }

    public f5.i o() throws PackageManager.NameNotFoundException {
        String string;
        Context context = this.A;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List listN1 = h00.q.n1(arrayList);
        if (listN1.isEmpty()) {
            return null;
        }
        Iterator it = listN1.iterator();
        f5.i iVar = null;
        while (it.hasNext()) {
            try {
                Object objNewInstance = Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                kotlin.jvm.internal.m.c(objNewInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                f5.i iVar2 = (f5.i) objNewInstance;
                if (!iVar2.isAvailableOnDevice()) {
                    continue;
                } else {
                    if (iVar != null) {
                        Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                        return null;
                    }
                    iVar = iVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return iVar;
    }
}
