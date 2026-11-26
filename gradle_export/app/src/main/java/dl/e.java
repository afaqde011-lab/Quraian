package dl;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import c3.o0;
import g1.q0;
import g1.r0;
import g1.x5;
import l1.g0;
import l1.i;
import l1.j;
import l1.p2;
import l1.q;
import l1.r1;
import l1.t;

public abstract class e {
    public static final t a = new t(new a2.f(21));

    static {
        long j = a.a;
        long j2 = a.b;
        long j3 = a.c;
        long j4 = a.k;
        r0.c(j, 0L, 0L, 0L, 0L, j2, 0L, 0L, 0L, j3, 0L, 0L, 0L, j4, 0L, 0L, j4, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -74274, 65535);
    }

    public static final void a(boolean z, v1.c cVar, j jVar, int i) {
        boolean z2;
        q0 q0VarC;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1225331309);
        int i2 = i | 6;
        if (g0Var.S(i2 & 1, (i2 & 19) != 18)) {
            Configuration configuration = (Configuration) g0Var.k(o0.a);
            g0Var.c0(722355193);
            Context context = (Context) g0Var.k(o0.b);
            if (Build.VERSION.SDK_INT >= 34) {
                q0VarC = r0.c(x5.l(context, R.color.system_primary_dark), x5.l(context, R.color.system_on_primary_dark), x5.l(context, R.color.system_primary_container_dark), x5.l(context, R.color.system_on_primary_container_dark), x5.l(context, R.color.system_primary_light), x5.l(context, R.color.system_secondary_dark), x5.l(context, R.color.system_on_secondary_dark), x5.l(context, R.color.system_secondary_container_dark), x5.l(context, R.color.system_on_secondary_container_dark), x5.l(context, R.color.system_tertiary_dark), x5.l(context, R.color.system_on_tertiary_dark), x5.l(context, R.color.system_tertiary_container_dark), x5.l(context, R.color.system_on_tertiary_container_dark), x5.l(context, R.color.system_background_dark), x5.l(context, R.color.system_on_background_dark), x5.l(context, R.color.system_surface_dark), x5.l(context, R.color.system_on_surface_dark), x5.l(context, R.color.system_surface_variant_dark), x5.l(context, R.color.system_on_surface_variant_dark), x5.l(context, R.color.system_primary_dark), x5.l(context, R.color.system_surface_light), x5.l(context, R.color.system_on_surface_light), x5.l(context, R.color.system_outline_dark), x5.l(context, R.color.system_outline_variant_dark), 0L, x5.l(context, R.color.system_surface_bright_dark), x5.l(context, R.color.system_surface_container_dark), x5.l(context, R.color.system_surface_container_high_dark), x5.l(context, R.color.system_surface_container_highest_dark), x5.l(context, R.color.system_surface_container_low_dark), x5.l(context, R.color.system_surface_container_lowest_dark), x5.l(context, R.color.system_surface_dim_dark), x5.l(context, R.color.system_primary_fixed), x5.l(context, R.color.system_primary_fixed_dim), x5.l(context, R.color.system_on_primary_fixed), x5.l(context, R.color.system_on_primary_fixed_variant), x5.l(context, R.color.system_secondary_fixed), x5.l(context, R.color.system_secondary_fixed_dim), x5.l(context, R.color.system_on_secondary_fixed), x5.l(context, R.color.system_on_secondary_fixed_variant), x5.l(context, R.color.system_tertiary_fixed), x5.l(context, R.color.system_tertiary_fixed_dim), x5.l(context, R.color.system_on_tertiary_fixed), x5.l(context, R.color.system_on_tertiary_fixed_variant), 331350016, 0);
            } else {
                x5.l(context, R.color.system_neutral1_0);
                x5.l(context, R.color.system_neutral1_10);
                x5.o(98.0f, x5.l(context, R.color.system_neutral1_600));
                x5.o(96.0f, x5.l(context, R.color.system_neutral1_600));
                x5.l(context, R.color.system_neutral1_50);
                x5.o(94.0f, x5.l(context, R.color.system_neutral1_600));
                x5.o(92.0f, x5.l(context, R.color.system_neutral1_600));
                x5.l(context, R.color.system_neutral1_100);
                x5.o(87.0f, x5.l(context, R.color.system_neutral1_600));
                x5.l(context, R.color.system_neutral1_200);
                x5.l(context, R.color.system_neutral1_300);
                x5.l(context, R.color.system_neutral1_400);
                x5.l(context, R.color.system_neutral1_500);
                x5.l(context, R.color.system_neutral1_600);
                x5.l(context, R.color.system_neutral1_700);
                x5.o(24.0f, x5.l(context, R.color.system_neutral1_600));
                x5.o(22.0f, x5.l(context, R.color.system_neutral1_600));
                x5.l(context, R.color.system_neutral1_800);
                x5.o(17.0f, x5.l(context, R.color.system_neutral1_600));
                x5.o(12.0f, x5.l(context, R.color.system_neutral1_600));
                x5.l(context, R.color.system_neutral1_900);
                x5.o(6.0f, x5.l(context, R.color.system_neutral1_600));
                x5.o(4.0f, x5.l(context, R.color.system_neutral1_600));
                x5.l(context, R.color.system_neutral1_1000);
                x5.l(context, R.color.system_neutral2_0);
                x5.l(context, R.color.system_neutral2_10);
                x5.o(98.0f, x5.l(context, R.color.system_neutral2_600));
                x5.o(96.0f, x5.l(context, R.color.system_neutral2_600));
                x5.l(context, R.color.system_neutral2_50);
                x5.o(94.0f, x5.l(context, R.color.system_neutral2_600));
                x5.o(92.0f, x5.l(context, R.color.system_neutral2_600));
                long jL = x5.l(context, R.color.system_neutral2_100);
                x5.o(87.0f, x5.l(context, R.color.system_neutral2_600));
                long jL2 = x5.l(context, R.color.system_neutral2_200);
                x5.l(context, R.color.system_neutral2_300);
                long jL3 = x5.l(context, R.color.system_neutral2_400);
                x5.l(context, R.color.system_neutral2_500);
                x5.l(context, R.color.system_neutral2_600);
                long jL4 = x5.l(context, R.color.system_neutral2_700);
                long jO = x5.o(24.0f, x5.l(context, R.color.system_neutral2_600));
                long jO2 = x5.o(22.0f, x5.l(context, R.color.system_neutral2_600));
                long jL5 = x5.l(context, R.color.system_neutral2_800);
                long jO3 = x5.o(17.0f, x5.l(context, R.color.system_neutral2_600));
                long jO4 = x5.o(12.0f, x5.l(context, R.color.system_neutral2_600));
                long jL6 = x5.l(context, R.color.system_neutral2_900);
                long jO5 = x5.o(6.0f, x5.l(context, R.color.system_neutral2_600));
                long jO6 = x5.o(4.0f, x5.l(context, R.color.system_neutral2_600));
                long jL7 = x5.l(context, R.color.system_neutral2_1000);
                x5.l(context, R.color.system_accent1_0);
                x5.l(context, R.color.system_accent1_10);
                x5.l(context, R.color.system_accent1_50);
                long jL8 = x5.l(context, R.color.system_accent1_100);
                long jL9 = x5.l(context, R.color.system_accent1_200);
                x5.l(context, R.color.system_accent1_300);
                x5.l(context, R.color.system_accent1_400);
                x5.l(context, R.color.system_accent1_500);
                long jL10 = x5.l(context, R.color.system_accent1_600);
                long jL11 = x5.l(context, R.color.system_accent1_700);
                long jL12 = x5.l(context, R.color.system_accent1_800);
                long jL13 = x5.l(context, R.color.system_accent1_900);
                x5.l(context, R.color.system_accent1_1000);
                x5.l(context, R.color.system_accent2_0);
                x5.l(context, R.color.system_accent2_10);
                x5.l(context, R.color.system_accent2_50);
                long jL14 = x5.l(context, R.color.system_accent2_100);
                long jL15 = x5.l(context, R.color.system_accent2_200);
                x5.l(context, R.color.system_accent2_300);
                x5.l(context, R.color.system_accent2_400);
                x5.l(context, R.color.system_accent2_500);
                x5.l(context, R.color.system_accent2_600);
                long jL16 = x5.l(context, R.color.system_accent2_700);
                long jL17 = x5.l(context, R.color.system_accent2_800);
                long jL18 = x5.l(context, R.color.system_accent2_900);
                x5.l(context, R.color.system_accent2_1000);
                x5.l(context, R.color.system_accent3_0);
                x5.l(context, R.color.system_accent3_10);
                x5.l(context, R.color.system_accent3_50);
                long jL19 = x5.l(context, R.color.system_accent3_100);
                long jL20 = x5.l(context, R.color.system_accent3_200);
                x5.l(context, R.color.system_accent3_300);
                x5.l(context, R.color.system_accent3_400);
                x5.l(context, R.color.system_accent3_500);
                x5.l(context, R.color.system_accent3_600);
                long jL21 = x5.l(context, R.color.system_accent3_700);
                long jL22 = x5.l(context, R.color.system_accent3_800);
                long jL23 = x5.l(context, R.color.system_accent3_900);
                x5.l(context, R.color.system_accent3_1000);
                q0VarC = r0.c(jL9, jL12, jL11, jL8, jL10, jL15, jL17, jL16, jL14, jL20, jL22, jL21, jL19, jO5, jL, jO5, jL, jL4, jL2, jL9, jL, jL5, jL3, jL4, jL7, jO, jO4, jO3, jO2, jL6, jO6, jO5, jL8, jL9, jL13, jL11, jL14, jL15, jL18, jL16, jL19, jL20, jL23, jL21, 62914560, 0);
            }
            g0Var.r(false);
            boolean zE = g0Var.e(configuration.screenWidthDp);
            Object objN = g0Var.N();
            if (zE || objN == i.a) {
                objN = q.r(new bs.i(configuration, 1));
                g0Var.n0(objN);
            }
            q.a(a.a((gm.a) ((p2) objN).getValue()), v1.d.d(862066477, new al.i((Object) q0VarC, cVar, 8), g0Var), g0Var, 56);
            z2 = true;
        } else {
            g0Var.V();
            z2 = z;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new d(z2, cVar, i);
        }
    }
}
