package ec;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

public final class f implements j, fc.a, c {

    public final cc.i f5266b;

    public final fc.h f5267c;

    public final fc.e f5268d;

    public final kc.a f5269e;

    public boolean f5271g;

    public final Path f5265a = new Path();

    public final db.g f5270f = new db.g(1, (byte) 0);

    public f(cc.i iVar, lc.b bVar, kc.a aVar) {
        this.f5266b = iVar;
        fc.e eVarM0 = aVar.f9583b.m0();
        this.f5267c = (fc.h) eVarM0;
        fc.e eVarM1 = aVar.f9582a.m0();
        this.f5268d = eVarM1;
        this.f5269e = aVar;
        bVar.f(eVarM0);
        bVar.f(eVarM1);
        eVarM0.a(this);
        eVarM1.a(this);
    }

    @Override
    public final void a() {
        this.f5271g = false;
        this.f5266b.invalidateSelf();
    }

    @Override
    public final void b(List list, List list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i10 >= arrayList.size()) {
                return;
            }
            c cVar = (c) arrayList.get(i10);
            if (cVar instanceof q) {
                q qVar = (q) cVar;
                if (qVar.f5351c == 1) {
                    this.f5270f.B.add(qVar);
                    qVar.f(this);
                }
            }
            i10++;
        }
    }

    @Override
    public final Path e() {
        boolean z10 = this.f5271g;
        Path path = this.f5265a;
        if (z10) {
            return path;
        }
        path.reset();
        kc.a aVar = this.f5269e;
        if (aVar.f9585d) {
            this.f5271g = true;
            return path;
        }
        PointF pointF = (PointF) this.f5267c.e();
        float f3 = pointF.x / 2.0f;
        float f10 = pointF.y / 2.0f;
        float f11 = f3 * 0.55228f;
        float f12 = f10 * 0.55228f;
        path.reset();
        if (aVar.f9584c) {
            float f13 = -f10;
            path.moveTo(0.0f, f13);
            float f14 = 0.0f - f11;
            float f15 = -f3;
            float f16 = 0.0f - f12;
            path.cubicTo(f14, f13, f15, f16, f15, 0.0f);
            float f17 = f12 + 0.0f;
            path.cubicTo(f15, f17, f14, f10, 0.0f, f10);
            float f18 = f11 + 0.0f;
            path.cubicTo(f18, f10, f3, f17, f3, 0.0f);
            path.cubicTo(f3, f16, f18, f13, 0.0f, f13);
        } else {
            float f19 = -f10;
            path.moveTo(0.0f, f19);
            float f20 = f11 + 0.0f;
            float f21 = 0.0f - f12;
            path.cubicTo(f20, f19, f3, f21, f3, 0.0f);
            float f22 = f12 + 0.0f;
            path.cubicTo(f3, f22, f20, f10, 0.0f, f10);
            float f23 = 0.0f - f11;
            float f24 = -f3;
            path.cubicTo(f23, f10, f24, f22, f24, 0.0f);
            path.cubicTo(f24, f21, f23, f19, 0.0f, f19);
        }
        PointF pointF2 = (PointF) this.f5268d.e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f5270f.h(path);
        this.f5271g = true;
        return path;
    }
}
