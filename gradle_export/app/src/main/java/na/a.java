package na;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.Closeable;
import o9.q;
import oa.i;

public interface a extends Closeable {
    boolean B();

    void D(Object[] objArr);

    void E();

    void H();

    void P();

    Cursor X(q qVar);

    boolean Y();

    boolean g();

    int g0(ContentValues contentValues, Object[] objArr);

    boolean isOpen();

    void k();

    void n();

    void o(String str);

    i q(String str);

    void u();
}
