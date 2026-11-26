package v2;

import java.util.ArrayList;

public final class s {

    public final long f15399a;

    public final long f15400b;

    public final long f15401c;

    public final boolean f15402d;

    public final float f15403e;

    public final long f15404f;

    public final long f15405g;

    public final boolean f15406h;

    public final int f15407i;

    public final long f15408j;

    public final float f15409k;
    public final long l;
    public final ArrayList m;

    public final long f15410n;

    public boolean f15411o;

    public boolean f15412p;

    public s f15413q;

    public s(long j9, long j10, long j11, boolean z10, float f3, long j12, long j13, boolean z11, int i10, ArrayList arrayList, long j14, float f10, long j15, long j16) {
        this(j9, j10, j11, z10, f3, j12, j13, z11, false, i10, j14, f10, j15);
        this.m = arrayList;
        this.f15410n = j16;
    }

    public s(long j9, long j10, long j11, boolean z10, float f3, long j12, long j13, boolean z11, boolean z12, int i10, long j14, float f10, long j15) {
        this.f15399a = j9;
        this.f15400b = j10;
        this.f15401c = j11;
        this.f15402d = z10;
        this.f15403e = f3;
        this.f15404f = j12;
        this.f15405g = j13;
        this.f15406h = z11;
        this.f15407i = i10;
        this.f15408j = j14;
        this.f15409k = f10;
        this.l = j15;
        this.f15410n = 0L;
        this.f15411o = z12;
        this.f15412p = z12;
    }

    public final void a() {
        s sVar = this.f15413q;
        if (sVar == null) {
            this.f15411o = true;
            this.f15412p = true;
        } else if (sVar != null) {
            sVar.a();
        }
    }

    public final boolean b() {
        s sVar = this.f15413q;
        if (sVar != null) {
            return sVar.b();
        }
        return this.f15411o || this.f15412p;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointerInputChange(id=");
        sb2.append((Object) r.j(this.f15399a));
        sb2.append(", uptimeMillis=");
        sb2.append(this.f15400b);
        sb2.append(", position=");
        sb2.append((Object) h2.b.h(this.f15401c));
        sb2.append(", pressed=");
        sb2.append(this.f15402d);
        sb2.append(", pressure=");
        sb2.append(this.f15403e);
        sb2.append(", previousUptimeMillis=");
        sb2.append(this.f15404f);
        sb2.append(", previousPosition=");
        sb2.append((Object) h2.b.h(this.f15405g));
        sb2.append(", previousPressed=");
        sb2.append(this.f15406h);
        sb2.append(", isConsumed=");
        sb2.append(b());
        sb2.append(", type=");
        sb2.append((Object) a0.a(this.f15407i));
        sb2.append(", historical=");
        h00.x xVar = this.m;
        if (xVar == null) {
            xVar = h00.x.A;
        }
        sb2.append(xVar);
        sb2.append(", scrollDelta=");
        sb2.append((Object) h2.b.h(this.f15408j));
        sb2.append(", scaleFactor=");
        sb2.append(this.f15409k);
        sb2.append(", panOffset=");
        sb2.append((Object) h2.b.h(this.l));
        sb2.append(')');
        return sb2.toString();
    }
}
