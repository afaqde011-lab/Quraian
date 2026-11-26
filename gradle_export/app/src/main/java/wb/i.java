package wb;

import a40.v;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.List;

public final class i {
    public final d A;
    public final c B;

    public final Context f15935a;

    public final Object f15936b;

    public final yb.a f15937c;

    public final ub.b f15938d;

    public final String f15939e;

    public final Bitmap.Config f15940f;

    public final xb.d f15941g;

    public final List f15942h;

    public final ac.e f15943i;

    public final x40.p f15944j;

    public final q f15945k;
    public final boolean l;
    public final boolean m;

    public final boolean f15946n;

    public final boolean f15947o;

    public final b f15948p;

    public final b f15949q;

    public final b f15950r;

    public final v f15951s;

    public final v f15952t;

    public final v f15953u;

    public final v f15954v;

    public final androidx.lifecycle.q f15955w;

    public final xb.h f15956x;

    public final xb.f f15957y;

    public final n f15958z;

    public i(Context context, Object obj, yb.a aVar, ub.b bVar, String str, Bitmap.Config config, xb.d dVar, List list, ac.e eVar, x40.p pVar, q qVar, boolean z10, boolean z11, boolean z12, boolean z13, b bVar2, b bVar3, b bVar4, v vVar, v vVar2, v vVar3, v vVar4, androidx.lifecycle.q qVar2, xb.h hVar, xb.f fVar, n nVar, d dVar2, c cVar) {
        this.f15935a = context;
        this.f15936b = obj;
        this.f15937c = aVar;
        this.f15938d = bVar;
        this.f15939e = str;
        this.f15940f = config;
        this.f15941g = dVar;
        this.f15942h = list;
        this.f15943i = eVar;
        this.f15944j = pVar;
        this.f15945k = qVar;
        this.l = z10;
        this.m = z11;
        this.f15946n = z12;
        this.f15947o = z13;
        this.f15948p = bVar2;
        this.f15949q = bVar3;
        this.f15950r = bVar4;
        this.f15951s = vVar;
        this.f15952t = vVar2;
        this.f15953u = vVar3;
        this.f15954v = vVar4;
        this.f15955w = qVar2;
        this.f15956x = hVar;
        this.f15957y = fVar;
        this.f15958z = nVar;
        this.A = dVar2;
        this.B = cVar;
    }

    public static h a(i iVar) {
        Context context = iVar.f15935a;
        iVar.getClass();
        return new h(iVar, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.m.a(this.f15935a, iVar.f15935a) && this.f15936b.equals(iVar.f15936b) && kotlin.jvm.internal.m.a(this.f15937c, iVar.f15937c) && kotlin.jvm.internal.m.a(this.f15938d, iVar.f15938d) && kotlin.jvm.internal.m.a(this.f15939e, iVar.f15939e) && this.f15940f == iVar.f15940f && this.f15941g == iVar.f15941g && kotlin.jvm.internal.m.a(this.f15942h, iVar.f15942h) && kotlin.jvm.internal.m.a(this.f15943i, iVar.f15943i) && kotlin.jvm.internal.m.a(this.f15944j, iVar.f15944j) && this.f15945k.equals(iVar.f15945k) && this.l == iVar.l && this.m == iVar.m && this.f15946n == iVar.f15946n && this.f15947o == iVar.f15947o && this.f15948p == iVar.f15948p && this.f15949q == iVar.f15949q && this.f15950r == iVar.f15950r && kotlin.jvm.internal.m.a(this.f15951s, iVar.f15951s) && kotlin.jvm.internal.m.a(this.f15952t, iVar.f15952t) && kotlin.jvm.internal.m.a(this.f15953u, iVar.f15953u) && kotlin.jvm.internal.m.a(this.f15954v, iVar.f15954v) && kotlin.jvm.internal.m.a(this.f15955w, iVar.f15955w) && this.f15956x.equals(iVar.f15956x) && this.f15957y == iVar.f15957y && this.f15958z.equals(iVar.f15958z) && this.A.equals(iVar.A) && kotlin.jvm.internal.m.a(this.B, iVar.B);
    }

    public final int hashCode() {
        int iHashCode = (this.f15936b.hashCode() + (this.f15935a.hashCode() * 31)) * 31;
        yb.a aVar = this.f15937c;
        int iHashCode2 = (iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 961;
        ub.b bVar = this.f15938d;
        int iHashCode3 = (iHashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str = this.f15939e;
        return this.B.hashCode() + ((this.A.hashCode() + ((this.f15958z.A.hashCode() + ((this.f15957y.hashCode() + ((this.f15956x.hashCode() + ((this.f15955w.hashCode() + ((this.f15954v.hashCode() + ((this.f15953u.hashCode() + ((this.f15952t.hashCode() + ((this.f15951s.hashCode() + ((this.f15950r.hashCode() + ((this.f15949q.hashCode() + ((this.f15948p.hashCode() + w.c.e(w.c.e(w.c.e(w.c.e((this.f15945k.f15983a.hashCode() + ((((this.f15943i.hashCode() + g4.c.a((this.f15941g.hashCode() + ((this.f15940f.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31)) * 961)) * 29791, 31, this.f15942h)) * 31) + Arrays.hashCode(this.f15944j.A)) * 31)) * 31, 31, this.l), 31, this.m), 31, this.f15946n), 31, this.f15947o)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * (-1807454463))) * 31);
    }
}
