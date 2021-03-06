# ActivitysApi

All URIs are relative to *https://api.pharmatrace.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addActivity**](ActivitysApi.md#addActivity) | **POST** /activitys | 
[**deleteActivity**](ActivitysApi.md#deleteActivity) | **DELETE** /activitys/{id} | 
[**findActivityById**](ActivitysApi.md#findActivityById) | **GET** /activitys/{id} | 
[**findActivitys**](ActivitysApi.md#findActivitys) | **GET** /activitys | 


<a name="addActivity"></a>
# **addActivity**
> Activity addActivity(activity)



Creates a new activity

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.ActivitysApi;


ActivitysApi apiInstance = new ActivitysApi();
Activity activity = new Activity(); // Activity | Activity to create
try {
    Activity result = apiInstance.addActivity(activity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivitysApi#addActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activity** | [**Activity**](Activity.md)| Activity to create |

### Return type

[**Activity**](Activity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteActivity"></a>
# **deleteActivity**
> deleteActivity(id)



deletes a single activity based on the ID supplied

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.ActivitysApi;


ActivitysApi apiInstance = new ActivitysApi();
Long id = 56L; // Long | ID of activity to delete
try {
    apiInstance.deleteActivity(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivitysApi#deleteActivity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of activity to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findActivityById"></a>
# **findActivityById**
> Activity findActivityById(id)



Returns a activity based on the ID

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.ActivitysApi;


ActivitysApi apiInstance = new ActivitysApi();
Long id = 56L; // Long | ID of activity to fetch
try {
    Activity result = apiInstance.findActivityById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivitysApi#findActivityById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of activity to fetch |

### Return type

[**Activity**](Activity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findActivitys"></a>
# **findActivitys**
> List&lt;Activity&gt; findActivitys(tags, limit)



Returns all activitys from the system that the user has access to Nam sed condimentum est. Maecenas tempor sagittis sapien, nec rhoncus sem sagittis sit amet. Aenean at gravida augue, ac iaculis sem. Curabitur odio lorem, ornare eget elementum nec, cursus id lectus. Duis mi turpis, pulvinar ac eros ac, tincidunt varius justo. In hac habitasse platea dictumst. Integer at adipiscing ante, a sagittis ligula. Aenean pharetra tempor ante molestie imperdiet. Vivamus id aliquam diam. Cras quis velit non tortor eleifend sagittis. Praesent at enim pharetra urna volutpat venenatis eget eget mauris. In eleifend fermentum facilisis. Praesent enim enim, gravida ac sodales sed, placerat id erat. Suspendisse lacus dolor, consectetur non augue vel, vehicula interdum libero. Morbi euismod sagittis libero sed lacinia.  Sed tempus felis lobortis leo pulvinar rutrum. Nam mattis velit nisl, eu condimentum ligula luctus nec. Phasellus semper velit eget aliquet faucibus. In a mattis elit. Phasellus vel urna viverra, condimentum lorem id, rhoncus nibh. Ut pellentesque posuere elementum. Sed a varius odio. Morbi rhoncus ligula libero, vel eleifend nunc tristique vitae. Fusce et sem dui. Aenean nec scelerisque tortor. Fusce malesuada accumsan magna vel tempus. Quisque mollis felis eu dolor tristique, sit amet auctor felis gravida. Sed libero lorem, molestie sed nisl in, accumsan tempor nisi. Fusce sollicitudin massa ut lacinia mattis. Sed vel eleifend lorem. Pellentesque vitae felis pretium, pulvinar elit eu, euismod sapien. 

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.ActivitysApi;


ActivitysApi apiInstance = new ActivitysApi();
List<String> tags = Arrays.asList(); // List<String> | tags to filter by
Integer limit = 56; // Integer | maximum number of results to return
try {
    List<Activity> result = apiInstance.findActivitys(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ActivitysApi#findActivitys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| maximum number of results to return | [optional]

### Return type

[**List&lt;Activity&gt;**](Activity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

