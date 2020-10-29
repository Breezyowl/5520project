# CUHK5510Project
5510项目
1.数据源配置（连接AWS的mysql数据库）
在本地的数据库管理软件上配如下信息。
用户以及密码
连接配置
HOST：
db-cuhk-afi.c18nldkzqsg2.us-east-1.rds.amazonaws.com
Port：3306
eusernam:admin
pw:cuhk1001

2.项目运行
下载 Eclipse ee版本
运行/CUHK5510Project/src/main/java/com/captainxero/MybatisplusApplication.java run as java application

3.项目网页地址
http://localhost:8080
测试用户：
用户名：111111
密码：111111

4.项目进度管控地址
文档：https://kdocs.cn/l/cl5N5h219a46

5.项目后端接口地址
http://localhost:8080/swagger-ui.html

6.接口需求
expenditure.html
接口1
Expenditure:
[
    {name:"ABC Movie"，amount: -80.00 HKD, kind:"Entertainment", time:"Today 15:11"}, 
    {name:"ABC Movie"，amount: -80.00 HKD, kind:"Entertainment", time:"Today 15:11"},
]
接口2
Income:
[
    {name:"Salary"，amount: +45433.00 HKD, kind:"Daily Income", time:"Today 15:11"},
    {name:"Salary"，amount: +45433.00 HKD, kind:"Daily Income", time:"Today 15:11"},
]

myBalance.html
接口1
Transactions:[
    {name:"ABC Movie",kind:"Entertainment",time:"Today 15:11",amount:"-80.00 HKD"},
    {name:"ABC Movie",kind:"Entertainment",time:"Today 15:11",amount:"-80.00 HKD"},
]
接口2
Total Assets:[
    {name:"HSBC - Card A", kind:"MASTERCARD", number:"1312-3215-0001-5023", amount:"- 4322.00 HKD", due:"DUE date: Sep 30 2020", logo_url:"./img/MyBalance/图片 19.png"},

    {name:"HSBC - Card A", kind:"MASTERCARD", number:"1312-3215-0001-5023", amount:"- 4322.00 HKD", due:"DUE date: Sep 30 2020", logo_url:"./img/MyBalance/图片 19.png"},
]

paySet.html
接口1
newOfferInfo:[ {name:"HSBC",card_type:"Card A", card_num:"1312-3215-0001-5023", offer:"MUSIC", content:"$1 Cash Dollar to Redeem an extra concert ticket", logo:"../img/MyBalance/图片 19.png", accept:"false"} ]
注：此接口需要获取到最新的offer，并选择接受还是忽略，你给我传过来的时候应该是false， 如果选择接受，我会把accept值设置成true，然后此界面会刷新，new offer提示隐藏，因为没有new offer了，并且下面的payment setting应该是我接受了最新offer的data，解释的也不是很好，有啥问题随时微信沟通







