package kh.edu.istad.restfulapi.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;

@Builder
public record ApiErrorResponse<T>(
        String message,
        String code,

        @JsonInclude(JsonInclude.Include.NON_NULL)
        T data
) {
}