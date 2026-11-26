package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

public final class s extends c3.b implements MenuItem {

    public final s4.a f11454c;

    public Method f11455d;

    public s(Context context, s4.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f11454c = aVar;
    }

    @Override
    public final boolean collapseActionView() {
        return this.f11454c.collapseActionView();
    }

    @Override
    public final boolean expandActionView() {
        return this.f11454c.expandActionView();
    }

    @Override
    public final ActionProvider getActionProvider() {
        z4.c cVarA = this.f11454c.a();
        if (cVarA instanceof o) {
            return ((o) cVarA).f11449b;
        }
        return null;
    }

    @Override
    public final View getActionView() {
        View actionView = this.f11454c.getActionView();
        return actionView instanceof p ? (View) ((p) actionView).A : actionView;
    }

    @Override
    public final int getAlphabeticModifiers() {
        return this.f11454c.getAlphabeticModifiers();
    }

    @Override
    public final char getAlphabeticShortcut() {
        return this.f11454c.getAlphabeticShortcut();
    }

    @Override
    public final CharSequence getContentDescription() {
        return this.f11454c.getContentDescription();
    }

    @Override
    public final int getGroupId() {
        return this.f11454c.getGroupId();
    }

    @Override
    public final Drawable getIcon() {
        return this.f11454c.getIcon();
    }

    @Override
    public final ColorStateList getIconTintList() {
        return this.f11454c.getIconTintList();
    }

    @Override
    public final PorterDuff.Mode getIconTintMode() {
        return this.f11454c.getIconTintMode();
    }

    @Override
    public final Intent getIntent() {
        return this.f11454c.getIntent();
    }

    @Override
    public final int getItemId() {
        return this.f11454c.getItemId();
    }

    @Override
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f11454c.getMenuInfo();
    }

    @Override
    public final int getNumericModifiers() {
        return this.f11454c.getNumericModifiers();
    }

    @Override
    public final char getNumericShortcut() {
        return this.f11454c.getNumericShortcut();
    }

    @Override
    public final int getOrder() {
        return this.f11454c.getOrder();
    }

    @Override
    public final SubMenu getSubMenu() {
        return this.f11454c.getSubMenu();
    }

    @Override
    public final CharSequence getTitle() {
        return this.f11454c.getTitle();
    }

    @Override
    public final CharSequence getTitleCondensed() {
        return this.f11454c.getTitleCondensed();
    }

    @Override
    public final CharSequence getTooltipText() {
        return this.f11454c.getTooltipText();
    }

    @Override
    public final boolean hasSubMenu() {
        return this.f11454c.hasSubMenu();
    }

    @Override
    public final boolean isActionViewExpanded() {
        return this.f11454c.isActionViewExpanded();
    }

    @Override
    public final boolean isCheckable() {
        return this.f11454c.isCheckable();
    }

    @Override
    public final boolean isChecked() {
        return this.f11454c.isChecked();
    }

    @Override
    public final boolean isEnabled() {
        return this.f11454c.isEnabled();
    }

    @Override
    public final boolean isVisible() {
        return this.f11454c.isVisible();
    }

    @Override
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        o oVar = new o(this, actionProvider);
        if (actionProvider == null) {
            oVar = null;
        }
        this.f11454c.b(oVar);
        return this;
    }

    @Override
    public final MenuItem setActionView(int i10) {
        s4.a aVar = this.f11454c;
        aVar.setActionView(i10);
        View actionView = aVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            aVar.setActionView(new p(actionView));
        }
        return this;
    }

    @Override
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new p(view);
        }
        this.f11454c.setActionView(view);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f11454c.setAlphabeticShortcut(c10);
        return this;
    }

    @Override
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f11454c.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override
    public final MenuItem setCheckable(boolean z10) {
        this.f11454c.setCheckable(z10);
        return this;
    }

    @Override
    public final MenuItem setChecked(boolean z10) {
        this.f11454c.setChecked(z10);
        return this;
    }

    @Override
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f11454c.setContentDescription(charSequence);
        return this;
    }

    @Override
    public final MenuItem setEnabled(boolean z10) {
        this.f11454c.setEnabled(z10);
        return this;
    }

    @Override
    public final MenuItem setIcon(int i10) {
        this.f11454c.setIcon(i10);
        return this;
    }

    @Override
    public final MenuItem setIcon(Drawable drawable) {
        this.f11454c.setIcon(drawable);
        return this;
    }

    @Override
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f11454c.setIconTintList(colorStateList);
        return this;
    }

    @Override
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f11454c.setIconTintMode(mode);
        return this;
    }

    @Override
    public final MenuItem setIntent(Intent intent) {
        this.f11454c.setIntent(intent);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10) {
        this.f11454c.setNumericShortcut(c10);
        return this;
    }

    @Override
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f11454c.setNumericShortcut(c10, i10);
        return this;
    }

    @Override
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f11454c.setOnActionExpandListener(onActionExpandListener != null ? new q(this, onActionExpandListener) : null);
        return this;
    }

    @Override
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f11454c.setOnMenuItemClickListener(onMenuItemClickListener != null ? new r(this, onMenuItemClickListener) : null);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11) {
        this.f11454c.setShortcut(c10, c11);
        return this;
    }

    @Override
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f11454c.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override
    public final void setShowAsAction(int i10) {
        this.f11454c.setShowAsAction(i10);
    }

    @Override
    public final MenuItem setShowAsActionFlags(int i10) {
        this.f11454c.setShowAsActionFlags(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(int i10) {
        this.f11454c.setTitle(i10);
        return this;
    }

    @Override
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f11454c.setTitle(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f11454c.setTitleCondensed(charSequence);
        return this;
    }

    @Override
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f11454c.setTooltipText(charSequence);
        return this;
    }

    @Override
    public final MenuItem setVisible(boolean z10) {
        return this.f11454c.setVisible(z10);
    }
}
