package com.sion.vgmdb.base

interface Init {

    fun initData(){

    }

    fun initWidget(){

    }

    fun initEvent(){

    }

    fun init(){
        initData()
        initWidget()
        initEvent()
    }
}