package d;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.internal.measurement.b5;
import java.util.List;
import s10.w0;
import z4.k1;

public final class w extends v {
    @Override
    public void a(h0 h0Var, h0 h0Var2, Window window, View view, boolean z10, boolean z11) {
        kotlin.jvm.internal.m.e(h0Var, "statusBarStyle");
        kotlin.jvm.internal.m.e(h0Var2, "navigationBarStyle");
        kotlin.jvm.internal.m.e(window, "window");
        kotlin.jvm.internal.m.e(view, "view");
        b5.M(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        int iA = h0Var.a(z10);
        int iA2 = h0Var2.a(z11);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int i10 = 0;
            while (true) {
                if (!(i10 < viewGroup.getChildCount())) {
                    if (iA != 0 || iA2 != 0) {
                        List listS = va.a.S(new c5.a(2, iA), new c5.a(1, iA2), new c5.a(4, iA2), new c5.a(8, iA2));
                        c5.d dVar = new c5.d(((ViewGroup) view).getContext(), listS);
                        dVar.setTag(listS);
                        viewGroup.addView(dVar);
                        break;
                    }
                    break;
                }
                int i11 = i10 + 1;
                View childAt = viewGroup.getChildAt(i10);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                Object tag = childAt.getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof c5.a)) {
                        for (Object obj : (Iterable) tag) {
                            if ((obj instanceof c5.a ? (c5.a) obj : null) != null) {
                                c5.a aVar = (c5.a) obj;
                                int i12 = aVar.f2859a;
                                c5.b bVar = aVar.f2860b;
                                ColorDrawable colorDrawable = aVar.f2864f;
                                if (i12 == 1) {
                                    aVar.f2865g = true;
                                    if (aVar.f2866h != iA2) {
                                        aVar.f2866h = iA2;
                                        colorDrawable.setColor(iA2);
                                        bVar.f2871e = colorDrawable;
                                        l9.f0 f0Var = bVar.f2875i;
                                        if (f0Var != null) {
                                            ((View) f0Var.C).setBackground(colorDrawable);
                                        }
                                    }
                                } else if (i12 == 2) {
                                    aVar.f2865g = true;
                                    if (aVar.f2866h != iA) {
                                        aVar.f2866h = iA;
                                        colorDrawable.setColor(iA);
                                        bVar.f2871e = colorDrawable;
                                        l9.f0 f0Var2 = bVar.f2875i;
                                        if (f0Var2 != null) {
                                            ((View) f0Var2.C).setBackground(colorDrawable);
                                        }
                                    }
                                } else if (i12 == 4) {
                                    aVar.f2865g = true;
                                    if (aVar.f2866h != iA2) {
                                        aVar.f2866h = iA2;
                                        colorDrawable.setColor(iA2);
                                        bVar.f2871e = colorDrawable;
                                        l9.f0 f0Var3 = bVar.f2875i;
                                        if (f0Var3 != null) {
                                            ((View) f0Var3.C).setBackground(colorDrawable);
                                        }
                                    }
                                } else if (i12 == 8) {
                                    aVar.f2865g = true;
                                    if (aVar.f2866h != iA2) {
                                        aVar.f2866h = iA2;
                                        colorDrawable.setColor(iA2);
                                        bVar.f2871e = colorDrawable;
                                        l9.f0 f0Var4 = bVar.f2875i;
                                        if (f0Var4 != null) {
                                            ((View) f0Var4.C).setBackground(colorDrawable);
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    }
                }
                i10 = i11;
            }
        }
        window.setNavigationBarContrastEnforced(false);
        wb.o oVar = new wb.o(view);
        w0 k1Var = Build.VERSION.SDK_INT >= 35 ? new k1(window, oVar) : new w0(window, oVar);
        k1Var.t(!z10);
        k1Var.s(!z11);
    }
}
