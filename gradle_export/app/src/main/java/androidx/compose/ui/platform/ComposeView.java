package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import c3.a;
import com.google.protobuf.RuntimeVersion;
import kotlin.Metadata;
import l1.g0;
import l1.i1;
import l1.j;
import l1.q;
import l1.r1;
import u00.n;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\b\u0010\tR*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0014@RX\u0094\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Lc3/a;", RuntimeVersion.SUFFIX, "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Lkotlin/Function0;", "Lg00/b0;", "content", "setContent", "(Lu00/n;)V", RuntimeVersion.SUFFIX, "value", "K", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "shouldCreateCompositionOnAttachedToWindow", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ComposeView extends a {
    public final i1 J;

    public boolean shouldCreateCompositionOnAttachedToWindow;

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, (i10 & 2) != 0 ? null : attributeSet);
        this.J = q.z(null);
    }

    public static void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override
    public final void a(j jVar, int i10) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(420213850);
        int i11 = (g0Var.i(this) ? 4 : 2) | i10;
        if (g0Var.S(i11 & 1, (i11 & 3) != 2)) {
            n nVar = (n) this.J.getValue();
            if (nVar == null) {
                g0Var.c0(-1238823553);
            } else {
                g0Var.c0(98585282);
                nVar.invoke(g0Var, 0);
            }
            g0Var.r(false);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new b2.n(this, i10, 2);
        }
    }

    @Override
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final void setContent(n content) {
        this.shouldCreateCompositionOnAttachedToWindow = true;
        this.J.setValue(content);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            d();
        }
    }
}
