package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;

public final class v0 implements LayoutInflater.Factory2 {
    public final i1 A;

    public v0(i1 i1Var) {
        this.A = i1Var;
    }

    @Override
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        q1 q1VarG;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        i1 i1Var = this.A;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, i1Var);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z5.a.f17247a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = j0.class.isAssignableFrom(b1.a(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id2 = view != null ? view.getId() : 0;
                    if (id2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    j0 j0VarC = resourceId != -1 ? i1Var.C(resourceId) : null;
                    if (j0VarC == null && string != null) {
                        j0VarC = i1Var.D(string);
                    }
                    if (j0VarC == null && id2 != -1) {
                        j0VarC = i1Var.C(id2);
                    }
                    if (j0VarC == null) {
                        b1 b1VarH = i1Var.H();
                        context.getClassLoader();
                        j0VarC = j0.instantiate(b1VarH.f692a.f769w.B, attributeValue, null);
                        j0VarC.mFromLayout = true;
                        j0VarC.mFragmentId = resourceId != 0 ? resourceId : id2;
                        j0VarC.mContainerId = id2;
                        j0VarC.mTag = string;
                        j0VarC.mInLayout = true;
                        j0VarC.mFragmentManager = i1Var;
                        t0 t0Var = i1Var.f769w;
                        j0VarC.mHost = t0Var;
                        j0VarC.onInflate((Context) t0Var.B, attributeSet, j0VarC.mSavedFragmentState);
                        q1VarG = i1Var.a(j0VarC);
                        if (i1.K(2)) {
                            Log.v("FragmentManager", "Fragment " + j0VarC + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (j0VarC.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                        }
                        j0VarC.mInLayout = true;
                        j0VarC.mFragmentManager = i1Var;
                        t0 t0Var2 = i1Var.f769w;
                        j0VarC.mHost = t0Var2;
                        j0VarC.onInflate((Context) t0Var2.B, attributeSet, j0VarC.mSavedFragmentState);
                        q1VarG = i1Var.g(j0VarC);
                        if (i1.K(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + j0VarC + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    a6.a aVar = a6.b.f192a;
                    a6.b.b(new FragmentTagUsageViolation(j0VarC, "Attempting to use <fragment> tag to add fragment " + j0VarC + " to container " + viewGroup));
                    a6.b.a(j0VarC).getClass();
                    j0VarC.mContainer = viewGroup;
                    q1VarG.k();
                    q1VarG.j();
                    View view2 = j0VarC.mView;
                    if (view2 == null) {
                        throw new IllegalStateException(a1.b.p("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (j0VarC.mView.getTag() == null) {
                        j0VarC.mView.setTag(string);
                    }
                    j0VarC.mView.addOnAttachStateChangeListener(new u0(this, q1VarG));
                    return j0VarC.mView;
                }
            }
        }
        return null;
    }

    @Override
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
