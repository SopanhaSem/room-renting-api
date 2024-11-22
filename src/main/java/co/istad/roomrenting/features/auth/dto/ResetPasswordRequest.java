package co.istad.roomrenting.features.auth.dto;

import jakarta.validation.constraints.NotBlank;

public record ResetPasswordRequest(
        @NotBlank String email,
        @NotBlank String resetCode,
        @NotBlank String newPassword,
        @NotBlank String confirmPassword
) {
}
