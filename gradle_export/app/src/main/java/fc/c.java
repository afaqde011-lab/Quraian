package fc;

import java.util.List;

public final class c implements b {
    public final List A;
    public pc.a C = null;
    public float D = -1.0f;
    public pc.a B = a(0.0f);

    public c(List list) {
        this.A = list;
    }

    public final pc.a a(float f3) {
        List list = this.A;
        pc.a aVar = (pc.a) list.get(list.size() - 1);
        if (f3 >= aVar.b()) {
            return aVar;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            pc.a aVar2 = (pc.a) list.get(size);
            if (this.B != aVar2 && f3 >= aVar2.b() && f3 < aVar2.a()) {
                return aVar2;
            }
        }
        return (pc.a) list.get(0);
    }

    @Override
    public final boolean c(float f3) {
        pc.a aVar = this.C;
        pc.a aVar2 = this.B;
        if (aVar == aVar2 && this.D == f3) {
            return true;
        }
        this.C = aVar2;
        this.D = f3;
        return false;
    }

    @Override
    public final pc.a d() {
        return this.B;
    }

    @Override
    public final boolean e(float f3) {
        pc.a aVar = this.B;
        if (f3 >= aVar.b() && f3 < aVar.a()) {
            return !this.B.c();
        }
        this.B = a(f3);
        return true;
    }

    @Override
    public final float i() {
        List list = this.A;
        return ((pc.a) list.get(list.size() - 1)).a();
    }

    @Override
    public final boolean isEmpty() {
        return false;
    }

    @Override
    public final float k() {
        return ((pc.a) this.A.get(0)).b();
    }
}
