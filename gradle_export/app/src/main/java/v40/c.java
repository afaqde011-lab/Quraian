package v40;

import java.util.Random;
import u40.g;

public final class c {
    public final b a;
    public final float b;
    public final Random c;
    public float d;
    public float e;

    public c(b bVar, float f) {
        Random random = new Random();
        this.a = bVar;
        this.b = f;
        this.c = random;
    }

    public final float a(g gVar) {
        return (((this.c.nextFloat() * 2.0f) - 1.0f) * 0.5f) + 1.0f;
    }
}
