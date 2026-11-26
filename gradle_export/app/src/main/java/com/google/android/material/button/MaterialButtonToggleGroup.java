package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.i;
import fg.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ng.j;
import sg.w;
import xg.a;
import z4.j0;

public class MaterialButtonToggleGroup extends e {
    public static final int Q = 0;
    public final LinkedHashSet K;
    public boolean L;
    public boolean M;
    public boolean N;
    public final int O;
    public HashSet P;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, 2130969482, 2131952890), attributeSet);
        this.K = new LinkedHashSet();
        this.L = false;
        this.P = new HashSet();
        TypedArray typedArrayE = j.e(getContext(), attributeSet, zf.a.l, 2130969482, 2131952890, new int[0]);
        setSingleSelection(typedArrayE.getBoolean(7, false));
        this.O = typedArrayE.getResourceId(2, -1);
        this.N = typedArrayE.getBoolean(4, false);
        if (this.F == null) {
            this.F = w.b(new sg.a(0.0f));
        }
        setEnabled(typedArrayE.getBoolean(0, true));
        typedArrayE.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        return (this.M ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && getChildAt(i11).getVisibility() != 8) {
                i10++;
            }
        }
        return i10;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        f(materialButton.getId(), materialButton.O);
        j0.g(materialButton, new com.google.android.material.datepicker.j(this, 2));
    }

    public final void f(int i10, boolean z10) {
        if (i10 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.P);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.M && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else {
            if (z10 || !hashSet.contains(Integer.valueOf(i10))) {
                return;
            }
            if (!this.N || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        }
        g(hashSet);
    }

    public final void g(Set set) {
        HashSet hashSet = this.P;
        this.P = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = ((MaterialButton) getChildAt(i10)).getId();
            boolean zContains = set.contains(Integer.valueOf(id2));
            View viewFindViewById = findViewById(id2);
            if (viewFindViewById instanceof MaterialButton) {
                this.L = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.L = false;
            }
            if (hashSet.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                set.contains(Integer.valueOf(id2));
                Iterator it = this.K.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).a();
                }
            }
        }
        invalidate();
    }

    public int getCheckedButtonId() {
        if (!this.M || this.P.isEmpty()) {
            return -1;
        }
        return ((Integer) this.P.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = ((MaterialButton) getChildAt(i10)).getId();
            if (this.P.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.O;
        if (i10 != -1) {
            g(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.M ? 1 : 2));
    }

    public void setSelectionRequired(boolean z10) {
        this.N = z10;
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }

    public void setSingleSelection(boolean z10) {
        if (this.M != z10) {
            this.M = z10;
            g(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((MaterialButton) getChildAt(i10)).setA11yClassName(childrenA11yClassName);
        }
    }
}
