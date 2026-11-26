package ba;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

public final class k implements ValueAnimator.AnimatorUpdateListener {

    public final int f2320a;

    public final Object f2321b;

    public k(Object obj, int i10) {
        this.f2320a = i10;
        this.f2321b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f3;
        switch (this.f2320a) {
            case 0:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                l lVar = (l) this.f2321b;
                lVar.f2325c.setAlpha(iFloatValue);
                lVar.f2326d.setAlpha(iFloatValue);
                lVar.f2339s.invalidate();
                break;
            case 1:
                cc.i iVar = (cc.i) this.f2321b;
                lc.c cVar = iVar.H;
                if (cVar != null) {
                    oc.c cVar2 = iVar.B;
                    cc.a aVar = cVar2.L;
                    if (aVar == null) {
                        f3 = 0.0f;
                    } else {
                        float f10 = cVar2.H;
                        float f11 = aVar.f3115j;
                        f3 = (f10 - f11) / (aVar.f3116k - f11);
                    }
                    cVar.n(f3);
                }
                break;
            case 2:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.i iVar2 = ((BottomSheetBehavior) this.f2321b).f4121i;
                if (iVar2 != null) {
                    sg.g gVar = iVar2.B;
                    if (gVar.f14159j != fFloatValue) {
                        gVar.f14159j = fFloatValue;
                        iVar2.F = true;
                        iVar2.G = true;
                        iVar2.invalidateSelf();
                    }
                }
                break;
            default:
                ((TextInputLayout) this.f2321b).W0.m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
