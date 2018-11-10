# StakeholdersApi

All URIs are relative to *https://api.pharmatrace.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addStakeholder**](StakeholdersApi.md#addStakeholder) | **POST** /stakeholders | 
[**deleteStakeholder**](StakeholdersApi.md#deleteStakeholder) | **DELETE** /stakeholders/{id} | 
[**findStakeholderById**](StakeholdersApi.md#findStakeholderById) | **GET** /stakeholders/{id} | 
[**findStakeholders**](StakeholdersApi.md#findStakeholders) | **GET** /stakeholders | 


<a name="addStakeholder"></a>
# **addStakeholder**
> Stakeholder addStakeholder(stakeholder)



Creates a new stakeholder

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.StakeholdersApi;


StakeholdersApi apiInstance = new StakeholdersApi();
Stakeholder stakeholder = new Stakeholder(); // Stakeholder | Stakeholder to create
try {
    Stakeholder result = apiInstance.addStakeholder(stakeholder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StakeholdersApi#addStakeholder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stakeholder** | [**Stakeholder**](Stakeholder.md)| Stakeholder to create |

### Return type

[**Stakeholder**](Stakeholder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteStakeholder"></a>
# **deleteStakeholder**
> deleteStakeholder(id)



deletes a single stakeholder based on the ID supplied

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.StakeholdersApi;


StakeholdersApi apiInstance = new StakeholdersApi();
Long id = 56L; // Long | ID of stakeholder to delete
try {
    apiInstance.deleteStakeholder(id);
} catch (ApiException e) {
    System.err.println("Exception when calling StakeholdersApi#deleteStakeholder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of stakeholder to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findStakeholderById"></a>
# **findStakeholderById**
> Stakeholder findStakeholderById(id)



Returns a stakeholder based on the ID

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.StakeholdersApi;


StakeholdersApi apiInstance = new StakeholdersApi();
Long id = 56L; // Long | ID of stakeholder to fetch
try {
    Stakeholder result = apiInstance.findStakeholderById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StakeholdersApi#findStakeholderById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of stakeholder to fetch |

### Return type

[**Stakeholder**](Stakeholder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findStakeholders"></a>
# **findStakeholders**
> List&lt;Stakeholder&gt; findStakeholders(tags, limit)



Returns all stakeholders from the system that the user has access to Nam sed condimentum est. Maecenas tempor sagittis sapien, nec rhoncus sem sagittis sit amet. Aenean at gravida augue, ac iaculis sem. Curabitur odio lorem, ornare eget elementum nec, cursus id lectus. Duis mi turpis, pulvinar ac eros ac, tincidunt varius justo. In hac habitasse platea dictumst. Integer at adipiscing ante, a sagittis ligula. Aenean pharetra tempor ante molestie imperdiet. Vivamus id aliquam diam. Cras quis velit non tortor eleifend sagittis. Praesent at enim pharetra urna volutpat venenatis eget eget mauris. In eleifend fermentum facilisis. Praesent enim enim, gravida ac sodales sed, placerat id erat. Suspendisse lacus dolor, consectetur non augue vel, vehicula interdum libero. Morbi euismod sagittis libero sed lacinia.  Sed tempus felis lobortis leo pulvinar rutrum. Nam mattis velit nisl, eu condimentum ligula luctus nec. Phasellus semper velit eget aliquet faucibus. In a mattis elit. Phasellus vel urna viverra, condimentum lorem id, rhoncus nibh. Ut pellentesque posuere elementum. Sed a varius odio. Morbi rhoncus ligula libero, vel eleifend nunc tristique vitae. Fusce et sem dui. Aenean nec scelerisque tortor. Fusce malesuada accumsan magna vel tempus. Quisque mollis felis eu dolor tristique, sit amet auctor felis gravida. Sed libero lorem, molestie sed nisl in, accumsan tempor nisi. Fusce sollicitudin massa ut lacinia mattis. Sed vel eleifend lorem. Pellentesque vitae felis pretium, pulvinar elit eu, euismod sapien. 

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.StakeholdersApi;


StakeholdersApi apiInstance = new StakeholdersApi();
List<String> tags = Arrays.asList(); // List<String> | tags to filter by
Integer limit = 56; // Integer | maximum number of results to return
try {
    List<Stakeholder> result = apiInstance.findStakeholders(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StakeholdersApi#findStakeholders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| maximum number of results to return | [optional]

### Return type

[**List&lt;Stakeholder&gt;**](Stakeholder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

