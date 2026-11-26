package c5;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import l9.f0;

public final class c {

    public final ArrayList f2876a = new ArrayList();

    public final g f2877b;

    public q4.b f2878c;

    public q4.b f2879d;

    public int f2880e;

    public boolean f2881f;

    public c(g gVar, ArrayList arrayList) {
        q4.b bVar = q4.b.f12754e;
        this.f2878c = bVar;
        this.f2879d = bVar;
        a(arrayList, false);
        a(arrayList, true);
        ArrayList arrayList2 = gVar.f2883b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            q4.b bVar2 = gVar.f2884c;
            q4.b bVar3 = gVar.f2885d;
            this.f2878c = bVar2;
            this.f2879d = bVar3;
            c();
            b(gVar.f2886e);
        }
        this.f2877b = gVar;
    }

    public final void a(List list, boolean z10) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) list.get(i10);
            aVar.getClass();
            if (true == z10) {
                c cVar = aVar.f2863e;
                if (cVar != null) {
                    throw new IllegalStateException(aVar + " (" + (i10 + 1) + "/" + size + ") is already controlled by " + cVar + " but is still added to " + this);
                }
                aVar.f2863e = this;
                this.f2876a.add(aVar);
            }
        }
    }

    public final void b(int i10) {
        ArrayList arrayList = this.f2876a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            if (!aVar.f2865g) {
                ColorDrawable colorDrawable = aVar.f2864f;
                if (aVar.f2866h != i10) {
                    aVar.f2866h = i10;
                    colorDrawable.setColor(i10);
                    b bVar = aVar.f2860b;
                    bVar.f2871e = colorDrawable;
                    f0 f0Var = bVar.f2875i;
                    if (f0Var != null) {
                        ((View) f0Var.C).setBackground(colorDrawable);
                    }
                }
            }
        }
    }

    public final void c() {
        int i10;
        q4.b bVarC;
        ArrayList arrayList = this.f2876a;
        q4.b bVar = q4.b.f12754e;
        q4.b bVarA = bVar;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            q4.b bVar2 = this.f2878c;
            q4.b bVar3 = this.f2879d;
            aVar.f2861c = bVar2;
            b bVar4 = aVar.f2860b;
            aVar.f2862d = bVar3;
            if (!bVar4.f2869c.equals(bVarA)) {
                bVar4.f2869c = bVarA;
                f0 f0Var = bVar4.f2875i;
                if (f0Var != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f0Var.B;
                    layoutParams.leftMargin = bVarA.f12755a;
                    layoutParams.topMargin = bVarA.f12756b;
                    layoutParams.rightMargin = bVarA.f12757c;
                    layoutParams.bottomMargin = bVarA.f12758d;
                    ((View) f0Var.C).setLayoutParams(layoutParams);
                }
            }
            int i11 = aVar.f2859a;
            if (i11 == 1) {
                i10 = aVar.f2861c.f12755a;
                int i12 = aVar.f2862d.f12755a;
                if (bVar4.f2867a != i12) {
                    bVar4.f2867a = i12;
                    f0 f0Var2 = bVar4.f2875i;
                    if (f0Var2 != null) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) f0Var2.B;
                        layoutParams2.width = i12;
                        ((View) f0Var2.C).setLayoutParams(layoutParams2);
                    }
                }
                bVarC = q4.b.c(i10, 0, 0, 0);
            } else if (i11 == 2) {
                i10 = aVar.f2861c.f12756b;
                int i13 = aVar.f2862d.f12756b;
                if (bVar4.f2868b != i13) {
                    bVar4.f2868b = i13;
                    f0 f0Var3 = bVar4.f2875i;
                    if (f0Var3 != null) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) f0Var3.B;
                        layoutParams3.height = i13;
                        ((View) f0Var3.C).setLayoutParams(layoutParams3);
                    }
                }
                bVarC = q4.b.c(0, i10, 0, 0);
            } else if (i11 == 4) {
                i10 = aVar.f2861c.f12757c;
                int i14 = aVar.f2862d.f12757c;
                if (bVar4.f2867a != i14) {
                    bVar4.f2867a = i14;
                    f0 f0Var4 = bVar4.f2875i;
                    if (f0Var4 != null) {
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) f0Var4.B;
                        layoutParams4.width = i14;
                        ((View) f0Var4.C).setLayoutParams(layoutParams4);
                    }
                }
                bVarC = q4.b.c(0, 0, i10, 0);
            } else if (i11 != 8) {
                bVarC = bVar;
                i10 = 0;
            } else {
                i10 = aVar.f2861c.f12758d;
                int i15 = aVar.f2862d.f12758d;
                if (bVar4.f2868b != i15) {
                    bVar4.f2868b = i15;
                    f0 f0Var5 = bVar4.f2875i;
                    if (f0Var5 != null) {
                        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) f0Var5.B;
                        layoutParams5.height = i15;
                        ((View) f0Var5.C).setLayoutParams(layoutParams5);
                    }
                }
                bVarC = q4.b.c(0, 0, 0, i10);
            }
            boolean z10 = i10 > 0;
            if (bVar4.f2870d != z10) {
                bVar4.f2870d = z10;
                f0 f0Var6 = bVar4.f2875i;
                if (f0Var6 != null) {
                    ((View) f0Var6.C).setVisibility(z10 ? 0 : 8);
                }
            }
            float f3 = 0.0f;
            aVar.a(i10 > 0 ? 1.0f : 0.0f);
            if (i10 > 0) {
                f3 = 1.0f;
            }
            aVar.b(f3);
            bVarA = q4.b.a(bVarA, bVarC);
        }
    }
}
