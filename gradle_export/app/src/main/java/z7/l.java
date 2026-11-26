package z7;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public final class l extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, c {
    public final j C;
    public final GestureDetector E;
    public final PointF A = new PointF();
    public final PointF B = new PointF();
    public final float D = 25.0f;
    public volatile float F = 3.1415927f;

    public l(Context context, j jVar) {
        this.C = jVar;
        this.E = new GestureDetector(context, this);
    }

    @Override
    public final void a(float[] fArr, float f3) {
        this.F = -f3;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        this.A.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, float f10) {
        float x2 = (motionEvent2.getX() - this.A.x) / this.D;
        float y10 = motionEvent2.getY();
        PointF pointF = this.A;
        float f11 = (y10 - pointF.y) / this.D;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d3 = this.F;
        float fCos = (float) Math.cos(d3);
        float fSin = (float) Math.sin(d3);
        PointF pointF2 = this.B;
        pointF2.x -= (fCos * x2) - (fSin * f11);
        float f12 = (fCos * f11) + (fSin * x2) + pointF2.y;
        pointF2.y = f12;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f12));
        j jVar = this.C;
        PointF pointF3 = this.B;
        synchronized (jVar) {
            float f13 = pointF3.y;
            jVar.G = f13;
            Matrix.setRotateM(jVar.E, 0, -f13, (float) Math.cos(jVar.H), (float) Math.sin(jVar.H), 0.0f);
            Matrix.setRotateM(jVar.F, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.C.K.performClick();
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.E.onTouchEvent(motionEvent);
    }
}
