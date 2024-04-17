package com.umkm.parsingjson.model

import com.google.gson.annotations.SerializedName

data class DataItem(
    @field: SerializedName("id")
    val id: Int? = null,

    @field: SerializedName("email")
    val email: String? = null,

    @field: SerializedName("first_name")
    val firstName: String? = null,

    @field: SerializedName("last_name")
    val lastName: String? = null,

    @field: SerializedName("avatar")
    val avatar: String? = null,

    @field: SerializedName("alamat_rumah")
    val alamat: String? = null,

    @field: SerializedName("iuran_bln")
    val iuran_bln: String? = null,

    @field: SerializedName("total_iuran")
    val total_iuran: String? = null,

    @field: SerializedName("total_akhir")
    val total_akhir: String? = null,

   @field: SerializedName("pengeluaran")
    val pengeluaran: String? = null,

    @field: SerializedName("remark")
    val remark: String? = null

)
