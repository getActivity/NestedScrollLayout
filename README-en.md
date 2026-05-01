# [中文文档](README.md)

# Nested Scroll Layout

* Project address: [Github](https://github.com/getActivity/NestedScrollLayout)

* [Click here to download demo apk directly](https://github.com/getActivity/NestedScrollLayout/releases/download/2.0/NestedScrollLayout.apk)

* As we all know, WebView, LinearLayout, FrameLayout, and RelativeLayout do not support the NestedScroll feature, so this library was created specifically to solve this problem.

![](picture/dynamic_figure.gif)

#### Integration Steps

* If your project's Gradle version is below `7.0`, you need to add the following to the `build.gradle` file:

```groovy
allprojects {
    repositories {
        // JitPack remote repository: https://jitpack.io
        maven { url 'https://jitpack.io' }
    }
}
```

* If your Gradle version is `7.0` or above, you need to add the following to the `settings.gradle` file:

```groovy
dependencyResolutionManagement {
    repositories {
        // JitPack remote repository: https://jitpack.io
        maven { url 'https://jitpack.io' }
    }
}
```

* After configuring the remote repository, add the remote dependency in the `build.gradle` file under the app module:

```groovy
android {
    // Supports JDK 1.8 and above
    compileOptions {
        targetCompatibility JavaVersion.VERSION_1_8
        sourceCompatibility JavaVersion.VERSION_1_8
    }
}

dependencies {
    // Nested Scroll Layout: https://github.com/getActivity/NestedScrollLayout
    implementation 'com.github.getActivity:NestedScrollLayout:2.0'
}
```

* Option 1: Use remote dependencies of the old version framework

```groovy
dependencies {
    // Nested Scroll Layout: https://github.com/getActivity/NestedScrollLayout
    implementation 'com.github.getActivity:NestedScrollLayout:2.0'
}
```

* Option 2: If your project is still in the Support phase and it's not convenient to migrate to **AndroidX** yet, but you want to use the latest version of the framework, you can use the [JetifierStandalone](https://developer.android.com/tools/jetifier#install) tool provided by **Google** to convert the **aar** packages from the released Release versions into **Support-compatible aar** packages using reverse mode.

* You can choose either of the above two options, but it's still not recommended. These are only stopgap measures, not long-term solutions. Subsequent versions of the framework will no longer support **Support** projects. The best approach is to migrate your project to **AndroidX**.

#### Framework Usage

* NestedScrollWebView

```xml
<com.hjq.nested.scroll.layout.NestedScrollWebView
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />
```

* NestedScrollFrameLayout

```xml
<com.hjq.nested.scroll.layout.NestedScrollFrameLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent">
    
</com.hjq.nested.scroll.layout.NestedScrollFrameLayout>
```

* NestedScrollLinearLayout

```xml
<?xml version="1.0" encoding="utf-8"?>
<com.hjq.nested.scroll.layout.NestedScrollLinearLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

</com.hjq.nested.scroll.layout.NestedScrollLinearLayout>
```

* NestedScrollRelativeLayout

```xml
<?xml version="1.0" encoding="utf-8"?>
<com.hjq.nested.scroll.layout.NestedScrollRelativeLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent">

</com.hjq.nested.scroll.layout.NestedScrollRelativeLayout>
```

* NestedScrollViewPager

```xml
<com.hjq.nested.scroll.layout.NestedScrollViewPager
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:layout_behavior="@string/appbar_scrolling_view_behavior" />
```

#### Open Source Project List

* Android middle office: [AndroidProject](https://github.com/getActivity/AndroidProject)![](https://img.shields.io/github/stars/getActivity/AndroidProject.svg)![](https://img.shields.io/github/forks/getActivity/AndroidProject.svg)

* Android middle office kt version: [AndroidProject-Kotlin](https://github.com/getActivity/AndroidProject-Kotlin)![](https://img.shields.io/github/stars/getActivity/AndroidProject-Kotlin.svg)![](https://img.shields.io/github/forks/getActivity/AndroidProject-Kotlin.svg)

* Permissions framework: [XXPermissions](https://github.com/getActivity/XXPermissions) ![](https://img.shields.io/github/stars/getActivity/XXPermissions.svg) ![](https://img.shields.io/github/forks/getActivity/XXPermissions.svg)

* Toast framework: [Toaster](https://github.com/getActivity/Toaster)![](https://img.shields.io/github/stars/getActivity/Toaster.svg)![](https://img.shields.io/github/forks/getActivity/Toaster.svg)

* Network framework: [EasyHttp](https://github.com/getActivity/EasyHttp)![](https://img.shields.io/github/stars/getActivity/EasyHttp.svg)![](https://img.shields.io/github/forks/getActivity/EasyHttp.svg)

* Title bar framework: [TitleBar](https://github.com/getActivity/TitleBar)![](https://img.shields.io/github/stars/getActivity/TitleBar.svg)![](https://img.shields.io/github/forks/getActivity/TitleBar.svg)

* Floating window framework: [EasyWindow](https://github.com/getActivity/EasyWindow)![](https://img.shields.io/github/stars/getActivity/EasyWindow.svg)![](https://img.shields.io/github/forks/getActivity/EasyWindow.svg)

* Device compatibility framework：[DeviceCompat](https://github.com/getActivity/DeviceCompat) ![](https://img.shields.io/github/stars/getActivity/DeviceCompat.svg) ![](https://img.shields.io/github/forks/getActivity/DeviceCompat.svg)

* Shape view framework: [ShapeView](https://github.com/getActivity/ShapeView)![](https://img.shields.io/github/stars/getActivity/ShapeView.svg)![](https://img.shields.io/github/forks/getActivity/ShapeView.svg)

* Shape drawable framework: [ShapeDrawable](https://github.com/getActivity/ShapeDrawable)![](https://img.shields.io/github/stars/getActivity/ShapeDrawable.svg)![](https://img.shields.io/github/forks/getActivity/ShapeDrawable.svg)

* Language switching framework: [Multi Languages](https://github.com/getActivity/MultiLanguages)![](https://img.shields.io/github/stars/getActivity/MultiLanguages.svg)![](https://img.shields.io/github/forks/getActivity/MultiLanguages.svg)

* Gson parsing fault tolerance: [GsonFactory](https://github.com/getActivity/GsonFactory)![](https://img.shields.io/github/stars/getActivity/GsonFactory.svg)![](https://img.shields.io/github/forks/getActivity/GsonFactory.svg)

* Logcat viewing framework: [Logcat](https://github.com/getActivity/Logcat)![](https://img.shields.io/github/stars/getActivity/Logcat.svg)![](https://img.shields.io/github/forks/getActivity/Logcat.svg)

* Android cmd tools：[AndroidCmdTools](https://github.com/getActivity/AndroidCmdTools) ![](https://img.shields.io/github/stars/getActivity/AndroidCmdTools.svg) ![](https://img.shields.io/github/forks/getActivity/AndroidCmdTools.svg)

* Android version guide: [AndroidVersionAdapter](https://github.com/getActivity/AndroidVersionAdapter)![](https://img.shields.io/github/stars/getActivity/AndroidVersionAdapter.svg)![](https://img.shields.io/github/forks/getActivity/AndroidVersionAdapter.svg)

* Android code standard: [AndroidCodeStandard](https://github.com/getActivity/AndroidCodeStandard)![](https://img.shields.io/github/stars/getActivity/AndroidCodeStandard.svg)![](https://img.shields.io/github/forks/getActivity/AndroidCodeStandard.svg)

* Android resource summary：[AndroidIndex](https://github.com/getActivity/AndroidIndex) ![](https://img.shields.io/github/stars/getActivity/AndroidIndex.svg) ![](https://img.shields.io/github/forks/getActivity/AndroidIndex.svg)

* Android open source leaderboard: [AndroidGithubBoss](https://github.com/getActivity/AndroidGithubBoss)![](https://img.shields.io/github/stars/getActivity/AndroidGithubBoss.svg)![](https://img.shields.io/github/forks/getActivity/AndroidGithubBoss.svg)

* Studio boutique plugins: [StudioPlugins](https://github.com/getActivity/StudioPlugins)![](https://img.shields.io/github/stars/getActivity/StudioPlugins.svg)![](https://img.shields.io/github/forks/getActivity/StudioPlugins.svg)

* Emoji collection: [EmojiPackage](https://github.com/getActivity/EmojiPackage)![](https://img.shields.io/github/stars/getActivity/EmojiPackage.svg)![](https://img.shields.io/github/forks/getActivity/EmojiPackage.svg)

* China provinces json: [ProvinceJson](https://github.com/getActivity/ProvinceJson)![](https://img.shields.io/github/stars/getActivity/ProvinceJson.svg)![](https://img.shields.io/github/forks/getActivity/ProvinceJson.svg)

* Markdown documentation：[MarkdownDoc](https://github.com/getActivity/MarkdownDoc) ![](https://img.shields.io/github/stars/getActivity/MarkdownDoc.svg) ![](https://img.shields.io/github/forks/getActivity/MarkdownDoc.svg)

## License

```text
Copyright 2018 Huang JinQun

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```