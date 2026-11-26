package androidx.fragment.app;

import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.NoWhenBranchMatchedException;

public abstract class o0 extends d.n implements n4.a {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    boolean mResumed;
    final s0 mFragments = new s0(new n0(this));
    final androidx.lifecycle.y mFragmentLifecycleRegistry = new androidx.lifecycle.y(this, true);
    boolean mStopped = true;

    public o0() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new k0(this, 0));
        final int i10 = 0;
        addOnConfigurationChangedListener(new y4.a(this) {

            public final o0 f778b;

            {
                this.f778b = this;
            }

            @Override
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.f778b.mFragments.a();
                        break;
                    default:
                        this.f778b.mFragments.a();
                        break;
                }
            }
        });
        final int i11 = 1;
        addOnNewIntentListener(new y4.a(this) {

            public final o0 f778b;

            {
                this.f778b = this;
            }

            @Override
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        this.f778b.mFragments.a();
                        break;
                    default:
                        this.f778b.mFragments.a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new g.b() {
            @Override
            public final void a(d.n nVar) {
                n0 n0Var = this.f780a.mFragments.f822a;
                n0Var.D.b(n0Var, n0Var, null);
            }
        });
    }

    public static boolean f(i1 i1Var) throws NoWhenBranchMatchedException {
        androidx.lifecycle.p pVar = androidx.lifecycle.p.C;
        boolean zF = false;
        for (j0 j0Var : i1Var.f751c.f()) {
            if (j0Var != null) {
                if (j0Var.getHost() != null) {
                    zF |= f(j0Var.getChildFragmentManager());
                }
                c2 c2Var = j0Var.mViewLifecycleOwner;
                if (c2Var != null) {
                    c2Var.b();
                    if (c2Var.D.f1022d.compareTo(androidx.lifecycle.p.D) >= 0) {
                        j0Var.mViewLifecycleOwner.D.i(pVar);
                        zF = true;
                    }
                }
                if (j0Var.mLifecycleRegistry.f1022d.compareTo(androidx.lifecycle.p.D) >= 0) {
                    j0Var.mLifecycleRegistry.i(pVar);
                    zF = true;
                }
            }
        }
        return zF;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f822a.D.f754f.onCreateView(view, str, context, attributeSet);
    }

    @Override
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                x6.a.a(this).b(str2, printWriter);
            }
            this.mFragments.f822a.D.v(str, fileDescriptor, printWriter, strArr);
        }
    }

    public i1 getSupportFragmentManager() {
        return this.mFragments.f822a.D;
    }

    @Deprecated
    public x6.a getSupportLoaderManager() {
        return x6.a.a(this);
    }

    public void markFragmentsCreated() {
        i1 supportFragmentManager;
        do {
            supportFragmentManager = getSupportFragmentManager();
            androidx.lifecycle.p pVar = androidx.lifecycle.p.A;
        } while (f(supportFragmentManager));
    }

    @Override
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i10, i11, intent);
    }

    @Deprecated
    public void onAttachFragment(j0 j0Var) {
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.g(androidx.lifecycle.o.ON_CREATE);
        j1 j1Var = this.mFragments.f822a.D;
        j1Var.H = false;
        j1Var.I = false;
        j1Var.O.f787h = false;
        j1Var.u(1);
    }

    @Override
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f822a.D.l();
        this.mFragmentLifecycleRegistry.g(androidx.lifecycle.o.ON_DESTROY);
    }

    @Override
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.mFragments.f822a.D.j(menuItem);
        }
        return false;
    }

    @Override
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f822a.D.u(5);
        this.mFragmentLifecycleRegistry.g(androidx.lifecycle.o.ON_PAUSE);
    }

    @Override
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f822a.D.z(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.g(androidx.lifecycle.o.ON_RESUME);
        j1 j1Var = this.mFragments.f822a.D;
        j1Var.H = false;
        j1Var.I = false;
        j1Var.O.f787h = false;
        j1Var.u(7);
    }

    @Override
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            j1 j1Var = this.mFragments.f822a.D;
            j1Var.H = false;
            j1Var.I = false;
            j1Var.O.f787h = false;
            j1Var.u(4);
        }
        this.mFragments.f822a.D.z(true);
        this.mFragmentLifecycleRegistry.g(androidx.lifecycle.o.ON_START);
        j1 j1Var2 = this.mFragments.f822a.D;
        j1Var2.H = false;
        j1Var2.I = false;
        j1Var2.O.f787h = false;
        j1Var2.u(5);
    }

    @Override
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        j1 j1Var = this.mFragments.f822a.D;
        j1Var.I = true;
        j1Var.O.f787h = true;
        j1Var.u(4);
        this.mFragmentLifecycleRegistry.g(androidx.lifecycle.o.ON_STOP);
    }

    public void setEnterSharedElementCallback(n4.v vVar) {
        setEnterSharedElementCallback((SharedElementCallback) null);
    }

    public void setExitSharedElementCallback(n4.v vVar) {
        setExitSharedElementCallback((SharedElementCallback) null);
    }

    public void startActivityFromFragment(j0 j0Var, Intent intent, int i10) {
        startActivityFromFragment(j0Var, intent, i10, (Bundle) null);
    }

    public void startActivityFromFragment(j0 j0Var, Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            j0Var.startActivityForResult(intent, i10, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(j0 j0Var, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        if (i10 == -1) {
            startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            j0Var.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    @Override
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }
}
