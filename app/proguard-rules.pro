# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

# data model
-keep class de.iris.docconnect.models.** { *; }

# bottom nav lib
-keep public class com.google.android.material.bottomnavigation.BottomNavigationView { *; }
-keep public class com.google.android.material.bottomnavigation.BottomNavigationMenuView { *; }
-keep public class com.google.android.material.bottomnavigation.BottomNavigationPresenter { *; }
-keep public class com.google.android.material.bottomnavigation.BottomNavigationItemView { *; }