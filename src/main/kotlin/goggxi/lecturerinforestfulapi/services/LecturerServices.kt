package goggxi.lecturerinforestfulapi.services

import goggxi.lecturerinforestfulapi.model.CreateLecturerRequest
import goggxi.lecturerinforestfulapi.model.LecturerResponse

interface LecturerServices {

    fun createLecturer(createLecturerRequest: CreateLecturerRequest) : LecturerResponse

}