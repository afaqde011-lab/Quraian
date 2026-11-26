package m9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ba.f1;

public final class m extends ba.g0 {

    public final String[] f10715a;

    public final float[] f10716b;

    public int f10717c;

    public final u f10718d;

    public m(u uVar, String[] strArr, float[] fArr) {
        this.f10718d = uVar;
        this.f10715a = strArr;
        this.f10716b = fArr;
    }

    @Override
    public final int getItemCount() {
        return this.f10715a.length;
    }

    @Override
    public final void onBindViewHolder(f1 f1Var, final int i10) {
        q qVar = (q) f1Var;
        String[] strArr = this.f10715a;
        if (i10 < strArr.length) {
            qVar.f10730u.setText(strArr[i10]);
        }
        if (i10 == this.f10717c) {
            qVar.f2275a.setSelected(true);
            qVar.f10731v.setVisibility(0);
        } else {
            qVar.f2275a.setSelected(false);
            qVar.f10731v.setVisibility(4);
        }
        qVar.f2275a.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                m mVar = this.A;
                u uVar = mVar.f10718d;
                int i11 = mVar.f10717c;
                int i12 = i10;
                if (i12 != i11) {
                    uVar.setPlaybackSpeed(mVar.f10716b[i12]);
                }
                uVar.R.dismiss();
            }
        });
    }

    @Override
    public final f1 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new q(LayoutInflater.from(this.f10718d.getContext()).inflate(2131558752, viewGroup, false));
    }
}
