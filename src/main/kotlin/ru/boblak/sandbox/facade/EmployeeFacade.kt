package ru.boblak.sandbox.facade

import ru.boblak.sandbox.pojo.model.EmployeeModel

interface EmployeeFacade {
    fun getEmployeeById(id: Long): EmployeeModel
}
