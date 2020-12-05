package goggxi.lecturerinforestfulapi.controller

import goggxi.lecturerinforestfulapi.model.WebResponse
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import java.sql.SQLIntegrityConstraintViolationException
import javax.validation.ConstraintViolationException

@RestControllerAdvice
class ErrorController {

    @ExceptionHandler(value = [ConstraintViolationException::class])
    fun validationHandler(constraintViolationException: SQLIntegrityConstraintViolationException): WebResponse<String> {
        return WebResponse(
                code = 400,
                status = "BAD REQUEST",
                data = constraintViolationException.message!!
        )
    }
}