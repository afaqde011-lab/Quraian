package e2;

import android.view.DragEvent;
import android.view.View;
import b3.m;
import b3.n0;
import b3.n2;
import kotlin.jvm.internal.v;

public final class b implements View.OnDragListener, e {

    public final g f5043a = new g(null, 3);

    public final u.f f5044b = new u.f(null);

    public final a f5045c = new a(this);

    @Override
    public final boolean onDrag(View view, DragEvent dragEvent) {
        d dVar = new d(dragEvent);
        int action = dragEvent.getAction();
        u.f fVar = this.f5044b;
        g gVar = this.f5043a;
        switch (action) {
            case 1:
                v vVar = new v();
                n0 n0Var = new n0(dVar, gVar, vVar, 2);
                if (n0Var.invoke(gVar) == n2.A) {
                    m.E(gVar, n0Var);
                }
                boolean z10 = vVar.A;
                fVar.getClass();
                u.a aVar = new u.a(fVar);
                while (aVar.hasNext()) {
                    ((h) aVar.next()).E0(dVar);
                }
                return z10;
            case 2:
                gVar.v0(dVar);
                return false;
            case 3:
                return gVar.l0(dVar);
            case 4:
                gVar.l1(dVar);
                fVar.clear();
                return false;
            case 5:
                gVar.V0(dVar);
                return false;
            case 6:
                gVar.s(dVar);
                return false;
            default:
                return false;
        }
    }
}
