package m9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.media3.common.f1;
import androidx.media3.common.l2;
import androidx.media3.common.m2;
import androidx.media3.common.p2;
import androidx.media3.common.q2;
import fh.d2;
import fh.t0;
import java.util.ArrayList;
import java.util.List;

public final class i extends ba.g0 {

    public List f10687a = new ArrayList();

    public final u f10688b;

    public final int f10689c;

    public final u f10690d;

    public i(u uVar, int i10) {
        this.f10689c = i10;
        this.f10690d = uVar;
        this.f10688b = uVar;
    }

    private final void e(String str) {
    }

    public boolean a(q2 q2Var) {
        for (int i10 = 0; i10 < this.f10687a.size(); i10++) {
            if (q2Var.H.containsKey(((r) this.f10687a.get(i10)).f10732a.f1487b)) {
                return true;
            }
        }
        return false;
    }

    public void b(List list) {
        u uVar = this.f10690d;
        ImageView imageView = uVar.f10748g0;
        boolean z10 = false;
        for (int i10 = 0; i10 < ((d2) list).D; i10++) {
            r rVar = (r) ((d2) list).get(i10);
            if (rVar.f10732a.f1490e[rVar.f10733b]) {
                z10 = true;
                break;
            }
        }
        if (imageView != null) {
            imageView.setImageDrawable(z10 ? uVar.I0 : uVar.J0);
            imageView.setContentDescription(z10 ? uVar.K0 : uVar.L0);
        }
        this.f10687a = list;
    }

    public void c(q qVar, int i10) {
        switch (this.f10689c) {
            case 1:
                d(qVar, i10);
                if (i10 > 0) {
                    r rVar = (r) this.f10687a.get(i10 - 1);
                    qVar.f10731v.setVisibility(rVar.f10732a.f1490e[rVar.f10733b] ? 0 : 4);
                }
                break;
            default:
                d(qVar, i10);
                break;
        }
    }

    public final void d(q qVar, int i10) {
        boolean z10;
        boolean z11;
        final f1 f1Var = this.f10688b.Q0;
        if (f1Var == null) {
        }
        if (i10 != 0) {
            final r rVar = (r) this.f10687a.get(i10 - 1);
            final l2 l2Var = rVar.f10732a.f1487b;
            if (f1Var.getTrackSelectionParameters().H.get(l2Var) != null) {
                z10 = rVar.f10732a.f1490e[rVar.f10733b];
            }
            qVar.f10730u.setText(rVar.f10734c);
            qVar.f10731v.setVisibility(z10 ? 0 : 4);
            qVar.f2275a.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    f1 f1Var2 = f1Var;
                    if (f1Var2.isCommandAvailable(29)) {
                        p2 p2VarA = f1Var2.getTrackSelectionParameters().a();
                        r rVar2 = rVar;
                        f1Var2.setTrackSelectionParameters(p2VarA.h(new m2(l2Var, t0.s(Integer.valueOf(rVar2.f10733b)))).l(rVar2.f10732a.f1487b.f1340c, false).b());
                        String str = rVar2.f10734c;
                        i iVar = this.A;
                        switch (iVar.f10689c) {
                            case 0:
                                iVar.f10690d.M.f10727b[1] = str;
                                break;
                        }
                        iVar.f10688b.R.dismiss();
                    }
                }
            });
            return;
        }
        switch (this.f10689c) {
            case 0:
                qVar.f10730u.setText(2131886492);
                f1 f1Var2 = this.f10690d.Q0;
                f1Var2.getClass();
                qVar.f10731v.setVisibility(a(f1Var2.getTrackSelectionParameters()) ? 4 : 0);
                qVar.f2275a.setOnClickListener(new androidx.mediarouter.app.c(this, 3));
                break;
            default:
                qVar.f10730u.setText(2131886493);
                int i11 = 0;
                while (true) {
                    if (i11 < this.f10687a.size()) {
                        r rVar2 = (r) this.f10687a.get(i11);
                        if (rVar2.f10732a.f1490e[rVar2.f10733b]) {
                            z11 = false;
                        } else {
                            i11++;
                        }
                    } else {
                        z11 = true;
                    }
                }
                qVar.f10731v.setVisibility(z11 ? 0 : 4);
                qVar.f2275a.setOnClickListener(new androidx.mediarouter.app.c(this, 5));
                break;
        }
    }

    @Override
    public final int getItemCount() {
        if (this.f10687a.isEmpty()) {
            return 0;
        }
        return this.f10687a.size() + 1;
    }

    @Override
    public void onBindViewHolder(ba.f1 f1Var, int i10) {
        switch (this.f10689c) {
            case 1:
                c((q) f1Var, i10);
                break;
            default:
                c((q) f1Var, i10);
                break;
        }
    }

    @Override
    public final ba.f1 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new q(LayoutInflater.from(this.f10688b.getContext()).inflate(2131558752, viewGroup, false));
    }
}
