package com.example.uaspemrogramanmobile_abdi.Data


import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.uaspemrogramanmobile_abdi.DetailActivity
import com.example.uaspemrogramanmobile_abdi.databinding.ItemListKabkotaBinding

class ListKabKotaAdapter(private val listKabKota: ArrayList<KabKota>):
    RecyclerView.Adapter<ListKabKotaAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: KabKota)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding = ItemListKabkotaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (nama, lokasi, detail, rating, ulasan, gambar) = listKabKota[position]
        Glide.with(holder.binding.imgItemPhoto.context)
            .load(gambar)
            .apply(RequestOptions().override(55, 55))
            .into(holder.binding.imgItemPhoto)
        holder.binding.tvItemName.text = nama
        holder.binding.tvItemDetail.text = "Lokasi " + lokasi
        holder.binding.tvItemRating.text = "rating " + rating.toDouble()
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listKabKota[holder.adapterPosition]) }

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra("EXTRA_KABKOTA", listKabKota[holder.adapterPosition])
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = listKabKota.size

    inner class ListViewHolder(val binding: ItemListKabkotaBinding) : RecyclerView.ViewHolder(binding.root)
}