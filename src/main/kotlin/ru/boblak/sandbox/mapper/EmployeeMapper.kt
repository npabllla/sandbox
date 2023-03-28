package ru.boblak.sandbox.mapper

import ru.boblak.sandbox.pojo.entity.EmployeeEntity
import ru.boblak.sandbox.pojo.model.EmployeeModel

interface EmployeeMapper {
    fun mapEmployeeEntityToModel(entity: EmployeeEntity): EmployeeModel
}
