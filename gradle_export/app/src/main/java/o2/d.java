package o2;

import com.google.android.gms.cast.Cast;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import java.util.List;

public final class d {

    public final String f11539a;

    public final float f11540b;

    public final float f11541c;

    public final float f11542d;

    public final float f11543e;

    public final float f11544f;

    public final float f11545g;

    public final float f11546h;

    public final List f11547i;

    public final ArrayList f11548j;

    public d(String str, float f3, float f10, float f11, float f12, float f13, float f14, float f15, List list, int i10) {
        str = (i10 & 1) != 0 ? RuntimeVersion.SUFFIX : str;
        f3 = (i10 & 2) != 0 ? 0.0f : f3;
        f10 = (i10 & 4) != 0 ? 0.0f : f10;
        f11 = (i10 & 8) != 0 ? 0.0f : f11;
        f12 = (i10 & 16) != 0 ? 1.0f : f12;
        f13 = (i10 & 32) != 0 ? 1.0f : f13;
        f14 = (i10 & 64) != 0 ? 0.0f : f14;
        f15 = (i10 & Cast.MAX_NAMESPACE_LENGTH) != 0 ? 0.0f : f15;
        if ((i10 & 256) != 0) {
            int i11 = g0.f11581a;
            list = h00.x.A;
        }
        ArrayList arrayList = new ArrayList();
        this.f11539a = str;
        this.f11540b = f3;
        this.f11541c = f10;
        this.f11542d = f11;
        this.f11543e = f12;
        this.f11544f = f13;
        this.f11545g = f14;
        this.f11546h = f15;
        this.f11547i = list;
        this.f11548j = arrayList;
    }
}
