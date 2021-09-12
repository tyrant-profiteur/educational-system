1. 解决tomcat 控制台 乱码
    settings->build,execution,deployment->compiler->java compiler->Additional command line parameters 添加 `-edcoding 
   utf-8`
2. 在修改访问路的时候，tomcat 的application context 以及 端口号要同步修复