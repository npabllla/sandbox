package ru.boblak.sandbox.pojo.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import ru.boblak.sandbox.pojo.entity.base.DBConstants
import ru.boblak.sandbox.pojo.entity.base.Identifiable

@Entity
@Table(name = DBConstants.Tables.EMPLOYMENT)
class EmploymentEntity(
    @Column(name = "login")
    var login: String,

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    var employee: EmployeeEntity
) : Identifiable<Long>()
