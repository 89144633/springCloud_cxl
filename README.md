# swagger-cloud-demo
​	将swagger整合到spring cloud当中，并且把swagger配置到spring cloud gateway网关服务中，实现访问gateway网关的swagger地址就能自由切换不同服务的swagger页面

​	整个项目源码相对简单，只有gateway-service服务中的application.yaml中需要注意一下。gateway中的routes中各个服务的id`id: demo1`需要和断言`predicates:- Path=/demo1/**`中的第一个参数保持一致，否则网关服务会路由不到swagger页面。

​	以下是yaml的routers配置的demo:

​	![image-20210113141744135](https://github.com/yylfqj/swagger-cloud-demo/blob/master/images/1610518589.jpg)

## 原理：

​	重写swagger的`SwaggerResourcesProvider`接口，重写它的`get()`方法。将`SwaggerResource`列表重新的从`gateway-service`服务的yaml文件的routers中读取出来。之后在`SwaggerHandler`中将swagger-resources重新配置