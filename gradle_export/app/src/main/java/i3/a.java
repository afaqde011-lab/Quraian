package i3;

import android.view.ScrollCaptureSession;
import y3.k;

public final class a extends m00.c {
    public ScrollCaptureSession A;
    public k B;
    public int C;
    public int D;
    public Object E;
    public final c F;
    public int G;

    public a(c cVar, m00.c cVar2) {
        super(cVar2);
        this.F = cVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return c.a(this.F, null, null, this);
    }
}
