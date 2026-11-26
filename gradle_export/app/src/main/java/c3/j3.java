package c3;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.concurrent.CancellationException;

public final class j3 implements View.OnAttachStateChangeListener {
    public final int A;
    public final Object B;

    public j3(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.A) {
            case 0:
            case 1:
            case 2:
                break;
            case 3:
                i2.c cVar = (i2.c) this.B;
                Context context = view.getContext();
                if (!cVar.f7114c) {
                    context.getApplicationContext().registerComponentCallbacks(cVar.f7116e);
                    cVar.f7114c = true;
                }
                break;
            case 4:
            case 5:
                break;
            default:
                vg.n nVar = (vg.n) this.B;
                AccessibilityManager accessibilityManager = nVar.T;
                if (nVar.U != null && accessibilityManager != null && nVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(nVar.U);
                    break;
                }
                break;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        switch (this.A) {
            case 0:
                view.removeOnAttachStateChangeListener(this);
                ((a40.u1) this.B).i((CancellationException) null);
                return;
            case 1:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.B;
                cg.a aVar = hideBottomViewOnScrollBehavior.f4084h;
                if (aVar == null || (accessibilityManager = hideBottomViewOnScrollBehavior.f4083g) == null) {
                    return;
                }
                accessibilityManager.removeTouchExplorationStateChangeListener(aVar);
                hideBottomViewOnScrollBehavior.f4084h = null;
                return;
            case 2:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.B;
                cg.a aVar2 = hideViewOnScrollBehavior.f4090c;
                if (aVar2 == null || (accessibilityManager2 = hideViewOnScrollBehavior.f4089b) == null) {
                    return;
                }
                accessibilityManager2.removeTouchExplorationStateChangeListener(aVar2);
                hideViewOnScrollBehavior.f4090c = null;
                return;
            case 3:
                i2.c cVar = (i2.c) this.B;
                Context context = view.getContext();
                if (cVar.f7114c) {
                    context.getApplicationContext().unregisterComponentCallbacks(cVar.f7116e);
                    cVar.f7114c = false;
                }
                h1.l lVar = cVar.f7115d;
                if (lVar != null) {
                    synchronized (lVar) {
                        try {
                            u.i0 i0Var = (u.i0) lVar.A;
                            if (i0Var != null) {
                                i0Var.a();
                            }
                            lVar.B = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                cVar.f7115d = null;
                return;
            case 4:
                o.f fVar = (o.f) this.B;
                ViewTreeObserver viewTreeObserver = fVar.X;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.X = view.getViewTreeObserver();
                    }
                    fVar.X.removeGlobalOnLayoutListener(fVar.I);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 5:
                o.c0 c0Var = (o.c0) this.B;
                ViewTreeObserver viewTreeObserver2 = c0Var.O;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        c0Var.O = view.getViewTreeObserver();
                    }
                    c0Var.O.removeGlobalOnLayoutListener(c0Var.I);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                vg.n nVar = (vg.n) this.B;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = nVar.U;
                if (touchExplorationStateChangeListener == null || (accessibilityManager3 = nVar.T) == null) {
                    return;
                }
                accessibilityManager3.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                return;
        }
    }
}
