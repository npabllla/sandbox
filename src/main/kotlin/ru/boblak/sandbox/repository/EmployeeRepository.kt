package ru.boblak.sandbox.repository

import org.springframework.data.jpa.repository.JpaRepository
import ru.boblak.sandbox.pojo.entity.EmployeeEntity

interface EmployeeRepository : JpaRepository<EmployeeEntity, Long>
