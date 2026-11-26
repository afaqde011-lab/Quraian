package e00;

import a40.z;
import android.renderscript.ScriptIntrinsicBlur;
import g00.b0;
import ri.t1;

public final class s extends m00.i implements u00.n {
    public final int A = 1;
    public final float B;
    public Object C;

    public s(float f, k00.c cVar) {
        super(2, cVar);
        this.B = f;
    }

    public s(v vVar, float f, k00.c cVar) {
        super(2, cVar);
        this.C = vVar;
        this.B = f;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new s((v) this.C, this.B, cVar);
            default:
                s sVar = new s(this.B, cVar);
                sVar.C = obj;
                return sVar;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                s sVar = (s) create((z) obj, (k00.c) obj2);
                b0 b0Var = b0.a;
                sVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                s sVar2 = (s) create((k9.u) obj, (k00.c) obj2);
                b0 b0Var2 = b0.a;
                sVar2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                v vVar = (v) this.C;
                float f = this.B;
                vVar.getClass();
                if (1.0f > f || f > 25.0f) {
                    throw new IllegalArgumentException("blurRadius needs to be >= 1 and <= 25");
                }
                if (!vVar.g) {
                    ScriptIntrinsicBlur scriptIntrinsicBlur = vVar.b;
                    if (f > 25.0f) {
                        f = 25.0f;
                    }
                    scriptIntrinsicBlur.setRadius(f);
                    vVar.b.forEach(vVar.d);
                    if (!vVar.g) {
                        vVar.d.copyTo(vVar.e);
                    }
                }
                return b0.a;
            default:
                k9.u uVar = (k9.u) this.C;
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                uVar.setVolume(this.B);
                return b0.a;
        }
    }
}
