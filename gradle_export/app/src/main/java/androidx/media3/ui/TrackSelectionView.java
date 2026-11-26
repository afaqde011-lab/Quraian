package androidx.media3.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.media3.common.l2;
import androidx.media3.common.m2;
import androidx.media3.common.r2;
import com.google.android.material.datepicker.l;
import gi.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import m9.l0;
import m9.m0;

public class TrackSelectionView extends LinearLayout {
    public final int A;
    public final LayoutInflater B;
    public final CheckedTextView C;
    public final CheckedTextView D;
    public final l E;
    public final ArrayList F;
    public final HashMap G;
    public boolean H;
    public boolean I;
    public l0 J;
    public CheckedTextView[][] K;
    public boolean L;

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.A = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.B = layoutInflaterFrom;
        l lVar = new l(this, 3);
        this.E = lVar;
        this.J = new c(getResources());
        this.F = new ArrayList();
        this.G = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.C = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(2131886493);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(lVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(2131558745, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.D = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(2131886492);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(lVar);
        addView(checkedTextView2);
    }

    public final void a() {
        this.C.setChecked(this.L);
        boolean z10 = this.L;
        HashMap map = this.G;
        this.D.setChecked(!z10 && map.isEmpty());
        for (int i10 = 0; i10 < this.K.length; i10++) {
            m2 m2Var = (m2) map.get(((r2) this.F.get(i10)).f1487b);
            int i11 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.K[i10];
                if (i11 < checkedTextViewArr.length) {
                    if (m2Var != null) {
                        Object tag = checkedTextViewArr[i11].getTag();
                        tag.getClass();
                        this.K[i10][i11].setChecked(m2Var.f1354b.contains(Integer.valueOf(((m0) tag).f10720b)));
                    } else {
                        checkedTextViewArr[i11].setChecked(false);
                    }
                    i11++;
                }
            }
        }
    }

    public final void b() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.F;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.D;
        CheckedTextView checkedTextView2 = this.C;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.K = new CheckedTextView[arrayList.size()][];
        boolean z10 = this.I && arrayList.size() > 1;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            r2 r2Var = (r2) arrayList.get(i10);
            boolean z11 = this.H && r2Var.f1488c;
            CheckedTextView[][] checkedTextViewArr = this.K;
            int i11 = r2Var.f1486a;
            checkedTextViewArr[i10] = new CheckedTextView[i11];
            m0[] m0VarArr = new m0[i11];
            for (int i12 = 0; i12 < r2Var.f1486a; i12++) {
                m0VarArr[i12] = new m0(r2Var, i12);
            }
            for (int i13 = 0; i13 < i11; i13++) {
                LayoutInflater layoutInflater = this.B;
                if (i13 == 0) {
                    addView(layoutInflater.inflate(2131558745, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z11 || z10) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.A);
                l0 l0Var = this.J;
                m0 m0Var = m0VarArr[i13];
                checkedTextView3.setText(((c) l0Var).p(m0Var.f10719a.f1487b.f1341d[m0Var.f10720b]));
                checkedTextView3.setTag(m0VarArr[i13]);
                if (r2Var.a(i13)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.E);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.K[i10][i13] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        a();
    }

    public boolean getIsDisabled() {
        return this.L;
    }

    public Map<l2, m2> getOverrides() {
        return this.G;
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.I != z10) {
            this.I = z10;
            if (!z10) {
                HashMap map = this.G;
                if (map.size() > 1) {
                    HashMap map2 = new HashMap();
                    int i10 = 0;
                    while (true) {
                        ArrayList arrayList = this.F;
                        if (i10 >= arrayList.size()) {
                            break;
                        }
                        m2 m2Var = (m2) map.get(((r2) arrayList.get(i10)).f1487b);
                        if (m2Var != null && map2.isEmpty()) {
                            map2.put(m2Var.f1353a, m2Var);
                        }
                        i10++;
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.C.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(l0 l0Var) {
        l0Var.getClass();
        this.J = l0Var;
        b();
    }
}
