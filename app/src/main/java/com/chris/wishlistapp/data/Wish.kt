package com.chris.wishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="wish-table")

data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    @ColumnInfo(name="wish-title")
    val title: String = "",
    @ColumnInfo(name="wish-desc")
    val description: String = ""
)

object DummyWish{
    val wishList = listOf(
        Wish(title = "Google Watch", description = "Testing app display"),
        Wish(title = "Google Watchwswnewej", description = "Testing app displaysdnjehueekrkew"),
        Wish(title = "Google Watchwjhuwyhe", description = "Testing app displayskdsdkjjs"),
        Wish(title = "Google Watchwghhwjei", description = "Testing app displaywujiwueuwe"),
    )
}
