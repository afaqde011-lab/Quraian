package fa;

import g00.j;
import kotlin.jvm.internal.m;

public abstract class a {

    public final int f5578a;

    public final int f5579b;

    public a(int i10, int i11) {
        this.f5578a = i10;
        this.f5579b = i11;
    }

    public void a(ma.a aVar) throws j {
        m.e(aVar, "connection");
        if (!(aVar instanceof pa.a)) {
            throw new j("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        b(((pa.a) aVar).A);
    }

    public void b(na.a aVar) throws j {
        m.e(aVar, "db");
        throw new j("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
