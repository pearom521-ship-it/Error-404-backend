    package kh.edu.istad.restfulapi.dto;

public record UserCreateRequest(
        String username,
        String password,
        String fullName
) {
}
