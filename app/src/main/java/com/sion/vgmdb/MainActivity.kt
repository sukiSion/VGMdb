package com.sion.vgmdb

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import com.blankj.utilcode.util.LogUtils
import com.sion.vgmdb.base.BaseActivity
import com.sion.vgmdb.databinding.ActivityMainBinding
import com.sion.vgmdb.net.NetClient
import kotlinx.coroutines.launch

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val mLayoutID: Int
        get() = R.layout.activity_main

    override fun init() {
        super.init()
    }
}