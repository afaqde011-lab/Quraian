package sd;

import com.caverock.androidsvg.SVGParseException;

public abstract class j1 extends t0 {
    @Override
    public final void m(y0 y0Var) throws SVGParseException {
        if (y0Var instanceof i1) {
            this.f14085i.add(y0Var);
            return;
        }
        throw new SVGParseException("Text content elements cannot contain " + y0Var + " elements.");
    }
}
