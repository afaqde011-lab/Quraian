package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import com.google.android.gms.internal.measurement.x5;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class q1 {

    public final p0 f807a;

    public final r1 f808b;

    public final j0 f809c;

    public boolean f810d = false;

    public int f811e = -1;

    public q1(p0 p0Var, r1 r1Var, j0 j0Var) {
        this.f807a = p0Var;
        this.f808b = r1Var;
        this.f809c = j0Var;
    }

    public q1(p0 p0Var, r1 r1Var, j0 j0Var, Bundle bundle) {
        this.f807a = p0Var;
        this.f808b = r1Var;
        this.f809c = j0Var;
        j0Var.mSavedViewState = null;
        j0Var.mSavedViewRegistryState = null;
        j0Var.mBackStackNesting = 0;
        j0Var.mInLayout = false;
        j0Var.mAdded = false;
        j0 j0Var2 = j0Var.mTarget;
        j0Var.mTargetWho = j0Var2 != null ? j0Var2.mWho : null;
        j0Var.mTarget = null;
        j0Var.mSavedFragmentState = bundle;
        j0Var.mArguments = bundle.getBundle("arguments");
    }

    public q1(p0 p0Var, r1 r1Var, ClassLoader classLoader, b1 b1Var, Bundle bundle) {
        this.f807a = p0Var;
        this.f808b = r1Var;
        o1 o1Var = (o1) bundle.getParcelable("state");
        j0 j0VarInstantiate = j0.instantiate(b1Var.f692a.f769w.B, o1Var.A, null);
        j0VarInstantiate.mWho = o1Var.B;
        j0VarInstantiate.mFromLayout = o1Var.C;
        j0VarInstantiate.mInDynamicContainer = o1Var.D;
        j0VarInstantiate.mRestored = true;
        j0VarInstantiate.mFragmentId = o1Var.E;
        j0VarInstantiate.mContainerId = o1Var.F;
        j0VarInstantiate.mTag = o1Var.G;
        j0VarInstantiate.mRetainInstance = o1Var.H;
        j0VarInstantiate.mRemoving = o1Var.I;
        j0VarInstantiate.mDetached = o1Var.J;
        j0VarInstantiate.mHidden = o1Var.K;
        j0VarInstantiate.mMaxState = androidx.lifecycle.p.values()[o1Var.L];
        j0VarInstantiate.mTargetWho = o1Var.M;
        j0VarInstantiate.mTargetRequestCode = o1Var.N;
        j0VarInstantiate.mUserVisibleHint = o1Var.O;
        this.f809c = j0VarInstantiate;
        j0VarInstantiate.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        j0VarInstantiate.setArguments(bundle2);
        if (i1.K(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + j0VarInstantiate);
        }
    }

    public final void a() {
        boolean zK = i1.K(3);
        j0 j0Var = this.f809c;
        if (zK) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + j0Var);
        }
        Bundle bundle = j0Var.mSavedFragmentState;
        j0Var.performActivityCreated(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f807a.a(j0Var, false);
    }

    public final void b() {
        j0 j0Var;
        View view;
        View view2;
        j0 j0Var2 = this.f809c;
        View view3 = j0Var2.mContainer;
        while (true) {
            j0Var = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(2131362210);
            j0 j0Var3 = tag instanceof j0 ? (j0) tag : null;
            if (j0Var3 != null) {
                j0Var = j0Var3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        j0 parentFragment = j0Var2.getParentFragment();
        if (j0Var != null && !j0Var.equals(parentFragment)) {
            int i10 = j0Var2.mContainerId;
            a6.a aVar = a6.b.f192a;
            StringBuilder sb2 = new StringBuilder("Attempting to nest fragment ");
            sb2.append(j0Var2);
            sb2.append(" within the view of parent fragment ");
            sb2.append(j0Var);
            sb2.append(" via container with ID ");
            a6.b.b(new WrongNestedHierarchyViolation(j0Var2, g4.c.g(i10, " without using parent's childFragmentManager", sb2)));
            a6.b.a(j0Var2).getClass();
        }
        ArrayList arrayList = this.f808b.f812a;
        ViewGroup viewGroup = j0Var2.mContainer;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(j0Var2);
            for (int i11 = iIndexOf - 1; i11 >= 0; i11--) {
                j0 j0Var4 = (j0) arrayList.get(i11);
                if (j0Var4.mContainer == viewGroup && (view2 = j0Var4.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                j0 j0Var5 = (j0) arrayList.get(iIndexOf);
                if (j0Var5.mContainer == viewGroup && (view = j0Var5.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        j0Var2.mContainer.addView(j0Var2.mView, iIndexOfChild);
    }

    public final void c() {
        boolean zK = i1.K(3);
        j0 j0Var = this.f809c;
        if (zK) {
            Log.d("FragmentManager", "moveto ATTACHED: " + j0Var);
        }
        j0 j0Var2 = j0Var.mTarget;
        q1 q1Var = null;
        r1 r1Var = this.f808b;
        if (j0Var2 != null) {
            q1 q1Var2 = (q1) r1Var.f813b.get(j0Var2.mWho);
            if (q1Var2 == null) {
                throw new IllegalStateException("Fragment " + j0Var + " declared target fragment " + j0Var.mTarget + " that does not belong to this FragmentManager!");
            }
            j0Var.mTargetWho = j0Var.mTarget.mWho;
            j0Var.mTarget = null;
            q1Var = q1Var2;
        } else {
            String str = j0Var.mTargetWho;
            if (str != null && (q1Var = (q1) r1Var.f813b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(j0Var);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(x5.n(sb2, j0Var.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (q1Var != null) {
            q1Var.k();
        }
        i1 i1Var = j0Var.mFragmentManager;
        j0Var.mHost = i1Var.f769w;
        j0Var.mParentFragment = i1Var.f771y;
        p0 p0Var = this.f807a;
        p0Var.g(j0Var, false);
        j0Var.performAttach();
        p0Var.b(j0Var, false);
    }

    public final int d() {
        j0 j0Var = this.f809c;
        if (j0Var.mFragmentManager == null) {
            return j0Var.mState;
        }
        int iMin = this.f811e;
        int iOrdinal = j0Var.mMaxState.ordinal();
        int i10 = 0;
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (j0Var.mFromLayout) {
            if (j0Var.mInLayout) {
                iMin = Math.max(this.f811e, 2);
                View view = j0Var.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f811e < 4 ? Math.min(iMin, j0Var.mState) : Math.min(iMin, 1);
            }
        }
        if (j0Var.mInDynamicContainer && j0Var.mContainer == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!j0Var.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = j0Var.mContainer;
        if (viewGroup != null) {
            s sVarJ = s.j(viewGroup, j0Var.getParentFragmentManager());
            g2 g2VarG = sVarJ.g(j0Var);
            int i11 = g2VarG != null ? g2VarG.f734b : 0;
            g2 g2VarH = sVarJ.h(j0Var);
            i10 = g2VarH != null ? g2VarH.f734b : 0;
            int i12 = i11 == 0 ? -1 : h2.f747a[e4.f.b(i11)];
            if (i12 != -1 && i12 != 1) {
                i10 = i11;
            }
        }
        if (i10 == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i10 == 3) {
            iMin = Math.max(iMin, 3);
        } else if (j0Var.mRemoving) {
            iMin = j0Var.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (j0Var.mDeferStart && j0Var.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (j0Var.mTransitioning) {
            iMin = Math.max(iMin, 3);
        }
        if (i1.K(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + j0Var);
        }
        return iMin;
    }

    public final void e() {
        boolean zK = i1.K(3);
        j0 j0Var = this.f809c;
        if (zK) {
            Log.d("FragmentManager", "moveto CREATED: " + j0Var);
        }
        Bundle bundle = j0Var.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (j0Var.mIsCreated) {
            j0Var.mState = 1;
            j0Var.restoreChildFragmentState();
        } else {
            p0 p0Var = this.f807a;
            p0Var.h(j0Var, false);
            j0Var.performCreate(bundle2);
            p0Var.c(j0Var, false);
        }
    }

    public final void f() {
        String resourceName;
        j0 j0Var = this.f809c;
        if (j0Var.mFromLayout) {
            return;
        }
        if (i1.K(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + j0Var);
        }
        Bundle bundle = j0Var.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = j0Var.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = j0Var.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = j0Var.mContainerId;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException(a1.b.n("Cannot create fragment ", j0Var, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) j0Var.mFragmentManager.f770x.b(i10);
                if (viewGroup == null) {
                    if (!j0Var.mRestored && !j0Var.mInDynamicContainer) {
                        try {
                            resourceName = j0Var.getResources().getResourceName(j0Var.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(j0Var.mContainerId) + " (" + resourceName + ") for fragment " + j0Var);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    a6.a aVar = a6.b.f192a;
                    a6.b.b(new WrongFragmentContainerViolation(j0Var, "Attempting to add fragment " + j0Var + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    a6.b.a(j0Var).getClass();
                }
            }
        }
        j0Var.mContainer = viewGroup;
        j0Var.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (j0Var.mView != null) {
            if (i1.K(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + j0Var);
            }
            j0Var.mView.setSaveFromParentEnabled(false);
            j0Var.mView.setTag(2131362210, j0Var);
            if (viewGroup != null) {
                b();
            }
            if (j0Var.mHidden) {
                j0Var.mView.setVisibility(8);
            }
            if (j0Var.mView.isAttachedToWindow()) {
                View view = j0Var.mView;
                WeakHashMap weakHashMap = z4.j0.f17198a;
                view.requestApplyInsets();
            } else {
                View view2 = j0Var.mView;
                view2.addOnAttachStateChangeListener(new p1(view2));
            }
            j0Var.performViewCreated();
            this.f807a.m(j0Var, j0Var.mView, false);
            int visibility = j0Var.mView.getVisibility();
            j0Var.setPostOnViewCreatedAlpha(j0Var.mView.getAlpha());
            if (j0Var.mContainer != null && visibility == 0) {
                View viewFindFocus = j0Var.mView.findFocus();
                if (viewFindFocus != null) {
                    j0Var.setFocusedView(viewFindFocus);
                    if (i1.K(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + j0Var);
                    }
                }
                j0Var.mView.setAlpha(0.0f);
            }
        }
        j0Var.mState = 2;
    }

    public final void g() {
        j0 j0VarB;
        boolean zK = i1.K(3);
        j0 j0Var = this.f809c;
        if (zK) {
            Log.d("FragmentManager", "movefrom CREATED: " + j0Var);
        }
        boolean zIsChangingConfigurations = true;
        boolean z10 = j0Var.mRemoving && !j0Var.isInBackStack();
        r1 r1Var = this.f808b;
        if (z10 && !j0Var.mBeingSaved) {
            r1Var.i(j0Var.mWho, null);
        }
        if (!z10) {
            m1 m1Var = r1Var.f815d;
            if (!((m1Var.f782c.containsKey(j0Var.mWho) && m1Var.f785f) ? m1Var.f786g : true)) {
                String str = j0Var.mTargetWho;
                if (str != null && (j0VarB = r1Var.b(str)) != null && j0VarB.mRetainInstance) {
                    j0Var.mTarget = j0VarB;
                }
                j0Var.mState = 0;
                return;
            }
        }
        t0 t0Var = j0Var.mHost;
        if (t0Var instanceof androidx.lifecycle.f1) {
            zIsChangingConfigurations = r1Var.f815d.f786g;
        } else {
            o0 o0Var = t0Var.B;
            if (o0Var != null) {
                zIsChangingConfigurations = true ^ o0Var.isChangingConfigurations();
            }
        }
        if ((z10 && !j0Var.mBeingSaved) || zIsChangingConfigurations) {
            r1Var.f815d.i(j0Var, false);
        }
        j0Var.performDestroy();
        this.f807a.d(j0Var, false);
        for (q1 q1Var : r1Var.d()) {
            if (q1Var != null) {
                j0 j0Var2 = q1Var.f809c;
                if (j0Var.mWho.equals(j0Var2.mTargetWho)) {
                    j0Var2.mTarget = j0Var;
                    j0Var2.mTargetWho = null;
                }
            }
        }
        String str2 = j0Var.mTargetWho;
        if (str2 != null) {
            j0Var.mTarget = r1Var.b(str2);
        }
        r1Var.h(this);
    }

    public final void h() {
        View view;
        boolean zK = i1.K(3);
        j0 j0Var = this.f809c;
        if (zK) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + j0Var);
        }
        ViewGroup viewGroup = j0Var.mContainer;
        if (viewGroup != null && (view = j0Var.mView) != null) {
            viewGroup.removeView(view);
        }
        j0Var.performDestroyView();
        this.f807a.n(j0Var, false);
        j0Var.mContainer = null;
        j0Var.mView = null;
        j0Var.mViewLifecycleOwner = null;
        j0Var.mViewLifecycleOwnerLiveData.h(null);
        j0Var.mInLayout = false;
    }

    public final void i() {
        boolean zK = i1.K(3);
        j0 j0Var = this.f809c;
        if (zK) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + j0Var);
        }
        j0Var.performDetach();
        this.f807a.e(j0Var, false);
        j0Var.mState = -1;
        j0Var.mHost = null;
        j0Var.mParentFragment = null;
        j0Var.mFragmentManager = null;
        if (!j0Var.mRemoving || j0Var.isInBackStack()) {
            m1 m1Var = this.f808b.f815d;
            if (!((m1Var.f782c.containsKey(j0Var.mWho) && m1Var.f785f) ? m1Var.f786g : true)) {
                return;
            }
        }
        if (i1.K(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + j0Var);
        }
        j0Var.initState();
    }

    public final void j() {
        j0 j0Var = this.f809c;
        if (j0Var.mFromLayout && j0Var.mInLayout && !j0Var.mPerformedCreateView) {
            if (i1.K(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + j0Var);
            }
            Bundle bundle = j0Var.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            j0Var.performCreateView(j0Var.performGetLayoutInflater(bundle2), null, bundle2);
            View view = j0Var.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                j0Var.mView.setTag(2131362210, j0Var);
                if (j0Var.mHidden) {
                    j0Var.mView.setVisibility(8);
                }
                j0Var.performViewCreated();
                this.f807a.m(j0Var, j0Var.mView, false);
                j0Var.mState = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z10 = this.f810d;
        j0 j0Var = this.f809c;
        if (z10) {
            if (i1.K(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + j0Var);
                return;
            }
            return;
        }
        try {
            this.f810d = true;
            boolean z11 = false;
            while (true) {
                int iD = d();
                int i10 = j0Var.mState;
                int i11 = 3;
                r1 r1Var = this.f808b;
                if (iD == i10) {
                    if (!z11 && i10 == -1 && j0Var.mRemoving && !j0Var.isInBackStack() && !j0Var.mBeingSaved) {
                        if (i1.K(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + j0Var);
                        }
                        r1Var.f815d.i(j0Var, true);
                        r1Var.h(this);
                        if (i1.K(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + j0Var);
                        }
                        j0Var.initState();
                    }
                    if (j0Var.mHiddenChanged) {
                        if (j0Var.mView != null && (viewGroup = j0Var.mContainer) != null) {
                            s sVarJ = s.j(viewGroup, j0Var.getParentFragmentManager());
                            if (j0Var.mHidden) {
                                if (i1.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + j0Var);
                                }
                                sVarJ.d(3, 1, this);
                            } else {
                                if (i1.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + j0Var);
                                }
                                sVarJ.d(2, 1, this);
                            }
                        }
                        i1 i1Var = j0Var.mFragmentManager;
                        if (i1Var != null && j0Var.mAdded && i1.L(j0Var)) {
                            i1Var.G = true;
                        }
                        j0Var.mHiddenChanged = false;
                        j0Var.onHiddenChanged(j0Var.mHidden);
                        j0Var.mChildFragmentManager.o();
                    }
                    this.f810d = false;
                    return;
                }
                p0 p0Var = this.f807a;
                if (iD <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (j0Var.mBeingSaved) {
                                if (((Bundle) r1Var.f814c.get(j0Var.mWho)) == null) {
                                    r1Var.i(j0Var.mWho, n());
                                }
                            }
                            g();
                            break;
                        case 1:
                            h();
                            j0Var.mState = 1;
                            break;
                        case 2:
                            j0Var.mInLayout = false;
                            j0Var.mState = 2;
                            break;
                        case 3:
                            if (i1.K(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + j0Var);
                            }
                            if (j0Var.mBeingSaved) {
                                r1Var.i(j0Var.mWho, n());
                            } else if (j0Var.mView != null && j0Var.mSavedViewState == null) {
                                o();
                            }
                            if (j0Var.mView != null && (viewGroup2 = j0Var.mContainer) != null) {
                                s sVarJ2 = s.j(viewGroup2, j0Var.getParentFragmentManager());
                                if (i1.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + j0Var);
                                }
                                sVarJ2.d(1, 3, this);
                            }
                            j0Var.mState = 3;
                            break;
                        case 4:
                            if (i1.K(3)) {
                                Log.d("FragmentManager", "movefrom STARTED: " + j0Var);
                            }
                            j0Var.performStop();
                            p0Var.l(j0Var, false);
                            break;
                        case 5:
                            j0Var.mState = 5;
                            break;
                        case 6:
                            if (i1.K(3)) {
                                Log.d("FragmentManager", "movefrom RESUMED: " + j0Var);
                            }
                            j0Var.performPause();
                            p0Var.f(j0Var, false);
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (j0Var.mView != null && (viewGroup3 = j0Var.mContainer) != null) {
                                s sVarJ3 = s.j(viewGroup3, j0Var.getParentFragmentManager());
                                int visibility = j0Var.mView.getVisibility();
                                if (visibility == 0) {
                                    i11 = 2;
                                } else if (visibility == 4) {
                                    i11 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                g4.c.q(i11, "finalState");
                                if (i1.K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + j0Var);
                                }
                                sVarJ3.d(i11, 2, this);
                            }
                            j0Var.mState = 4;
                            break;
                        case 5:
                            if (i1.K(3)) {
                                Log.d("FragmentManager", "moveto STARTED: " + j0Var);
                            }
                            j0Var.performStart();
                            p0Var.k(j0Var, false);
                            break;
                        case 6:
                            j0Var.mState = 6;
                            break;
                        case 7:
                            m();
                            break;
                    }
                }
                z11 = true;
            }
        } catch (Throwable th2) {
            this.f810d = false;
            throw th2;
        }
    }

    public final void l(ClassLoader classLoader) {
        j0 j0Var = this.f809c;
        Bundle bundle = j0Var.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (j0Var.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            j0Var.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            j0Var.mSavedViewState = j0Var.mSavedFragmentState.getSparseParcelableArray("viewState");
            j0Var.mSavedViewRegistryState = j0Var.mSavedFragmentState.getBundle("viewRegistryState");
            o1 o1Var = (o1) j0Var.mSavedFragmentState.getParcelable("state");
            if (o1Var != null) {
                j0Var.mTargetWho = o1Var.M;
                j0Var.mTargetRequestCode = o1Var.N;
                Boolean bool = j0Var.mSavedUserVisibleHint;
                if (bool != null) {
                    j0Var.mUserVisibleHint = bool.booleanValue();
                    j0Var.mSavedUserVisibleHint = null;
                } else {
                    j0Var.mUserVisibleHint = o1Var.O;
                }
            }
            if (j0Var.mUserVisibleHint) {
                return;
            }
            j0Var.mDeferStart = true;
        } catch (BadParcelableException e3) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + j0Var, e3);
        }
    }

    public final void m() {
        boolean zRequestFocus;
        String str;
        boolean zK = i1.K(3);
        j0 j0Var = this.f809c;
        if (zK) {
            Log.d("FragmentManager", "moveto RESUMED: " + j0Var);
        }
        View focusedView = j0Var.getFocusedView();
        if (focusedView != null) {
            if (focusedView == j0Var.mView) {
                zRequestFocus = focusedView.requestFocus();
                if (i1.K(2)) {
                    StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                    sb2.append(focusedView);
                    sb2.append(" ");
                    if (zRequestFocus) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb2.append(str);
                    sb2.append(" on Fragment ");
                    sb2.append(j0Var);
                    sb2.append(" resulting in focused view ");
                    sb2.append(j0Var.mView.findFocus());
                    Log.v("FragmentManager", sb2.toString());
                }
            } else {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == j0Var.mView) {
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                zRequestFocus = focusedView.requestFocus();
                if (i1.K(2)) {
                    StringBuilder sb3 = new StringBuilder("requestFocus: Restoring focused view ");
                    sb3.append(focusedView);
                    sb3.append(" ");
                    if (zRequestFocus) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb3.append(str);
                    sb3.append(" on Fragment ");
                    sb3.append(j0Var);
                    sb3.append(" resulting in focused view ");
                    sb3.append(j0Var.mView.findFocus());
                    Log.v("FragmentManager", sb3.toString());
                }
            }
        }
        j0Var.setFocusedView(null);
        j0Var.performResume();
        this.f807a.i(j0Var, false);
        this.f808b.i(j0Var.mWho, null);
        j0Var.mSavedFragmentState = null;
        j0Var.mSavedViewState = null;
        j0Var.mSavedViewRegistryState = null;
    }

    public final Bundle n() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        j0 j0Var = this.f809c;
        if (j0Var.mState == -1 && (bundle = j0Var.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new o1(j0Var));
        if (j0Var.mState > 0) {
            Bundle bundle3 = new Bundle();
            j0Var.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f807a.j(j0Var, bundle3, false);
            Bundle bundle4 = new Bundle();
            j0Var.mSavedStateRegistryController.b(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleX = j0Var.mChildFragmentManager.X();
            if (!bundleX.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleX);
            }
            if (j0Var.mView != null) {
                o();
            }
            SparseArray<Parcelable> sparseArray = j0Var.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = j0Var.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = j0Var.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void o() {
        j0 j0Var = this.f809c;
        if (j0Var.mView == null) {
            return;
        }
        if (i1.K(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + j0Var + " with view " + j0Var.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        j0Var.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            j0Var.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        j0Var.mViewLifecycleOwner.E.b(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        j0Var.mSavedViewRegistryState = bundle;
    }
}
