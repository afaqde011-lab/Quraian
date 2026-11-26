package z4;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.google.android.gms.cast.CredentialsData;
import java.util.Map;
import java.util.Objects;

public final class d {

    public final Context f17181a;

    public final e f17182b;

    public VelocityTracker f17183c;

    public float f17184d;

    public int f17185e = -1;

    public int f17186f = -1;

    public int f17187g = -1;

    public final int[] f17188h = {Integer.MAX_VALUE, 0};

    public d(Context context, e eVar) {
        this.f17181a = context;
        this.f17182b = eVar;
    }

    public final void a(MotionEvent motionEvent, int i10) {
        int i11;
        int i12;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z10;
        float f3;
        float yVelocity;
        long j9;
        float fSqrt;
        float f10;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i13 = this.f17186f;
        int[] iArr = this.f17188h;
        if (i13 == source && this.f17187g == deviceId && this.f17185e == i10) {
            z10 = false;
            i11 = 1;
            i12 = 0;
        } else {
            Context context = this.f17181a;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            i11 = 1;
            int i14 = Build.VERSION.SDK_INT;
            i12 = 0;
            if (i14 >= 34) {
                scaledMinimumFlingVelocity = a5.b.g(viewConfiguration, deviceId2, i10, source2);
            } else {
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i10, source2) == null) {
                    scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                } else {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i10 == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", CredentialsData.CREDENTIALS_TYPE_ANDROID) : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                        scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                    }
                }
            }
            iArr[0] = scaledMinimumFlingVelocity;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i14 >= 34) {
                scaledMaximumFlingVelocity = a5.b.f(viewConfiguration, deviceId3, i10, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 == null || device2.getMotionRange(i10, source3) == null) {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                } else {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i10 == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", CredentialsData.CREDENTIALS_TYPE_ANDROID) : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    }
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            this.f17186f = source;
            this.f17187g = deviceId;
            this.f17185e = i10;
            z10 = true;
        }
        if (iArr[i12] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f17183c;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f17183c = null;
                return;
            }
            return;
        }
        if (this.f17183c == null) {
            this.f17183c = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.f17183c;
        Map map = y.f17231a;
        velocityTracker2.addMovement(motionEvent);
        float f11 = 0.0f;
        int i15 = 20;
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = y.f17231a;
            if (!map2.containsKey(velocityTracker2)) {
                map2.put(velocityTracker2, new z());
            }
            z zVar = (z) map2.get(velocityTracker2);
            long[] jArr = zVar.f17242b;
            long eventTime = motionEvent.getEventTime();
            if (zVar.f17244d != 0 && eventTime - jArr[zVar.f17245e] > 40) {
                zVar.f17244d = i12;
                zVar.f17243c = 0.0f;
            }
            int i16 = (zVar.f17245e + 1) % 20;
            zVar.f17245e = i16;
            int i17 = zVar.f17244d;
            if (i17 != 20) {
                zVar.f17244d = i17 + 1;
            }
            zVar.f17241a[i16] = motionEvent.getAxisValue(26);
            jArr[zVar.f17245e] = eventTime;
        }
        velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
        z zVar2 = (z) y.f17231a.get(velocityTracker2);
        if (zVar2 != null) {
            float[] fArr = zVar2.f17241a;
            long[] jArr2 = zVar2.f17242b;
            int i18 = zVar2.f17244d;
            if (i18 < 2) {
                fSqrt = 0.0f;
                f3 = 0.0f;
            } else {
                int i19 = zVar2.f17245e;
                int i20 = ((i19 + 20) - (i18 - 1)) % 20;
                long j10 = jArr2[i19];
                while (true) {
                    j9 = jArr2[i20];
                    if (j10 - j9 <= 100) {
                        break;
                    }
                    zVar2.f17244d--;
                    i20 = (i20 + 1) % 20;
                }
                int i21 = zVar2.f17244d;
                if (i21 < 2) {
                    fSqrt = 0.0f;
                    f3 = 0.0f;
                } else if (i21 == 2) {
                    int i22 = (i20 + 1) % 20;
                    long j11 = jArr2[i22];
                    if (j9 == j11) {
                        fSqrt = 0.0f;
                        f3 = 0.0f;
                    } else {
                        fSqrt = fArr[i22] / (j11 - j9);
                        f3 = 0.0f;
                    }
                } else {
                    float fAbs = 0.0f;
                    int i23 = 0;
                    int i24 = 0;
                    while (true) {
                        if (i23 >= zVar2.f17244d - 1) {
                            break;
                        }
                        int i25 = i23 + i20;
                        long j12 = jArr2[i25 % 20];
                        int i26 = (i25 + 1) % i15;
                        if (jArr2[i26] == j12) {
                            f10 = f11;
                        } else {
                            i24++;
                            f10 = f11;
                            float fSqrt2 = (fAbs < f11 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                            float f12 = fArr[i26] / (jArr2[i26] - j12);
                            fAbs += Math.abs(f12) * (f12 - fSqrt2);
                            if (i24 == i11) {
                                fAbs *= 0.5f;
                            }
                        }
                        i23++;
                        f11 = f10;
                        i15 = 20;
                        i11 = 1;
                    }
                    f3 = f11;
                    fSqrt = (fAbs < f3 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                }
            }
            float f13 = fSqrt * 1000;
            zVar2.f17243c = f13;
            if (f13 < (-Math.abs((float) r4))) {
                zVar2.f17243c = -Math.abs(Float.MAX_VALUE);
            } else if (zVar2.f17243c > Math.abs((float) r4)) {
                zVar2.f17243c = Math.abs((float) r4);
            }
        } else {
            f3 = 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            yVelocity = a5.b.b(velocityTracker2, i10);
        } else if (i10 == 0) {
            yVelocity = velocityTracker2.getXVelocity();
        } else if (i10 == 1) {
            yVelocity = velocityTracker2.getYVelocity();
        } else {
            z zVar3 = (z) y.f17231a.get(velocityTracker2);
            yVelocity = (zVar3 == null || i10 != 26) ? f3 : zVar3.f17243c;
        }
        e eVar = this.f17182b;
        float fT = eVar.t() * yVelocity;
        float fSignum = Math.signum(fT);
        if (z10 || (fSignum != Math.signum(this.f17184d) && fSignum != f3)) {
            eVar.F();
        }
        if (Math.abs(fT) < iArr[0]) {
            return;
        }
        int i27 = iArr[1];
        float fMax = Math.max(-i27, Math.min(fT, i27));
        this.f17184d = eVar.d(fMax) ? fMax : f3;
    }
}
