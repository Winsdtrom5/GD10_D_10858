package fragment;

import android.content.Context;

import java.util.ArrayList;

class MahasiswaAdapter (
        private val listMahasiswa:ArrayList<MahasiswaData>,
        private val context:Context

        ):RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder>() {
    inner class MahasiswaViewHolder(item:ListDataMahasiswaBinding):RecyclerView.V
        iewHolder(item.root){
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
        return
        MahasiswaViewHolder(ListDataMahasiswaBinding.inflate(LayoutInflat
        er.from(parent.context),
        parent,false
        ))
        }
        override fun onBindViewHolder(holder: MahasiswaViewHolder,
        position: Int) {
        holder.bind(listMahasiswa[position])
        }
        override fun getItemCount(): Int = listMahasiswa.size
        }
