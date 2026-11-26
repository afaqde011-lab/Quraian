package b3;

import kotlin.KotlinNothingValueException;

public final class d implements g2.p {

    public static final d f2023a = new d();

    public static Boolean f2024b;

    @Override
    public final boolean a() throws KotlinNothingValueException {
        Boolean bool = f2024b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw a1.b.u("canFocus is read before it is written");
    }

    @Override
    public final void e(boolean z10) {
        f2024b = Boolean.valueOf(z10);
    }
}
