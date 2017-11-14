# 飞印api

## 飞印开放接口说明文档

文档地址：https://www.showdoc.cc/feyin

## 使用方法

### maven 依赖包

```xml
<dependency>
    <groupId>net.feyin.api</groupId>
    <artifactId>feyin-api</artifactId>
    <version>1.0.2</version>
</dependency>
```

### code

```java
String memberCode="fb58abf0eb8111e68c6c52540008b6e6";
String apiKey = "32ab6d12";
FeyinClient feyinClient = new FeyinClient(memberCode, apiKey);
FeyinMessage msg = new FeyinMessage(deviceNo, "需要打印的消息内容");
int result = feyiniClient.sendFreeMessage(msg);
if(result == 0){
    System.out.println("打印成功");
}
```