package i3;

import a1.k0;
import a40.c0;
import a40.q1;
import a40.u1;
import ab.a0;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import bv.y2;
import c3.z;
import g00.b0;
import j3.s;
import java.util.function.Consumer;
import k00.i;
import l1.i1;
import l1.q;
import ri.t1;
import y3.k;

public final class c implements ScrollCaptureCallback {

    public final s f7179a;

    public final k f7180b;

    public final hf.c f7181c;

    public final z f7182d;

    public final f40.c f7183e;

    public final f f7184f;

    public c(s sVar, k kVar, f40.c cVar, hf.c cVar2, z zVar) {
        this.f7179a = sVar;
        this.f7180b = kVar;
        this.f7181c = cVar2;
        this.f7182d = zVar;
        this.f7183e = new f40.c(cVar.A.plus(d.A));
        this.f7184f = new f(kVar.b(), new y2(this, (k00.c) null));
    }

    public static final Object a(c cVar, ScrollCaptureSession scrollCaptureSession, k kVar, m00.c cVar2) {
        a aVar;
        int i10;
        int i11;
        ScrollCaptureSession scrollCaptureSession2;
        k kVar2;
        int i12;
        int i13;
        int iY;
        int iY2;
        int i14;
        int i15;
        Canvas canvasLockHardwareCanvas;
        f fVar = cVar.f7184f;
        if (cVar2 instanceof a) {
            aVar = (a) cVar2;
            int i16 = aVar.G;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                aVar.G = i16 - Integer.MIN_VALUE;
            } else {
                aVar = new a(cVar, cVar2);
            }
        } else {
            aVar = new a(cVar, cVar2);
        }
        Object obj = aVar.E;
        l00.a aVar2 = l00.a.A;
        int i17 = aVar.G;
        if (i17 == 0) {
            t1.O(obj);
            i10 = kVar.f16593b;
            i11 = kVar.f16595d;
            aVar.A = scrollCaptureSession;
            aVar.B = kVar;
            aVar.C = i10;
            aVar.D = i11;
            aVar.G = 1;
            int i18 = fVar.f7185a;
            if (i10 > i11) {
                throw new IllegalArgumentException(w.c.h(i10, i11, "Expected min=", " ≤ max=").toString());
            }
            int i19 = i11 - i10;
            if (i19 > i18) {
                throw new IllegalArgumentException(w.c.h(i19, i18, "Expected range (", ") to be ≤ viewportSize=").toString());
            }
            float f3 = i10;
            float f10 = fVar.f7186b;
            Object obj2 = b0.a;
            if (f3 < f10 || i11 > i18 + f10) {
                Object objB = fVar.b((((i19 / 2) + i10) - (i18 / 2)) - f10, aVar);
                if (objB != aVar2) {
                    objB = obj2;
                }
                if (objB == aVar2) {
                    obj2 = objB;
                }
            }
            if (obj2 != aVar2) {
            }
            return aVar2;
        }
        if (i17 == 1) {
            int i20 = aVar.D;
            int i21 = aVar.C;
            k kVar3 = aVar.B;
            ScrollCaptureSession scrollCaptureSession3 = aVar.A;
            t1.O(obj);
            i10 = i21;
            kVar = kVar3;
            i11 = i20;
            scrollCaptureSession = scrollCaptureSession3;
        } else {
            if (i17 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = aVar.D;
            i12 = aVar.C;
            kVar2 = aVar.B;
            scrollCaptureSession2 = aVar.A;
            t1.O(obj);
        }
        float f11 = fVar.f7186b;
        int i22 = fVar.f7185a;
        iY = a0.y(i12 - w00.a.F(f11), 0, i22);
        iY2 = a0.y(i13 - w00.a.F(fVar.f7186b), 0, i22);
        i14 = kVar2.f16592a;
        i15 = kVar2.f16594c;
        if (iY == iY2) {
            return k.f16591e;
        }
        canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i14, -iY);
            k kVar4 = cVar.f7180b;
            canvasLockHardwareCanvas.translate(-kVar4.f16592a, -kVar4.f16593b);
            cVar.f7182d.getRootView().draw(canvasLockHardwareCanvas);
            int iF = w00.a.F(fVar.f7186b);
            return new k(i14, iY + iF, i15, iY2 + iF);
        } finally {
            scrollCaptureSession2.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        b bVar = b.B;
        aVar.A = scrollCaptureSession;
        aVar.B = kVar;
        aVar.C = i10;
        aVar.D = i11;
        aVar.G = 2;
        if (q.u(aVar.getContext()).b0(bVar, aVar) != aVar2) {
            scrollCaptureSession2 = scrollCaptureSession;
            kVar2 = kVar;
            i12 = i10;
            i13 = i11;
            float f12 = fVar.f7186b;
            int i23 = fVar.f7185a;
            iY = a0.y(i12 - w00.a.F(f12), 0, i23);
            iY2 = a0.y(i13 - w00.a.F(fVar.f7186b), 0, i23);
            i14 = kVar2.f16592a;
            i15 = kVar2.f16594c;
            if (iY == iY2) {
                return k.f16591e;
            }
            canvasLockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i14, -iY);
            k kVar5 = cVar.f7180b;
            canvasLockHardwareCanvas.translate(-kVar5.f16592a, -kVar5.f16593b);
            cVar.f7182d.getRootView().draw(canvasLockHardwareCanvas);
            int iF2 = w00.a.F(fVar.f7186b);
            return new k(i14, iY + iF2, i15, iY2 + iF2);
        }
        return aVar2;
    }

    @Override
    public final void onScrollCaptureEnd(Runnable runnable) {
        c0.y(this.f7183e, q1.B, (a40.a0) null, new g6.a(this, runnable, null, 8), 2);
    }

    @Override
    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        u1 u1VarY = c0.y(this.f7183e, (i) null, (a40.a0) null, new a1.g(this, scrollCaptureSession, rect, consumer, null, 28), 3);
        u1VarY.f0(new f5.e(cancellationSignal, 1));
        cancellationSignal.setOnCancelListener(new k0(u1VarY, 2));
    }

    @Override
    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(i2.b0.z(this.f7180b));
    }

    @Override
    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f7184f.f7186b = 0.0f;
        ((i1) this.f7181c.B).setValue(Boolean.TRUE);
        runnable.run();
    }
}
