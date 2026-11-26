package r0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.google.android.gms.cast.Cast;
import g00.b0;
import l1.g0;
import l1.j;
import m3.q0;
import t0.g;
import u00.q;
import v0.i;
import x0.e;

public final class a implements q {
    public final int A;

    public final Object t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10;
        int i11;
        switch (this.A) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                long j9 = ((q0) obj5).f10520a;
                String string = ((CharSequence) obj4).subSequence(q0.g(j9), q0.f(j9)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
            case 1:
                g gVar = (g) obj;
                e eVar = (e) obj2;
                u00.a aVar = (u00.a) obj3;
                j jVar = (j) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                if ((iIntValue & 6) == 0) {
                    i10 = ((iIntValue & 8) == 0 ? ((g0) jVar).g(gVar) : ((g0) jVar).i(gVar) ? 4 : 2) | iIntValue;
                } else {
                    i10 = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i10 |= (iIntValue & 64) == 0 ? ((g0) jVar).g(eVar) : ((g0) jVar).i(eVar) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i10 |= ((g0) jVar).i(aVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
                }
                g0 g0Var = (g0) jVar;
                if (g0Var.S(i10 & 1, (i10 & 1171) != 1170)) {
                    i.c(gVar, eVar, aVar, jVar, i10 & 1022);
                } else {
                    g0Var.V();
                }
                break;
            default:
                g gVar2 = (g) obj;
                e eVar2 = (e) obj2;
                u00.a aVar2 = (u00.a) obj3;
                j jVar2 = (j) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i11 = ((iIntValue2 & 8) == 0 ? ((g0) jVar2).g(gVar2) : ((g0) jVar2).i(gVar2) ? 4 : 2) | iIntValue2;
                } else {
                    i11 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i11 |= (iIntValue2 & 64) == 0 ? ((g0) jVar2).g(eVar2) : ((g0) jVar2).i(eVar2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i11 |= ((g0) jVar2).i(aVar2) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
                }
                g0 g0Var2 = (g0) jVar2;
                if (g0Var2.S(i11 & 1, (i11 & 1171) != 1170)) {
                    i.c(gVar2, eVar2, aVar2, jVar2, i11 & 1022);
                } else {
                    g0Var2.V();
                }
                break;
        }
        return b0.a;
    }
}
