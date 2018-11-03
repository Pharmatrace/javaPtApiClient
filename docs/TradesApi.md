# TradesApi

All URIs are relative to *https://api.pharmatrace.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTrade**](TradesApi.md#addTrade) | **POST** /trades | 
[**deleteTrade**](TradesApi.md#deleteTrade) | **DELETE** /trades/{id} | 
[**findTradeById**](TradesApi.md#findTradeById) | **GET** /trades/{id} | 
[**findTrades**](TradesApi.md#findTrades) | **GET** /trades | 


<a name="addTrade"></a>
# **addTrade**
> Trade addTrade(trade)



Creates a new trade

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.public.ApiException;
//import io.pharmatrace.api.scin.public.api.TradesApi;


TradesApi apiInstance = new TradesApi();
Trade trade = new Trade(); // Trade | Trade to create
try {
    Trade result = apiInstance.addTrade(trade);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradesApi#addTrade");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trade** | [**Trade**](Trade.md)| Trade to create |

### Return type

[**Trade**](Trade.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTrade"></a>
# **deleteTrade**
> deleteTrade(id)



deletes a single trade based on the ID supplied

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.public.ApiException;
//import io.pharmatrace.api.scin.public.api.TradesApi;


TradesApi apiInstance = new TradesApi();
Long id = 56L; // Long | ID of trade to delete
try {
    apiInstance.deleteTrade(id);
} catch (ApiException e) {
    System.err.println("Exception when calling TradesApi#deleteTrade");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of trade to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findTradeById"></a>
# **findTradeById**
> Trade findTradeById(id)



Returns a trade based on the ID

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.public.ApiException;
//import io.pharmatrace.api.scin.public.api.TradesApi;


TradesApi apiInstance = new TradesApi();
Long id = 56L; // Long | ID of trade to fetch
try {
    Trade result = apiInstance.findTradeById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradesApi#findTradeById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of trade to fetch |

### Return type

[**Trade**](Trade.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findTrades"></a>
# **findTrades**
> List&lt;Trade&gt; findTrades(tags, limit)



Returns all trades from the system that the user has access to Nam sed condimentum est. Maecenas tempor sagittis sapien, nec rhoncus sem sagittis sit amet. Aenean at gravida augue, ac iaculis sem. Curabitur odio lorem, ornare eget elementum nec, cursus id lectus. Duis mi turpis, pulvinar ac eros ac, tincidunt varius justo. In hac habitasse platea dictumst. Integer at adipiscing ante, a sagittis ligula. Aenean pharetra tempor ante molestie imperdiet. Vivamus id aliquam diam. Cras quis velit non tortor eleifend sagittis. Praesent at enim pharetra urna volutpat venenatis eget eget mauris. In eleifend fermentum facilisis. Praesent enim enim, gravida ac sodales sed, placerat id erat. Suspendisse lacus dolor, consectetur non augue vel, vehicula interdum libero. Morbi euismod sagittis libero sed lacinia.  Sed tempus felis lobortis leo pulvinar rutrum. Nam mattis velit nisl, eu condimentum ligula luctus nec. Phasellus semper velit eget aliquet faucibus. In a mattis elit. Phasellus vel urna viverra, condimentum lorem id, rhoncus nibh. Ut pellentesque posuere elementum. Sed a varius odio. Morbi rhoncus ligula libero, vel eleifend nunc tristique vitae. Fusce et sem dui. Aenean nec scelerisque tortor. Fusce malesuada accumsan magna vel tempus. Quisque mollis felis eu dolor tristique, sit amet auctor felis gravida. Sed libero lorem, molestie sed nisl in, accumsan tempor nisi. Fusce sollicitudin massa ut lacinia mattis. Sed vel eleifend lorem. Pellentesque vitae felis pretium, pulvinar elit eu, euismod sapien. 

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.public.ApiException;
//import io.pharmatrace.api.scin.public.api.TradesApi;


TradesApi apiInstance = new TradesApi();
List<String> tags = Arrays.asList(); // List<String> | tags to filter by
Integer limit = 56; // Integer | maximum number of results to return
try {
    List<Trade> result = apiInstance.findTrades(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TradesApi#findTrades");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| maximum number of results to return | [optional]

### Return type

[**List&lt;Trade&gt;**](Trade.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

