package co.istad.roomrenting.features.auth.dto;

import lombok.Builder;

@Builder
public record JwtResponse(
        String tokenType,
        String accessToken,
        String refreshToken
) {
}
