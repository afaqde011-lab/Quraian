package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

public final class n implements s4.a {
    public z4.c A;
    public MenuItem.OnActionExpandListener B;

    public final int f11424a;

    public final int f11425b;

    public final int f11426c;

    public final int f11427d;

    public CharSequence f11428e;

    public CharSequence f11429f;

    public Intent f11430g;

    public char f11431h;

    public char f11433j;
    public Drawable l;

    public final l f11435n;

    public d0 f11436o;

    public MenuItem.OnMenuItemClickListener f11437p;

    public CharSequence f11438q;

    public CharSequence f11439r;

    public int f11446y;

    public View f11447z;

    public int f11432i = 4096;

    public int f11434k = 4096;
    public int m = 0;

    public ColorStateList f11440s = null;

    public PorterDuff.Mode f11441t = null;

    public boolean f11442u = false;

    public boolean f11443v = false;

    public boolean f11444w = false;

    public int f11445x = 16;
    public boolean C = false;

    public n(l lVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f11435n = lVar;
        this.f11424a = i11;
        this.f11425b = i10;
        this.f11426c = i12;
        this.f11427d = i13;
        this.f11428e = charSequence;
        this.f11446y = i14;
    }

    public static void c(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override
    public final z4.c a() {
        return this.A;
    }

    @Override
    public final s4.a b(z4.c cVar) {
        this.f11447z = null;
        this.A = cVar;
        this.f11435n.p(true);
        z4.c cVar2 = this.A;
        if (cVar2 != null) {
            o oVar = (o) cVar2;
            oVar.f11448a = new hf.c(this, 26);
            oVar.f11449b.setVisibilityListener(oVar);
        }
        return this;
    }

    @Override
    public final boolean collapseActionView() {
        if ((this.f11446y & 8) == 0) {
            return false;
        }
        if (this.f11447z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f11435n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f11444w && (this.f11442u || this.f11443v)) {
            drawable = drawable.mutate();
            if (this.f11442u) {
                drawable.setTintList(this.f11440s);
            }
            if (this.f11443v) {
                drawable.setTintMode(this.f11441t);
            }
            this.f11444w = false;
        }
        return drawable;
    }

    public final boolean e() {
        z4.c cVar;
        if ((this.f11446y & 8) != 0) {
            if (this.f11447z == null && (cVar = this.A) != null) {
                this.f11447z = ((o) cVar).f11449b.onCreateActionView(this);
            }
            if (this.f11447z != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f11435n.f(this);
        }
        return false;
    }

    public final void f(boolean z10) {
        if (z10) {
            this.f11445x |= 32;
        } else {
            this.f11445x &= -33;
        }
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override
    public final View getActionView() {
        View view = this.f11447z;
        if (view != null) {
            return view;
        }
        z4.c cVar = this.A;
        if (cVar == null) {
            return null;
        }
        View viewOnCreateActionView = ((o) cVar).f11449b.onCreateActionView(this);
        this.f11447z = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f11434k;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f11433j;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f11438q;
    }

    @Override
    public final int getGroupId() {
        return this.f11425b;
    }

    @Override
    public final Drawable getIcon() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.m;
        if (i10 == 0) {
            return null;
        }
        Drawable drawableF0 = p30.f.f0(this.f11435n.f11402a, i10);
        this.m = 0;
        this.l = drawableF0;
        return d(drawableF0);
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f11440s;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f11441t;
    }

    @Override
    public final Intent getIntent() {
        return this.f11430g;
    }

    @Override
    public final int getItemId() {
        return this.f11424a;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f11432i;
    }

    @Override
    public final char getNumericShortcut() {
        return this.f11431h;
    }

    @Override
    public final int getOrder() {
        return this.f11426c;
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f11436o;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f11428e;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f11429f;
        return charSequence != null ? charSequence : this.f11428e;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f11439r;
    }

    @Override
    public final boolean hasSubMenu() {
        return this.f11436o != null;
    }

    @Override
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override
    public final boolean isCheckable() {
        return (this.f11445x & 1) == 1;
    }

    @Override
    public final boolean isChecked() {
        return (this.f11445x & 2) == 2;
    }

    @Override
    public final boolean isEnabled() {
        return (this.f11445x & 16) != 0;
    }

    @Override
    public final boolean isVisible() {
        z4.c cVar = this.A;
        if (cVar == null || !((o) cVar).f11449b.overridesItemVisibility()) {
            return (this.f11445x & 8) == 0;
        }
        return (this.f11445x & 8) == 0 && ((o) this.A).f11449b.isVisible();
    }

    @Override
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override
    public final MenuItem setActionView(int i10) {
        int i11;
        l lVar = this.f11435n;
        Context context = lVar.f11402a;
        View viewInflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f11447z = viewInflate;
        this.A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i11 = this.f11424a) > 0) {
            viewInflate.setId(i11);
        }
        lVar.f11412k = true;
        lVar.p(true);
        return this;
    }

