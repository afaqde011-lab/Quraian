package d;

import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.a1;
import androidx.lifecycle.b1;
import androidx.lifecycle.c1;
import androidx.lifecycle.e1;
import androidx.lifecycle.f1;
import androidx.lifecycle.o0;
import androidx.lifecycle.q0;
import androidx.lifecycle.u0;
import c3.s1;
import com.google.android.gms.internal.measurement.y3;
import g1.l0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;

public abstract class n extends n4.d implements f1, androidx.lifecycle.j, ia.g, g0, s9.d, h.j, o4.b, o4.c, n4.q, n4.r, z4.k {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final h Companion = new h();
    private e1 _viewModelStore;
    private final h.i activityResultRegistry;
    private int contentLayoutId;
    private final g00.h defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final g00.h fullyDrawnReporter$delegate;
    private boolean hasPictureInPictureSystemFeature;
    private final AtomicInteger nextLocalRequestCode;
    private final g00.h onBackPressedDispatcher$delegate;
    private final g00.h onBackPressedInput$delegate;
    private final CopyOnWriteArrayList<y4.a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<y4.a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<y4.a> onNewIntentListeners;
    private final CopyOnWriteArrayList<y4.a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<y4.a> onPictureInPictureUiStateChangedListeners;
    private final CopyOnWriteArrayList<y4.a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final j reportFullyDrawnExecutor;
    private final ia.f savedStateRegistryController;
    private final g.a contextAwareHelper = new g.a();
    private final z4.m menuHostHelper = new z4.m(new c(this, 0));

