package rb;

import android.content.Context;
import java.util.List;
import ri.t1;
import wb.j;
import wb.k;

public final class i {

    public final wb.i f13143a;

    public final List f13144b;

    public final int f13145c;

    public final wb.i f13146d;

    public final xb.g f13147e;

    public final lb.c f13148f;

    public final boolean f13149g;

    public i(wb.i iVar, List list, int i10, wb.i iVar2, xb.g gVar, lb.c cVar, boolean z10) {
        this.f13143a = iVar;
        this.f13144b = list;
        this.f13145c = i10;
        this.f13146d = iVar2;
        this.f13147e = gVar;
        this.f13148f = cVar;
        this.f13149g = z10;
    }

    public final void a(wb.i iVar, g gVar) {
        Context context = iVar.f15935a;
        wb.i iVar2 = this.f13143a;
        if (context != iVar2.f15935a) {
            throw new IllegalStateException(("Interceptor '" + gVar + "' cannot modify the request's context.").toString());
        }
        if (iVar.f15936b == k.f15959a) {
            throw new IllegalStateException(("Interceptor '" + gVar + "' cannot set the request's data to null.").toString());
        }
        if (iVar.f15937c != iVar2.f15937c) {
            throw new IllegalStateException(("Interceptor '" + gVar + "' cannot modify the request's target.").toString());
        }
        if (iVar.f15955w != iVar2.f15955w) {
            throw new IllegalStateException(("Interceptor '" + gVar + "' cannot modify the request's lifecycle.").toString());
        }
        if (iVar.f15956x == iVar2.f15956x) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + gVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    public final Object b(wb.i iVar, m00.c cVar) {
        h hVar;
        g gVar;
        Object objD;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i10 = hVar.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.E = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object obj = hVar.C;
        l00.a aVar = l00.a.A;
        int i11 = hVar.E;
        if (i11 == 0) {
            t1.O(obj);
            List list = this.f13144b;
            int i12 = this.f13145c;
            if (i12 > 0) {
                a(iVar, (g) list.get(i12 - 1));
            }
            gVar = (g) list.get(i12);
            i iVar2 = new i(this.f13143a, this.f13144b, i12 + 1, iVar, this.f13147e, this.f13148f, this.f13149g);
            hVar.A = this;
            hVar.B = gVar;
            hVar.E = 1;
            objD = gVar.d(iVar2, hVar);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g gVar2 = hVar.B;
            i iVar3 = hVar.A;
            t1.O(obj);
            gVar = gVar2;
            this = iVar3;
            objD = obj;
        }
        j jVar = (j) objD;
        this.a(jVar.b(), gVar);
        return jVar;
    }
}
