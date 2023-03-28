package ru.boblak.sandbox.repository

import org.springframework.data.jpa.repository.JpaRepository
import ru.boblak.sandbox.pojo.entity.EmploymentEntity

interface EmploymentRepository : JpaRepository<EmploymentEntity, Long>
