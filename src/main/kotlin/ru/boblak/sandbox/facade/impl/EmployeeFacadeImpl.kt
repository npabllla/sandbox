package ru.boblak.sandbox.facade.impl

import org.springframework.stereotype.Service
import ru.boblak.sandbox.facade.EmployeeFacade
import ru.boblak.sandbox.mapper.EmployeeMapper
import ru.boblak.sandbox.pojo.model.EmployeeModel
import ru.boblak.sandbox.service.EmployeeService

@Service
class EmployeeFacadeImpl(
    private val employeeService: EmployeeService,
    private val employeeMapper: EmployeeMapper
) : EmployeeFacade {
    override fun getEmployeeById(id: Long): EmployeeModel {
        val employeeEntity = employeeService.getEmployeeById(id)

        return employeeMapper.mapEmployeeEntityToModel(
            entity = employeeEntity
        )
    }
}
