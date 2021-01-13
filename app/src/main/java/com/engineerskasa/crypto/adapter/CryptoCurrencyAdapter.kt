package com.engineerskasa.crypto.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.engineerskasa.crypto.R
import com.engineerskasa.crypto.model.CryptoCurrency

class CryptoCurrencyAdapter(cryptocurrencies: List<CryptoCurrency>):RecyclerView.Adapter<CryptoCurrencyVH>() {
    private var cryptocurrenciesList = ArrayList<CryptoCurrency>()

    init {
        this.cryptocurrenciesList =  cryptocurrencies as ArrayList<CryptoCurrency>
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CryptoCurrencyVH {
        val itemView = LayoutInflater.from(parent.con