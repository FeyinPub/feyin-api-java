# 飞印api

## 飞印开放接口说明文档

文档地址：https://www.showdoc.cc/feyin

## 使用方法

### maven 依赖包

```xml
<dependency>
    <groupId>net.feyin.api</groupId>
    <artifactId>feyin-api</artifactId>
    <version>1.0.4</version>
</dependency>
```

### code samples

### 初始化 client

```java
String memberCode="fb58abf0eb8111e68c6c52540008b6e6"; // 开发帐号，请在http://my.feyin.net 中获取
String apiKey = "32ab6d12"; //开发密钥，请在http://my.feyin.net 中获取
FeyinClient feyinClient = new FeyinClient(memberCode, apiKey);
```


### 发送打印消息

```java
String deviceNo = "4600xxxxxxxxxxxx";

String msg = "需要打印的消息内容"; // 消息排版以及支持的格式请参考 api文档中"打印内容相关"一栏。
int result = feyiniClient.sendMsg(deviceNo, msg);
if(result == 0){
    System.out.println("打印成功");
}
```


### 绑定机器

```java
FeyinResponse bindResponse = feyinClient.bindPrinter(deviceNo); // 请注意，本接口针对第三方开发平台，需申请开通
if(bindResponse.isSuccess()){
    System.out.println("绑定成功");
}
else{
    System.err.println(String.format("绑定失败，原因：%s", bindResponse.getErrMsg()));
}
```


### 解绑机器

```java
FeyinResponse bindResponse = feyinClient.unbindPrinter(deviceNo); // 请注意，本接口针对第三方开发平台，需申请开通
if(bindResponse.isSuccess()){
    System.out.println("解除绑定成功");
}
else{
    System.err.println(String.format("解除绑定失败，原因：%s", bindResponse.getErrMsg()));
}
```