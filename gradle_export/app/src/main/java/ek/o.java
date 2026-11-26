package ek;

import com.google.gson.reflect.TypeToken;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class o implements bk.b0 {
    public final int A;
    public final Object B;

    public o(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    @Override
    public final bk.a0 a(bk.m mVar, TypeToken typeToken) {
        switch (this.A) {
            case 0:
                if (typeToken.getRawType() == Number.class) {
                    return (p) this.B;
                }
                return null;
            case 1:
                if (typeToken.getRawType() == Object.class) {
                    return new q(mVar, (bk.y) this.B);
                }
                return null;
            default:
                Class rawType = typeToken.getRawType();
                if (rawType == Calendar.class || rawType == GregorianCalendar.class) {
                    return (r0) this.B;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.A) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((r0) this.B) + "]";
            default:
                return super.toString();
        }
    }
}
