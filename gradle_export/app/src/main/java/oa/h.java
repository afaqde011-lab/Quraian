package oa;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.m;

public class h implements na.d {
    public final SQLiteProgram A;

    public h(SQLiteProgram sQLiteProgram) {
        m.e(sQLiteProgram, "delegate");
        this.A = sQLiteProgram;
    }

    @Override
    public final void U(double d3, int i10) {
        this.A.bindDouble(i10, d3);
    }

    @Override
    public final void close() {
        this.A.close();
    }

    @Override
    public final void d(int i10, long j9) {
        this.A.bindLong(i10, j9);
    }

    @Override
    public final void e(int i10, byte[] bArr) {
        this.A.bindBlob(i10, bArr);
    }

    @Override
    public final void f(int i10) {
        this.A.bindNull(i10);
    }

    @Override
    public final void h() {
        this.A.clearBindings();
    }

    @Override
    public final void p(int i10, String str) {
        m.e(str, "value");
        this.A.bindString(i10, str);
    }
}
