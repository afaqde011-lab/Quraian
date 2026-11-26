package d6;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.gms.cast.Cast;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class i2 {

    public final Context f4640a;

    public final int f4641b;

    public final boolean f4642c;

    public final l1 f4643d;

    public final int f4644e;

    public final boolean f4645f;

    public final AtomicInteger f4646g;

    public final j1 f4647h;

    public final AtomicBoolean f4648i;

    public final long f4649j;

    public final int f4650k;
    public final boolean l;
    public final Integer m;

    public final ComponentName f4651n;

    public final l9.f0 f4652o;

    public i2(Context context, int i10, boolean z10, l1 l1Var, int i11, boolean z11, AtomicInteger atomicInteger, j1 j1Var, AtomicBoolean atomicBoolean, long j9, int i12, boolean z12, Integer num, ComponentName componentName, l9.f0 f0Var) {
        this.f4640a = context;
        this.f4641b = i10;
        this.f4642c = z10;
        this.f4643d = l1Var;
        this.f4644e = i11;
        this.f4645f = z11;
        this.f4646g = atomicInteger;
        this.f4647h = j1Var;
        this.f4648i = atomicBoolean;
        this.f4649j = j9;
        this.f4650k = i12;
        this.l = z12;
        this.m = num;
        this.f4651n = componentName;
        this.f4652o = f0Var;
    }

    public static i2 a(i2 i2Var, int i10, AtomicInteger atomicInteger, j1 j1Var, AtomicBoolean atomicBoolean, long j9, Integer num, int i11) {
        return new i2(i2Var.f4640a, i2Var.f4641b, i2Var.f4642c, i2Var.f4643d, (i11 & 16) != 0 ? i2Var.f4644e : i10, (i11 & 32) != 0 ? i2Var.f4645f : true, (i11 & 64) != 0 ? i2Var.f4646g : atomicInteger, (i11 & Cast.MAX_NAMESPACE_LENGTH) != 0 ? i2Var.f4647h : j1Var, (i11 & 256) != 0 ? i2Var.f4648i : atomicBoolean, (i11 & 512) != 0 ? i2Var.f4649j : j9, (i11 & 1024) != 0 ? i2Var.f4650k : 0, (i11 & 4096) != 0 ? i2Var.l : true, (i11 & 8192) != 0 ? i2Var.m : num, i2Var.f4651n, i2Var.f4652o);
    }

    public final i2 b(j1 j1Var, int i10) {
        return a(this, i10, null, j1Var, null, 0L, null, 65391);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i2) {
            i2 i2Var = (i2) obj;
            if (kotlin.jvm.internal.m.a(this.f4640a, i2Var.f4640a) && this.f4641b == i2Var.f4641b && this.f4642c == i2Var.f4642c && this.f4643d.equals(i2Var.f4643d) && this.f4644e == i2Var.f4644e && this.f4645f == i2Var.f4645f && kotlin.jvm.internal.m.a(this.f4646g, i2Var.f4646g) && kotlin.jvm.internal.m.a(this.f4647h, i2Var.f4647h) && kotlin.jvm.internal.m.a(this.f4648i, i2Var.f4648i) && this.f4649j == i2Var.f4649j && this.f4650k == i2Var.f4650k && this.l == i2Var.l && kotlin.jvm.internal.m.a(this.m, i2Var.m) && kotlin.jvm.internal.m.a(this.f4651n, i2Var.f4651n) && this.f4652o.equals(i2Var.f4652o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iE = w.c.e(w.c.d(-1, w.c.d(this.f4650k, w.c.f((this.f4648i.hashCode() + ((this.f4647h.hashCode() + ((this.f4646g.hashCode() + w.c.e(w.c.d(this.f4644e, (this.f4643d.hashCode() + w.c.e(w.c.d(this.f4641b, this.f4640a.hashCode() * 31, 31), 31, this.f4642c)) * 31, 31), 31, this.f4645f)) * 31)) * 31)) * 31, this.f4649j, 31), 31), 31), 31, this.l);
        Integer num = this.m;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        ComponentName componentName = this.f4651n;
        return this.f4652o.hashCode() + ((iHashCode + (componentName != null ? componentName.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TranslationContext(context=" + this.f4640a + ", appWidgetId=" + this.f4641b + ", isRtl=" + this.f4642c + ", layoutConfiguration=" + this.f4643d + ", itemPosition=" + this.f4644e + ", isLazyCollectionDescendant=" + this.f4645f + ", lastViewId=" + this.f4646g + ", parentContext=" + this.f4647h + ", isBackgroundSpecified=" + this.f4648i + ", layoutSize=" + ((Object) y3.h.c(this.f4649j)) + ", layoutCollectionViewId=" + this.f4650k + ", layoutCollectionItemId=-1, canUseSelectableGroup=" + this.l + ", actionTargetId=" + this.m + ", actionBroadcastReceiver=" + this.f4651n + ", glanceComponents=" + this.f4652o + ')';
    }
}
