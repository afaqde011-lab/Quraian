package m9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class y extends AnimatorListenerAdapter {

    public final int f10773a;

    public final u f10774b;

    public final z f10775c;

    public y(z zVar, u uVar, int i10) {
        this.f10773a = i10;
        this.f10775c = zVar;
        this.f10774b = uVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f10773a) {
            case 0:
                z zVar = this.f10775c;
                zVar.i(1);
                if (zVar.C) {
                    this.f10774b.post(zVar.f10793t);
                    zVar.C = false;
                }
                break;
            case 1:
                z zVar2 = this.f10775c;
                zVar2.i(2);
                if (zVar2.C) {
                    this.f10774b.post(zVar2.f10793t);
                    zVar2.C = false;
                }
                break;
            default:
                z zVar3 = this.f10775c;
                zVar3.i(2);
                if (zVar3.C) {
                    this.f10774b.post(zVar3.f10793t);
                    zVar3.C = false;
                }
                break;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f10773a) {
            case 0:
                this.f10775c.i(3);
                break;
            case 1:
                this.f10775c.i(3);
                break;
            default:
                this.f10775c.i(3);
                break;
        }
    }
}
