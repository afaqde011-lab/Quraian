package z7;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;
import y7.t;

public final class k extends GLSurfaceView {
    public static final int L = 0;
    public final CopyOnWriteArrayList A;
    public final SensorManager B;
    public final Sensor C;
    public final d D;
    public final Handler E;
    public final i F;
    public SurfaceTexture G;
    public Surface H;
    public boolean I;
    public boolean J;
    public boolean K;

    public k(Context context) {
        super(context, null);
        this.A = new CopyOnWriteArrayList();
        this.E = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.B = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.C = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.F = iVar;
        j jVar = new j(this, iVar);
        View.OnTouchListener lVar = new l(context, jVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.D = new d(windowManager.getDefaultDisplay(), lVar, jVar);
        this.I = true;
        setEGLContextClientVersion(2);
        setRenderer(jVar);
        setOnTouchListener(lVar);
    }

    public final void a() {
        boolean z10 = this.I && this.J;
        Sensor sensor = this.C;
        if (sensor == null || z10 == this.K) {
            return;
        }
        d dVar = this.D;
        SensorManager sensorManager = this.B;
        if (z10) {
            sensorManager.registerListener(dVar, sensor, 0);
        } else {
            sensorManager.unregisterListener(dVar);
        }
        this.K = z10;
    }

    public a getCameraMotionListener() {
        return this.F;
    }

    public t getVideoFrameMetadataListener() {
        return this.F;
    }

    public Surface getVideoSurface() {
        return this.H;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E.post(new m9.f(this, 23));
    }

    @Override
    public final void onPause() {
        this.J = false;
        a();
        super.onPause();
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.J = true;
        a();
    }

    public void setDefaultStereoMode(int i10) {
        this.F.K = i10;
    }

    public void setUseSensorRotation(boolean z10) {
        this.I = z10;
        a();
    }
}
