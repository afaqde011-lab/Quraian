package wc;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import g00.k;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.m;
import rc.f;
import rc.s;
import u00.n;

public final class a implements GestureDetector.OnGestureListener {
    public final kotlin.jvm.internal.a A;
    public final cd.b B;
    public final List C;
    public final f D;
    public b3.a E;
    public final WeakReference F;

    public a(Activity activity, n nVar, cd.b bVar, List list, f fVar) {
        m.e(bVar, "logger");
        m.e(list, "viewTargetLocators");
        m.e(fVar, "autocaptureState");
        this.A = (kotlin.jvm.internal.a) nVar;
        this.B = bVar;
        this.C = list;
        this.D = fVar;
        this.E = null;
        this.F = new WeakReference(activity);
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        m.e(motionEvent, "e");
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, float f10) {
        m.e(motionEvent2, "e2");
        return false;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
        m.e(motionEvent, "e");
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f3, float f10) {
        m.e(motionEvent2, "e2");
        return false;
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
        m.e(motionEvent, "e");
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) throws Exception {
        View decorView;
        m.e(motionEvent, "e");
        Activity activity = (Activity) this.F.get();
        cd.b bVar = this.B;
        if (activity == null) {
            bVar.a("Activity is null in onSingleTapUp()");
            return false;
        }
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            bVar.a("DecorView is null in onSingleTapUp()");
            return false;
        }
        k kVar = new k(Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()));
        tc.b[] bVarArr = tc.b.A;
        tc.c cVarB = tc.a.b(decorView, kVar, this.C, bVar);
        if (cVarB == null) {
            bVar.c("Unable to find click target. No event captured.");
            return false;
        }
        b3.a aVar = this.E;
        if (aVar != null) {
            aVar.invoke(cVarB);
        }
        if (this.D.f13171e.contains(s.f13221b)) {
            this.A.invoke("[Amplitude] Element Interacted", ze.d.j(cVarB, activity));
        }
        return false;
    }
}
