package goggxi.lecturerinforestfulapi.controller

import goggxi.lecturerinforestfulapi.model.CreateLecturerRequest
import goggxi.lecturerinforestfulapi.model.LecturerResponse
import goggxi.lecturerinforestfulapi.model.WebResponse
import goggxi.lecturerinforestfulapi.services.LecturerServices
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class LecturerController(val lecturerServices: LecturerServices) {

    @PostMapping(
            value = ["/api/lecturers"],
            produces = ["application/json"],
            consumes = ["application/json"]
    )
    fun createLecturer(@RequestBody createLecturerRequest: CreateLecturerRequest): WebResponse<LecturerResponse>
    {
        val lecturerResponse = lecturerServices.createLecturer(createLecturerRequest)

        return WebResponse(
                code = 200,
                status = "OK",
                data = lecturerResponse
        )
    }
}