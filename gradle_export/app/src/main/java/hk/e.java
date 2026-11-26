package hk;

import ek.g;
import java.sql.Timestamp;
import java.util.Date;

public final class e extends g {

    public final int f7075b;

    public e(int i10, Class cls) {
        super(cls);
        this.f7075b = i10;
    }

    @Override
    public final Date a(Date date) {
        switch (this.f7075b) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
