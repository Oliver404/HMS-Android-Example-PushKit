
# HMS Push Kit Example

## Table of Contents
1. [Prerequisites](#prerequisites)
2. [Configuring AppGallery Connect](#configuring-appgallery-connect)
    1. [Turn on the Push Kit API](#turn-on-the-push-kit-api)
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

### Enable Push Kit Module
I) Search in the side menu (left side) for the `Grow` section

II) In this one you will find the option of `Push Kit`

II) Clicking on this will show a sale similar to the one shown at the bottom

![Push Kit Module](/readme/assets/push_kit_module.png?raw=true "Push Kit Module")

IV) Must click on the `Enable` button

V) The interface will change a little and `Push Kit` will be activated

![Push Kit Module Enable](/readme/assets/push_kit_module_enable.png?raw=true "Push Kit Module Enable")

### Download configuration json file
I) Before downloading the JSON it is recommended to have added the `SHA -256 fingerprint`, the following [guide](https://developer.huawei.com/consumer/en/doc/development/HMSCore-Guides/android-sdk-config-agc-0000001061560289#section147011294331) shows how to get and add it to our project

II) Download the file `agconnect-services.json`

![Download agconnect-services.json](/readme/assets/download_json.png?raw=true "Download agconnect-services.json")

## Configuring Android Project
### Configuring Signature and Packagename
I) In the `app` folder you will find the file `build.gradle`

II) Opening it should locate the `signingConfigs` section, as shown in the image below

III) In this section you will have to replace the values of `keyAlias`, `keyPassword`, `storeFile` and `storePassword`

IV) The image, enclosed in a yellow box, shows the `key` used for the original project, as an example, the `storeFile` field should be as follows: <img src="/readme/assets/storeFile.png?raw=true" style="height:20px">

V) Now locate the `defaultConfig` section, it is above `signingConfigs`

VI) Replace the value of `applicationId` for your `packagename` with which the app is registered to AppGallery

![Configuring Signature and Packagename](/readme/assets/chage_signature_and_packagename.png?raw=true "Configuring Signature and Packagename")