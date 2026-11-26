package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

public class v extends ImageButton {
    public final b3.i2 A;
    public final c50.h B;
    public boolean C;

    public v(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j2.a(context);
        this.C = false;
        i2.a(this, getContext());
        b3.i2 i2Var = new b3.i2(this);
        this.A = i2Var;
        i2Var.n(attributeSet, i10);
        c50.h hVar = new c50.h(this);
        this.B = hVar;
        hVar.v(attributeSet, i10);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        b3.i2 i2Var = this.A;
        if (i2Var != null) {
            i2Var.b();
        }
        c50.h hVar = this.B;
        if (hVar != null) {
            hVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        b3.i2 i2Var = this.A;
        if (i2Var != null) {
            return i2Var.j();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        b3.i2 i2Var = this.A;
        if (i2Var != null) {
            return i2Var.k();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        bd.f fVar;
        c50.h hVar = this.B;
        if (hVar == null || (fVar = (bd.f) hVar.D) == null) {
            return null;
        }
        return (ColorStateList) fVar.C;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        bd.f fVar;
        c50.h hVar = this.B;
        if (hVar == null || (fVar = (bd.f) hVar.D) == null) {
            return null;
        }
        return (PorterDuff.Mode) fVar.D;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.B.C).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        b3.i2 i2Var = this.A;
        if (i2Var != null) {
            i2Var.p();
        }
    }

    @Override
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        b3.i2 i2Var = this.A;
        if (i2Var != null) {
            i2Var.q(i10);
        }
    }

    @Override
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        c50.h hVar = this.B;
        if (hVar != null) {
            hVar.b();
        }
    }

    @Override
    public void setImageDrawable(Drawable drawable) {
        c50.h hVar = this.B;
        if (hVar != null && drawable != null && !this.C) {
            hVar.B = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (hVar != null) {
            hVar.b();
            if (this.C) {
                return;
            }
            ImageView imageView = (ImageView) hVar.C;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(hVar.B);
            }
        }
    }

    @Override
    public void setImageLevel(int i10) {
        super.setImageLevel(i10);
        this.C = true;
    }

    @Override
    public void setImageResource(int i10) {
        c50.h hVar = this.B;
        ImageView imageView = (ImageView) hVar.C;
        if (i10 != 0) {
            Drawable drawableF0 = p30.f.f0(imageView.getContext(), i10);
            if (drawableF0 != null) {
                int i11 = e1.f12154a;
            }
            imageView.setImageDrawable(drawableF0);
        } else {
            imageView.setImageDrawable(null);
        }
        hVar.b();
    }

    @Override
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        c50.h hVar = this.B;
        if (hVar != null) {
            hVar.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        b3.i2 i2Var = this.A;
        if (i2Var != null) {
            i2Var.x(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        b3.i2 i2Var = this.A;
        if (i2Var != null) {
            i2Var.y(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        c50.h hVar = this.B;
        if (hVar != null) {
            if (((bd.f) hVar.D) == null) {
                hVar.D = new bd.f();
            }
            bd.f fVar = (bd.f) hVar.D;
            fVar.C = colorStateList;
            fVar.B = true;
            hVar.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        c50.h hVar = this.B;
        if (hVar != null) {
            if (((bd.f) hVar.D) == null) {
                hVar.D = new bd.f();
            }
            bd.f fVar = (bd.f) hVar.D;
            fVar.D = mode;
            fVar.A = true;
            hVar.b();
        }
    }
}
