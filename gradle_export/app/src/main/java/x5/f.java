package x5;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

public final class f extends a.a {

    public final TextView f16462a;

    public final d f16463b;

    public boolean f16464c = true;

    public f(TextView textView) {
        this.f16462a = textView;
        this.f16463b = new d(textView);
    }

    @Override
    public final InputFilter[] A(InputFilter[] inputFilterArr) {
        if (!this.f16464c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof d) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                if (sparseArray.indexOfKey(i12) < 0) {
                    inputFilterArr2[i11] = inputFilterArr[i12];
                    i11++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i13 = 0;
        while (true) {
            d dVar = this.f16463b;
            if (i13 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i13] == dVar) {
                return inputFilterArr;
            }
            i13++;
        }
    }

    @Override
    public final void b0(boolean z10) {
        if (z10) {
            k0();
        }
    }

    @Override
    public final void c0(boolean z10) {
        this.f16464c = z10;
        k0();
        TextView textView = this.f16462a;
        textView.setFilters(A(textView.getFilters()));
    }

    public final void k0() {
        TextView textView = this.f16462a;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f16464c) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).A;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
