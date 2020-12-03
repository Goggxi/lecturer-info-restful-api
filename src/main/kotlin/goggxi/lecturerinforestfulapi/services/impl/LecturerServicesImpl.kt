package goggxi.lecturerinforestfulapi.services.impl

import goggxi.lecturerinforestfulapi.entity.Lecturer
import goggxi.lecturerinforestfulapi.model.CreateLecturerRequest
import goggxi.lecturerinforestfulapi.model.LecturerResponse
import goggxi.lecturerinforestfulapi.repository.LecturerRepository
import goggxi.lecturerinforestfulapi.services.LecturerServices
import org.springframework.stereotype.Service
import java.util.*

@Service
class LecturerServicesImpl(val lecturerRepository: LecturerRepository) : LecturerServices{

    override fun createLecturer(createLecturerRequest: CreateLecturerRequest): LecturerResponse {
        val lecturer = Lecturer(
                id = createLecturerRequest.id,
                noDosen = createLecturerRequest.noDosen,
                nidn = createLecturerRequest.nidn,
                nama = createLecturerRequest.nama,
                image = createLecturerRequest.image,
                gelar = createLecturerRequest.gelar,
                golongan = createLecturerRequest.golongan,
                tempatLahir = createLecturerRequest.tempatLahir,
                tanggalLahir = createLecturerRequest.tanggalLahir,
                jenisKelamin = createLecturerRequest.jenisKelamin,
                agama = createLecturerRequest.agama,
                alamat = createLecturerRequest.alamat,
                telepon = createLecturerRequest.telepon,
                jenjangPendidikan = createLecturerRequest.jenjangPendidikan,
                bidangIlmu = createLecturerRequest.bidangIlmu,
                statusAktif = createLecturerRequest.statusAktif,
                ikatanKerja = createLecturerRequest.ikatanKerja,
                jabatanAkademik = createLecturerRequest.jabatanAkademik,
                createdAt = Date(),
                updatedAt = null
        )

        lecturerRepository.save(lecturer)

        return LecturerResponse(
                id = lecturer.id,
                noDosen = lecturer.noDosen,
                nidn = lecturer.nidn,
                nama = lecturer.nama,
                image = lecturer.image,
                gelar = lecturer.gelar,
                golongan = lecturer.golongan,
                tempatLahir = lecturer.tempatLahir,
                tanggalLahir = lecturer.tanggalLahir,
                jenisKelamin = lecturer.jenisKelamin,
                agama = lecturer.agama,
                alamat = lecturer.alamat,
                telepon = lecturer.telepon,
                jenjangPendidikan = lecturer.jenjangPendidikan,
                bidangIlmu = lecturer.bidangIlmu,
                statusAktif = lecturer.statusAktif,
                ikatanKerja = lecturer.ikatanKerja,
                jabatanAkademik = lecturer.jabatanAkademik,
                createdAt = lecturer.createdAt,
                updatedAt = lecturer.updatedAt
        )
    }
}