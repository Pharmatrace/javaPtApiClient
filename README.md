# ScinPublicApiClient

PharmaTrace Supply Chain Information Network API
- API version: 0.0.1
  - Build date: 2018-11-03T16:01:52.439+01:00[Europe/Berlin]

The PharmaTrace SCIN API provides network members a resource and process oriented access to the blockchain backed market and inventory information. It represents a layer of abstraction above the Hyperledger network to facilitate a business focused development of clients and integration systems without the need to directly connect to Hyperledger nodes.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.pharmatrace</groupId>
  <artifactId>ScinPublicApiClient</artifactId>
  <version>0.0.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.pharmatrace:ScinPublicApiClient:0.0.1"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/ScinPublicApiClient-0.0.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.pharmatrace.api.scin.public.*;
import io.pharmatrace.api.scin.public.auth.*;
import io.pharmatrace.api.scin.public.model.*;
import io.pharmatrace.api.scin.public.api.ActivitysApi;

import java.io.File;
import java.util.*;

public class ActivitysApiExample {

    public static void main(String[] args) {
        
        ActivitysApi apiInstance = new ActivitysApi();
        Activity activity = new Activity(); // Activity | Activity to create
        try {
            Activity result = apiInstance.addActivity(activity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivitysApi#addActivity");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.pharmatrace.io/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ActivitysApi* | [**addActivity**](docs/ActivitysApi.md#addActivity) | **POST** /activitys | 
*ActivitysApi* | [**deleteActivity**](docs/ActivitysApi.md#deleteActivity) | **DELETE** /activitys/{id} | 
*ActivitysApi* | [**findActivityById**](docs/ActivitysApi.md#findActivityById) | **GET** /activitys/{id} | 
*ActivitysApi* | [**findActivitys**](docs/ActivitysApi.md#findActivitys) | **GET** /activitys | 
*ContainerApi* | [**locationHistoryGet**](docs/ContainerApi.md#locationHistoryGet) | **GET** /locationHistory | Location History
*ContainersApi* | [**addContainer**](docs/ContainersApi.md#addContainer) | **POST** /containers | 
*ContainersApi* | [**deleteContainer**](docs/ContainersApi.md#deleteContainer) | **DELETE** /containers/{id} | 
*ContainersApi* | [**findContainerById**](docs/ContainersApi.md#findContainerById) | **GET** /containers/{id} | 
*ContainersApi* | [**findContainers**](docs/ContainersApi.md#findContainers) | **GET** /containers | 
*InformationQueryResponsesApi* | [**addInformationQueryResponse**](docs/InformationQueryResponsesApi.md#addInformationQueryResponse) | **POST** /informationqueryresponses | 
*InformationQueryResponsesApi* | [**deleteInformationQueryResponse**](docs/InformationQueryResponsesApi.md#deleteInformationQueryResponse) | **DELETE** /informationqueryresponses/{id} | 
*InformationQueryResponsesApi* | [**findInformationQueryResponses**](docs/InformationQueryResponsesApi.md#findInformationQueryResponses) | **GET** /informationqueryresponses | 
*InformationQueryResponsesApi* | [**findInformationqueryresponseById**](docs/InformationQueryResponsesApi.md#findInformationqueryresponseById) | **GET** /informationqueryresponses/{id} | 
*InformationQuerysApi* | [**addInformationQuery**](docs/InformationQuerysApi.md#addInformationQuery) | **POST** /informationquerys | 
*InformationQuerysApi* | [**deleteInformationQuery**](docs/InformationQuerysApi.md#deleteInformationQuery) | **DELETE** /informationquerys/{id} | 
*InformationQuerysApi* | [**findInformationQuerys**](docs/InformationQuerysApi.md#findInformationQuerys) | **GET** /informationquerys | 
*InformationQuerysApi* | [**findInformationqueryById**](docs/InformationQuerysApi.md#findInformationqueryById) | **GET** /informationquerys/{id} | 
*LegalTxTermssApi* | [**addLegalTxTerms**](docs/LegalTxTermssApi.md#addLegalTxTerms) | **POST** /legaltxtermss | 
*LegalTxTermssApi* | [**deleteLegalTxTerms**](docs/LegalTxTermssApi.md#deleteLegalTxTerms) | **DELETE** /legaltxtermss/{id} | 
*LegalTxTermssApi* | [**findLegalTxTermss**](docs/LegalTxTermssApi.md#findLegalTxTermss) | **GET** /legaltxtermss | 
*LegalTxTermssApi* | [**findLegaltxtermsById**](docs/LegalTxTermssApi.md#findLegaltxtermsById) | **GET** /legaltxtermss/{id} | 
*LocationsApi* | [**addLocation**](docs/LocationsApi.md#addLocation) | **POST** /locations | 
*LocationsApi* | [**deleteLocation**](docs/LocationsApi.md#deleteLocation) | **DELETE** /locations/{id} | 
*LocationsApi* | [**findLocationById**](docs/LocationsApi.md#findLocationById) | **GET** /locations/{id} | 
*LocationsApi* | [**findLocations**](docs/LocationsApi.md#findLocations) | **GET** /locations | 
*PharmaceuticalsApi* | [**addPharmaceutical**](docs/PharmaceuticalsApi.md#addPharmaceutical) | **POST** /pharmaceuticals | 
*PharmaceuticalsApi* | [**deletePharmaceutical**](docs/PharmaceuticalsApi.md#deletePharmaceutical) | **DELETE** /pharmaceuticals/{id} | 
*PharmaceuticalsApi* | [**findPharmaceuticalById**](docs/PharmaceuticalsApi.md#findPharmaceuticalById) | **GET** /pharmaceuticals/{id} | 
*PharmaceuticalsApi* | [**findPharmaceuticals**](docs/PharmaceuticalsApi.md#findPharmaceuticals) | **GET** /pharmaceuticals | 
*ProfilesApi* | [**addProfile**](docs/ProfilesApi.md#addProfile) | **POST** /profiles | 
*ProfilesApi* | [**deleteProfile**](docs/ProfilesApi.md#deleteProfile) | **DELETE** /profiles/{id} | 
*ProfilesApi* | [**findProfileById**](docs/ProfilesApi.md#findProfileById) | **GET** /profiles/{id} | 
*ProfilesApi* | [**findProfiles**](docs/ProfilesApi.md#findProfiles) | **GET** /profiles | 
*RepackagesApi* | [**addRepackage**](docs/RepackagesApi.md#addRepackage) | **POST** /repackages | 
*RepackagesApi* | [**deleteRepackage**](docs/RepackagesApi.md#deleteRepackage) | **DELETE** /repackages/{id} | 
*RepackagesApi* | [**findRepackageById**](docs/RepackagesApi.md#findRepackageById) | **GET** /repackages/{id} | 
*RepackagesApi* | [**findRepackages**](docs/RepackagesApi.md#findRepackages) | **GET** /repackages | 
*StakeholdersApi* | [**addStakeholder**](docs/StakeholdersApi.md#addStakeholder) | **POST** /stakeholders | 
*StakeholdersApi* | [**deleteStakeholder**](docs/StakeholdersApi.md#deleteStakeholder) | **DELETE** /stakeholders/{id} | 
*StakeholdersApi* | [**findStakeholderById**](docs/StakeholdersApi.md#findStakeholderById) | **GET** /stakeholders/{id} | 
*StakeholdersApi* | [**findStakeholders**](docs/StakeholdersApi.md#findStakeholders) | **GET** /stakeholders | 
*SystemInformationsApi* | [**addSystemInformation**](docs/SystemInformationsApi.md#addSystemInformation) | **POST** /systeminformations | 
*SystemInformationsApi* | [**deleteSystemInformation**](docs/SystemInformationsApi.md#deleteSystemInformation) | **DELETE** /systeminformations/{id} | 
*SystemInformationsApi* | [**findSystemInformations**](docs/SystemInformationsApi.md#findSystemInformations) | **GET** /systeminformations | 
*SystemInformationsApi* | [**findSysteminformationById**](docs/SystemInformationsApi.md#findSysteminformationById) | **GET** /systeminformations/{id} | 
*TradesApi* | [**addTrade**](docs/TradesApi.md#addTrade) | **POST** /trades | 
*TradesApi* | [**deleteTrade**](docs/TradesApi.md#deleteTrade) | **DELETE** /trades/{id} | 
*TradesApi* | [**findTradeById**](docs/TradesApi.md#findTradeById) | **GET** /trades/{id} | 
*TradesApi* | [**findTrades**](docs/TradesApi.md#findTrades) | **GET** /trades | 
*TransportsApi* | [**addTransport**](docs/TransportsApi.md#addTransport) | **POST** /transports | 
*TransportsApi* | [**deleteTransport**](docs/TransportsApi.md#deleteTransport) | **DELETE** /transports/{id} | 
*TransportsApi* | [**findTransportById**](docs/TransportsApi.md#findTransportById) | **GET** /transports/{id} | 
*TransportsApi* | [**findTransports**](docs/TransportsApi.md#findTransports) | **GET** /transports | 
*UserApi* | [**meGet**](docs/UserApi.md#meGet) | **GET** /me | User Profile
*WalletsApi* | [**addWallet**](docs/WalletsApi.md#addWallet) | **POST** /wallets | 
*WalletsApi* | [**deleteWallet**](docs/WalletsApi.md#deleteWallet) | **DELETE** /wallets/{id} | 
*WalletsApi* | [**findWalletById**](docs/WalletsApi.md#findWalletById) | **GET** /wallets/{id} | 
*WalletsApi* | [**findWallets**](docs/WalletsApi.md#findWallets) | **GET** /wallets | 


## Documentation for Models

 - [Activities](docs/Activities.md)
 - [Activity](docs/Activity.md)
 - [Container](docs/Container.md)
 - [Containers](docs/Containers.md)
 - [Error](docs/Error.md)
 - [InformationQuery](docs/InformationQuery.md)
 - [InformationQueryResponse](docs/InformationQueryResponse.md)
 - [LegalTxTerms](docs/LegalTxTerms.md)
 - [Location](docs/Location.md)
 - [Locations](docs/Locations.md)
 - [Pharmaceutical](docs/Pharmaceutical.md)
 - [PharmaceuticalList](docs/PharmaceuticalList.md)
 - [Profile](docs/Profile.md)
 - [Repackage](docs/Repackage.md)
 - [Stakeholder](docs/Stakeholder.md)
 - [SystemInformation](docs/SystemInformation.md)
 - [SystemInformations](docs/SystemInformations.md)
 - [Trade](docs/Trade.md)
 - [Transaction](docs/Transaction.md)
 - [Transport](docs/Transport.md)
 - [Wallet](docs/Wallet.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### apikey

- **Type**: API key
- **API key parameter name**: server_token
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

api@pharmatrace.io

