package j4;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

public final class p extends View {
    public p(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override
    public final void draw(Canvas canvas) {
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i10) {
        e eVar = (e) getLayoutParams();
        eVar.f8016a = i10;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i10) {
        e eVar = (e) getLayoutParams();
        eVar.f8018b = i10;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f3) {
        e eVar = (e) getLayoutParams();
        eVar.f8020c = f3;
        setLayoutParams(eVar);
    }

    @Override
    public void setVisibility(int i10) {
    }
}
