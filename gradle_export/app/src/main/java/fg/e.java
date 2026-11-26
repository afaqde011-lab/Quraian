package fg;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import ng.j;
import o9.q;
import org.xmlpull.v1.XmlPullParserException;
import sg.a0;
import sg.m;
import sg.w;
import sg.x;
import sg.y;
import sg.z;

public abstract class e extends LinearLayout {
    public final ArrayList A;
    public final ArrayList B;
    public final qj.c C;
    public final d D;
    public Integer[] E;
    public w F;
    public y G;
    public int H;
    public a0 I;
    public boolean J;

    public e(Context context, AttributeSet attributeSet) {
        w wVarB;
        int next;
        a0 a0Var;
        int next2;
        super(xg.a.a(context, attributeSet, 2130969482, 2131952750), attributeSet, 2130969482);
        this.A = new ArrayList();
        this.B = new ArrayList();
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.C = new qj.c(materialButtonToggleGroup, 23);
        this.D = new d(materialButtonToggleGroup, 0);
        this.J = true;
        Context context2 = getContext();
        TypedArray typedArrayE = j.e(context2, attributeSet, zf.a.f17437k, 2130969482, 2131952750, new int[0]);
        if (typedArrayE.hasValue(2)) {
            int resourceId = typedArrayE.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    XmlResourceParser xml = context2.getResources().getXml(resourceId);
                    try {
                        a0Var = new a0();
                        a0Var.f14145c = new int[10][];
                        a0Var.f14146d = new q[10];
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                        if (next2 != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            a0Var.a(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                        }
                        xml.close();
                    } catch (Throwable th2) {
                        if (xml == null) {
                            throw th2;
                        }
                        try {
                            xml.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                    a0Var = null;
                }
            } else {
                a0Var = null;
            }
            this.I = a0Var;
        }
        if (typedArrayE.hasValue(4)) {
            y yVarB = y.b(context2, typedArrayE, 4);
            this.G = yVarB;
            if (yVarB == null) {
                x xVar = new x(m.a(context2, typedArrayE.getResourceId(4, 0), typedArrayE.getResourceId(5, 0), new sg.a(0)).a());
                this.G = xVar.f14218b != 0 ? new y(xVar) : null;
            }
        }
        if (typedArrayE.hasValue(3)) {
            sg.a aVar = new sg.a(0.0f);
            int resourceId2 = typedArrayE.getResourceId(3, 0);
            if (resourceId2 != 0 && context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    XmlResourceParser xml2 = context2.getResources().getXml(resourceId2);
                    try {
                        wVarB = new w();
                        AttributeSet attributeSetAsAttributeSet2 = Xml.asAttributeSet(xml2);
                        do {
                            next = xml2.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml2.getName().equals("selector")) {
                            wVarB.d(context2, xml2, attributeSetAsAttributeSet2, context2.getTheme());
                        }
                        xml2.close();
                    } catch (Throwable th4) {
                        if (xml2 == null) {
                            throw th4;
                        }
                        try {
                            xml2.close();
                            throw th4;
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                            throw th4;
                        }
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    wVarB = w.b(aVar);
                }
            } else {
                wVarB = w.b(m.c(typedArrayE, 3, aVar));
            }
            this.F = wVarB;
        }
        this.H = typedArrayE.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayE.getBoolean(0, true));
        typedArrayE.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (c(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public final void a() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i10);
            MaterialButton materialButton2 = (MaterialButton) getChildAt(i10 - 1);
            if (this.H <= 0) {
                iMin = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                materialButton.setShouldDrawSurfaceColorStroke(true);
                materialButton2.setShouldDrawSurfaceColorStroke(true);
            } else {
                materialButton.setShouldDrawSurfaceColorStroke(false);
                materialButton2.setShouldDrawSurfaceColorStroke(false);
                iMin = 0;
            }
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(this.H - iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = this.H - iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        d();
        this.J = true;
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.C);
        this.A.add(materialButton.getShapeAppearanceModel());
        this.B.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        float fMax;
        if (this.I == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Integer.MAX_VALUE;
        for (int i10 = firstVisibleChildIndex; i10 <= lastVisibleChildIndex; i10++) {
            if (c(i10)) {
                int iMin2 = 0;
                if (c(i10) && this.I != null) {
                    MaterialButton materialButton3 = (MaterialButton) getChildAt(i10);
                    a0 a0Var = this.I;
                    int width = materialButton3.getWidth();
                    int i11 = -width;
                    for (int i12 = 0; i12 < a0Var.f14143a; i12++) {
                        z zVar = (z) a0Var.f14146d[i12].B;
                        int i13 = zVar.f14234a;
                        float f3 = zVar.f14235b;
                        if (i13 == 2) {
                            fMax = Math.max(i11, f3);
                        } else {
                            if (i13 == 1) {
                                fMax = Math.max(i11, width * f3);
                            }
                        }
                        i11 = (int) fMax;
                    }
                    int iMax = Math.max(0, i11);
                    int i14 = i10 - 1;
                    while (true) {
                        materialButton = null;
                        if (i14 < 0) {
                            materialButton2 = null;
                            break;
                        } else {
                            if (c(i14)) {
                                materialButton2 = (MaterialButton) getChildAt(i14);
                                break;
                            }
                            i14--;
                        }
                    }
                    int allowedWidthDecrease = materialButton2 == null ? 0 : materialButton2.getAllowedWidthDecrease();
                    int childCount = getChildCount();
                    for (int i15 = i10 + 1; i15 < childCount; i15++) {
                        if (c(i15)) {
                            materialButton = (MaterialButton) getChildAt(i15);
                            break;
                        }
                    }
                    iMin2 = Math.min(iMax, allowedWidthDecrease + (materialButton != null ? materialButton.getAllowedWidthDecrease() : 0));
                }
                if (i10 != firstVisibleChildIndex && i10 != lastVisibleChildIndex) {
                    iMin2 /= 2;
                }
                iMin = Math.min(iMin, iMin2);
            }
        }
        int i16 = firstVisibleChildIndex;
        while (i16 <= lastVisibleChildIndex) {
            if (c(i16)) {
                ((MaterialButton) getChildAt(i16)).setSizeChange(this.I);
                ((MaterialButton) getChildAt(i16)).setWidthChangeMax((i16 == firstVisibleChildIndex || i16 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i16++;
        }
    }

    public final boolean c(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    public final void d() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i10);
            LinearLayout.LayoutParams layoutParams = materialButton.V;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.V = null;
                materialButton.S = -1.0f;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.D);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put((MaterialButton) getChildAt(i10), Integer.valueOf(i10));
        }
        this.E = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        x xVar;
        int i10;
        if (!(this.F == null && this.G == null) && this.J) {
            this.J = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i11 = 0;
            while (i11 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i11);
                if (materialButton.getVisibility() != 8) {
                    boolean z10 = i11 == firstVisibleChildIndex;
                    boolean z11 = i11 == lastVisibleChildIndex;
                    y yVar = this.G;
                    if (yVar == null || (!z10 && !z11)) {
                        yVar = (y) this.B.get(i11);
                    }
                    if (yVar == null) {
                        xVar = new x((m) this.A.get(i11));
                    } else {
                        x xVar2 = new x(0);
                        int i12 = yVar.f14226a;
                        xVar2.f14218b = i12;
                        xVar2.f14219c = yVar.f14227b;
                        int[][] iArr = yVar.f14228c;
                        ?? r14 = new int[iArr.length][];
                        xVar2.f14220d = r14;
                        m[] mVarArr = yVar.f14229d;
                        xVar2.f14221e = new m[mVarArr.length];
                        System.arraycopy(iArr, 0, r14, 0, i12);
                        System.arraycopy(mVarArr, 0, (m[]) xVar2.f14221e, 0, xVar2.f14218b);
                        xVar2.f14222f = yVar.f14230e;
                        xVar2.f14223g = yVar.f14231f;
                        xVar2.f14224h = yVar.f14232g;
                        xVar2.f14225i = yVar.f14233h;
                        xVar = xVar2;
                    }
                    boolean z12 = getOrientation() == 0;
                    boolean z13 = getLayoutDirection() == 1;
                    if (z12) {
                        i10 = z10 ? 5 : 0;
                        if (z11) {
                            i10 |= 10;
                        }
                        if (z13) {
                            i10 = ((i10 & 10) >> 1) | ((i10 & 5) << 1);
                        }
                    } else {
                        i10 = z10 ? 3 : 0;
                        if (z11) {
                            i10 |= 12;
                        }
                    }
                    int i13 = ~i10;
                    w wVar = this.F;
                    if ((i13 | 1) == i13) {
                        xVar.f14222f = wVar;
                    }
                    if ((i13 | 2) == i13) {
                        xVar.f14223g = wVar;
                    }
                    if ((i13 | 4) == i13) {
                        xVar.f14224h = wVar;
                    }
                    if ((i13 | 8) == i13) {
                        xVar.f14225i = wVar;
                    }
                    y yVar2 = xVar.f14218b == 0 ? null : new y(xVar);
                    if (yVar2.d()) {
                        materialButton.setStateListShapeAppearanceModel(yVar2);
                    } else {
                        materialButton.setShapeAppearanceModel(yVar2.c());
                    }
                }
                i11++;
            }
        }
    }

    public a0 getButtonSizeChange() {
        return this.I;
    }

    @Override
    public final int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.E;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i11;
    }

