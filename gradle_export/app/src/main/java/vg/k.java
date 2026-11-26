package vg;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;

public final class k extends o {

    public final int f15653e;

    public final int f15654f;

    public final TimeInterpolator f15655g;

    public AutoCompleteTextView f15656h;

    public final androidx.mediarouter.app.c f15657i;

    public final a f15658j;

    public final j f15659k;
    public boolean l;
    public boolean m;

    public boolean f15660n;

    public long f15661o;

    public AccessibilityManager f15662p;

    public ValueAnimator f15663q;

    public ValueAnimator f15664r;

    public k(n nVar) {
        super(nVar);
        this.f15657i = new androidx.mediarouter.app.c(this, 8);
        this.f15658j = new a(this, 1);
        this.f15659k = new AccessibilityManager.TouchExplorationStateChangeListener() {
            @Override
            public final void onTouchExplorationStateChanged(boolean z10) {
                k kVar = this.A;
                AutoCompleteTextView autoCompleteTextView = kVar.f15656h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                kVar.f15669d.setImportantForAccessibility(z10 ? 2 : 1);
            }
        };
        this.f15661o = Long.MAX_VALUE;
        this.f15654f = ze.d.P(nVar.getContext(), 2130969587, 67);
        this.f15653e = ze.d.P(nVar.getContext(), 2130969587, 50);
        this.f15655g = ze.d.Q(nVar.getContext(), 2130969596, ag.a.f465a);
    }

    @Override
    public final void a() {
        if (this.f15662p.isTouchExplorationEnabled() && this.f15656h.getInputType() != 0 && !this.f15669d.hasFocus()) {
            this.f15656h.dismissDropDown();
        }
        this.f15656h.post(new m9.f(this, 18));
    }

    @Override
    public final int c() {
        return 2131886502;
    }

    @Override
    public final int d() {
        return 2131231576;
    }

    @Override
    public final View.OnFocusChangeListener e() {
        return this.f15658j;
    }

    @Override
    public final View.OnClickListener f() {
        return this.f15657i;
    }

    @Override
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.f15659k;
    }

    @Override
    public final boolean i(int i10) {
        return i10 != 0;
    }

    @Override
    public final boolean k() {
        return this.f15660n;
    }

    @Override
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f15656h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    k kVar = this.A;
                    long j9 = jUptimeMillis - kVar.f15661o;
                    if (j9 < 0 || j9 > 300) {
                        kVar.m = false;
                    }
                    kVar.t();
                    kVar.m = true;
                    kVar.f15661o = SystemClock.uptimeMillis();
                }
                return false;
            }
        });
        this.f15656h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() {
            @Override
            public final void onDismiss() {
                k kVar = this.f15652a;
                kVar.m = true;
                kVar.f15661o = SystemClock.uptimeMillis();
                kVar.s(false);
            }
        });
        this.f15656h.setThreshold(0);
        TextInputLayout textInputLayout = this.f15666a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f15662p.isTouchExplorationEnabled()) {
            this.f15669d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override
    public final void m(a5.g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f187a;
        if (this.f15656h.getInputType() == 0) {
            gVar.g(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (this.f15662p.isEnabled() && this.f15656h.getInputType() == 0) {
            boolean z10 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f15660n && !this.f15656h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z10) {
                t();
                this.m = true;
                this.f15661o = SystemClock.uptimeMillis();
            }
        }
    }

    @Override
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f15655g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f15654f);
        int i10 = 1;
        valueAnimatorOfFloat.addUpdateListener(new m9.g(this, i10));
        this.f15664r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f15653e);
        valueAnimatorOfFloat2.addUpdateListener(new m9.g(this, i10));
        this.f15663q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new cg.b(this, 8));
        this.f15662p = (AccessibilityManager) this.f15668c.getSystemService("accessibility");
    }

    @Override
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.f15656h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f15656h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z10) {
        if (this.f15660n != z10) {
            this.f15660n = z10;
            this.f15664r.cancel();
            this.f15663q.start();
        }
    }

    public final void t() {
        if (this.f15656h == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f15661o;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        s(!this.f15660n);
        if (!this.f15660n) {
            this.f15656h.dismissDropDown();
        } else {
            this.f15656h.requestFocus();
            this.f15656h.showDropDown();
        }
    }
}
