package mzx.kpartify.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

/**
 * Created by mauricioheredia on 29/09/16.
 */

interface ViewType {
    fun getViewType(): Int
}

object AdapterConstants {
    val BAND = 1
    val LOADING = 2
}

interface ViewTypeDelegateAdapter {

    fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder

    fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType)
}