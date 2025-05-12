package me.dio.credit_application_system.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import me.dio.credit_application_system.entity.Address
import me.dio.credit_application_system.entity.Customer
import org.hibernate.validator.constraints.br.CPF
import java.math.BigDecimal

data class CustomerDTO(
    @field:NotEmpty(message = "Invalid field") val firstName: String,
    @field:NotEmpty(message = "Invalid field") val lastName: String,
    @field:NotEmpty(message = "Invalid field")
    @field:CPF(message = "This invalid CPF") val cpf: String,
    @field:NotNull(message = "Field cannot be null") val income: BigDecimal,
    @field:Email(message = "Invalid email")
    @field:NotEmpty(message = "Invalid field") val email: String,
    @field:NotEmpty(message = "Invalid field") val password: String,
    @field:NotEmpty(message = "Invalid field") val zipCode: String,
    @field:NotEmpty(message = "Invalid field") val street: String,
) {
    fun toEntity(): Customer = Customer(
        firstName = firstName,
        lastName = lastName,
        cpf = cpf,
        income = income,
        email = email,
        password = password,
        address = Address(
            zipCode = this.zipCode,
            street = this.street
        )

    )
}
