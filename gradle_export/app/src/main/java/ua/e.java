package ua;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class e extends f implements Animatable {
    public final Context C;
    public cg.b D = null;
    public ArrayList E = null;
    public final td.a F = new td.a(this, 1);
    public final c B = new c();

    public e(Context context, int i10) {
        this.C = context;
    }

    @Override
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override
    public final boolean canApplyTheme() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        c cVar = this.B;
        cVar.f15176a.draw(canvas);
        if (cVar.f15177b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override
    public final int getAlpha() {
        Drawable drawable = this.A;
        return drawable != null ? drawable.getAlpha() : this.B.f15176a.getAlpha();
    }

    @Override
    public final int getChangingConfigurations() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.B.getClass();
        return changingConfigurations;
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.A;
        return drawable != null ? drawable.getColorFilter() : this.B.f15176a.getColorFilter();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (this.A != null) {
            return new d(this.A.getConstantState());
        }
        return null;
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.A;
        return drawable != null ? drawable.getIntrinsicHeight() : this.B.f15176a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.A;
        return drawable != null ? drawable.getIntrinsicWidth() : this.B.f15176a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.A;
        return drawable != null ? drawable.getOpacity() : this.B.f15176a.getOpacity();
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        c cVar;
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            cVar = this.B;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayG = p4.a.g(resources, theme, attributeSet, a.f15173e);
                    int resourceId = typedArrayG.getResourceId(0, 0);
                    if (resourceId != 0) {
                        o oVar = new o();
                        ThreadLocal threadLocal = p4.i.f12335a;
                        oVar.A = resources.getDrawable(resourceId, theme);
                        new n(oVar.A.getConstantState());
                        oVar.F = false;
                        oVar.setCallback(this.F);
                        o oVar2 = cVar.f15176a;
                        if (oVar2 != null) {
                            oVar2.setCallback(null);
                        }
                        cVar.f15176a = oVar;
                    }
                    typedArrayG.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, a.f15174f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.C;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(cVar.f15176a.B.f15219b.f15217o.get(string));
                        if (cVar.f15178c == null) {
                            cVar.f15178c = new ArrayList();
                            cVar.f15179d = new u.e(0);
                        }
                        cVar.f15178c.add(animatorLoadAnimator);
                        cVar.f15179d.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (cVar.f15177b == null) {
            cVar.f15177b = new AnimatorSet();
        }
        cVar.f15177b.playTogether(cVar.f15178c);
    }

    @Override
    public final boolean isAutoMirrored() {
        Drawable drawable = this.A;
        return drawable != null ? drawable.isAutoMirrored() : this.B.f15176a.isAutoMirrored();
    }

    @Override
    public final boolean isRunning() {
        Drawable drawable = this.A;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.B.f15177b.isRunning();
    }

    @Override
    public final boolean isStateful() {
        Drawable drawable = this.A;
        return drawable != null ? drawable.isStateful() : this.B.f15176a.isStateful();
    }

    @Override
    public final Drawable mutate() {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.B.f15176a.setBounds(rect);
        }
    }

    @Override
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.A;
        return drawable != null ? drawable.setLevel(i10) : this.B.f15176a.setLevel(i10);
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.A;
        return drawable != null ? drawable.setState(iArr) : this.B.f15176a.setState(iArr);
    }

    @Override
    public final void setAlpha(int i10) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.B.f15176a.setAlpha(i10);
        }
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.B.f15176a.setAutoMirrored(z10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.B.f15176a.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setTint(int i10) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setTint(i10);
        } else {
            this.B.f15176a.setTint(i10);
        }
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.B.f15176a.setTintList(colorStateList);
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.B.f15176a.setTintMode(mode);
        }
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.B.f15176a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override
    public final void start() {
        Drawable drawable = this.A;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        c cVar = this.B;
        if (cVar.f15177b.isStarted()) {
            return;
        }
        cVar.f15177b.start();
        invalidateSelf();
    }

    @Override
    public final void stop() {
        Drawable drawable = this.A;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.B.f15177b.end();
        }
    }
}
