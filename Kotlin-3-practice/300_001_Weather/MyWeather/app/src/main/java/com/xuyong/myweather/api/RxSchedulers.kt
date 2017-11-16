package com.xuyong.myweather.api

import rx.Observable
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

object RxSchedulers {

    private val schedulersTransformer = object : Observable.Transformer<Any, Any> {
        override fun call(t: Observable<Any>?): Observable<Any> {
            return (t as Observable<Any>).subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
        }
    }

    fun <T> applySchedulers(): Observable.Transformer<T, T> {
        return schedulersTransformer as Observable.Transformer<T, T>
    }
}