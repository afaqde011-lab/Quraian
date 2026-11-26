package fc;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

public final class m extends e {

    public final PointF f5622h;

    public final PointF f5623i;

    public final f f5624j;

    public final f f5625k;

    public m(f fVar, f fVar2) {
        super(Collections.EMPTY_LIST);
        this.f5622h = new PointF();
        this.f5623i = new PointF();
        this.f5624j = fVar;
        this.f5625k = fVar2;
        h(this.f5599d);
    }

    @Override
    public final Object e() {
        PointF pointF = this.f5622h;
        float f3 = pointF.x;
        PointF pointF2 = this.f5623i;
        pointF2.set(f3, 0.0f);
        pointF2.set(pointF2.x, pointF.y);
        return pointF2;
    }

    @Override
    public final Object f(pc.a aVar, float f3) {
        PointF pointF = this.f5622h;
        float f10 = pointF.x;
        PointF pointF2 = this.f5623i;
        pointF2.set(f10, 0.0f);
        pointF2.set(pointF2.x, pointF.y);
        return pointF2;
    }

    @Override
    public final void h(float f3) {
        f fVar = this.f5624j;
        fVar.h(f3);
        f fVar2 = this.f5625k;
        fVar2.h(f3);
        this.f5622h.set(((Float) fVar.e()).floatValue(), ((Float) fVar2.e()).floatValue());
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f5596a;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i10)).a();
            i10++;
        }
    }
}
