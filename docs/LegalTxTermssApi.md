# LegalTxTermssApi

All URIs are relative to *https://api.pharmatrace.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addLegalTxTerms**](LegalTxTermssApi.md#addLegalTxTerms) | **POST** /legaltxtermss | 
[**deleteLegalTxTerms**](LegalTxTermssApi.md#deleteLegalTxTerms) | **DELETE** /legaltxtermss/{id} | 
[**findLegalTxTermss**](LegalTxTermssApi.md#findLegalTxTermss) | **GET** /legaltxtermss | 
[**findLegaltxtermsById**](LegalTxTermssApi.md#findLegaltxtermsById) | **GET** /legaltxtermss/{id} | 


<a name="addLegalTxTerms"></a>
# **addLegalTxTerms**
> LegalTxTerms addLegalTxTerms(legalTxTerms)



Creates a new legaltxterms

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.LegalTxTermssApi;


LegalTxTermssApi apiInstance = new LegalTxTermssApi();
LegalTxTerms legalTxTerms = new LegalTxTerms(); // LegalTxTerms | LegalTxTerms to create
try {
    LegalTxTerms result = apiInstance.addLegalTxTerms(legalTxTerms);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LegalTxTermssApi#addLegalTxTerms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **legalTxTerms** | [**LegalTxTerms**](LegalTxTerms.md)| LegalTxTerms to create |

### Return type

[**LegalTxTerms**](LegalTxTerms.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLegalTxTerms"></a>
# **deleteLegalTxTerms**
> deleteLegalTxTerms(id)



deletes a single legaltxterms based on the ID supplied

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.LegalTxTermssApi;


LegalTxTermssApi apiInstance = new LegalTxTermssApi();
Long id = 56L; // Long | ID of legaltxterms to delete
try {
    apiInstance.deleteLegalTxTerms(id);
} catch (ApiException e) {
    System.err.println("Exception when calling LegalTxTermssApi#deleteLegalTxTerms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of legaltxterms to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findLegalTxTermss"></a>
# **findLegalTxTermss**
> List&lt;LegalTxTerms&gt; findLegalTxTermss(tags, limit)



Returns all legaltxtermss from the system that the user has access to Nam sed condimentum est. Maecenas tempor sagittis sapien, nec rhoncus sem sagittis sit amet. Aenean at gravida augue, ac iaculis sem. Curabitur odio lorem, ornare eget elementum nec, cursus id lectus. Duis mi turpis, pulvinar ac eros ac, tincidunt varius justo. In hac habitasse platea dictumst. Integer at adipiscing ante, a sagittis ligula. Aenean pharetra tempor ante molestie imperdiet. Vivamus id aliquam diam. Cras quis velit non tortor eleifend sagittis. Praesent at enim pharetra urna volutpat venenatis eget eget mauris. In eleifend fermentum facilisis. Praesent enim enim, gravida ac sodales sed, placerat id erat. Suspendisse lacus dolor, consectetur non augue vel, vehicula interdum libero. Morbi euismod sagittis libero sed lacinia.  Sed tempus felis lobortis leo pulvinar rutrum. Nam mattis velit nisl, eu condimentum ligula luctus nec. Phasellus semper velit eget aliquet faucibus. In a mattis elit. Phasellus vel urna viverra, condimentum lorem id, rhoncus nibh. Ut pellentesque posuere elementum. Sed a varius odio. Morbi rhoncus ligula libero, vel eleifend nunc tristique vitae. Fusce et sem dui. Aenean nec scelerisque tortor. Fusce malesuada accumsan magna vel tempus. Quisque mollis felis eu dolor tristique, sit amet auctor felis gravida. Sed libero lorem, molestie sed nisl in, accumsan tempor nisi. Fusce sollicitudin massa ut lacinia mattis. Sed vel eleifend lorem. Pellentesque vitae felis pretium, pulvinar elit eu, euismod sapien. 

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.LegalTxTermssApi;


LegalTxTermssApi apiInstance = new LegalTxTermssApi();
List<String> tags = Arrays.asList(); // List<String> | tags to filter by
Integer limit = 56; // Integer | maximum number of results to return
try {
    List<LegalTxTerms> result = apiInstance.findLegalTxTermss(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LegalTxTermssApi#findLegalTxTermss");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| maximum number of results to return | [optional]

### Return type

[**List&lt;LegalTxTerms&gt;**](LegalTxTerms.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findLegaltxtermsById"></a>
# **findLegaltxtermsById**
> LegalTxTerms findLegaltxtermsById(id)



Returns a legaltxterms based on the ID

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.pub.ApiException;
//import io.pharmatrace.api.scin.pub.api.LegalTxTermssApi;


LegalTxTermssApi apiInstance = new LegalTxTermssApi();
Long id = 56L; // Long | ID of legaltxterms to fetch
try {
    LegalTxTerms result = apiInstance.findLegaltxtermsById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LegalTxTermssApi#findLegaltxtermsById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of legaltxterms to fetch |

### Return type

[**LegalTxTerms**](LegalTxTerms.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

