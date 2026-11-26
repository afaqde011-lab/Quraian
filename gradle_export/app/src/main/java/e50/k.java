package e50;

import java.io.IOException;
import java.util.List;

public final class k extends a50.a {
    public final int e = 1;
    public final m f;
    public final int g;
    public final List h;

    public k(String str, m mVar, int i, List list) {
        super(str, true);
        this.f = mVar;
        this.g = i;
        this.h = list;
    }

    public k(String str, m mVar, int i, List list, boolean z) {
        super(str, true);
        this.f = mVar;
        this.g = i;
        this.h = list;
    }

    @Override
    public final long a() {
        switch (this.e) {
            case 0:
                this.f.K.getClass();
                try {
                    this.f.W.A(this.g, 9);
                    synchronized (this.f) {
                        this.f.Y.remove(Integer.valueOf(this.g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f.K.getClass();
                try {
                    this.f.W.A(this.g, 9);
                    synchronized (this.f) {
                        this.f.Y.remove(Integer.valueOf(this.g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }
}
