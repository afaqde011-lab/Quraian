package ba;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class b0 implements Runnable {
    public final int A;
    public final RecyclerView B;

    public b0(RecyclerView recyclerView, int i10) {
        this.A = i10;
        this.B = recyclerView;
    }

    @Override
    public final void run() {
        boolean z10;
        int i10 = this.A;
        RecyclerView recyclerView = this.B;
        switch (i10) {
            case 0:
                if (recyclerView.U && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.S) {
                        recyclerView.requestLayout();
                    } else if (recyclerView.f1861a0) {
                        recyclerView.W = true;
                    } else {
                        recyclerView.p();
                    }
                    break;
                }
                break;
            default:
                m0 m0Var = recyclerView.f1876o0;
                if (m0Var != null) {
                    h hVar = (h) m0Var;
                    long j9 = hVar.f2350d;
                    ArrayList<f1> arrayList = hVar.f2299h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = hVar.f2301j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = hVar.f2302k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = hVar.f2300i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        z10 = false;
                    } else {
                        for (f1 f1Var : arrayList) {
                            View view = f1Var.f2275a;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            hVar.f2306q.add(f1Var);
                            viewPropertyAnimatorAnimate.setDuration(j9).alpha(0.0f).setListener(new c(hVar, f1Var, viewPropertyAnimatorAnimate, view)).start();
                            arrayList = arrayList;
                            zIsEmpty = zIsEmpty;
                        }
                        boolean z11 = zIsEmpty;
                        arrayList.clear();
                        if (!zIsEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            hVar.m.add(arrayList5);
                            arrayList2.clear();
                            b bVar = new b(hVar, arrayList5, 0);
                            if (z11) {
                                bVar.run();
                            } else {
                                View view2 = ((g) arrayList5.get(0)).f2292a.f2275a;
                                WeakHashMap weakHashMap = z4.j0.f17198a;
                                view2.postOnAnimationDelayed(bVar, j9);
                            }
                        }
                        if (!zIsEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            hVar.f2303n.add(arrayList6);
                            arrayList3.clear();
                            kh.r rVar = new kh.r(2, hVar, arrayList6, false);
                            if (z11) {
                                rVar.run();
                            } else {
                                View view3 = ((f) arrayList6.get(0)).f2268a.f2275a;
                                WeakHashMap weakHashMap2 = z4.j0.f17198a;
                                view3.postOnAnimationDelayed(rVar, j9);
                            }
                        }
                        if (zIsEmpty4) {
                            z10 = false;
                        } else {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            hVar.l.add(arrayList7);
                            arrayList4.clear();
                            b bVar2 = new b(hVar, arrayList7, 1);
                            if (z11 && zIsEmpty2 && zIsEmpty3) {
                                bVar2.run();
                                z10 = false;
                            } else {
                                if (z11) {
                                    j9 = 0;
                                }
                                long jMax = Math.max(!zIsEmpty2 ? hVar.f2351e : 0L, zIsEmpty3 ? 0L : hVar.f2352f) + j9;
                                z10 = false;
                                View view4 = ((f1) arrayList7.get(0)).f2275a;
                                WeakHashMap weakHashMap3 = z4.j0.f17198a;
                                view4.postOnAnimationDelayed(bVar2, jMax);
                            }
                        }
                    }
                } else {
                    z10 = false;
                }
                recyclerView.M0 = z10;
                break;
        }
    }
}
