package goggxi.lecturerinforestfulapi.repository

import goggxi.lecturerinforestfulapi.entity.Lecturer
import org.springframework.data.jpa.repository.JpaRepository

interface LecturerRepository : JpaRepository<Lecturer, Long> {

}