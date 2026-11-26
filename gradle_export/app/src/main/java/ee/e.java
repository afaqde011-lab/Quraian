package ee;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.common.q0;
import k9.a2;
import k9.m;
import k9.n3;
import k9.p0;
import k9.s1;
import k9.t0;

public final class e implements f, p0, n3 {
    public final long A;
    public final Object B;

    public e(long j9, xd.i iVar) {
        this.A = j9;
        this.B = iVar;
    }

    public e(Object obj, long j9) {
        this.B = obj;
        this.A = j9;
    }

    @Override
    public Object apply(Object obj) {
        xd.i iVar = (xd.i) this.B;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.A));
        String str = iVar.f16547a;
        ud.d dVar = iVar.f16549c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(he.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.f16547a);
            contentValues.put("priority", Integer.valueOf(he.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override
    public void b(m mVar, int i10) {
        t0 t0Var = (t0) this.B;
        mVar.t1(t0Var.f9440c, i10, this.A);
    }

    @Override
    public Object d(s1 s1Var, a2 a2Var, int i10) {
        return s1Var.B(a2Var, fh.t0.s((q0) this.B), 0, this.A);
    }
}
