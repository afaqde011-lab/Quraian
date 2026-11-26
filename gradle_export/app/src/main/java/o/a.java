package o;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class a implements s4.a {

    public CharSequence f11382a;

    public CharSequence f11383b;

    public Intent f11384c;

    public char f11385d;

    public int f11386e;

    public char f11387f;

    public int f11388g;

    public Drawable f11389h;

    public Context f11390i;

    public CharSequence f11391j;

    public CharSequence f11392k;
    public ColorStateList l;
    public PorterDuff.Mode m;

    public boolean f11393n;

    public boolean f11394o;

    public int f11395p;

    @Override
    public final z4.c a() {
        return null;
    }

    @Override
    public final s4.a b(z4.c cVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f11389h;
        if (drawable != null) {
            if (this.f11393n || this.f11394o) {
                this.f11389h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f11389h = drawableMutate;
                if (this.f11393n) {
                    drawableMutate.setTintList(this.l);
                }
                if (this.f11394o) {
                    this.f11389h.setTintMode(this.m);
                }
            }
        }
    }

    @Override
    public final boolean collapseActionView() {
        return false;
    }

    @Override
    public final boolean expandActionView() {
        return false;
    }

    @Override
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final View getActionView() {
        return null;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f11388g;
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f11387f;
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f11391j;
    }

    @Override
    public final int getGroupId() {
        return 0;
    }

    @Override
    public final Drawable getIcon() {
        return this.f11389h;
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.l;
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.m;
    }

    @Override
    public final Intent getIntent() {
        return this.f11384c;
    }

    @Override
    public final int getItemId() {
        return R.id.home;
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public final int getNumericModifiers() {
        return this.f11386e;
    }

    @Override
    public final char getNumericShortcut() {
        return this.f11385d;
    }

    @Override
    public final int getOrder() {
        return 0;
    }

    @Override
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f11382a;
    }

    @Override
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f11383b;
        return charSequence != null ? charSequence : this.f11382a;
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f11392k;
    }

    @Override
    public final boolean hasSubMenu() {
        return false;
    }

    @Override
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override
    public final boolean isCheckable() {
        return (this.f11395p & 1) != 0;
    }

    @Override
    public final boolean isChecked() {
        return (this.f11395p & 2) != 0;
    }

    @Override
    public final boolean isEnabled() {
        return (this.f11395p & 16) != 0;
    }

    @Override
    public final boolean isVisible() {
        return (this.f11395p & 8) == 0;
    }

    @Override
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f11387f = Character.toLowerCase(c10);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f11387f = Character.toLowerCase(c10);
        this.f11388g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        this.f11395p = (z10 ? 1 : 0) | (this.f11395p & (-2));
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        this.f11395p = (z10 ? 2 : 0) | (this.f11395p & (-3));
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f11391j = charSequence;
        return this;
    }

    @Override
    public final s4.a setContentDescription(CharSequence charSequence) {
        this.f11391j = charSequence;
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z10) {
        this.f11395p = (z10 ? 16 : 0) | (this.f11395p & (-17));
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f11389h = this.f11390i.getDrawable(i10);
        c();
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f11389h = drawable;
        c();
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.l = colorStateList;
        this.f11393n = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.m = mode;
        this.f11394o = true;
        c();
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f11384c = intent;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        this.f11385d = c10;
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f11385d = c10;
        this.f11386e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.f11385d = c10;
        this.f11387f = Character.toLowerCase(c11);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f11385d = c10;
        this.f11386e = KeyEvent.normalizeMetaState(i10);
        this.f11387f = Character.toLowerCase(c11);
        this.f11388g = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i10) {
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        this.f11382a = this.f11390i.getResources().getString(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f11382a = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f11383b = charSequence;
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f11392k = charSequence;
        return this;
    }

    @Override
    public final s4.a setTooltipText(CharSequence charSequence) {
        this.f11392k = charSequence;
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z10) {
        this.f11395p = (this.f11395p & 8) | (z10 ? 0 : 8);
        return this;
    }
}
