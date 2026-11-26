package mb;

import java.util.Arrays;

public final class m {

    public final wb.i f10813a;

    public final u f10814b;

    public final lb.f f10815c;

    public m(wb.i iVar, u uVar, lb.f fVar) {
        this.f10813a = iVar;
        this.f10814b = uVar;
        this.f10815c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        wb.i iVar = mVar.f10813a;
        this.f10814b.getClass();
        wb.i iVar2 = this.f10813a;
        return (iVar2 == iVar || (kotlin.jvm.internal.m.a(iVar2.f15935a, iVar.f15935a) && iVar2.f15936b.equals(iVar.f15936b) && kotlin.jvm.internal.m.a(iVar2.f15938d, iVar.f15938d) && kotlin.jvm.internal.m.a(iVar2.f15939e, iVar.f15939e) && iVar2.f15940f == iVar.f15940f && kotlin.jvm.internal.m.a(iVar2.f15942h, iVar.f15942h) && kotlin.jvm.internal.m.a(iVar2.f15944j, iVar.f15944j) && iVar2.l == iVar.l && iVar2.m == iVar.m && iVar2.f15946n == iVar.f15946n && iVar2.f15947o == iVar.f15947o && iVar2.f15948p == iVar.f15948p && iVar2.f15949q == iVar.f15949q && iVar2.f15950r == iVar.f15950r && iVar2.f15956x.equals(iVar.f15956x) && iVar2.f15957y == iVar.f15957y && iVar2.f15941g == iVar.f15941g && iVar2.f15958z.equals(iVar.f15958z))) && this.f10815c.equals(mVar.f10815c);
    }

    public final int hashCode() {
        this.f10814b.getClass();
        wb.i iVar = this.f10813a;
        int iHashCode = (iVar.f15936b.hashCode() + (iVar.f15935a.hashCode() * 31)) * 961;
        ub.b bVar = iVar.f15938d;
        int iHashCode2 = (iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str = iVar.f15939e;
        return this.f10815c.hashCode() + ((iVar.f15958z.A.hashCode() + ((iVar.f15941g.hashCode() + ((iVar.f15957y.hashCode() + ((iVar.f15956x.hashCode() + ((iVar.f15950r.hashCode() + ((iVar.f15949q.hashCode() + ((iVar.f15948p.hashCode() + w.c.e(w.c.e(w.c.e(w.c.e((g4.c.a((iVar.f15940f.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 961, 31, iVar.f15942h) + Arrays.hashCode(iVar.f15944j.A)) * 31, 31, iVar.l), 31, iVar.m), 31, iVar.f15946n), 31, iVar.f15947o)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
