package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import s10.w0;
import z4.d0;
import z4.j0;
import z4.k1;

public class o<S> extends androidx.fragment.app.x {
    public final LinkedHashSet A;
    public final LinkedHashSet B;
    public int C;
    public v D;
    public b E;
    public m F;
    public int G;
    public CharSequence H;
    public boolean I;
    public int J;
    public int K;
    public CharSequence L;
    public int M;
    public CharSequence N;
    public int O;
    public CharSequence P;
    public int Q;
    public CharSequence R;
    public TextView S;
    public CheckableImageButton T;
    public sg.i U;
    public boolean V;
    public CharSequence W;
    public CharSequence X;

    public o() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.A = new LinkedHashSet();
        this.B = new LinkedHashSet();
    }

    public static int k(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(2131166139);
        Calendar calendarB = y.b();
        calendarB.set(5, 1);
        Calendar calendarA = y.a(calendarB);
        calendarA.get(2);
        calendarA.get(1);
        int maximum = calendarA.getMaximum(7);
        calendarA.getActualMaximum(5);
        calendarA.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(2131166145) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(2131166159)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean l(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(z3.P(2130969496, context, m.class.getCanonicalName()).data, new int[]{i10});
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }

    public final void j() {
        if (getArguments().getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.C = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.E = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.G = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.H = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.J = bundle.getInt("INPUT_MODE_KEY");
        this.K = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.L = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.M = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.N = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.O = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.P = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.Q = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.R = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.H;
        if (text == null) {
            text = requireContext().getResources().getText(this.G);
        }
        this.W = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.X = text;
    }

    @Override
    public final Dialog onCreateDialog(Bundle bundle) {
        Context contextRequireContext = requireContext();
        requireContext();
        int i10 = this.C;
        if (i10 == 0) {
            j();
            throw null;
        }
        Dialog dialog = new Dialog(contextRequireContext, i10);
        Context context = dialog.getContext();
        this.I = l(context, R.attr.windowFullscreen);
        this.U = new sg.i(context, null, 2130969496, 2131952891);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, zf.a.m, 2130969496, 2131952891);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.U.j(context);
        this.U.m(ColorStateList.valueOf(color));
        this.U.l(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.I ? 2131559125 : 2131559124, viewGroup);
        Context context = viewInflate.getContext();
        if (this.I) {
            viewInflate.findViewById(2131362874).setLayoutParams(new LinearLayout.LayoutParams(k(context), -2));
        } else {
            viewInflate.findViewById(2131362875).setLayoutParams(new LinearLayout.LayoutParams(k(context), -1));
        }
        ((TextView) viewInflate.findViewById(2131362886)).setAccessibilityLiveRegion(1);
        this.T = (CheckableImageButton) viewInflate.findViewById(2131362888);
        this.S = (TextView) viewInflate.findViewById(2131362892);
        this.T.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.T;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, p30.f.f0(context, 2131231447));
        stateListDrawable.addState(new int[0], p30.f.f0(context, 2131231449));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.T.setChecked(this.J != 0);
        j0.g(this.T, null);
        CheckableImageButton checkableImageButton2 = this.T;
        this.T.setContentDescription(this.J == 1 ? checkableImageButton2.getContext().getString(2131886890) : checkableImageButton2.getContext().getString(2131886892));
        this.T.setOnClickListener(new androidx.mediarouter.app.c(this, 1));
        j();
        throw null;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.C);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.E;
        a aVar = new a();
        int i10 = a.f4153b;
        int i11 = a.f4153b;
        long j9 = bVar.A.F;
        long j10 = bVar.B.F;
        aVar.f4154a = Long.valueOf(bVar.D.F);
        int i12 = bVar.E;
        d dVar = bVar.C;
        m mVar = this.F;
        q qVar = mVar == null ? null : mVar.D;
        if (qVar != null) {
            aVar.f4154a = Long.valueOf(qVar.F);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dVar);
        q qVarB = q.b(j9);
        q qVarB2 = q.b(j10);
        d dVar2 = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = aVar.f4154a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(qVarB, qVarB2, dVar2, l == null ? null : q.b(l.longValue()), i12));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.G);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.H);
        bundle.putInt("INPUT_MODE_KEY", this.J);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.K);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.L);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.M);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.N);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.O);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.P);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.Q);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.R);
    }

    @Override
    public final void onStart() {
        ColorStateList colorStateList;
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.I) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.U);
            if (!this.V) {
                View viewFindViewById = requireView().findViewById(2131362212);
                Drawable background = viewFindViewById.getBackground();
                if (background instanceof ColorDrawable) {
                    colorStateList = ColorStateList.valueOf(((ColorDrawable) background).getColor());
                } else {
                    colorStateList = background instanceof ColorStateListDrawable ? ((ColorStateListDrawable) background).getColorStateList() : null;
                }
                Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getDefaultColor()) : null;
                boolean z10 = numValueOf == null || numValueOf.intValue() == 0;
                int iD0 = ab.a0.d0(window.getContext(), R.attr.colorBackground, -16777216);
                if (z10) {
                    numValueOf = Integer.valueOf(iD0);
                }
                b5.M(window, false);
                window.getContext();
                window.getContext();
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                boolean z11 = ab.a0.j0(0) || ab.a0.j0(numValueOf.intValue());
                wb.o oVar = new wb.o(window.getDecorView());
                (Build.VERSION.SDK_INT >= 35 ? new k1(window, oVar) : new w0(window, oVar)).t(z11);
                boolean z12 = ab.a0.j0(0) || ab.a0.j0(iD0);
                wb.o oVar2 = new wb.o(window.getDecorView());
                (Build.VERSION.SDK_INT >= 35 ? new k1(window, oVar2) : new w0(window, oVar2)).s(z12);
                n nVar = new n(viewFindViewById, viewFindViewById.getLayoutParams().height, viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight());
                WeakHashMap weakHashMap = j0.f17198a;
                d0.b(viewFindViewById, nVar);
                this.V = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(2131166147);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.U, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new kg.a(requireDialog(), rect));
        }
        requireContext();
        int i10 = this.C;
        if (i10 == 0) {
            j();
            throw null;
        }
        j();
        b bVar = this.E;
        m mVar = new m();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.D);
        mVar.setArguments(bundle);
        this.F = mVar;
        v vVar = mVar;
        if (this.J == 1) {
            j();
            b bVar2 = this.E;
            p pVar = new p();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i10);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            pVar.setArguments(bundle2);
            vVar = pVar;
        }
        this.D = vVar;
        this.S.setText((this.J == 1 && getResources().getConfiguration().orientation == 2) ? this.X : this.W);
        j();
        getContext();
        throw null;
    }

    @Override
    public final void onStop() {
        this.D.A.clear();
        super.onStop();
    }
}
