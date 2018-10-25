# UserApi

All URIs are relative to *https://api.pharmatrace.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**meGet**](UserApi.md#meGet) | **GET** /me | User Profile


<a name="meGet"></a>
# **meGet**
> Profile meGet()

User Profile

The User Profile endpoint returns information about the PharmaTrace user that has authorized with the application.

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.public.ApiException;
//import io.pharmatrace.api.scin.public.api.UserApi;


UserApi apiInstance = new UserApi();
try {
    Profile result = apiInstance.meGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#meGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Profile**](Profile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

