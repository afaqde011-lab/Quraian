package c3;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

public final class d1 {

    public final Matrix f2642a = new Matrix();

    public final int[] f2643b = new int[2];

    public void a(View view, float[] fArr) {
        Matrix matrix = this.f2642a;
        matrix.reset();
        View view2 = view;
        view2.transformMatrixToGlobal(matrix);
        ViewParent parent = view2.getParent();
        while (parent instanceof View) {
            view2 = parent;
            parent = view2.getParent();
        }
        int[] iArr = this.f2643b;
        view2.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        view2.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i10, iArr[1] - i11);
        matrix.getValues(fArr);
        float f3 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[2];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        float f17 = fArr[8];
        fArr[0] = f3;
        fArr[1] = f12;
        fArr[2] = 0.0f;
        fArr[3] = f15;
        fArr[4] = f10;
        fArr[5] = f13;
        fArr[6] = 0.0f;
        fArr[7] = f16;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f11;
        fArr[13] = f14;
        fArr[14] = 0.0f;
        fArr[15] = f17;
    }
}
