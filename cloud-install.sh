#!/usr/bin

# 部署脚本, 记得 mvn 的 setting.xml 使用公司内部的
# 清除, 部署, 跳过测试
mvn clean install -Dmaven.test.skip=true
mv takin-cloud-plugins/plugin-engine-module/target/plugin-engine-module-1.0.2.jar ./plugins
mv takin-cloud-plugins/plugin-enginecall-module/target/plugin-enginecall-module-1.0.2.jar ./plugins