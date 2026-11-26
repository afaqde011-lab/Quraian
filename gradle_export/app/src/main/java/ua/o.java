package ua;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class o extends f {
    public static final PorterDuff.Mode J = PorterDuff.Mode.SRC_IN;
    public m B;
    public PorterDuffColorFilter C;
    public ColorFilter D;
    public boolean E;
    public boolean F;
    public final float[] G;
    public final Matrix H;
    public final Rect I;

    public o() {
        this.F = true;
        this.G = new float[9];
        this.H = new Matrix();
        this.I = new Rect();
        m mVar = new m();
        mVar.f15220c = null;
        mVar.f15221d = J;
        mVar.f15219b = new l();
        this.B = mVar;
    }

    public o(m mVar) {
        this.F = true;
        this.G = new float[9];
        this.H = new Matrix();
        this.I = new Rect();
        this.B = mVar;
        this.C = a(mVar.f15220c, mVar.f15221d);
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override
    public final boolean canApplyTheme() {
        Drawable drawable = this.A;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.I;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.D;
        if (colorFilter == null) {
            colorFilter = this.C;
        }
        Matrix matrix = this.H;
        canvas.getMatrix(matrix);
        float[] fArr = this.G;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        m mVar = this.B;
        Bitmap bitmap = mVar.f15223f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != mVar.f15223f.getHeight()) {
            mVar.f15223f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            mVar.f15228k = true;
        }
        if (this.F) {
            m mVar2 = this.B;
            if (mVar2.f15228k || mVar2.f15224g != mVar2.f15220c || mVar2.f15225h != mVar2.f15221d || mVar2.f15227j != mVar2.f15222e || mVar2.f15226i != mVar2.f15219b.getRootAlpha()) {
                m mVar3 = this.B;
                mVar3.f15223f.eraseColor(0);
                Canvas canvas2 = new Canvas(mVar3.f15223f);
                l lVar = mVar3.f15219b;
                lVar.a(lVar.f15211g, l.f15204p, canvas2, iMin, iMin2);
                m mVar4 = this.B;
                mVar4.f15224g = mVar4.f15220c;
                mVar4.f15225h = mVar4.f15221d;
                mVar4.f15226i = mVar4.f15219b.getRootAlpha();
                mVar4.f15227j = mVar4.f15222e;
                mVar4.f15228k = false;
            }
        } else {
            m mVar5 = this.B;
            mVar5.f15223f.eraseColor(0);
            Canvas canvas3 = new Canvas(mVar5.f15223f);
            l lVar2 = mVar5.f15219b;
            lVar2.a(lVar2.f15211g, l.f15204p, canvas3, iMin, iMin2);
        }
        m mVar6 = this.B;
        if (mVar6.f15219b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (mVar6.l == null) {
                Paint paint2 = new Paint();
                mVar6.l = paint2;
                paint2.setFilterBitmap(true);
            }
            mVar6.l.setAlpha(mVar6.f15219b.getRootAlpha());
            mVar6.l.setColorFilter(colorFilter);
            paint = mVar6.l;
        }
        canvas.drawBitmap(mVar6.f15223f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override
    public final int getAlpha() {
        Drawable drawable = this.A;
        return drawable != null ? drawable.getAlpha() : this.B.f15219b.getRootAlpha();
    }

    @Override
    public final int getChangingConfigurations() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.B.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.A;
        return drawable != null ? drawable.getColorFilter() : this.D;
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (this.A != null) {
            return new n(this.A.getConstantState());
        }
        this.B.f15218a = getChangingConfigurations();
        return this.B;
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.A;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.B.f15219b.f15213i;
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.A;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.B.f15219b.f15212h;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i10;
        int i11;
        int i12;
        int i13;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        m mVar = this.B;
        mVar.f15219b = new l();
        TypedArray typedArrayG = p4.a.g(resources, theme, attributeSet, a.f15169a);
        m mVar2 = this.B;
        l lVar = mVar2.f15219b;
        int i14 = !p4.a.d(xmlPullParser, "tintMode") ? -1 : typedArrayG.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i15 = 3;
        if (i14 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i14 != 5) {
            if (i14 != 9) {
                switch (i14) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        mVar2.f15221d = mode;
        ColorStateList colorStateListB = p4.a.b(typedArrayG, xmlPullParser, theme);
        if (colorStateListB != null) {
            mVar2.f15220c = colorStateListB;
        }
        boolean z10 = mVar2.f15222e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z10 = typedArrayG.getBoolean(5, z10);
        }
        mVar2.f15222e = z10;
        float f3 = lVar.f15214j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f3 = typedArrayG.getFloat(7, f3);
        }
        lVar.f15214j = f3;
        float f10 = lVar.f15215k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f10 = typedArrayG.getFloat(8, f10);
        }
        lVar.f15215k = f10;
        if (lVar.f15214j <= 0.0f) {
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f10 <= 0.0f) {
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        lVar.f15212h = typedArrayG.getDimension(3, lVar.f15212h);
        int i16 = 2;
        float dimension = typedArrayG.getDimension(2, lVar.f15213i);
        lVar.f15213i = dimension;
        if (lVar.f15212h <= 0.0f) {
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = lVar.getAlpha();
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
            alpha = typedArrayG.getFloat(4, alpha);
        }
        lVar.setAlpha(alpha);
        String string = typedArrayG.getString(0);
        if (string != null) {
            lVar.m = string;
            lVar.f15217o.put(string, lVar);
        }
        typedArrayG.recycle();
        mVar.f15218a = getChangingConfigurations();
        int i17 = 1;
        mVar.f15228k = true;
        m mVar3 = this.B;
        l lVar2 = mVar3.f15219b;
        ArrayDeque arrayDeque = new ArrayDeque();
        i iVar = lVar2.f15211g;
        u.e eVar = lVar2.f15217o;
        arrayDeque.push(iVar);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z11 = true;
        while (eventType != i17 && (xmlPullParser.getDepth() >= depth || eventType != i15)) {
            if (eventType == i16) {
                String name = xmlPullParser.getName();
                i iVar2 = (i) arrayDeque.peek();
                i10 = depth;
                if ("path".equals(name)) {
                    h hVar = new h();
                    hVar.f15182e = 0.0f;
                    hVar.f15184g = 1.0f;
                    hVar.f15185h = 1.0f;
                    hVar.f15186i = 0.0f;
                    hVar.f15187j = 1.0f;
                    hVar.f15188k = 0.0f;
                    Paint.Cap cap2 = Paint.Cap.BUTT;
                    hVar.l = cap2;
                    Paint.Join join2 = Paint.Join.MITER;
                    hVar.m = join2;
                    hVar.f15189n = 4.0f;
                    TypedArray typedArrayG2 = p4.a.g(resources, theme, attributeSet, a.f15171c);
                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                        String string2 = typedArrayG2.getString(0);
                        if (string2 != null) {
                            hVar.f15202b = string2;
                        }
                        String string3 = typedArrayG2.getString(2);
                        if (string3 != null) {
                            hVar.f15201a = va.a.t(string3);
                        }
                        hVar.f15183f = p4.a.c(typedArrayG2, xmlPullParser, theme, "fillColor", 1);
                        float f11 = hVar.f15185h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                            f11 = typedArrayG2.getFloat(12, f11);
                        }
                        hVar.f15185h = f11;
                        int i18 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayG2.getInt(8, -1) : -1;
                        Paint.Cap cap3 = hVar.l;
                        if (i18 == 0) {
                            cap = cap2;
                        } else if (i18 != 1) {
                            cap = i18 != 2 ? cap3 : Paint.Cap.SQUARE;
                        } else {
                            cap = Paint.Cap.ROUND;
                        }
                        hVar.l = cap;
                        int i19 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayG2.getInt(9, -1) : -1;
                        Paint.Join join3 = hVar.m;
                        if (i19 == 0) {
                            join = join2;
                        } else if (i19 != 1) {
                            join = i19 != 2 ? join3 : Paint.Join.BEVEL;
                        } else {
                            join = Paint.Join.ROUND;
                        }
                        hVar.m = join;
                        float f12 = hVar.f15189n;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                            f12 = typedArrayG2.getFloat(10, f12);
                        }
                        hVar.f15189n = f12;
                        hVar.f15181d = p4.a.c(typedArrayG2, xmlPullParser, theme, "strokeColor", 3);
                        float f13 = hVar.f15184g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                            f13 = typedArrayG2.getFloat(11, f13);
                        }
                        hVar.f15184g = f13;
                        float f14 = hVar.f15182e;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                            f14 = typedArrayG2.getFloat(4, f14);
                        }
                        hVar.f15182e = f14;
                        float f15 = hVar.f15187j;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                            f15 = typedArrayG2.getFloat(6, f15);
                        }
                        hVar.f15187j = f15;
                        float f16 = hVar.f15188k;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                            f16 = typedArrayG2.getFloat(7, f16);
                        }
                        hVar.f15188k = f16;
                        float f17 = hVar.f15186i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                            f17 = typedArrayG2.getFloat(5, f17);
                        }
                        hVar.f15186i = f17;
                        int i20 = hVar.f15203c;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                            i20 = typedArrayG2.getInt(13, i20);
                        }
                        hVar.f15203c = i20;
                    }
                    typedArrayG2.recycle();
                    iVar2.f15191b.add(hVar);
                    if (hVar.getPathName() != null) {
                        eVar.put(hVar.getPathName(), hVar);
                    }
                    mVar3.f15218a = mVar3.f15218a;
                    i13 = 1;
                    z11 = false;
                } else {
                    if ("clip-path".equals(name)) {
                        g gVar = new g();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                            TypedArray typedArrayG3 = p4.a.g(resources, theme, attributeSet, a.f15172d);
                            String string4 = typedArrayG3.getString(0);
                            if (string4 != null) {
                                gVar.f15202b = string4;
                            }
                            String string5 = typedArrayG3.getString(1);
                            if (string5 != null) {
                                gVar.f15201a = va.a.t(string5);
                            }
                            gVar.f15203c = !p4.a.d(xmlPullParser, "fillType") ? 0 : typedArrayG3.getInt(2, 0);
                            typedArrayG3.recycle();
                        }
                        iVar2.f15191b.add(gVar);
                        if (gVar.getPathName() != null) {
                            eVar.put(gVar.getPathName(), gVar);
                        }
                        mVar3.f15218a = mVar3.f15218a;
                    } else if ("group".equals(name)) {
                        i iVar3 = new i();
                        TypedArray typedArrayG4 = p4.a.g(resources, theme, attributeSet, a.f15170b);
                        float f18 = iVar3.f15192c;
                        if (p4.a.d(xmlPullParser, "rotation")) {
                            f18 = typedArrayG4.getFloat(5, f18);
                        }
                        iVar3.f15192c = f18;
                        i13 = 1;
                        iVar3.f15193d = typedArrayG4.getFloat(1, iVar3.f15193d);
                        iVar3.f15194e = typedArrayG4.getFloat(2, iVar3.f15194e);
                        float f19 = iVar3.f15195f;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                            f19 = typedArrayG4.getFloat(3, f19);
                        }
                        iVar3.f15195f = f19;
                        float f20 = iVar3.f15196g;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                            f20 = typedArrayG4.getFloat(4, f20);
                        }
                        iVar3.f15196g = f20;
                        float f21 = iVar3.f15197h;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                            f21 = typedArrayG4.getFloat(6, f21);
                        }
                        iVar3.f15197h = f21;
                        float f22 = iVar3.f15198i;
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                            f22 = typedArrayG4.getFloat(7, f22);
                        }
                        iVar3.f15198i = f22;
                        String string6 = typedArrayG4.getString(0);
                        if (string6 != null) {
                            iVar3.f15200k = string6;
                        }
                        iVar3.c();
                        typedArrayG4.recycle();
                        iVar2.f15191b.add(iVar3);
                        arrayDeque.push(iVar3);
                        if (iVar3.getGroupName() != null) {
                            eVar.put(iVar3.getGroupName(), iVar3);
                        }
                        mVar3.f15218a = mVar3.f15218a;
                    }
                    i13 = 1;
                }
                i12 = i13;
                i11 = 3;
            } else {
                i10 = depth;
                i11 = i15;
                i12 = 1;
                if (eventType == i11 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i15 = i11;
            i17 = i12;
            depth = i10;
            i16 = 2;
        }
        if (z11) {
            throw new XmlPullParserException("no path defined");
        }
        this.C = a(mVar.f15220c, mVar.f15221d);
    }

    @Override
    public final void invalidateSelf() {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override
    public final boolean isAutoMirrored() {
        Drawable drawable = this.A;
        return drawable != null ? drawable.isAutoMirrored() : this.B.f15222e;
    }

    @Override
    public final boolean isStateful() {
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        m mVar = this.B;
        if (mVar == null) {
            return false;
        }
        l lVar = mVar.f15219b;
        if (lVar.f15216n == null) {
            lVar.f15216n = Boolean.valueOf(lVar.f15211g.a());
        }
        if (lVar.f15216n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.B.f15220c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override
    public final Drawable mutate() {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.E && super.mutate() == this) {
            m mVar = this.B;
            m mVar2 = new m();
            mVar2.f15220c = null;
            mVar2.f15221d = J;
            if (mVar != null) {
                mVar2.f15218a = mVar.f15218a;
                l lVar = new l(mVar.f15219b);
                mVar2.f15219b = lVar;
                if (mVar.f15219b.f15209e != null) {
                    lVar.f15209e = new Paint(mVar.f15219b.f15209e);
                }
                if (mVar.f15219b.f15208d != null) {
                    mVar2.f15219b.f15208d = new Paint(mVar.f15219b.f15208d);
                }
                mVar2.f15220c = mVar.f15220c;
                mVar2.f15221d = mVar.f15221d;
                mVar2.f15222e = mVar.f15222e;
            }
            this.B = mVar2;
            this.E = true;
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.A;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        m mVar = this.B;
        ColorStateList colorStateList = mVar.f15220c;
        if (colorStateList == null || (mode = mVar.f15221d) == null) {
            z10 = false;
        } else {
            this.C = a(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        l lVar = mVar.f15219b;
        if (lVar.f15216n == null) {
            lVar.f15216n = Boolean.valueOf(lVar.f15211g.a());
        }
        if (lVar.f15216n.booleanValue()) {
            boolean zB = mVar.f15219b.f15211g.b(iArr);
            mVar.f15228k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override
    public final void scheduleSelf(Runnable runnable, long j9) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j9);
        } else {
            super.scheduleSelf(runnable, j9);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.B.f15219b.getRootAlpha() != i10) {
            this.B.f15219b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.B.f15222e = z10;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.D = colorFilter;
            invalidateSelf();
        }
    }

    @Override
    public final void setTint(int i10) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setTint(i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        m mVar = this.B;
        if (mVar.f15220c != colorStateList) {
            mVar.f15220c = colorStateList;
            this.C = a(colorStateList, mVar.f15221d);
            invalidateSelf();
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        m mVar = this.B;
        if (mVar.f15221d != mode) {
            mVar.f15221d = mode;
            this.C = a(mVar.f15220c, mode);
            invalidateSelf();
        }
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.A;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
