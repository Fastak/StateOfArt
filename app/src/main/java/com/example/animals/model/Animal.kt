package com.example.animals.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class ApiKey(
    val message: String?,
    val key: String?
)

data class Animal(
    val name: String?,
    val taxonamy: Taxonomy?,
    val location: String?,
    val speed: Speed?,
    val diet: String?,
    @SerializedName("lifespan")
    val lifeSpan: String?,
    @SerializedName("image")
    val imageUrl: String?

) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readParcelable(Taxonomy::class.java.classLoader),
        parcel.readString(),
        parcel.readParcelable(Speed::class.java.classLoader),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun describeContents(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object CREATOR : Parcelable.Creator<Animal> {
        override fun createFromParcel(parcel: Parcel): Animal {
            return Animal(parcel)
        }

        override fun newArray(size: Int): Array<Animal?> {
            return arrayOfNulls(size)
        }
    }
}

data class Taxonomy(
    val kingdom: String?,
    val order: String?,
    val family: String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun describeContents(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object CREATOR : Parcelable.Creator<Taxonomy> {
        override fun createFromParcel(parcel: Parcel): Taxonomy {
            return Taxonomy(parcel)
        }

        override fun newArray(size: Int): Array<Taxonomy?> {
            return arrayOfNulls(size)
        }
    }
}

data class Speed(
    val metric: String?,
    val imperial: String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun describeContents(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object CREATOR : Parcelable.Creator<Speed> {
        override fun createFromParcel(parcel: Parcel): Speed {
            return Speed(parcel)
        }

        override fun newArray(size: Int): Array<Speed?> {
            return arrayOfNulls(size)
        }
    }
}

data class AnimalPalette(var color: Int)