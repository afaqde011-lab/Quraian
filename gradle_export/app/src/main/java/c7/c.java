package c7;

import a8.l0;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.media3.exoplayer.drm.MediaDrmCallbackException;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.internal.play_billing.q1;
import com.google.firebase.messaging.FirebaseMessaging;
import fh.i2;
import fh.w;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import k50.z;
import k9.b3;
import q3.e0;
import ta.c0;
import tf.w0;

public final class c implements a8.s {
    public boolean A;
    public Object B;
    public Object C;
    public Object D;

    public c(int i10) {
        switch (i10) {
            case 7:
                qk.b bVar = qk.b.f13038c;
                this.B = bVar;
                this.C = bVar;
                this.D = new ArrayList();
                break;
            case 8:
                this.B = new Intent("android.intent.action.VIEW");
                this.C = new ru.c(1);
                this.A = true;
                break;
            case 12:
                this.B = new float[16];
                this.C = new float[16];
                this.D = new q1();
                break;
            default:
                this.B = new Object();
                this.C = new ArrayList();
                this.D = new ArrayList();
                this.A = true;
                break;
        }
    }

    public c(a8.s sVar, x8.i iVar) {
        this.B = sVar;
        this.C = iVar;
        this.D = new SparseArray();
    }

    public c(ob.e eVar, ob.b bVar) {
        this.D = eVar;
        this.B = bVar;
        this.C = new boolean[2];
    }

    public c(w0 w0Var, String str) {
        this.D = w0Var;
        d0.e(str);
        this.B = str;
    }

    public c(ui.b bVar, boolean z10) {
        this.D = bVar;
        this.C = new AtomicReference(null);
        this.A = z10;
        this.B = new AtomicMarkableReference(new qi.e(z10 ? 8192 : 1024), false);
    }

