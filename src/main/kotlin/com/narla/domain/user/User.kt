package com.narla.domain.user

import jakarta.persistence.*

@Entity
class User constructor(
        var name: String,
        var email: String,

        @Enumerated(EnumType.STRING)
        @Column(nullable = false)
        val userRole: UserRole,

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,
) {
    init {
        if (name.isBlank()) {
            throw IllegalArgumentException("이름은 필수 값 입니다.")
        }
        if (email.isBlank()) {
            throw IllegalArgumentException("이메일은 필수 값 입니다.")
        }
    }


}