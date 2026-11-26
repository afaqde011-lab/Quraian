package com.revenuecat.purchases;

import a40.m0;
import ab.a0;
import android.content.Context;
import android.os.StatFs;
import java.io.File;
import k50.o;
import k50.v;
import k50.z;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import ob.h;
import r00.i;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lob/a;", "invoke", "()Lob/a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class PurchasesOrchestrator$Companion$getImageLoader$imageLoader$1 extends n implements u00.a {
    final String $cacheFolder;
    final Context $context;
    final long $maxCacheSizeBytes;

    public PurchasesOrchestrator$Companion$getImageLoader$imageLoader$1(Context context, String str, long j) {
        super(0);
        this.$context = context;
        this.$cacheFolder = str;
        this.$maxCacheSizeBytes = j;
    }

    @Override
    public final ob.a invoke() {
        v vVar = o.a;
        h40.e eVar = m0.a;
        h40.d dVar = h40.d.C;
        File cacheDir = this.$context.getCacheDir();
        m.d(cacheDir, "context.cacheDir");
        File fileC0 = i.c0(cacheDir, this.$cacheFolder);
        String str = z.B;
        z zVarJ = gj.e.j(fileC0);
        long jA = this.$maxCacheSizeBytes;
        if (jA <= 0) {
            throw new IllegalArgumentException("size must be > 0.");
        }
        if (0.0d > 0.0d) {
            try {
                File file = zVarJ.toFile();
                file.mkdir();
                StatFs statFs = new StatFs(file.getAbsolutePath());
                jA = a0.A((long) (0.0d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
            } catch (Exception unused) {
                jA = 10485760;
            }
        }
        return new h(jA, dVar, vVar, zVarJ);
    }
}
