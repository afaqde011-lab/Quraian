package v2;

import android.view.MotionEvent;

public abstract class r {

    public static final a f15395a = new a(1000);

    public static final a f15396b;

    public static final a f15397c;

    public static final StackTraceElement[] f15398d;

    static {
        new a(1007);
        f15396b = new a(1008);
        f15397c = new a(1002);
        f15398d = new StackTraceElement[0];
    }

    public static final boolean a(s sVar) {
        return (sVar.b() || sVar.f15406h || !sVar.f15402d) ? false : true;
    }

    public static final boolean b(s sVar) {
        return !sVar.f15406h && sVar.f15402d;
    }

    public static final boolean c(s sVar) {
        return (sVar.b() || !sVar.f15406h || sVar.f15402d) ? false : true;
    }

    public static final boolean d(s sVar) {
        return sVar.f15406h && !sVar.f15402d;
    }

    public static final boolean e(long j9, long j10) {
        return j9 == j10;
    }

    public static final boolean f(s sVar, long j9, long j10) {
        int i10 = sVar.f15407i == 1 ? 1 : 0;
        long j11 = sVar.f15401c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j11 & 4294967295L));
        float f3 = i10;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j10 >> 32)) * f3;
        float f10 = ((int) (j9 >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * f3;
        return (fIntBitsToFloat > f10) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j9 & 4294967295L)) + fIntBitsToFloat4);
    }

    public static b2.r g(b2.r rVar, a aVar) {
        return rVar.V(new m(aVar));
    }

    public static final long h(s sVar, boolean z10) {
        long jE = h2.b.e(sVar.f15401c, sVar.f15405g);
        if (z10 || !sVar.b()) {
            return jE;
        }
        return 0L;
    }

    public static final void i(k kVar, long j9, u00.k kVar2, boolean z10) {
        MotionEvent motionEventA = kVar.a();
        if (motionEventA == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEventA.getAction();
        if (z10) {
            motionEventA.setAction(3);
        }
        int i10 = (int) (j9 >> 32);
        int i11 = (int) (j9 & 4294967295L);
        motionEventA.offsetLocation(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
        kVar2.invoke(motionEventA);
        motionEventA.offsetLocation(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
        motionEventA.setAction(action);
    }

    public static String j(long j9) {
        return "PointerId(value=" + j9 + ')';
    }
}
