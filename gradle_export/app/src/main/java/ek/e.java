package ek;

import com.google.gson.reflect.TypeToken;
import java.util.Date;

public class e implements bk.b0 {
    @Override
    public final bk.a0 a(bk.m mVar, TypeToken typeToken) {
        if (typeToken.getRawType() == Date.class) {
            return new h(g.f5427a);
        }
        return null;
    }

    public final String toString() {
        return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
    }
}
