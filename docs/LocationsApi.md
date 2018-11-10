# LocationsApi

All URIs are relative to *https://api.pharmatrace.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addLocation**](LocationsApi.md#addLocation) | **POST** /locations | 
[**deleteLocation**](LocationsApi.md#deleteLocation) | **DELETE** /locations/{id} | 
[**findLocationById**](LocationsApi.md#findLocationById) | **GET** /locations/{id} | 
[**findLocations**](LocationsApi.md#findLocations) | **GET** /locations | 


<a name="addLocation"></a>
# **addLocation**
> Location addLocation(location)



Creates a new location

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.LocationsApi;


LocationsApi apiInstance = new LocationsApi();
Location location = new Location(); // Location | Location to create
try {
    Location result = apiInstance.addLocation(location);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#addLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **location** | [**Location**](Location.md)| Location to create |

### Return type

[**Location**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLocation"></a>
# **deleteLocation**
> deleteLocation(id)



deletes a single location based on the ID supplied

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.LocationsApi;


LocationsApi apiInstance = new LocationsApi();
Long id = 56L; // Long | ID of location to delete
try {
    apiInstance.deleteLocation(id);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#deleteLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of location to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findLocationById"></a>
# **findLocationById**
> Location findLocationById(id)



Returns a location based on the ID

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.LocationsApi;


LocationsApi apiInstance = new LocationsApi();
Long id = 56L; // Long | ID of location to fetch
try {
    Location result = apiInstance.findLocationById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#findLocationById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of location to fetch |

### Return type

[**Location**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findLocations"></a>
# **findLocations**
> List&lt;Location&gt; findLocations(tags, limit)



Returns all locations from the system that the user has access to Nam sed condimentum est. Maecenas tempor sagittis sapien, nec rhoncus sem sagittis sit amet. Aenean at gravida augue, ac iaculis sem. Curabitur odio lorem, ornare eget elementum nec, cursus id lectus. Duis mi turpis, pulvinar ac eros ac, tincidunt varius justo. In hac habitasse platea dictumst. Integer at adipiscing ante, a sagittis ligula. Aenean pharetra tempor ante molestie imperdiet. Vivamus id aliquam diam. Cras quis velit non tortor eleifend sagittis. Praesent at enim pharetra urna volutpat venenatis eget eget mauris. In eleifend fermentum facilisis. Praesent enim enim, gravida ac sodales sed, placerat id erat. Suspendisse lacus dolor, consectetur non augue vel, vehicula interdum libero. Morbi euismod sagittis libero sed lacinia.  Sed tempus felis lobortis leo pulvinar rutrum. Nam mattis velit nisl, eu condimentum ligula luctus nec. Phasellus semper velit eget aliquet faucibus. In a mattis elit. Phasellus vel urna viverra, condimentum lorem id, rhoncus nibh. Ut pellentesque posuere elementum. Sed a varius odio. Morbi rhoncus ligula libero, vel eleifend nunc tristique vitae. Fusce et sem dui. Aenean nec scelerisque tortor. Fusce malesuada accumsan magna vel tempus. Quisque mollis felis eu dolor tristique, sit amet auctor felis gravida. Sed libero lorem, molestie sed nisl in, accumsan tempor nisi. Fusce sollicitudin massa ut lacinia mattis. Sed vel eleifend lorem. Pellentesque vitae felis pretium, pulvinar elit eu, euismod sapien. 

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.LocationsApi;


LocationsApi apiInstance = new LocationsApi();
List<String> tags = Arrays.asList(); // List<String> | tags to filter by
Integer limit = 56; // Integer | maximum number of results to return
try {
    List<Location> result = apiInstance.findLocations(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocationsApi#findLocations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| maximum number of results to return | [optional]

### Return type

[**List&lt;Location&gt;**](Location.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

