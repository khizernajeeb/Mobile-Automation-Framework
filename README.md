# DNow-Mobile-Framework

**Instructions**:
- Follow this tuturial Step by Step to setup Android Studio & Appium (https://www.swtestacademy.com/appium-tutorial/)
- Used the **LoginRegistration** app for a sample test case - Available in **sampleAndroidApp** folder
- Drop the App Info apk file to android emulator home screen to get the first activity of the application
> **Don't forget to add PATH variables** - For this we can use the tool ([Rapid Environment Editor](https://www.rapidee.com/en/download) - ) or follow these tutorials (http://www.automationtestinghub.com/setup-android-environment-variables/, https://www.360logica.com/blog/how-to-set-path-environmental-variable-for-sdk-in-windows/)

### Sample Saved Capabilities for the App 'LoginResistration' -Update the capabilities in appium

```{
  "deviceName": "zebra API 24",
  "udid": "emulator-5554",
  "platformName": "Android",
  "platformVersion": "7.0",
  "appPackage": "com.appsgallery.sagar.loginregistrationexample",
  "appActivity": "com.appsgallery.sagar.loginregistrationexample.MainActivity" (i.e: get this activity through AppInfo apk)
}```
