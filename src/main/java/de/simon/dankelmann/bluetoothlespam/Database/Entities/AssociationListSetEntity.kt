package de.simon.dankelmann.bluetoothlespam.Database.Entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    indices = [
        androidx.room.Index(value = ["advertisementSetId"]),
        androidx.room.Index(value = ["advertisementSetListId"])
    ]
)
data class AssociationListSetEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,

    @ColumnInfo(name = "advertisementSetId") var advertisementSetId: Int,
    @ColumnInfo(name = "advertisementSetListId") var advertisementSetListId: Int,
    @ColumnInfo(name = "position") var position: Int,
)
