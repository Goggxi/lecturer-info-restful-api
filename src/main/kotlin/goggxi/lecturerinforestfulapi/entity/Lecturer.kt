package goggxi.lecturerinforestfulapi.entity

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "lecturer")
data class Lecturer (

        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        val id: Long,

        @Column(name="no_dosen")
        val noDosen: String,

        @Column(name="nidn")
        val nidn: String,

        @Column(name="nama")
        val nama: String,

        @Column(name="image")
        val image: String,

        @Column(name="gelar")
        val gelar: String,

        @Column(name="golongan")
        val golongan: String,

        @Column(name="tempat_lahir")
        val tempatLahir: String,

        @Column(name="tanggal_lahir")
        val tanggalLahir: Date,

        @Column(name="jenis_kelamin")
        val jenisKelamin: String,

        @Column(name="agama")
        val agama: String,

        @Column(name="alamat")
        val alamat: String,

        @Column(name="telepon")
        val telepon: String,

        @Column(name="jenjang_pendidikan")
        val jenjangPendidikan: String,

        @Column(name="bidang_ilmu")
        val bidangIlmu: String,

        @Column(name="status_aktif")
        val statusAktif: String,

        @Column(name="ikatan_kerja")
        val ikatanKerja: String,

        @Column(name="jabatan_akademik")
        val jabatanAkademik: String,

        @Column(name="created_at")
        val createdAt: Date,

        @Column(name="updated_at")
        val updatedAt:Date?
)