    public n() {
        androidx.media3.common.h0 h0Var = new androidx.media3.common.h0(this, new l0(this, 10));
        this.savedStateRegistryController = new ia.f(h0Var);
        this.reportFullyDrawnExecutor = new k(this);
        this.fullyDrawnReporter$delegate = rd.a.J(new d(this, 1));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new m(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureUiStateChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput$delegate = rd.a.J(new d(this, 2));
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i10 = 0;
        getLifecycle().a(new androidx.lifecycle.u(this) {
            public final n B;

            {
                this.B = this;
            }

            @Override
            public final void a(androidx.lifecycle.w wVar, androidx.lifecycle.o oVar) {
                Window window;
                View viewPeekDecorView;
                switch (i10) {
                    case 0:
                        if (oVar == androidx.lifecycle.o.ON_STOP && (window = this.B.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        n.c(this.B, wVar, oVar);
                        break;
                }
            }
        });
        final int i11 = 1;
        getLifecycle().a(new androidx.lifecycle.u(this) {
            public final n B;

            {
                this.B = this;
            }

            @Override
            public final void a(androidx.lifecycle.w wVar, androidx.lifecycle.o oVar) {
                Window window;
                View viewPeekDecorView;
                switch (i11) {
                    case 0:
                        if (oVar == androidx.lifecycle.o.ON_STOP && (window = this.B.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        n.c(this.B, wVar, oVar);
                        break;
                }
            }
        });
        getLifecycle().a(new ia.b(this, 3));
        h0Var.a();
        u0.d(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new s1(this, 1));
        addOnContextAvailableListener(new g.b() {
            @Override
            public final void a(n nVar) {
                n.e(this.f4386a, nVar);
            }
        });
        this.defaultViewModelProviderFactory$delegate = rd.a.J(new d(this, 3));
        this.onBackPressedDispatcher$delegate = rd.a.J(new d(this, 4));
    }

    public static Bundle a(n nVar) {
        Bundle bundle = new Bundle();
        h.i iVar = nVar.activityResultRegistry;
        iVar.getClass();
        LinkedHashMap linkedHashMap = iVar.f6371b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(iVar.f6373d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(iVar.f6376g));
        return bundle;
    }

    public static final void access$ensureViewModelStore(n nVar) {
        if (nVar._viewModelStore == null) {
            i iVar = (i) nVar.getLastNonConfigurationInstance();
            if (iVar != null) {
                nVar._viewModelStore = iVar.f4391b;
            }
            if (nVar._viewModelStore == null) {
                nVar._viewModelStore = new e1();
            }
        }
    }

    public static x b(n nVar) {
        return new x(nVar.reportFullyDrawnExecutor, new d(nVar, 0));
    }

    public static void c(n nVar, androidx.lifecycle.w wVar, androidx.lifecycle.o oVar) {
        if (oVar == androidx.lifecycle.o.ON_DESTROY) {
            nVar.contextAwareHelper.f5702b = null;
            if (!nVar.isChangingConfigurations()) {
                nVar.getViewModelStore().a();
            }
            k kVar = (k) nVar.reportFullyDrawnExecutor;
            n nVar2 = kVar.D;
            nVar2.getWindow().getDecorView().removeCallbacks(kVar);
            nVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(kVar);
        }
    }

    public static void d(n nVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e3) {
            if (!kotlin.jvm.internal.m.a(e3.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e3;
            }
        } catch (NullPointerException e10) {
            if (!kotlin.jvm.internal.m.a(e10.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e10;
            }
        }
    }

    public static void e(n nVar, Context context) {
        kotlin.jvm.internal.m.e(context, "it");
        Bundle bundleA = nVar.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            h.i iVar = nVar.activityResultRegistry;
            LinkedHashMap linkedHashMap = iVar.f6371b;
            LinkedHashMap linkedHashMap2 = iVar.f6370a;
            Bundle bundle = iVar.f6376g;
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                iVar.f6373d.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                String str = stringArrayList.get(i10);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        kotlin.jvm.internal.d0.b(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i10);
                kotlin.jvm.internal.m.d(num2, "get(...)");
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i10);
                kotlin.jvm.internal.m.d(str2, "get(...)");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                iVar.f6371b.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        j jVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView, "getDecorView(...)");
        ((k) jVar).a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override
    public void addMenuProvider(z4.n nVar) {
        kotlin.jvm.internal.m.e(nVar, "provider");
        z4.m mVar = this.menuHostHelper;
        mVar.f17207b.add(nVar);
        mVar.f17206a.run();
    }

    public void addMenuProvider(z4.n nVar, androidx.lifecycle.w wVar) {
        kotlin.jvm.internal.m.e(nVar, "provider");
        kotlin.jvm.internal.m.e(wVar, "owner");
        z4.m mVar = this.menuHostHelper;
        mVar.f17207b.add(nVar);
        mVar.f17206a.run();
        androidx.lifecycle.q lifecycle = wVar.getLifecycle();
        HashMap map = mVar.f17208c;
        z4.l lVar = (z4.l) map.remove(nVar);
        if (lVar != null) {
            lVar.f17204a.d(lVar.f17205b);
            lVar.f17205b = null;
        }
        map.put(nVar, new z4.l(lifecycle, new e(mVar, nVar, 1)));
    }

    public void addMenuProvider(z4.n nVar, androidx.lifecycle.w wVar, androidx.lifecycle.p pVar) {
        kotlin.jvm.internal.m.e(nVar, "provider");
        kotlin.jvm.internal.m.e(wVar, "owner");
        kotlin.jvm.internal.m.e(pVar, "state");
        z4.m mVar = this.menuHostHelper;
        mVar.getClass();
        androidx.lifecycle.q lifecycle = wVar.getLifecycle();
        HashMap map = mVar.f17208c;
        z4.l lVar = (z4.l) map.remove(nVar);
        if (lVar != null) {
            lVar.f17204a.d(lVar.f17205b);
            lVar.f17205b = null;
        }
        map.put(nVar, new z4.l(lifecycle, new lu.v(mVar, pVar, nVar, 2)));
    }

    @Override
    public final void addOnConfigurationChangedListener(y4.a aVar) {
        kotlin.jvm.internal.m.e(aVar, "listener");
        this.onConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(g.b bVar) {
        kotlin.jvm.internal.m.e(bVar, "listener");
        g.a aVar = this.contextAwareHelper;
        aVar.getClass();
        n nVar = aVar.f5702b;
        if (nVar != null) {
            bVar.a(nVar);
        }
        aVar.f5701a.add(bVar);
    }

    @Override
    public final void addOnMultiWindowModeChangedListener(y4.a aVar) {
        kotlin.jvm.internal.m.e(aVar, "listener");
        this.onMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(y4.a aVar) {
        kotlin.jvm.internal.m.e(aVar, "listener");
        this.onNewIntentListeners.add(aVar);
    }

    @Override
    public final void addOnPictureInPictureModeChangedListener(y4.a aVar) {
        kotlin.jvm.internal.m.e(aVar, "listener");
        this.onPictureInPictureModeChangedListeners.add(aVar);
    }

    public final void addOnPictureInPictureUiStateChangedListener(y4.a aVar) {
        kotlin.jvm.internal.m.e(aVar, "listener");
        this.onPictureInPictureUiStateChangedListeners.add(aVar);
    }

    @Override
    public final void addOnTrimMemoryListener(y4.a aVar) {
        kotlin.jvm.internal.m.e(aVar, "listener");
        this.onTrimMemoryListeners.add(aVar);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        kotlin.jvm.internal.m.e(runnable, "listener");
        this.onUserLeaveHintListeners.add(runnable);
    }

    public final void enterPictureInPictureMode(n4.t tVar) {
        kotlin.jvm.internal.m.e(tVar, "params");
        throw null;
    }

    @Override
    public final h.i getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override
    public t6.b getDefaultViewModelCreationExtras() {
        t6.d dVar = new t6.d(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = dVar.f14360a;
        if (application != null) {
            linkedHashMap.put(b1.f978d, getApplication());
        }
        linkedHashMap.put(u0.f1003a, this);
        linkedHashMap.put(u0.f1004b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(u0.f1005c, extras);
        }
        return dVar;
    }

    public c1 getDefaultViewModelProviderFactory() {
        return (c1) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public x getFullyDrawnReporter() {
        return (x) this.fullyDrawnReporter$delegate.getValue();
    }

    @g00.c
    public Object getLastCustomNonConfigurationInstance() {
        i iVar = (i) getLastNonConfigurationInstance();
        if (iVar != null) {
            return iVar.f4390a;
        }
        return null;
    }

    @Override
    public androidx.lifecycle.q getLifecycle() {
        return super.getLifecycle();
    }

    @Override
    public s9.c getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().b().f4380c;
    }

    @Override
    public final e0 getOnBackPressedDispatcher() {
        return (e0) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override
    public final ia.e getSavedStateRegistry() {
        return this.savedStateRegistryController.f7566b;
    }

    @Override
    public e1 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this._viewModelStore == null) {
            i iVar = (i) getLastNonConfigurationInstance();
            if (iVar != null) {
                this._viewModelStore = iVar.f4391b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new e1();
            }
        }
        e1 e1Var = this._viewModelStore;
        kotlin.jvm.internal.m.b(e1Var);
        return e1Var;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView, "getDecorView(...)");
        u0.k(decorView, this);
        View decorView2 = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView2, "getDecorView(...)");
        u0.l(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView3, "getDecorView(...)");
        y3.X(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView4, "getDecorView(...)");
        decorView4.setTag(2131363130, this);
        View decorView5 = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView5, "getDecorView(...)");
        decorView5.setTag(2131362964, this);
        View decorView6 = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView6, "getDecorView(...)");
        decorView6.setTag(2131363129, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.activityResultRegistry.a(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override
    @g00.c
    public void onBackPressed() {
        ((s9.a) this.onBackPressedInput$delegate.getValue()).a();
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        kotlin.jvm.internal.m.e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator<y4.a> it = this.onConfigurationChangedListeners.iterator();
        kotlin.jvm.internal.m.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.a(bundle);
        g.a aVar = this.contextAwareHelper;
        aVar.getClass();
        aVar.f5702b = this;
        Iterator it = aVar.f5701a.iterator();
        while (it.hasNext()) {
            ((g.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i10 = q0.A;
        o0.b(this);
        int i11 = this.contentLayoutId;
        if (i11 != 0) {
            setContentView(i11);
        }
        this.hasPictureInPictureSystemFeature = getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        kotlin.jvm.internal.m.e(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        z4.m mVar = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = mVar.f17207b.iterator();
        while (it.hasNext()) {
            ((a1) ((z4.n) it.next())).f689a.k(menu, menuInflater);
        }
        return true;
    }

    @Override
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        kotlin.jvm.internal.m.e(menuItem, "item");
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.menuHostHelper.a(menuItem);
        }
        return false;
    }

    @Override
    @g00.c
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<y4.a> it = this.onMultiWindowModeChangedListeners.iterator();
        kotlin.jvm.internal.m.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new n4.e(z10));
        }
    }

    @Override
    public void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        kotlin.jvm.internal.m.e(configuration, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<y4.a> it = this.onMultiWindowModeChangedListeners.iterator();
            kotlin.jvm.internal.m.d(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new n4.e(z10));
            }
        } catch (Throwable th2) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    @Override
    public void onNewIntent(Intent intent) {
        kotlin.jvm.internal.m.e(intent, "intent");
        super.onNewIntent(intent);
        Iterator<y4.a> it = this.onNewIntentListeners.iterator();
        kotlin.jvm.internal.m.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override
    public void onPanelClosed(int i10, Menu menu) {
        kotlin.jvm.internal.m.e(menu, "menu");
        Iterator it = this.menuHostHelper.f17207b.iterator();
        while (it.hasNext()) {
            ((a1) ((z4.n) it.next())).f689a.q(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    @Override
    @g00.c
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<y4.a> it = this.onPictureInPictureModeChangedListeners.iterator();
        kotlin.jvm.internal.m.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new n4.s(z10));
        }
    }

    @Override
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        kotlin.jvm.internal.m.e(configuration, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<y4.a> it = this.onPictureInPictureModeChangedListeners.iterator();
            kotlin.jvm.internal.m.d(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new n4.s(z10));
            }
        } catch (Throwable th2) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    @Override
    public void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        hb.f fVar;
        kotlin.jvm.internal.m.e(pictureInPictureUiState, "pipState");
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        if (Build.VERSION.SDK_INT >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            fVar = new hb.f();
        } else {
            pictureInPictureUiState.isStashed();
            fVar = new hb.f();
        }
        Iterator<y4.a> it = this.onPictureInPictureUiStateChangedListeners.iterator();
        kotlin.jvm.internal.m.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(fVar);
        }
    }

    @Override
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        kotlin.jvm.internal.m.e(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        Iterator it = this.menuHostHelper.f17207b.iterator();
        while (it.hasNext()) {
            ((a1) ((z4.n) it.next())).f689a.t(menu);
        }
        return true;
    }

    @Override
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        kotlin.jvm.internal.m.e(strArr, "permissions");
        kotlin.jvm.internal.m.e(iArr, "grantResults");
        if (this.activityResultRegistry.a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @g00.c
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override
    public final Object onRetainNonConfigurationInstance() {
        i iVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        e1 e1Var = this._viewModelStore;
        if (e1Var == null && (iVar = (i) getLastNonConfigurationInstance()) != null) {
            e1Var = iVar.f4391b;
        }
        if (e1Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        i iVar2 = new i();
        iVar2.f4390a = objOnRetainCustomNonConfigurationInstance;
        iVar2.f4391b = e1Var;
        return iVar2;
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) throws NoWhenBranchMatchedException {
        kotlin.jvm.internal.m.e(bundle, "outState");
        if (getLifecycle() instanceof androidx.lifecycle.y) {
            androidx.lifecycle.q lifecycle = getLifecycle();
            kotlin.jvm.internal.m.c(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((androidx.lifecycle.y) lifecycle).i(androidx.lifecycle.p.C);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.b(bundle);
    }

    @Override
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<y4.a> it = this.onTrimMemoryListeners.iterator();
        kotlin.jvm.internal.m.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    @Override
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        kotlin.jvm.internal.m.d(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.f5702b;
    }

    public final <I, O> h.c registerForActivityResult(i.a aVar, h.b bVar) {
        kotlin.jvm.internal.m.e(aVar, "contract");
        kotlin.jvm.internal.m.e(bVar, "callback");
        return registerForActivityResult(aVar, this.activityResultRegistry, bVar);
    }

    public final <I, O> h.c registerForActivityResult(i.a aVar, h.i iVar, h.b bVar) {
        kotlin.jvm.internal.m.e(aVar, "contract");
        kotlin.jvm.internal.m.e(iVar, "registry");
        kotlin.jvm.internal.m.e(bVar, "callback");
        return iVar.c("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, aVar, bVar);
    }

    @Override
    public void removeMenuProvider(z4.n nVar) {
        kotlin.jvm.internal.m.e(nVar, "provider");
        this.menuHostHelper.b(nVar);
    }

    @Override
    public final void removeOnConfigurationChangedListener(y4.a aVar) {
        kotlin.jvm.internal.m.e(aVar, "listener");
        this.onConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(g.b bVar) {
        kotlin.jvm.internal.m.e(bVar, "listener");
        g.a aVar = this.contextAwareHelper;
        aVar.getClass();
        aVar.f5701a.remove(bVar);
    }

    @Override
    public final void removeOnMultiWindowModeChangedListener(y4.a aVar) {
        kotlin.jvm.internal.m.e(aVar, "listener");
        this.onMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(y4.a aVar) {
        kotlin.jvm.internal.m.e(aVar, "listener");
        this.onNewIntentListeners.remove(aVar);
    }

    @Override
    public final void removeOnPictureInPictureModeChangedListener(y4.a aVar) {
        kotlin.jvm.internal.m.e(aVar, "listener");
        this.onPictureInPictureModeChangedListeners.remove(aVar);
    }

    public final void removeOnPictureInPictureUiStateChangedListener(y4.a aVar) {
        kotlin.jvm.internal.m.e(aVar, "listener");
        this.onPictureInPictureUiStateChangedListeners.remove(aVar);
    }

    @Override
    public final void removeOnTrimMemoryListener(y4.a aVar) {
        kotlin.jvm.internal.m.e(aVar, "listener");
        this.onTrimMemoryListeners.remove(aVar);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        kotlin.jvm.internal.m.e(runnable, "listener");
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override
    public void reportFullyDrawn() {
        try {
            if (Trace.isEnabled()) {
                kh.o.n("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            x fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f4394a) {
                try {
                    fullyDrawnReporter.f4395b = true;
                    Iterator it = fullyDrawnReporter.f4396c.iterator();
                    while (it.hasNext()) {
                        ((u00.a) it.next()).invoke();
                    }
                    fullyDrawnReporter.f4396c.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Trace.endSection();
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    @Override
    public void setContentView(int i10) {
        initializeViewTreeOwners();
        j jVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView, "getDecorView(...)");
        ((k) jVar).a(decorView);
        super.setContentView(i10);
    }

    @Override
    public void setContentView(View view) {
        initializeViewTreeOwners();
        j jVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView, "getDecorView(...)");
        ((k) jVar).a(decorView);
        super.setContentView(view);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        j jVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.m.d(decorView, "getDecorView(...)");
        ((k) jVar).a(decorView);
        super.setContentView(view, layoutParams);
    }

    public final void setPictureInPictureParams(n4.t tVar) {
        kotlin.jvm.internal.m.e(tVar, "params");
        throw null;
    }

    @Override
    @g00.c
    public void startActivityForResult(Intent intent, int i10) {
        kotlin.jvm.internal.m.e(intent, "intent");
        super.startActivityForResult(intent, i10);
    }

    @Override
    @g00.c
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        kotlin.jvm.internal.m.e(intent, "intent");
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override
    @g00.c
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        kotlin.jvm.internal.m.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override
    @g00.c
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        kotlin.jvm.internal.m.e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }
}
