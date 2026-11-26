package qd;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

public final class e {

    public String f12870a;

    public ArrayList f12871b;

    public boolean f12872c;

    public c7.g f12873d;

    public final g a() {
        com.google.android.gms.internal.play_billing.r rVarM;
        ArrayList arrayList = this.f12871b;
        if (arrayList == null || arrayList.isEmpty()) {
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
        ArrayList arrayList2 = this.f12871b;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((f) it.next()) == null) {
                    throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                }
            }
        }
        g gVar = new g();
        gVar.f12884a = !((f) this.f12871b.get(0)).f12878a.f12950b.optString("packageName").isEmpty();
        gVar.f12885b = this.f12870a;
        c7.g gVar2 = this.f12873d;
        boolean z10 = (TextUtils.isEmpty((String) gVar2.f2906c) && TextUtils.isEmpty(null)) ? false : true;
        boolean zIsEmpty = TextUtils.isEmpty(null);
        if (z10 && !zIsEmpty) {
            throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        }
        if (!gVar2.f2905b && !z10 && zIsEmpty) {
            throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        a2.n nVar = new a2.n();
        nVar.f166a = (String) gVar2.f2906c;
        nVar.f167b = gVar2.f2904a;
        gVar.f12886c = nVar;
        gVar.f12888e = new ArrayList();
        gVar.f12889f = this.f12872c;
        ArrayList arrayList3 = this.f12871b;
        if (arrayList3 != null) {
            rVarM = com.google.android.gms.internal.play_billing.r.m(arrayList3);
        } else {
            com.google.android.gms.internal.play_billing.o oVar = com.google.android.gms.internal.play_billing.r.B;
            rVarM = com.google.android.gms.internal.play_billing.v.E;
        }
        gVar.f12887d = rVarM;
        return gVar;
    }
}
