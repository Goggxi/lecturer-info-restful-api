package goggxi.lecturerinforestfulapi.model

import java.util.*
import javax.validation.constraints.NotBlank

data class CreateLecturerRequest (

    @field:NotBlank
    val id: Long?,

    @field:NotBlank
    val noDosen: String?,

    @field:NotBlank
    val nidn: String?,

    @field:NotBlank
    val nama: String?,

    @field:NotBlank
    val image: String?,

    @field:NotBlank
    val gelar: String?,

    @field:NotBlank
    val golongan: String?,

    @field:NotBlank
    val tempatLahir: String?,

    @field:NotBlank
    val tanggalLahir: Date?,

    @field:NotBlank
    val jenisKelamin: String?,

    @field:NotBlank
    val agama: String?,

    @field:NotBlank
    val alamat: String?,

    @field:NotBlank
    val telepon: String?,

    @field:NotBlank
    val jenjangPendidikan: String?,

    @field:NotBlank
    val bidangIlmu: String?,

    @field:NotBlank
    val statusAktif: String?,

    @field:NotBlank
    val ikatanKerja: String?,

    @field:NotBlank
    val jabatanAkademik: String?,
)