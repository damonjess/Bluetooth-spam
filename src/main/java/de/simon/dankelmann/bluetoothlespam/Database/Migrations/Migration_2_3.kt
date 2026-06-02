package de.simon.dankelmann.bluetoothlespam.Database.Migrations

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

val Migration_2_3 = object : Migration(2, 3) {
    override fun migrate(db: SupportSQLiteDatabase) {
        // AdvertisementSetEntity indexes
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_AdvertisementSetEntity_advertiseSettingsId` ON `AdvertisementSetEntity` (`advertiseSettingsId`)")
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_AdvertisementSetEntity_advertisingSetParametersId` ON `AdvertisementSetEntity` (`advertisingSetParametersId`)")
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_AdvertisementSetEntity_advertiseDataId` ON `AdvertisementSetEntity` (`advertiseDataId`)")
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_AdvertisementSetEntity_scanResponseId` ON `AdvertisementSetEntity` (`scanResponseId`)")
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_AdvertisementSetEntity_periodicAdvertisingParametersId` ON `AdvertisementSetEntity` (`periodicAdvertisingParametersId`)")
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_AdvertisementSetEntity_periodicAdvertiseDataId` ON `AdvertisementSetEntity` (`periodicAdvertiseDataId`)")

        // AssociationListSetEntity indexes
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_AssociationListSetEntity_advertisementSetId` ON `AssociationListSetEntity` (`advertisementSetId`)")
        db.execSQL("CREATE INDEX IF NOT EXISTS `index_AssociationListSetEntity_advertisementSetListId` ON `AssociationListSetEntity` (`advertisementSetListId`)")
    }
}
