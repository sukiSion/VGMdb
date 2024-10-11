package com.sion.vgmdb.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.enableEdgeToEdge
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.viewbinding.ViewBinding
import com.sion.vgmdb.R

abstract class BaseActivity<T: ViewBinding>: AppCompatActivity() , Init{

    protected lateinit var mBinding: T
    protected val mFitStatusBar: Boolean = false
    protected val mFitNavigationBar: Boolean = false

    @get:LayoutRes
    protected abstract val mLayoutID: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        mBinding = DataBindingUtil.setContentView(this , mLayoutID)
        ViewCompat.setOnApplyWindowInsetsListener(mBinding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, if(mFitStatusBar) 0 else systemBars.top, systemBars.right, if(mFitNavigationBar) 0 else systemBars.bottom)
            insets
        }
        if(mBinding is ViewDataBinding){
            (mBinding as ViewDataBinding).lifecycleOwner = this
        }
        init()
    }
}