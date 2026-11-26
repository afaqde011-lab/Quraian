package a8;

import androidx.media3.common.u0;
import androidx.media3.common.v0;
import fh.q0;
import fh.r0;
import fh.t0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class y {

    public static final Pattern f323c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    public int f324a = -1;

    public int f325b = -1;

    public final boolean a(String str) {
        Matcher matcher = f323c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = e7.i0.f5136a;
            int i10 = Integer.parseInt(strGroup, 16);
            int i11 = Integer.parseInt(matcher.group(2), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.f324a = i10;
            this.f325b = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(v0 v0Var) {
        u0 u0Var;
        v0Var.getClass();
        q0 q0VarM = t0.m();
        u0[] u0VarArr = v0Var.f1660a;
        int length = u0VarArr.length;
        int i10 = 0;
        while (true) {
            u0 u0Var2 = null;
            if (i10 >= length) {
                break;
            }
            u0 u0Var3 = u0VarArr[i10];
            if (o8.e.class.isAssignableFrom(u0Var3.getClass())) {
                u0 u0Var4 = (u0) o8.e.class.cast(u0Var3);
                if (((o8.e) u0Var4).f11701c.equals("iTunSMPB")) {
                    u0Var2 = u0Var4;
                }
            }
            if (u0Var2 != null) {
                q0VarM.c(u0Var2);
            }
            i10++;
        }
        r0 r0VarListIterator = q0VarM.g().listIterator(0);
        while (r0VarListIterator.hasNext()) {
            if (a(((o8.e) r0VarListIterator.next()).f11702d)) {
                return;
            }
        }
        q0 q0VarM2 = t0.m();
        for (u0 u0Var5 : u0VarArr) {
            if (o8.l.class.isAssignableFrom(u0Var5.getClass())) {
                u0Var = (u0) o8.l.class.cast(u0Var5);
                o8.l lVar = (o8.l) u0Var;
                if (!(lVar.f11714b.equals("com.apple.iTunes") && lVar.f11715c.equals("iTunSMPB"))) {
                    u0Var = null;
                }
            } else {
                u0Var = null;
            }
            if (u0Var != null) {
                q0VarM2.c(u0Var);
            }
        }
        r0 r0VarListIterator2 = q0VarM2.g().listIterator(0);
        while (r0VarListIterator2.hasNext() && !a(((o8.l) r0VarListIterator2.next()).f11716d)) {
        }
    }
}