    public static void e(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f3 = fArr2[10];
        float f10 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f10 * f10) + (f3 * f3));
        float f11 = fArr2[10] / fSqrt;
        fArr[0] = f11;
        float f12 = fArr2[8];
        fArr[2] = f12 / fSqrt;
        fArr[8] = (-f12) / fSqrt;
        fArr[10] = f11;
    }

    public void a(qk.b bVar, double d3, double d5, double d10) {
        ((ArrayList) this.D).add(new rk.a(bVar, d3, d5, d10));
        double d11 = d5 + d10;
        this.C = new qk.b((Math.cos(d11) * d3) + bVar.f13039a, (Math.sin(d11) * d3) + bVar.f13040b);
    }

    @Override
    public void b(a8.d0 d0Var) {
        ((a8.s) this.B).b(d0Var);
    }

    public e0 c() {
        Intent intent = (Intent) this.B;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.A);
        ((ru.c) this.C).getClass();
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        int i10 = Build.VERSION.SDK_INT;
        String strA = t.b.a();
        if (!TextUtils.isEmpty(strA)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", strA);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (i10 >= 34) {
            if (((ActivityOptions) this.D) == null) {
                this.D = t.a.a();
            }
            t.c.a((ActivityOptions) this.D, false);
        }
        ActivityOptions activityOptions = (ActivityOptions) this.D;
        return new e0(intent, activityOptions != null ? activityOptions.toBundle() : null, 7);
    }

    public void d(boolean z10) {
        ob.e eVar = (ob.e) this.D;
        synchronized (eVar) {
            try {
                if (this.A) {
                    throw new IllegalStateException("editor is closed");
                }
                if (kotlin.jvm.internal.m.a(((ob.b) this.B).f11913g, this)) {
                    ob.e.a(eVar, this, z10);
                }
                this.A = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void f(double d3, double d5, double d10, double d11, double d12, double d13) {
        qk.b bVar = (qk.b) this.C;
        qk.b bVar2 = new qk.b(d3, d5);
        qk.b bVar3 = new qk.b(d10, d11);
        qk.b bVar4 = new qk.b(d12, d13);
        ((ArrayList) this.D).add(new rk.b(bVar, bVar2, bVar3, bVar4));
        this.C = bVar4;
    }

    public n7.t g(UUID uuid, n7.n nVar) throws MediaDrmCallbackException {
        String str;
        String str2 = nVar.f11175b;
        if (this.A || TextUtils.isEmpty(str2)) {
            str2 = (String) this.C;
        }
        if (TextUtils.isEmpty(str2)) {
            Map map = Collections.EMPTY_MAP;
            Uri uri = Uri.EMPTY;
            c0.w(uri, "The uri must be set.");
            throw new MediaDrmCallbackException(new g7.j(uri, 1, null, map, 0L, -1L, null, 0), uri, i2.G, 0L, new IllegalStateException("No license URL"));
        }
        HashMap map2 = new HashMap();
        UUID uuid2 = androidx.media3.common.h.f1218e;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = androidx.media3.common.h.f1216c.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map2.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map2.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((HashMap) this.D)) {
            map2.putAll((HashMap) this.D);
        }
        return a.a.w(((bg.b) this.B).t(), str2, nVar.f11174a, map2);
    }

    public n7.t h(n7.o oVar) {
        Charset charset = StandardCharsets.UTF_8;
        byte[][] bArr = {"{\"signedRequest\":\"".getBytes(charset), oVar.f11176a, "\"}".getBytes(charset)};
        long length = 0;
        for (int i10 = 0; i10 < 3; i10++) {
            length += (long) bArr[i10].length;
        }
        int i11 = (int) length;
        c0.p(length, "the total number of elements (%s) in the arrays must fit in an int", length == ((long) i11));
        byte[] bArr2 = new byte[i11];
        int length2 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            byte[] bArr3 = bArr[i12];
            System.arraycopy(bArr3, 0, bArr2, length2, bArr3.length);
            length2 += bArr3.length;
        }
        g7.f fVarT = ((bg.b) this.B).t();
        String str = oVar.f11177b;
        String string = ih.a.f7669i.toString();
        String strValueOf = String.valueOf(i11);
        w.f("Content-Type", string);
        w.f("Content-Length", strValueOf);
        return a.a.w(fVarT, str, bArr2, i2.h(2, new Object[]{"Content-Type", string, "Content-Length", strValueOf}, null));
    }

    public z i(int i10) {
        z zVar;
        ob.e eVar = (ob.e) this.D;
        synchronized (eVar) {
            if (this.A) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.C)[i10] = true;
            Object obj = ((ob.b) this.B).f11910d.get(i10);
            ob.d dVar = eVar.P;
            z zVar2 = (z) obj;
            if (!dVar.g(zVar2)) {
                bc.d.a(dVar.m(zVar2));
            }
            zVar = (z) obj;
        }
        return zVar;
    }

    public synchronized void j() {
        try {
            if (this.A) {
                return;
            }
            Boolean boolN = n();
            this.C = boolN;
            if (boolN == null) {
                b3 b3Var = new b3(28);
                ii.k kVar = (ii.k) ((fj.c) this.B);
                kVar.a(kVar.f7704c, b3Var);
            }
            this.A = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean k() {
        Boolean bool;
        try {
            j();
            bool = (Boolean) this.C;
        } catch (Throwable th2) {
            throw th2;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.D).f4354a.h();
    }

    public void l(double d3, double d5) {
        qk.b bVar = (qk.b) this.C;
        qk.b bVar2 = new qk.b(d3, d5);
        ((ArrayList) this.D).add(new rk.c(bVar, bVar2));
        this.C = bVar2;
    }

    public void m(double d3) {
        if (this.A) {
            throw new IllegalStateException("moveTo can only be called once at the beginning of the path");
        }
        this.A = true;
        qk.b bVar = new qk.b(0.0d, d3);
        this.B = bVar;
        this.C = bVar;
    }

    public Boolean n() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        bi.g gVar = ((FirebaseMessaging) this.D).f4354a;
        gVar.a();
        Context context = gVar.f2531a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), Cast.MAX_NAMESPACE_LENGTH)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public void o(boolean z10) {
        e7.d0 d0Var = (e7.d0) this.D;
        if (z10 == this.A) {
            return;
        }
        if (z10) {
            final int i10 = 0;
            d0Var.d(new Runnable(this) {
                public final c B;

                {
                    this.B = this;
                }

                @Override
                public final void run() {
                    switch (i10) {
                        case 0:
                            c cVar = this.B;
                            ((Context) cVar.B).registerReceiver((b) cVar.C, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                            break;
                        default:
                            c cVar2 = this.B;
                            ((Context) cVar2.B).unregisterReceiver((b) cVar2.C);
                            break;
                    }
                }
            });
            this.A = true;
        } else {
            final int i11 = 1;
            d0Var.d(new Runnable(this) {
                public final c B;

                {
                    this.B = this;
                }

                @Override
                public final void run() {
                    switch (i11) {
                        case 0:
                            c cVar = this.B;
                            ((Context) cVar.B).registerReceiver((b) cVar.C, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                            break;
                        default:
                            c cVar2 = this.B;
                            ((Context) cVar2.B).unregisterReceiver((b) cVar2.C);
                            break;
                    }
                }
            });
            this.A = false;
        }
    }

    public String p() {
        if (!this.A) {
            this.A = true;
            w0 w0Var = (w0) this.D;
            this.C = w0Var.Z0().getString((String) this.B, null);
        }
        return (String) this.C;
    }

    @Override
    public void q() {
        SparseArray sparseArray = (SparseArray) this.D;
        ((a8.s) this.B).q();
        if (this.A) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                ((x8.l) sparseArray.valueAt(i10)).f16502i = true;
            }
        }
    }

    public void r(String str) {
        SharedPreferences.Editor editorEdit = ((w0) this.D).Z0().edit();
        editorEdit.putString((String) this.B, str);
        editorEdit.apply();
        this.C = str;
    }

    @Override
    public l0 w(int i10, int i11) {
        SparseArray sparseArray = (SparseArray) this.D;
        a8.s sVar = (a8.s) this.B;
        if (i11 != 3) {
            this.A = true;
            return sVar.w(i10, i11);
        }
        x8.l lVar = (x8.l) sparseArray.get(i10);
        if (lVar != null) {
            return lVar;
        }
        x8.l lVar2 = new x8.l(sVar.w(i10, i11), (x8.i) this.C);
        sparseArray.put(i10, lVar2);
        return lVar2;
    }
}
