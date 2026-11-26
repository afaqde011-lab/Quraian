package k9;

import java.util.List;

public final class y2 implements l3, m3 {
    public final int A;
    public final p3 B;
    public final int C;

    public y2(p3 p3Var, int i10, int i11) {
        this.A = i11;
        this.B = p3Var;
        this.C = i10;
    }

    @Override
    public void b(v3 v3Var, a2 a2Var, List list) {
        switch (this.A) {
            case 1:
                v3Var.addMediaItems(this.B.i2(a2Var, v3Var, this.C), list);
                break;
            case 2:
                p3 p3Var = this.B;
                p3Var.getClass();
                int size = list.size();
                int i10 = this.C;
                if (size != 1) {
                    v3Var.replaceMediaItems(p3Var.i2(a2Var, v3Var, i10), p3Var.i2(a2Var, v3Var, i10 + 1), list);
                } else {
                    v3Var.replaceMediaItem(p3Var.i2(a2Var, v3Var, i10), (androidx.media3.common.q0) list.get(0));
                }
                break;
            default:
                v3Var.addMediaItems(this.B.i2(a2Var, v3Var, this.C), list);
                break;
        }
    }

    @Override
    public void f(v3 v3Var, a2 a2Var) {
        switch (this.A) {
            case 0:
                v3Var.seekToDefaultPosition(this.B.i2(a2Var, v3Var, this.C));
                break;
            default:
                v3Var.removeMediaItem(this.B.i2(a2Var, v3Var, this.C));
                break;
        }
    }
}
