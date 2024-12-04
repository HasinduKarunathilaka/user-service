package com.Practice.user_service.client.api;

import com.Practice.user_service.client.ApiClient;

import com.Practice.user_service.client.model.OrderDTO;
import com.Practice.user_service.client.model.Response;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-04T16:19:02.838542510+05:30[Asia/Colombo]")
public class OrderApi {
    private ApiClient apiClient;

    public OrderApi() {
        this(new ApiClient());
    }

    @Autowired
    public OrderApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * get the list of orders
     * send request to orders table and retrieve all orders related one user
     * <p><b>200</b> - Order details retrieved successfully.
     * <p><b>404</b> - Order not found.
     * @param id The unique identifier of the user
     * @return List&lt;OrderDTO&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getOrdersByUserIdRequestCreation(Long id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getOrdersByUserId", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<OrderDTO> localVarReturnType = new ParameterizedTypeReference<OrderDTO>() {};
        return apiClient.invokeAPI("/orders/user/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * get the list of orders
     * send request to orders table and retrieve all orders related one user
     * <p><b>200</b> - Order details retrieved successfully.
     * <p><b>404</b> - Order not found.
     * @param id The unique identifier of the user
     * @return List&lt;OrderDTO&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<OrderDTO> getOrdersByUserId(Long id) throws WebClientResponseException {
        ParameterizedTypeReference<OrderDTO> localVarReturnType = new ParameterizedTypeReference<OrderDTO>() {};
        return getOrdersByUserIdRequestCreation(id).bodyToFlux(localVarReturnType);
    }

    /**
     * get the list of orders
     * send request to orders table and retrieve all orders related one user
     * <p><b>200</b> - Order details retrieved successfully.
     * <p><b>404</b> - Order not found.
     * @param id The unique identifier of the user
     * @return ResponseEntity&lt;List&lt;OrderDTO&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<OrderDTO>>> getOrdersByUserIdWithHttpInfo(Long id) throws WebClientResponseException {
        ParameterizedTypeReference<OrderDTO> localVarReturnType = new ParameterizedTypeReference<OrderDTO>() {};
        return getOrdersByUserIdRequestCreation(id).toEntityList(localVarReturnType);
    }

    /**
     * get the list of orders
     * send request to orders table and retrieve all orders related one user
     * <p><b>200</b> - Order details retrieved successfully.
     * <p><b>404</b> - Order not found.
     * @param id The unique identifier of the user
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getOrdersByUserIdWithResponseSpec(Long id) throws WebClientResponseException {
        return getOrdersByUserIdRequestCreation(id);
    }
}
