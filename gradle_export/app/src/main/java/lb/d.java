package lb;

import a40.m0;
import ab.a0;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.StatFs;
import java.io.File;
import k50.v;
import k50.z;
import kotlin.jvm.internal.n;
import th.o;

public final class d extends n implements u00.a {
    public final int A;
    public final o B;

    public d(o oVar, int i10) {
        super(0);
        this.A = i10;
        this.B = oVar;
    }

    public final Object invoke() {
        ob.h hVar;
        long jA;
        switch (this.A) {
            case 0:
                return new ub.a((Context) this.B.B).a();
            default:
                bc.f fVar = bc.f.f2488a;
                Context context = (Context) this.B.B;
                synchronized (fVar) {
                    try {
                        hVar = bc.f.f2489b;
                        if (hVar == null) {
                            v vVar = k50.o.a;
                            h40.e eVar = m0.a;
                            h40.d dVar = h40.d.C;
                            Bitmap.Config[] configArr = bc.d.f2480a;
                            File cacheDir = context.getCacheDir();
                            if (cacheDir == null) {
                                throw new IllegalStateException("cacheDir == null");
                            }
                            cacheDir.mkdirs();
                            File fileC0 = r00.i.c0(cacheDir, "image_cache");
                            String str = z.B;
                            z zVarJ = gj.e.j(fileC0);
                            if (0.02d > 0.0d) {
                                jA = 10485760;
                                try {
                                    File file = zVarJ.toFile();
                                    file.mkdir();
                                    StatFs statFs = new StatFs(file.getAbsolutePath());
                                    jA = a0.A((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                    break;
                                } catch (Exception unused) {
                                }
                            } else {
                                jA = 0;
                            }
                            ob.h hVar2 = new ob.h(jA, dVar, vVar, zVarJ);
                            bc.f.f2489b = hVar2;
                            hVar = hVar2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return hVar;
        }
    }
}
