package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import ba.f1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class o0 extends ba.g0 {

    public final ArrayList f1753a = new ArrayList();

    public final LayoutInflater f1754b;

    public final Drawable f1755c;

    public final Drawable f1756d;

    public final Drawable f1757e;

    public final Drawable f1758f;

    public m0 f1759g;

    public final int f1760h;

    public final AccelerateDecelerateInterpolator f1761i;

    public final q0 f1762j;

    public o0(q0 q0Var) {
        this.f1762j = q0Var;
        Context context = q0Var.O;
        this.f1754b = LayoutInflater.from(context);
        this.f1755c = f50.c.D(context, 2130969546);
        this.f1756d = f50.c.D(context, 2130969555);
        this.f1757e = f50.c.D(context, 2130969552);
        this.f1758f = f50.c.D(context, 2130969551);
        this.f1760h = context.getResources().getInteger(2131427382);
        this.f1761i = new AccelerateDecelerateInterpolator();
        d();
    }

    public final void a(View view, int i10) {
        n nVar = new n(i10, view.getLayoutParams().height, view, 1);
        nVar.setAnimationListener(new p(this, 2));
        nVar.setDuration(this.f1760h);
        nVar.setInterpolator(this.f1761i);
        view.startAnimation(nVar);
    }

    public final Drawable b(o9.b0 b0Var) {
        Uri uri = b0Var.f11742f;
        if (uri != null) {
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(this.f1762j.O.getContentResolver().openInputStream(uri), null);
                if (drawableCreateFromStream != null) {
                    return drawableCreateFromStream;
                }
            } catch (IOException e3) {
                Log.w("MediaRouteCtrlDialog", "Failed to load " + uri, e3);
            }
        }
        int i10 = b0Var.f11748n;
        if (i10 == 1) {
            return this.f1756d;
        }
        if (i10 != 2) {
            return b0Var.e() ? this.f1758f : this.f1755c;
        }
        return this.f1757e;
    }

    public final void c() {
        q0 q0Var = this.f1762j;
        ArrayList arrayList = q0Var.N;
        arrayList.clear();
        ArrayList arrayList2 = q0Var.L;
        ArrayList arrayList3 = new ArrayList();
        o9.x xVarA = q0Var.J.a();
        if (xVarA != null) {
            o9.a0 a0Var = q0Var.J.f11737a;
            a0Var.getClass();
            o9.c0.b();
            for (o9.b0 b0Var : Collections.unmodifiableList(a0Var.f11730b)) {
                if (xVarA.o(b0Var)) {
                    arrayList3.add(b0Var);
                }
            }
        }
        HashSet hashSet = new HashSet(arrayList2);
        hashSet.removeAll(arrayList3);
        arrayList.addAll(hashSet);
        notifyDataSetChanged();
    }

    public final void d() {
        ArrayList arrayList = this.f1753a;
        arrayList.clear();
        q0 q0Var = this.f1762j;
        ArrayList<o9.b0> arrayList2 = q0Var.M;
        Context context = q0Var.O;
        ArrayList<o9.b0> arrayList3 = q0Var.L;
        this.f1759g = new m0(q0Var.J, 1);
        ArrayList arrayList4 = q0Var.K;
        if (arrayList4.isEmpty()) {
            arrayList.add(new m0(q0Var.J, 3));
        } else {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                arrayList.add(new m0((o9.b0) it.next(), 3));
            }
        }
        boolean z10 = false;
        if (!arrayList3.isEmpty()) {
            boolean z11 = false;
            for (o9.b0 b0Var : arrayList3) {
                if (!arrayList4.contains(b0Var)) {
                    if (!z11) {
                        q0Var.J.getClass();
                        o9.p pVarB = o9.b0.b();
                        String strJ = pVarB != null ? pVarB.j() : null;
                        if (TextUtils.isEmpty(strJ)) {
                            strJ = context.getString(2131886832);
                        }
                        arrayList.add(new m0(strJ, 2));
                        z11 = true;
                    }
                    arrayList.add(new m0(b0Var, 3));
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            for (o9.b0 b0Var2 : arrayList2) {
                o9.b0 b0Var3 = q0Var.J;
                if (b0Var3 != b0Var2) {
                    if (!z10) {
                        b0Var3.getClass();
                        o9.p pVarB2 = o9.b0.b();
                        String strK = pVarB2 != null ? pVarB2.k() : null;
                        if (TextUtils.isEmpty(strK)) {
                            strK = context.getString(2131886833);
                        }
                        arrayList.add(new m0(strK, 2));
                        z10 = true;
                    }
                    arrayList.add(new m0(b0Var2, 4));
                }
            }
        }
        c();
    }

    @Override
    public final int getItemCount() {
        return this.f1753a.size() + 1;
    }

    @Override
    public final int getItemViewType(int i10) {
        m0 m0Var;
        if (i10 == 0) {
            m0Var = this.f1759g;
        } else {
            m0Var = (m0) this.f1753a.get(i10 - 1);
        }
        return m0Var.f1750b;
    }

    @Override
    public final void onBindViewHolder(f1 f1Var, int i10) {
        o9.x xVarA;
        o9.o oVar;
        ArrayList arrayList = this.f1753a;
        int i11 = (i10 == 0 ? this.f1759g : (m0) arrayList.get(i10 - 1)).f1750b;
        boolean z10 = true;
        m0 m0Var = i10 == 0 ? this.f1759g : (m0) arrayList.get(i10 - 1);
        q0 q0Var = this.f1762j;
        int i12 = 0;
        if (i11 == 1) {
            q0Var.W.put(((o9.b0) m0Var.f1749a).f11739c, (h0) f1Var);
            k0 k0Var = (k0) f1Var;
            View view = k0Var.f2275a;
            q0 q0Var2 = k0Var.A.f1762j;
            if (q0Var2.f1786t0 && Collections.unmodifiableList(q0Var2.J.f11756v).size() > 1) {
                i12 = k0Var.f1747z;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i12;
            view.setLayoutParams(layoutParams);
            o9.b0 b0Var = (o9.b0) m0Var.f1749a;
            k0Var.q(b0Var);
            k0Var.f1746y.setText(b0Var.f11740d);
            return;
        }
        if (i11 == 2) {
            l0 l0Var = (l0) f1Var;
            l0Var.getClass();
            l0Var.f1748u.setText(m0Var.f1749a.toString());
            return;
        }
        if (i11 != 3) {
            if (i11 != 4) {
                throw new IllegalStateException();
            }
            j0 j0Var = (j0) f1Var;
            View view2 = j0Var.f1740u;
            o9.b0 b0Var2 = (o9.b0) m0Var.f1749a;
            j0Var.f1745z = b0Var2;
            ImageView imageView = j0Var.f1741v;
            imageView.setVisibility(0);
            j0Var.f1742w.setVisibility(4);
            o0 o0Var = j0Var.A;
            List listUnmodifiableList = Collections.unmodifiableList(o0Var.f1762j.J.f11756v);
            view2.setAlpha((listUnmodifiableList.size() == 1 && listUnmodifiableList.get(0) == b0Var2) ? j0Var.f1744y : 1.0f);
            view2.setOnClickListener(new g0(j0Var, 3));
            imageView.setImageDrawable(o0Var.b(b0Var2));
            j0Var.f1743x.setText(b0Var2.f11740d);
            return;
        }
        q0Var.W.put(((o9.b0) m0Var.f1749a).f11739c, (h0) f1Var);
        n0 n0Var = (n0) f1Var;
        float f3 = n0Var.E;
        g0 g0Var = n0Var.G;
        ImageView imageView2 = n0Var.f1752z;
        View view3 = n0Var.f1751y;
        CheckBox checkBox = n0Var.D;
        o9.b0 b0Var3 = (o9.b0) m0Var.f1749a;
        o0 o0Var2 = n0Var.H;
        q0 q0Var3 = o0Var2.f1762j;
        if (b0Var3 == q0Var3.J && Collections.unmodifiableList(b0Var3.f11756v).size() > 0) {
            for (o9.b0 b0Var4 : Collections.unmodifiableList(b0Var3.f11756v)) {
                if (!q0Var3.L.contains(b0Var4)) {
                    b0Var3 = b0Var4;
                    break;
                }
            }
        }
        n0Var.q(b0Var3);
        imageView2.setImageDrawable(o0Var2.b(b0Var3));
        n0Var.B.setText(b0Var3.f11740d);
        checkBox.setVisibility(0);
        boolean zS = n0Var.s(b0Var3);
        boolean z11 = !q0Var3.N.contains(b0Var3) && (!n0Var.s(b0Var3) || Collections.unmodifiableList(q0Var3.J.f11756v).size() >= 2) && !(n0Var.s(b0Var3) && ((xVarA = q0Var3.J.a()) == null || (oVar = (o9.o) xVarA.f11892x.get(b0Var3.f11739c)) == null || !oVar.f11839c));
        checkBox.setChecked(zS);
        n0Var.A.setVisibility(4);
        imageView2.setVisibility(0);
        view3.setEnabled(z11);
        checkBox.setEnabled(z11);
        n0Var.f1735v.setEnabled(z11 || zS);
        MediaRouteVolumeSlider mediaRouteVolumeSlider = n0Var.f1736w;
        if (!z11 && !zS) {
            z10 = false;
        }
        mediaRouteVolumeSlider.setEnabled(z10);
        view3.setOnClickListener(g0Var);
        checkBox.setOnClickListener(g0Var);
        RelativeLayout relativeLayout = n0Var.C;
        if (zS && !n0Var.f1734u.e()) {
            i12 = n0Var.F;
        }
        ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
        layoutParams2.height = i12;
        relativeLayout.setLayoutParams(layoutParams2);
        view3.setAlpha((z11 || zS) ? 1.0f : f3);
        checkBox.setAlpha((z11 || !zS) ? 1.0f : f3);
    }

    @Override
    public final f1 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        LayoutInflater layoutInflater = this.f1754b;
        if (i10 == 1) {
            return new k0(this, layoutInflater.inflate(2131559090, viewGroup, false));
        }
        if (i10 == 2) {
            return new l0(layoutInflater.inflate(2131559091, viewGroup, false));
        }
        if (i10 == 3) {
            return new n0(this, layoutInflater.inflate(2131559093, viewGroup, false));
        }
        if (i10 == 4) {
            return new j0(this, layoutInflater.inflate(2131559089, viewGroup, false));
        }
        throw new IllegalStateException();
    }

    @Override
    public final void onViewRecycled(f1 f1Var) {
        super.onViewRecycled(f1Var);
        this.f1762j.W.values().remove(f1Var);
    }
}
