package ru.boblak.sandbox.service

import ru.boblak.sandbox.pojo.entity.EmployeeEntity

interface EmployeeService {
    fun getEmployeeById(id: Long): EmployeeEntity
}
