package com.chris.wishlistapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
abstract class WishDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)

    // Add in the suspend key word because they will happen in the background / parallel
    abstract suspend fun addWish(wishEntity: Wish)

    // "Select * from 'wish-table'" Loads all wishes from the wish table
    // * means all

    @Query("Select * from 'wish-table'")
    // no need to add in the suspend key word because already using flow
    abstract fun getAllWishes(): Flow<List<Wish>>

    @Update
    abstract suspend fun updateAWish(wishEntity: Wish)

    @Delete
    abstract suspend fun deleteAWish(wishEntity: Wish)

    @Query("Select * from `wish-table` where id=:id")
    //where in here act like a filter, will only take the one with the same id
    abstract fun getAWishById(id:Long) : Flow<Wish>

}