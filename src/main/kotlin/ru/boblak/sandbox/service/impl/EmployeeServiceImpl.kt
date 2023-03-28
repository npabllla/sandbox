package ru.boblak.sandbox.service.impl

import org.springframework.stereotype.Service
import ru.boblak.sandbox.config.messages.MessageConstants
import ru.boblak.sandbox.exception.NotFoundException
import ru.boblak.sandbox.pojo.entity.EmployeeEntity
import ru.boblak.sandbox.repository.EmployeeRepository
import ru.boblak.sandbox.service.EmployeeService

@Service
class EmployeeServiceImpl(
    private val employeeRepository: EmployeeRepository
) : EmployeeService {
    override fun getEmployeeById(id: Long): EmployeeEntity {
        return employeeRepository.findById(id).orElseThrow {
            NotFoundException(
                message = "Employee with id = $id not found",
                code = MessageConstants.EMPLOYEE_NOT_FOUND
            )
        }
    }
}
