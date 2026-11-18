package com.veltix.praktikum3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class MahasiswaAdapter(
    context: Context,
    private val listMahasiswa: List<Mahasiswa>
) : ArrayAdapter<Mahasiswa>(context, 0, listMahasiswa) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.item_mahasiswa, parent, false)
        val mhs = listMahasiswa[position]

        val tvNama = view.findViewById<TextView>(R.id.tvNama)
        val tvSub = view.findViewById<TextView>(R.id.tvSub)

        tvNama.text = mhs.nama
        tvSub.text = "${mhs.nim} • ${mhs.jurusan}"

        return view
    }
}