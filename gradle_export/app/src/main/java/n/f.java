package n;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import o.a0;

public final class f extends ActionMode {

    public final Context f10953a;

    public final b f10954b;

    public f(Context context, b bVar) {
        this.f10953a = context;
        this.f10954b = bVar;
    }

    @Override
    public final void finish() {
        this.f10954b.a();
    }

    @Override
    public final View getCustomView() {
        return this.f10954b.b();
    }

    @Override
    public final Menu getMenu() {
        return new a0(this.f10953a, this.f10954b.c());
    }

    @Override
    public final MenuInflater getMenuInflater() {
        return this.f10954b.d();
    }

    @Override
    public final CharSequence getSubtitle() {
        return this.f10954b.e();
    }

    @Override
    public final Object getTag() {
        return this.f10954b.A;
    }

    @Override
    public final CharSequence getTitle() {
        return this.f10954b.f();
    }

    @Override
    public final boolean getTitleOptionalHint() {
        return this.f10954b.B;
    }

    @Override
    public final void invalidate() {
        this.f10954b.g();
    }

    @Override
    public final boolean isTitleOptional() {
        return this.f10954b.h();
    }

    @Override
    public final void setCustomView(View view) {
        this.f10954b.i(view);
    }

    @Override
    public final void setSubtitle(int i10) {
        this.f10954b.j(i10);
    }

    @Override
    public final void setSubtitle(CharSequence charSequence) {
        this.f10954b.k(charSequence);
    }

    @Override
    public final void setTag(Object obj) {
        this.f10954b.A = obj;
    }

    @Override
    public final void setTitle(int i10) {
        this.f10954b.l(i10);
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f10954b.m(charSequence);
    }

    @Override
    public final void setTitleOptionalHint(boolean z10) {
        this.f10954b.o(z10);
    }
}
