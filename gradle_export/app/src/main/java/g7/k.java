package g7;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import e7.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import ta.c0;

public final class k implements f {
    public final Context A;
    public final ArrayList B;
    public final f C;
    public o D;
    public a E;
    public c F;
    public f G;
    public t H;
    public d I;
    public q J;
    public f K;

    public k(Context context, f fVar) {
        this.A = context.getApplicationContext();
        fVar.getClass();
        this.C = fVar;
        this.B = new ArrayList();
    }

    public static void c(f fVar, s sVar) {
        if (fVar != null) {
            fVar.s(sVar);
        }
    }

    public final void b(f fVar) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.B;
            if (i10 >= arrayList.size()) {
                return;
            }
            fVar.s((s) arrayList.get(i10));
            i10++;
        }
    }

    @Override
    public final void close() {
        f fVar = this.K;
        if (fVar != null) {
            try {
                fVar.close();
            } finally {
                this.K = null;
            }
        }
    }

    @Override
    public final long p(j jVar) {
        c0.A(this.K == null);
        Uri uri = jVar.f6218a;
        String scheme = uri.getScheme();
        String str = i0.f5136a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.A;
        if (zIsEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.D == null) {
                    o oVar = new o(false);
                    this.D = oVar;
                    b(oVar);
                }
                this.K = this.D;
            } else {
                if (this.E == null) {
                    a aVar = new a(context);
                    this.E = aVar;
                    b(aVar);
                }
                this.K = this.E;
            }
        } else if ("asset".equals(scheme)) {
            if (this.E == null) {
                a aVar2 = new a(context);
                this.E = aVar2;
                b(aVar2);
            }
            this.K = this.E;
        } else if ("content".equals(scheme)) {
            if (this.F == null) {
                c cVar = new c(context);
                this.F = cVar;
                b(cVar);
            }
            this.K = this.F;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            f fVar = this.C;
            if (zEquals) {
                if (this.G == null) {
                    try {
                        f fVar2 = (f) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.G = fVar2;
                        b(fVar2);
                    } catch (ClassNotFoundException unused) {
                        e7.a.m("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e3) {
                        throw new RuntimeException("Error instantiating RTMP extension", e3);
                    }
                    if (this.G == null) {
                        this.G = fVar;
                    }
                }
                this.K = this.G;
            } else if ("udp".equals(scheme)) {
                if (this.H == null) {
                    t tVar = new t();
                    this.H = tVar;
                    b(tVar);
                }
                this.K = this.H;
            } else if ("data".equals(scheme)) {
                if (this.I == null) {
                    d dVar = new d(false);
                    this.I = dVar;
                    b(dVar);
                }
                this.K = this.I;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.J == null) {
                    q qVar = new q(context);
                    this.J = qVar;
                    b(qVar);
                }
                this.K = this.J;
            } else {
                this.K = fVar;
            }
        }
        return this.K.p(jVar);
    }

    @Override
    public final Map r() {
        f fVar = this.K;
        return fVar == null ? Collections.EMPTY_MAP : fVar.r();
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        f fVar = this.K;
        fVar.getClass();
        return fVar.read(bArr, i10, i11);
    }

    @Override
    public final void s(s sVar) {
        sVar.getClass();
        this.C.s(sVar);
        this.B.add(sVar);
        c(this.D, sVar);
        c(this.E, sVar);
        c(this.F, sVar);
        c(this.G, sVar);
        c(this.H, sVar);
        c(this.I, sVar);
        c(this.J, sVar);
    }

    @Override
    public final Uri y() {
        f fVar = this.K;
        if (fVar == null) {
            return null;
        }
        return fVar.y();
    }
}
