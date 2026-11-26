package u5;

import android.view.View;
import kh.n;
import sg.v;

public final class c extends n {

    public final int f14955a;

    public c(int i10) {
        this.f14955a = i10;
    }

    @Override
    public final float O(v vVar) {
        switch (this.f14955a) {
            case 0:
                return ((View) vVar).getAlpha();
            case 1:
                return ((View) vVar).getScaleX();
            case 2:
                return ((View) vVar).getScaleY();
            case 3:
                return ((View) vVar).getRotation();
            case 4:
                return ((View) vVar).getRotationX();
            default:
                return ((View) vVar).getRotationY();
        }
    }

    @Override
    public final void c0(v vVar, float f3) {
        switch (this.f14955a) {
            case 0:
                ((View) vVar).setAlpha(f3);
                break;
            case 1:
                ((View) vVar).setScaleX(f3);
                break;
            case 2:
                ((View) vVar).setScaleY(f3);
                break;
            case 3:
                ((View) vVar).setRotation(f3);
                break;
            case 4:
                ((View) vVar).setRotationX(f3);
                break;
            default:
                ((View) vVar).setRotationY(f3);
                break;
        }
    }
}
