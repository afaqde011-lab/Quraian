package k;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

public class d0 extends d.p implements l {
    public b0 E;
    public final c0 F;

    public d0(Context context, int i10) {
        int i11;
        if (i10 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130969048, typedValue, true);
            i11 = typedValue.resourceId;
        } else {
            i11 = i10;
        }
        super(context, i11);
        this.F = new c0(this);
        p pVarC = c();
        if (i10 == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(2130969048, typedValue2, true);
            i10 = typedValue2.resourceId;
        }
        ((b0) pVarC).f8357r0 = i10;
        pVarC.d();
    }

    @Override
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        b0 b0Var = (b0) c();
        b0Var.v();
        ((ViewGroup) b0Var.Y.findViewById(R.id.content)).addView(view, layoutParams);
        b0Var.K.a(b0Var.J.getCallback());
    }

    public final p c() {
        if (this.E == null) {
            ca.z zVar = p.A;
            this.E = new b0(getContext(), getWindow(), this, this);
        }
        return this.E;
    }

    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public void dismiss() {
        super.dismiss();
        c().e();
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        c0 c0Var = this.F;
        if (c0Var == null) {
            return false;
        }
        return c0Var.A.d(keyEvent);
    }

    @Override
    public final View findViewById(int i10) {
        b0 b0Var = (b0) c();
        b0Var.v();
        return b0Var.J.findViewById(i10);
    }

    @Override
    public final void invalidateOptionsMenu() {
        c().b();
    }

    @Override
    public void onCreate(Bundle bundle) {
        c().a();
        super.onCreate(bundle);
        c().d();
    }

    @Override
    public final void onStop() {
        super.onStop();
        b0 b0Var = (b0) c();
        b0Var.A();
        a aVar = b0Var.M;
        if (aVar != null) {
            aVar.o(false);
        }
    }

    @Override
    public final void onSupportActionModeFinished(n.b bVar) {
    }

    @Override
    public final void onSupportActionModeStarted(n.b bVar) {
    }

    @Override
    public final n.b onWindowStartingSupportActionMode(n.a aVar) {
        return null;
    }

    @Override
    public void setContentView(int i10) {
        b();
        c().h(i10);
    }

    @Override
    public void setContentView(View view) {
        b();
        c().i(view);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        c().j(view, layoutParams);
    }

    @Override
    public void setTitle(int i10) {
        super.setTitle(i10);
        c().k(getContext().getString(i10));
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().k(charSequence);
    }
}
