package com.chris.wishlistapp.data

data class Wish(
    val id: Long = 0L,
    val title: String = "",
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
