package co.istad.roomrenting.features.auth.dto;

import jakarta.validation.constraints.NotBlank;

public record VerifyRequest(
        @NotBlank
        String email,
        @NotBlank
        String verificationCode
) {
}
