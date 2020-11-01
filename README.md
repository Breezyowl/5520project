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

接口2
paymentSetData:[
                    {name:"Food", offer:"2.4% cash dollar rebate", card:"Card A", logo:"../img/MyPaymentSettings/图标 44.svg"},
                    {name:"Music", offer:"", card:"Card B", logo:"../img/MyPaymentSettings/图标 45.svg"},
                    {name:"Supermarket", offer:"1% cash dollar rebate", card:"Card C", logo:"../img/MyPaymentSettings/图标 46.svg"},
                    {name:"Others", offer:"", card:"card A", logo:"../img/MyPaymentSettings/图标 47.svg"},
                ],

recommendSet.html
接口1
注：这个接口我们讨论一下，逻辑关系我没整明白

changeSet.html
接口1
changeSetData:[
                    {name:"Food", offer:"2.4% cash dollar rebate", card:"Card A", logo:"../img/MyPaymentSettings/图标 44.svg", if_accept:1},
                    {name:"Music", offer:"$1 cash dollar to get a ticket", card:"Card A", logo:"../img/MyPaymentSettings/图标 45.svg", if_accept:1},
                    {name:"Supermarket", offer:"1% cash dollar rebate", card:"Card C", logo:"../img/MyPaymentSettings/图标 46.svg", if_accept:1},
                    {name:"Car", offer:"", card:"Card D", logo:"../img/MyPaymentSettings/图标 48.svg", if_accept:2},
                    {name:"Book", offer:"", card:"Card B", logo:"../img/MyPaymentSettings/图标 49.svg", if_accept:2},
                    {name:"Online", offer:"", card:"Card D", logo:"../img/MyPaymentSettings/图标 50.svg", if_accept:2},
                    {name:"Airport", offer:"", card:"Card C", logo:"../img/MyPaymentSettings/图标 51.svg", if_accept:2},
                    {name:"Others", offer:"", card:"Card A", logo:"../img/MyPaymentSettings/图标 47.svg",if_accept:1},
                ],

chooseCard.html
接口1
cardData:[
                    {name:"HSBC", card:"Card A", kind:"MASTERCARD", card_num:"1312-3215-0001-5023", logo:"../img/MyPaymentSettings/图片 19.png", if_choose:1},
                    {name:"BOC", card:"Card B", kind:"Bank Account", card_num:"897-123452-213", logo:"../img/MyPaymentSettings/图片 21.png", if_choose:0},
                    {name:"HSB", card:"Card C", kind:"Bank Account", card_num:"371-333333-668", logo:"../img/MyPaymentSettings/图片 251 (1).png", if_choose:0},
                ],







