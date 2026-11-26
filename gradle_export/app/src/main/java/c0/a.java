package c0;

import com.google.android.gms.cast.Cast;
import g00.b0;
import l1.g0;
import l1.j;
import u00.o;
import u00.t;

public final class a implements t {
    public final Object d(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, Object obj5, Integer num) {
        int i10;
        String str = (String) obj;
        boolean zBooleanValue = bool.booleanValue();
        c cVar = (c) obj2;
        o oVar = (o) obj3;
        u00.a aVar = (u00.a) obj4;
        j jVar = (j) obj5;
        int iIntValue = num.intValue();
        int i11 = iIntValue & 6;
        b2.o oVar2 = b2.o.A;
        if (i11 == 0) {
            i10 = (((g0) jVar).g(oVar2) ? 4 : 2) | iIntValue;
        } else {
            i10 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i10 |= ((g0) jVar).g(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i10 |= ((g0) jVar).h(zBooleanValue) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((iIntValue & 3072) == 0) {
            i10 |= ((g0) jVar).g(cVar) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i10 |= ((g0) jVar).i(oVar) ? 16384 : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i10 |= ((g0) jVar).i(aVar) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        g0 g0Var = (g0) jVar;
        if (g0Var.S(i10 & 1, (599187 & i10) != 599186)) {
            i.c(str, zBooleanValue, cVar, oVar2, oVar, aVar, jVar, (i10 & 458752) | ((i10 >> 3) & 1022) | ((i10 << 9) & 7168) | (57344 & i10));
        } else {
            g0Var.V();
        }
        return b0.a;
    }
}
