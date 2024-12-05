package com.Practice.user_service.server.model;

import java.net.URI;
import java.util.Objects;
import com.Practice.user_service.server.model.OrderDTO;
import com.Practice.user_service.server.model.UserDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UserOrderResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-05T09:38:24.428926841+05:30[Asia/Colombo]")
public class UserOrderResponse {

  private UserDTO user;

  @Valid
  private List<@Valid OrderDTO> orders;

  public UserOrderResponse user(UserDTO user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  @Valid 
  @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user")
  public UserDTO getUser() {
    return user;
  }

  public void setUser(UserDTO user) {
    this.user = user;
  }

  public UserOrderResponse orders(List<@Valid OrderDTO> orders) {
    this.orders = orders;
    return this;
  }

  public UserOrderResponse addOrdersItem(OrderDTO ordersItem) {
    if (this.orders == null) {
      this.orders = new ArrayList<>();
    }
    this.orders.add(ordersItem);
    return this;
  }

  /**
   * Get orders
   * @return orders
  */
  @Valid 
  @Schema(name = "orders", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orders")
  public List<@Valid OrderDTO> getOrders() {
    return orders;
  }

  public void setOrders(List<@Valid OrderDTO> orders) {
    this.orders = orders;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserOrderResponse userOrderResponse = (UserOrderResponse) o;
    return Objects.equals(this.user, userOrderResponse.user) &&
        Objects.equals(this.orders, userOrderResponse.orders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, orders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserOrderResponse {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

