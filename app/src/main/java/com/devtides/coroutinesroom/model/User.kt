package com.devtides.coroutinesroom.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true) var id: Long = 0,
    @JvmField val username: String,
    @ColumnInfo(name = "password_hash") @JvmField val passwordHash: Int,
    @JvmField val info: String
)