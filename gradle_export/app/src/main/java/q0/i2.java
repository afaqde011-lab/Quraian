package q0;

public final class i2 {

    public h7.b f12631a;

    public h7.b f12632b;

    public int f12633c;

    public Long f12634d;

    public boolean f12635e;

    public final void a(r3.w wVar) {
        h7.b bVar;
        r3.w wVar2;
        this.f12635e = false;
        h7.b bVar2 = this.f12631a;
        if (kotlin.jvm.internal.m.a(wVar, bVar2 != null ? (r3.w) bVar2.B : null)) {
            return;
        }
        String str = wVar.f13099a.B;
        h7.b bVar3 = this.f12631a;
        if (kotlin.jvm.internal.m.a(str, (bVar3 == null || (wVar2 = (r3.w) bVar3.B) == null) ? null : wVar2.f13099a.B)) {
            h7.b bVar4 = this.f12631a;
            if (bVar4 != null) {
                bVar4.B = wVar;
                return;
            }
            return;
        }
        this.f12631a = new h7.b(this.f12631a, wVar);
        this.f12632b = null;
        int length = wVar.f13099a.B.length() + this.f12633c;
        this.f12633c = length;
        if (length > 100000) {
            h7.b bVar5 = this.f12631a;
            if ((bVar5 != null ? (h7.b) bVar5.A : null) == null) {
                return;
            }
            while (true) {
                if (bVar5 == null) {
                    bVar = null;
                } else {
                    h7.b bVar6 = (h7.b) bVar5.A;
                    if (bVar6 != null) {
                        bVar = (h7.b) bVar6.A;
                    } else {
                        bVar = null;
                    }
                }
                if (bVar == null) {
                    break;
                } else {
                    bVar5 = (h7.b) bVar5.A;
                }
            }
            if (bVar5 != null) {
                bVar5.A = null;
            }
        }
    }
}
