# ProfilesApi

All URIs are relative to *https://api.pharmatrace.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addProfile**](ProfilesApi.md#addProfile) | **POST** /profiles | 
[**deleteProfile**](ProfilesApi.md#deleteProfile) | **DELETE** /profiles/{id} | 
[**findProfileById**](ProfilesApi.md#findProfileById) | **GET** /profiles/{id} | 
[**findProfiles**](ProfilesApi.md#findProfiles) | **GET** /profiles | 


<a name="addProfile"></a>
# **addProfile**
> Profile addProfile(profile)



Creates a new profile

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.ProfilesApi;


ProfilesApi apiInstance = new ProfilesApi();
Profile profile = new Profile(); // Profile | Profile to create
try {
    Profile result = apiInstance.addProfile(profile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#addProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **profile** | [**Profile**](Profile.md)| Profile to create |

### Return type

[**Profile**](Profile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProfile"></a>
# **deleteProfile**
> deleteProfile(id)



deletes a single profile based on the ID supplied

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.ProfilesApi;


ProfilesApi apiInstance = new ProfilesApi();
Long id = 56L; // Long | ID of profile to delete
try {
    apiInstance.deleteProfile(id);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#deleteProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of profile to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findProfileById"></a>
# **findProfileById**
> Profile findProfileById(id)



Returns a profile based on the ID

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.ProfilesApi;


ProfilesApi apiInstance = new ProfilesApi();
Long id = 56L; // Long | ID of profile to fetch
try {
    Profile result = apiInstance.findProfileById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#findProfileById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of profile to fetch |

### Return type

[**Profile**](Profile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findProfiles"></a>
# **findProfiles**
> List&lt;Profile&gt; findProfiles(tags, limit)



Returns all profiles from the system that the user has access to Nam sed condimentum est. Maecenas tempor sagittis sapien, nec rhoncus sem sagittis sit amet. Aenean at gravida augue, ac iaculis sem. Curabitur odio lorem, ornare eget elementum nec, cursus id lectus. Duis mi turpis, pulvinar ac eros ac, tincidunt varius justo. In hac habitasse platea dictumst. Integer at adipiscing ante, a sagittis ligula. Aenean pharetra tempor ante molestie imperdiet. Vivamus id aliquam diam. Cras quis velit non tortor eleifend sagittis. Praesent at enim pharetra urna volutpat venenatis eget eget mauris. In eleifend fermentum facilisis. Praesent enim enim, gravida ac sodales sed, placerat id erat. Suspendisse lacus dolor, consectetur non augue vel, vehicula interdum libero. Morbi euismod sagittis libero sed lacinia.  Sed tempus felis lobortis leo pulvinar rutrum. Nam mattis velit nisl, eu condimentum ligula luctus nec. Phasellus semper velit eget aliquet faucibus. In a mattis elit. Phasellus vel urna viverra, condimentum lorem id, rhoncus nibh. Ut pellentesque posuere elementum. Sed a varius odio. Morbi rhoncus ligula libero, vel eleifend nunc tristique vitae. Fusce et sem dui. Aenean nec scelerisque tortor. Fusce malesuada accumsan magna vel tempus. Quisque mollis felis eu dolor tristique, sit amet auctor felis gravida. Sed libero lorem, molestie sed nisl in, accumsan tempor nisi. Fusce sollicitudin massa ut lacinia mattis. Sed vel eleifend lorem. Pellentesque vitae felis pretium, pulvinar elit eu, euismod sapien. 

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.ProfilesApi;


ProfilesApi apiInstance = new ProfilesApi();
List<String> tags = Arrays.asList(); // List<String> | tags to filter by
Integer limit = 56; // Integer | maximum number of results to return
try {
    List<Profile> result = apiInstance.findProfiles(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#findProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| maximum number of results to return | [optional]

### Return type

[**List&lt;Profile&gt;**](Profile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

