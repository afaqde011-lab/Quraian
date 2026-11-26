package yd;

import android.content.Context;
import com.google.android.gms.internal.measurement.x5;

public final class b extends c {

    public final Context f16854a;

    public final ge.a f16855b;

    public final ge.a f16856c;

    public final String f16857d;

    public b(Context context, ge.a aVar, ge.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f16854a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f16855b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f16856c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f16857d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            b bVar = (b) ((c) obj);
            if (this.f16854a.equals(bVar.f16854a) && this.f16855b.equals(bVar.f16855b) && this.f16856c.equals(bVar.f16856c) && this.f16857d.equals(bVar.f16857d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16857d.hashCode() ^ ((((((this.f16854a.hashCode() ^ 1000003) * 1000003) ^ this.f16855b.hashCode()) * 1000003) ^ this.f16856c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f16854a);
        sb2.append(", wallClock=");
        sb2.append(this.f16855b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f16856c);
        sb2.append(", backendName=");
        return x5.n(sb2, this.f16857d, "}");
    }
}
