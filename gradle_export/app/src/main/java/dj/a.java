package dj;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;

public final class a implements bj.c {

    public final int f4898a;

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f4898a) {
            case 0:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                bj.d dVar = (bj.d) obj2;
                dVar.f(ej.f.f5384g, entry.getKey());
                dVar.f(ej.f.f5385h, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
