package qm;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.o0;
import c3.y1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import eg.f;
import eg.g;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import l1.j;
import o.d;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqm/c;", "Leg/g;", "core_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c extends g {
    public final float A;
    public final boolean B;

    public c() {
        this(0);
    }

    public c(int i) {
        this.A = 0.5f;
        this.B = true;
    }

    public int getTheme() {
        return 2131951917;
    }

    public abstract void j(j jVar, int i);

    public boolean getB() {
        return this.B;
    }

    public boolean l() {
        return false;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Window window;
        WindowManager.LayoutParams attributes;
        final f fVarOnCreateDialog = super.onCreateDialog(bundle);
        fVarOnCreateDialog.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public final void onShow(DialogInterface dialogInterface) {
                FrameLayout frameLayout = (FrameLayout) fVarOnCreateDialog.findViewById(2131362091);
                if (frameLayout != null) {
                    BottomSheetBehavior bottomSheetBehaviorA = BottomSheetBehavior.A(frameLayout);
                    c cVar = this;
                    if (cVar.l()) {
                        bottomSheetBehaviorA.K(3);
                        bottomSheetBehaviorA.J = true;
                        bottomSheetBehaviorA.G(false);
                        bottomSheetBehaviorA.F(0);
                        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = -1;
                        }
                        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.height = -1;
                        }
                    } else if (cVar.getResources().getConfiguration().screenWidthDp > 600) {
                        bottomSheetBehaviorA.G(false);
                        bottomSheetBehaviorA.J = true;
                        bottomSheetBehaviorA.H(cVar.A);
                        bottomSheetBehaviorA.K(6);
                    } else {
                        bottomSheetBehaviorA.K(4);
                    }
                    bottomSheetBehaviorA.K = cVar.getB();
                    frameLayout.setBackground(null);
                }
            }
        });
        Window window2 = fVarOnCreateDialog.getWindow();
        if (window2 != null) {
            Window window3 = fVarOnCreateDialog.getWindow();
            if (window3 == null || (attributes = window3.getAttributes()) == null) {
                attributes = null;
            } else {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window2.setAttributes(attributes);
        }
        if (l() && (window = fVarOnCreateDialog.getWindow()) != null) {
            window.setFlags(512, 512);
        }
        return fVarOnCreateDialog;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        m.e(inflater, "inflater");
        Context contextRequireContext = requireContext();
        m.d(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, (AttributeSet) null, 6);
        composeView.setId(View.generateViewId());
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setViewCompositionStrategy(y1.B);
        composeView.setContent(new v1.c(new b(this, 0), 1596189386, true));
        return composeView;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        m.e(view, "view");
        super/*androidx.fragment.app.j0*/.onViewCreated(view, bundle);
        if (l()) {
            o0 o0VarRequireActivity = requireActivity();
            m.d(o0VarRequireActivity, "requireActivity(...)");
            Object systemService = o0VarRequireActivity.getSystemService("window");
            m.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            Object parent = view.getParent();
            m.c(parent, "null cannot be cast to non-null type android.view.View");
            BottomSheetBehavior.A((View) parent).J(point.y);
            view.getViewTreeObserver().addOnGlobalLayoutListener(new d(view, 4));
        }
        Object parent2 = view.getParent();
        View view2 = parent2 instanceof View ? (View) parent2 : null;
        if (view2 != null) {
            view2.setBackgroundColor(0);
        }
    }
}
