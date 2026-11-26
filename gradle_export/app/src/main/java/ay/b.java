package ay;

import b3.l0;
import ba.m;
import e30.w;
import g00.q;
import j3.s;
import java.io.File;
import java.util.Comparator;
import java.util.Map;
import ld.h;
import r00.i;
import r30.r;
import u.b0;
import u00.k;

public final class b implements Comparator {
    public final int A;
    public final Object B;

    public b(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    public b(Comparator comparator) {
        this.A = 3;
        this.B = comparator;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        String strP0;
        String strP1;
        switch (this.A) {
            case 0:
                int iCompare = ((a) this.B).compare(obj, obj2);
                return iCompare != 0 ? iCompare : p30.f.Z(Integer.valueOf(((cy.e) obj).b.ordinal()), Integer.valueOf(((cy.e) obj2).b.ordinal()));
            case 1:
                int iCompare2 = ((m) this.B).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : p30.f.Z((Comparable) ((Map.Entry) obj).getKey(), (Comparable) ((Map.Entry) obj2).getKey());
            case 2:
                w wVar = (w) obj;
                k kVar = (k) this.B;
                kotlin.jvm.internal.m.b(wVar);
                String string = kVar.invoke(wVar).toString();
                w wVar2 = (w) obj2;
                kotlin.jvm.internal.m.b(wVar2);
                return p30.f.Z(string, kVar.invoke(wVar2).toString());
            case 3:
                int iCompare3 = ((Comparator) this.B).compare(obj, obj2);
                if (iCompare3 != 0) {
                    return iCompare3;
                }
                return l0.u0.compare(((s) obj).c, ((s) obj2).c);
            case 4:
                int iCompare4 = ((b) this.B).compare(obj, obj2);
                return iCompare4 != 0 ? iCompare4 : p30.f.Z(Integer.valueOf(((s) obj).f), Integer.valueOf(((s) obj2).f));
            case 5:
                File file = (File) obj;
                kotlin.jvm.internal.m.b(file);
                String strA0 = i.a0(file);
                StringBuilder sb = new StringBuilder();
                h hVar = (h) this.B;
                sb.append(hVar.b);
                sb.append('-');
                String strV0 = r.v0(strA0, sb.toString(), "");
                int iI0 = r30.k.I0(strV0, '-', 0, 6);
                if (iI0 >= 0) {
                    StringBuilder sb2 = new StringBuilder();
                    String strSubstring = strV0.substring(0, iI0);
                    kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                    sb2.append(r30.k.P0(10, strSubstring));
                    String strSubstring2 = strV0.substring(iI0);
                    kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
                    sb2.append(strSubstring2);
                    strP0 = sb2.toString();
                } else {
                    strP0 = r30.k.P0(10, strV0);
                }
                File file2 = (File) obj2;
                kotlin.jvm.internal.m.b(file2);
                String strV1 = r.v0(i.a0(file2), hVar.b + '-', "");
                int iI1 = r30.k.I0(strV1, '-', 0, 6);
                if (iI1 >= 0) {
                    StringBuilder sb3 = new StringBuilder();
                    String strSubstring3 = strV1.substring(0, iI1);
                    kotlin.jvm.internal.m.d(strSubstring3, "substring(...)");
                    sb3.append(r30.k.P0(10, strSubstring3));
                    String strSubstring4 = strV1.substring(iI1);
                    kotlin.jvm.internal.m.d(strSubstring4, "substring(...)");
                    sb3.append(strSubstring4);
                    strP1 = sb3.toString();
                } else {
                    strP1 = r30.k.P0(10, strV1);
                }
                return p30.f.Z(strP0, strP1);
            case 6:
                h00.a aVar = (h00.a) this.B;
                return p30.f.Z((Comparable) aVar.invoke(obj), (Comparable) aVar.invoke(obj2));
            case 7:
                int iCompare5 = ((m) this.B).compare(obj, obj2);
                return iCompare5 != 0 ? iCompare5 : p30.f.Z((Comparable) ((q) obj).B, (Comparable) ((q) obj2).B);
            case 8:
                int iCompare6 = ((b) this.B).compare(obj, obj2);
                return iCompare6 != 0 ? iCompare6 : p30.f.Z((Comparable) ((q) obj).C, (Comparable) ((q) obj2).C);
            case 9:
                int iCompare7 = ((m) this.B).compare(obj, obj2);
                return iCompare7 != 0 ? iCompare7 : p30.f.Z((Comparable) ((g00.k) obj).B, (Comparable) ((g00.k) obj2).B);
            case 10:
                int iCompare8 = ((m) this.B).compare(obj, obj2);
                return iCompare8 != 0 ? iCompare8 : p30.f.Z((Comparable) ((q) obj).B, (Comparable) ((q) obj2).B);
            case 11:
                int iCompare9 = ((b) this.B).compare(obj, obj2);
                return iCompare9 != 0 ? iCompare9 : p30.f.Z((Comparable) ((q) obj).C, (Comparable) ((q) obj2).C);
            default:
                b0 b0Var = (b0) this.B;
                return p30.f.Z(Float.valueOf(b0Var.c(((Map.Entry) obj2).getKey())), Float.valueOf(b0Var.c(((Map.Entry) obj).getKey())));
        }
    }
}
