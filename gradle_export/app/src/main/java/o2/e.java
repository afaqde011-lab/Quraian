package o2;

import com.google.android.gms.cast.Cast;
import com.google.protobuf.RuntimeVersion;
import i2.v0;
import java.util.ArrayList;

public final class e {

    public final String f11549a;

    public final float f11550b;

    public final float f11551c;

    public final float f11552d;

    public final float f11553e;

    public final long f11554f;

    public final int f11555g;

    public final boolean f11556h;

    public final ArrayList f11557i;

    public final d f11558j;

    public boolean f11559k;

    public e(String str, float f3, float f10, float f11, float f12, long j9, int i10, boolean z10, int i11) {
        str = (i11 & 1) != 0 ? RuntimeVersion.SUFFIX : str;
        long j10 = (i11 & 32) != 0 ? i2.t.f7167g : j9;
        int i12 = (i11 & 64) != 0 ? 5 : i10;
        boolean z11 = (i11 & Cast.MAX_NAMESPACE_LENGTH) != 0 ? false : z10;
        this.f11549a = str;
        this.f11550b = f3;
        this.f11551c = f10;
        this.f11552d = f11;
        this.f11553e = f12;
        this.f11554f = j10;
        this.f11555g = i12;
        this.f11556h = z11;
        ArrayList arrayList = new ArrayList();
        this.f11557i = arrayList;
        d dVar = new d(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.f11558j = dVar;
        arrayList.add(dVar);
    }

    public static void a(e eVar, ArrayList arrayList, v0 v0Var) {
        if (eVar.f11559k) {
            y2.a.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((d) g4.c.d(1, eVar.f11557i)).f11548j.add(new j0(RuntimeVersion.SUFFIX, arrayList, 0, v0Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final f b() {
        if (this.f11559k) {
            y2.a.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.f11557i;
            if (arrayList.size() <= 1) {
                d dVar = this.f11558j;
                f fVar = new f(this.f11549a, this.f11550b, this.f11551c, this.f11552d, this.f11553e, new f0(dVar.f11539a, dVar.f11540b, dVar.f11541c, dVar.f11542d, dVar.f11543e, dVar.f11544f, dVar.f11545g, dVar.f11546h, dVar.f11547i, dVar.f11548j), this.f11554f, this.f11555g, this.f11556h);
                this.f11559k = true;
                return fVar;
            }
            if (this.f11559k) {
                y2.a.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            d dVar2 = (d) arrayList.remove(arrayList.size() - 1);
            ((d) g4.c.d(1, arrayList)).f11548j.add(new f0(dVar2.f11539a, dVar2.f11540b, dVar2.f11541c, dVar2.f11542d, dVar2.f11543e, dVar2.f11544f, dVar2.f11545g, dVar2.f11546h, dVar2.f11547i, dVar2.f11548j));
        }
    }
}
