package v5;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

public final class q extends SpannableStringBuilder {
    public final Class A;
    public final ArrayList B;

    public q(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.B = new ArrayList();
        rd.a.i(cls, "watcherClass cannot be null");
        this.A = cls;
    }

    public q(Class cls, q qVar, int i10, int i11) {
        super(qVar, i10, i11);
        this.B = new ArrayList();
        rd.a.i(cls, "watcherClass cannot be null");
        this.A = cls;
    }

    public final void a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.B;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((p) arrayList.get(i10)).B.incrementAndGet();
            i10++;
        }
    }

    @Override
    public final Editable append(char c10) {
        super.append(c10);
        return this;
    }

    @Override
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override
    public final Editable append(CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override
    public final SpannableStringBuilder append(char c10) {
        super.append(c10);
        return this;
    }

    @Override
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override
    public final SpannableStringBuilder append(CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i10) {
        super.append(charSequence, obj, i10);
        return this;
    }

    @Override
    public final Appendable append(char c10) {
        super.append(c10);
        return this;
    }

    @Override
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override
    public final Appendable append(CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    public final void b() {
        e();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.B;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((p) arrayList.get(i10)).onTextChanged(this, 0, length(), length());
            i10++;
        }
    }

    public final p c(Object obj) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.B;
            if (i10 >= arrayList.size()) {
                return null;
            }
            p pVar = (p) arrayList.get(i10);
            if (pVar.A == obj) {
                return pVar;
            }
            i10++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.A == obj.getClass();
        }
        return false;
    }

    @Override
    public final Editable delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    @Override
    public final SpannableStringBuilder delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    public final void e() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.B;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((p) arrayList.get(i10)).B.decrementAndGet();
            i10++;
        }
    }

    @Override
    public final int getSpanEnd(Object obj) {
        p pVarC;
        if (d(obj) && (pVarC = c(obj)) != null) {
            obj = pVarC;
        }
        return super.getSpanEnd(obj);
    }

    @Override
    public final int getSpanFlags(Object obj) {
        p pVarC;
        if (d(obj) && (pVarC = c(obj)) != null) {
            obj = pVarC;
        }
        return super.getSpanFlags(obj);
    }

    @Override
    public final int getSpanStart(Object obj) {
        p pVarC;
        if (d(obj) && (pVarC = c(obj)) != null) {
            obj = pVarC;
        }
        return super.getSpanStart(obj);
    }

    @Override
    public final Object[] getSpans(int i10, int i11, Class cls) {
        if (this.A != cls) {
            return super.getSpans(i10, i11, cls);
        }
        p[] pVarArr = (p[]) super.getSpans(i10, i11, p.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, pVarArr.length);
        for (int i12 = 0; i12 < pVarArr.length; i12++) {
            objArr[i12] = pVarArr[i12].A;
        }
        return objArr;
    }

    @Override
    public final Editable insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    @Override
    public final Editable insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    @Override
    public final SpannableStringBuilder insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    @Override
    public final SpannableStringBuilder insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    @Override
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        if (cls == null || this.A == cls) {
            cls = p.class;
        }
        return super.nextSpanTransition(i10, i11, cls);
    }

    @Override
    public final void removeSpan(Object obj) {
        p pVarC;
        if (d(obj)) {
            pVarC = c(obj);
            if (pVarC != null) {
                obj = pVarC;
            }
        } else {
            pVarC = null;
        }
        super.removeSpan(obj);
        if (pVarC != null) {
            this.B.remove(pVarC);
        }
    }

    @Override
    public final Editable replace(int i10, int i11, CharSequence charSequence) {
        replace(i10, i11, charSequence);
        return this;
    }

    @Override
    public final Editable replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        replace(i10, i11, charSequence, i12, i13);
        return this;
    }

    @Override
    public final SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence) {
        a();
        super.replace(i10, i11, charSequence);
        e();
        return this;
    }

    @Override
    public final SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        a();
        super.replace(i10, i11, charSequence, i12, i13);
        e();
        return this;
    }

    @Override
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        if (d(obj)) {
            p pVar = new p(obj);
            this.B.add(pVar);
            obj = pVar;
        }
        super.setSpan(obj, i10, i11, i12);
    }

    @Override
    public final CharSequence subSequence(int i10, int i11) {
        return new q(this.A, this, i10, i11);
    }
}
