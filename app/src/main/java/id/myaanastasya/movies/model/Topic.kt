package id.myaanastasya.movies.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val name: Int,
    val availableCourses: Double,
    @DrawableRes val imageRes: Int
)