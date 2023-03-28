package ru.boblak.sandbox.pojo.entity

import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.OneToMany
import jakarta.persistence.Table
import ru.boblak.sandbox.pojo.entity.base.DBConstants
import ru.boblak.sandbox.pojo.entity.base.Identifiable

@Entity
@Table(name = DBConstants.Tables.EMPLOYEE)
class EmployeeEntity(
    @Column(name = "first_name")
    var firstName: String,

    @Column(name = "last_name")
    var lastName: String
) : Identifiable<Long>() {

    @OneToMany(
        mappedBy = "employee",
        cascade = [CascadeType.ALL],
        orphanRemoval = true,
        fetch = FetchType.LAZY
    )
    private val _employments: MutableSet<EmploymentEntity> = mutableSetOf()

    val employments
        get() = _employments.toList()

    fun addEmployment(employmentEntity: EmploymentEntity): EmploymentEntity {
        _employments.add(employmentEntity)
        employmentEntity.employee = this
        return employmentEntity
    }

    fun removeEmployment(employmentEntity: EmploymentEntity): Boolean {
        return _employments.remove(employmentEntity)
    }
}
