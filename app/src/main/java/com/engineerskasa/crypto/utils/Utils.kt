package com.engineerskasa.crypto.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import javax.inject.Inject

class Utils @Inject constructor(private val context: Context) {

    fun isConnectedToInternet() =
        (context.getSystemService(Context.CONNECTIVITY_SE