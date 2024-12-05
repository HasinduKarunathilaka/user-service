package com.Practice.user_service.server.api;

import com.Practice.user_service.server.model.Response;
import com.Practice.user_service.server.model.UserDTO;
import com.Practice.user_service.server.model.UserOrderResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.http.codec.multipart.Part;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

/**
 * A delegate to be called by the {@link UsersApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-05T09:38:24.428926841+05:30[Asia/Colombo]")
public interface UsersApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /users : Add Users
     * Add user to users table
     *
     * @param userDTO Add user details to create a new user (required)
     * @return User Added successfully (status code 200)
     *         or Invalid user inputs (status code 404)
     *         or Internal server error (status code 500)
     * @see UsersApi#addUser
     */
    default Mono<ResponseEntity<Response>> addUser(Mono<UserDTO> userDTO,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"message\" : \"message\", \"responseCode\" : \"responseCode\", \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
        }
        return result.then(userDTO).then(Mono.empty());

    }

    /**
     * DELETE /users/remove/{id} : Delete user by id
     * Delete user by their unique id
     *
     * @param id The unique identifier of the user. (required)
     * @return User deleted successfully. (status code 200)
     *         or User not found. (status code 404)
     *         or Internal server error. (status code 500)
     * @see UsersApi#deleteUser
     */
    default Mono<ResponseEntity<Response>> deleteUser(Long id,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"message\" : \"message\", \"responseCode\" : \"responseCode\", \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }

    /**
     * GET /users/all : Get All Users
     * Retrieve details of all users.
     *
     * @return User details retrieved successfully. (status code 200)
     *         or User not found. (status code 404)
     * @see UsersApi#getAllUsers
     */
    default Mono<ResponseEntity<Flux<UserDTO>>> getAllUsers(ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "[ { \"user_id\" : 0, \"user_name\" : \"user_name\", \"email\" : \"email\" }, { \"user_id\" : 0, \"user_name\" : \"user_name\", \"email\" : \"email\" } ]";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }

    /**
     * GET /users/{id} : Get User by ID
     * Retrieve details of a user by their unique ID.
     *
     * @param id The unique identifier of the user. (required)
     * @return User details retrieved successfully. (status code 200)
     *         or User not found. (status code 404)
     * @see UsersApi#getUserById
     */
    default Mono<ResponseEntity<UserDTO>> getUserById(Long id,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"user_id\" : 0, \"user_name\" : \"user_name\", \"email\" : \"email\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }

    /**
     * GET /users/order-details/{id} : Get User details with Order details
     * Retrieve user details and their associated orders by user ID.
     *
     * @param id The unique identifier of the user. (required)
     * @return User details with orders retrieved successfully. (status code 200)
     *         or User or orders not found. (status code 404)
     *         or Internal server error. (status code 500)
     * @see UsersApi#getUserWithOrderDetails
     */
    default Mono<ResponseEntity<UserOrderResponse>> getUserWithOrderDetails(Long id,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"orders\" : [ { \"quantity\" : 1, \"user_id\" : 6, \"price\" : 0.5962133916683182, \"order_id\" : 0, \"product_name\" : \"product_name\" }, { \"quantity\" : 1, \"user_id\" : 6, \"price\" : 0.5962133916683182, \"order_id\" : 0, \"product_name\" : \"product_name\" } ], \"user\" : { \"user_id\" : 0, \"user_name\" : \"user_name\", \"email\" : \"email\" } }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }

    /**
     * PUT /users/update/{id} : Update User by ID
     * Update the details of a user by their unique ID.
     *
     * @param id The unique identifier of the user. (required)
     * @param userDTO The updated user details. (required)
     * @return User updated successfully. (status code 200)
     *         or User not found. (status code 404)
     *         or Invalid input. (status code 400)
     *         or Internal server error. (status code 500)
     * @see UsersApi#updateUser
     */
    default Mono<ResponseEntity<Response>> updateUser(Long id,
        Mono<UserDTO> userDTO,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"message\" : \"message\", \"responseCode\" : \"responseCode\", \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
        }
        return result.then(userDTO).then(Mono.empty());

    }

}
