package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.measurement.y3;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class j0 implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.w, androidx.lifecycle.f1, androidx.lifecycle.j, ia.g {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    g0 mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    androidx.lifecycle.c1 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    i1 mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    t0 mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.y mLifecycleRegistry;
    j0 mParentFragment;
    boolean mPerformedCreateView;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    ia.f mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    String mTag;
    j0 mTarget;
    int mTargetRequestCode;
    boolean mTransitioning;
    View mView;
    c2 mViewLifecycleOwner;
    int mState = -1;
    String mWho = UUID.randomUUID().toString();
    String mTargetWho = null;
    private Boolean mIsPrimaryNavigationFragment = null;
    i1 mChildFragmentManager = new j1();
    boolean mMenuVisible = true;
    boolean mUserVisibleHint = true;
    Runnable mPostponedDurationRunnable = new a0(this, 0);
    androidx.lifecycle.p mMaxState = androidx.lifecycle.p.E;
    androidx.lifecycle.f0 mViewLifecycleOwnerLiveData = new androidx.lifecycle.f0();
    private final AtomicInteger mNextLocalRequestCode = new AtomicInteger();
    private final ArrayList<h0> mOnPreAttachedListeners = new ArrayList<>();
    private final h0 mSavedStateAttachListener = new b0(this);

    public j0() {
        g();
    }

    @Deprecated
    public static j0 instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    @Deprecated
    public static j0 instantiate(Context context, String str, Bundle bundle) {
        try {
            j0 j0Var = (j0) b1.b(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return j0Var;
            }
            bundle.setClassLoader(j0Var.getClass().getClassLoader());
            j0Var.setArguments(bundle);
            return j0Var;
        } catch (IllegalAccessException e3) {
            throw new Fragment$InstantiationException(a1.b.p("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (InstantiationException e10) {
            throw new Fragment$InstantiationException(a1.b.p("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (NoSuchMethodException e11) {
            throw new Fragment$InstantiationException(a1.b.p("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e11);
        } catch (InvocationTargetException e12) {
            throw new Fragment$InstantiationException(a1.b.p("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e12);
        }
    }

    public Activity b() {
        return getActivity();
    }

    public void callStartTransitionListener(boolean z10) {
        ViewGroup viewGroup;
        i1 i1Var;
        g0 g0Var = this.mAnimationInfo;
        if (g0Var != null) {
            g0Var.f730s = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (i1Var = this.mFragmentManager) == null) {
            return;
        }
        s sVarJ = s.j(viewGroup, i1Var);
        sVarJ.l();
        if (z10) {
            this.mHost.C.post(new t(sVarJ, 1));
        } else {
            sVarJ.e();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public r0 createFragmentContainer() {
        return new c0(this);
    }

    public final g0 d() {
        if (this.mAnimationInfo == null) {
            g0 g0Var = new g0();
            g0Var.f722i = null;
            Object obj = USE_DEFAULT_TRANSITION;
            g0Var.f723j = obj;
            g0Var.f724k = null;
            g0Var.l = obj;
            g0Var.m = null;
            g0Var.f725n = obj;
            g0Var.f728q = 1.0f;
            g0Var.f729r = null;
            this.mAnimationInfo = g0Var;
        }
        return this.mAnimationInfo;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        j0 j0VarF = f(false);
        if (j0VarF != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(j0VarF);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            x6.a.a(this).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.v(w.c.j(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final int e() {
        androidx.lifecycle.p pVar = this.mMaxState;
        return (pVar == androidx.lifecycle.p.B || this.mParentFragment == null) ? pVar.ordinal() : Math.min(pVar.ordinal(), this.mParentFragment.e());
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final j0 f(boolean z10) {
        String str;
        if (z10) {
            a6.a aVar = a6.b.f192a;
            a6.b.b(new GetTargetFragmentUsageViolation(this, "Attempting to get target fragment from fragment " + this));
            a6.b.a(this).getClass();
        }
        j0 j0Var = this.mTarget;
        if (j0Var != null) {
            return j0Var;
        }
        i1 i1Var = this.mFragmentManager;
        if (i1Var == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return i1Var.f751c.b(str);
    }

    public j0 findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f751c.c(str);
    }

    public final void g() {
        this.mLifecycleRegistry = new androidx.lifecycle.y(this, true);
        this.mSavedStateRegistryController = new ia.f(new androidx.media3.common.h0(this, new g1.l0(this, 10)));
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        h0 h0Var = this.mSavedStateAttachListener;
        if (this.mState >= 0) {
            h0Var.a();
        } else {
            this.mOnPreAttachedListeners.add(h0Var);
        }
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final o0 getActivity() {
        t0 t0Var = this.mHost;
        if (t0Var == null) {
            return null;
        }
        return t0Var.A;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        g0 g0Var = this.mAnimationInfo;
        if (g0Var == null || (bool = g0Var.f727p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        g0 g0Var = this.mAnimationInfo;
        if (g0Var == null || (bool = g0Var.f726o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        g0 g0Var = this.mAnimationInfo;
        if (g0Var == null) {
            return null;
        }
        g0Var.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final i1 getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(a1.b.n("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        t0 t0Var = this.mHost;
        if (t0Var == null) {
            return null;
        }
        return t0Var.B;
    }

    @Override
    public t6.b getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && i1.K(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        t6.d dVar = new t6.d(0);
        LinkedHashMap linkedHashMap = dVar.f14360a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.b1.f978d, application);
        }
        linkedHashMap.put(androidx.lifecycle.u0.f1003a, this);
        linkedHashMap.put(androidx.lifecycle.u0.f1004b, this);
        if (getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.u0.f1005c, getArguments());
        }
        return dVar;
    }

    public androidx.lifecycle.c1 getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && i1.K(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new androidx.lifecycle.x0(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        g0 g0Var = this.mAnimationInfo;
        if (g0Var == null) {
            return 0;
        }
        return g0Var.f715b;
    }

    public Object getEnterTransition() {
        g0 g0Var = this.mAnimationInfo;
        if (g0Var == null) {
            return null;
        }
        return g0Var.f722i;
    }

    public n4.v getEnterTransitionCallback() {
        g0 g0Var = this.mAnimationInfo;
        if (g0Var == null) {
            return null;
        }
        g0Var.getClass();
        return null;
    }

    public int getExitAnim() {
        g0 g0Var = this.mAnimationInfo;
        if (g0Var == null) {
            return 0;
        }
        return g0Var.f716c;
    }

    public Object getExitTransition() {
        g0 g0Var = this.mAnimationInfo;
        if (g0Var == null) {
            return null;
        }
        return g0Var.f724k;
    }

    public n4.v getExitTransitionCallback() {
        g0 g0Var = this.mAnimationInfo;
        if (g0Var == null) {
            return null;
        }
        g0Var.getClass();
        return null;
    }

    public View getFocusedView() {
        g0 g0Var = this.mAnimationInfo;
        if (g0Var == null) {
            return null;
        }
        return g0Var.f729r;
    }

    @Deprecated
    public final i1 getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        t0 t0Var = this.mHost;
        if (t0Var == null) {
            return null;
        }
        return ((n0) t0Var).E;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        t0 t0Var = this.mHost;
        if (t0Var == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        o0 o0Var = ((n0) t0Var).E;
        LayoutInflater layoutInflaterCloneInContext = o0Var.getLayoutInflater().cloneInContext(o0Var);
        layoutInflaterCloneInContext.setFactory2(this.mChildFragmentManager.f754f);
        return layoutInflaterCloneInContext;
    }

    @Override
    public androidx.lifecycle.q getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public x6.a getLoaderManager() {
        return x6.a.a(this);
    }

    public int getNextTransition() {
        g0 g0Var = this.mAnimationInfo;
        if (g0Var == null) {
            return 0;
        }
        return g0Var.f719f;
    }

    public final j0 getParentFragment() {
        return this.mParentFragment;
    }

    public final i1 getParentFragmentManager() {
        i1 i1Var = this.mFragmentManager;
        if (i1Var != null) {
            return i1Var;
        }
        throw new IllegalStateException(a1.b.n("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        g0 g0Var = this.mAnimationInfo;
        if (g0Var == null) {
            return false;
        }
        return g0Var.f714a;
    }

    public int getPopEnterAnim() {
        g0 g0Var = this.mAnimationInfo;
        if (g0Var == null) {
            return 0;
        }
        return g0Var.f717d;
    }

    public int getPopExitAnim() {
        g0 g0Var = this.mAnimationInfo;
        if (g0Var == null) {
            return 0;
        }
        return g0Var.f718e;
    }

    public float getPostOnViewCreatedAlpha() {
        g0 g0Var = this.mAnimationInfo;
        if (g0Var == null) {
            return 1.0f;
        }
        return g0Var.f728q;
    }

    public Object getReenterTransition() {
        g0 g0Var = this.mAnimationInfo;
        if (g0Var == null) {
            return null;
        }
        Object obj = g0Var.l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        a6.a aVar = a6.b.f192a;
        a6.b.b(new GetRetainInstanceUsageViolation(this, "Attempting to get retain instance for fragment " + this));
        a6.b.a(this).getClass();
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        g0 g0Var = this.mAnimationInfo;
        if (g0Var == null) {
            return null;
        }
        Object obj = g0Var.f723j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override
    public final ia.e getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f7566b;
    }

    public Object getSharedElementEnterTransition() {
        g0 g0Var = this.mAnimationInfo;
        if (g0Var == null) {
            return null;
        }
        return g0Var.m;
    }

    public Object getSharedElementReturnTransition() {
        g0 g0Var = this.mAnimationInfo;
        if (g0Var == null) {
            return null;
        }
        Object obj = g0Var.f725n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        g0 g0Var = this.mAnimationInfo;
        return (g0Var == null || (arrayList = g0Var.f720g) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        g0 g0Var = this.mAnimationInfo;
        return (g0Var == null || (arrayList = g0Var.f721h) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i10) {
        return getResources().getString(i10);
    }

    public final String getString(int i10, Object... objArr) {
        return getResources().getString(i10, objArr);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final j0 getTargetFragment() {
        return f(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        a6.a aVar = a6.b.f192a;
        a6.b.b(new GetTargetFragmentRequestCodeUsageViolation(this, "Attempting to get target request code from fragment " + this));
        a6.b.a(this).getClass();
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i10) {
        return getResources().getText(i10);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public androidx.lifecycle.w getViewLifecycleOwner() {
        c2 c2Var = this.mViewLifecycleOwner;
        if (c2Var != null) {
            return c2Var;
        }
        throw new IllegalStateException(a1.b.n("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public androidx.lifecycle.e0 getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override
    public androidx.lifecycle.e1 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        int iE = e();
        androidx.lifecycle.p pVar = androidx.lifecycle.p.A;
        if (iE == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.mFragmentManager.O.f784e;
        androidx.lifecycle.e1 e1Var = (androidx.lifecycle.e1) map.get(this.mWho);
        if (e1Var != null) {
            return e1Var;
        }
        androidx.lifecycle.e1 e1Var2 = new androidx.lifecycle.e1();
        map.put(this.mWho, e1Var2);
        return e1Var2;
    }

    public final z h(i.a aVar, s.a aVar2, h.b bVar) {
        if (this.mState > 1) {
            throw new IllegalStateException(a1.b.n("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        f0 f0Var = new f0(this, aVar2, atomicReference, aVar, bVar);
        if (this.mState >= 0) {
            f0Var.a();
        } else {
            this.mOnPreAttachedListeners.add(f0Var);
        }
        return new z(atomicReference);
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        g();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new j1();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        i1 i1Var = this.mFragmentManager;
        if (i1Var != null) {
            j0 j0Var = this.mParentFragment;
            i1Var.getClass();
            if (j0Var == null ? false : j0Var.isHidden()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        if (this.mFragmentManager != null) {
            j0 j0Var = this.mParentFragment;
            if (!(j0Var == null ? true : j0Var.isMenuVisible())) {
                return false;
            }
        }
        return true;
    }

    public boolean isPostponed() {
        g0 g0Var = this.mAnimationInfo;
        if (g0Var == null) {
            return false;
        }
        return g0Var.f730s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        i1 i1Var = this.mFragmentManager;
        if (i1Var == null) {
            return false;
        }
        return i1Var.O();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.Q();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i1.K(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        t0 t0Var = this.mHost;
        o0 o0Var = t0Var == null ? null : t0Var.A;
        if (o0Var != null) {
            this.mCalled = false;
            onAttach((Activity) o0Var);
        }
    }

    @Deprecated
    public void onAttachFragment(j0 j0Var) {
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        i1 i1Var = this.mChildFragmentManager;
        if (i1Var.f768v >= 1) {
            return;
        }
        i1Var.H = false;
        i1Var.I = false;
        i1Var.O.f787h = false;
        i1Var.u(1);
    }

    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        return null;
    }

    public Animator onCreateAnimator(int i10, boolean z10, int i11) {
        return null;
    }

    @Override
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z10) {
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        t0 t0Var = this.mHost;
        o0 o0Var = t0Var == null ? null : t0Var.A;
        if (o0Var != null) {
            this.mCalled = false;
            onInflate((Activity) o0Var, attributeSet, bundle);
        }
    }

    @Override
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z10) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z10) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z10) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.Q();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new i2(a1.b.n("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        if (i1.K(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle2 = this.mSavedFragmentState;
            restoreViewState(bundle2 != null ? bundle2.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
        i1 i1Var = this.mChildFragmentManager;
        i1Var.H = false;
        i1Var.I = false;
        i1Var.O.f787h = false;
        i1Var.u(4);
    }

    public void performAttach() {
        Iterator<h0> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.B);
        if (!this.mCalled) {
            throw new i2(a1.b.n("Fragment ", this, " did not call through to super.onAttach()"));
        }
        Iterator it2 = this.mFragmentManager.f762p.iterator();
        while (it2.hasNext()) {
            ((n1) it2.next()).a(this);
        }
        i1 i1Var = this.mChildFragmentManager;
        i1Var.H = false;
        i1Var.I = false;
        i1Var.O.f787h = false;
        i1Var.u(0);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.j(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.Q();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new d0(this));
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new i2(a1.b.n("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.g(androidx.lifecycle.o.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z10 = true;
        }
        return this.mChildFragmentManager.k(menu, menuInflater) | z10;
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.Q();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new c2(this, getViewModelStore(), new y(this, 0));
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.D != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.b();
        if (i1.K(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        androidx.lifecycle.u0.k(this.mView, this.mViewLifecycleOwner);
        androidx.lifecycle.u0.l(this.mView, this.mViewLifecycleOwner);
        y3.X(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.h(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.l();
        this.mLifecycleRegistry.g(androidx.lifecycle.o.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new i2(a1.b.n("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.u(1);
        if (this.mView != null) {
            c2 c2Var = this.mViewLifecycleOwner;
            c2Var.b();
            if (c2Var.D.f1022d.compareTo(androidx.lifecycle.p.C) >= 0) {
                this.mViewLifecycleOwner.a(androidx.lifecycle.o.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new i2(a1.b.n("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        u.t0 t0Var = x6.a.a(this).f16471b.f16468c;
        int i10 = t0Var.C;
        for (int i11 = 0; i11 < i10; i11++) {
            ((x6.b) t0Var.f(i11)).j();
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new i2(a1.b.n("Fragment ", this, " did not call through to super.onDetach()"));
        }
        i1 i1Var = this.mChildFragmentManager;
        if (i1Var.J) {
            return;
        }
        i1Var.l();
        this.mChildFragmentManager = new j1();
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z10) {
        onMultiWindowModeChanged(z10);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.p(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.q(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.u(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.o.ON_PAUSE);
        }
        this.mLifecycleRegistry.g(androidx.lifecycle.o.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new i2(a1.b.n("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z10) {
        onPictureInPictureModeChanged(z10);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z10 = true;
        }
        return this.mChildFragmentManager.t(menu) | z10;
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean zN = i1.N(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zN) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zN);
            onPrimaryNavigationFragmentChanged(zN);
            i1 i1Var = this.mChildFragmentManager;
            i1Var.f0();
            i1Var.r(i1Var.f772z);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.Q();
        this.mChildFragmentManager.z(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new i2(a1.b.n("Fragment ", this, " did not call through to super.onResume()"));
        }
        androidx.lifecycle.y yVar = this.mLifecycleRegistry;
        androidx.lifecycle.o oVar = androidx.lifecycle.o.ON_RESUME;
        yVar.g(oVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.D.g(oVar);
        }
        i1 i1Var = this.mChildFragmentManager;
        i1Var.H = false;
        i1Var.I = false;
        i1Var.O.f787h = false;
        i1Var.u(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.Q();
        this.mChildFragmentManager.z(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new i2(a1.b.n("Fragment ", this, " did not call through to super.onStart()"));
        }
        androidx.lifecycle.y yVar = this.mLifecycleRegistry;
        androidx.lifecycle.o oVar = androidx.lifecycle.o.ON_START;
        yVar.g(oVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.D.g(oVar);
        }
        i1 i1Var = this.mChildFragmentManager;
        i1Var.H = false;
        i1Var.I = false;
        i1Var.O.f787h = false;
        i1Var.u(5);
    }

    public void performStop() {
        i1 i1Var = this.mChildFragmentManager;
        i1Var.I = true;
        i1Var.O.f787h = true;
        i1Var.u(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.o.ON_STOP);
        }
        this.mLifecycleRegistry.g(androidx.lifecycle.o.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new i2(a1.b.n("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.u(2);
    }

    public void postponeEnterTransition() {
        d().f730s = true;
    }

    public final void postponeEnterTransition(long j9, TimeUnit timeUnit) {
        d().f730s = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        i1 i1Var = this.mFragmentManager;
        if (i1Var != null) {
            this.mPostponedHandler = i1Var.f769w.C;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j9));
    }

    public final <I, O> h.c registerForActivityResult(i.a aVar, h.b bVar) {
        return h(aVar, new e0(this, 0), bVar);
    }

    public final <I, O> h.c registerForActivityResult(i.a aVar, h.i iVar, h.b bVar) {
        return h(aVar, new e0(iVar, 2), bVar);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i10) {
        if (this.mHost == null) {
            throw new IllegalStateException(a1.b.n("Fragment ", this, " not attached to Activity"));
        }
        i1 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.E == null) {
            parentFragmentManager.f769w.getClass();
            kotlin.jvm.internal.m.e(strArr, "permissions");
        } else {
            parentFragmentManager.F.addLast(new e1(this.mWho, i10));
            parentFragmentManager.E.a(strArr, null);
        }
    }

    public final o0 requireActivity() {
        o0 activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(a1.b.n("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(a1.b.n("Fragment ", this, " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(a1.b.n("Fragment ", this, " not attached to a context."));
    }

    @Deprecated
    public final i1 requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(a1.b.n("Fragment ", this, " not attached to a host."));
    }

    public final j0 requireParentFragment() {
        j0 parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(a1.b.n("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(a1.b.n("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.W(bundle);
        i1 i1Var = this.mChildFragmentManager;
        i1Var.H = false;
        i1Var.I = false;
        i1Var.O.f787h = false;
        i1Var.u(1);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new i2(a1.b.n("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.o.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z10) {
        d().f727p = Boolean.valueOf(z10);
    }

    public void setAllowReturnTransitionOverlap(boolean z10) {
        d().f726o = Boolean.valueOf(z10);
    }

    public void setAnimations(int i10, int i11, int i12, int i13) {
        if (this.mAnimationInfo == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        d().f715b = i10;
        d().f716c = i11;
        d().f717d = i12;
        d().f718e = i13;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(n4.v vVar) {
        d().getClass();
    }

    public void setEnterTransition(Object obj) {
        d().f722i = obj;
    }

    public void setExitSharedElementCallback(n4.v vVar) {
        d().getClass();
    }

    public void setExitTransition(Object obj) {
        d().f724k = obj;
    }

    public void setFocusedView(View view) {
        d().f729r = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z10) {
        if (this.mHasMenu != z10) {
            this.mHasMenu = z10;
            if (!isAdded() || isHidden()) {
                return;
            }
            ((n0) this.mHost).E.invalidateMenu();
        }
    }

    public void setInitialSavedState(i0 i0Var) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (i0Var == null || (bundle = i0Var.A) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z10) {
        if (this.mMenuVisible != z10) {
            this.mMenuVisible = z10;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((n0) this.mHost).E.invalidateMenu();
            }
        }
    }

    public void setNextTransition(int i10) {
        if (this.mAnimationInfo == null && i10 == 0) {
            return;
        }
        d();
        this.mAnimationInfo.f719f = i10;
    }

    public void setPopDirection(boolean z10) {
        if (this.mAnimationInfo == null) {
            return;
        }
        d().f714a = z10;
    }

    public void setPostOnViewCreatedAlpha(float f3) {
        d().f728q = f3;
    }

    public void setReenterTransition(Object obj) {
        d().l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z10) {
        a6.a aVar = a6.b.f192a;
        a6.b.b(new SetRetainInstanceUsageViolation(this, "Attempting to set retain instance for fragment " + this));
        a6.b.a(this).getClass();
        this.mRetainInstance = z10;
        i1 i1Var = this.mFragmentManager;
        if (i1Var == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z10) {
            i1Var.O.h(this);
        } else {
            i1Var.O.l(this);
        }
    }

    public void setReturnTransition(Object obj) {
        d().f723j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        d().m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        d();
        g0 g0Var = this.mAnimationInfo;
        g0Var.f720g = arrayList;
        g0Var.f721h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        d().f725n = obj;
    }

    @Deprecated
    public void setTargetFragment(j0 j0Var, int i10) {
        if (j0Var != null) {
            a6.a aVar = a6.b.f192a;
            a6.b.b(new SetTargetFragmentUsageViolation(this, "Attempting to set target fragment " + j0Var + " with request code " + i10 + " for fragment " + this));
            a6.b.a(this).getClass();
        }
        i1 i1Var = this.mFragmentManager;
        i1 i1Var2 = j0Var != null ? j0Var.mFragmentManager : null;
        if (i1Var != null && i1Var2 != null && i1Var != i1Var2) {
            throw new IllegalArgumentException(a1.b.n("Fragment ", j0Var, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (j0 j0VarF = j0Var; j0VarF != null; j0VarF = j0VarF.f(false)) {
            if (j0VarF.equals(this)) {
                throw new IllegalArgumentException("Setting " + j0Var + " as the target of " + this + " would create a target cycle");
            }
        }
        if (j0Var == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || j0Var.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = j0Var;
        } else {
            this.mTargetWho = j0Var.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i10;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z10) {
        a6.a aVar = a6.b.f192a;
        a6.b.b(new SetUserVisibleHintViolation(this, "Attempting to set user visible hint to " + z10 + " for fragment " + this));
        a6.b.a(this).getClass();
        boolean z11 = false;
        if (!this.mUserVisibleHint && z10 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            i1 i1Var = this.mFragmentManager;
            q1 q1VarG = i1Var.g(this);
            j0 j0Var = q1VarG.f809c;
            if (j0Var.mDeferStart) {
                if (i1Var.f750b) {
                    i1Var.K = true;
                } else {
                    j0Var.mDeferStart = false;
                    q1VarG.k();
                }
            }
        }
        this.mUserVisibleHint = z10;
        if (this.mState < 5 && !z10) {
            z11 = true;
        }
        this.mDeferStart = z11;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z10);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        t0 t0Var = this.mHost;
        if (t0Var != null) {
            return ((n0) t0Var).E.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        t0 t0Var = this.mHost;
        if (t0Var == null) {
            throw new IllegalStateException(a1.b.n("Fragment ", this, " not attached to Activity"));
        }
        kotlin.jvm.internal.m.e(intent, "intent");
        t0Var.B.startActivity(intent, bundle);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        startActivityForResult(intent, i10, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(a1.b.n("Fragment ", this, " not attached to Activity"));
        }
        i1 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.C != null) {
            parentFragmentManager.F.addLast(new e1(this.mWho, i10));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.C.a(intent, null);
            return;
        }
        t0 t0Var = parentFragmentManager.f769w;
        t0Var.getClass();
        kotlin.jvm.internal.m.e(intent, "intent");
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        t0Var.B.startActivity(intent, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new IllegalStateException(a1.b.n("Fragment ", this, " not attached to Activity"));
        }
        if (i1.K(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i10 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        i1 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.D == null) {
            t0 t0Var = parentFragmentManager.f769w;
            t0Var.getClass();
            kotlin.jvm.internal.m.e(intentSender, "intent");
            if (i10 != -1) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            o0 o0Var = t0Var.A;
            if (o0Var == null) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            o0Var.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (i1.K(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + this);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        kotlin.jvm.internal.m.e(intentSender, "intentSender");
        h.k kVar = new h.k(intentSender, intent, i11, i12);
        parentFragmentManager.F.addLast(new e1(this.mWho, i10));
        if (i1.K(2)) {
            Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
        }
        parentFragmentManager.D.a(kVar, null);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !d().f730s) {
            return;
        }
        if (this.mHost == null) {
            d().f730s = false;
        } else if (Looper.myLooper() != this.mHost.C.getLooper()) {
            this.mHost.C.postAtFrontOfQueue(new a0(this, 1));
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(Cast.MAX_NAMESPACE_LENGTH);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }
}
