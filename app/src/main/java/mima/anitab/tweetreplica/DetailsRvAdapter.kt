package mima.anitab.tweetreplica

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DetailsRvAdapter(var detailsList: List<Details>):
RecyclerView.Adapter<DetailsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailsViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.tweet_list_item, parent, false)
        return DetailsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: DetailsViewHolder, position: Int) {
        var currentDetails=detailsList.get(position)
        holder.tvName.text=currentDetails.name
        holder.tvTime.text=currentDetails.time
        holder.tvEmail.text=currentDetails.email
        holder.tvText.text=currentDetails.text
        holder.tvLike.text=currentDetails.like
        holder.tvComment.text=currentDetails.comment
        holder.tvRetweet.text=currentDetails.retweet
    }

    override fun getItemCount(): Int {
        return detailsList.size
    }
}

class DetailsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvTime = itemView.findViewById<TextView>(R.id.tvTime)
    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
    var tvText = itemView.findViewById<TextView>(R.id.tvText)
    var tvLike = itemView.findViewById<TextView>(R.id.tvLike)
    var tvComment = itemView.findViewById<TextView>(R.id.tvComment)
    var tvRetweet = itemView.findViewById<TextView>(R.id.tvRetweet)
    var ivProfile = itemView.findViewById<ImageView>(R.id.ivProfile)
    var ivLike = itemView.findViewById<ImageView>(R.id.ivLike)
    var ivComment = itemView.findViewById<ImageView>(R.id.ivComment)
    var ivRetweet = itemView.findViewById<ImageView>(R.id.ivRetweet)
}