package e50;

import java.io.IOException;

public final class i extends a50.a {
    public final int e;
    public final m f;
    public final int g;
    public final int h;

    public i(String str, m mVar, int i, int i2, int i3) {
        super(str, true);
        this.e = i3;
        this.f = mVar;
        this.g = i;
        this.h = i2;
    }

    @Override
    public final long a() {
        switch (this.e) {
            case 0:
                m mVar = this.f;
                try {
                    mVar.W.x(this.g, this.h, true);
                    return -1L;
                } catch (IOException e) {
                    mVar.a(2, 2, e);
                    return -1L;
                }
            case 1:
                x xVar = this.f.K;
                int i = this.h;
                xVar.getClass();
                g4.c.q(i, "errorCode");
                synchronized (this.f) {
                    this.f.Y.remove(Integer.valueOf(this.g));
                }
                return -1L;
            default:
                m mVar2 = this.f;
                try {
                    int i2 = this.g;
                    int i3 = this.h;
                    g4.c.q(i3, "statusCode");
                    mVar2.W.A(i2, i3);
                    return -1L;
                } catch (IOException e2) {
                    mVar2.a(2, 2, e2);
                    return -1L;
                }
        }
    }
}