    @Override
    public final MenuItem setActionView(View view) {
        int i10;
        this.f11447z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f11424a) > 0) {
            view.setId(i10);
        }
        l lVar = this.f11435n;
        lVar.f11412k = true;
        lVar.p(true);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f11433j == c10) {
            return this;
        }
        this.f11433j = Character.toLowerCase(c10);
        this.f11435n.p(false);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f11433j == c10 && this.f11434k == i10) {
            return this;
        }
        this.f11433j = Character.toLowerCase(c10);
        this.f11434k = KeyEvent.normalizeMetaState(i10);
        this.f11435n.p(false);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        int i10 = this.f11445x;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f11445x = i11;
        if (i10 != i11) {
            this.f11435n.p(false);
        }
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        int i10 = this.f11445x;
        int i11 = i10 & 4;
        l lVar = this.f11435n;
        if (i11 == 0) {
            int i12 = (i10 & (-3)) | (z10 ? 2 : 0);
            this.f11445x = i12;
            if (i10 != i12) {
                lVar.p(false);
            }
            return this;
        }
        ArrayList arrayList = lVar.f11407f;
        int size = arrayList.size();
        lVar.w();
        for (int i13 = 0; i13 < size; i13++) {
            n nVar = (n) arrayList.get(i13);
            if (nVar.f11425b == this.f11425b && (nVar.f11445x & 4) != 0 && nVar.isCheckable()) {
                boolean z11 = nVar == this;
                int i14 = nVar.f11445x;
                int i15 = (z11 ? 2 : 0) | (i14 & (-3));
                nVar.f11445x = i15;
                if (i14 != i15) {
                    nVar.f11435n.p(false);
                }
            }
        }
        lVar.v();
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override
    public final s4.a setContentDescription(CharSequence charSequence) {
        this.f11438q = charSequence;
        this.f11435n.p(false);
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f11445x |= 16;
        } else {
            this.f11445x &= -17;
        }
        this.f11435n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.l = null;
        this.m = i10;
        this.f11444w = true;
        this.f11435n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.m = 0;
        this.l = drawable;
        this.f11444w = true;
        this.f11435n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f11440s = colorStateList;
        this.f11442u = true;
        this.f11444w = true;
        this.f11435n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f11441t = mode;
        this.f11443v = true;
        this.f11444w = true;
        this.f11435n.p(false);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f11430g = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        if (this.f11431h == c10) {
            return this;
        }
        this.f11431h = c10;
        this.f11435n.p(false);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f11431h == c10 && this.f11432i == i10) {
            return this;
        }
        this.f11431h = c10;
        this.f11432i = KeyEvent.normalizeMetaState(i10);
        this.f11435n.p(false);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f11437p = onMenuItemClickListener;
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.f11431h = c10;
        this.f11433j = Character.toLowerCase(c11);
        this.f11435n.p(false);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f11431h = c10;
        this.f11432i = KeyEvent.normalizeMetaState(i10);
        this.f11433j = Character.toLowerCase(c11);
        this.f11434k = KeyEvent.normalizeMetaState(i11);
        this.f11435n.p(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f11446y = i10;
        l lVar = this.f11435n;
        lVar.f11412k = true;
        lVar.p(true);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        setTitle(this.f11435n.f11402a.getString(i10));
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f11428e = charSequence;
        this.f11435n.p(false);
        d0 d0Var = this.f11436o;
        if (d0Var != null) {
            d0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f11429f = charSequence;
        this.f11435n.p(false);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override
    public final s4.a setTooltipText(CharSequence charSequence) {
        this.f11439r = charSequence;
        this.f11435n.p(false);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z10) {
        int i10 = this.f11445x;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f11445x = i11;
        if (i10 != i11) {
            l lVar = this.f11435n;
            lVar.f11409h = true;
            lVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f11428e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
