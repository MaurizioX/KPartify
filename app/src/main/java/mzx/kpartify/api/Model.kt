package mzx.kpartify.api

import com.google.firebase.database.IgnoreExtraProperties
import com.google.firebase.database.PropertyName
import mzx.kpartify.adapter.AdapterConstants
import mzx.kpartify.adapter.ViewType

/**
 * Created by mauricioheredia on 20/09/16.
 */
private val noLifeSpan = LifeSpan()
@IgnoreExtraProperties
data class Band(var aliases: Map<String,Alias> = emptyMap(), var country: String = "",
                var disambiguation: String = "", var id: String? = "",
                var lifeSpan: LifeSpan = noLifeSpan, var name: String = "",
                @PropertyName("sort-name")
                var sortName: String = "",
                var type: String = "") : ViewType {
    override fun getViewType(): Int {
        return AdapterConstants.BAND
    }

    constructor() : this(emptyMap(), "", "", "")
}



data class LifeSpan(var begin: String = "", var end: String = "", var ended: Boolean = false)

data class Alias(var name: String = "", var sortName: String = "")
