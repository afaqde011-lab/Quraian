package gv;

import androidx.media3.exoplayer.ExoPlayer;
import java.util.Map;

public final class k implements l1.y {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public k(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public k(u00.a aVar, androidx.lifecycle.w wVar, androidx.lifecycle.l lVar) {
        this.a = 1;
        this.c = aVar;
        this.b = wVar;
        this.d = lVar;
    }

    public final void dispose() {
        androidx.lifecycle.q lifecycle;
        switch (this.a) {
            case 0:
                ((androidx.lifecycle.w) this.b).getLifecycle().d((j) this.c);
                ((ExoPlayer) this.d).release();
                break;
            case 1:
                ((u00.a) this.c).invoke();
                ((androidx.lifecycle.w) this.b).getLifecycle().d((androidx.lifecycle.l) this.d);
                break;
            case 2:
                ((androidx.lifecycle.w) this.b).getLifecycle().d((j) this.c);
                ((ExoPlayer) this.d).release();
                break;
            case 3:
                ((androidx.lifecycle.w) this.b).getLifecycle().d((lu.v) this.c);
                e.d dVar = (e.d) ((kotlin.jvm.internal.z) this.d).A;
                if (dVar != null) {
                    dVar.a();
                }
                break;
            case 4:
                androidx.lifecycle.w wVar = (androidx.lifecycle.w) this.b;
                if (wVar != null && (lifecycle = wVar.getLifecycle()) != null) {
                    lifecycle.d((androidx.lifecycle.l) this.c);
                }
                r6.a aVar = (r6.a) this.d;
                androidx.lifecycle.o oVar = androidx.lifecycle.o.ON_DESTROY;
                aVar.getClass();
                aVar.B = oVar.a();
                aVar.a();
                break;
            case 5:
                z1.p pVar = (z1.p) this.b;
                Object obj = this.c;
                pVar.remove(obj);
                ((w.v) this.d).d.k(obj);
                break;
            default:
                y1.d dVar2 = (y1.d) this.b;
                u.i0 i0Var = dVar2.B;
                Object obj2 = this.c;
                Object objK = i0Var.k(obj2);
                y1.i iVar = (y1.i) this.d;
                if (objK == iVar) {
                    Map map = dVar2.A;
                    Map mapB = iVar.b();
                    if (!mapB.isEmpty()) {
                        map.put(obj2, mapB);
                    } else {
                        map.remove(obj2);
                    }
                }
                break;
        }
    }
}
