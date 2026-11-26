package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00028\u0000\"\n\b\u0000\u0010\u0010*\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "Lg00/b0;", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", RuntimeVersion.SUFFIX, "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "Landroidx/fragment/app/j0;", "F", "getFragment", "()Landroidx/fragment/app/j0;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList A;
    public final ArrayList B;
    public View.OnApplyWindowInsetsListener C;
    public boolean D;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        kotlin.jvm.internal.m.e(context, "context");
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.D = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5.a.f17248b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, i1 i1Var) {
        View view;
        super(context, attributeSet);
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(attributeSet, "attrs");
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.D = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5.a.f17248b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id2 = getId();
        j0 j0VarC = i1Var.C(id2);
        if (classAttribute != null && j0VarC == null) {
            if (id2 == -1) {
                throw new IllegalStateException(a1.b.p("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : RuntimeVersion.SUFFIX));
            }
            b1 b1VarH = i1Var.H();
            context.getClassLoader();
            j0 j0VarInstantiate = j0.instantiate(b1VarH.f692a.f769w.B, classAttribute, null);
            kotlin.jvm.internal.m.d(j0VarInstantiate, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            j0VarInstantiate.mFragmentId = id2;
            j0VarInstantiate.mContainerId = id2;
            j0VarInstantiate.mTag = string;
            j0VarInstantiate.mFragmentManager = i1Var;
            j0VarInstantiate.mHost = i1Var.f769w;
            j0VarInstantiate.onInflate(context, attributeSet, (Bundle) null);
            a aVar = new a(i1Var);
            aVar.f844o = true;
            j0VarInstantiate.mContainer = this;
            j0VarInstantiate.mInDynamicContainer = true;
            aVar.c(getId(), j0VarInstantiate, string, 1);
            if (aVar.f838g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            aVar.f686q.A(aVar, true);
        }
        for (q1 q1Var : i1Var.f751c.d()) {
            j0 j0Var = q1Var.f809c;
            if (j0Var.mContainerId == getId() && (view = j0Var.mView) != null && view.getParent() == null) {
                j0Var.mContainer = this;
                q1Var.b();
                q1Var.k();
            }
        }
    }

    public final void a(View view) {
        if (this.B.contains(view)) {
            this.A.add(view);
        }
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.m.e(view, "child");
        Object tag = view.getTag(2131362210);
        if ((tag instanceof j0 ? (j0) tag : null) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        z4.j1 j1VarG;
        kotlin.jvm.internal.m.e(windowInsets, "insets");
        z4.j1 j1VarG2 = z4.j1.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.C;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            kotlin.jvm.internal.m.d(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            j1VarG = z4.j1.g(null, windowInsetsOnApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = z4.j0.f17198a;
            WindowInsets windowInsetsF = j1VarG2.f();
            if (windowInsetsF != null) {
                onApplyWindowInsets(windowInsetsF);
                if (!windowInsetsF.equals(windowInsetsF)) {
                    j1VarG2 = z4.j1.g(this, windowInsetsF);
                }
            }
            j1VarG = j1VarG2;
        }
        if (!j1VarG.f17202a.s()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                WeakHashMap weakHashMap2 = z4.j0.f17198a;
                WindowInsets windowInsetsF2 = j1VarG.f();
                if (windowInsetsF2 != null) {
                    WindowInsets windowInsetsA = z4.i0.a(childAt, windowInsetsF2);
                    if (!windowInsetsA.equals(windowInsetsF2)) {
                        z4.j1.g(childAt, windowInsetsA);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.m.e(canvas, "canvas");
        if (this.D) {
            Iterator it = this.A.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j9) {
        kotlin.jvm.internal.m.e(canvas, "canvas");
        kotlin.jvm.internal.m.e(view, "child");
        if (this.D) {
            ArrayList arrayList = this.A;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j9);
    }

    @Override
    public final void endViewTransition(View view) {
        kotlin.jvm.internal.m.e(view, "view");
        this.B.remove(view);
        if (this.A.remove(view)) {
            this.D = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends j0> F getFragment() {
        o0 o0Var;
        j0 j0Var;
        i1 supportFragmentManager;
        View view = this;
        while (true) {
            o0Var = null;
            if (view == null) {
                j0Var = null;
                break;
            }
            Object tag = view.getTag(2131362210);
            j0Var = tag instanceof j0 ? (j0) tag : null;
            if (j0Var != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (j0Var == null) {
            for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof o0) {
                    o0Var = (o0) context;
                    break;
                }
            }
            if (o0Var == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            supportFragmentManager = o0Var.getSupportFragmentManager();
        } else {
            if (!j0Var.isAdded()) {
                throw new IllegalStateException("The Fragment " + j0Var + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            supportFragmentManager = j0Var.getChildFragmentManager();
        }
        return (F) supportFragmentManager.C(getId());
    }

    @Override
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        kotlin.jvm.internal.m.e(windowInsets, "insets");
        return windowInsets;
    }

    @Override
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                kotlin.jvm.internal.m.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override
    public final void removeView(View view) {
        kotlin.jvm.internal.m.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override
    public final void removeViewAt(int i10) {
        View childAt = getChildAt(i10);
        kotlin.jvm.internal.m.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i10);
    }

    @Override
    public final void removeViewInLayout(View view) {
        kotlin.jvm.internal.m.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override
    public final void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            kotlin.jvm.internal.m.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i10, i11);
    }

    @Override
    public final void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            kotlin.jvm.internal.m.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.D = drawDisappearingViewsFirst;
    }

    @Override
    public void setLayoutTransition(LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        this.C = listener;
    }

    @Override
    public final void startViewTransition(View view) {
        kotlin.jvm.internal.m.e(view, "view");
        if (view.getParent() == this) {
            this.B.add(view);
        }
        super.startViewTransition(view);
    }
}
