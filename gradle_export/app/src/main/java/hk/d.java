package hk;

import bk.a0;
import java.sql.Timestamp;
import java.util.Date;

public final class d extends a0 {

    public static final c f7073b = new c();

    public final a0 f7074a;

    public d(a0 a0Var) {
        this.f7074a = a0Var;
    }

    @Override
    public final Object b(ik.a aVar) {
        Date date = (Date) this.f7074a.b(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override
    public final void c(ik.b bVar, Object obj) {
        this.f7074a.c(bVar, (Timestamp) obj);
    }
}
