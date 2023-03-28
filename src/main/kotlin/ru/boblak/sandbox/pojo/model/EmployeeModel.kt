package ru.boblak.sandbox.pojo.model

data class EmployeeModel(
    val id: Long,
    val lastName: String,
    val firstName: String,
    val employments: List<EmploymentModel>
)
