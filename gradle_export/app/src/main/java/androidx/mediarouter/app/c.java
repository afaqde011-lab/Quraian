package androidx.mediarouter.app;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.media3.common.f1;
import androidx.media3.common.q2;
import androidx.recyclerview.widget.RecyclerView;

public final class c implements View.OnClickListener {
    public final int A;
    public final Object B;

    public c(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    @Override
    public final void onClick(View view) {
        RecyclerView recyclerView;
        ba.g0 adapter;
        int iJ;
        int i10 = this.A;
        Object obj = this.B;
        switch (i10) {
            case 0:
                ((h) obj).dismiss();
                return;
            case 1:
                ((com.google.android.material.datepicker.o) obj).j();
                throw null;
            case 2:
                m9.u uVar = (m9.u) obj;
                uVar.o(!uVar.R0);
                return;
            case 3:
                m9.u uVar2 = ((m9.i) obj).f10690d;
                f1 f1Var = uVar2.Q0;
                if (f1Var == null || !f1Var.isCommandAvailable(29)) {
                    return;
                }
                q2 trackSelectionParameters = uVar2.Q0.getTrackSelectionParameters();
                f1 f1Var2 = uVar2.Q0;
                String str = e7.i0.f5136a;
                f1Var2.setTrackSelectionParameters(trackSelectionParameters.a().d(1).l(1, false).b());
                uVar2.M.f10727b[1] = uVar2.getResources().getString(2131886492);
                uVar2.R.dismiss();
                return;
            case 4:
                m9.o oVar = (m9.o) obj;
                m9.u uVar3 = oVar.f10724x;
                int iFindRelativeAdapterPositionIn = -1;
                if (oVar.f2291s != null && (recyclerView = oVar.f2290r) != null && (adapter = recyclerView.getAdapter()) != null && (iJ = oVar.f2290r.J(oVar)) != -1) {
                    iFindRelativeAdapterPositionIn = adapter.findRelativeAdapterPositionIn(oVar.f2291s, oVar, iJ);
                }
                View view2 = uVar3.f10752j0;
                if (iFindRelativeAdapterPositionIn == 0) {
                    m9.m mVar = uVar3.N;
                    view2.getClass();
                    uVar3.e(mVar, view2);
                    return;
                } else {
                    if (iFindRelativeAdapterPositionIn != 1) {
                        uVar3.R.dismiss();
                        return;
                    }
                    m9.i iVar = uVar3.P;
                    view2.getClass();
                    uVar3.e(iVar, view2);
                    return;
                }
            case 5:
                m9.u uVar4 = ((m9.i) obj).f10690d;
                f1 f1Var3 = uVar4.Q0;
                if (f1Var3 == null || !f1Var3.isCommandAvailable(29)) {
                    return;
                }
                uVar4.Q0.setTrackSelectionParameters(uVar4.Q0.getTrackSelectionParameters().a().d(3).g().i().k().b());
                uVar4.R.dismiss();
                return;
            case 6:
                m9.z zVar = (m9.z) obj;
                zVar.g();
                if (view.getId() == 2131362161) {
                    zVar.f10791r.start();
                    return;
                } else {
                    if (view.getId() == 2131362160) {
                        zVar.f10792s.start();
                        return;
                    }
                    return;
                }
            case 7:
                vg.d dVar = (vg.d) obj;
                EditText editText = dVar.f15645i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                dVar.p();
                return;
            case 8:
                ((vg.k) obj).t();
                return;
            default:
                vg.t tVar = (vg.t) obj;
                EditText editText2 = tVar.f15696f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = tVar.f15696f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    tVar.f15696f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    tVar.f15696f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    tVar.f15696f.setSelection(selectionEnd);
                }
                tVar.p();
                return;
        }
    }
}
