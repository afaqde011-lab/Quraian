package l2;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RenderNode;
import i2.m;
import i2.p0;
import i2.t;

public final class c {

    public final hf.c f9995a;

    public final k2.b f9996b;

    public final RenderNode f9997c;

    public long f9998d;

    public Paint f9999e;

    public Matrix f10000f;

    public boolean f10001g;

    public float f10002h;

    public int f10003i;

    public m f10004j;

    public float f10005k;
    public float l;
    public float m;

    public float f10006n;

    public float f10007o;

    public long f10008p;

    public long f10009q;

    public float f10010r;

    public float f10011s;

    public boolean f10012t;

    public boolean f10013u;

    public boolean f10014v;

    public p0 f10015w;

    public int f10016x;

    public c() {
        hf.c cVar = new hf.c(2);
        k2.b bVar = new k2.b();
        this.f9995a = cVar;
        this.f9996b = bVar;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.f9997c = renderNode;
        this.f9998d = 0L;
        renderNode.setClipToBounds(false);
        b(renderNode, 0);
        this.f10002h = 1.0f;
        this.f10003i = 3;
        this.f10005k = 1.0f;
        this.l = 1.0f;
        long j9 = t.f7162b;
        this.f10008p = j9;
        this.f10009q = j9;
        this.f10011s = 8.0f;
        this.f10016x = 0;
    }

    public final void a() {
        boolean z10 = this.f10012t;
        boolean z11 = false;
        boolean z12 = z10 && !this.f10001g;
        if (z10 && this.f10001g) {
            z11 = true;
        }
        boolean z13 = this.f10013u;
        RenderNode renderNode = this.f9997c;
        if (z12 != z13) {
            this.f10013u = z12;
            renderNode.setClipToBounds(z12);
        }
        if (z11 != this.f10014v) {
            this.f10014v = z11;
            renderNode.setClipToOutline(z11);
        }
    }

    public final void b(RenderNode renderNode, int i10) {
        if (i10 == 1) {
            renderNode.setUseCompositingLayer(true, this.f9999e);
            renderNode.setHasOverlappingRendering(true);
        } else if (i10 == 2) {
            renderNode.setUseCompositingLayer(false, this.f9999e);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.f9999e);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void c(boolean z10) {
        this.f10012t = z10;
        a();
    }

    public final void d() {
        int i10 = this.f10016x;
        RenderNode renderNode = this.f9997c;
        if (i10 != 1 && this.f10003i == 3 && this.f10004j == null && this.f10015w == null) {
            b(renderNode, i10);
        } else {
            b(renderNode, 1);
        }
    }
}
