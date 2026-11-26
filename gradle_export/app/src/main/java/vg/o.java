package vg;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

public abstract class o {

    public final TextInputLayout f15666a;

    public final n f15667b;

    public final Context f15668c;

    public final CheckableImageButton f15669d;

    public o(n nVar) {
        this.f15666a = nVar.A;
        this.f15667b = nVar;
        this.f15668c = nVar.getContext();
        this.f15669d = nVar.G;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public AccessibilityManager.TouchExplorationStateChangeListener h() {
        return null;
    }

    public boolean i(int i10) {
        return true;
    }

    public boolean j() {
        return this instanceof k;
    }

    public boolean k() {
        return false;
    }

    public void l(EditText editText) {
    }

    public void m(a5.g gVar) {
    }

    public void n(AccessibilityEvent accessibilityEvent) {
    }

    public void o(boolean z10) {
    }

    public final void p() {
        this.f15667b.f(false);
    }

    public void q() {
    }

    public void r() {
    }
}
