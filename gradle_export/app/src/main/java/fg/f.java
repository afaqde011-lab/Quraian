package fg;

import ab.a0;
import ab.r;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import sg.g;
import sg.i;
import sg.m;
import sg.v;
import sg.y;

public final class f {

    public final MaterialButton f5641a;

    public m f5642b;

    public y f5643c;

    public u5.f f5644d;

    public r f5645e;

    public int f5646f;

    public int f5647g;

    public int f5648h;

    public int f5649i;

    public int f5650j;

    public int f5651k;
    public PorterDuff.Mode l;
    public ColorStateList m;

    public ColorStateList f5652n;

    public ColorStateList f5653o;

    public i f5654p;

    public boolean f5658t;

    public RippleDrawable f5660v;

    public int f5661w;

    public boolean f5655q = false;

    public boolean f5656r = false;

    public boolean f5657s = false;

    public boolean f5659u = true;

    public f(MaterialButton materialButton, m mVar) {
        this.f5641a = materialButton;
        this.f5642b = mVar;
    }

    public final i a(boolean z10) {
        RippleDrawable rippleDrawable = this.f5660v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (i) ((LayerDrawable) ((InsetDrawable) this.f5660v.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
    }

    public final void b(int i10, int i11) {
        MaterialButton materialButton = this.f5641a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i12 = this.f5648h;
        int i13 = this.f5649i;
        this.f5649i = i11;
        this.f5648h = i10;
        if (!this.f5656r) {
            c();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i10) - i12, paddingEnd, (paddingBottom + i11) - i13);
    }

    public final void c() {
        i iVar = new i(this.f5642b);
        y yVar = this.f5643c;
        if (yVar != null) {
            iVar.n(yVar);
        }
        u5.f fVar = this.f5644d;
        if (fVar != null) {
            iVar.k(fVar);
        }
        r rVar = this.f5645e;
        if (rVar != null) {
            iVar.f14168b0 = rVar;
        }
        MaterialButton materialButton = this.f5641a;
        iVar.j(materialButton.getContext());
        iVar.setTintList(this.m);
        PorterDuff.Mode mode = this.l;
        if (mode != null) {
            iVar.setTintMode(mode);
        }
        float f3 = this.f5651k;
        ColorStateList colorStateList = this.f5652n;
        iVar.B.f14160k = f3;
        iVar.invalidateSelf();
        g gVar = iVar.B;
        if (gVar.f14154e != colorStateList) {
            gVar.f14154e = colorStateList;
            iVar.onStateChange(iVar.getState());
        }
        i iVar2 = new i(this.f5642b);
        y yVar2 = this.f5643c;
        if (yVar2 != null) {
            iVar2.n(yVar2);
        }
        u5.f fVar2 = this.f5644d;
        if (fVar2 != null) {
            iVar2.k(fVar2);
        }
        iVar2.setTint(0);
        float f10 = this.f5651k;
        int iE0 = this.f5655q ? a0.e0(materialButton, 2130968937) : 0;
        iVar2.B.f14160k = f10;
        iVar2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iE0);
        g gVar2 = iVar2.B;
        if (gVar2.f14154e != colorStateListValueOf) {
            gVar2.f14154e = colorStateListValueOf;
            iVar2.onStateChange(iVar2.getState());
        }
        i iVar3 = new i(this.f5642b);
        this.f5654p = iVar3;
        y yVar3 = this.f5643c;
        if (yVar3 != null) {
            iVar3.n(yVar3);
        }
        u5.f fVar3 = this.f5644d;
        if (fVar3 != null) {
            this.f5654p.k(fVar3);
        }
        this.f5654p.setTint(-1);
        ColorStateList colorStateListValueOf2 = this.f5653o;
        if (colorStateListValueOf2 == null) {
            colorStateListValueOf2 = ColorStateList.valueOf(0);
        }
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateListValueOf2, new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{iVar2, iVar}), this.f5646f, this.f5648h, this.f5647g, this.f5649i), this.f5654p);
        this.f5660v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        i iVarA = a(false);
        if (iVarA != null) {
            iVarA.l(this.f5661w);
            iVarA.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        v vVar;
        i iVarA = a(false);
        if (iVarA != null) {
            y yVar = this.f5643c;
            if (yVar != null) {
                iVarA.n(yVar);
            } else {
                iVarA.setShapeAppearanceModel(this.f5642b);
            }
            u5.f fVar = this.f5644d;
            if (fVar != null) {
                iVarA.k(fVar);
            }
        }
        i iVarA2 = a(true);
        if (iVarA2 != null) {
            y yVar2 = this.f5643c;
            if (yVar2 != null) {
                iVarA2.n(yVar2);
            } else {
                iVarA2.setShapeAppearanceModel(this.f5642b);
            }
            u5.f fVar2 = this.f5644d;
            if (fVar2 != null) {
                iVarA2.k(fVar2);
            }
        }
        RippleDrawable rippleDrawable = this.f5660v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            vVar = null;
        } else {
            vVar = this.f5660v.getNumberOfLayers() > 2 ? (v) this.f5660v.getDrawable(2) : (v) this.f5660v.getDrawable(1);
        }
        if (vVar != null) {
            vVar.setShapeAppearanceModel(this.f5642b);
            if (vVar instanceof i) {
                i iVar = (i) vVar;
                y yVar3 = this.f5643c;
                if (yVar3 != null) {
                    iVar.n(yVar3);
                }
                u5.f fVar3 = this.f5644d;
                if (fVar3 != null) {
                    iVar.k(fVar3);
                }
            }
        }
    }

    public final void e() {
        i iVarA = a(false);
        i iVarA2 = a(true);
        if (iVarA != null) {
            float f3 = this.f5651k;
            ColorStateList colorStateList = this.f5652n;
            iVarA.B.f14160k = f3;
            iVarA.invalidateSelf();
            g gVar = iVarA.B;
            if (gVar.f14154e != colorStateList) {
                gVar.f14154e = colorStateList;
                iVarA.onStateChange(iVarA.getState());
            }
            if (iVarA2 != null) {
                float f10 = this.f5651k;
                int iE0 = this.f5655q ? a0.e0(this.f5641a, 2130968937) : 0;
                iVarA2.B.f14160k = f10;
                iVarA2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iE0);
                g gVar2 = iVarA2.B;
                if (gVar2.f14154e != colorStateListValueOf) {
                    gVar2.f14154e = colorStateListValueOf;
                    iVarA2.onStateChange(iVarA2.getState());
                }
            }
        }
    }
}
