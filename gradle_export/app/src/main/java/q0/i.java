package q0;

public final class i implements a1.r {

    public final int f12622a;

    public final Object f12623b;

    public i(Object obj, int i10) {
        this.f12622a = i10;
        this.f12623b = obj;
    }

    @Override
    public final int a(int i10, int i11) {
        int i12 = this.f12622a;
        Object obj = this.f12623b;
        switch (i12) {
            case 0:
                return ((Character) ((l1.z0) obj).getValue()).charValue();
            default:
                n1 n1Var = (n1) obj;
                return i10 == ((l1.f1) n1Var.f12667b.B).h() ? i11 : ((Character) n1Var.f12666a.getValue()).charValue();
        }
    }
}
