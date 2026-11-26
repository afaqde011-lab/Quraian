package sg;

import com.google.android.material.button.MaterialButton;

public final class h extends kh.n {

    public final int f14165a;

    public h(int i10) {
        this.f14165a = i10;
    }

    @Override
    public final float O(v vVar) {
        float[] fArr = ((i) vVar).Z;
        if (fArr != null) {
            return fArr[this.f14165a];
        }
        return 0.0f;
    }

    @Override
    public final void c0(v vVar, float f3) {
        i iVar = (i) vVar;
        float[] fArr = iVar.Z;
        if (fArr != null) {
            int i10 = this.f14165a;
            if (fArr[i10] != f3) {
                fArr[i10] = f3;
                ab.r rVar = iVar.f14168b0;
                if (rVar != null) {
                    float fG = iVar.g();
                    MaterialButton materialButton = (MaterialButton) rVar.B;
                    int i11 = (int) (fG * 0.11f);
                    if (materialButton.f4140a0 != i11) {
                        materialButton.f4140a0 = i11;
                        materialButton.j();
                        materialButton.invalidate();
                    }
                }
                iVar.invalidateSelf();
            }
        }
    }
}
