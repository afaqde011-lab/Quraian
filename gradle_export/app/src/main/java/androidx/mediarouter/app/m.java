package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class m implements ViewTreeObserver.OnGlobalLayoutListener {
    public final boolean A;
    public final v B;

    public m(v vVar, boolean z10) {
        this.B = vVar;
        this.A = z10;
    }

    @Override
    public final void onGlobalLayout() {
        int iJ;
        HashMap map;
        HashMap map2;
        Bitmap bitmap;
        v vVar = this.B;
        vVar.U.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (vVar.G0) {
            vVar.H0 = true;
            return;
        }
        o9.b0 b0Var = vVar.J;
        int i10 = vVar.f1811b0.getLayoutParams().height;
        v.m(vVar.f1811b0, -1);
        vVar.s(vVar.g());
        View decorView = vVar.getWindow().getDecorView();
        decorView.measure(View.MeasureSpec.makeMeasureSpec(vVar.getWindow().getAttributes().width, 1073741824), 0);
        v.m(vVar.f1811b0, i10);
        if (!(vVar.V.getDrawable() instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) vVar.V.getDrawable()).getBitmap()) == null) {
            iJ = 0;
        } else {
            iJ = vVar.j(bitmap.getWidth(), bitmap.getHeight());
            vVar.V.setScaleType(bitmap.getWidth() >= bitmap.getHeight() ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.FIT_CENTER);
        }
        int iK = vVar.k(vVar.g());
        int size = vVar.f1817h0.size();
        int size2 = vVar.l() ? Collections.unmodifiableList(b0Var.f11756v).size() * vVar.f1825p0 : 0;
        if (size > 0) {
            size2 += vVar.f1827r0;
        }
        int iMin = Math.min(size2, vVar.f1826q0);
        if (!vVar.F0) {
            iMin = 0;
        }
        int iMax = Math.max(iJ, iMin) + iK;
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int iHeight = rect.height() - (vVar.T.getMeasuredHeight() - vVar.U.getMeasuredHeight());
        if (iJ <= 0 || iMax > iHeight) {
            if (vVar.f1811b0.getMeasuredHeight() + vVar.f1815f0.getLayoutParams().height >= vVar.U.getMeasuredHeight()) {
                vVar.V.setVisibility(8);
            }
            iMax = iMin + iK;
            iJ = 0;
        } else {
            vVar.V.setVisibility(0);
            v.m(vVar.V, iJ);
        }
        if (!vVar.g() || iMax > iHeight) {
            vVar.f1812c0.setVisibility(8);
        } else {
            vVar.f1812c0.setVisibility(0);
        }
        vVar.s(vVar.f1812c0.getVisibility() == 0);
        int iK2 = vVar.k(vVar.f1812c0.getVisibility() == 0);
        int iMax2 = Math.max(iJ, iMin) + iK2;
        if (iMax2 > iHeight) {
            iMin -= iMax2 - iHeight;
        } else {
            iHeight = iMax2;
        }
        vVar.f1811b0.clearAnimation();
        vVar.f1815f0.clearAnimation();
        vVar.U.clearAnimation();
        boolean z10 = this.A;
        if (z10) {
            vVar.f(vVar.f1811b0, iK2);
            vVar.f(vVar.f1815f0, iMin);
            vVar.f(vVar.U, iHeight);
        } else {
            v.m(vVar.f1811b0, iK2);
            v.m(vVar.f1815f0, iMin);
            v.m(vVar.U, iHeight);
        }
        v.m(vVar.S, rect.height());
        List listUnmodifiableList = Collections.unmodifiableList(b0Var.f11756v);
        if (listUnmodifiableList.isEmpty()) {
            vVar.f1817h0.clear();
            vVar.f1816g0.notifyDataSetChanged();
            return;
        }
        if (new HashSet(vVar.f1817h0).equals(new HashSet(listUnmodifiableList))) {
            vVar.f1816g0.notifyDataSetChanged();
            return;
        }
        if (z10) {
            OverlayListView overlayListView = vVar.f1815f0;
            u uVar = vVar.f1816g0;
            map = new HashMap();
            int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
            for (int i11 = 0; i11 < overlayListView.getChildCount(); i11++) {
                Object item = uVar.getItem(firstVisiblePosition + i11);
                View childAt = overlayListView.getChildAt(i11);
                map.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
            }
        } else {
            map = null;
        }
        if (z10) {
            Context context = vVar.K;
            OverlayListView overlayListView2 = vVar.f1815f0;
            u uVar2 = vVar.f1816g0;
            map2 = new HashMap();
            int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
            for (int i12 = 0; i12 < overlayListView2.getChildCount(); i12++) {
                Object item2 = uVar2.getItem(firstVisiblePosition2 + i12);
                View childAt2 = overlayListView2.getChildAt(i12);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                childAt2.draw(new Canvas(bitmapCreateBitmap));
                map2.put(item2, new BitmapDrawable(context.getResources(), bitmapCreateBitmap));
            }
        } else {
            map2 = null;
        }
        ArrayList arrayList = vVar.f1817h0;
        HashSet hashSet = new HashSet(listUnmodifiableList);
        hashSet.removeAll(arrayList);
        vVar.f1818i0 = hashSet;
        HashSet hashSet2 = new HashSet(vVar.f1817h0);
        hashSet2.removeAll(listUnmodifiableList);
        vVar.f1819j0 = hashSet2;
        vVar.f1817h0.addAll(0, vVar.f1818i0);
        vVar.f1817h0.removeAll(vVar.f1819j0);
        vVar.f1816g0.notifyDataSetChanged();
        if (z10 && vVar.F0) {
            if (vVar.f1819j0.size() + vVar.f1818i0.size() > 0) {
                vVar.f1815f0.setEnabled(false);
                vVar.f1815f0.requestLayout();
                vVar.G0 = true;
                vVar.f1815f0.getViewTreeObserver().addOnGlobalLayoutListener(new o(vVar, map, map2));
                return;
            }
        }
        vVar.f1818i0 = null;
        vVar.f1819j0 = null;
    }
}
