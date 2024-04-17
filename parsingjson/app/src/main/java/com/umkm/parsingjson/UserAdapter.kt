package com.umkm.parsingjson

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.request.RequestOptions
import com.umkm.parsingjson.model.DataItem

class UserAdapter (private val users: MutableList<DataItem>):
    RecyclerView.Adapter<UserAdapter.ListViewHolder>()
{

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder{
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list_user,parent,false    )
        return ListViewHolder(
            view
        )
    }
    fun addUser(newUsers: DataItem) {
        users.add(newUsers)
        notifyItemInserted(users.lastIndex)
    }

    fun clear() {
        users.clear()
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: UserAdapter.ListViewHolder, position: Int) {
        val user = users[position]

        Glide.with(holder.itemView.context)
            .load(user.avatar)
            .apply(RequestOptions().override(80,80).placeholder(R.drawable.icon_avatar))
            .transform(CircleCrop())
            .into(holder.ivAvatar)

        holder.tvUserName.text = "${user.firstName} ${user.lastName}"
        holder.tvEmail.text = user.email
        holder.tvAlamat.text = user.alamat
        holder.tvIuranbln.text = user.iuran_bln
        holder.tvTotalIuran.text = user.total_iuran
        holder.tvTotalAkhir.text = user.total_akhir
        holder.tvPengeluaran.text = user.pengeluaran
        holder.tvRemark.text = user.remark

    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var tvUserName: TextView = itemView.findViewById(R.id.itemName)
        var tvEmail: TextView = itemView.findViewById(R.id.itemEmail)
        var ivAvatar: ImageView = itemView.findViewById(R.id.itemAvatar)
        var tvAlamat: TextView = itemView.findViewById(R.id.itemAlamat)
        var tvIuranbln: TextView = itemView.findViewById(R.id.itemIuranbln)
        var tvTotalIuran: TextView = itemView.findViewById(R.id.itemTotalIuran)
        var tvTotalAkhir: TextView = itemView.findViewById(R.id.itemTotalAkhir)
        var tvPengeluaran: TextView = itemView.findViewById(R.id.itemPengeluaran)
        var tvRemark: TextView = itemView.findViewById(R.id.itemRemark)


    }
}


