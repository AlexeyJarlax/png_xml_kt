    private fun setupPicturesDayNightForm() { // цветовая настройка День\ночь на две иконки 
        val searchIcon: ImageButton = findViewById(R.id.search_icon)
        searchIcon.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_search))
        val clearButton: ImageButton = findViewById(R.id.clearButton)
        clearButton.setImageDrawable(
            ContextCompat.getDrawable(
                this,
                R.drawable.ic_clear_light_mode
            )
        )
        val attributes = obtainStyledAttributes(intArrayOf(R.attr.iconColor, R.attr.iconPath))
        val iconColor =
            attributes.getColor(0, ContextCompat.getColor(this, R.color.yp_text_gray__yp_black))
        val iconPath = attributes.getString(1)
        attributes.recycle()

        searchIcon.setColorFilter(iconColor)
        searchIcon.tag = iconPath
        clearButton.setColorFilter(iconColor)
        clearButton.tag = iconPath
    }

============================================= Активность

            <ImageButton
                android:id="@+id/search_icon"
                ...
                android:src="@drawable/_util_vector_dominator"
                app:iconPath="@drawable/ic_search"
                tools:src="@drawable/ic_search" />

            <ImageButton
                android:id="@+id/clearButton"
                ...
                android:src="@drawable/_util_vector_dominator"
                app:iconPath="@drawable/ic_clear_light_mode"
                tools:src="@drawable/ic_clear_light_mode" />

============================================= _util_vector_dominator.xml

<?xml version="1.0" encoding="utf-8"?>
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="@dimen/dp16"
    android:height="@dimen/dp16"
    android:viewportWidth="16"
    android:viewportHeight="16">
    <path
        android:fillColor="?attr/iconColor"
        android:pathData="?attr/iconPath" />
</vector>

============================================= attrs.xml

<?xml version="1.0" encoding="utf-8"?>
<resources>
    <attr name="iconColor" format="color" />
    <attr name="iconPath" format="string" />
</resources>
