package mzx.kpartify.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import kotlinx.android.synthetic.main.band_item.view.*
import mzx.kpartify.R
import mzx.kpartify.api.Band
import mzx.kpartify.common.inflate

/**
 * Created by mauricioheredia on 29/09/16.
 */
class BandDelegateAdapter : ViewTypeDelegateAdapter {
    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return BandViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as BandViewHolder
        holder.bind(item as Band)
    }
    class BandViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(parent.inflate(R.layout.band_item)){
        fun bind(item: Band) = with(itemView) {
            //Picasso.with(itemView.context).load(item.thumbnail).into(img_thumbnail)
            band_name!!.text = item.name
            band_description!!.text = item.toString()
        }
    }
}