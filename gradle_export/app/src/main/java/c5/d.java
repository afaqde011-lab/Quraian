package c5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.i0;
import java.util.ArrayList;
import java.util.List;
import l9.f0;

public final class d extends FrameLayout {
    public static final Object C = new Object();
    public final ArrayList A;
    public c B;

    public d(Context context, List list) {
        super(context);
        this.A = new ArrayList();
        setProtections(list);
    }

    private g getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(2131363069);
        if (tag instanceof g) {
            return (g) tag;
        }
        g gVar = new g(viewGroup);
        viewGroup.setTag(2131363069, gVar);
        return gVar;
    }

    public final void a() {
        int i10;
        int i11;
        int i12;
        FrameLayout.LayoutParams layoutParams;
        View view;
        f0 f0Var;
        ArrayList arrayList = this.A;
        if (arrayList.isEmpty()) {
            b();
            return;
        }
        g orInstallSystemBarStateMonitor = getOrInstallSystemBarStateMonitor();
        b();
        this.B = new c(orInstallSystemBarStateMonitor, arrayList);
        int childCount = getChildCount();
        int size = this.B.f2876a.size();
        for (int i13 = 0; i13 < size; i13++) {
            a aVar = (a) this.B.f2876a.get(i13);
            Context context = getContext();
            int i14 = i13 + childCount;
            b bVar = aVar.f2860b;
            int i15 = aVar.f2859a;
            int i16 = -1;
            if (i15 != 1) {
                if (i15 == 2) {
                    i12 = bVar.f2868b;
                    i11 = 48;
                } else if (i15 == 4) {
                    i10 = bVar.f2867a;
                    i11 = 5;
                } else {
                    if (i15 != 8) {
                        throw new IllegalArgumentException(g4.c.f(i15, "Unexpected side: "));
                    }
                    i12 = bVar.f2868b;
                    i11 = 80;
                }
                layoutParams = new FrameLayout.LayoutParams(i16, i12, i11);
                q4.b bVar2 = bVar.f2869c;
                layoutParams.leftMargin = bVar2.f12755a;
                layoutParams.topMargin = bVar2.f12756b;
                layoutParams.rightMargin = bVar2.f12757c;
                layoutParams.bottomMargin = bVar2.f12758d;
                view = new View(context);
                view.setTag(C);
                view.setTranslationX(bVar.f2872f);
                view.setTranslationY(bVar.f2873g);
                view.setAlpha(bVar.f2874h);
                view.setVisibility(bVar.f2870d ? 0 : 8);
                view.setBackground(bVar.f2871e);
                f0Var = new f0(layoutParams, view, 11);
                if (bVar.f2875i == null) {
                    throw new IllegalStateException("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
                }
                bVar.f2875i = f0Var;
                addView(view, i14, layoutParams);
            } else {
                i10 = bVar.f2867a;
                i11 = 3;
            }
            i16 = i10;
            i12 = -1;
            layoutParams = new FrameLayout.LayoutParams(i16, i12, i11);
            q4.b bVar3 = bVar.f2869c;
            layoutParams.leftMargin = bVar3.f12755a;
            layoutParams.topMargin = bVar3.f12756b;
            layoutParams.rightMargin = bVar3.f12757c;
            layoutParams.bottomMargin = bVar3.f12758d;
            view = new View(context);
            view.setTag(C);
            view.setTranslationX(bVar.f2872f);
            view.setTranslationY(bVar.f2873g);
            view.setAlpha(bVar.f2874h);
            view.setVisibility(bVar.f2870d ? 0 : 8);
            view.setBackground(bVar.f2871e);
            f0Var = new f0(layoutParams, view, 11);
            if (bVar.f2875i == null) {
                throw new IllegalStateException("Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?");
            }
            bVar.f2875i = f0Var;
            addView(view, i14, layoutParams);
        }
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != C) {
            c cVar = this.B;
            int childCount = getChildCount() - (cVar != null ? cVar.f2876a.size() : 0);
            if (i10 > childCount || i10 < 0) {
                i10 = childCount;
            }
        }
        super.addView(view, i10, layoutParams);
    }

    public final void b() {
        if (this.B != null) {
            removeViews(getChildCount() - this.B.f2876a.size(), this.B.f2876a.size());
            int size = this.B.f2876a.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((a) this.B.f2876a.get(i10)).f2860b.f2875i = null;
            }
            c cVar = this.B;
            ArrayList arrayList = cVar.f2876a;
            if (!cVar.f2881f) {
                cVar.f2881f = true;
                cVar.f2877b.f2883b.remove(cVar);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((a) arrayList.get(size2)).f2863e = null;
                }
                arrayList.clear();
            }
            this.B = null;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        requestApplyInsets();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(2131363069);
        if (tag instanceof g) {
            g gVar = (g) tag;
            if (gVar.f2883b.isEmpty()) {
                gVar.f2882a.post(new i0(gVar, 3));
                viewGroup.setTag(2131363069, null);
            }
        }
    }

    public void setProtections(List<a> list) {
        ArrayList arrayList = this.A;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            a();
            requestApplyInsets();
        }
    }
}
