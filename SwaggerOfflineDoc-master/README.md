# SwaggerOfflineDoc
基于SpringBoot和Swagger2生成离线文档：PDF和Html5格式 <br/>

目录说明

config:swagger配置

controller:扫描接口目录,将自己开发的接口&对接第三方需要的模拟接口均保存到该目录

model: 接口需要对象目录

test:接口离线测试参数

执行命令
mvn clean test

生成的PDF和HTML文件：target/asciidoc/html and target/asciidoc/pdf

生成的在线测试json target/asciidoc/swagger.json 可放在192.168.100.101 注意不要覆盖之前的测试用例
