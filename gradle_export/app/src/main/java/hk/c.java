package hk;

import bk.a0;
import bk.b0;
import bk.m;
import com.google.gson.reflect.TypeToken;
import java.sql.Timestamp;
import java.util.Date;

public class c implements b0 {
    @Override
    public final a0 a(m mVar, TypeToken typeToken) {
        if (typeToken.getRawType() != Timestamp.class) {
            return null;
        }
        mVar.getClass();
        return new d(mVar.f(TypeToken.get(Date.class)));
    }
}
