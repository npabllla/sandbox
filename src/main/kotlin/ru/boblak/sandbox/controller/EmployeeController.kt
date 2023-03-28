package ru.boblak.sandbox.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.boblak.sandbox.facade.EmployeeFacade
import ru.boblak.sandbox.pojo.model.EmployeeModel

@Tag(name = "API для взаимодействия с сотрудниками")
@RestController
@RequestMapping("api/v1/employee")
class EmployeeController(
    private val employeeFacade: EmployeeFacade
) {

    @Operation(
        method = "GET",
        summary = "Получение сотрудника по id"
    )
    @GetMapping("/{id}")
    fun getEmployeeById(
        @PathVariable id: Long
    ): ResponseEntity<EmployeeModel> {
        return ResponseEntity.ok(
            employeeFacade.getEmployeeById(id)
        )
    }
}
