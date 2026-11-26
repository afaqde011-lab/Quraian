package e2;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import i2.s;
import u00.k;
import y3.m;

public final class c extends View.DragShadowBuilder {

    public final y3.d f5046a;

    public final long f5047b;

    public final k f5048c;

    public c(y3.d dVar, long j9, k kVar) {
        this.f5046a = dVar;
        this.f5047b = j9;
        this.f5048c = kVar;
    }

    @Override
    public final void onDrawShadow(Canvas canvas) {
        k2.b bVar = new k2.b();
        m mVar = m.A;
        Canvas canvas2 = i2.b.f7109a;
        i2.a aVar = new i2.a();
        aVar.f7106a = canvas;
        k2.a aVar2 = bVar.A;
        y3.c cVar = aVar2.f8916a;
        m mVar2 = aVar2.f8917b;
        s sVar = aVar2.f8918c;
        long j9 = aVar2.f8919d;
        aVar2.f8916a = this.f5046a;
        aVar2.f8917b = mVar;
        aVar2.f8918c = aVar;
        aVar2.f8919d = this.f5047b;
        aVar.i();
        this.f5048c.invoke(bVar);
        aVar.q();
        aVar2.f8916a = cVar;
        aVar2.f8917b = mVar2;
        aVar2.f8918c = sVar;
        aVar2.f8919d = j9;
    }

    @Override
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j9 = this.f5047b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
        y3.d dVar = this.f5046a;
        point.set(dVar.R0(fIntBitsToFloat / dVar.c()), dVar.R0(Float.intBitsToFloat((int) (j9 & 4294967295L)) / dVar.c()));
        point2.set(point.x / 2, point.y / 2);
    }
}
