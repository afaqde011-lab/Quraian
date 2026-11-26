package i2;

import b3.j2;
import z2.l1;
import z2.x0;
import z2.y0;

public final class u0 extends b2.q implements b3.y, j2 {
    public float O;
    public float P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public long U;
    public t0 V;
    public boolean W;
    public long X;
    public long Y;
    public int Z;

    public m f7170a0;

    public b3.a f7171b0;

    @Override
    public final x0 e(y0 y0Var, z2.v0 v0Var, long j9) {
        l1 l1VarO = v0Var.O(j9);
        return y0Var.o0(l1VarO.A, l1VarO.B, h00.y.A, new b2.v(l1VarO, this, 10));
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void m1(j3.a0 a0Var) {
        if (this.W) {
            j3.y.m(a0Var, this.V);
        }
    }

    @Override
    public final boolean q1() {
        return false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb2.append(this.O);
        sb2.append(", scaleY=");
        sb2.append(this.P);
        sb2.append(", alpha = ");
        sb2.append(this.Q);
        sb2.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb2.append(this.R);
        sb2.append(", rotationX=0.0, rotationY=0.0, rotationZ=");
        sb2.append(this.S);
        sb2.append(", cameraDistance=");
        sb2.append(this.T);
        sb2.append(", transformOrigin=");
        sb2.append((Object) w0.d(this.U));
        sb2.append(", shape=");
        sb2.append(this.V);
        sb2.append(", clip=");
        sb2.append(this.W);
        sb2.append(", renderEffect=null, ambientShadowColor=");
        w.c.s(this.X, ", spotShadowColor=", sb2);
        w.c.s(this.Y, ", compositingStrategy=CompositingStrategy(value=0), blendMode=", sb2);
        sb2.append((Object) l.a(this.Z));
        sb2.append(", colorFilter=");
        sb2.append(this.f7170a0);
        sb2.append(')');
        return sb2.toString();
    }
}
