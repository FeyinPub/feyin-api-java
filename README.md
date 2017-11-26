# 飞印api

## 飞印开放接口说明文档

文档地址：https://www.showdoc.cc/feyin

## 使用方法

### maven 依赖包

```xml
<dependency>
    <groupId>net.feyin.api</groupId>
    <artifactId>feyin-api</artifactId>
    <version>1.0.5</version>
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

### 清除未打印消息

```java
FeyinResponse response = feyinClient.clearPendingMsgs(deviceNo); 
if(response.isSuccess()){
    System.out.println("未打印消息已成功清除");
}
else{
    System.err.println(String.format("清除失败，原因：%s", response.getErrMsg()));
}
```

### 绑定机器

```java
FeyinResponse response = feyinClient.bindPrinter(deviceNo); // 请注意，本接口针对第三方开发平台，需申请开通
if(response.isSuccess()){
    System.out.println("绑定成功");
}
else{
    System.err.println(String.format("绑定失败，原因：%s", response.getErrMsg()));
}
```


### 解绑机器

```java
FeyinResponse response = feyinClient.unbindPrinter(deviceNo); // 请注意，本接口针对第三方开发平台，需申请开通
if(response.isSuccess()){
    System.out.println("解除绑定成功");
}
else{
    System.err.println(String.format("解除绑定失败，原因：%s", response.getErrMsg()));
}
```