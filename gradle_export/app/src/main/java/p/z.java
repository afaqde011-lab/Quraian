package p;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class z implements t0 {

    public static final int[] f12227d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    public final int f12228a;

    public final View f12229b;

    public Object f12230c;

    public z(AbsSeekBar absSeekBar) {
        this.f12228a = 0;
        this.f12229b = absSeekBar;
    }

    public z(EditText editText) {
        this.f12228a = 1;
        this.f12229b = editText;
        this.f12230c = new wi.b(editText);
    }

    public z(v0 v0Var) {
        this.f12228a = 2;
        this.f12230c = v0Var;
        this.f12228a = 2;
        this.f12229b = v0Var;
    }

    @Override
    public void a(int i10) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i10);
    }

    @Override
    public void b(int i10) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i10);
    }

    @Override
    public void c(int i10, float f3) {
    }

    public KeyListener d(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((s10.w0) ((wi.b) this.f12230c).B).getClass();
        if (keyListener instanceof x5.e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new x5.e(keyListener);
    }

    public void e(AttributeSet attributeSet, int i10) {
        switch (this.f12228a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f12229b;
                k9.x0 x0VarK = k9.x0.K(absSeekBar.getContext(), attributeSet, f12227d, i10);
                Drawable drawableW = x0VarK.w(0);
                if (drawableW != null) {
                    if (drawableW instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableW;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i11 = 0; i11 < numberOfFrames; i11++) {
                            Drawable drawableH = h(animationDrawable.getFrame(i11), true);
                            drawableH.setLevel(10000);
                            animationDrawable2.addFrame(drawableH, animationDrawable.getDuration(i11));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableW = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableW);
                }
                Drawable drawableW2 = x0VarK.w(1);
                if (drawableW2 != null) {
                    absSeekBar.setProgressDrawable(h(drawableW2, false));
                }
                x0VarK.O();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f12229b).getContext().obtainStyledAttributes(attributeSet, j.a.f7724i, i10, 0);
                try {
                    boolean z10 = true;
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z10 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    g(z10);
                    return;
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th2;
                }
        }
    }

    public x5.b f(InputConnection inputConnection, EditorInfo editorInfo) {
        wi.b bVar = (wi.b) this.f12230c;
        if (inputConnection == null) {
            bVar.getClass();
            inputConnection = null;
        } else {
            s10.w0 w0Var = (s10.w0) bVar.B;
            w0Var.getClass();
            if (!(inputConnection instanceof x5.b)) {
                inputConnection = new x5.b((EditText) w0Var.B, inputConnection, editorInfo);
            }
        }
        return (x5.b) inputConnection;
    }

    public void g(boolean z10) {
        x5.i iVar = (x5.i) ((s10.w0) ((wi.b) this.f12230c).B).C;
        if (iVar.C != z10) {
            if (iVar.B != null) {
                v5.g gVarA = v5.g.a();
                x5.h hVar = iVar.B;
                gVarA.getClass();
                rd.a.i(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = gVarA.f15463a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    gVarA.f15464b.remove(hVar);
                    reentrantReadWriteLock.writeLock().unlock();
                } catch (Throwable th2) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th2;
                }
            }
            iVar.C = z10;
            if (z10) {
                x5.i.a(iVar.A, v5.g.a().c());
            }
        }
    }

    public Drawable h(Drawable drawable, boolean z10) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.f12230c) == null) {
                this.f12230c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z10 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i10 = 0; i10 < numberOfLayers; i10++) {
            int id2 = layerDrawable.getId(i10);
            drawableArr[i10] = h(layerDrawable.getDrawable(i10), id2 == 16908301 || id2 == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i11 = 0; i11 < numberOfLayers; i11++) {
            layerDrawable2.setId(i11, layerDrawable.getId(i11));
            layerDrawable2.setLayerGravity(i11, layerDrawable.getLayerGravity(i11));
            layerDrawable2.setLayerWidth(i11, layerDrawable.getLayerWidth(i11));
            layerDrawable2.setLayerHeight(i11, layerDrawable.getLayerHeight(i11));
            layerDrawable2.setLayerInsetLeft(i11, layerDrawable.getLayerInsetLeft(i11));
            layerDrawable2.setLayerInsetRight(i11, layerDrawable.getLayerInsetRight(i11));
            layerDrawable2.setLayerInsetTop(i11, layerDrawable.getLayerInsetTop(i11));
            layerDrawable2.setLayerInsetBottom(i11, layerDrawable.getLayerInsetBottom(i11));
            layerDrawable2.setLayerInsetStart(i11, layerDrawable.getLayerInsetStart(i11));
            layerDrawable2.setLayerInsetEnd(i11, layerDrawable.getLayerInsetEnd(i11));
        }
        return layerDrawable2;
    }
}
