
# HMS Push Kit Example

## Table of Contents
1. [Prerequisites](#prerequisites)
2. [Configuring AppGallery Connect](#configuring-appgallery-connect)
    1. [Turn on the Maps API](#turn-on-the-maps-api)
    2. [Create Key for Static Map](#create-key-for-static-map)
    3. [Download configuration json file](#download-configuration-json-file)
3. [Configuring Android Project](#configuring-android-project)
    1. [Configuring Signature](#configuring-signature)
    2. [Set up AppGallery connection](#set-up-appgallery-connection)
    2. [Configure API KEY](#configure-api-key)
4. [Run the Application](#run-the-application)

## Prerequisites
I) Create a AppGallery project - [Guide](https://developer.huawei.com/consumer/en/doc/distribution/app/agc-help-createproject-0000001100334664)

II) Crear una aplicacion en el proyecto y guardar el packagename - [Guide](https://developer.huawei.com/consumer/en/doc/distribution/app/agc-help-createapp-0000001146718717#section1112105771619)

## Configuring AppGallery Connect
### Turn on the Push Kit API
I) Inside the `Project settings` option enter to `Manage APIs` section

II) Type `Push` in the search bar to filter the available APIs

III) Verify that the 'Push Kit' switch <img src="/readme/assets/switch.png?raw=true" style="height:20px"> is on (blue color), if it is off (gray color) it will be necessary to turn it on (clicking it)

![Turn on Push Kit API](/readme/assets/turn_of_push_kit_api.png?raw=true "Turn on Push Kit API")