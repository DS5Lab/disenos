package com.engineerskasa.crypto.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import java.io.Serializable

@Entity(tableName = "cryptocurrency")
data class CryptoCurrency(
    @SerializedName("id")
    @Primar