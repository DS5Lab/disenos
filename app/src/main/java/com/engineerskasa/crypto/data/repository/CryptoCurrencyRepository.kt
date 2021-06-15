package com.engineerskasa.crypto.data.repository

import android.util.Log
import com.engineerskasa.crypto.data.database.CryptoDao
import com.engineerskasa.crypto.data.remote.ApiInterface
import com.engineerskasa.crypto.model.CryptoCurrency
import com.engineerskasa.crypto.utils.Constants.Companion.START_ZERO_VALUE
import com.engineerskasa.crypto.utils.Utils
import io.reactivex.Observable
import javax.inject.Inject

class CryptoCurrencyRepository @Inject constructor(
    val apiInterface: ApiInterface,
    val cryptoDao: CryptoDao,
    val utils: Utils
) {
    fun getCryptoCurrencies(limi