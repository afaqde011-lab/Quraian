package wb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import java.util.Arrays;

public final class l {

    public final Context f15960a;

    public final Bitmap.Config f15961b;

    public final ColorSpace f15962c;

    public final xb.g f15963d;

    public final xb.f f15964e;

    public final boolean f15965f;

    public final boolean f15966g;

    public final boolean f15967h;

    public final String f15968i;

    public final x40.p f15969j;

    public final q f15970k;
    public final n l;
    public final b m;

    public final b f15971n;

    public final b f15972o;

    public l(Context context, Bitmap.Config config, ColorSpace colorSpace, xb.g gVar, xb.f fVar, boolean z10, boolean z11, boolean z12, String str, x40.p pVar, q qVar, n nVar, b bVar, b bVar2, b bVar3) {
        this.f15960a = context;
        this.f15961b = config;
        this.f15962c = colorSpace;
        this.f15963d = gVar;
        this.f15964e = fVar;
        this.f15965f = z10;
        this.f15966g = z11;
        this.f15967h = z12;
        this.f15968i = str;
        this.f15969j = pVar;
        this.f15970k = qVar;
        this.l = nVar;
        this.m = bVar;
        this.f15971n = bVar2;
        this.f15972o = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.m.a(this.f15960a, lVar.f15960a) && this.f15961b == lVar.f15961b && kotlin.jvm.internal.m.a(this.f15962c, lVar.f15962c) && kotlin.jvm.internal.m.a(this.f15963d, lVar.f15963d) && this.f15964e == lVar.f15964e && this.f15965f == lVar.f15965f && this.f15966g == lVar.f15966g && this.f15967h == lVar.f15967h && kotlin.jvm.internal.m.a(this.f15968i, lVar.f15968i) && kotlin.jvm.internal.m.a(this.f15969j, lVar.f15969j) && kotlin.jvm.internal.m.a(this.f15970k, lVar.f15970k) && kotlin.jvm.internal.m.a(this.l, lVar.l) && this.m == lVar.m && this.f15971n == lVar.f15971n && this.f15972o == lVar.f15972o;
    }

    public final int hashCode() {
        int iHashCode = (this.f15961b.hashCode() + (this.f15960a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f15962c;
        int iE = w.c.e(w.c.e(w.c.e((this.f15964e.hashCode() + ((this.f15963d.hashCode() + ((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f15965f), 31, this.f15966g), 31, this.f15967h);
        String str = this.f15968i;
        return this.f15972o.hashCode() + ((this.f15971n.hashCode() + ((this.m.hashCode() + ((this.l.A.hashCode() + ((this.f15970k.f15983a.hashCode() + ((((iE + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f15969j.A)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
