package mzx.kpartify.common

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by mauricioheredia on 29/09/16.
 */
fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}