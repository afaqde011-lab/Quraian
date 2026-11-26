package androidx.mediarouter.app;

import android.util.Log;
import android.view.View;
import ba.f1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class g0 implements View.OnClickListener {
    public final int A;
    public final Object B;

    public g0(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    @Override
    public final void onClick(View view) {
        int iMax;
        switch (this.A) {
            case 0:
                h0 h0Var = (h0) this.B;
                q0 q0Var = h0Var.f1737x;
                if (q0Var.X != null) {
                    q0Var.S.removeMessages(2);
                }
                q0Var.X = h0Var.f1734u;
                boolean zIsActivated = view.isActivated();
                boolean z10 = !zIsActivated;
                if (zIsActivated) {
                    Integer num = (Integer) q0Var.Y.get(h0Var.f1734u.f11739c);
                    iMax = num == null ? 1 : Math.max(1, num.intValue());
                } else {
                    iMax = 0;
                }
                h0Var.r(z10);
                h0Var.f1736w.setProgress(iMax);
                h0Var.f1734u.j(iMax);
                q0Var.S.sendEmptyMessageDelayed(2, 500L);
                return;
            case 1:
                MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) this.B;
                boolean z11 = mediaRouteExpandCollapseButton.H;
                mediaRouteExpandCollapseButton.H = !z11;
                if (z11) {
                    mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.E);
                    mediaRouteExpandCollapseButton.E.start();
                    mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.F);
                } else {
                    mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.D);
                    mediaRouteExpandCollapseButton.D.start();
                    mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.G);
                }
                View.OnClickListener onClickListener = mediaRouteExpandCollapseButton.I;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 2:
                ((d0) this.B).dismiss();
                return;
            case 3:
                j0 j0Var = (j0) this.B;
                o9.c0 c0Var = j0Var.A.f1762j.G;
                o9.b0 b0Var = j0Var.f1745z;
                c0Var.getClass();
                if (b0Var == null) {
                    throw new NullPointerException("route must not be null");
                }
                o9.c0.b();
                o9.f fVarC = o9.c0.c();
                o9.x xVarA = fVarC.f11781d.a();
                if (xVarA == null) {
                    Log.w("AxMediaRouter", "Ignoring attempt to transfer for a selected non-group route");
                } else {
                    List<o9.b0> listSingletonList = Collections.singletonList(b0Var);
                    ArrayList arrayList = new ArrayList();
                    for (o9.b0 b0Var2 : listSingletonList) {
                        o9.o oVar = (o9.o) xVarA.f11892x.get(b0Var2.f11739c);
                        if (oVar == null || !oVar.f11841e) {
                            Log.w("AxMediaRouter", "Ignoring attempt to update the group with a non-transferable route: " + b0Var2);
                        } else {
                            arrayList.add(b0Var2.f11738b);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        Log.w("AxMediaRouter", "Ignoring attempt to update the group with non-transferable routes");
                    } else if (xVarA.g()) {
                        o9.r rVar = fVarC.f11782e;
                        if (!(rVar instanceof o9.p)) {
                            throw new IllegalStateException("There is no currently selected dynamic group route.");
                        }
                        ((o9.p) rVar).o(arrayList);
                    } else if (xVarA.n()) {
                        fVarC.f();
                        Log.w("AxMediaRouter", "Ignoring attempt to update routes for a non-available connected route: " + xVarA);
                    } else {
                        Log.w("AxMediaRouter", "Ignoring attempt to update routes for an unsupported group route:" + xVarA);
                    }
                }
                j0Var.f1741v.setVisibility(4);
                j0Var.f1742w.setVisibility(0);
                return;
            default:
                n0 n0Var = (n0) this.B;
                o0 o0Var = n0Var.H;
                boolean zS = n0Var.s(n0Var.f1734u);
                boolean z12 = !zS;
                boolean zE = n0Var.f1734u.e();
                if (zS) {
                    o9.c0 c0Var2 = o0Var.f1762j.G;
                    o9.b0 b0Var3 = n0Var.f1734u;
                    c0Var2.getClass();
                    if (b0Var3 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    o9.c0.b();
                    o9.f fVarC2 = o9.c0.c();
                    o9.x xVarA2 = fVarC2.f11781d.a();
                    if (xVarA2 == null) {
                        Log.w("AxMediaRouter", "Ignoring attempt to remove a member route from a selected non-group route");
                    } else {
                        o9.o oVar2 = (o9.o) xVarA2.f11892x.get(b0Var3.f11739c);
                        if (oVar2 == null || !oVar2.f11839c) {
                            Log.w("AxMediaRouter", "Ignoring attempt to remove a non-unselectable member route: " + b0Var3);
                        } else if (!Collections.unmodifiableList(xVarA2.f11756v).contains(b0Var3)) {
                            Log.w("AxMediaRouter", "Ignoring attempt to remove a non-in-group member route: " + b0Var3);
                        } else if (Collections.unmodifiableList(xVarA2.f11756v).size() <= 1) {
                            Log.w("AxMediaRouter", "Ignoring attempt to remove the last member route.");
                        } else if (xVarA2.g()) {
                            o9.r rVar2 = fVarC2.f11782e;
                            if (!(rVar2 instanceof o9.p)) {
                                throw new IllegalStateException("There is no currently selected dynamic group route.");
                            }
                            ((o9.p) rVar2).n(b0Var3.f11738b);
                        } else if (xVarA2.n()) {
                            fVarC2.f();
                            Log.w("AxMediaRouter", "Ignoring attempt to update routes for a non-available connected route: " + xVarA2);
                        } else {
                            Log.w("AxMediaRouter", "Ignoring attempt to remove a route from an unsupported group route:" + xVarA2);
                        }
                    }
                } else {
                    o9.c0 c0Var3 = o0Var.f1762j.G;
                    o9.b0 b0Var4 = n0Var.f1734u;
                    c0Var3.getClass();
                    if (b0Var4 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    o9.c0.b();
                    o9.f fVarC3 = o9.c0.c();
                    o9.x xVarA3 = fVarC3.f11781d.a();
                    if (xVarA3 == null) {
                        Log.w("AxMediaRouter", "Ignoring attempt to add a member route to a selected non-group route");
                    } else if (!xVarA3.o(b0Var4)) {
                        Log.w("AxMediaRouter", "Ignoring attempt to add a non-groupable member route: " + b0Var4);
                    } else if (Collections.unmodifiableList(xVarA3.f11756v).contains(b0Var4)) {
                        Log.w("AxMediaRouter", "Ignoring attempt to add an existing member route: " + b0Var4);
                    } else if (xVarA3.g()) {
                        o9.r rVar3 = fVarC3.f11782e;
                        if (!(rVar3 instanceof o9.p)) {
                            throw new IllegalStateException("There is no currently selected dynamic group route.");
                        }
                        ((o9.p) rVar3).m(b0Var4.f11738b);
                    } else if (xVarA3.n()) {
                        fVarC3.f();
                        Log.w("AxMediaRouter", "Ignoring attempt to add a route to a non-available connected route: " + xVarA3);
                    } else {
                        Log.w("AxMediaRouter", "Ignoring attempt to add a route to an unsupported group route:" + xVarA3);
                    }
                }
                n0Var.t(z12, !zE);
                if (zE) {
                    List listUnmodifiableList = Collections.unmodifiableList(o0Var.f1762j.J.f11756v);
                    for (o9.b0 b0Var5 : Collections.unmodifiableList(n0Var.f1734u.f11756v)) {
                        if (listUnmodifiableList.contains(b0Var5) != z12) {
                            h0 h0Var2 = (h0) o0Var.f1762j.W.get(b0Var5.f11739c);
                            if (h0Var2 instanceof n0) {
                                ((n0) h0Var2).t(z12, true);
                            }
                        }
                    }
                }
                q0 q0Var2 = o0Var.f1762j;
                o9.b0 b0Var6 = n0Var.f1734u;
                List listUnmodifiableList2 = Collections.unmodifiableList(q0Var2.J.f11756v);
                int iMax2 = Math.max(1, listUnmodifiableList2.size());
                if (b0Var6.e()) {
                    Iterator it = Collections.unmodifiableList(b0Var6.f11756v).iterator();
                    while (it.hasNext()) {
                        if (listUnmodifiableList2.contains((o9.b0) it.next()) != z12) {
                            iMax2 += !zS ? 1 : -1;
                        }
                    }
                } else {
                    iMax2 += zS ? -1 : 1;
                }
                boolean z13 = q0Var2.f1786t0 && Collections.unmodifiableList(q0Var2.J.f11756v).size() > 1;
                boolean z14 = q0Var2.f1786t0 && iMax2 >= 2;
                if (z13 != z14) {
                    f1 f1VarH = q0Var2.T.H(0);
                    if (f1VarH instanceof k0) {
                        k0 k0Var = (k0) f1VarH;
                        o0Var.a(k0Var.f2275a, z14 ? k0Var.f1747z : 0);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
