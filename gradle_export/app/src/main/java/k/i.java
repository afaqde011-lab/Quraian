package k;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
import p.n1;

public class i extends d0 implements DialogInterface {
    public final g G;

    public i(ContextThemeWrapper contextThemeWrapper, int i10) {
        super(contextThemeWrapper, e(contextThemeWrapper, i10));
        this.G = new g(getContext(), this, getWindow());
    }

    public static int e(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968625, typedValue, true);
        return typedValue.resourceId;
    }

    @Override
    public void onCreate(Bundle bundle) {
        int i10;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        g gVar = this.G;
        gVar.f8382b.setContentView(gVar.f8403y);
        Context context = gVar.f8381a;
        Window window = gVar.f8383c;
        View viewFindViewById2 = window.findViewById(2131362942);
        View viewFindViewById3 = viewFindViewById2.findViewById(2131363103);
        View viewFindViewById4 = viewFindViewById2.findViewById(2131362070);
        View viewFindViewById5 = viewFindViewById2.findViewById(2131361924);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(2131362080);
        View view = gVar.f8386f;
        if (view == null) {
            view = null;
        }
        boolean z10 = view != null;
        if (!z10 || !g.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(2131362079);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (gVar.f8387g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (gVar.f8385e != null) {
                ((LinearLayout.LayoutParams) ((n1) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(2131363103);
        View viewFindViewById7 = viewGroup.findViewById(2131362070);
        View viewFindViewById8 = viewGroup.findViewById(2131361924);
        ViewGroup viewGroupB = g.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = g.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = g.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(2131362986);
        gVar.f8395q = nestedScrollView;
        nestedScrollView.setFocusable(false);
        gVar.f8395q.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(R.id.message);
        gVar.f8399u = textView;
        if (textView != null) {
            textView.setVisibility(8);
            gVar.f8395q.removeView(gVar.f8399u);
            if (gVar.f8385e != null) {
                ViewGroup viewGroup2 = (ViewGroup) gVar.f8395q.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(gVar.f8395q);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(gVar.f8385e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupB2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupB3.findViewById(R.id.button1);
        gVar.f8388h = button;
        com.google.android.material.datepicker.l lVar = gVar.E;
        button.setOnClickListener(lVar);
        if (TextUtils.isEmpty(gVar.f8389i)) {
            gVar.f8388h.setVisibility(8);
            i10 = 0;
        } else {
            gVar.f8388h.setText(gVar.f8389i);
            gVar.f8388h.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroupB3.findViewById(R.id.button2);
        gVar.f8391k = button2;
        button2.setOnClickListener(lVar);
        if (TextUtils.isEmpty(gVar.l)) {
            gVar.f8391k.setVisibility(8);
        } else {
            gVar.f8391k.setText(gVar.l);
            gVar.f8391k.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroupB3.findViewById(R.id.button3);
        gVar.f8392n = button3;
        button3.setOnClickListener(lVar);
        if (TextUtils.isEmpty(gVar.f8393o)) {
            gVar.f8392n.setVisibility(8);
        } else {
            gVar.f8392n.setText(gVar.f8393o);
            gVar.f8392n.setVisibility(0);
            i10 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968623, typedValue, true);
        if (typedValue.data != 0) {
            if (i10 == 1) {
                Button button4 = gVar.f8388h;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i10 == 2) {
                Button button5 = gVar.f8391k;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i10 == 4) {
                Button button6 = gVar.f8392n;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i10 == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (gVar.f8400v != null) {
            viewGroupB.addView(gVar.f8400v, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(2131363096).setVisibility(8);
        } else {
            gVar.f8397s = (ImageView) window.findViewById(R.id.icon);
            if (TextUtils.isEmpty(gVar.f8384d) || !gVar.C) {
                window.findViewById(2131363096).setVisibility(8);
                gVar.f8397s.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(2131361875);
                gVar.f8398t = textView2;
                textView2.setText(gVar.f8384d);
                Drawable drawable = gVar.f8396r;
                if (drawable != null) {
                    gVar.f8397s.setImageDrawable(drawable);
                } else {
                    gVar.f8398t.setPadding(gVar.f8397s.getPaddingLeft(), gVar.f8397s.getPaddingTop(), gVar.f8397s.getPaddingRight(), gVar.f8397s.getPaddingBottom());
                    gVar.f8397s.setVisibility(8);
                }
            }
        }
        boolean z11 = viewGroup.getVisibility() != 8;
        int i11 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z12 = viewGroupB3.getVisibility() != 8;
        if (!z12 && (viewFindViewById = viewGroupB2.findViewById(2131363077)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i11 != 0) {
            NestedScrollView nestedScrollView2 = gVar.f8395q;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = gVar.f8385e != null ? viewGroupB.findViewById(2131363095) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(2131363078);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = gVar.f8385e;
        if (alertController$RecycleListView != null && (!z12 || i11 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i11 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.A, alertController$RecycleListView.getPaddingRight(), z12 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.B);
        }
        if (!z11) {
            View view2 = gVar.f8385e;
            if (view2 == null) {
                view2 = gVar.f8395q;
            }
            if (view2 != null) {
                int i12 = z12 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(2131362985);
                View viewFindViewById12 = window.findViewById(2131362984);
                WeakHashMap weakHashMap = z4.j0.f17198a;
                view2.setScrollIndicators(i11 | i12, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = gVar.f8385e;
        if (alertController$RecycleListView2 == null || (listAdapter = gVar.f8401w) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i13 = gVar.f8402x;
        if (i13 > -1) {
            alertController$RecycleListView2.setItemChecked(i13, true);
            alertController$RecycleListView2.setSelection(i13);
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.G.f8395q;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i10, keyEvent);
        }
        return true;
    }

    @Override
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.G.f8395q;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i10, keyEvent);
        }
        return true;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        g gVar = this.G;
        gVar.f8384d = charSequence;
        TextView textView = gVar.f8398t;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
