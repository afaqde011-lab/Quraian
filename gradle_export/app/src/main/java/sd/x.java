package sd;

import android.graphics.Matrix;
import com.caverock.androidsvg.SVGParseException;
import java.util.ArrayList;
import java.util.List;

public abstract class x extends w0 implements u0 {

    public List f14116h = new ArrayList();

    public Boolean f14117i;

    public Matrix f14118j;

    public int f14119k;
    public String l;

    @Override
    public final List a() {
        return this.f14116h;
    }

    @Override
    public final void m(y0 y0Var) throws SVGParseException {
        if (y0Var instanceof p0) {
            this.f14116h.add(y0Var);
            return;
        }
        throw new SVGParseException("Gradient elements cannot contain " + y0Var + " elements.");
    }
}
