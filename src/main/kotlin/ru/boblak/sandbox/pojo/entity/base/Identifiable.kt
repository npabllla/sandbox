package ru.boblak.sandbox.pojo.entity.base

import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass
import java.io.Serializable

@MappedSuperclass
abstract class Identifiable<T : Serializable>(
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var _id: T? = null
) {
    val id
        get() = _id ?: throw IllegalStateException("Entity not persisted: id is null. Use nullableId getter if u need")

    val nullableId
        get() = _id

    override fun equals(other: Any?): Boolean {
        other ?: return false

        if (this === other) return true
        if (javaClass != other.javaClass) return false

        other as Identifiable<*>

        return if (this._id == null) false else this._id == other._id
    }

    override fun hashCode(): Int {
        return Identifiable<*>::javaClass.hashCode()
    }
}
