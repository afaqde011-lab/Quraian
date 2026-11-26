package androidx.fragment.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.internal.measurement.y3;

public class x extends j0 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private boolean mCreatingDialog;
    private Dialog mDialog;
    private boolean mDismissed;
    private Handler mHandler;
    private boolean mShownByMe;
    private boolean mViewDestroyed;
    private Runnable mDismissRunnable = new t(this, 0);
    private DialogInterface.OnCancelListener mOnCancelListener = new u(this);
    private DialogInterface.OnDismissListener mOnDismissListener = new v(this);
    private int mStyle = 0;
    private int mTheme = 0;
    private boolean mCancelable = true;
    private boolean mShowsDialog = true;
    private int mBackStackId = -1;
    private androidx.lifecycle.g0 mObserver = new e0(this, 1);
    private boolean mDialogCreated = false;

    @Override
    public r0 createFragmentContainer() {
        return new w(this, super.createFragmentContainer());
    }

    public void dismiss() {
        i(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        i(true, false, false);
    }

    public void dismissNow() {
        i(false, false, true);
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public final void i(boolean z10, boolean z11, boolean z12) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            if (z12) {
                i1 parentFragmentManager = getParentFragmentManager();
                int i10 = this.mBackStackId;
                if (i10 < 0) {
                    parentFragmentManager.getClass();
                    throw new IllegalArgumentException(g4.c.f(i10, "Bad id: "));
                }
                parentFragmentManager.S(i10, 1);
            } else {
                i1 parentFragmentManager2 = getParentFragmentManager();
                int i11 = this.mBackStackId;
                parentFragmentManager2.getClass();
                if (i11 < 0) {
                    throw new IllegalArgumentException(g4.c.f(i11, "Bad id: "));
                }
                parentFragmentManager2.x(new g1(parentFragmentManager2, i11), z10);
            }
            this.mBackStackId = -1;
            return;
        }
        i1 parentFragmentManager3 = getParentFragmentManager();
        parentFragmentManager3.getClass();
        a aVar = new a(parentFragmentManager3);
        aVar.f844o = true;
        aVar.h(this);
        if (z12) {
            if (aVar.f838g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            aVar.f686q.A(aVar, false);
        } else if (z10) {
            aVar.f(true, true);
        } else {
            aVar.f(false, true);
        }
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override
    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override
    public void onAttach(Context context) {
        Object obj;
        super.onAttach(context);
        androidx.lifecycle.e0 viewLifecycleOwnerLiveData = getViewLifecycleOwnerLiveData();
        androidx.lifecycle.g0 g0Var = this.mObserver;
        viewLifecycleOwnerLiveData.getClass();
        androidx.lifecycle.e0.a("observeForever");
        androidx.lifecycle.b0 b0Var = new androidx.lifecycle.b0(viewLifecycleOwnerLiveData, g0Var);
        r.f fVar = viewLifecycleOwnerLiveData.f989b;
        r.c cVarA = fVar.a(g0Var);
        if (cVarA != null) {
            obj = cVarA.B;
        } else {
            r.c cVar = new r.c(g0Var, b0Var);
            fVar.D++;
            r.c cVar2 = fVar.B;
            if (cVar2 == null) {
                fVar.A = cVar;
                fVar.B = cVar;
            } else {
                cVar2.C = cVar;
                cVar.D = cVar2;
                fVar.B = cVar;
            }
            obj = null;
        }
        androidx.lifecycle.d0 d0Var = (androidx.lifecycle.d0) obj;
        if (d0Var instanceof androidx.lifecycle.c0) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (d0Var == null) {
            b0Var.b(true);
        }
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    @Override
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (i1.K(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new d.p(requireContext(), getTheme());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().g(this.mObserver);
    }

    @Override
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (i1.K(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        i(true, true, false);
    }

    public View onFindViewById(int i10) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    @Override
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        boolean z10 = this.mShowsDialog;
        if (z10 && !this.mCreatingDialog) {
            if (z10 && !this.mDialogCreated) {
                try {
                    this.mCreatingDialog = true;
                    Dialog dialogOnCreateDialog = onCreateDialog(bundle);
                    this.mDialog = dialogOnCreateDialog;
                    if (this.mShowsDialog) {
                        setupDialog(dialogOnCreateDialog, this.mStyle);
                        Context context = getContext();
                        if (context instanceof Activity) {
                            this.mDialog.setOwnerActivity((Activity) context);
                        }
                        this.mDialog.setCancelable(this.mCancelable);
                        this.mDialog.setOnCancelListener(this.mOnCancelListener);
                        this.mDialog.setOnDismissListener(this.mOnDismissListener);
                        this.mDialogCreated = true;
                    } else {
                        this.mDialog = null;
                    }
                    this.mCreatingDialog = false;
                } catch (Throwable th2) {
                    this.mCreatingDialog = false;
                    throw th2;
                }
            }
            if (i1.K(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.mDialog;
            if (dialog != null) {
                return layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (i1.K(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.mShowsDialog) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return layoutInflaterOnGetLayoutInflater;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    public boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, bundleOnSaveInstanceState);
        }
        int i10 = this.mStyle;
        if (i10 != 0) {
            bundle.putInt(SAVED_STYLE, i10);
        }
        int i11 = this.mTheme;
        if (i11 != 0) {
            bundle.putInt(SAVED_THEME, i11);
        }
        boolean z10 = this.mCancelable;
        if (!z10) {
            bundle.putBoolean(SAVED_CANCELABLE, z10);
        }
        boolean z11 = this.mShowsDialog;
        if (!z11) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, z11);
        }
        int i12 = this.mBackStackId;
        if (i12 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i12);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            androidx.lifecycle.u0.k(decorView, this);
            androidx.lifecycle.u0.l(decorView, this);
            y3.X(decorView, this);
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override
    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    public final d.p requireComponentDialog() {
        Dialog dialogRequireDialog = requireDialog();
        if (dialogRequireDialog instanceof d.p) {
            return (d.p) dialogRequireDialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " did not return a ComponentDialog instance from requireDialog(). The actual Dialog is " + dialogRequireDialog);
    }

    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void setCancelable(boolean z10) {
        this.mCancelable = z10;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z10);
        }
    }

    public void setShowsDialog(boolean z10) {
        this.mShowsDialog = z10;
    }

    public void setStyle(int i10, int i11) {
        if (i1.K(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i10 + ", " + i11);
        }
        this.mStyle = i10;
        if (i10 == 2 || i10 == 3) {
            this.mTheme = R.style.Theme.Panel;
        }
        if (i11 != 0) {
            this.mTheme = i11;
        }
    }

    public void setupDialog(Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public int show(t1 t1Var, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        t1Var.c(0, this, str, 1);
        this.mViewDestroyed = false;
        int iF = ((a) t1Var).f(false, true);
        this.mBackStackId = iF;
        return iF;
    }

    public void show(i1 i1Var, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        i1Var.getClass();
        a aVar = new a(i1Var);
        aVar.f844o = true;
        aVar.c(0, this, str, 1);
        aVar.f(false, true);
    }

    public void showNow(i1 i1Var, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        i1Var.getClass();
        a aVar = new a(i1Var);
        aVar.f844o = true;
        aVar.c(0, this, str, 1);
        if (aVar.f838g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        aVar.f686q.A(aVar, false);
    }
}
