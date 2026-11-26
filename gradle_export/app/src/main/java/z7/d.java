package z7;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

public final class d implements SensorEventListener {

    public final float[] f17253a = new float[16];

    public final float[] f17254b = new float[16];

    public final float[] f17255c = new float[16];

    public final float[] f17256d = new float[3];

    public final Display f17257e;

    public final c[] f17258f;

    public boolean f17259g;

    public d(Display display, c... cVarArr) {
        this.f17257e = display;
        this.f17258f = cVarArr;
    }

    @Override
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i10;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.f17253a;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f17257e.getRotation();
        float[] fArr3 = this.f17254b;
        if (rotation != 0) {
            int i11 = 129;
            if (rotation != 1) {
                i10 = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i11 = 130;
                    i10 = 1;
                }
            } else {
                i10 = 129;
                i11 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i11, i10, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.f17256d;
        SensorManager.getOrientation(fArr3, fArr4);
        float f3 = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z10 = this.f17259g;
        float[] fArr5 = this.f17255c;
        if (!z10) {
            c7.c.e(fArr5, fArr2);
            this.f17259g = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        for (int i12 = 0; i12 < 2; i12++) {
            this.f17258f[i12].a(fArr2, f3);
        }
    }
}