    public sg.d getInnerCornerSize() {
        return this.F.f14214b;
    }

    public w getInnerCornerSizeStateList() {
        return this.F;
    }

    public m getShapeAppearance() {
        y yVar = this.G;
        if (yVar == null) {
            return null;
        }
        return yVar.c();
    }

    public int getSpacing() {
        return this.H;
    }

    public y getStateListShapeAppearance() {
        return this.G;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            d();
            b();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        e();
        a();
        super.onMeasure(i10, i11);
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.A.remove(iIndexOfChild);
            this.B.remove(iIndexOfChild);
        }
        this.J = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(a0 a0Var) {
        if (this.I != a0Var) {
            this.I = a0Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((MaterialButton) getChildAt(i10)).setEnabled(z10);
        }
    }

    public void setInnerCornerSize(sg.d dVar) {
        this.F = w.b(dVar);
        this.J = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(w wVar) {
        this.F = wVar;
        this.J = true;
        e();
        invalidate();
    }

    @Override
    public void setOrientation(int i10) {
        if (getOrientation() != i10) {
            this.J = true;
        }
        super.setOrientation(i10);
    }

    public void setShapeAppearance(m mVar) {
        x xVar = new x(mVar);
        this.G = xVar.f14218b == 0 ? null : new y(xVar);
        this.J = true;
        e();
        invalidate();
    }

    public void setSpacing(int i10) {
        this.H = i10;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(y yVar) {
        this.G = yVar;
        this.J = true;
        e();
        invalidate();
    }
}
