# WalletsApi

All URIs are relative to *https://api.pharmatrace.io/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addWallet**](WalletsApi.md#addWallet) | **POST** /wallets | 
[**deleteWallet**](WalletsApi.md#deleteWallet) | **DELETE** /wallets/{id} | 
[**findWalletById**](WalletsApi.md#findWalletById) | **GET** /wallets/{id} | 
[**findWallets**](WalletsApi.md#findWallets) | **GET** /wallets | 


<a name="addWallet"></a>
# **addWallet**
> Wallet addWallet(wallet)



Creates a new wallet

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.public.ApiException;
//import io.pharmatrace.api.scin.public.api.WalletsApi;


WalletsApi apiInstance = new WalletsApi();
Wallet wallet = new Wallet(); // Wallet | Wallet to create
try {
    Wallet result = apiInstance.addWallet(wallet);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#addWallet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wallet** | [**Wallet**](Wallet.md)| Wallet to create |

### Return type

[**Wallet**](Wallet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteWallet"></a>
# **deleteWallet**
> deleteWallet(id)



deletes a single wallet based on the ID supplied

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.public.ApiException;
//import io.pharmatrace.api.scin.public.api.WalletsApi;


WalletsApi apiInstance = new WalletsApi();
Long id = 56L; // Long | ID of wallet to delete
try {
    apiInstance.deleteWallet(id);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#deleteWallet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of wallet to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findWalletById"></a>
# **findWalletById**
> Wallet findWalletById(id)



Returns a wallet based on the ID

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.public.ApiException;
//import io.pharmatrace.api.scin.public.api.WalletsApi;


WalletsApi apiInstance = new WalletsApi();
Long id = 56L; // Long | ID of wallet to fetch
try {
    Wallet result = apiInstance.findWalletById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#findWalletById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| ID of wallet to fetch |

### Return type

[**Wallet**](Wallet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findWallets"></a>
# **findWallets**
> List&lt;Wallet&gt; findWallets(tags, limit)



Returns all wallets from the system that the user has access to Nam sed condimentum est. Maecenas tempor sagittis sapien, nec rhoncus sem sagittis sit amet. Aenean at gravida augue, ac iaculis sem. Curabitur odio lorem, ornare eget elementum nec, cursus id lectus. Duis mi turpis, pulvinar ac eros ac, tincidunt varius justo. In hac habitasse platea dictumst. Integer at adipiscing ante, a sagittis ligula. Aenean pharetra tempor ante molestie imperdiet. Vivamus id aliquam diam. Cras quis velit non tortor eleifend sagittis. Praesent at enim pharetra urna volutpat venenatis eget eget mauris. In eleifend fermentum facilisis. Praesent enim enim, gravida ac sodales sed, placerat id erat. Suspendisse lacus dolor, consectetur non augue vel, vehicula interdum libero. Morbi euismod sagittis libero sed lacinia.  Sed tempus felis lobortis leo pulvinar rutrum. Nam mattis velit nisl, eu condimentum ligula luctus nec. Phasellus semper velit eget aliquet faucibus. In a mattis elit. Phasellus vel urna viverra, condimentum lorem id, rhoncus nibh. Ut pellentesque posuere elementum. Sed a varius odio. Morbi rhoncus ligula libero, vel eleifend nunc tristique vitae. Fusce et sem dui. Aenean nec scelerisque tortor. Fusce malesuada accumsan magna vel tempus. Quisque mollis felis eu dolor tristique, sit amet auctor felis gravida. Sed libero lorem, molestie sed nisl in, accumsan tempor nisi. Fusce sollicitudin massa ut lacinia mattis. Sed vel eleifend lorem. Pellentesque vitae felis pretium, pulvinar elit eu, euismod sapien. 

### Example
```java
// Import classes:
//import io.pharmatrace.api.scin.public.ApiException;
//import io.pharmatrace.api.scin.public.api.WalletsApi;


WalletsApi apiInstance = new WalletsApi();
List<String> tags = Arrays.asList(); // List<String> | tags to filter by
Integer limit = 56; // Integer | maximum number of results to return
try {
    List<Wallet> result = apiInstance.findWallets(tags, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletsApi#findWallets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tags** | [**List&lt;String&gt;**](String.md)| tags to filter by | [optional]
 **limit** | **Integer**| maximum number of results to return | [optional]

### Return type

[**List&lt;Wallet&gt;**](Wallet.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

