
# Container

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**containerId** | **String** | Unique identifier representing a specific container. |  [optional]
**epcCode** | **String** | EPC code |  [optional]
**label** | **String** | Serialization label. |  [optional]
**barcode** | **String** | barcode on container. Normally equal to container id. |  [optional]
**rfId** | **String** | RFID of RF tracking label on conatiner. |  [optional]
**quantity** | [**BigDecimal**](BigDecimal.md) | quantity of product in container. |  [optional]
**unit** | **String** | Unit for quantity measurement. |  [optional]
**currentLocationId** | **String** | Location id of last tracked locaction. |  [optional]
**ownerStakeholderId** | **String** | stakeholder id of the last tracked owner of the container. |  [optional]
**parentContainerId** | **String** | id of the parent container or null. |  [optional]



