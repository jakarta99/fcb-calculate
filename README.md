# Course 1
## Java Entry Point
先理解使用 IDE (Eclipse/IntelliJ) 建立一個 Java 專案, 在 Eclipse Java Project 之下, 
src 目錄是 java source folder, 所以就是在 /src 目錄之下建立 java 檔案, 
IDE 會自動 compile 到 /bin 目錄之下成為 .class 檔案.

而 Java 進入點就是

```java
public class WhatYouWannaApp {

  public static void main(String[] args) {
      System.out.println("Java Entry Point is this main method");
  }
}
```
 

接著就可以透過 Run As.. Java Application, 就可以在 Console 之下查看運作的結果。

## 呼叫另外一個物件
通常我們不會把過多的邏輯放在 Entry Point 之中, 我們會把商業邏輯定義在 Service Layer,
例如 CalculateApp 去呼叫 CalculateService, 當我們要使用 CalculateService, 
除非 CalculateService 有 static method, 不然, 我們就要 new 該物件起來。

```java
CalculateService service = new CalculateService();
int result = service.sum(1,2);
```

建立一個物件, 就是要透過 constructor, 建構子就是與 class 相同名字的 method name,
不具備有 return type. 當你都沒有撰寫任何建構子之時, 
就是預設一個沒有任何參數的 constructor. 

當你有撰寫另外一個建構子時, 原本隱藏的無參數建構子就不存在了, 
當你同時需要無參數建構子與有參數建構子時,
只需要寫兩個不同參數的建構子即可。


## 引用 Lib Jars
所使用的外部 jar 檔案, 就是要把 jar 檔案放在 ClassPath 之中, 
我們通常會把 jar 檔案放在 /lib 目錄, 
在 IDE 之中, 僅需要設定 Java Build Path -> Libaries -> Classpath.. 去增加此 Jar 檔案




