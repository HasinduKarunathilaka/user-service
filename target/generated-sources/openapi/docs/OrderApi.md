# OrderApi

All URIs are relative to *http://localhost:8080/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getOrdersByUserId**](OrderApi.md#getOrdersByUserId) | **GET** /orders/user/{id} | get the list of orders |



## getOrdersByUserId

> List&lt;OrderDTO&gt; getOrdersByUserId(id)

get the list of orders

send request to orders table and retrieve all orders related one user

### Example

```java
// Import classes:
import com.Practice.user_service.client.ApiClient;
import com.Practice.user_service.client.ApiException;
import com.Practice.user_service.client.Configuration;
import com.Practice.user_service.client.models.*;
import com.Practice.user_service.client.api.OrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080/api");

        OrderApi apiInstance = new OrderApi(defaultClient);
        Long id = 56L; // Long | The unique identifier of the user
        try {
            List<OrderDTO> result = apiInstance.getOrdersByUserId(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#getOrdersByUserId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Long**| The unique identifier of the user | |

### Return type

[**List&lt;OrderDTO&gt;**](OrderDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order details retrieved successfully. |  -  |
| **404** | Order not found. |  -  |

