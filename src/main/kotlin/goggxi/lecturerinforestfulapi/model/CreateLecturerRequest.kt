package goggxi.lecturerinforestfulapi.model

import java.util.*

data class CreateLecturerRequest (

    val id: Long,

    val noDosen: String,

    val nidn: String,

    val nama: String,

    val image: String,

    val gelar: String,

    val golongan: String,

    val tempatLahir: String,

    val tanggalLahir: Date,

    val jenisKelamin: String,

    val agama: String,

    val alamat: String,

    val telepon: String,

    val jenjangPendidikan: String,

    val bidangIlmu: String,

    val statusAktif: String,

    val ikatanKerja: String,

    val jabatanAkademik: String,
)