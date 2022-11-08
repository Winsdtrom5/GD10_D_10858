package com.example.gd10_d_10858.fragment

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gd10_d_10858.DetailMahasiswaActivity
import com.example.gd10_d_10858.databinding.ListDataMahasiswaBinding
import com.google.gson.annotations.SerializedName

class MahasiswaAdapter (
    private val listMahasiswa:ArrayList<MahasiswaData>,
    private val context: Context

):RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder>() {
    inner class
    MahasiswaViewHolder(item: ListDataMahasiswaBinding): RecyclerView.ViewHolder(item.root){
        private val binding = item
        fun bind(mahasiswaData: MahasiswaData){
            with(binding) {
                txtNim.text = mahasiswaData.nim
                txtNama.text = mahasiswaData.nama
                cvData.setOnClickListener {
                    var i = Intent(context,
                        DetailMahasiswaActivity::class.java).apply {
                        putExtra("nim",mahasiswaData.nim)
                    }
                    context.startActivity(i)
                }
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType:
    Int): MahasiswaViewHolder {
        return MahasiswaViewHolder(
            ListDataMahasiswaBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,false
        ))
    }
    override fun onBindViewHolder(holder: MahasiswaViewHolder,
                                  position: Int) {
        holder.bind(listMahasiswa[position])
    }
    override fun getItemCount(): Int = listMahasiswa.size
}
//Kemudian pada ResponseCreate.kt isikan seperti berikut :
class ResponseCreate (
    @SerializedName("status") val stt:Int,
    @SerializedName("error") val e:Boolean,
    @SerializedName("message") val pesan:String,
)