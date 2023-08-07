package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCheckoutBindingImpl extends FragmentCheckoutBinding implements com.example.lunchtray.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.order_summary, 12);
        sViewsWithIds.put(R.id.divider, 13);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCheckoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentCheckoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.Button) bindings[11]
            , (android.view.View) bindings[13]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.Button) bindings[10]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            );
        this.accompanimentPrice.setTag(null);
        this.accompanimentSelection.setTag(null);
        this.cancelButton.setTag(null);
        this.entreePrice.setTag(null);
        this.entreeSelection.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.sidePrice.setTag(null);
        this.sideSelection.setTag(null);
        this.submitButton.setTag(null);
        this.subtotal.setTag(null);
        this.tax.setTag(null);
        this.total.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.example.lunchtray.generated.callback.OnClickListener(this, 1);
        mCallback7 = new com.example.lunchtray.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.CheckoutFragment == variableId) {
            setCheckoutFragment((com.example.lunchtray.ui.order.CheckoutFragment) variable);
        }
        else if (BR.OrderViewModel == variableId) {
            setOrderViewModel((com.example.lunchtray.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCheckoutFragment(@Nullable com.example.lunchtray.ui.order.CheckoutFragment CheckoutFragment) {
        this.mCheckoutFragment = CheckoutFragment;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.CheckoutFragment);
        super.requestRebind();
    }
    public void setOrderViewModel(@Nullable com.example.lunchtray.model.OrderViewModel OrderViewModel) {
        this.mOrderViewModel = OrderViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.OrderViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeOrderViewModelEntree((androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem>) object, fieldId);
            case 1 :
                return onChangeOrderViewModelSide((androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem>) object, fieldId);
            case 2 :
                return onChangeOrderViewModelTotal((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeOrderViewModelTax((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeOrderViewModelSubtotal((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeOrderViewModelAccompaniment((androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeOrderViewModelEntree(androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> OrderViewModelEntree, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeOrderViewModelSide(androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> OrderViewModelSide, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeOrderViewModelTotal(androidx.lifecycle.LiveData<java.lang.String> OrderViewModelTotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeOrderViewModelTax(androidx.lifecycle.LiveData<java.lang.String> OrderViewModelTax, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeOrderViewModelSubtotal(androidx.lifecycle.LiveData<java.lang.String> OrderViewModelSubtotal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeOrderViewModelAccompaniment(androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> OrderViewModelAccompaniment, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> orderViewModelEntree = null;
        androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> orderViewModelSide = null;
        com.example.lunchtray.ui.order.CheckoutFragment checkoutFragment = mCheckoutFragment;
        java.lang.String taxAndroidStringTaxOrderViewModelTax = null;
        com.example.lunchtray.model.MenuItem orderViewModelEntreeGetValue = null;
        java.lang.String orderViewModelAccompanimentName = null;
        java.lang.String orderViewModelEntreeName = null;
        com.example.lunchtray.model.MenuItem orderViewModelSideGetValue = null;
        java.lang.String orderViewModelSideName = null;
        androidx.lifecycle.LiveData<java.lang.String> orderViewModelTotal = null;
        androidx.lifecycle.LiveData<java.lang.String> orderViewModelTax = null;
        java.lang.String subtotalAndroidStringSubtotalOrderViewModelSubtotal = null;
        java.lang.String orderViewModelSideFormattedPrice = null;
        java.lang.String orderViewModelSubtotalGetValue = null;
        java.lang.String orderViewModelTotalGetValue = null;
        java.lang.String orderViewModelTaxGetValue = null;
        androidx.lifecycle.LiveData<java.lang.String> orderViewModelSubtotal = null;
        java.lang.String orderViewModelAccompanimentFormattedPrice = null;
        java.lang.String orderViewModelEntreeFormattedPrice = null;
        com.example.lunchtray.model.MenuItem orderViewModelAccompanimentGetValue = null;
        com.example.lunchtray.model.OrderViewModel orderViewModel = mOrderViewModel;
        java.lang.String totalAndroidStringTotalOrderViewModelTotal = null;
        androidx.lifecycle.LiveData<com.example.lunchtray.model.MenuItem> orderViewModelAccompaniment = null;

        if ((dirtyFlags & 0x1bfL) != 0) {


            if ((dirtyFlags & 0x181L) != 0) {

                    if (orderViewModel != null) {
                        // read OrderViewModel.entree
                        orderViewModelEntree = orderViewModel.getEntree();
                    }
                    updateLiveDataRegistration(0, orderViewModelEntree);


                    if (orderViewModelEntree != null) {
                        // read OrderViewModel.entree.getValue()
                        orderViewModelEntreeGetValue = orderViewModelEntree.getValue();
                    }


                    if (orderViewModelEntreeGetValue != null) {
                        // read OrderViewModel.entree.getValue().name
                        orderViewModelEntreeName = orderViewModelEntreeGetValue.getName();
                        // read OrderViewModel.entree.getValue().formattedPrice
                        orderViewModelEntreeFormattedPrice = orderViewModelEntreeGetValue.getFormattedPrice();
                    }
            }
            if ((dirtyFlags & 0x182L) != 0) {

                    if (orderViewModel != null) {
                        // read OrderViewModel.side
                        orderViewModelSide = orderViewModel.getSide();
                    }
                    updateLiveDataRegistration(1, orderViewModelSide);


                    if (orderViewModelSide != null) {
                        // read OrderViewModel.side.getValue()
                        orderViewModelSideGetValue = orderViewModelSide.getValue();
                    }


                    if (orderViewModelSideGetValue != null) {
                        // read OrderViewModel.side.getValue().name
                        orderViewModelSideName = orderViewModelSideGetValue.getName();
                        // read OrderViewModel.side.getValue().formattedPrice
                        orderViewModelSideFormattedPrice = orderViewModelSideGetValue.getFormattedPrice();
                    }
            }
            if ((dirtyFlags & 0x184L) != 0) {

                    if (orderViewModel != null) {
                        // read OrderViewModel.total
                        orderViewModelTotal = orderViewModel.getTotal();
                    }
                    updateLiveDataRegistration(2, orderViewModelTotal);


                    if (orderViewModelTotal != null) {
                        // read OrderViewModel.total.getValue()
                        orderViewModelTotalGetValue = orderViewModelTotal.getValue();
                    }


                    // read @android:string/total
                    totalAndroidStringTotalOrderViewModelTotal = total.getResources().getString(R.string.total, orderViewModelTotalGetValue);
            }
            if ((dirtyFlags & 0x188L) != 0) {

                    if (orderViewModel != null) {
                        // read OrderViewModel.tax
                        orderViewModelTax = orderViewModel.getTax();
                    }
                    updateLiveDataRegistration(3, orderViewModelTax);


                    if (orderViewModelTax != null) {
                        // read OrderViewModel.tax.getValue()
                        orderViewModelTaxGetValue = orderViewModelTax.getValue();
                    }


                    // read @android:string/tax
                    taxAndroidStringTaxOrderViewModelTax = tax.getResources().getString(R.string.tax, orderViewModelTaxGetValue);
            }
            if ((dirtyFlags & 0x190L) != 0) {

                    if (orderViewModel != null) {
                        // read OrderViewModel.subtotal
                        orderViewModelSubtotal = orderViewModel.getSubtotal();
                    }
                    updateLiveDataRegistration(4, orderViewModelSubtotal);


                    if (orderViewModelSubtotal != null) {
                        // read OrderViewModel.subtotal.getValue()
                        orderViewModelSubtotalGetValue = orderViewModelSubtotal.getValue();
                    }


                    // read @android:string/subtotal
                    subtotalAndroidStringSubtotalOrderViewModelSubtotal = subtotal.getResources().getString(R.string.subtotal, orderViewModelSubtotalGetValue);
            }
            if ((dirtyFlags & 0x1a0L) != 0) {

                    if (orderViewModel != null) {
                        // read OrderViewModel.accompaniment
                        orderViewModelAccompaniment = orderViewModel.getAccompaniment();
                    }
                    updateLiveDataRegistration(5, orderViewModelAccompaniment);


                    if (orderViewModelAccompaniment != null) {
                        // read OrderViewModel.accompaniment.getValue()
                        orderViewModelAccompanimentGetValue = orderViewModelAccompaniment.getValue();
                    }


                    if (orderViewModelAccompanimentGetValue != null) {
                        // read OrderViewModel.accompaniment.getValue().name
                        orderViewModelAccompanimentName = orderViewModelAccompanimentGetValue.getName();
                        // read OrderViewModel.accompaniment.getValue().formattedPrice
                        orderViewModelAccompanimentFormattedPrice = orderViewModelAccompanimentGetValue.getFormattedPrice();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1a0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.accompanimentPrice, orderViewModelAccompanimentFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.accompanimentSelection, orderViewModelAccompanimentName);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.cancelButton.setOnClickListener(mCallback7);
            this.submitButton.setOnClickListener(mCallback6);
        }
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.entreePrice, orderViewModelEntreeFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.entreeSelection, orderViewModelEntreeName);
        }
        if ((dirtyFlags & 0x182L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sidePrice, orderViewModelSideFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sideSelection, orderViewModelSideName);
        }
        if ((dirtyFlags & 0x190L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.subtotal, subtotalAndroidStringSubtotalOrderViewModelSubtotal);
        }
        if ((dirtyFlags & 0x188L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tax, taxAndroidStringTaxOrderViewModelTax);
        }
        if ((dirtyFlags & 0x184L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.total, totalAndroidStringTotalOrderViewModelTotal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // CheckoutFragment
                com.example.lunchtray.ui.order.CheckoutFragment checkoutFragment = mCheckoutFragment;
                // CheckoutFragment != null
                boolean checkoutFragmentJavaLangObjectNull = false;



                checkoutFragmentJavaLangObjectNull = (checkoutFragment) != (null);
                if (checkoutFragmentJavaLangObjectNull) {


                    checkoutFragment.submitOrder();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // CheckoutFragment
                com.example.lunchtray.ui.order.CheckoutFragment checkoutFragment = mCheckoutFragment;
                // CheckoutFragment != null
                boolean checkoutFragmentJavaLangObjectNull = false;



                checkoutFragmentJavaLangObjectNull = (checkoutFragment) != (null);
                if (checkoutFragmentJavaLangObjectNull) {


                    checkoutFragment.cancelOrder();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): OrderViewModel.entree
        flag 1 (0x2L): OrderViewModel.side
        flag 2 (0x3L): OrderViewModel.total
        flag 3 (0x4L): OrderViewModel.tax
        flag 4 (0x5L): OrderViewModel.subtotal
        flag 5 (0x6L): OrderViewModel.accompaniment
        flag 6 (0x7L): CheckoutFragment
        flag 7 (0x8L): OrderViewModel
        flag 8 (0x9L): null
    flag mapping end*/
    //end
}