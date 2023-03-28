package ru.boblak.sandbox.mapper.impl

import org.springframework.stereotype.Component
import ru.boblak.sandbox.mapper.EmployeeMapper
import ru.boblak.sandbox.pojo.entity.EmployeeEntity
import ru.boblak.sandbox.pojo.model.EmployeeModel
import ru.boblak.sandbox.pojo.model.EmploymentModel

@Component
class EmployeeMapperImpl : EmployeeMapper {
    override fun mapEmployeeEntityToModel(entity: EmployeeEntity): EmployeeModel {
        return EmployeeModel(
            id = entity.id,
            firstName = entity.firstName,
            lastName = entity.lastName,
            employments = entity.employments.map {
                EmploymentModel(
                    id = it.id,
                    login = it.login
                )
            }
        )
    }
}
