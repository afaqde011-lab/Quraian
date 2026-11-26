package com.google.android.material.datepicker;

import android.R;
import android.content.res.TypedArray;
import android.os.Message;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.common.l2;
import androidx.media3.common.m2;
import androidx.media3.common.r2;
import androidx.media3.ui.TrackSelectionView;
import fh.t0;
import java.util.ArrayList;
import java.util.HashMap;
import m9.m0;
import p.n2;

public final class l implements View.OnClickListener {
    public final int A;
    public final Object B;

    public l(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    @Override
    public final void onClick(View view) {
        Message messageObtain;
        Message message;
        Message message2;
        Message message3;
        switch (this.A) {
            case 0:
                m mVar = (m) this.B;
                int i10 = mVar.E;
                if (i10 == 2) {
                    mVar.j(1);
                    mVar.H.announceForAccessibility(mVar.getString(2131886894));
                } else if (i10 == 1) {
                    mVar.j(2);
                    mVar.G.announceForAccessibility(mVar.getString(2131886895));
                }
                break;
            case 1:
                eg.f fVar = (eg.f) this.B;
                if (fVar.K && fVar.isShowing()) {
                    if (!fVar.M) {
                        TypedArray typedArrayObtainStyledAttributes = fVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        fVar.L = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                        fVar.M = true;
                    }
                    if (fVar.L) {
                        fVar.cancel();
                    }
                    break;
                }
                break;
            case 2:
                k.g gVar = (k.g) this.B;
                if (view == gVar.f8388h && (message3 = gVar.f8390j) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view != gVar.f8391k || (message2 = gVar.m) == null) {
                    messageObtain = (view != gVar.f8392n || (message = gVar.f8394p) == null) ? null : Message.obtain(message);
                } else {
                    messageObtain = Message.obtain(message2);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                gVar.D.obtainMessage(1, gVar.f8382b).sendToTarget();
                break;
            case 3:
                TrackSelectionView trackSelectionView = (TrackSelectionView) this.B;
                HashMap map = trackSelectionView.G;
                boolean z10 = true;
                if (view == trackSelectionView.C) {
                    trackSelectionView.L = true;
                    map.clear();
                } else if (view == trackSelectionView.D) {
                    trackSelectionView.L = false;
                    map.clear();
                } else {
                    trackSelectionView.L = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    m0 m0Var = (m0) tag;
                    r2 r2Var = m0Var.f10719a;
                    l2 l2Var = r2Var.f1487b;
                    int i11 = m0Var.f10720b;
                    m2 m2Var = (m2) map.get(l2Var);
                    if (m2Var == null) {
                        if (!trackSelectionView.I && !map.isEmpty()) {
                            map.clear();
                        }
                        map.put(l2Var, new m2(l2Var, t0.s(Integer.valueOf(i11))));
                    } else {
                        ArrayList arrayList = new ArrayList(m2Var.f1354b);
                        boolean zIsChecked = ((CheckedTextView) view).isChecked();
                        boolean z11 = trackSelectionView.H && r2Var.f1488c;
                        if (!z11 && (!trackSelectionView.I || trackSelectionView.F.size() <= 1)) {
                            z10 = false;
                        }
                        if (zIsChecked && z10) {
                            arrayList.remove(Integer.valueOf(i11));
                            if (arrayList.isEmpty()) {
                                map.remove(l2Var);
                            } else {
                                map.put(l2Var, new m2(l2Var, arrayList));
                            }
                        } else if (!zIsChecked) {
                            if (z11) {
                                arrayList.add(Integer.valueOf(i11));
                                map.put(l2Var, new m2(l2Var, arrayList));
                            } else {
                                map.put(l2Var, new m2(l2Var, t0.s(Integer.valueOf(i11))));
                            }
                        }
                    }
                }
                trackSelectionView.a();
                break;
            case 4:
                ((n.b) this.B).a();
                break;
            default:
                n2 n2Var = ((Toolbar) this.B).f552p0;
                o.n nVar = n2Var == null ? null : n2Var.B;
                if (nVar != null) {
                    nVar.collapseActionView();
                }
                break;
        }
    }
}
